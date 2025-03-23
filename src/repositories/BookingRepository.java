package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import main.BookingCSVProcessor;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.booking.Booking;
import models.booking.Booking.BookingStatus;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;

public class BookingRepository {
	private List<Booking> bookings;

	public BookingRepository() {
		this.bookings = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		bookings = BookingCSVProcessor.readBookingData();
	}

	private void saveBookings() {
		BookingCSVProcessor.setBookingData(bookings);
	}

	public Booking createBooking(ParkingSpace parkingSpace, int durationAmount, Client client) {
		Booking newBooking = new Booking(parkingSpace, client, durationAmount);
		return newBooking;
	}

	public List<Booking> getBookingsForClient(Client client) {
		List<Booking> clientBookings = new ArrayList<>();
		for (Booking booking : bookings) {
			if (booking.getClient().equals(client)) {
				clientBookings.add(booking);
			}
		}

		return clientBookings;
	}

	public Booking getBookingById(UUID bookingId) {
		for (Booking booking : bookings) {
			if (booking.getBookingID().equals(bookingId)) {
				return booking;
			}
		}
		throw new ParkingSystemException("Booking not found with ID: " + bookingId, ErrorType.DATA_ACCESS);
	}

	public void noShowBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new ParkingSystemException("Only confirmed bookings can be considered no shows.",
					ErrorType.BUSINESS_LOGIC);
		}
		booking.noShow();
		saveBookings();
	}

	// after paying deposit
	public void confirmBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new ParkingSystemException("Only pending bookings can be confirmed", ErrorType.BUSINESS_LOGIC);
		}

		booking.confirmBooking();
		bookings.add(booking);
		saveBookings();
	}

	// after checking out
	public void completeBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new ParkingSystemException("Only checked in bookings can be completed.", ErrorType.BUSINESS_LOGIC);
		}

		booking.completeBooking();
		saveBookings();
	}

	public void checkInBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new ParkingSystemException("Only confirmed bookings can be checked-in", ErrorType.BUSINESS_LOGIC);
		}
		booking.checkIn();
		saveBookings();

	}

	public Booking getBookingByID(UUID bookingID) {
		for (Booking booking : bookings) {
			if (booking.getBookingID().equals(bookingID)) {
				return booking;
			}
		}
		throw new ParkingSystemException("Booking not found with ID: " + bookingID, ErrorType.DATA_ACCESS);
	}

	public List<Booking> getAllBookings() {
		return new ArrayList<>(bookings);
	}

	// public void deleteBooking(Booking booking) {
	// bookings.remove(booking);
	// }
}