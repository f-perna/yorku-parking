package controllers;

import java.util.List;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
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
			throw new ParkingSystemException("Parking space cannot be null", ErrorType.VALIDATION);
		}
		if (durationHours <= 0 || durationHours > 24) {
			throw new ParkingSystemException("Duration must be between 1 and 24 hours", ErrorType.VALIDATION);
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to create a booking", ErrorType.AUTHENTICATION);
		}

		if (!client.isApproved() && client.getType() != Client.type.VISITOR) {
			throw new ParkingSystemException("Client must be approved to make a booking", ErrorType.AUTHORIZATION);
		}

		return bookingService.createBooking(parkingSpace, durationHours, client);
	}
	
	public boolean cancel(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to check in", ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot check in for another user's booking", ErrorType.AUTHORIZATION);
		}

		return bookingService.cancel(booking);
	}

	public boolean checkIn(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to check in", ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot check in for another user's booking", ErrorType.AUTHORIZATION);
		}

		return bookingService.checkIn(booking);
	}

	public List<Booking> getBookingsForClient() {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to view bookings", ErrorType.AUTHENTICATION);
		}

		return bookingService.getBookingsForClient(client);
	}

	public Booking extendBookingTime(Booking booking, int additionalHours) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to extend a booking", ErrorType.AUTHENTICATION);
		}

		return bookingService.extendBookingTime(booking, additionalHours, client);
	}
}