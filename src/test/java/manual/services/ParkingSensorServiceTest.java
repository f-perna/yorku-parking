package manual.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.parkingLot.ParkingLot;
import models.parkingSensor.ParkingSensor;
import models.parkingSpace.ParkingSpace;

public class ParkingSensorServiceTest extends BaseServiceTest {
	private ParkingLot testLot;
	private ParkingSpace testSpace;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		super.createAndLogInAsTestManager();
		createTestLotAndSpace();
	}

	private void createTestLotAndSpace() {
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		testLot = serviceFactory.getParkingLotService().getParkingLotByName("Test Lot");

		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		testSpace = serviceFactory.getParkingSpaceService().getAllSpaces().stream()
				.filter(space -> space.getName().equals("Test Space")).findFirst().orElse(null);
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
	}

	@Test
	public void verifyCarNotPresent() {
		Boolean carPresent = serviceFactory.getParkingSensorService().isCarPresentAtSpace(testSpace);
		assertFalse(carPresent);
	}

	@Test
	public void verifySensorAutoCreation() {
		ParkingSensor sensor = serviceFactory.getParkingSensorService().getSensorForSpace(testSpace);
		assertTrue(sensor != null);
	}

	@Test
	public void verifySimulateCarArrivalSuccess() {
		boolean success = serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
		assertTrue(success);

		assertTrue(serviceFactory.getParkingSensorService().isCarPresentAtSpace(testSpace));
		assertEquals("TEST 123", serviceFactory.getParkingSensorService().getDetectedLicencePlate(testSpace));
	}

	@Test
	public void verifySimulateCarDeparture() {
		serviceFactory.getParkingSensorService().simulateCarArrival(testSpace, "TEST 123");
		serviceFactory.getParkingSensorService().simulateCarDeparture(testSpace, "TEST 123");

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

		assertTrue(newSensor != null);
		assertEquals(testSpace.getID(), newSensor.getParkingSpace().getID());
	}
}
