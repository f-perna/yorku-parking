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
}
