package controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import models.ParkingSystemException;
import models.client.Client;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;
import services.ClientService;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSpaceService;
import services.SuperManagerService;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;

public class ManagerControllerTest {
	private ManagerController managerController;
	private AuthController authController;
	private SuperManagerController superManagerController;

	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private ClientService clientService;
	private ManagerService managerService;
	private SuperManagerService superManagerService;

	private String testParkingLotsFilePath;
	private String testParkingSpacesFilePath;
	private String testParkingSensorsFilePath;
	private String testClientsFilePath;
	private String testManagersFilePath;

	//// TEST PARKING SENSORS TOO
	
	
	@TempDir
	File tempDir;

	@BeforeEach
	void setUp() throws IOException {
		// Initialize test CSV files
		testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
		testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
		testParkingSensorsFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";

		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorsFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);

		// Initialize repositories
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
		ParkingSpaceRepository parkingSpaceRepository = new ParkingSpaceRepository();
		ParkingSensorRepository parkingSensorRepository = new ParkingSensorRepository();
		ClientRepository clientRepository = new ClientRepository();
		ManagerRepository managerRepository = new ManagerRepository();

		// Initialize services with repositories
		parkingLotService = new ParkingLotService(parkingLotRepository);
		parkingSpaceService = new ParkingSpaceService(parkingSpaceRepository, parkingSensorRepository);
		clientService = new ClientService(clientRepository);
		managerService = new ManagerService(managerRepository);
		superManagerService = new SuperManagerService();

		// Create manager controller
		managerController = new ManagerController(parkingLotService, parkingSpaceService, clientService);
		superManagerController = new SuperManagerController(managerService);

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
		ParkingSpaceCSVProcessor.cleanupAndReset(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.cleanupAndReset(testParkingSensorsFilePath);
		ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
		ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);

		if (authController.isLoggedIn()) {
			authController.logout();
		}
	}

	@Test
	void testGetAllParkingLots() {
		managerController.addParkingLot("Test Lot");

		List<ParkingLot> lots = managerController.getAllParkingLots();

		assertNotNull(lots);
		assertTrue(lots.size() > 0);
		assertEquals("Test Lot", lots.get(0).getName());
	}

	@Test
	void testAddParkingLot() {
		String lotName = "New Parking Lot";
		managerController.addParkingLot(lotName);

		List<ParkingLot> lots = managerController.getAllParkingLots();
		assertTrue(lots.stream().anyMatch(lot -> lot.getName().equals(lotName)));
	}

	@Test
	void testAddParkingSpace() {
		String lotName = "Test Lot";
		managerController.addParkingLot(lotName);
		ParkingLot lot = managerController.getAllParkingLots().get(0);

		String spaceName = "Space 1";
		managerController.addParkingSpace(lot, spaceName);

		List<ParkingSpace> spaces = managerController.getParkingSpacesForLot(lot.getID());
		assertTrue(spaces.stream().anyMatch(space -> space.getName().equals(spaceName)));
	}

	@Test
	void testEnableDisableParkingLot() {
		managerController.addParkingLot("Test Lot");
		ParkingLot lot = managerController.getAllParkingLots().get(0);

		boolean enableResult = managerController.enableParkingLot(lot);
		assertTrue(enableResult);
		assertTrue(lot.isEnabled());

		boolean disableResult = managerController.disableParkingLot(lot);
		assertTrue(disableResult);
		assertTrue(!lot.isEnabled());
	}

	@Test
	void testEnableDisableParkingSpace() {
		managerController.addParkingLot("Test Lot");
		ParkingLot lot = managerController.getAllParkingLots().get(0);
		managerController.addParkingSpace(lot, "Space 1");
		ParkingSpace space = managerController.getParkingSpacesForLot(lot.getID()).get(0);

		ParkingSpace disabledSpace = managerController.disableParkingSpace(space);
		assertNotNull(disabledSpace);
		assertTrue(!disabledSpace.isEnabled());

		ParkingSpace enabledSpace = managerController.enableParkingSpace(space);
		assertNotNull(enabledSpace);
		assertTrue(enabledSpace.isEnabled());

	}

	@Test
	void testGetAllClients() {
		clientService.registerClient("Test Client", "test@example.com", "Password@123", Client.type.STUDENT, "ABC123");

		List<Client> clients = managerController.getAllClients();
		assertNotNull(clients);
		assertTrue(clients.size() > 0);
	}

	@Test
	void testApproveDenyClient() {
		String clientEmail = "test@example.com";
		clientService.registerClient("Test Client", clientEmail, "Password@123", Client.type.STUDENT, "ABC123");

		// Approve the client
		boolean approveResult = managerController.approveClient(clientEmail);
		assertTrue(approveResult);

		// Deny the client
		boolean denyResult = managerController.denyClient(clientEmail);
		assertTrue(denyResult);
	}

	@Test
	void testGetParkingSpacesForLot() {
		managerController.addParkingLot("Test Lot");
		ParkingLot lot = managerController.getAllParkingLots().get(0);

		managerController.addParkingSpace(lot, "Space 1");
		managerController.addParkingSpace(lot, "Space 2");

		List<ParkingSpace> spaces = managerController.getParkingSpacesForLot(lot.getID());
		assertNotNull(spaces);
		assertEquals(2, spaces.size());
	}

	@Test
	void testAddParkingSpaceWithNullLot() {
		assertThrows(ParkingSystemException.class, () -> {
			managerController.addParkingSpace(null, "Space 1");
		});
	}

	@Test
	void testAddParkingSpaceWithNullName() {
		managerController.addParkingLot("Test Lot");
		ParkingLot lot = managerController.getAllParkingLots().get(0);

		assertThrows(ParkingSystemException.class, () -> {
			managerController.addParkingSpace(lot, null);
		});
	}

	@Test
	void testAddParkingLotWithDuplicateName() {
		String lotName = "Duplicate Lot";
		managerController.addParkingLot(lotName);

		assertThrows(ParkingSystemException.class, () -> {
			managerController.addParkingLot(lotName);
		});
	}

	@Test
	void testAddParkingSpaceWithDuplicateName() {
		String lotName = "Test Lot";
		managerController.addParkingLot(lotName);
		ParkingLot lot = managerController.getAllParkingLots().get(0);

		String spaceName = "Duplicate Space";
		managerController.addParkingSpace(lot, spaceName);

		assertThrows(ParkingSystemException.class, () -> {
			managerController.addParkingSpace(lot, spaceName);
		});
	}
}