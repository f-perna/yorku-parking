package services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.superManager.SuperManager;
import repositories.ParkingLotRepository;
import services.factory.ServiceFactory;
import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;

public class ParkingLotServiceTest {
	private ServiceFactory serviceFactory;
	private AuthenticationState authState;
	private SuperManager superManager;
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
	public void verifyAddParkingLot() {
		List<ParkingLot> parkingLots = serviceFactory.getParkingLotService().getAllParkingLots();
		assertEquals(0, parkingLots.size());

		serviceFactory.getParkingLotService().addParkingLot("Test Lot");

		parkingLots = serviceFactory.getParkingLotService().getAllParkingLots();
		assertEquals(1, parkingLots.size());
	}

	@Test
	public void verifyDuplicateParkingLot() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingLotService().addParkingLot("Test Lot"));
		assertEquals("A parking lot with name 'Test Lot' already exists", exception.getMessage());
	}

	@Test
	public void verifyAddParkingLotWithoutManagerLogin() {
		authState.setLoggedInUser(null);
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingLotService().addParkingLot("NoAuthLot"));
		assertEquals("Manager must be logged in to add parking lots", exception.getMessage());
	}

	@Test
	public void verifyEnableParkingLotSuccessfully() {
		int enabledParkingLots = serviceFactory.getParkingLotService().getEnabledParkingLotsCount();
		assertEquals(0, enabledParkingLots);

		serviceFactory.getParkingLotService().addParkingLot("Test Lot");

		List<ParkingLot> parkingLots = serviceFactory.getParkingLotService().getAllParkingLots();
		assertNotNull(parkingLots);
		assertEquals(1, parkingLots.size());
		ParkingLot testLot = parkingLots.get(0);
		assertTrue(testLot != null);

		boolean result = serviceFactory.getParkingLotService().enableParkingLot(testLot);

		assertTrue(result);
	}

	@Test
	public void verifyDisableParkingLotSuccessfully() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");

		List<ParkingLot> parkingLots = serviceFactory.getParkingLotService().getAllParkingLots();
		assertNotNull(parkingLots);
		assertEquals(1, parkingLots.size());
		ParkingLot testLot = parkingLots.get(0);
		assertTrue(testLot != null);

		boolean result = serviceFactory.getParkingLotService().disableParkingLot(testLot);
		assertTrue(result);
	}

	@Test
	public void verifyEnableParkingLotWithoutManagerLogin() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");

		List<ParkingLot> parkingLots = serviceFactory.getParkingLotService().getAllParkingLots();
		assertNotNull(parkingLots);
		assertEquals(1, parkingLots.size());
		ParkingLot testLot = parkingLots.get(0);
		assertTrue(testLot != null);

		authState.setLoggedInUser(null);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingLotService().enableParkingLot(testLot));
		assertEquals("Manager must be logged in to add parking lots", exception.getMessage());
	}

	@Test
	public void verifyDisableParkingLotWithoutManagerLogin() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");

		List<ParkingLot> parkingLots = serviceFactory.getParkingLotService().getAllParkingLots();
		assertNotNull(parkingLots);
		assertEquals(1, parkingLots.size());
		ParkingLot testLot = parkingLots.get(0);
		assertTrue(testLot != null);

		authState.setLoggedInUser(null);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingLotService().disableParkingLot(testLot));
		assertEquals("Manager must be logged in to add parking lots", exception.getMessage());
	}

	@Test
	public void verifyRemoveNullLot() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingLotService().removeParkingLot(null));
		assertEquals("Parking lot cannot be null", exception.getMessage());
	}

	@Test
	public void verifyRemoveParkingLot() {
		int sizeBefore = serviceFactory.getParkingLotService().getAllParkingLots().size();
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		List<ParkingLot> parkingLots = serviceFactory.getParkingLotService().getAllParkingLots();
		assertNotNull(parkingLots);
		assertEquals(1, parkingLots.size());
		ParkingLot testLot = parkingLots.get(0);
		assertTrue(testLot != null);
		serviceFactory.getParkingLotService().removeParkingLot(testLot);
		assertEquals(sizeBefore, serviceFactory.getParkingLotService().getAllParkingLots().size());
	}

	@Test
	public void verifyGetAllParkingLotsReturnsCorrectCount() {
		int sizeBefore = serviceFactory.getParkingLotService().getAllParkingLots().size();
		serviceFactory.getParkingLotService().addParkingLot("Test Lot A");
		serviceFactory.getParkingLotService().addParkingLot("Test Lot B");

		List<ParkingLot> updatedLots = serviceFactory.getParkingLotService().getAllParkingLots();
		assertEquals(sizeBefore + 2, updatedLots.size());
	}
}
