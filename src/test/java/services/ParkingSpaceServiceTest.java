package services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.ParkingSystemException;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;

public class ParkingSpaceServiceTest extends BaseServiceTest {
	private ParkingLot testLot;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		super.createAndLogInAsTestManager();
		createTestLot();
	}

	private void createTestLot() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		testLot = serviceFactory.getParkingLotService().getParkingLotByName("Test Lot");
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
	}

	private ParkingSpace findParkingSpaceByName(String name) {
		return serviceFactory.getParkingSpaceService().getAllSpaces().stream()
				.filter(space -> space.getName().equals(name)).findFirst().orElse(null);
	}

	@Test
	public void verifyAddParkingSpace() {
		System.out.println(authState.getLoggedInUser().getEmail());
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		ParkingSpace testSpace = findParkingSpaceByName("Test Space");
		assertTrue(testSpace != null);
	}

	@Test
	public void verifyAddParkingSpaceWithoutManagerLogin() {
		authState.setLoggedInUser(null);
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space"));
		assertEquals("Only managers can add parking spaces", exception.getMessage());
	}

	@Test
	public void verifyAddDuplicateParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space"));
		assertEquals("A parking space with name 'Test Space' already exists in lot 'Test Lot'", exception.getMessage());

	}

	@Test
	public void verifyAddParkingSpaceWithNullLot() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().addParkingSpace(null, "InvalidSpace"));
		assertEquals("Space cannot be null", exception.getMessage());
	}

	@Test
	public void verifyAddParkingSpaceWithEmptyName() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().addParkingSpace(testLot, ""));
		assertEquals("Space name cannot be empty", exception.getMessage());
	}

	@Test
	public void verifyEnableParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		ParkingSpace testSpace = findParkingSpaceByName("Test Space");

		if (!testSpace.isEnabled()) {
			serviceFactory.getParkingSpaceService().enableParkingSpace(testSpace);
			ParkingSpace updated = serviceFactory.getParkingSpaceService().getParkingSpaceById(testSpace.getID());
			assertTrue(updated.isEnabled());
		}
	}

	@Test
	public void verifyDisableParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		ParkingSpace testSpace = findParkingSpaceByName("Test Space");

		serviceFactory.getParkingSpaceService().disableParkingSpace(testSpace);
		ParkingSpace updated = serviceFactory.getParkingSpaceService().getParkingSpaceById(testSpace.getID());
		assertTrue(!updated.isEnabled());
	}

	@Test
	public void verifyRemoveNullParkingSpace() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().removeParkingSpace(null));
		assertEquals("Parking space cannot be null", exception.getMessage());
	}

	@Test
	public void verifyGetParkingSpaceByInvalidId() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().getParkingSpaceById(null));
		assertEquals("Space ID cannot be null", exception.getMessage());
	}

	@Test
	public void verifyGetParkingSpaceByIdNotFound() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getParkingSpaceService().getParkingSpaceById(UUID.randomUUID()));
		assertEquals("Parking space not found", exception.getMessage());
	}
}
