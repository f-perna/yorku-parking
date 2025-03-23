package services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import models.booking.Booking;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import repositories.BookingRepository;
import repositories.ParkingSpaceRepository;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;

public class BookingService {
	private BookingRepository bookingRepository;
	private ParkingSpaceRepository parkingSpaceRepository;

	public BookingService(BookingRepository bookingRepository, ParkingSpaceRepository parkingSpaceRepository) {
		this.bookingRepository = bookingRepository;
		this.parkingSpaceRepository = parkingSpaceRepository;
	}

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

		if (parkingSpace.getStatus() != ParkingSpaceStatus.AVAILABLE) {
			throw new IllegalStateException("Parking space is not available");
		}

		return bookingRepository.createBooking(parkingSpace, durationHours, client);
	}

	public void confirmBooking(Booking booking, Payment payment) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}

		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new IllegalStateException("Only pending bookings can be confirmed");
		}

		if (payment == null) {
			throw new IllegalArgumentException("Payment cannot be null");
		}

		if (!payment.getBooking().equals(booking)) {
			throw new IllegalArgumentException("The payment must correspond to the booking.");
		}

		if (payment.getStatus() != Payment.PaymentStatus.PAID) {
			throw new IllegalStateException("Payment must be successfuly made.");
		}

		ParkingSpace updatedSpace = parkingSpaceRepository.updateParkingSpaceStatus(booking.getParkingSpace(),
				ParkingSpaceStatus.BOOKED);
		booking.setParkingSpace(updatedSpace);

		bookingRepository.confirmBooking(booking);
	}

	public void completeBooking(Booking booking, Payment payment) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}

		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new IllegalStateException("Only checked in bookings can be paid for.");
		}

		if (payment == null) {
			throw new IllegalArgumentException("Payment cannot be null");
		}

		if (!payment.getBooking().equals(booking)) {
			throw new IllegalArgumentException("The payment must correspond to the booking.");
		}

		if (payment.getStatus() != Payment.PaymentStatus.PAID) {
			throw new IllegalStateException("Payment must be successfully made.");
		}

		ParkingSpace updatedSpace = parkingSpaceRepository.updateParkingSpaceStatus(booking.getParkingSpace(),
				ParkingSpaceStatus.AVAILABLE);

		// Update the booking with the updated space
		booking.setParkingSpace(updatedSpace);

		bookingRepository.completeBooking(booking);
	}

	public boolean checkIn(Booking booking) {
		LocalDateTime startTime = booking.getStartTime();
		LocalDateTime now = LocalDateTime.now();

		LocalDateTime earliestCheckIn = startTime.minusMinutes(5);
		LocalDateTime latestCheckIn = startTime.plusHours(1);

		if (now.isAfter(earliestCheckIn) && now.isBefore(latestCheckIn) || now.isEqual(earliestCheckIn)
				|| now.isEqual(latestCheckIn)) {
			try {
				bookingRepository.checkInBooking(booking);
				ParkingSpace updatedSpace = parkingSpaceRepository.updateParkingSpaceStatus(booking.getParkingSpace(),
						ParkingSpaceStatus.OCCUPIED);
				booking.setParkingSpace(updatedSpace);
				return true;
			} catch (Exception e) {
				System.out.println("Error confirming booking: " + e.getMessage());
				return false;
			}
		} else if (now.isBefore(earliestCheckIn)) {
			throw new IllegalArgumentException(
					"Checkout period is not open yet! Please try again at least 5 minutes before your booking.");
		} else {
			ParkingSpace updatedSpace = parkingSpaceRepository.updateParkingSpaceStatus(booking.getParkingSpace(),
					ParkingSpaceStatus.AVAILABLE);
			booking.setParkingSpace(updatedSpace);
			bookingRepository.noShowBooking(booking);
			throw new IllegalArgumentException("Checkout period has expired.");
		}
	}

	public List<Booking> getBookingsForClient(Client client) {
		if (client == null) {
			throw new IllegalStateException("Client cannot be null");
		}
		return bookingRepository.getBookingsForClient(client);
	}

	public Booking getBookingById(UUID bookingId) {
		if (bookingId == null) {
			throw new IllegalArgumentException("Booking ID cannot be null");
		}
		return bookingRepository.getBookingById(bookingId);
	}

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

			System.out.println(
					"BookingService: Extended booking " + booking.getBookingID() + " by " + additionalHours + " hours");
			return booking;
		} catch (Exception e) {
			System.err.println("Error extending booking time: " + e.getMessage());
			e.printStackTrace();
			throw new RuntimeException("Failed to extend booking time: " + e.getMessage(), e);
		}
	}
}