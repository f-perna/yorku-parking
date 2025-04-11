package manual.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.superManager.SuperManager;
import services.factory.ServiceFactory;
import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;

public class ParkingSpaceServiceTest {
	private AuthenticationState authState;
	private SuperManager superManager;
	private ServiceFactory serviceFactory;
	private ParkingLot testLot;
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
		createTestLot();
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

	private void createTestLot() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		testLot = serviceFactory.getParkingLotService().getParkingLotByName("Test Lot");
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

	private ParkingSpace findParkingSpaceByName(String name) {
		return serviceFactory.getParkingSpaceService().getAllSpaces().stream()
				.filter(space -> space.getName().equals(name)).findFirst().orElse(null);
	}

	@Test
	public void verifyAddParkingSpace() {
		System.out.println(authState.getLoggedInUser().getEmail());
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		ParkingSpace testSpace = findParkingSpaceByName("Test Space");
		assertTrue(testSpace != null);
	}

	@Test
	public void verifyAddParkingSpaceWithoutManagerLogin() {
		authState.setLoggedInUser(null);
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space"));
		assertEquals("Only managers can add parking spaces", exception.getMessage());
	}

	@Test
	public void verifyAddDuplicateParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space"));
		assertEquals("A parking space with name 'Test Space' already exists in lot 'Test Lot'", exception.getMessage());

	}

	@Test
	public void verifyAddParkingSpaceWithNullLot() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().addParkingSpace(null, "InvalidSpace"));
		assertEquals("Space cannot be null", exception.getMessage());
	}

	@Test
	public void verifyAddParkingSpaceWithEmptyName() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().addParkingSpace(testLot, ""));
		assertEquals("Space name cannot be empty", exception.getMessage());
	}

	@Test
	public void verifyEnableParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		ParkingSpace testSpace = findParkingSpaceByName("Test Space");

		if (!testSpace.isEnabled()) {
			serviceFactory.getParkingSpaceService().enableParkingSpace(testSpace);
			ParkingSpace updated = serviceFactory.getParkingSpaceService().getParkingSpaceById(testSpace.getID());
			assertTrue(updated.isEnabled());
		}
	}

	@Test
	public void verifyDisableParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		ParkingSpace testSpace = findParkingSpaceByName("Test Space");

		serviceFactory.getParkingSpaceService().disableParkingSpace(testSpace);
		ParkingSpace updated = serviceFactory.getParkingSpaceService().getParkingSpaceById(testSpace.getID());
		assertTrue(!updated.isEnabled());
	}

	@Test
	public void verifyRemoveNullParkingSpace() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().removeParkingSpace(null));
		assertEquals("Parking space cannot be null", exception.getMessage());
	}

	@Test
	public void verifyGetParkingSpaceByInvalidId() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().getParkingSpaceById(null));
		assertEquals("Space ID cannot be null", exception.getMessage());
	}

	@Test
	public void verifyGetParkingSpaceByIdNotFound() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().getParkingSpaceById(UUID.randomUUID()));
		assertEquals("Parking space not found", exception.getMessage());
	}
}
