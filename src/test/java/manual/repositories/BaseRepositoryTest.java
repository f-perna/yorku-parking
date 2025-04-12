package manual.repositories;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
import models.client.GenerateClientFactory;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import repositories.factory.RepositoryFactory;

public class BaseRepositoryTest {

	protected RepositoryFactory repositoryFactory;

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
		repositoryFactory = RepositoryFactory.getInstance();
	}

	protected Client createTestClient() {
		Client testClient = GenerateClientFactory.getClientType("Bob", "test@gmail.com", "123", Client.type.VISITOR,
				"TES 123", false);

		if (testClient == null) {
			throw new IllegalStateException("Failed to create test client");
		}

		repositoryFactory.getClientRepository().registerClient(testClient);

		return testClient;
	}

	protected ParkingLot createTestParkingLot() {
		ParkingLot testLot = repositoryFactory.getParkingLotRepository().addParkingLot("Test Lot");

		if (testLot == null) {
			throw new IllegalArgumentException("Failed to create new parking lot");
		}

		return testLot;
	}

	protected ParkingSpace createTestParkingSpace(ParkingLot testLot) {
		if (testLot == null) {
			testLot = createTestParkingLot();
		}
		ParkingSpace testSpace = repositoryFactory.getParkingSpaceRepository().addParkingSpace(testLot, "Test Space");

		if (testSpace == null) {
			throw new IllegalStateException("Failed to create parking space");
		}

		return testSpace;
	}

	protected Booking createTestBooking(ParkingSpace testSpace, Client testClient) {
		if (testSpace == null) {
			ParkingLot testLot = createTestParkingLot();
			testSpace = createTestParkingSpace(testLot);
		}

		if (testClient == null) {
			testClient = createTestClient();
		}

		Booking testBooking = repositoryFactory.getBookingRepository().createBooking(testSpace, 5, testClient);

		if (testBooking == null) {
			throw new IllegalStateException("Failed to create booking");
		}

		return testBooking;
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		cleanupTestFiles();
		resetFactories();
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
		resetFactory(RepositoryFactory.class, "instance");
	}

	private void resetFactory(Class<?> factoryClass, String instanceFieldName)
			throws NoSuchFieldException, IllegalAccessException {
		Field instance = factoryClass.getDeclaredField(instanceFieldName);
		instance.setAccessible(true);
		instance.set(null, null);
	}

}
