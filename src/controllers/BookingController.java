package controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import models.auth.AuthenticationState;
import models.booking.Booking;
import models.booking.BookingModel;
import models.client.Client;
import models.parkingSpace.ParkingSpace;

public class BookingController {
	private BookingModel bookingModel;
	private AuthenticationState authState;

	public BookingController(BookingModel bookingModel) {
		this.authState = AuthenticationState.getInstance();
		this.bookingModel = bookingModel;
	}

	public Booking createBooking(ParkingSpace parkingSpace, int durationHours) {
		if (parkingSpace == null) {
			throw new IllegalArgumentException("Parking space cannot be null");
		}
		if (durationHours <= 0 || durationHours > 24) {
			throw new IllegalArgumentException("Duration must be between 1 and 24 hours");
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to create a booking");
		}

		if (!client.isApproved() && client.getType() != Client.type.VISITOR) {
			throw new IllegalStateException("Client must be approved to make a booking");
		}

		return bookingModel.createBooking(parkingSpace, durationHours, client);
	}

	public void saveBooking(Booking booking) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}
		bookingModel.persistBooking(booking);
	}

	public boolean CheckIn(Booking booking) {
		LocalDateTime startTime = booking.getStartTime();
		System.out.println("Current booking status: " + booking.getStatus());
		System.out.println("Current time: " + LocalDateTime.now());
		System.out.println("Start time: " + startTime);

		if (LocalDateTime.now().isAfter(startTime)) {
			System.out.println("Time check passed, attempting to confirm booking");
			try {
				bookingModel.confirmBooking(booking);
				System.out.println("Booking confirmed successfully");
				return true;
			} catch (Exception e) {
				System.out.println("Error confirming booking: " + e.getMessage());
				return false;
			}
		} else {
			System.out.println("Cannot check in yet - too early");
			return false;
		}
	}

	public void cancelBooking(UUID bookingId) {
		if (bookingId == null) {
			throw new IllegalArgumentException("Booking ID cannot be null");
		}

		Booking booking = bookingModel.getBookingById(bookingId);
		if (booking == null) {
			throw new IllegalArgumentException("Booking not found");
		}

		Client client = authState.getLoggedInClient();
		if (client == null || !booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot cancel another user's booking");
		}

		if (booking.getStartTime().minusHours(1).isBefore(LocalDateTime.now())) {
			throw new IllegalStateException("Bookings cannot be cancelled less than 1 hour before start time");
		}

		bookingModel.cancelBooking(booking);
	}

	public List<Booking> getCurrentUserBookings() {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("No user is currently logged in");
		}
		return bookingModel.getBookingsForClient(client);
	}

	public Booking getBookingById(UUID bookingId) {
		if (bookingId == null) {
			throw new IllegalArgumentException("Booking ID cannot be null");
		}
		return bookingModel.getBookingById(bookingId);
	}

	// public boolean deleteBooking(Booking booking) {
	// }
}