package services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
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
			throw new ParkingSystemException("Parking space cannot be null", ErrorType.VALIDATION);
		}
		if (durationHours <= 0 || durationHours > 24) {
			throw new ParkingSystemException("Duration must be between 1 and 24 hours", ErrorType.VALIDATION);
		}
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to create a booking", ErrorType.AUTHENTICATION);
		}
		if (!client.isApproved() && client.getType() != Client.type.VISITOR) {
			throw new ParkingSystemException("Client must be approved to make a booking", ErrorType.AUTHORIZATION);
		}

		if (!parkingSpace.isBookable()) {
			throw new ParkingSystemException("Parking space is not available for booking", ErrorType.BUSINESS_LOGIC);
		}

		return bookingRepository.createBooking(parkingSpace, durationHours, client);
	}

	public void confirmBooking(Booking booking, Payment payment) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new ParkingSystemException("Only pending bookings can be confirmed", ErrorType.BUSINESS_LOGIC);
		}

		if (payment == null) {
			throw new ParkingSystemException("Payment cannot be null", ErrorType.VALIDATION);
		}

		if (!payment.getBooking().equals(booking)) {
			throw new ParkingSystemException("The payment must correspond to the booking.", ErrorType.VALIDATION);
		}

		if (payment.getStatus() != Payment.PaymentStatus.PAID) {
			throw new ParkingSystemException("Payment must be successfuly made.", ErrorType.BUSINESS_LOGIC);
		}

		ParkingSpace updatedSpace = parkingSpaceRepository.updateParkingSpaceStatus(booking.getParkingSpace(),
				ParkingSpaceStatus.BOOKED);
		booking.setParkingSpace(updatedSpace);

		bookingRepository.confirmBooking(booking);
	}

	public void completeBooking(Booking booking, Payment payment) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new ParkingSystemException("Only checked in bookings can be paid for.", ErrorType.BUSINESS_LOGIC);
		}

		if (payment == null) {
			throw new ParkingSystemException("Payment cannot be null", ErrorType.VALIDATION);
		}

		if (!payment.getBooking().equals(booking)) {
			throw new ParkingSystemException("The payment must correspond to the booking.", ErrorType.VALIDATION);
		}

		if (payment.getStatus() != Payment.PaymentStatus.PAID) {
			throw new ParkingSystemException("Payment must be successfully made.", ErrorType.BUSINESS_LOGIC);
		}

		// Get current parking space and update its status to AVAILABLE
		ParkingSpace parkingSpace = booking.getParkingSpace();
		parkingSpace.checkOut();

		// Update the space in the repository
		ParkingSpace updatedSpace = parkingSpaceRepository.updateParkingSpaceStatus(parkingSpace,
				ParkingSpaceStatus.AVAILABLE);

		// Update the booking with the updated space
		booking.setParkingSpace(updatedSpace);

		bookingRepository.completeBooking(booking);
	}
	
	public boolean cancel(Booking booking) {
		LocalDateTime startTime = booking.getStartTime();
		LocalDateTime now = LocalDateTime.now();
		
		ParkingSpace parkingSpace = booking.getParkingSpace();
		
		if (now.isBefore(startTime)) {
			ParkingSpace updatedSpace = parkingSpaceRepository.updateParkingSpaceStatus(parkingSpace,
					ParkingSpaceStatus.AVAILABLE);
			bookingRepository.cancelBooking(booking);
			return true;
		} else {
			return false;
		}
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
				return false;
			}
		} else if (now.isBefore(earliestCheckIn)) {
			throw new ParkingSystemException(
					"Checkout period is not open yet! Please try again at least 5 minutes before your booking.",
					ErrorType.BUSINESS_LOGIC);
		} else {
			ParkingSpace updatedSpace = parkingSpaceRepository.updateParkingSpaceStatus(booking.getParkingSpace(),
					ParkingSpaceStatus.AVAILABLE);
			booking.setParkingSpace(updatedSpace);
			bookingRepository.noShowBooking(booking);
			throw new ParkingSystemException("Checkout period has expired.", ErrorType.BUSINESS_LOGIC);
		}
	}

	public List<Booking> getBookingsForClient(Client client) {
		if (client == null) {
			throw new ParkingSystemException("Client cannot be null", ErrorType.VALIDATION);
		}
		return bookingRepository.getBookingsForClient(client);
	}

	public Booking getBookingById(UUID bookingId) {
		if (bookingId == null) {
			throw new ParkingSystemException("Booking ID cannot be null", ErrorType.VALIDATION);
		}
		return bookingRepository.getBookingById(bookingId);
	}

	public Booking extendBookingTime(Booking booking, int additionalHours, Client client) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		if (additionalHours <= 0 || additionalHours > 24) {
			throw new ParkingSystemException("Additional hours must be between 1 and 24", ErrorType.VALIDATION);
		}

		if (client == null) {
			throw new ParkingSystemException("Client cannot be null", ErrorType.VALIDATION);
		}

		if (!booking.getClient().getEmail().equals(client.getEmail())) {
			throw new ParkingSystemException("Client does not own this booking", ErrorType.AUTHORIZATION);
		}

		if (booking.getStatus() != Booking.BookingStatus.PENDING
				&& booking.getStatus() != Booking.BookingStatus.CONFIRMED
				&& booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new ParkingSystemException("Only pending, confirmed and checked-in bookings can be extended",
					ErrorType.BUSINESS_LOGIC);
		}

		try {
			booking.extendDuration(additionalHours);
			return booking;
		} catch (Exception e) {
			System.err.println("Error extending booking time: " + e.getMessage());
			e.printStackTrace();
			throw new ParkingSystemException("Failed to extend booking time: " + e.getMessage(), ErrorType.SYSTEM_ERROR,
					e);
		}
	}
}