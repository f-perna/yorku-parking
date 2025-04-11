package controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.booking.Booking;
import models.client.Client;
import models.client.Client.type;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import models.user.UserType;

public class PaymentControllerTest extends BaseControllerTest {
    private AuthController authController;
    private BookingController bookingController;
    private PaymentController paymentController;
    private ManagerController managerController;
    private SuperManagerController superManagerController;
    private Manager testManager;
    private ParkingLot testLot;
    private ParkingSpace testSpace;
    private Client testClient;
    private Booking testBooking;

    @BeforeEach
    protected void setUp() throws IOException {
        super.setUp();
        initializeControllers();
        createTestManager();
        createTestParkingLotAndSpace();
        createTestClient();
        createTestBooking();
    }

    private void initializeControllers() {
        authController = controllerFactory.getAuthController();
        bookingController = controllerFactory.getBookingController();
        paymentController = controllerFactory.getPaymentController();
        managerController = controllerFactory.getManagerController();
        superManagerController = controllerFactory.getSuperManagerController();
    }

    private void createTestManager() {
        // Login as SuperManager
        authController.login("superadmin@parking.yorku.ca", "Super@dmin123!", UserType.SUPER_MANAGER);

        // Generate manager
        testManager = superManagerController.generateAndGetManagerAccount();

        // Logout and login as manager
        authController.logout();
        authController.login(testManager.getEmail(), testManager.getPassword(), UserType.MANAGER);
    }

    private void createTestParkingLotAndSpace() {
        // Create test parking lot
        managerController.addParkingLot("Test Lot");
        testLot = controllerFactory.getParkingLotController().getParkingLotByName("Test Lot");
        if (testLot == null) {
            throw new IllegalStateException("Failed to create test parking lot");
        }

        // Create test parking space
        managerController.addParkingSpace(testLot, "Test Space");
        List<ParkingSpace> spaces = controllerFactory.getParkingSpaceController()
                .getParkingSpacesForLot(testLot.getID());
        if (spaces.isEmpty()) {
            throw new IllegalStateException("Failed to create test parking space");
        }
        testSpace = spaces.get(0);
    }

    private void createTestClient() {
        // Create and approve test client
        controllerFactory.getClientController().registerClient("Test Client", "test@example.com", "123456Ab!",
                type.STUDENT, "ABC123");
        testClient = controllerFactory.getManagerController().getClientByEmail("test@example.com");
        if (testClient == null) {
            throw new IllegalStateException("Failed to create test client");
        }
        testClient.setApproved(true);
    }

    private void createTestBooking() {
        // Login as client and create booking
        super.ensureLoggedOut();
        authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);
        testBooking = bookingController.createBooking(testSpace, 2);
        authController.logout();
    }

    @AfterEach
    protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
        super.tearDown();
    }

    @Test
    void testProcessDepositPayment() {
        // Login as client
        authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

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
        controllerFactory.getClientController().registerClient("Other Client", "other@example.com", "123456Ab!",
                type.STUDENT, "XYZ789");
        Client otherClient = controllerFactory.getManagerController().getClientByEmail("other@example.com");
        otherClient.setApproved(true);
        authController.login(otherClient.getEmail(), "123456Ab!", UserType.CLIENT);

        assertThrows(models.ParkingSystemException.class,
                () -> paymentController.processDepositPayment(testBooking, "Credit"));
    }

    @Test
    void testProcessFinalPayment() {
        // Login as client
        authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

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
        controllerFactory.getClientController().registerClient("Other Client", "other@example.com", "123456Ab!",
                type.STUDENT, "XYZ789");
        Client otherClient = controllerFactory.getManagerController().getClientByEmail("other@example.com");
        otherClient.setApproved(true);
        authController.login(otherClient.getEmail(), "123456Ab!", UserType.CLIENT);

        assertThrows(models.ParkingSystemException.class,
                () -> paymentController.processFinalPayment(testBooking, "Credit"));
    }

    @Test
    void testGetPaymentById() {
        // Login as client
        authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

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
        authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

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