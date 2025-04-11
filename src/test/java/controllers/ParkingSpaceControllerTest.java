package controllers;

import java.io.File;
import java.io.IOException;
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
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSensor.ParkingSensor;
import repositories.BookingRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSensorService;
import services.ParkingSpaceService;
import services.SuperManagerService;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSpaceControllerTest {

	private AuthController authController;
	private SuperManagerController superManagerController;
	private ParkingSpaceController parkingSpaceController;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private ParkingSensorService parkingSensorService;
	private ManagerService managerService;
	private SuperManagerService superManagerService;

	private String testParkingLotsFilePath;
	private String testParkingSpacesFilePath;
	private String testParkingSensorFilePath;
	private String testClientsFilePath;
	private String testManagersFilePath;
	private String testBookingsFilePath;

	private ParkingLot testLot;

	@TempDir
	File tempDir;

	@BeforeEach
	void setUp() throws IOException {
		// Initialize test CSV files
		testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
		testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
		testParkingSensorFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";
		testBookingsFilePath = tempDir.getAbsoluteFile() + "/test_bookings.csv";

		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);
		BookingCSVProcessor.initializeTestFile(testBookingsFilePath);

		// Initialize repositories
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
		ParkingSpaceRepository parkingSpaceRepository = new ParkingSpaceRepository();
		ParkingSensorRepository parkingSensorRepository = new ParkingSensorRepository();
		ManagerRepository managerRepository = new ManagerRepository();
		BookingRepository bookingRepository = new BookingRepository();

		// Initialize services with repositories
		parkingLotService = new ParkingLotService(parkingLotRepository);
		parkingSpaceService = new ParkingSpaceService(parkingSpaceRepository, parkingSensorRepository);
		parkingSensorService = new ParkingSensorService(bookingRepository, parkingSpaceRepository, parkingSensorRepository);
		managerService = new ManagerService(managerRepository);
		superManagerService = new SuperManagerService();

		// Create manager controller
		superManagerController = new SuperManagerController(managerService);

		parkingSpaceController = new ParkingSpaceController(parkingSpaceService);

		authController = new AuthController(null, managerService, superManagerService);

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

		// Create test parking lot
		parkingLotService.addParkingLot("Test Lot");
		testLot = parkingLotService.getParkingLotByName("Test Lot");
	}

	@AfterEach
	void tearDown() {
		ParkingLotCSVProcessor.cleanupAndReset(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.cleanupAndReset(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.cleanupAndReset(testParkingSensorFilePath);
		ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
		ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);
		BookingCSVProcessor.cleanupAndReset(testBookingsFilePath);

		if (authController.isLoggedIn()) {
			authController.logout();
		}
	}

	@Test
	void testGetAvailableSpaces() {
		// Add some parking spaces
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		parkingSpaceService.addParkingSpace(testLot, "Space 2");

		// Get available spaces
		List<ParkingSpace> availableSpaces = parkingSpaceController.getAvailableSpaces(testLot);

		// Verify results
		assertEquals(2, availableSpaces.size());
	}

	@Test
	void testGetAvailableSpacesWithNullLot() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceController.getAvailableSpaces(null));
	}

	@Test
	void testGetParkingSpaceById() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Get space by ID
		ParkingSpace retrievedSpace = parkingSpaceController.getParkingSpaceById(space.getID());

		// Verify results
		assertNotNull(retrievedSpace);
		assertEquals(space.getID(), retrievedSpace.getID());
		assertEquals(space.getName(), retrievedSpace.getName());
	}

	@Test
	void testGetParkingSpaceByIdWithInvalidId() {
		assertThrows(models.ParkingSystemException.class,
				() -> parkingSpaceController.getParkingSpaceById(UUID.randomUUID()));
	}

	@Test
	void testGetParkingSpacesForLot() {
		// Add some parking spaces
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		parkingSpaceService.addParkingSpace(testLot, "Space 2");

		// Get spaces for lot
		List<ParkingSpace> spaces = parkingSpaceController.getParkingSpacesForLot(testLot.getID());

		// Verify results
		assertEquals(2, spaces.size());
	}

	@Test
	void testGetParkingSpacesForLotWithInvalidId() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceController.getParkingSpacesForLot(null));
	}

	@Test
	void testGetAllSpaces() {
		// Add some parking spaces
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		parkingSpaceService.addParkingSpace(testLot, "Space 2");

		// Get all spaces
		List<ParkingSpace> allSpaces = parkingSpaceController.getAllSpaces();

		// Verify results
		assertEquals(2, allSpaces.size());
	}

	@Test
	void testGetOccupiedSpaces() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should be unoccupied
		List<ParkingSpace> occupiedSpaces = parkingSpaceController.getOccupiedSpaces(testLot);
		assertEquals(0, occupiedSpaces.size());

		// Simulate car presence
		parkingSensorService.simulateCarArrival(space, "ABC123");

		// Now should be occupied
		occupiedSpaces = parkingSpaceController.getOccupiedSpaces(testLot);
		assertEquals(1, occupiedSpaces.size());
		assertEquals(space.getID(), occupiedSpaces.get(0).getID());
	}

	@Test
	void testGetOccupiedSpacesWithNullLot() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceController.getOccupiedSpaces(null));
	}

	@Test
	void testGetUnOccupiedSpaces() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should be unoccupied
		List<ParkingSpace> unOccupiedSpaces = parkingSpaceController.getUnOccupiedSpaces(testLot);
		assertEquals(1, unOccupiedSpaces.size());
		assertEquals(space.getID(), unOccupiedSpaces.get(0).getID());

		// Simulate car presence
		parkingSensorService.simulateCarArrival(space, "ABC 123");

		// Now should be occupied (not unoccupied)
		unOccupiedSpaces = parkingSpaceController.getUnOccupiedSpaces(testLot);
		assertEquals(0, unOccupiedSpaces.size());
	}

	@Test
	void testGetUnOccupiedSpacesWithNullLot() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceController.getUnOccupiedSpaces(null));
	}

	@Test
	void testGetBookedSpaces() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should not be booked
		List<ParkingSpace> bookedSpaces = parkingSpaceController.getBookedSpaces(testLot);
		assertEquals(0, bookedSpaces.size());

		// Set space as booked
		space.setStatus(ParkingSpace.ParkingSpaceStatus.BOOKED);

		// Now should be booked
		bookedSpaces = parkingSpaceController.getBookedSpaces(testLot);
		assertEquals(1, bookedSpaces.size());
		assertEquals(space.getID(), bookedSpaces.get(0).getID());
	}

	@Test
	void testGetBookedSpacesWithNullLot() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceController.getBookedSpaces(null));
	}

	@Test
	void testGetEnabledSpaces() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);
		// Initially should be enabled
		List<ParkingSpace> enabledSpaces = parkingSpaceController.getEnabledSpaces(testLot);
		assertEquals(1, enabledSpaces.size());
		assertEquals(space.getID(), enabledSpaces.get(0).getID());

		// Disable the space
		parkingSpaceService.disableParkingSpace(space);

		// Now should not be in enabled spaces
		enabledSpaces = parkingSpaceController.getEnabledSpaces(testLot);
		assertEquals(0, enabledSpaces.size());
	}

	@Test
	void testGetEnabledSpacesWithNullLot() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceController.getEnabledSpaces(null));
	}

	@Test
	void testGetDisabledSpaces() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should not be disabled
		List<ParkingSpace> disabledSpaces = parkingSpaceController.getDisabledSpaces(testLot);
		assertEquals(0, disabledSpaces.size());

		// Disable the space
		parkingSpaceService.disableParkingSpace(space);

		// Now should be in disabled spaces
		disabledSpaces = parkingSpaceController.getDisabledSpaces(testLot);
		assertEquals(1, disabledSpaces.size());
		assertEquals(space.getID(), disabledSpaces.get(0).getID());
	}

	@Test
	void testGetDisabledSpacesWithNullLot() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceController.getDisabledSpaces(null));
	}

	@Test
	void testEnableParkingSpace() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should be enabled
		assertTrue(space.isEnabled());

		// Disable the space
		parkingSpaceService.disableParkingSpace(space);
		assertFalse(space.isEnabled());

		// Enable the space
		ParkingSpace enabledSpace = parkingSpaceService.enableParkingSpace(space);
		assertTrue(enabledSpace.isEnabled());
	}

	@Test
	void testEnableParkingSpaceWhenAlreadyEnabled() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Try to enable an already enabled space
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceService.enableParkingSpace(space));
	}

	@Test
	void testEnableParkingSpaceWithNullSpace() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceService.enableParkingSpace(null));
	}

	@Test
	void testDisableParkingSpace() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should be enabled
		assertTrue(space.isEnabled());

		// Disable the space
		ParkingSpace disabledSpace = parkingSpaceService.disableParkingSpace(space);
		assertFalse(disabledSpace.isEnabled());
	}

	@Test
	void testDisableParkingSpaceWhenAlreadyDisabled() {
		// Add a parking space
		parkingSpaceService.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Disable the space
		parkingSpaceService.disableParkingSpace(space);

		// Try to disable an already disabled space
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceService.disableParkingSpace(space));
	}

	@Test
	void testDisableParkingSpaceWithNullSpace() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceService.disableParkingSpace(null));
	}
}
