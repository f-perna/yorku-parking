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

public class ParkingLotServiceTest {
	private ParkingLotRepository parkingLotRepository;
	private ParkingLotService parkingLotService;
	private AuthenticationState authState;
	private ManagerRepository managerRepository;
	private ManagerService managerService;
	private SuperManager superManager;
	private Manager testManager;
	
	@Before
	public void beforeParkingLotServiceTest() {
		managerRepository = new ManagerRepository();
		managerService = new ManagerService(managerRepository);
		parkingLotRepository = new ParkingLotRepository();
		parkingLotService = new ParkingLotService(parkingLotRepository);
		authState = AuthenticationState.getInstance();
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);
		
		testManager = managerService.generateAndGetManagerAccount();
		managerService.login(testManager.getEmail(), testManager.getPassword());
	}
	
	@After
	public void afterAllParkingLotServiceTest() {
		authState.setLoggedInUser(superManager);
		
		managerService.removeManager(testManager.getEmail());
	}
	
	@Test
	public void verifyAddParkingLot() {
		parkingLotService.addParkingLot("Test Lot");
		List<ParkingLot> lots = parkingLotService.getAllParkingLots();
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
			parkingLotRepository.removeParkingLot(testLot.getID());
		}
	}
	
	@Test
	public void verifyDuplicateParkingLot() {
		parkingLotService.addParkingLot("Test Lot");
		try {
			parkingLotService.addParkingLot("Test Lot");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("A parking lot with name 'Test Lot' already exists", e.getMessage());
	        ParkingLot testLot = null;
	        List<ParkingLot> lots = parkingLotService.getAllParkingLots();
			for (ParkingLot lot: lots) {
				if (lot.getName().equals("Test Lot")) {
					testLot = lot;
					break;
				}
			}
			parkingLotRepository.removeParkingLot(testLot.getID());
	    }
	}
}
