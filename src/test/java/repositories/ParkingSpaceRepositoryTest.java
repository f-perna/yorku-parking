package repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;

public class ParkingSpaceRepositoryTest {
	private ParkingSpaceRepository parkingSpaceRepository;
	private ParkingLot testLot;
	
	@Before
	public void beforeParkingSpaceRepository() {
		parkingSpaceRepository = new ParkingSpaceRepository();
		testLot = new ParkingLot("Test Lot");
	}
	
	@Test
	public void testAddParkingSpace() {
		ParkingSpace testSpace = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		assertNotNull(testSpace);
		assertEquals("Test Space", testSpace.getName());
		
		parkingSpaceRepository.removeParkingSpace(testSpace);
	}
	
	@Test
	public void testGetParkingSpaceById() {
		ParkingSpace testSpace = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		ParkingSpace fetched = parkingSpaceRepository.getParkingSpaceById(testSpace.getID());
		assertEquals(testSpace, fetched);
		
		parkingSpaceRepository.removeParkingSpace(testSpace);
	}
	
	@Test
	public void testUpdateParkingSpaceStatus() {
		ParkingSpace testSpace = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		parkingSpaceRepository.updateParkingSpaceStatus(testSpace, ParkingSpaceStatus.BOOKED);
		assertEquals(ParkingSpaceStatus.BOOKED, testSpace.getStatus());
		
		parkingSpaceRepository.removeParkingSpace(testSpace);
	}
	
	@Test
	public void testRemoveParkingSpace() {
		ParkingSpace testSpace = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		parkingSpaceRepository.removeParkingSpace(testSpace);
		assertNull(parkingSpaceRepository.getParkingSpaceById(testSpace.getID()));
	}
	
	@Test
	public void testRemoveParkingSpaceNullThrowsException() {
		try {
			parkingSpaceRepository.removeParkingSpace(null);
			fail("Expected IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			assertEquals("Parking Space can't be null!", e.getMessage());
		}
	}
	
	@Test
	public void testGetAvailableSpaces() {
		ParkingSpace available = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> result = parkingSpaceRepository.getAvailableSpaces(testLot);
		assertTrue(result.contains(available));
	}
	
	@Test
	public void testGetBookedSpaces() {
		ParkingSpace booked = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		parkingSpaceRepository.updateParkingSpaceStatus(booked, ParkingSpaceStatus.BOOKED);
		List<ParkingSpace> result = parkingSpaceRepository.getBookedSpaces(testLot);
		assertTrue(result.contains(booked));
	}
	
	@Test
	public void testGetEnabledSpaces() {
		ParkingSpace space = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		space.setEnabled(true);
		List<ParkingSpace> enabled = parkingSpaceRepository.getEnabledSpaces(testLot);
		assertTrue(enabled.contains(space));
	}

	@Test
	public void testGetDisabledSpaces() {
		ParkingSpace space = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		space.setEnabled(false);
		List<ParkingSpace> disabled = parkingSpaceRepository.getDisabledSpaces(testLot);
		assertTrue(disabled.contains(space));
	}

	@Test
	public void testGetSpacesForLot() {
		ParkingSpace space = parkingSpaceRepository.addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> lotSpaces = parkingSpaceRepository.getSpacesForLot(testLot.getID());
		assertTrue(lotSpaces.contains(space));
	}
}
