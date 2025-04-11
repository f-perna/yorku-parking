package repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.booking.Booking;
import models.booking.Booking.BookingStatus;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;

public class BookingRepositoryTest {
	private BookingRepository  bookingRepository;
	private Client testClient;
	private ParkingSpace testSpace;
	
	@Before
	public void beforeBookingRepositoryTest() {
		bookingRepository = new BookingRepository();
		testClient = GenerateClientFactory.getClientType("Bob", "test@gmail.com", "123", Client.type.VISITOR, "TES 123", false);
		ParkingLot testLot = new ParkingLot("Test Lot");
		testSpace = new ParkingSpace(testLot, "Test Space");
	}
	
	@Test
	public void verifyCreateBooking() {
		Booking testBooking = bookingRepository.createBooking(testSpace, 5, testClient);
		
		assertNotNull(testBooking);
		
		bookingRepository.deleteBooking(testBooking);
	}
	
	@Test
	public void verifyGetBookingsForClient() {
		Booking booking = bookingRepository.createBooking(testSpace, 5, testClient);
		List<Booking> clientBookings = bookingRepository.getBookingsForClient(testClient);
		assertTrue(clientBookings.contains(booking));
		bookingRepository.deleteBooking(booking);
	}
	
	@Test
	public void verifyGetBookingById() {
		Booking booking = bookingRepository.createBooking(testSpace, 5, testClient);
		Booking fetched = bookingRepository.getBookingById(booking.getBookingID());
		assertEquals(booking, fetched);
		bookingRepository.deleteBooking(booking);
	}
	
	@Test
	public void verifyConfirmBooking() {
		Booking booking = bookingRepository.createBooking(testSpace, 5, testClient);
		bookingRepository.confirmBooking(booking);
		assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
		bookingRepository.deleteBooking(booking);
	}
	
	@Test
	public void verifyCancelBooking() {
		Booking booking = bookingRepository.createBooking(testSpace, 5, testClient);
		bookingRepository.cancelBooking(booking);
		assertEquals(BookingStatus.CANCELED, booking.getStatus());
		bookingRepository.deleteBooking(booking);
	}
	
	@Test
	public void verifyGetBookingsByStatus() {
		Booking booking = bookingRepository.createBooking(testSpace, 5, testClient);
		List<Booking> pending = bookingRepository.getBookingsByStatus(BookingStatus.PENDING);
		assertTrue(pending.contains(booking));
		bookingRepository.deleteBooking(booking);
	}
	
	@Test
	public void verifyInvalidBookingId() {
		UUID randomUUID = UUID.randomUUID();
		try {
			bookingRepository.getBookingById(randomUUID);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Booking not found with ID: " + randomUUID, e.getMessage());
		}
	}
	
	@Test
	public void verifyNullBookingId() {
		UUID nullUUID = null;
		try {
			bookingRepository.getBookingById(nullUUID);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Booking ID cannot be null", e.getMessage());
		}
	}
	
	@Test
	public void verifyNullNoShowBooking() {
		Booking testBooking = null;
		try {
			bookingRepository.noShowBooking(testBooking);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Booking cannot be null", e.getMessage());
		}
	}
	
	@Test
	public void verifyNullCheckoutBooking() {
		Booking testBooking = null;
		try {
			bookingRepository.checkInBooking(testBooking);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Booking cannot be null", e.getMessage());
		}
	}
}
