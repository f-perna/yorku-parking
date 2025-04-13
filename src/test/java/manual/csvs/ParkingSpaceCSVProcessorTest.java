package manual.csvs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import csvs.ParkingSpaceCSVProcessor;
import csvs.ParkingLotCSVProcessor;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;

public class ParkingSpaceCSVProcessorTest {
    private static final String TEST_SPACES_FILE_PATH = "data/test_parking_spaces.csv";
    private static final String TEST_LOTS_FILE_PATH = "data/test_parking_lots.csv";
    private List<ParkingSpace> testSpaces;
    private ParkingLot testLot;

    @BeforeEach
    void setUp() throws IOException {
        // Initialize test files
        ParkingSpaceCSVProcessor.initializeTestFile(TEST_SPACES_FILE_PATH);
        ParkingLotCSVProcessor.initializeTestFile(TEST_LOTS_FILE_PATH);

        // Create and save test parking lot
        UUID lotId = UUID.randomUUID();
        testLot = new ParkingLot("Test Lot", lotId, true);
        List<ParkingLot> lots = new ArrayList<>();
        lots.add(testLot);
        ParkingLotCSVProcessor.setLotData(lots);

        // Create test parking spaces
        testSpaces = new ArrayList<>();
        UUID spaceId1 = UUID.randomUUID();
        UUID spaceId2 = UUID.randomUUID();
        UUID spaceId3 = UUID.randomUUID();
        UUID spaceId4 = UUID.randomUUID();

        ParkingSpace space1 = new ParkingSpace(spaceId1, testLot, ParkingSpaceStatus.AVAILABLE, "A1", true);
        ParkingSpace space2 = new ParkingSpace(spaceId2, testLot, ParkingSpaceStatus.BOOKED, "A2", true);
        ParkingSpace space3 = new ParkingSpace(spaceId3, testLot, ParkingSpaceStatus.AVAILABLE, "B1", false);
        ParkingSpace space4 = new ParkingSpace(spaceId4, testLot, ParkingSpaceStatus.BOOKED, "B2", false);

        testSpaces.add(space1);
        testSpaces.add(space2);
        testSpaces.add(space3);
        testSpaces.add(space4);
    }

    @AfterEach
    void tearDown() {
        ParkingSpaceCSVProcessor.cleanupAndReset(TEST_SPACES_FILE_PATH);
        ParkingLotCSVProcessor.cleanupAndReset(TEST_LOTS_FILE_PATH);
    }

    @Test
    void testWriteAndReadParkingSpaces() {
        // Write parking spaces to file
        ParkingSpaceCSVProcessor.setSpaceData(testSpaces);

        // Read parking spaces from file
        List<ParkingSpace> readSpaces = ParkingSpaceCSVProcessor.readSpaceData();

        // Verify the number of parking spaces
        assertEquals(4, readSpaces.size());

        // Verify first parking space
        ParkingSpace firstSpace = readSpaces.get(0);
        assertEquals(testSpaces.get(0).getID(), firstSpace.getID());
        assertEquals(testLot.getID(), firstSpace.getLot().getID());
        assertEquals(ParkingSpaceStatus.AVAILABLE, firstSpace.getStatus());
        assertEquals("A1", firstSpace.getName());
        assertTrue(firstSpace.isEnabled());

        // Verify second parking space
        ParkingSpace secondSpace = readSpaces.get(1);
        assertEquals(testSpaces.get(1).getID(), secondSpace.getID());
        assertEquals(testLot.getID(), secondSpace.getLot().getID());
        assertEquals(ParkingSpaceStatus.BOOKED, secondSpace.getStatus());
        assertEquals("A2", secondSpace.getName());
        assertTrue(secondSpace.isEnabled());
    }

    @Test
    void testReadEmptyFile() {
        List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertTrue(spaces.isEmpty());
    }

    @Test
    void testWriteEmptyList() {
        ParkingSpaceCSVProcessor.setSpaceData(new ArrayList<>());
        List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertTrue(spaces.isEmpty());
    }

