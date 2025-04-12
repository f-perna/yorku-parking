package manual.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import models.parkingLot.ParkingLot;
import models.parkingSensor.ParkingSensor;
import models.parkingSpace.ParkingSpace;
import repositories.ParkingSensorRepository;

public class ParkingSensorRepositoryTest extends BaseRepositoryTest {
	private ParkingSensorRepository parkingSensorRepository;
	private ParkingLot testLot;
	private ParkingSpace testSpace;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeRepositories();
		testLot = super.createTestParkingLot();
		this.testSpace = super.createTestParkingSpace(testLot);
	}

	private void initializeRepositories() {
		parkingSensorRepository = repositoryFactory.getParkingSensorRepository();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.parkingSensorRepository = null;
		this.testSpace = null;
		super.tearDown();
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
		parkingSensorRepository.createSensor(testSpace);
		parkingSensorRepository.removeSensor(testSpace);
		assertNull(parkingSensorRepository.getSensorBySpaceId(testSpace.getID()));
	}

	@Test
	public void verifyMultipleSensorsForDifferentSpaces() {
		ParkingSpace anotherSpace = repositoryFactory.getParkingSpaceRepository().addParkingSpace(testLot, "Test Space 2");

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
		ParkingSpace space2 = repositoryFactory.getParkingSpaceRepository().addParkingSpace(testLot, "Test Space 2");
		ParkingSensor sensor1 = parkingSensorRepository.createSensor(testSpace);
		ParkingSensor sensor2 = parkingSensorRepository.createSensor(space2);
		assertNotEquals(sensor1.getId(), sensor2.getId());
		parkingSensorRepository.removeSensor(sensor1.getParkingSpace());
		parkingSensorRepository.removeSensor(sensor2.getParkingSpace());
	}

	@Test
	public void verifyGetSensorBySpaceIdCaseInsensitiveComparison() {
		ParkingSensor sensor = parkingSensorRepository.createSensor(testSpace);
		UUID spaceId = sensor.getParkingSpace().getID();
		ParkingSensor retrieved = parkingSensorRepository
				.getSensorBySpaceId(UUID.fromString(spaceId.toString().toLowerCase()));
		assertNotNull(retrieved);
		parkingSensorRepository.removeSensor(testSpace);
	}
}
