package models.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import main.BookingCSVProcessor;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;

public class BookingModel {
	private List<Booking> bookings;

	public BookingModel() {
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
		return null;
	}

	public void cancelBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.PENDING
				&& booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new IllegalStateException("Booking cannot be cancelled in its current state");
		}

		booking.cancelBooking();
		saveBookings();
	}

	// after paying deposit
	public void confirmBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new IllegalStateException("Only pending bookings can be confirmed");
		}

		booking.confirmBooking();
		bookings.add(booking);
		saveBookings();
	}

	// after checking out
	public void completeBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new IllegalStateException("Only checked in bookings can be completed.");
		}

		booking.completeBooking();
		saveBookings();
	}

	public void checkInBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new IllegalStateException("Only confirmed bookings can be checked-in");
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
		return null;
	}

	public List<Booking> getAllBookings() {
		return new ArrayList<>(bookings);
	}

	// public void deleteBooking(Booking booking) {
	// bookings.remove(booking);
	// }
}