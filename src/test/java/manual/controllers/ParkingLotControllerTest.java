package manual.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.ManagerController;
import controllers.ParkingLotController;
import models.parkingLot.ParkingLot;

public class ParkingLotControllerTest extends BaseControllerTest {
	private ParkingLotController parkingLotController;
	private ManagerController managerController;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeControllers();
		super.createAndLogInAsTestManager();
	}

	private void initializeControllers() {
		parkingLotController = controllerFactory.getParkingLotController();
		managerController = controllerFactory.getManagerController();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.parkingLotController = null;
		this.managerController = null;
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
