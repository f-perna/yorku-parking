package manual.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.parkingLot.ParkingLot;
import repositories.ParkingLotRepository;

public class ParkingLotRepositoryTest {
	private ParkingLotRepository parkingLotRepository;
	
	@Before
	public void beforeParkingLotRepositoryTest() {
		parkingLotRepository = new ParkingLotRepository();
	}
	
	@Test
	public void testAddParkingLot() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		assertNotNull(lot);
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testGetParkingLotById() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		ParkingLot found = parkingLotRepository.getParkingLotById(lot.getID());
		assertEquals(lot, found);
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testGetParkingLotByNameCaseInsensitive() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test lot");
		assertNotNull(lot);
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testRemoveParkingLot() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		parkingLotRepository.removeParkingLot(lot.getID());
		assertNull(parkingLotRepository.getParkingLotById(lot.getID()));
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testEnableParkingLot() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		lot.setEnabled(false);
		boolean result = parkingLotRepository.enableParkingLot(lot);
		assertTrue(result);
		assertTrue(lot.isEnabled());
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testDisableParkingLot() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		boolean result = parkingLotRepository.disableParkingLot(lot);
		assertTrue(result);
		assertFalse(lot.isEnabled());
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testGetAllParkingLots() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		List<ParkingLot> lots = parkingLotRepository.getAllParkingLots();
		assertFalse(lots.isEmpty());
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testGetAllEnabledParkingLots() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		lot.setEnabled(true);
		List<ParkingLot> enabled = parkingLotRepository.getAllEnabledParkingLots();
		assertTrue(enabled.contains(lot));
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testGetAllDisabledParkingLots() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		lot.setEnabled(false);
		List<ParkingLot> disabled = parkingLotRepository.getAllDisabledParkingLots();
		assertTrue(disabled.contains(lot));
		
		parkingLotRepository.removeParkingLot(lot.getID());
	}
	
	@Test
	public void testAddDuplicateParkingLotThrowsException() {
		parkingLotRepository.addParkingLot("Test Lot");
		ParkingLot lot = parkingLotRepository.getParkingLotByName("Test Lot");
		try {
			parkingLotRepository.addParkingLot("Test Lot");
			fail("Expected Test Lot");
		} catch (ParkingSystemException e) {
			assertEquals("A parking lot with name 'Test Lot' already exists", e.getMessage());
		}
		parkingLotRepository.removeParkingLot(lot.getID());
	}
}
