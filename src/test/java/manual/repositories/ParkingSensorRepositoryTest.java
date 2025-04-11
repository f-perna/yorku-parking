package manual.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingLot.ParkingLot;
import models.parkingSensor.ParkingSensor;
import models.parkingSpace.ParkingSpace;
import repositories.ParkingSensorRepository;

public class ParkingSensorRepositoryTest {
	private ParkingSensorRepository  parkingSensorRepository;
	private Client testClient;
	private ParkingSpace testSpace;
	
	@Before
	public void beforeParkingSensorRepositoryTest() {
		parkingSensorRepository = new ParkingSensorRepository();
		testClient = GenerateClientFactory.getClientType("Bob", "test@gmail.com", "123", Client.type.VISITOR, "TES 123", false);
		ParkingLot testLot = new ParkingLot("Test Lot");
		testSpace = new ParkingSpace(testLot, "Test Space");
	}
	
	@Test
	public void verifyCreateSensor() {
		ParkingSensor testSensor = parkingSensorRepository.createSensor(testSpace);
		
		assertNotNull(testSensor);
		
		parkingSensorRepository.removeSensor(testSpace);
	}
	
	@Test
	public void verifyGetSensorBySpaceId() {
		ParkingSensor sensor = parkingSensorRepository.createSensor(testSpace);
		ParkingSensor found = parkingSensorRepository.getSensorBySpaceId(testSpace.getID());
		assertEquals(sensor, found);
		parkingSensorRepository.removeSensor(testSpace);
	}
	
	@Test
	public void verifyGetSensorBySpaceIdReturnsNullWhenNotFound() {
		ParkingSensor result = parkingSensorRepository.getSensorBySpaceId(UUID.randomUUID());
		assertNull(result);
	}

	@Test
	public void verifyGetAllSensorsContainsCreatedSensor() {
		ParkingSensor sensor = parkingSensorRepository.createSensor(testSpace);
		List<ParkingSensor> sensors = parkingSensorRepository.getAllSensors();
		assertTrue(sensors.contains(sensor));
		parkingSensorRepository.removeSensor(testSpace);
	}

	@Test
	public void verifyRemoveSensor() {
		ParkingSensor sensor = parkingSensorRepository.createSensor(testSpace);
		parkingSensorRepository.removeSensor(testSpace);
		assertNull(parkingSensorRepository.getSensorBySpaceId(testSpace.getID()));
	}

	@Test
	public void verifyMultipleSensorsForDifferentSpaces() {
		ParkingLot lot = new ParkingLot("Another Lot");
		ParkingSpace anotherSpace = new ParkingSpace(lot, "Other Space");

		ParkingSensor sensor1 = parkingSensorRepository.createSensor(testSpace);
		ParkingSensor sensor2 = parkingSensorRepository.createSensor(anotherSpace);

		assertNotEquals(sensor1.getParkingSpace().getID(), sensor2.getParkingSpace().getID());

		parkingSensorRepository.removeSensor(testSpace);
		parkingSensorRepository.removeSensor(anotherSpace);
	}

	@Test
	public void verifySensorListSizeIncreasesOnCreate() {
		int initialSize = parkingSensorRepository.getAllSensors().size();
		parkingSensorRepository.createSensor(testSpace);
		int newSize = parkingSensorRepository.getAllSensors().size();
		assertEquals(initialSize + 1, newSize);
		parkingSensorRepository.removeSensor(testSpace);
	}

	@Test
	public void verifySensorListSizeDecreasesOnRemove() {
		parkingSensorRepository.createSensor(testSpace);
		int sizeBefore = parkingSensorRepository.getAllSensors().size();
		parkingSensorRepository.removeSensor(testSpace);
		int sizeAfter = parkingSensorRepository.getAllSensors().size();
		assertEquals(sizeBefore - 1, sizeAfter);
	}
	
	@Test
	public void verifySensorCreationReturnsUniqueId() {
	    ParkingSensor sensor1 = parkingSensorRepository.createSensor(testSpace);
	    ParkingSensor sensor2 = parkingSensorRepository.createSensor(new ParkingSpace(new ParkingLot("Lot2"), "Space2"));
	    assertNotEquals(sensor1.getId(), sensor2.getId());
	    parkingSensorRepository.removeSensor(sensor1.getParkingSpace());
	    parkingSensorRepository.removeSensor(sensor2.getParkingSpace());
	}
	
	@Test
	public void verifyGetSensorBySpaceIdCaseInsensitiveComparison() {
	    ParkingSensor sensor = parkingSensorRepository.createSensor(testSpace);
	    UUID spaceId = sensor.getParkingSpace().getID();
	    ParkingSensor retrieved = parkingSensorRepository.getSensorBySpaceId(UUID.fromString(spaceId.toString().toLowerCase()));
	    assertNotNull(retrieved);
	    parkingSensorRepository.removeSensor(testSpace);
	}
}