    @Test
    void testInvalidDataHandling() throws IOException {
        // Write invalid data directly to the file
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_SPACES_FILE_PATH)) {
            writer.write("id,lotID,status,name,enabled\n");
            writer.write("not-a-uuid,not-a-uuid,INVALID_STATUS,Invalid Name,not-a-boolean\n");
        }

        // Reading should handle invalid data gracefully
        List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertTrue(spaces.isEmpty());
    }

    @Test
    void testInvalidUUIDFormat() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_SPACES_FILE_PATH)) {
            writer.write("id,lotID,status,name,enabled\n");
            writer.write("invalid-uuid," + testLot.getID() + ",AVAILABLE,A1,true\n");
        }

        List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertTrue(spaces.isEmpty());
    }

    @Test
    void testInvalidLotID() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_SPACES_FILE_PATH)) {
            writer.write("id,lotID,status,name,enabled\n");
            writer.write(UUID.randomUUID() + ",invalid-lot-id,AVAILABLE,A1,true\n");
        }

        List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertTrue(spaces.isEmpty());
    }

    @Test
    void testInvalidStatus() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_SPACES_FILE_PATH)) {
            writer.write("id,lotID,status,name,enabled\n");
            writer.write(UUID.randomUUID() + "," + testLot.getID() + ",INVALID_STATUS,A1,true\n");
        }

        List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertTrue(spaces.isEmpty());
    }

    @Test
    void testMissingFields() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_SPACES_FILE_PATH)) {
            writer.write("id,lotID,status,name,enabled\n");
            writer.write(UUID.randomUUID() + "," + testLot.getID() + ",AVAILABLE,A1\n");
        }

        List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertTrue(spaces.isEmpty());
    }

    @Test
    void testNullValues() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_SPACES_FILE_PATH)) {
            writer.write("id,lotID,status,name,enabled\n");
            writer.write(",,,A1,true\n");
        }

        List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertTrue(spaces.isEmpty());
    }

    @Test
    void testSpecialCharactersInName() {
        ParkingSpace space = new ParkingSpace(
                UUID.randomUUID(),
                testLot,
                ParkingSpaceStatus.AVAILABLE,
                "Space #1",
                true);

        List<ParkingSpace> spaces = new ArrayList<>();
        spaces.add(space);
        ParkingSpaceCSVProcessor.setSpaceData(spaces);

        List<ParkingSpace> readSpaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertEquals(1, readSpaces.size());
        assertEquals("Space #1", readSpaces.get(0).getName());
    }

    @Test
    void testLongName() {
        String longName = "This is a very long parking space name that exceeds normal length but should still be valid";
        ParkingSpace space = new ParkingSpace(
                UUID.randomUUID(),
                testLot,
                ParkingSpaceStatus.AVAILABLE,
                longName,
                true);

        List<ParkingSpace> spaces = new ArrayList<>();
        spaces.add(space);
        ParkingSpaceCSVProcessor.setSpaceData(spaces);

        List<ParkingSpace> readSpaces = ParkingSpaceCSVProcessor.readSpaceData();
        assertEquals(1, readSpaces.size());
        assertEquals(longName, readSpaces.get(0).getName());
    }

    @Test
    void testMixedStatusAndEnabled() {
        List<ParkingSpace> spaces = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            boolean enabled = i % 2 == 0;
            ParkingSpaceStatus status = i < 2 ? ParkingSpaceStatus.AVAILABLE : ParkingSpaceStatus.BOOKED;
            ParkingSpace space = new ParkingSpace(
                    UUID.randomUUID(),
                    testLot,
                    status,
                    "Space " + i,
                    enabled);
            spaces.add(space);
        }

        ParkingSpaceCSVProcessor.setSpaceData(spaces);
        List<ParkingSpace> readSpaces = ParkingSpaceCSVProcessor.readSpaceData();

        assertEquals(4, readSpaces.size());
        for (int i = 0; i < 4; i++) {
            assertEquals(i % 2 == 0, readSpaces.get(i).isEnabled());
            assertEquals(i < 2 ? ParkingSpaceStatus.AVAILABLE : ParkingSpaceStatus.BOOKED,
                    readSpaces.get(i).getStatus());
        }
    }
}