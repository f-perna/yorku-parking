package services;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.auth.AuthenticationState;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSensor.ParkingSensor;
import models.parkingSpace.ParkingSpace;
import models.superManager.SuperManager;
import repositories.BookingRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;
import services.factory.ServiceFactory;

public class ParkingSensorServiceTest {
	private AuthenticationState authState;
	private SuperManager superManager;
	private ServiceFactory serviceFactory;
	private ParkingLot testLot = null;
	private ParkingSpace testSpace = null;
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
		
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> spaces = serviceFactory.getParkingSpaceService().getAllSpaces();
		for (ParkingSpace space: spaces) {
			if (space.getName().equals("Test Space")) {
				testSpace = space;
				break;
			}
		}
	}
	
	@After
	public void afterParkingSensorServiceTest() {
		serviceFactory.getParkingSensorService().removeSensor(testSpace);
		serviceFactory.getParkingSpaceService().removeParkingSpace(testSpace);
		serviceFactory.getParkingLotService().removeParkingLot(testLot);
		
		authState.setLoggedInUser(superManager);
		
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
	}
	
	@Test
	public void verifyCarNotPresent() {
		Boolean carPresent = serviceFactory.getParkingSensorService().isCarPresentAtSpace(testSpace);
		
		assertFalse(carPresent);
	}
}
