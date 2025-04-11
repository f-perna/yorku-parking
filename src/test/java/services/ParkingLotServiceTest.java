package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.superManager.SuperManager;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import services.factory.ServiceFactory;

public class ParkingLotServiceTest {
	private ServiceFactory serviceFactory;
	private AuthenticationState authState;
	private SuperManager superManager;
	private Manager testManager;
	
	@Before
	public void beforeParkingLotServiceTest() {
		serviceFactory = ServiceFactory.getInstance();
		authState = AuthenticationState.getInstance();
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);
		
		testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
	}
	
	@After
	public void afterAllParkingLotServiceTest() {
		authState.setLoggedInUser(superManager);
		
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
	}
	
	@Test
	public void verifyAddParkingLot() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		List<ParkingLot> lots = serviceFactory.getParkingLotService().getAllParkingLots();
		Boolean lotAdded = false;
		ParkingLot testLot = null;
		for (ParkingLot lot: lots) {
			if (lot.getName().equals("Test Lot")) {
				lotAdded = true;
				testLot = lot;
				break;
			}
		}
		if (lotAdded != null) {
			assertTrue(lotAdded);
			serviceFactory.getParkingLotService().removeParkingLot(testLot);
		}
	}
	
	@Test
	public void verifyDuplicateParkingLot() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		try {
			serviceFactory.getParkingLotService().addParkingLot("Test Lot");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("A parking lot with name 'Test Lot' already exists", e.getMessage());
	        ParkingLot testLot = null;
	        List<ParkingLot> lots = serviceFactory.getParkingLotService().getAllParkingLots();
			for (ParkingLot lot: lots) {
				if (lot.getName().equals("Test Lot")) {
					testLot = lot;
					break;
				}
			}
			serviceFactory.getParkingLotService().removeParkingLot(testLot);
	    }
	}
	
	@Test
	public void verifyAddParkingLotWithoutManagerLogin() {
	    authState.setLoggedInUser(null);
	    try {
	    	serviceFactory.getParkingLotService().addParkingLot("NoAuthLot");
	    	fail("Expected ParkingSystemException");
		} catch (Exception e) {
			assertEquals("Manager must be logged in to add parking lots", e.getMessage());
		}
	}
	
	@Test
	public void verifyEnableParkingLotSuccessfully() {
	    serviceFactory.getParkingLotService().addParkingLot("Test Lot");
	    List<ParkingLot> lots = serviceFactory.getParkingLotService().getAllParkingLots();
	    ParkingLot testLot = null;
		for (ParkingLot lot: lots) {
			if (lot.getName().equals("Test Lot")) {
				testLot = lot;
				break;
			}
		}

	    boolean result = serviceFactory.getParkingLotService().enableParkingLot(testLot);
	    assertTrue(result);
	    serviceFactory.getParkingLotService().removeParkingLot(testLot);
	}
	
	@Test
	public void verifyDisableParkingLotSuccessfully() {
	    serviceFactory.getParkingLotService().addParkingLot("Test Lot");
	    List<ParkingLot> lots = serviceFactory.getParkingLotService().getAllParkingLots();
	    ParkingLot testLot = null;
		for (ParkingLot lot: lots) {
			if (lot.getName().equals("Test Lot")) {
				testLot = lot;
				break;
			}
		}

	    boolean result = serviceFactory.getParkingLotService().disableParkingLot(testLot);
	    assertTrue(result);
	    serviceFactory.getParkingLotService().removeParkingLot(testLot);
	}

	@Test
	public void verifyEnableParkingLotWithoutManagerLogin() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		List<ParkingLot> lots = serviceFactory.getParkingLotService().getAllParkingLots();
	    ParkingLot testLot = null;
		for (ParkingLot lot: lots) {
			if (lot.getName().equals("Test Lot")) {
				testLot = lot;
				break;
			}
		}
		authState.setLoggedInUser(null);
	    try {
	    	serviceFactory.getParkingLotService().enableParkingLot(testLot);
	    	fail("Expected ParkingSystemException");
		} catch (Exception e) {
			assertEquals("Manager must be logged in to add parking lots", e.getMessage());
		}
	    authState.setLoggedInUser(testManager);
	    serviceFactory.getParkingLotService().removeParkingLot(testLot);
	}
	
	@Test
	public void verifyDisableParkingLotWithoutManagerLogin() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		List<ParkingLot> lots = serviceFactory.getParkingLotService().getAllParkingLots();
	    ParkingLot testLot = null;
		for (ParkingLot lot: lots) {
			if (lot.getName().equals("Test Lot")) {
				testLot = lot;
				break;
			}
		}
		authState.setLoggedInUser(null);
	    try {
	    	serviceFactory.getParkingLotService().disableParkingLot(testLot);
	    	fail("Expected ParkingSystemException");
		} catch (Exception e) {
			assertEquals("Manager must be logged in to add parking lots", e.getMessage());
		}
	    authState.setLoggedInUser(testManager);
	    serviceFactory.getParkingLotService().removeParkingLot(testLot);
	}
	
	@Test
	public void verifyRemoveNullLot() {
		try {
			serviceFactory.getParkingLotService().removeParkingLot(null);
	    	fail("Expected ParkingSystemException");
		} catch (Exception e) {
			assertEquals("Parking lot cannot be null", e.getMessage());
		}
	}
	
	@Test
	public void verifyRmoveParkingLot() {
		int sizeBefore = serviceFactory.getParkingLotService().getAllParkingLots().size();
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		List<ParkingLot> lots = serviceFactory.getParkingLotService().getAllParkingLots();
		Boolean lotAdded = false;
		ParkingLot testLot = null;
		for (ParkingLot lot: lots) {
			if (lot.getName().equals("Test Lot")) {
				lotAdded = true;
				testLot = lot;
				break;
			}
		}
		if (lotAdded != null) {
			assertTrue(lotAdded);
			serviceFactory.getParkingLotService().removeParkingLot(testLot);
			assertEquals(sizeBefore, lots.size() - 1);
		}
	}
	
	@Test
	public void VerifyGetAllParkingLotsReturnsCorrectCount() {
	    int sizeBefore = serviceFactory.getParkingLotService().getAllParkingLots().size();
	    serviceFactory.getParkingLotService().addParkingLot("Test Lot A");
	    serviceFactory.getParkingLotService().addParkingLot("Test Lot B");

	    List<ParkingLot> updatedLots = serviceFactory.getParkingLotService().getAllParkingLots();
	    assertEquals(sizeBefore + 2, updatedLots.size());

	    ParkingLot testLotA = null;
	    ParkingLot testLotB = null;
		for (ParkingLot lot: updatedLots) {
			if (lot.getName().equals("Test Lot A")) {
				testLotA = lot;
			}
			if (lot.getName().equals("Test Lot B")) {
				testLotB = lot;
			}
		}
	    serviceFactory.getParkingLotService().removeParkingLot(testLotA);
	    serviceFactory.getParkingLotService().removeParkingLot(testLotB);
	}

}
