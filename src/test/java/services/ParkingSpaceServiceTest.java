package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.UUID;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.superManager.SuperManager;
import services.factory.ServiceFactory;

public class ParkingSpaceServiceTest {

	private AuthenticationState authState;
	private SuperManager superManager;
	private ServiceFactory serviceFactory;
	private ParkingLot testLot = null;
	private Manager testManager;
	
	
	@Before
	public void beforeParkingLotServiceTest() {
		serviceFactory = ServiceFactory.getInstance();
		authState = AuthenticationState.getInstance();
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);
		
		
		testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
		
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		List<ParkingLot> lots = serviceFactory.getParkingLotService().getAllParkingLots();
		for (ParkingLot lot: lots) {
			if (lot.getName().equals("Test Lot")) {
				testLot = lot;
				break;
			}
		}
	}
	
	@After
	public void afterParkingLotServiceTest() {
		authState.setLoggedInUser(testManager);
		serviceFactory.getParkingLotService().removeParkingLot(testLot);
		authState.setLoggedInUser(superManager);
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
	}
	
	@Test
	public void verifyAddParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		
		List<ParkingSpace> spaces = serviceFactory.getParkingSpaceService().getAllSpaces();
		
		Boolean spaceAdded = false;
		ParkingSpace testSpace = null;
		for (ParkingSpace space: spaces) {
			if (space.getName().equals("Test Space")) {
				spaceAdded = true;
				testSpace = space;
				break;
			}
		}
		assertTrue(spaceAdded);
		
		serviceFactory.getParkingSensorService().removeSensor(testSpace);
		serviceFactory.getParkingSpaceService().removeParkingSpace(testSpace);
	}
	
	@Test
	public void verifyAddParkingSpaceWithoutManagerLogin() {
		authState.setLoggedInUser(null);
		try {
			serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Only managers can add parking spaces", e.getMessage());
		}
	}
	
	@Test
	public void VerifyAddDuplicateParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		try {
			serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("A parking space with name 'Test Space' already exists in lot 'Test Lot'", e.getMessage());
		}
		
		List<ParkingSpace> spaces = serviceFactory.getParkingSpaceService().getAllSpaces();
		ParkingSpace testSpace = null;
		for (ParkingSpace space: spaces) {
			if (space.getName().equals("Test Space")) {
				testSpace = space;
				break;
			}
		}
		serviceFactory.getParkingSensorService().removeSensor(testSpace);
		serviceFactory.getParkingSpaceService().removeParkingSpace(testSpace);
	}
	
	@Test
	public void verifyAddParkingSpaceWithNullLot() {
		try {
			serviceFactory.getParkingSpaceService().addParkingSpace(null, "InvalidSpace");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Space cannot be null", e.getMessage());
		}
	}

	@Test
	public void verifyAddParkingSpaceWithEmptyName() {
		try {
			serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Space name cannot be empty", e.getMessage());
		}
	}

	@Test
	public void verifyEnableParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> spaces = serviceFactory.getParkingSpaceService().getAllSpaces();
		ParkingSpace testSpace = null;
		for (ParkingSpace space: spaces) {
			if (space.getName().equals("Test Space")) {
				testSpace = space;
				break;
			}
		}

		if (!testSpace.isEnabled()) {
			serviceFactory.getParkingSpaceService().enableParkingSpace(testSpace);
			ParkingSpace updated = serviceFactory.getParkingSpaceService().getParkingSpaceById(testSpace.getID());
			assertTrue(updated.isEnabled());
		}

		serviceFactory.getParkingSensorService().removeSensor(testSpace);
		serviceFactory.getParkingSpaceService().removeParkingSpace(testSpace);
	}
	
	@Test
	public void verifyDisableParkingSpace() {
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> spaces = serviceFactory.getParkingSpaceService().getAllSpaces();
		ParkingSpace testSpace = null;
		for (ParkingSpace space: spaces) {
			if (space.getName().equals("Test Space")) {
				testSpace = space;
				break;
			}
		}

		serviceFactory.getParkingSpaceService().disableParkingSpace(testSpace);
		ParkingSpace updated = serviceFactory.getParkingSpaceService().getParkingSpaceById(testSpace.getID());
		assertTrue(!updated.isEnabled());

		serviceFactory.getParkingSensorService().removeSensor(testSpace);
		serviceFactory.getParkingSpaceService().removeParkingSpace(testSpace);
	}
	
	@Test
	public void verifyRemoveNullParkingSpace() {
		try {
			serviceFactory.getParkingSpaceService().removeParkingSpace(null);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Parking space canot be null", e.getMessage());
		}
	}

	@Test
	public void getParkingSpaceByInvalidId() {
		try {
			serviceFactory.getParkingSpaceService().getParkingSpaceById(null);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Space ID cannot be null", e.getMessage());
		}
	}

	@Test
	public void verifyGetParkingSpaceByIdNotFound() {
		try {
			serviceFactory.getParkingSpaceService().getParkingSpaceById(UUID.randomUUID());
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Parking space not found", e.getMessage());
		}
	}

}
