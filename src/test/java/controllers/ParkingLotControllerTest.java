package controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.user.UserType;

public class ParkingLotControllerTest extends BaseControllerTest {
	private ParkingLotController parkingLotController;
	private AuthController authController;
	private SuperManagerController superManagerController;
	private ManagerController managerController;
	private Manager testManager;

	

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeControllers();
		createTestManager();
	}

	private void initializeControllers() {
		parkingLotController = controllerFactory.getParkingLotController();
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

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.ensureLoggedOut();
		super.tearDown();
	}
	
	@Test
	void testGetAllParkingLots() {
		managerController.addParkingLot("Test Lot");

		List<ParkingLot> lots = parkingLotController.getAllParkingLots();

		assertNotNull(lots);
		assertTrue(lots.size() > 0);
		assertEquals("Test Lot", lots.get(0).getName());
	}

	@Test
	void testGetParkingLotByName() {
		managerController.addParkingLot("Test Lot");

		ParkingLot lot = parkingLotController.getParkingLotByName("Test Lot");
		assertNotNull(lot);
		assertEquals("Test Lot", lot.getName());
	}

	@Test
	void testGetParkingLotByNameNotFound() {
		ParkingLot lot = parkingLotController.getParkingLotByName("NonExistentLot");
		assertNull(lot);
	}

	@Test
	void testGetParkingLotById() {
		managerController.addParkingLot("Test Lot");
		ParkingLot expectedLot = parkingLotController.getParkingLotByName("Test Lot");

		ParkingLot lot = parkingLotController.getParkingLotById(expectedLot.getID());
		assertNotNull(lot);
		assertEquals(expectedLot.getID(), lot.getID());
		assertEquals("Test Lot", lot.getName());
	}

	@Test
	void testGetParkingLotByIdNotFound() {
		ParkingLot lot = parkingLotController.getParkingLotById(UUID.randomUUID());
		assertNull(lot);
	}

	@Test
	void testGetTotalParkingLotsCount() {
		assertEquals(0, parkingLotController.getTotalParkingLotsCount());

		managerController.addParkingLot("Test Lot");
		assertEquals(1, parkingLotController.getTotalParkingLotsCount());
	}

	@Test
	void testGetEnabledAndDisabledParkingLotsCount() {
		managerController.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotController.getParkingLotByName("Test Lot");

		assertEquals(1, parkingLotController.getEnabledParkingLotsCount());
		assertEquals(0, parkingLotController.getDisabledParkingLotsCount());

		managerController.disableParkingLot(lot);
		assertEquals(0, parkingLotController.getEnabledParkingLotsCount());
		assertEquals(1, parkingLotController.getDisabledParkingLotsCount());
	}
}
