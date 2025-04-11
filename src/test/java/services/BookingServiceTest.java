package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

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
import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.booking.Booking;
import models.client.Client;
import models.client.Client.type;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import models.payment.Payment.PaymentType;
import models.superManager.SuperManager;
import services.factory.ServiceFactory;
import controllers.factory.ControllerFactory;

public class BookingServiceTest {
	private ServiceFactory serviceFactory;
	private BookingService bookingService;
	private ClientService clientService;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private AuthenticationState authState;
	private SuperManager superManager;

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
		initializeTestFiles();
		initializeFactories();
		initializeAuth();
		createTestManager();
		createTestParkingLotAndSpace();
		createTestClient();
	}

	private void initializeTestFiles() throws IOException {
		// Initialize test CSV file paths
		testBookingsFilePath = tempDir.getAbsolutePath() + "/test_bookings.csv";
		testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
		testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
		testParkingSensorFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";

		// Initialize test CSV files
		BookingCSVProcessor.initializeTestFile(testBookingsFilePath);
		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);
	}

	private void initializeFactories() {
		// Initialize factories
		serviceFactory = ServiceFactory.getInstance();

		// Get services from factory
		bookingService = serviceFactory.getBookingService();
		clientService = serviceFactory.getClientService();
		parkingLotService = serviceFactory.getParkingLotService();
		parkingSpaceService = serviceFactory.getParkingSpaceService();
	}

	private void initializeAuth() {
		authState = AuthenticationState.getInstance();
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);
	}

	private void createTestManager() {
		testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
		authState.setLoggedInUser(testManager);
	}

	private void createTestParkingLotAndSpace() {
		// Create test parking lot
		parkingLotService.addParkingLot("Test Lot");
		testLot = parkingLotService.getParkingLotByName("Test Lot");
		if (testLot == null) {
			throw new IllegalStateException("Failed to create test parking lot");
		}

		// Create test parking space
		parkingSpaceService.addParkingSpace(testLot, "Test Space");
		testSpace = parkingSpaceService.getSpacesForLot(testLot.getID()).get(0);
		if (testSpace == null) {
			throw new IllegalStateException("Failed to create test parking space");
		}
	}

	private void createTestClient() {
		// Create and approve test client
		clientService.registerClient("Test Client", "test@example.com", "123456Ab!", type.STUDENT, "ABC123");
		testClient = clientService.getClientByEmail("test@example.com");
		if (testClient == null) {
			throw new IllegalStateException("Failed to create test client");
		}
		testClient.setApproved(true);
	}

	@AfterEach
	void tearDown() throws NoSuchFieldException, IllegalAccessException {
		authState.setLoggedInUser(superManager);
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
		cleanupTestFiles();
		resetFactories();
	}

	private void cleanupTestFiles() {
		BookingCSVProcessor.cleanupAndReset(testBookingsFilePath);
		ParkingLotCSVProcessor.cleanupAndReset(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.cleanupAndReset(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.cleanupAndReset(testParkingSensorFilePath);
		ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
		ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);
	}

	private void resetFactories() throws NoSuchFieldException, IllegalAccessException {
		// Reset factories in dependency order
		resetFactory(repositories.factory.RepositoryFactory.class, "instance");
		resetFactory(ServiceFactory.class, "instance");
		resetFactory(ControllerFactory.class, "instance");
	}

	private void resetFactory(Class<?> factoryClass, String instanceFieldName)
			throws NoSuchFieldException, IllegalAccessException {
		Field instance = factoryClass.getDeclaredField(instanceFieldName);
		instance.setAccessible(true);
		instance.set(null, null);
	}

	@Test
	public void verifyValidBooking() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		assertNotNull(testBooking);
	}

	@Test
	public void verifyConfirmBooking() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		try {
			assertNotNull(testBooking);
			bookingService.confirmBooking(testBooking, testPayment);
		} catch (ParkingSystemException e) {
			fail("Failed to confirm booking");
		}

		bookingService.deleteBooking(testBooking);
		clientService.removeClient("test@gmail.com");
	}

	@Test
	public void verifyExtendBooking() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		try {
			assertNotNull(testBooking);
			bookingService.confirmBooking(testBooking, testPayment);
			bookingService.extendBookingTime(testBooking, 3);
		} catch (ParkingSystemException e) {
			fail("Failed to extend booking");
		}

		bookingService.deleteBooking(testBooking);
		clientService.removeClient("test@gmail.com");
	}

	@Test
	public void verifyCancelBooking() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		try {
			assertNotNull(testBooking);
			bookingService.confirmBooking(testBooking, testPayment);
			bookingService.cancel(testBooking);
		} catch (ParkingSystemException e) {
			fail("Failed to cancel booking");
		}

		bookingService.deleteBooking(testBooking);
		clientService.removeClient("test@gmail.com");
	}

	@Test
	public void verifyNoOverstayedBookings() {
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		assertFalse(bookingService.hasOverstayedBookings(clientService.getClientByEmail("test@gmail.com")));

		clientService.removeClient("test@gmail.com");
	}

	@Test
	public void verifyInvalidExtenedBookingTime() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		try {
			assertNotNull(testBooking);
			bookingService.confirmBooking(testBooking, testPayment);
			bookingService.extendBookingTime(testBooking, 30); // 30 Hours, max 24
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Additional hours must be between 1 and 24", e.getMessage());
		}

		bookingService.deleteBooking(testBooking);
		clientService.removeClient("test@gmail.com");
	}

	@Test
	public void verifyInvalidBookingPayment() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);

		try {
			assertNotNull(testBooking);
			bookingService.confirmBooking(testBooking, testPayment);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Payment must be successfuly made.", e.getMessage());
		}

		bookingService.deleteBooking(testBooking);
		clientService.removeClient("test@gmail.com");
	}

	@Test
	public void verifyInvalidBookingCheckin() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		try {
			assertNotNull(testBooking);
			bookingService.confirmBooking(testBooking, testPayment);
			bookingService.checkIn(testBooking);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Check-in period is not open yet! Please try again at least 5 minutes before your booking.",
					e.getMessage());
		}

		bookingService.deleteBooking(testBooking);
		clientService.removeClient("test@gmail.com");
	}

	@Test
	public void verifyInvalidBookingTime() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		try {
			// 25 Hours, Max is 24
			bookingService.createBooking(parkingSpace, 25, clientService.getClientByEmail("test@gmail.com"));
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Duration must be between 1 and 24 hours", e.getMessage());
		}
		clientService.removeClient("test@gmail.com");
	}

	@Test
	public void verifyInvalidBookingClientApproval() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		Client client = null;

		for (Client testClient : clientService.getAllClients()) {
			if (testClient.getEmail().equals("test@gmail.com")) {
				client = testClient;
				break;
			}
		}

		try {
			bookingService.createBooking(parkingSpace, 5, client);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Client must be approved to make a booking", e.getMessage());
		}
		clientService.removeClient("test@gmail.com");
	}
}
