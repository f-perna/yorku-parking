package manual.models.parkingSensor;

import models.booking.Booking;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingLot.ParkingLot;
import models.parkingSensor.ParkingSensor;
import models.parkingSpace.ParkingSpace;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class ParkingSensorTest {

    private ParkingSensor sensor1; // Car present, from CSV
    private ParkingSensor sensor2; // No car, from CSV
    private ParkingSpace parkingSpace1;
    private ParkingSpace parkingSpace2;
    private Map<UUID, ParkingLot> parkingLots;

    @BeforeEach
    void setUp() {
       
        parkingLots = new HashMap<>();
        UUID lotId1 = UUID.fromString("dede4416-c73b-41f4-8c7b-4007b299b82d"); 
        UUID lotId2 = UUID.fromString("f155f905-8ad0-4803-b688-fb851918b3a1"); 
        parkingLots.put(lotId1, new ParkingLot("Lot 1", lotId1, true));
        parkingLots.put(lotId2, new ParkingLot("Lot 2", lotId2, true));

        
        parkingSpace1 = new ParkingSpace(
            UUID.fromString("9ccd340f-34c9-49f7-a66d-34074b9d23c7"),
            parkingLots.get(lotId1),ParkingSpace.ParkingSpaceStatus.AVAILABLE,
            "A1",
            true
        );

        parkingSpace2 = new ParkingSpace(
            UUID.fromString("c749b8d3-6e24-42aa-84ca-dde750075a60"),parkingLots.get(lotId1),
            ParkingSpace.ParkingSpaceStatus.AVAILABLE,
            "A2",
            true
        );

       
        sensor1 = new ParkingSensor(parkingSpace1, UUID.fromString("aae1ae55-cf54-457c-93f5-c5565621fd3b"));
        sensor2 = new ParkingSensor(parkingSpace2, UUID.fromString("a709f852-e658-4b77-9db7-817e1f0de8a1"));

       
        sensor1.initializeWithCar("123 ANB");
    }

    @Test
    void testConstructorWithParkingSpace() {
        ParkingSensor sensor = new ParkingSensor(parkingSpace1);
        assertNotNull(sensor.getId(), "ID should be generated");
        assertEquals(parkingSpace1, sensor.getParkingSpace(), "ParkingSpace should be set");
        assertFalse(sensor.isCarPresent(), "Car should not be present by default");
        assertNull(sensor.getDetectedLicencePlate(), "Licence plate should be null by default");
        assertNull(sensor.getLastDetectionTime(), "Last detection time should be null by default");
    }

    @Test
    void testConstructorWithParkingSpaceAndId() {
        assertEquals(UUID.fromString("aae1ae55-cf54-457c-93f5-c5565621fd3b"), sensor1.getId(), "ID should match for sensor1");
        assertEquals(parkingSpace1, sensor1.getParkingSpace(), "ParkingSpace should match for sensor1");
        assertTrue(sensor1.isCarPresent(), "Car should be present after initialization");
        assertEquals("123 ANB", sensor1.getDetectedLicencePlate(), "Licence plate should match for sensor1");
        assertNotNull(sensor1.getLastDetectionTime(), "Last detection time should be set for sensor1");
    }

    @Test
    void testInitializeWithCar() {
        sensor2.initializeWithCar("XYZ 789");
        assertTrue(sensor2.isCarPresent(), "Car should be present after initialization");
        assertEquals("XYZ 789", sensor2.getDetectedLicencePlate(), "Licence plate should be set");
        assertNotNull(sensor2.getLastDetectionTime(), "Last detection time should be set");
    }

    @Test
    void testDetectCar() {
        sensor2.detectCar("XYZ 789");
        assertTrue(sensor2.isCarPresent(), "Car should be present after detection");
        assertEquals("XYZ 789", sensor2.getDetectedLicencePlate(), "Licence plate should be set");
        assertNotNull(sensor2.getLastDetectionTime(), "Last detection time should be set");
    }

    @Test
    void testDetectCarSameLicencePlate() {
        LocalDateTime initialDetectionTime = sensor1.getLastDetectionTime();
        sensor1.detectCar("123 ANB"); // Same licence plate as initialized
        assertTrue(sensor1.isCarPresent(), "Car should still be present");
        assertEquals("123 ANB", sensor1.getDetectedLicencePlate(), "Licence plate should remain unchanged");
        assertEquals(initialDetectionTime, sensor1.getLastDetectionTime(), "Last detection time should not change");
    }

    @Test
    void testRemoveCar() {
        sensor1.removeCar();
        assertFalse(sensor1.isCarPresent(), "Car should not be present after removal");
        assertNull(sensor1.getDetectedLicencePlate(), "Licence plate should be null after removal");
    }

    @Test
    void testRemoveCarWhenNoCarPresent() {
        sensor2.removeCar(); // No car present
        assertFalse(sensor2.isCarPresent(), "Car should still not be present");
        assertNull(sensor2.getDetectedLicencePlate(), "Licence plate should still be null");
    }

    @Test
    void testIsBookingOwnerCarMatching() {
        Client client = GenerateClientFactory.getClientType(
            "John Doe", "john@example.com", "password123", Client.type.VISITOR, "123 ANB", true
        );
        Booking booking = new Booking(parkingSpace1, client, 3);
        assertTrue(sensor1.isBookingOwnerCar(booking), "Should return true when licence plates match");
    }

    @Test
    void testIsBookingOwnerCarNonMatching() {
        Client client = GenerateClientFactory.getClientType(
            "Jane Doe", "jane@example.com", "password456", Client.type.VISITOR, "XYZ 789", true
        );
        Booking booking = new Booking(parkingSpace1, client, 2);
        assertFalse(sensor1.isBookingOwnerCar(booking), "Should return false when licence plates do not match");
    }

    @Test
    void testIsBookingOwnerCarNoCarPresent() {
        Client client = GenerateClientFactory.getClientType(
            "Jane Doe", "jane@example.com", "password456", Client.type.VISITOR, "XYZ 789", true
        );
        Booking booking = new Booking(parkingSpace2, client, 2);
        assertFalse(sensor2.isBookingOwnerCar(booking), "Should return false when no car is present");
    }

    @Test
    void testIsBookingOwnerCarNullBooking() {
        assertFalse(sensor1.isBookingOwnerCar(null), "Should return false when booking is null");
    }
}