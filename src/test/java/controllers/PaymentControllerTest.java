package controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;
import csv.PaymentCSVProcessor;
import models.booking.Booking;
import models.client.Client;
import models.client.Client.type;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import repositories.BookingRepository;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;
import repositories.PaymentRepository;
import services.BookingService;
import services.ClientService;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSensorService;
import services.ParkingSpaceService;
import services.PaymentService;
import services.SuperManagerService;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

public class PaymentControllerTest {

    private AuthController authController;
    private BookingController bookingController;
    private PaymentController paymentController;
    private ParkingLotService parkingLotService;
    private ParkingSpaceService parkingSpaceService;
    private ParkingSensorService parkingSensorService;
    private ClientService clientService;
    private ClientRepository clientRepository;
    private ManagerService managerService;
    private SuperManagerService superManagerService;
    private SuperManagerController superManagerController;

    private String testBookingsFilePath;
    private String testParkingLotsFilePath;
    private String testParkingSpacesFilePath;
    private String testParkingSensorFilePath;
    private String testClientsFilePath;
    private String testManagersFilePath;
    private String testPaymentsFilePath;

    private ParkingLot testLot;
    private ParkingSpace testSpace;
    private Client testClient;
    private Booking testBooking;

    @TempDir
    File tempDir;

    @BeforeEach
    void setUp() throws IOException {
        // Initialize test CSV files
        testBookingsFilePath = tempDir.getAbsolutePath() + "/test_bookings.csv";
        testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
        testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
        testParkingSensorFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
        testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
        testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";
        testPaymentsFilePath = tempDir.getAbsolutePath() + "/test_payments.csv";

        BookingCSVProcessor.initializeTestFile(testBookingsFilePath);
        ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
        ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
        ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
        ClientCSVProcessor.initializeTestFile(testClientsFilePath);
        ManagerCSVProcessor.initializeTestFile(testManagersFilePath);
        PaymentCSVProcessor.initializeTestFile(testPaymentsFilePath);

        // Initialize repositories
        BookingRepository bookingRepository = new BookingRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        ParkingSpaceRepository parkingSpaceRepository = new ParkingSpaceRepository();
        ParkingSensorRepository parkingSensorRepository = new ParkingSensorRepository();
        clientRepository = new ClientRepository();
        ManagerRepository managerRepository = new ManagerRepository();
        PaymentRepository paymentRepository = new PaymentRepository();

        // Initialize services with repositories
        parkingLotService = new ParkingLotService(parkingLotRepository);
        parkingSpaceService = new ParkingSpaceService(parkingSpaceRepository, parkingSensorRepository);
        parkingSensorService = new ParkingSensorService(bookingRepository, parkingSpaceRepository,
                parkingSensorRepository);
        clientService = new ClientService(clientRepository);
        managerService = new ManagerService(managerRepository);
        superManagerService = new SuperManagerService();

        // Create manager controller
        superManagerController = new SuperManagerController(managerService);

        // Create booking service and controller
        BookingService bookingService = new BookingService(bookingRepository, parkingSpaceRepository,
                parkingSensorService);
        bookingController = new BookingController(bookingService);

        // Create payment service and controller
        PaymentService paymentService = new PaymentService(paymentRepository, bookingService);
        paymentController = new PaymentController(paymentService);

        // Create auth controller
        authController = new AuthController(clientService, managerService, superManagerService);

        // Login as SuperManager
        String superEmail = "superadmin@parking.yorku.ca";
        String superPassword = "Super@dmin123!";
        authController.login(superEmail, superPassword, models.user.UserType.SUPER_MANAGER);

        // Generate manager
        Manager newManager = superManagerController.generateAndGetManagerAccount();

        // logout as SuperManager
        authController.logout();

        // Login as manager
        authController.login(newManager.getEmail(), newManager.getPassword(), models.user.UserType.MANAGER);

        // Create test parking lot and space
        parkingLotService.addParkingLot("Test Lot");
        testLot = parkingLotService.getParkingLotByName("Test Lot");
        parkingSpaceService.addParkingSpace(testLot, "Test Space");
        List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
        testSpace = spaces.get(0);

        // Create test client
        clientService.registerClient("Test Client", "test@example.com", "123456Ab!", type.STUDENT, "ABC123");
        testClient = clientRepository.getClientByEmail("test@example.com");
        testClient.setApproved(true);

        // Create test booking
        authController.logout();
        authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
        testBooking = bookingController.createBooking(testSpace, 2);

        authController.logout();
    }

    @AfterEach
    void tearDown() {
        BookingCSVProcessor.cleanupAndReset(testBookingsFilePath);
        ParkingLotCSVProcessor.cleanupAndReset(testParkingLotsFilePath);
        ParkingSpaceCSVProcessor.cleanupAndReset(testParkingSpacesFilePath);
        ParkingSensorCSVProcessor.cleanupAndReset(testParkingSensorFilePath);
        ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
        ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);
        PaymentCSVProcessor.cleanupAndReset(testPaymentsFilePath);

