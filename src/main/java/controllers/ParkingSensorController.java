package controllers;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.booking.Booking;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import services.ParkingSensorService;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParkingSensorController {
	private ParkingSensorService parkingSensorService;
	private AuthenticationState authState;
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

	public ParkingSensorController(ParkingSensorService parkingSensorService) {
		this.parkingSensorService = parkingSensorService;
		this.authState = AuthenticationState.getInstance();
	}

	public void simulateCarArrival(Booking booking, boolean shouldCheckIn) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to simulate car arrival",
					ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot simulate car arrival for another user's booking",
					ErrorType.AUTHORIZATION);
		}

		ParkingSpace parkingSpace = booking.getParkingSpace();

		LocalDateTime now = LocalDateTime.now();
		LocalDateTime startTime = booking.getStartTime();
		LocalDateTime endTime = booking.getEndTime();

		// For early arrivals (before booking start), don't check time constraints
		if (shouldCheckIn) {
			if (now.isBefore(startTime)) {
				String formattedTime = startTime.format(TIME_FORMATTER);
				throw new ParkingSystemException("You cannot park yet. Parking is only allowed from " + formattedTime
						+ " (your booking start time).", ErrorType.BUSINESS_LOGIC);
			}

			if (now.isAfter(endTime)) {
				String formattedEndTime = endTime.format(TIME_FORMATTER);
				throw new ParkingSystemException("Your booking has expired. It ended at " + formattedEndTime + ".",
						ErrorType.BUSINESS_LOGIC);
			}
		}

		if (parkingSensorService.isCarPresentAtSpace(parkingSpace)) {
			throw new ParkingSystemException(
					"This parking space is already occupied. Please contact management if you need assistance.",
					ErrorType.BUSINESS_LOGIC);
		}

		String licencePlate = booking.getLicencePlate();
		if (licencePlate == null || licencePlate.isEmpty()) {
			throw new ParkingSystemException("Your account does not have a licence plate registered",
					ErrorType.VALIDATION);
		}

		boolean success = parkingSensorService.simulateCarArrival(parkingSpace, licencePlate, shouldCheckIn);
		if (!success) {
			throw new ParkingSystemException("Could not park your car. The space appears to be occupied.",
					ErrorType.BUSINESS_LOGIC);
		}
	}

	public void simulateCarDeparture(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to simulate car departure",
					ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot simulate car departure for another user's booking",
					ErrorType.AUTHORIZATION);
		}

		ParkingSpace parkingSpace = booking.getParkingSpace();
		parkingSensorService.simulateCarDeparture(parkingSpace);
	}

	public boolean isCarPresentAtSpace(ParkingSpace parkingSpace) {
		if (parkingSpace == null) {
			throw new ParkingSystemException("Parking space cannot be null", ErrorType.VALIDATION);
		}

		return parkingSensorService.isCarPresentAtSpace(parkingSpace);
	}

	public String getDetectedLicencePlate(ParkingSpace parkingSpace) {
		if (parkingSpace == null) {
			throw new ParkingSystemException("Parking space cannot be null", ErrorType.VALIDATION);
		}

		return parkingSensorService.getDetectedLicencePlate(parkingSpace);
	}

	public boolean isBookingOwnerCar(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}

		return parkingSensorService.isBookingOwnerCar(booking);
	}

	public void checkForNoShows() {
		parkingSensorService.checkForNoShows();
	}

	public void checkForEarlyArrivalsToCheckIn() {
		parkingSensorService.checkForEarlyArrivalsToCheckIn();
	}
}