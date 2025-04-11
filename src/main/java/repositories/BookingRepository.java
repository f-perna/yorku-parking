package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.time.LocalDateTime;

import csv.BookingCSVProcessor;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.booking.Booking;
import models.booking.Booking.BookingStatus;
import models.client.Client;
import models.parkingSpace.ParkingSpace;

public class BookingRepository {
	private final List<Booking> bookings;

	public BookingRepository() {
		this.bookings = new CopyOnWriteArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		try {
			bookings.addAll(BookingCSVProcessor.readBookingData());
		} catch (Exception e) {
			throw new ParkingSystemException("Failed to load booking data: " + e.getMessage(), ErrorType.DATA_ACCESS);
		}
	}

	private void saveBookings() {
		try {
			BookingCSVProcessor.setBookingData(new ArrayList<>(bookings));
		} catch (Exception e) {
			throw new ParkingSystemException("Failed to save booking data: " + e.getMessage(), ErrorType.DATA_ACCESS);
		}
	}

	public Booking createBooking(ParkingSpace parkingSpace, int durationAmount, Client client) {
		if (parkingSpace == null || client == null) {
			throw new ParkingSystemException("Parking space and client cannot be null", ErrorType.VALIDATION);
		}

		Booking newBooking = new Booking(parkingSpace, client, durationAmount);
		bookings.add(newBooking);
		saveBookings();
		return newBooking;
	}

	public List<Booking> getBookingsForClient(Client client) {
		if (client == null) {
			throw new ParkingSystemException("Client cannot be null", ErrorType.VALIDATION);
		}

		List<Booking> clientBookings = new ArrayList<>();
		for (Booking booking : bookings) {
			if (booking.getClient().equals(client)) {
				clientBookings.add(booking);
			}
		}
		return clientBookings;
	}

	public Booking getBookingById(UUID bookingId) {
		if (bookingId == null) {
			throw new ParkingSystemException("Booking ID cannot be null", ErrorType.VALIDATION);
		}

		for (Booking booking : bookings) {
			if (booking.getBookingID().equals(bookingId)) {
				return booking;
			}
		}
		throw new ParkingSystemException("Booking not found with ID: " + bookingId, ErrorType.NOT_FOUND);
	}

	public void noShowBooking(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new ParkingSystemException("Only confirmed bookings can be considered no shows",
					ErrorType.BUSINESS_LOGIC);
		}
		booking.noShow();
		saveBookings();
	}

	public void confirmBooking(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new ParkingSystemException("Only pending bookings can be confirmed", ErrorType.BUSINESS_LOGIC);
		}
		booking.confirmBooking();
		saveBookings();
	}

	public void completeBooking(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (booking.getStatus() != BookingStatus.CHECKED_IN && booking.getStatus() != BookingStatus.OVERSTAYED
				&& booking.getStatus() != Booking.BookingStatus.EXPIRED) {
			throw new ParkingSystemException("Only checked in, overstayed, or expired bookings can be completed",
					ErrorType.BUSINESS_LOGIC);
		}
		booking.completeBooking();
		saveBookings();
	}

	public void cancelBooking(Booking booking) {
		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED
				&& booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new ParkingSystemException("Only pending or confirmed bookings can be canceled",
					ErrorType.BUSINESS_LOGIC);
		}
		booking.cancelBooking();
		saveBookings();
	}

	public void checkInBooking(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new ParkingSystemException("Only confirmed bookings can be checked-in", ErrorType.BUSINESS_LOGIC);
		}

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = booking.getStartTime();
		LocalDateTime earliestCheckIn = startTime.minusMinutes(5);
		LocalDateTime latestCheckIn = startTime.plusHours(1);

		if (now.isBefore(earliestCheckIn)) {
			return;
		} else if (now.isAfter(latestCheckIn)) {
			return;
		}

		booking.checkIn();
		saveBookings();
	}

	public void checkOutBooking(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new ParkingSystemException("Only checked-in bookings can be checked-out", ErrorType.BUSINESS_LOGIC);
		}
		booking.completeBooking();
		saveBookings();
	}

	public List<Booking> getAllBookings() {
		return new ArrayList<>(bookings);
	}

	public Booking getActiveBookingForSpace(ParkingSpace parkingSpace) {
		if (parkingSpace == null) {
			throw new ParkingSystemException("Parking space cannot be null", ErrorType.VALIDATION);
		}

		for (Booking booking : bookings) {
			if (booking.getParkingSpace().equals(parkingSpace) && (booking.getStatus() == BookingStatus.CONFIRMED
					|| booking.getStatus() == BookingStatus.CHECKED_IN)) {
				return booking;
			}
		}
		return null;
	}

	public List<Booking> getConfirmedBookings() {
		List<Booking> confirmedBookings = new ArrayList<>();
		for (Booking booking : bookings) {
			if (booking.getStatus() == BookingStatus.CONFIRMED) {
				confirmedBookings.add(booking);
			}
		}
		return confirmedBookings;
	}

	public List<Booking> getBookingsByStatus(BookingStatus status) {
		if (status == null) {
			throw new ParkingSystemException("Booking status cannot be null", ErrorType.VALIDATION);
		}

		List<Booking> matchingBookings = new ArrayList<>();
		for (Booking booking : bookings) {
			if (booking.getStatus() == status) {
				matchingBookings.add(booking);
			}
		}
		return matchingBookings;
	}

	public void markAsOverstayed(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new ParkingSystemException("Only checked-in bookings can be marked as overstayed",
					ErrorType.BUSINESS_LOGIC);
		}
		booking.markAsOverstayed();
		saveBookings();
	}

	public void markAsExpired(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new ParkingSystemException("Only checked-in bookings can be marked as expired",
					ErrorType.BUSINESS_LOGIC);
		}
		booking.markAsExpired();
		saveBookings();
	}

	public boolean hasOverstayedBookings(Client client) {
		if (client == null) {
			throw new ParkingSystemException("Client cannot be null", ErrorType.VALIDATION);
		}
		for (Booking booking : bookings) {
			if (booking.getClient().equals(client) && booking.getStatus() == BookingStatus.OVERSTAYED) {
				return true;
			}
		}
		return false;
	}
	
	public void deleteBooking(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		bookings.remove(booking);
		saveBookings();
	}
}