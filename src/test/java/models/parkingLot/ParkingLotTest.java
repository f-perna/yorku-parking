package models.parkingLot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {

    private ParkingLot parkingLot;
    private UUID fixedId;

    @BeforeEach
    void setUp() {
        parkingLot = new ParkingLot("testinglot");
        fixedId = UUID.randomUUID();
    }

    @Test
    void testDefaultConstructorGeneratesRandomId() {
        assertNotNull(parkingLot.getID(), "ID should be generated and not null");
        assertTrue(parkingLot.getID() instanceof UUID, "ID should be a unique and equal to UUID");
    }

    @Test
    void testDefaultConstructorSetsName() {
        assertEquals("testinglot", parkingLot.getName(), "Name should be set correctly");
    }

    @Test
    void testDefaultConstructorSetsEnabledToTrue() {
        assertTrue(parkingLot.isEnabled(), "Enabled should be the default option until managing team chnages it");
    }

    @Test
    void testCsvConstructorSetsFieldsFromParkingLotsCsvForLotA() {
        UUID idA = UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d");
        ParkingLot lotA = new ParkingLot("A", idA, true);
        assertEquals("A", lotA.getName(), "Name should match parking_lots.csv data for A");
        assertEquals(idA, lotA.getID(), "ID should match parking_lots.csv data for A");
        assertTrue(lotA.isEnabled(), "Enabled should match parking_lots.csv data for A");
    }

    @Test
    void testCsvConstructorSetsFieldsFromParkingLotsCsvForLotB() {
        UUID idB = UUID.fromString("2e8ad648-9153-40bf-aef2-86148c6e0fe4");
        ParkingLot lotB = new ParkingLot("B", idB, true);
        assertEquals("B", lotB.getName(), "Name should match parking_lots.csv data for B");
        assertEquals(idB, lotB.getID(), "ID should match parking_lots.csv data for B");
        assertTrue(lotB.isEnabled(), "Enabled should match parking_lots.csv data for B");
    }

    @Test
    void testCsvConstructorSetsFieldsWithCustomValues() {
        ParkingLot lot = new ParkingLot("CustomLot", fixedId, false);
        assertEquals("CustomLot", lot.getName(), "Name should be set correctly");
        assertEquals(fixedId, lot.getID(), "ID should be set correctly");
        assertFalse(lot.isEnabled(), "Enabled should be set to false");
    }

    @Test
    void testSetNameUpdatesName() {
        parkingLot.setName("UpdatedLot");
        assertEquals("UpdatedLot", parkingLot.getName(), "setName should update the name");
    }

    @Test
    void testSetEnabledTogglesEnabled() {
        parkingLot.setEnabled(false);
        assertFalse(parkingLot.isEnabled(), "setEnabled should update enabled status to false");
        parkingLot.setEnabled(true);
        assertTrue(parkingLot.isEnabled(), "setEnabled should update enabled status to true");
    }

    @Test
    void testToStringReturnsName() {
        assertEquals("testinglot", parkingLot.toString(), "toString should return the name");
        parkingLot.setName("NewLot");
        assertEquals("NewLot", parkingLot.toString(), "toString should reflect updated name");
    }

    @Test
    void testEqualsBasedOnId() {
        ParkingLot lot1 = new ParkingLot("Lot1", fixedId, true);
        ParkingLot lot2 = new ParkingLot("Lot2", fixedId, false);
        ParkingLot lot3 = new ParkingLot("Lot3", UUID.randomUUID(), true);

        assertEquals(lot1, lot2, "Parking lots with same ID should ");
        assertNotEquals(lot1, lot3, "Parking lots with different IDs should not be equal");
        assertEquals(lot1, lot1, "Parking lot should equal itself");
        assertNotEquals(lot1, null, "Parking lot should not equal null");
        assertNotEquals(lot1, new Object(), "Parking lot should not equal a different class object");
    }
}