        if (authController.isLoggedIn()) {
            authController.logout();
        }
    }

    @Test
    void testProcessDepositPayment() {
        // Login as client
        authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

        // Process deposit payment
        Payment payment = paymentController.processDepositPayment(testBooking, "Credit");

        // Verify payment
        assertNotNull(payment);
        assertEquals(Payment.PaymentStatus.PAID, payment.getStatus());
        assertEquals(Payment.PaymentType.DEPOSIT, payment.getPaymentType());
        assertEquals(testBooking.getDeposit(), payment.getAmount());
    }

    @Test
    void testProcessDepositPaymentWithoutLogin() {
        assertThrows(models.ParkingSystemException.class,
                () -> paymentController.processDepositPayment(testBooking, "Credit"));
    }

    @Test
    void testProcessDepositPaymentOtherUsersBooking() {
        // Create another client
        clientService.registerClient("Other Client", "other@example.com", "123456Ab!", type.STUDENT, "XYZ789");
        Client otherClient = clientRepository.getClientByEmail("other@example.com");
        otherClient.setApproved(true);
        authController.login(otherClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

        assertThrows(models.ParkingSystemException.class,
                () -> paymentController.processDepositPayment(testBooking, "Credit"));
    }

    @Test
    void testProcessFinalPayment() {
        // Login as client
        authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

        // Create a new booking with start time 5 minutes in the past
        LocalDateTime startTime = LocalDateTime.now().minusMinutes(5);
        Booking newBooking = createBookingWithCustomStartTime(testSpace, 2, startTime);

        // First process deposit payment (booking should be PENDING)
        paymentController.processDepositPayment(newBooking, "Credit");

        // Now confirm the booking for check-in
        newBooking.confirmBooking();

        // Check in the booking
        bookingController.checkIn(newBooking);

        // Process final payment
        Payment payment = paymentController.processFinalPayment(newBooking, "Credit");

        // Verify payment
        assertNotNull(payment);
        assertEquals(Payment.PaymentStatus.PAID, payment.getStatus());
        assertEquals(Payment.PaymentType.FINAL, payment.getPaymentType());
        assertEquals(newBooking.deductedPrice(), payment.getAmount());
    }

    @Test
    void testProcessFinalPaymentWithoutLogin() {
        assertThrows(models.ParkingSystemException.class,
                () -> paymentController.processFinalPayment(testBooking, "Credit"));
    }

    @Test
    void testProcessFinalPaymentOtherUsersBooking() {
        // Create another client
        clientService.registerClient("Other Client", "other@example.com", "123456Ab!", type.STUDENT, "XYZ789");
        Client otherClient = clientRepository.getClientByEmail("other@example.com");
        otherClient.setApproved(true);
        authController.login(otherClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

        assertThrows(models.ParkingSystemException.class,
                () -> paymentController.processFinalPayment(testBooking, "Credit"));
    }

    @Test
    void testGetPaymentById() {
        // Login as client
        authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

        // Process deposit payment
        Payment payment = paymentController.processDepositPayment(testBooking, "Credit");

        // Get payment by ID
        Payment retrievedPayment = paymentController.getPaymentById(payment.getPaymentID());

        // Verify payment
        assertNotNull(retrievedPayment);
        assertEquals(payment.getPaymentID(), retrievedPayment.getPaymentID());
        assertEquals(payment.getAmount(), retrievedPayment.getAmount());
        assertEquals(payment.getStatus(), retrievedPayment.getStatus());
    }

    @Test
    void testGetPaymentsForBooking() {
        // Login as client
        authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

        // Create a new booking with start time 5 minutes in the past
        LocalDateTime startTime = LocalDateTime.now().minusMinutes(5);
        Booking newBooking = createBookingWithCustomStartTime(testSpace, 2, startTime);

        // Process deposit payment (booking should be PENDING)
        paymentController.processDepositPayment(newBooking, "Credit");

        // Now confirm the booking for check-in
        newBooking.confirmBooking();

        // Check in the booking
        bookingController.checkIn(newBooking);

        // Process final payment
        paymentController.processFinalPayment(newBooking, "Credit");

        // Get payments for booking
        List<Payment> payments = paymentController.getPaymentsForBooking(newBooking);

        // Verify payments
        assertEquals(2, payments.size());
        assertTrue(payments.stream().anyMatch(p -> p.getPaymentType() == Payment.PaymentType.DEPOSIT));
        assertTrue(payments.stream().anyMatch(p -> p.getPaymentType() == Payment.PaymentType.FINAL));
    }

    private Booking createBookingWithCustomStartTime(ParkingSpace space, int durationHours, LocalDateTime startTime) {
        Booking booking = new Booking(space, testClient, durationHours) {
            @Override
            public LocalDateTime getStartTime() {
                return startTime;
            }
        };
        // Don't confirm the booking here - it should start as PENDING
        return booking;
    }
}