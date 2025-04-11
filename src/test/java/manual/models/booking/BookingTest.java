package manual.models.booking;

import models.ParkingSystemException;
import models.booking.Booking;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingSpace.ParkingSpace;
import models.parkingLot.ParkingLot;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class BookingTest {

    private Booking booking;
    private ParkingSpace parkingSpace;
    private Client client;
    private UUID fixedBookingId;

    @BeforeEach
    void setUp() {
        ParkingLot parkingLot = new ParkingLot("TestLot");
        parkingSpace = new ParkingSpace(parkingLot, "TestSpace");

     
        client = GenerateClientFactory.getClientType("test student","test@student.com","Pass123!",Client.type.STUDENT,      
         "ABC123",                 
         true                      
        );

        booking = new Booking(parkingSpace, client, 2); 
        fixedBookingId = UUID.fromString("30da524e-47c1-4658-9edd-9dcd9a0a7147");
    }

    @Test
    void testDefaultConstructorSetsFields() {
        assertNotNull(booking.getBookingID(), "ID should not be null");
        assertEquals(parkingSpace, booking.getParkingSpace(), "Parking space should be set");
        assertEquals(client, booking.getClient(), "Client should be set");
        assertEquals(Booking.BookingStatus.PENDING, booking.getStatus(), "Status should be PENDING");
        assertEquals(client.getRate(), booking.getDeposit(), "Deposit should match client rate");
    }

    @Test
    void testDefaultConstructorRequiresLicencePlate() {
        Client invalidClient = GenerateClientFactory.getClientType(
            "invalid student","invalid@student.com","Password123!",
            Client.type.STUDENT,
            "",
            true
        );
        assertThrows(ParkingSystemException.class, () -> new Booking(parkingSpace, invalidClient, 2), 
            "Should throw exception for empty licence plate");
    }

    @Test
    void testCsvConstructorWithBookingsCsv() {
        LocalDateTime startTime = LocalDateTime.parse("2025-03-25T12:37:45.079478100");
        LocalDateTime endTime = LocalDateTime.parse("2025-03-25T14:37:45.079478100");
        Booking csvBooking = new Booking(fixedBookingId, client, parkingSpace, Booking.BookingStatus.CANCELED, startTime, endTime, 5.0);
        assertEquals(fixedBookingId, csvBooking.getBookingID(), "ID should match CSV");
        assertEquals(client, csvBooking.getClient(), "Client should be set");
        assertEquals(parkingSpace, csvBooking.getParkingSpace(), "Parking space should be set");
        assertEquals(Booking.BookingStatus.CANCELED, csvBooking.getStatus(), "Status should be CANCELED");
        assertEquals(startTime, csvBooking.getStartTime(), "Start time should match CSV");
        assertEquals(endTime, csvBooking.getEndTime(), "End time should match CSV");
        assertEquals(5.0, csvBooking.getDeposit(), "Deposit should be 5.0");
    }

    @Test
    void testStateTransitions() {
        booking.confirmBooking();
        assertEquals(Booking.BookingStatus.CONFIRMED, booking.getStatus(), "Status should be CONFIRMED");
        booking.checkIn();
        assertEquals(Booking.BookingStatus.CHECKED_IN, booking.getStatus(), "Status should be CHECKED_IN");
        booking.completeBooking();
        assertEquals(Booking.BookingStatus.COMPLETED, booking.getStatus(), "Status should be COMPLETED");
    }

    @Test
    void testCancelAndNoShow() {
        booking.confirmBooking();
        booking.cancelBooking();
        assertEquals(Booking.BookingStatus.CANCELED, booking.getStatus(), "Status should be CANCELED");
        Booking newBooking = new Booking(parkingSpace, client, 2);
        newBooking.confirmBooking();
        newBooking.noShow();
        assertEquals(Booking.BookingStatus.NO_SHOW, newBooking.getStatus(), "Status should be NO_SHOW");
    }

    @Test
    void testOverstayedAndExpired() {
        booking.confirmBooking();
        booking.checkIn();
        booking.markAsOverstayed();
        assertEquals(Booking.BookingStatus.OVERSTAYED, booking.getStatus(), "Status should be OVERSTAYED");

        Booking newBooking = new Booking(parkingSpace, client, 2);
        newBooking.confirmBooking();
        newBooking.checkIn();
        newBooking.markAsExpired();
        assertEquals(Booking.BookingStatus.EXPIRED, newBooking.getStatus(), "Status should be EXPIRED");
    }

    @Test
    void testExtendDuration() {
        LocalDateTime originalEndTime = booking.getEndTime();
        booking.extendDuration(1);
        assertEquals(originalEndTime.plusHours(1), booking.getEndTime(), "End time should be extended by 1 hour");
        assertThrows(ParkingSystemException.class, () -> booking.extendDuration(0), "Should throw exception for non-positive hours");
    }

    @Test
    void testCalculateHoursAndPrice() {
        long hours = booking.calculateHours();
        assertEquals(2, hours, "Hours should be 2");

        double price = booking.calculatePrice();
        assertEquals(10.0, price, "Price should be 10.0 (2 hours * $5/hour)");

        double deductedPrice = booking.deductedPrice();
        assertEquals(5.0, deductedPrice, "Deducted price should be 5.0 (price - deposit)");
    }

    @Test
    void testPayDeposit() {
        booking.payDeposit();
        assertEquals(client.getRate(), booking.getDeposit(), "Deposit should match client rate");
        assertEquals(Booking.BookingStatus.CONFIRMED, booking.getStatus(), "Status should be CONFIRMED");
    }

    @Test
    void testToStringAndGetDuration() {
        String toStringResult = booking.toString();
        assertTrue(toStringResult.contains("Lot TestLot, Space TestSpace"), "toString should contain lot and space names");

        String duration = booking.getDuration();
        assertTrue(duration.contains(booking.getStartTime().format(java.time.format.DateTimeFormatter.ofPattern("MMMM d: h:m a", java.util.Locale.US))), "Duration should contain start time");
        assertTrue(duration.contains(booking.getEndTime().format(java.time.format.DateTimeFormatter.ofPattern("h:m a", java.util.Locale.US))), "Duration should contain end time");
    }

    @Test
    void testEquals() {
        Booking booking1 = new Booking(fixedBookingId, client, parkingSpace, Booking.BookingStatus.PENDING, LocalDateTime.now(), LocalDateTime.now().plusHours(2), 5.0);
        Booking booking2 = new Booking(fixedBookingId, client, parkingSpace, Booking.BookingStatus.CONFIRMED, LocalDateTime.now(), LocalDateTime.now().plusHours(3), 5.0);
        Booking booking3 = new Booking(UUID.randomUUID(), client, parkingSpace, Booking.BookingStatus.PENDING, LocalDateTime.now(), LocalDateTime.now().plusHours(2), 5.0);

        assertEquals(booking1, booking2, "Bookings with same ID should be equal");
        assertNotEquals(booking1, booking3, "Bookings with different IDs should not be equal");
    }
}