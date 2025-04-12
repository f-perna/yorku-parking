package manual.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;
import repositories.ParkingSpaceRepository;

public class ParkingSpaceRepositoryTest extends BaseRepositoryTest {
	private ParkingSpaceRepository parkingSpaceRepository;
	private ParkingLot testLot;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeRepositories();
		this.testLot = super.createTestParkingLot();
	}

	private void initializeRepositories() {
		parkingSpaceRepository = repositoryFactory.getParkingSpaceRepository();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.parkingSpaceRepository = null;
		this.testLot = null;
		super.tearDown();
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
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
			parkingSpaceRepository.removeParkingSpace(null);
		});
		assertEquals("Parking Space can't be null!", exception.getMessage());
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
