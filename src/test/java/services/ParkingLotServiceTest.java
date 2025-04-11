package services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.ParkingSystemException;
import models.parkingLot.ParkingLot;

public class ParkingLotServiceTest extends BaseServiceTest {

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		super.loginAsSuperManager();
		super.createAndLogInAsTestManager();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
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
