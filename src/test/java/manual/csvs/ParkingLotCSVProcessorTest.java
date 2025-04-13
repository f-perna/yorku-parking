package manual.csvs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import csvs.ParkingLotCSVProcessor;
import models.parkingLot.ParkingLot;

public class ParkingLotCSVProcessorTest {
	private static final String TEST_FILE_PATH = "data/test_parking_lots.csv";
	private List<ParkingLot> testParkingLots;

	@BeforeEach
	void setUp() throws IOException {
		ParkingLotCSVProcessor.initializeTestFile(TEST_FILE_PATH);
		testParkingLots = new ArrayList<>();

		// Create test parking lots with different names and statuses
		UUID id1 = UUID.randomUUID();
		UUID id2 = UUID.randomUUID();
		UUID id3 = UUID.randomUUID();
		UUID id4 = UUID.randomUUID();

		ParkingLot lot1 = new ParkingLot("Main Parking", id1, true);
		ParkingLot lot2 = new ParkingLot("Faculty Parking", id2, false);
		ParkingLot lot3 = new ParkingLot("Visitor Parking", id3, true);
		ParkingLot lot4 = new ParkingLot("Student Parking", id4, false);

		testParkingLots.add(lot1);
		testParkingLots.add(lot2);
		testParkingLots.add(lot3);
		testParkingLots.add(lot4);
	}

	@AfterEach
	void tearDown() {
		ParkingLotCSVProcessor.cleanupAndReset(TEST_FILE_PATH);
	}

	@Test
	void testWriteAndReadParkingLots() {
		// Write parking lots to file
		ParkingLotCSVProcessor.setLotData(testParkingLots);

		// Read parking lots from file
		List<ParkingLot> readLots = ParkingLotCSVProcessor.readLotData();

		// Verify the number of parking lots
		assertEquals(4, readLots.size());

		// Verify first parking lot
		ParkingLot firstLot = readLots.get(0);
		assertEquals("Main Parking", firstLot.getName());
		assertEquals(testParkingLots.get(0).getID(), firstLot.getID());
		assertTrue(firstLot.isEnabled());

		// Verify second parking lot
		ParkingLot secondLot = readLots.get(1);
		assertEquals("Faculty Parking", secondLot.getName());
		assertEquals(testParkingLots.get(1).getID(), secondLot.getID());
		assertFalse(secondLot.isEnabled());
	}

	@Test
	void testReadEmptyFile() {
		List<ParkingLot> lots = ParkingLotCSVProcessor.readLotData();
		assertTrue(lots.isEmpty());
	}

	@Test
	void testWriteEmptyList() {
		ParkingLotCSVProcessor.setLotData(new ArrayList<>());
		List<ParkingLot> lots = ParkingLotCSVProcessor.readLotData();
		assertTrue(lots.isEmpty());
	}

	@Test
	void testInvalidDataHandling() throws IOException {
		// Write invalid data directly to the file
		try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
			writer.write("name,id,enabled\n");
			writer.write("Invalid Lot,not-a-uuid,not-a-boolean\n");
		}

		// Reading should handle invalid data gracefully
		List<ParkingLot> lots = ParkingLotCSVProcessor.readLotData();
		assertTrue(lots.isEmpty());
	}

	@Test
	void testInvalidUUIDFormat() throws IOException {
		try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
			writer.write("name,id,enabled\n");
			writer.write("Test Lot,invalid-uuid,true\n");
		}

		List<ParkingLot> lots = ParkingLotCSVProcessor.readLotData();
		assertTrue(lots.isEmpty());
	}
	
	@Test
	void testMissingFields() throws IOException {
		try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
			writer.write("name,id,enabled\n");
			writer.write("Test Lot," + UUID.randomUUID() + "\n");
		}

		List<ParkingLot> lots = ParkingLotCSVProcessor.readLotData();
		assertTrue(lots.isEmpty());
	}

	@Test
	void testNullValues() throws IOException {
		try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
			writer.write("name,id,enabled\n");
			writer.write(",,true\n");
		}

		List<ParkingLot> lots = ParkingLotCSVProcessor.readLotData();
		assertTrue(lots.isEmpty());
	}

	@Test
	void testSpecialCharactersInName() {
		ParkingLot lot = new ParkingLot("Parking Lot #1", UUID.randomUUID(), true);

		List<ParkingLot> lots = new ArrayList<>();
		lots.add(lot);
		ParkingLotCSVProcessor.setLotData(lots);

		List<ParkingLot> readLots = ParkingLotCSVProcessor.readLotData();
		assertEquals(1, readLots.size());
		assertEquals("Parking Lot #1", readLots.get(0).getName());
	}

	@Test
	void testLongName() {
		String longName = "This is a very long parking lot name that exceeds normal length but should still be valid";
		ParkingLot lot = new ParkingLot(longName, UUID.randomUUID(), true);

		List<ParkingLot> lots = new ArrayList<>();
		lots.add(lot);
		ParkingLotCSVProcessor.setLotData(lots);

		List<ParkingLot> readLots = ParkingLotCSVProcessor.readLotData();
		assertEquals(1, readLots.size());
		assertEquals(longName, readLots.get(0).getName());
	}

	@Test
	void testDuplicateIDs() {
		UUID duplicateId = UUID.randomUUID();
		ParkingLot lot1 = new ParkingLot("Lot 1", duplicateId, true);
		ParkingLot lot2 = new ParkingLot("Lot 2", duplicateId, false);

		List<ParkingLot> lots = new ArrayList<>();
		lots.add(lot1);
		lots.add(lot2);
		ParkingLotCSVProcessor.setLotData(lots);

		List<ParkingLot> readLots = ParkingLotCSVProcessor.readLotData();
		assertEquals(2, readLots.size());
		assertEquals(duplicateId, readLots.get(0).getID());
		assertEquals(duplicateId, readLots.get(1).getID());
	}

	@Test
	void testMixedEnabledStatus() {
		List<ParkingLot> lots = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			boolean enabled = i % 2 == 0;
			ParkingLot lot = new ParkingLot("Lot " + i, UUID.randomUUID(), enabled);
			lots.add(lot);
		}

		ParkingLotCSVProcessor.setLotData(lots);
		List<ParkingLot> readLots = ParkingLotCSVProcessor.readLotData();

		assertEquals(5, readLots.size());
		for (int i = 0; i < 5; i++) {
			assertEquals(i % 2 == 0, readLots.get(i).isEnabled());
		}
	}
}