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

	public void authCheck() {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to create a booking", ErrorType.AUTHENTICATION);
		}

		if (!client.isApproved() && client.getType() != Client.type.VISITOR) {
			throw new ParkingSystemException("Client must be approved to make a booking", ErrorType.AUTHORIZATION);
		}

		if (client.getLicencePlate() == null || client.getLicencePlate().trim().isEmpty()) {
			throw new ParkingSystemException("Client must have a licence plate registered", ErrorType.VALIDATION);
		}

	}

	public Booking createBooking(ParkingSpace parkingSpace, int durationHours) {
		authCheck();

		Client client = authState.getLoggedInClient();

		if (bookingService.hasOverstayedBookings(client)) {
			throw new ParkingSystemException(
					"You have overstayed bookings that need to be resolved before creating new bookings. "
							+ "Please return to your parking space, remove your car, and complete checkout.",
					ErrorType.BUSINESS_LOGIC);
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
		authCheck();

		if (!booking.getClient().equals(authState.getLoggedInClient())) {
			throw new ParkingSystemException("Cannot check in for another user's booking", ErrorType.AUTHORIZATION);
		}

		return bookingService.checkIn(booking);
	}

	public List<Booking> getBookingsForClient() {
		authCheck();

		return bookingService.getBookingsForClient(authState.getLoggedInClient());
	}

	public Booking extendBookingTime(Booking booking, int additionalHours) {
		authCheck();

		if (!booking.getClient().equals(authState.getLoggedInClient())) {
			throw new ParkingSystemException("Cannot extend another user's booking", ErrorType.AUTHORIZATION);
		}

		return bookingService.extendBookingTime(booking, additionalHours);
	}

	public void cancelBooking(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to cancel a booking", ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot cancel another user's booking", ErrorType.AUTHORIZATION);
		}

		bookingService.cancelBooking(booking, client);
	}

	public boolean isLatestBookingForSpaceAndClient(Booking booking) {
		return bookingService.isLatestBookingForSpaceAndClient(booking);
	}
}