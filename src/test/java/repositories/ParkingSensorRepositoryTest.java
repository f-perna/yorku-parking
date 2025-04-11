package repositories;

import org.junit.Before;

import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;

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
}
