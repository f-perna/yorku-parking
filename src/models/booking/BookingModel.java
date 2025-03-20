package models.booking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.CSVProcessor;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingStatus;

public class BookingModel {
	private List<Booking> bookings;

	public BookingModel() {
		this.bookings = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		bookings = CSVProcessor.readBookingData();
	}

	public Booking createBooking(ParkingSpace parkingSpace, int durationAmount, Client client) {
		if (parkingSpace.getStatus() != ParkingStatus.AVAILABLE) {
			throw new IllegalStateException("Parking space is not available");
		}

		Booking newBooking = new Booking(parkingSpace, durationAmount, client);
		return newBooking;
	}

	public void persistBooking(Booking booking) {
		bookings.add(booking);
		CSVProcessor.setBookingData(bookings);
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
			if (booking.getBookingId().equals(bookingId)) {
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
		booking.getParkingSpace().setStatus(ParkingStatus.AVAILABLE);
		CSVProcessor.setBookingData(bookings);
	}

	public void confirmBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new IllegalStateException("Only pending bookings can be confirmed");
		}

		booking.confirmBooking();
		CSVProcessor.setBookingData(bookings);
	}

	public List<Booking> getAllBookings() {
		return new ArrayList<>(bookings);
	}

	// public void deleteBooking(Booking booking) {
	// bookings.remove(booking);
	// }
}