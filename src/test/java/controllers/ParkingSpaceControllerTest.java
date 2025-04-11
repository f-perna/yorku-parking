package controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.user.UserType;

public class ParkingSpaceControllerTest extends BaseControllerTest {
	private ParkingSpaceController parkingSpaceController;
	private AuthController authController;
	private SuperManagerController superManagerController;
	private ManagerController managerController;
	private Manager testManager;
	private ParkingLot testLot;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeControllers();
		createTestManager();
		createTestParkingLot();
	}

	private void initializeControllers() {
		parkingSpaceController = controllerFactory.getParkingSpaceController();
		authController = controllerFactory.getAuthController();
		superManagerController = controllerFactory.getSuperManagerController();
		managerController = controllerFactory.getManagerController();
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

	private void createTestParkingLot() {
		managerController.addParkingLot("Test Lot");
		testLot = controllerFactory.getParkingLotController().getParkingLotByName("Test Lot");
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.ensureLoggedOut();
		super.tearDown();
	}

	@Test
	void testGetAvailableSpaces() {
		// Add some parking spaces
		managerController.addParkingSpace(testLot, "Space 1");
		managerController.addParkingSpace(testLot, "Space 2");

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
		managerController.addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> spaces = parkingSpaceController.getParkingSpacesForLot(testLot.getID());
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
		managerController.addParkingSpace(testLot, "Space 1");
		managerController.addParkingSpace(testLot, "Space 2");

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
		managerController.addParkingSpace(testLot, "Space 1");
		managerController.addParkingSpace(testLot, "Space 2");

		// Get all spaces
		List<ParkingSpace> allSpaces = parkingSpaceController.getAllSpaces();

		// Verify results
		assertEquals(2, allSpaces.size());
	}

	@Test
	void testGetOccupiedSpaces() {
		// Add a parking space
		managerController.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceController.getParkingSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should be unoccupied
		List<ParkingSpace> occupiedSpaces = parkingSpaceController.getOccupiedSpaces(testLot);
		assertEquals(0, occupiedSpaces.size());

		// Simulate car presence
		controllerFactory.getParkingSensorController().simulateCarArrival(space, "ABC123");

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
		managerController.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceController.getParkingSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should be unoccupied
		List<ParkingSpace> unOccupiedSpaces = parkingSpaceController.getUnOccupiedSpaces(testLot);
		assertEquals(1, unOccupiedSpaces.size());
		assertEquals(space.getID(), unOccupiedSpaces.get(0).getID());

		// Simulate car presence
		controllerFactory.getParkingSensorController().simulateCarArrival(space, "ABC 123");

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
		managerController.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceController.getParkingSpacesForLot(testLot.getID());
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
		managerController.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceController.getParkingSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should be enabled
		List<ParkingSpace> enabledSpaces = parkingSpaceController.getEnabledSpaces(testLot);
		assertEquals(1, enabledSpaces.size());
		assertEquals(space.getID(), enabledSpaces.get(0).getID());

		// Disable the space
		managerController.disableParkingSpace(space);

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
		managerController.addParkingSpace(testLot, "Space 1");
		List<ParkingSpace> spaces = parkingSpaceController.getParkingSpacesForLot(testLot.getID());
		ParkingSpace space = spaces.get(0);

		// Initially should not be disabled
		List<ParkingSpace> disabledSpaces = parkingSpaceController.getDisabledSpaces(testLot);
		assertEquals(0, disabledSpaces.size());

		// Disable the space
		managerController.disableParkingSpace(space);

		// Now should be in disabled spaces
		disabledSpaces = parkingSpaceController.getDisabledSpaces(testLot);
		assertEquals(1, disabledSpaces.size());
		assertEquals(space.getID(), disabledSpaces.get(0).getID());
	}

	@Test
	void testGetDisabledSpacesWithNullLot() {
		assertThrows(models.ParkingSystemException.class, () -> parkingSpaceController.getDisabledSpaces(null));
	}
}
