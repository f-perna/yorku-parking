package manual.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.ClientController;
import controllers.ManagerController;
import models.ParkingSystemException;
import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;

public class ManagerControllerTest extends BaseControllerTest {
	private ManagerController managerController;
	private ClientController clientController;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeControllers();
		super.createAndLogInAsTestManager();
	}

	private void initializeControllers() {
		managerController = controllerFactory.getManagerController();
		clientController = controllerFactory.getClientController();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.managerController = null;
		this.clientController = null;
		super.tearDown();
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
		clientController.registerClient("Test Client", "test@example.com", "Password@123", Client.type.STUDENT,
				"ABC123");

		List<Client> clients = managerController.getAllClients();
		assertNotNull(clients);
		assertTrue(clients.size() > 0);
	}

	@Test
	void testApproveDenyClient() {
		String clientEmail = "test@example.com";
		clientController.registerClient("Test Client", clientEmail, "Password@123", Client.type.STUDENT, "ABC123");

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