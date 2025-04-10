package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
	
	@Test
	public void verifySensorAutoCreation() {
	    ParkingSensor sensor = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);
	    assertFalse(sensor == null);
	}
	
	@Test
	public void verifySimulateCarArrivalSuccess() {
	    boolean success = serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
	    assertTrue(success);

	    assertTrue(serviceFactory.getParkingSensorService().isCarPresentAtSpace(testSpace));
	    assertTrue(serviceFactory.getParkingSensorService().getDetectedLicencePlate(testSpace).equals("TEST 123"));
	}
 
	@Test
	public void verifySimulateCarDeparture() {
	    serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
	    serviceFactory.getParkingSensorService().simulateCarDeparture(testSpace);

	    assertFalse(serviceFactory.getParkingSensorService().isCarPresentAtSpace(testSpace));
	}
	
	@Test
	public void verifyGetLicencePlateWhenNoCarPresent() {
	    String plate = serviceFactory.getParkingSensorService().getDetectedLicencePlate(testSpace);
	    assertEquals(null, plate);
	}

	@Test
	public void verifyGetSensorForSpaceReturnsSameSensor() {
	    ParkingSensor sensor1 = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);
	    ParkingSensor sensor2 = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);

	    assertEquals(sensor1.getId(), sensor2.getId());
	}
	
	@Test
	public void verifySimulateCarArrivalOnOccupiedSpaceFails() {
	    serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
	    boolean result = serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 456");

	    assertFalse(result);
	}

	@Test
	public void verifyCarParkedAnywhereTrue() {
	    serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
	    assertTrue(serviceFactory.getParkingSensorService().isClientCarParkedAnywhere("TEST 123"));
	}
	
	@Test
	public void verifyClientCarParkedAnywhereWithNull() {
	    boolean result = serviceFactory.getParkingSensorService().isClientCarParkedAnywhere(null);
	    assertFalse(result);
	}

	@Test
	public void verifyRemoveSensorAndRecreateOnAccess() {
	    serviceFactory.getParkingSensorService().removeSensor(testSpace);

	    ParkingSensor newSensor = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);

	    assertFalse(newSensor == null);
	    assertEquals(testSpace.getID(), newSensor.getParkingSpace().getID());
	}

}
