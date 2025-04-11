package manual.controllers;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.io.TempDir;

import controllers.factory.ControllerFactory;
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
import models.user.UserType;
import services.factory.ServiceFactory;

public abstract class BaseControllerTest {
	protected ControllerFactory controllerFactory;
	protected String testBookingsFilePath;
	protected String testParkingLotsFilePath;
	protected String testParkingSpacesFilePath;
	protected String testParkingSensorFilePath;
	protected String testClientsFilePath;
	protected String testManagersFilePath;
	protected String testPaymentsFilePath;

	@TempDir
	protected File tempDir;

	@BeforeEach
	protected void setUp() throws IOException {
		initializeTestFiles();
		initializeFactories();
	}

	protected void initializeTestFiles() throws IOException {
		// Initialize test CSV file paths
		testBookingsFilePath = tempDir.getAbsolutePath() + "/test_bookings.csv";
		testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
		testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
		testParkingSensorFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";
		testPaymentsFilePath = tempDir.getAbsolutePath() + "/test_payments.csv";

		// Initialize test CSV files
		BookingCSVProcessor.initializeTestFile(testBookingsFilePath);
		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);
		PaymentCSVProcessor.initializeTestFile(testPaymentsFilePath);
	}

	protected void initializeFactories() {
		controllerFactory = ControllerFactory.getInstance();
	}

	protected void loginAsSuperManager() {
		logout();
		controllerFactory.getAuthController().login("superadmin@parking.yorku.ca", "Super@dmin123!",
				UserType.SUPER_MANAGER);
	}

	protected void createAndLogInAsTestManager() {
		if (controllerFactory.getAuthController().getLoggedInSuperManager() == null) {
			loginAsSuperManager();
		}

		Manager testManager = controllerFactory.getSuperManagerController().generateAndGetManagerAccount();
		controllerFactory.getAuthController().logout();
		controllerFactory.getAuthController().login(testManager.getEmail(), testManager.getPassword(),
				UserType.MANAGER);
	}

	protected ParkingLot createTestParkingLot() {
		if (controllerFactory.getAuthController().getLoggedInManager() == null) {
			createAndLogInAsTestManager();
		}

		controllerFactory.getManagerController().addParkingLot("Test Lot");
		ParkingLot testLot = controllerFactory.getParkingLotController().getParkingLotByName("Test Lot");

		if (testLot == null) {
			throw new IllegalStateException("Failed to create test parking lot");
		}

		logout();
		return testLot;
	}

	protected ParkingSpace createTestParkingSpace(ParkingLot lot) {
		if (lot == null) {
			throw new IllegalStateException("Cannot make space for null lot");
		}

		if (controllerFactory.getAuthController().getLoggedInManager() == null) {
			createAndLogInAsTestManager();
		}

		controllerFactory.getManagerController().addParkingSpace(lot, "Test Space");
		List<ParkingSpace> spaces = controllerFactory.getParkingSpaceController().getParkingSpacesForLot(lot.getID());

		if (spaces.isEmpty()) {
			throw new IllegalStateException("Failed to create test parking space");
		}

		ParkingSpace testSpace = spaces.get(0);

		logout();
		return testSpace;
	}

	protected Client createTestClient() {
		controllerFactory.getClientController().registerClient("Test Client", "test@example.com", "123456Ab!",
				type.STUDENT, "ABC123");

		Client client = controllerFactory.getManagerController().getClientByEmail("test@example.com");

		if (client == null) {
			throw new IllegalStateException("Failed to create test client");
		}

		client.setApproved(true);

		return client;
	}

	protected Booking createTestBooking(Client client, ParkingSpace space) {
		if (client == null || !client.isApproved()) {
			throw new IllegalArgumentException("Cannot create booking for a null or not approved client.");
		}

		if (space == null || !space.isBookable()) {
			throw new IllegalArgumentException("Cannot create booking for an unavailable space.");
		}

		logout();

		controllerFactory.getAuthController().login(client.getEmail(), "123456Ab!", UserType.CLIENT);
		Booking testBooking = controllerFactory.getBookingController().createBooking(space, 2);

		if (testBooking == null) {
			throw new IllegalStateException("Failed to create new booking for client");
		}

		logout();

		return testBooking;
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		logout();
		cleanupTestFiles();
		resetFactories();
	}

	protected void logout() {
		if (controllerFactory.getAuthController().isLoggedIn()) {
			controllerFactory.getAuthController().logout();
		}
	}

	protected void cleanupTestFiles() {
		BookingCSVProcessor.cleanupAndReset(testBookingsFilePath);
		ParkingLotCSVProcessor.cleanupAndReset(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.cleanupAndReset(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.cleanupAndReset(testParkingSensorFilePath);
		ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
		ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);
		PaymentCSVProcessor.cleanupAndReset(testPaymentsFilePath);
	}

	protected void resetFactories() throws NoSuchFieldException, IllegalAccessException {
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
}