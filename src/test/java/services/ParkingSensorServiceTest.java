package services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import models.auth.AuthenticationState;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSensor.ParkingSensor;
import models.parkingSpace.ParkingSpace;
import models.superManager.SuperManager;
import services.factory.ServiceFactory;
import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;

public class ParkingSensorServiceTest {
	private AuthenticationState authState;
	private SuperManager superManager;
	private ServiceFactory serviceFactory;
	private ParkingLot testLot;
	private ParkingSpace testSpace;
	private Manager testManager;

	private String testBookingsFilePath;
	private String testParkingLotsFilePath;
	private String testParkingSpacesFilePath;
	private String testParkingSensorFilePath;
	private String testClientsFilePath;
	private String testManagersFilePath;

	@TempDir
	File tempDir;

	@BeforeEach
	public void setUp() throws IOException {
		initializeTestFiles();
		initializeFactories();
		initializeAuth();
		createTestLotAndSpace();
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
		serviceFactory = ServiceFactory.getInstance();
	}

	private void initializeAuth() {
		authState = AuthenticationState.getInstance();
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);

		testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
		authState.setLoggedInUser(testManager);
	}

	private void createTestLotAndSpace() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		testLot = serviceFactory.getParkingLotService().getParkingLotByName("Test Lot");

		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		testSpace = serviceFactory.getParkingSpaceService().getAllSpaces().stream()
				.filter(space -> space.getName().equals("Test Space"))
				.findFirst()
				.orElse(null);
	}

	@AfterEach
	public void tearDown() throws NoSuchFieldException, IllegalAccessException {
		authState.setLoggedInUser(superManager);
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
		resetFactory(repositories.factory.RepositoryFactory.class, "instance");
		resetFactory(ServiceFactory.class, "instance");
	}

	private void resetFactory(Class<?> factoryClass, String instanceFieldName)
			throws NoSuchFieldException, IllegalAccessException {
		Field instance = factoryClass.getDeclaredField(instanceFieldName);
		instance.setAccessible(true);
		instance.set(null, null);
	}

	@Test
	public void verifyCarNotPresent() {
		Boolean carPresent = serviceFactory.getParkingSensorService().isCarPresentAtSpace(testSpace);
		assertFalse(carPresent);
	}

	@Test
	public void verifySensorAutoCreation() {
		ParkingSensor sensor = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);
		assertTrue(sensor != null);
	}

	@Test
	public void verifySimulateCarArrivalSuccess() {
		boolean success = serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
		assertTrue(success);

		assertTrue(serviceFactory.getParkingSensorService().isCarPresentAtSpace(testSpace));
		assertEquals("TEST 123", serviceFactory.getParkingSensorService().getDetectedLicencePlate(testSpace));
	}

	@Test
	public void verifySimulateCarDeparture() {
		serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
		serviceFactory.getParkingSensorService().simulateCarDeparture(testSpace, "TEST 123");

		assertFalse(serviceFactory.getParkingSensorService().isCarPresentAtSpace(testSpace));
	}

	@Test
	public void verifyGetLicencePlateWhenNoCarPresent() {
		String plate = serviceFactory.getParkingSensorService().getDetectedLicencePlate(testSpace);
		assertEquals(null, plate);
	}

	@Test
	public void verifyGetSensorForSpaceReturnsSameSensor() {
		ParkingSensor sensor1 = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);
		ParkingSensor sensor2 = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);

		assertEquals(sensor1.getId(), sensor2.getId());
	}

	@Test
	public void verifySimulateCarArrivalOnOccupiedSpaceFails() {
		serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
		boolean result = serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 456");

		assertFalse(result);
	}

	@Test
	public void verifyCarParkedAnywhereTrue() {
		serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
		assertTrue(serviceFactory.getParkingSensorService().isClientCarParkedAnywhere("TEST 123"));
	}

	@Test
	public void verifyClientCarParkedAnywhereWithNull() {
		boolean result = serviceFactory.getParkingSensorService().isClientCarParkedAnywhere(null);
		assertFalse(result);
	}

	@Test
	public void verifyRemoveSensorAndRecreateOnAccess() {
		serviceFactory.getParkingSensorService().removeSensor(testSpace);

		ParkingSensor newSensor = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);

		assertTrue(newSensor != null);
		assertEquals(testSpace.getID(), newSensor.getParkingSpace().getID());
	}
}
