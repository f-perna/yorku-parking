package controllers;

import java.util.List;
import java.util.UUID;

import models.auth.AuthenticationState;
import models.booking.Booking;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import services.BookingService;

public class BookingController {
	private BookingService bookingService;
	private AuthenticationState authState;

	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
		this.authState = AuthenticationState.getInstance();
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

		return bookingService.createBooking(parkingSpace, durationHours, client);
	}

	public boolean checkIn(Booking booking) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to check in");
		}

		if (!booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot check in for another user's booking");
		}

		return bookingService.checkIn(booking);
	}

	public List<Booking> getBookingsForClient() {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to view bookings");
		}

		return bookingService.getBookingsForClient(client);
	}

	public Booking extendBookingTime(Booking booking, int additionalHours) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to extend a booking");
		}

		return bookingService.extendBookingTime(booking, additionalHours, client);
	}

}