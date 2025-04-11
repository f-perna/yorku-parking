package controllers;

import java.io.File;
import java.io.IOException;
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
import models.booking.Booking;
import models.booking.Booking.BookingStatus;
import models.client.Client;
import models.client.Client.type;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.user.UserType;
import repositories.BookingRepository;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;
import services.BookingService;
import services.ClientService;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSensorService;
import services.ParkingSpaceService;
import services.SuperManagerService;

import static org.junit.jupiter.api.Assertions.*;

public class BookingControllerTest {

	private AuthController authController;
	private BookingController bookingController;
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

	private ParkingLot testLot;
	private ParkingSpace testSpace;
	private Client testClient;
	private Manager testManager;

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

		BookingCSVProcessor.initializeTestFile(testBookingsFilePath);
		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);

		// Initialize repositories
		BookingRepository bookingRepository = new BookingRepository();
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
		ParkingSpaceRepository parkingSpaceRepository = new ParkingSpaceRepository();
		ParkingSensorRepository parkingSensorRepository = new ParkingSensorRepository();
		clientRepository = new ClientRepository();
		ManagerRepository managerRepository = new ManagerRepository();

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

		// Create auth controller
		authController = new AuthController(clientService, managerService, superManagerService);

		// Login as SuperManager
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		authController.login(superEmail, superPassword, models.user.UserType.SUPER_MANAGER);

		// Generate manager
		testManager = superManagerController.generateAndGetManagerAccount();

		// logout as SuperManager
		authController.logout();

		// Login as manager
		authController.login(testManager.getEmail(), testManager.getPassword(), models.user.UserType.MANAGER);

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

		if (authController.isLoggedIn()) {
			authController.logout();
		}
	}

	@Test
	void testCreateBooking() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking
		Booking booking = bookingController.createBooking(testSpace, 2);

		// Verify booking
		assertNotNull(booking);
		assertEquals(testSpace.getID(), booking.getParkingSpace().getID());
		assertEquals(testClient.getEmail(), booking.getClient().getEmail());
		assertEquals(2, booking.calculateHours());
	}

	@Test
	void testCreateBookingWithoutLogin() {
		assertThrows(models.ParkingSystemException.class, () -> bookingController.createBooking(testSpace, 2));
	}

	@Test
	void testCreateBookingWithUnapprovedClient() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Make client unapproved
		testClient.setApproved(false);

		assertThrows(models.ParkingSystemException.class, () -> bookingController.createBooking(testSpace, 2));
	}

	@Test
	void testCancel() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking
		Booking booking = bookingController.createBooking(testSpace, 2);

		// Cancel booking
		boolean result = bookingController.cancel(booking);
		assertTrue(result);
	}

	@Test
	void testCancelWithoutLogin() {
		// Create booking as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking booking = bookingController.createBooking(testSpace, 2);
		authController.logout();

		assertThrows(models.ParkingSystemException.class, () -> bookingController.cancel(booking));
	}

	@Test
	void testCancelOtherUsersBooking() {
		// Create booking as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking booking = bookingController.createBooking(testSpace, 2);
		authController.logout();

		// Create another client and try to cancel
		clientService.registerClient("Other Client", "other@example.com", "123456Ab!", type.STUDENT, "XYZ789");
		Client otherClient = clientRepository.getClientByEmail("other@example.com");
		otherClient.setApproved(true);
		authController.login(otherClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		assertThrows(models.ParkingSystemException.class, () -> bookingController.cancel(booking));
	}

	@Test
	void testCheckIn() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking with start time 5 minutes in the past
		LocalDateTime startTime = LocalDateTime.now().minusMinutes(5);
		Booking booking = createBookingWithCustomStartTime(testSpace, 2, startTime);

		// Check in
		boolean result = bookingController.checkIn(booking);
		assertTrue(result);
	}

	@Test
	void testCheckInWithoutLogin() {
		// Create booking as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking booking = bookingController.createBooking(testSpace, 2);
		authController.logout();

		assertThrows(models.ParkingSystemException.class, () -> bookingController.checkIn(booking));
	}

	@Test
	void testCheckInOtherUsersBooking() {
		// Create booking as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking booking = bookingController.createBooking(testSpace, 2);
		authController.logout();

		// Create another client and try to check in
		clientService.registerClient("Other Client", "other@example.com", "123456Ab!", type.STUDENT, "XYZ789");
		Client otherClient = clientRepository.getClientByEmail("other@example.com");
		otherClient.setApproved(true);
		authController.login(otherClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		assertThrows(models.ParkingSystemException.class, () -> bookingController.checkIn(booking));
	}

	@Test
	void testGetBookingsForClient() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking
		bookingController.createBooking(testSpace, 2);

		// Get bookings
		List<Booking> bookings = bookingController.getBookingsForClient();
		assertEquals(1, bookings.size());
	}

	@Test
	void testGetBookingsForClientWithoutLogin() {
		assertThrows(models.ParkingSystemException.class, () -> bookingController.getBookingsForClient());
	}

	@Test
	void testExtendBookingTime() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking
		Booking booking = bookingController.createBooking(testSpace, 2);

		// Extend booking
		Booking extendedBooking = bookingController.extendBookingTime(booking, 1);
		assertEquals(3, extendedBooking.calculateHours());
	}

	@Test
	void testExtendBookingTimeWithoutLogin() {
		// Create booking as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking booking = bookingController.createBooking(testSpace, 2);
		authController.logout();

		assertThrows(models.ParkingSystemException.class, () -> bookingController.extendBookingTime(booking, 1));
	}

	@Test
	void testExtendBookingTimeOtherUsersBooking() {
		// Create booking as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking booking = bookingController.createBooking(testSpace, 2);
		authController.logout();

		// Create another client and try to extend
		clientService.registerClient("Other Client", "other@example.com", "123456Ab!", type.STUDENT, "XYZ789");
		Client otherClient = clientRepository.getClientByEmail("other@example.com");
		otherClient.setApproved(true);
		authController.login(otherClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		assertThrows(models.ParkingSystemException.class, () -> bookingController.extendBookingTime(booking, 1));
	}

	@Test
	void testCancelBooking() {
		// Login as client
		authController.login(testClient.getEmail(), testClient.getPassword(), models.user.UserType.CLIENT);

		// Create booking
		Booking booking = bookingController.createBooking(testSpace, 2);

		// Cancel booking
		bookingController.cancelBooking(booking);

		// Verify booking is cancelled
		assertEquals(BookingStatus.CANCELED, booking.getStatus());
	}

	@Test
	void testCancelBookingWithoutLogin() {
		// Create booking as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking booking = bookingController.createBooking(testSpace, 2);
		authController.logout();

		assertThrows(models.ParkingSystemException.class, () -> bookingController.cancelBooking(booking));
	}

	@Test
	void testCancelBookingOtherUsersBooking() {
		// Create booking as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking booking = bookingController.createBooking(testSpace, 2);
		authController.logout();

		// Create another client and try to cancel
		clientService.registerClient("Other Client", "other@example.com", "123456Ab!", type.STUDENT, "XYZ789");
		Client otherClient = clientRepository.getClientByEmail("other@example.com");
		otherClient.setApproved(true);
		authController.login(otherClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		assertThrows(models.ParkingSystemException.class, () -> bookingController.cancelBooking(booking));
	}

	@Test
	void testIsLatestBookingForSpaceAndClient() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create first booking
		Booking firstBooking = bookingController.createBooking(testSpace, 2);

		// Add a small delay to ensure different start times
		try {
			Thread.sleep(100); // 100ms delay
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		// Create second booking
		Booking secondBooking = bookingController.createBooking(testSpace, 2);

		// Verify second booking is latest
		assertFalse(bookingController.isLatestBookingForSpaceAndClient(firstBooking));
		assertTrue(bookingController.isLatestBookingForSpaceAndClient(secondBooking));
	}

	@Test
	void testCheckInBeforeWindow() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking with start time 10 minutes in the future
		LocalDateTime startTime = LocalDateTime.now().plusMinutes(10);
		Booking booking = createBookingWithCustomStartTime(testSpace, 2, startTime);

		// Try to check in (should fail as we're before the 5-minute window)
		assertThrows(models.ParkingSystemException.class, () -> bookingController.checkIn(booking));
	}

	@Test
	void testCheckInAfterWindow() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking with start time 2 hours in the past
		LocalDateTime startTime = LocalDateTime.now().minusHours(2);
		Booking booking = createBookingWithCustomStartTime(testSpace, 2, startTime);

		// Try to check in (should fail as we're after the 1-hour window)
		assertThrows(models.ParkingSystemException.class, () -> bookingController.checkIn(booking));
	}

	@Test
	void testCheckInAtStartTime() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking with start time now
		LocalDateTime startTime = LocalDateTime.now();
		Booking booking = createBookingWithCustomStartTime(testSpace, 2, startTime);

		// Check in (should succeed as we're at the start time)
		boolean result = bookingController.checkIn(booking);
		assertTrue(result);
	}

	@Test
	void testCheckInAtEndOfWindow() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Create booking with start time 59 minutes in the past
		LocalDateTime startTime = LocalDateTime.now().minusMinutes(59);
		Booking booking = createBookingWithCustomStartTime(testSpace, 2, startTime);

		// Check in (should succeed as we're within the 1-hour window)
		boolean result = bookingController.checkIn(booking);
		assertTrue(result);
	}

	private Booking createBookingWithCustomStartTime(ParkingSpace space, int durationHours, LocalDateTime startTime) {
		Booking booking = new Booking(space, testClient, durationHours) {
			@Override
			public LocalDateTime getStartTime() {
				return startTime;
			}
		};
		booking.confirmBooking();
		return booking;
	}
}
