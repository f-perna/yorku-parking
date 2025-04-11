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

import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import services.ManagerService;
import services.ParkingLotService;
import services.SuperManagerService;

public class ParkingLotControllerTest {
	private AuthController authController;
	private SuperManagerController superManagerController;
	private ParkingLotController parkingLotController;

	private ParkingLotService parkingLotService;
	private ManagerService managerService;
	private SuperManagerService superManagerService;

	private String testParkingLotsFilePath;
	private String testClientsFilePath;
	private String testManagersFilePath;

	@TempDir
	File tempDir;

	@BeforeEach
	void setUp() throws IOException {
		// Initialize test CSV files
		testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";

		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);

		// Initialize repositories
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
		ManagerRepository managerRepository = new ManagerRepository();

		// Initialize services with repositories
		parkingLotService = new ParkingLotService(parkingLotRepository);
		managerService = new ManagerService(managerRepository);
		superManagerService = new SuperManagerService();

		// Create manager controller
		superManagerController = new SuperManagerController(managerService);

		parkingLotController = new ParkingLotController(parkingLotService);

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
	}

	@AfterEach
	void tearDown() {
		ParkingLotCSVProcessor.cleanupAndReset(testParkingLotsFilePath);
		ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
		ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);

		if (authController.isLoggedIn()) {
			authController.logout();
		}
	}

	@Test
	void testGetAllParkingLots_EmptyList() {
		List<ParkingLot> lots = parkingLotController.getAllParkingLots();
		assertNotNull(lots);
		assertTrue(lots.isEmpty());
	}

	@Test
	void testGetAllParkingLots_SingleLot() {
		parkingLotService.addParkingLot("Test Lot");

		List<ParkingLot> lots = parkingLotController.getAllParkingLots();
		assertNotNull(lots);
		assertEquals(1, lots.size());
		assertEquals("Test Lot", lots.get(0).getName());
	}

	@Test
	void testGetAllParkingLots_MultipleLots() {
		parkingLotService.addParkingLot("Lot 1");
		parkingLotService.addParkingLot("Lot 2");
		parkingLotService.addParkingLot("Lot 3");

		List<ParkingLot> lots = parkingLotController.getAllParkingLots();
		assertNotNull(lots);
		assertEquals(3, lots.size());
	}

	@Test
	void testGetAllEnabledAndDisabledParkingLots_AfterStatusChange() {
		parkingLotService.addParkingLot("Test Lot");
		List<ParkingLot> allLots = parkingLotController.getAllParkingLots();
		ParkingLot testLot = allLots.get(0);

		List<ParkingLot> enabledLots = parkingLotController.getAllEnabledParkingLots();
		assertEquals(1, enabledLots.size());
		assertTrue(enabledLots.contains(testLot));

		parkingLotService.disableParkingLot(testLot);

		List<ParkingLot> disabledLots = parkingLotController.getAllDisabledParkingLots();
		assertEquals(1, disabledLots.size());
		assertTrue(disabledLots.contains(testLot));
		enabledLots = parkingLotController.getAllEnabledParkingLots();
		assertTrue(enabledLots.isEmpty());
	}

	@Test
	void testGetParkingLotByName_ExistingLot() {
		parkingLotService.addParkingLot("Test Lot");

		ParkingLot foundLot = parkingLotController.getParkingLotByName("Test Lot");
		assertNotNull(foundLot);
		assertEquals("Test Lot", foundLot.getName());
	}

	@Test
	void testGetParkingLotByName_NonExistentLot() {
		ParkingLot foundLot = parkingLotController.getParkingLotByName("Non Existent Lot");
		assertNull(foundLot);
	}

	@Test
	void testGetParkingLotByName_CaseInsensitive() {
		parkingLotService.addParkingLot("Test Lot");

		ParkingLot foundLot = parkingLotController.getParkingLotByName("test lot");
		assertNotNull(foundLot);
		assertEquals("Test Lot", foundLot.getName());
	}

	@Test
	void testGetParkingLotById_ExistingLot() {
		parkingLotService.addParkingLot("Test Lot");
		List<ParkingLot> allLots = parkingLotController.getAllParkingLots();
		ParkingLot testLot = allLots.get(0);

		ParkingLot foundLot = parkingLotController.getParkingLotById(testLot.getID());
		assertNotNull(foundLot);
		assertEquals(testLot.getID(), foundLot.getID());
		assertEquals("Test Lot", foundLot.getName());
	}

	@Test
	void testGetParkingLotById_NonExistentLot() {
		ParkingLot foundLot = parkingLotController.getParkingLotById(UUID.randomUUID());
		assertNull(foundLot);
	}

	@Test
	void testGetTotalParkingLotsCount() {
		assertEquals(0, parkingLotController.getTotalParkingLotsCount());

		parkingLotService.addParkingLot("Lot 1");
		parkingLotService.addParkingLot("Lot 2");
		parkingLotService.addParkingLot("Lot 3");

		assertEquals(3, parkingLotController.getTotalParkingLotsCount());
	}

	@Test
	void testGetEnabledAndDisabledParkingLotsCount() {
		parkingLotService.addParkingLot("Enabled Lot 1");
		parkingLotService.addParkingLot("Enabled Lot 2");
		parkingLotService.addParkingLot("Disabled Lot");

		List<ParkingLot> allLots = parkingLotController.getAllParkingLots();
		ParkingLot lotToDisable = allLots.stream()
				.filter(lot -> lot.getName().equals("Disabled Lot"))
				.findFirst()
				.orElse(null);
		assertNotNull(lotToDisable);
		parkingLotService.disableParkingLot(lotToDisable);

		assertEquals(3, parkingLotController.getTotalParkingLotsCount());
		assertEquals(2, parkingLotController.getEnabledParkingLotsCount());
		assertEquals(1, parkingLotController.getDisabledParkingLotsCount());
	}
}
