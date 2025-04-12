package manual.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import models.ParkingSystemException;
import models.booking.Booking;
import models.booking.Booking.BookingStatus;
import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import repositories.BookingRepository;

public class BookingRepositoryTest extends BaseRepositoryTest {
	private BookingRepository bookingRepository;
	private Client testClient;
	private ParkingSpace testSpace;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeRepositories();
		this.testClient = super.createTestClient();
		ParkingLot testLot = super.createTestParkingLot();
		this.testSpace = super.createTestParkingSpace(testLot);
	}

	private void initializeRepositories() {
		bookingRepository = repositoryFactory.getBookingRepository();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.bookingRepository = null;
		this.testClient = null;
		super.tearDown();
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
