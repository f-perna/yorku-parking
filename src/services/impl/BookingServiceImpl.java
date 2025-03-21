package services.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import models.booking.Booking;
import models.booking.BookingModel;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpaceModel;
import models.parkingSpace.ParkingSpace.ParkingStatus;
import services.BookingService;

public class BookingServiceImpl implements BookingService {
	private BookingModel bookingModel;
	private ParkingSpaceModel parkingSpaceModel;

	public BookingServiceImpl(BookingModel bookingModel, ParkingSpaceModel parkingSpaceModel) {
		this.bookingModel = bookingModel;
		this.parkingSpaceModel = parkingSpaceModel;
	}

	@Override
	public Booking createBooking(ParkingSpace parkingSpace, int durationHours, Client client) {
		if (parkingSpace == null) {
			throw new IllegalArgumentException("Parking space cannot be null");
		}
		if (durationHours <= 0 || durationHours > 24) {
			throw new IllegalArgumentException("Duration must be between 1 and 24 hours");
		}
		if (client == null) {
			throw new IllegalStateException("User must be logged in to create a booking");
		}
		if (!client.isApproved() && client.getType() != Client.type.VISITOR) {
			throw new IllegalStateException("Client must be approved to make a booking");
		}

		if (parkingSpace.getStatus() != ParkingStatus.AVAILABLE) {
			throw new IllegalStateException("Parking space is not available");
		}

		return bookingModel.createBooking(parkingSpace, durationHours, client);
	}

	@Override
	public void saveBooking(Booking booking) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}

		if (booking.getStatus() == Booking.BookingStatus.CONFIRMED) {
			parkingSpaceModel.updateParkingSpaceStatus(booking.getParkingSpace(), ParkingStatus.BOOKED);
		}

		bookingModel.persistBooking(booking);
	}

	@Override
	public boolean checkIn(Booking booking) {
		LocalDateTime startTime = booking.getStartTime();
		System.out.println("Current booking status: " + booking.getStatus());
		System.out.println("Current time: " + LocalDateTime.now());
		System.out.println("Start time: " + startTime);

		if (LocalDateTime.now().isAfter(startTime)) {
			System.out.println("Time check passed, attempting to confirm booking");
			try {
				confirmBooking(booking);
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

	@Override
	public void confirmBooking(Booking booking) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}

		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new IllegalStateException("Only pending bookings can be confirmed");
		}

		parkingSpaceModel.updateParkingSpaceStatus(booking.getParkingSpace(), ParkingStatus.OCCUPIED);

		bookingModel.confirmBooking(booking);
	}

	@Override
	public void completeBooking(Booking booking) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}

		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new IllegalStateException("Only confirmed bookings can be completed");
		}

		System.out.println("BookingServiceImpl: Completing booking " + booking.getBookingId());
		System.out.println("BookingServiceImpl: Current space status: " + booking.getParkingSpace().getStatus());

		booking.updateStatus(Booking.BookingStatus.COMPLETED);

		parkingSpaceModel.updateParkingSpaceStatus(booking.getParkingSpace(), ParkingStatus.AVAILABLE);
		System.out.println(
				"BookingServiceImpl: Updated space status to AVAILABLE for space " + booking.getParkingSpace().getID());

		bookingModel.persistBooking(booking);
		System.out.println("BookingServiceImpl: Saved booking changes");
	}

	@Override
	public void cancelBooking(UUID bookingId, Client client) {
		if (bookingId == null) {
			throw new IllegalArgumentException("Booking ID cannot be null");
		}

		Booking booking = bookingModel.getBookingById(bookingId);
		if (booking == null) {
			throw new IllegalArgumentException("Booking not found");
		}

		if (client == null || !booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot cancel another user's booking");
		}

		if (booking.getStartTime().minusHours(1).isBefore(LocalDateTime.now())) {
			throw new IllegalStateException("Bookings cannot be cancelled less than 1 hour before start time");
		}

		bookingModel.cancelBooking(booking);

		parkingSpaceModel.updateParkingSpaceStatus(booking.getParkingSpace(), ParkingStatus.AVAILABLE);
	}

	@Override
	public List<Booking> getBookingsForClient(Client client) {
		if (client == null) {
			throw new IllegalStateException("Client cannot be null");
		}
		return bookingModel.getBookingsForClient(client);
	}

	@Override
	public Booking getBookingById(UUID bookingId) {
		if (bookingId == null) {
			throw new IllegalArgumentException("Booking ID cannot be null");
		}
		return bookingModel.getBookingById(bookingId);
	}

	@Override
	public Booking extendBookingTime(Booking booking, int additionalHours, Client client) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}

		if (additionalHours <= 0 || additionalHours > 24) {
			throw new IllegalArgumentException("Additional hours must be between 1 and 24");
		}

		if (client == null) {
			throw new IllegalStateException("Client cannot be null");
		}

		if (!booking.getClient().getEmail().equals(client.getEmail())) {
			throw new IllegalStateException("Client does not own this booking");
		}

		if (booking.getStatus() != Booking.BookingStatus.PENDING
				&& booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new IllegalStateException("Only pending or confirmed bookings can be extended");
		}

		try {
			booking.extendDuration(additionalHours);

			bookingModel.persistBooking(booking);

			System.out.println(
					"BookingService: Extended booking " + booking.getBookingId() + " by " + additionalHours + " hours");
			return booking;
		} catch (Exception e) {
			System.err.println("Error extending booking time: " + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to extend booking time: " + e.getMessage(), e);
		}
	}
}