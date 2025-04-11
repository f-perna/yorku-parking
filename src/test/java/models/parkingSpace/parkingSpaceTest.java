package models.parkingSpace;

import models.parkingLot.ParkingLot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class parkingSpaceTest {

    private ParkingSpace parkingSpaceA1;
    private ParkingSpace parkingSpaceA2;
    private ParkingSpace parkingSpaceA3;
    private ParkingSpace parkingSpaceC1; //from our csv file
    private Map<UUID, ParkingLot> parkingLots;

    @BeforeEach
    void setUp() {
        
        parkingLots = new HashMap<>();
        UUID lotId1 = UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d"); 
        UUID lotId2 = UUID.fromString("f155f905-8ad0-4803-b688-fb851918b3a1"); // Lot for C1

        
        parkingLots.put(lotId1, new ParkingLot("Lot 1", lotId1, true));
        parkingLots.put(lotId2, new ParkingLot("Lot 2", lotId2, true));

        
        parkingSpaceA1 = new ParkingSpace(
            UUID.fromString("9ccd340f-34c9-49f7-a66d-34074b9d23c7"),
            parkingLots.get(lotId1),
            ParkingSpace.ParkingSpaceStatus.AVAILABLE,
            "A1",
            true
        );

        parkingSpaceA2 = new ParkingSpace(
            UUID.fromString("c749b8d3-6e24-42aa-84ca-dde750075a60"),
            parkingLots.get(lotId1),
            ParkingSpace.ParkingSpaceStatus.AVAILABLE,
            "A2",
            true
        );

        parkingSpaceA3 = new ParkingSpace(
            UUID.fromString("bddfe247-3ad3-4685-aa66-fd0aac50ec70"),
            parkingLots.get(lotId1),
            ParkingSpace.ParkingSpaceStatus.AVAILABLE,
            "A3",
            true
        );

        parkingSpaceC1 = new ParkingSpace(
            UUID.fromString("5e7106bf-599d-4637-80cd-59bdc3507340"),
            parkingLots.get(lotId2),
            ParkingSpace.ParkingSpaceStatus.AVAILABLE,
            "C1",
            true
        );
    }

    @Test
    void testConstructorWithParkingLotAndName() {
        ParkingSpace space = new ParkingSpace(parkingLots.get(UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d")), "TestSpace");
        assertNotNull(space.getID(), "ID should be generated");
        assertEquals(parkingLots.get(UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d")), space.getLot(), "ParkingLot should be set");
        assertEquals(ParkingSpace.ParkingSpaceStatus.AVAILABLE, space.getStatus(), "Status should be AVAILABLE by default");
        assertEquals("TestSpace", space.getName(), "Name should be set");
        assertTrue(space.isEnabled(), "Enabled should be true by default");
    }

    @Test
    void testConstructorWithAllParametersA1() {
        assertEquals(UUID.fromString("9ccd340f-34c9-49f7-a66d-34074b9d23c7"), parkingSpaceA1.getID(), "ID should match for A1");
        assertEquals(parkingLots.get(UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d")), parkingSpaceA1.getLot(), "ParkingLot should match for A1");
        assertEquals(ParkingSpace.ParkingSpaceStatus.AVAILABLE, parkingSpaceA1.getStatus(), "Status should be AVAILABLE for A1");
        assertEquals("A1", parkingSpaceA1.getName(), "Name should be A1");
        assertTrue(parkingSpaceA1.isEnabled(), "Enabled should be true for A1");
    }

    @Test
    void testConstructorWithAllParametersA2() {
        assertEquals(UUID.fromString("c749b8d3-6e24-42aa-84ca-dde750075a60"), parkingSpaceA2.getID(), "ID should match for A2");
        assertEquals(parkingLots.get(UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d")), parkingSpaceA2.getLot(), "ParkingLot should match for A2");
        assertEquals(ParkingSpace.ParkingSpaceStatus.AVAILABLE, parkingSpaceA2.getStatus(), "Status should be AVAILABLE for A2");
        assertEquals("A2", parkingSpaceA2.getName(), "Name should be A2");
        assertTrue(parkingSpaceA2.isEnabled(), "Enabled should be true for A2");
    }


    @Test
    void testGetID() {
        assertEquals(UUID.fromString("9ccd340f-34c9-49f7-a66d-34074b9d23c7"), parkingSpaceA1.getID(), "getID should return the correct ID for A1");
        assertEquals(UUID.fromString("c749b8d3-6e24-42aa-84ca-dde750075a60"), parkingSpaceA2.getID(), "getID should return the correct ID for A2");
        assertEquals(UUID.fromString("bddfe247-3ad3-4685-aa66-fd0aac50ec70"), parkingSpaceA3.getID(), "getID should return the correct ID for A3");
        assertEquals(UUID.fromString("5e7106bf-599d-4637-80cd-59bdc3507340"), parkingSpaceC1.getID(), "getID should return the correct ID for C1");
    }

    @Test
    void testGetLot() {
        assertEquals(parkingLots.get(UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d")), parkingSpaceA1.getLot(), "getLot should return the correct ParkingLot for A1");
        assertEquals(parkingLots.get(UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d")), parkingSpaceA2.getLot(), "getLot should return the correct ParkingLot for A2");
        assertEquals(parkingLots.get(UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d")), parkingSpaceA3.getLot(), "getLot should return the correct ParkingLot for A3");
        assertEquals(parkingLots.get(UUID.fromString("f155f905-8ad0-4803-b688-fb851918b3a1")), parkingSpaceC1.getLot(), "getLot should return the correct ParkingLot for C1");
    }

    @Test
    void testGetStatus() {
        assertEquals(ParkingSpace.ParkingSpaceStatus.AVAILABLE, parkingSpaceA1.getStatus(), "getStatus should return AVAILABLE for A1");
        parkingSpaceA1.setStatus(ParkingSpace.ParkingSpaceStatus.BOOKED);
        assertEquals(ParkingSpace.ParkingSpaceStatus.BOOKED, parkingSpaceA1.getStatus(), "getStatus should return BOOKED after change for A1");
    }

    @Test
    void testGetName() {
        assertEquals("A1", parkingSpaceA1.getName(), "getName should return A1");
        assertEquals("A2", parkingSpaceA2.getName(), "getName should return A2");
        assertEquals("A3", parkingSpaceA3.getName(), "getName should return A3");
        assertEquals("C1", parkingSpaceC1.getName(), "getName should return C1");
    }

    @Test
    void testIsEnabled() {
        assertTrue(parkingSpaceA1.isEnabled(), "isEnabled should return true for A1");
        parkingSpaceA1.setEnabled(false);
        assertFalse(parkingSpaceA1.isEnabled(), "isEnabled should return false after change for A1");
    }

    @Test
    void testSetEnabled() {
        parkingSpaceA1.setEnabled(false);
        assertFalse(parkingSpaceA1.isEnabled(), "setEnabled(false) should disable A1");
        parkingSpaceA1.setEnabled(true);
        assertTrue(parkingSpaceA1.isEnabled(), "setEnabled(true) should enable A1");
    }

    @Test
    void testSetStatus() {
        parkingSpaceA1.setStatus(ParkingSpace.ParkingSpaceStatus.BOOKED);
        assertEquals(ParkingSpace.ParkingSpaceStatus.BOOKED, parkingSpaceA1.getStatus(), "setStatus should set status to BOOKED for A1");
        parkingSpaceA1.setStatus(ParkingSpace.ParkingSpaceStatus.AVAILABLE);
        assertEquals(ParkingSpace.ParkingSpaceStatus.AVAILABLE, parkingSpaceA1.getStatus(), "setStatus should set status to AVAILABLE for A1");
    }

    @Test
    void testIsBookableWhenAvailableAndEnabled() {
        parkingSpaceA1.setStatus(ParkingSpace.ParkingSpaceStatus.AVAILABLE);
        parkingSpaceA1.setEnabled(true);
        assertTrue(parkingSpaceA1.isBookable(), "isBookable should return true when AVAILABLE and enabled for A1");
    }

    @Test
    void testIsBookableWhenBookedAndEnabled() {
        parkingSpaceA1.setStatus(ParkingSpace.ParkingSpaceStatus.BOOKED);
        parkingSpaceA1.setEnabled(true);
        assertFalse(parkingSpaceA1.isBookable(), "isBookable should return false when BOOKED and enabled for A1");
    }

    @Test
    void testIsBookableWhenAvailableAndDisabled() {
        parkingSpaceA1.setStatus(ParkingSpace.ParkingSpaceStatus.AVAILABLE);
        parkingSpaceA1.setEnabled(false);
        assertFalse(parkingSpaceA1.isBookable(), "isBookable should return false when AVAILABLE and disabled for A1");
    }

    @Test
    void testIsBookableWhenBookedAndDisabled() {
        parkingSpaceA1.setStatus(ParkingSpace.ParkingSpaceStatus.BOOKED);
        parkingSpaceA1.setEnabled(false);
        assertFalse(parkingSpaceA1.isBookable(), "isBookable should return false when BOOKED and disabled for A1");
    }

    @Test
    void testCheckOut() {
        parkingSpaceA1.setStatus(ParkingSpace.ParkingSpaceStatus.BOOKED);
        parkingSpaceA1.checkOut();
        assertEquals(ParkingSpace.ParkingSpaceStatus.AVAILABLE, parkingSpaceA1.getStatus(), "checkOut should set status to AVAILABLE for A1");
    }

    @Test
    void testToString() {
        assertEquals("A1", parkingSpaceA1.toString(), "toString should return A1");
        assertEquals("A2", parkingSpaceA2.toString(), "toString should return A2");
        assertEquals("A3", parkingSpaceA3.toString(), "toString should return A3");
        assertEquals("C1", parkingSpaceC1.toString(), "toString should return C1");
    }

}