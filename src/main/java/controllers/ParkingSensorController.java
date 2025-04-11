package controllers;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.booking.Booking;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import services.ParkingSensorService;
import java.time.LocalDateTime;

public class ParkingSensorController {
	private ParkingSensorService parkingSensorService;
	private AuthenticationState authState;

	public ParkingSensorController(ParkingSensorService parkingSensorService) {
		this.parkingSensorService = parkingSensorService;
		this.authState = AuthenticationState.getInstance();
	}

	public void simulateCarArrival(ParkingSpace parkingSpace, String licencePlate) {
		if (parkingSensorService.isCarPresentAtSpace(parkingSpace)) {
			throw new ParkingSystemException(
					"This parking space is already occupied. Please contact management if you need assistance.",
					ErrorType.BUSINESS_LOGIC);
		}

		if (licencePlate == null || licencePlate.isEmpty()) {
			throw new ParkingSystemException("You must provide a licence plate.",
					ErrorType.VALIDATION);
		}

		boolean success = parkingSensorService.simulateCarArrival(parkingSpace, licencePlate);
		if (!success) {
			throw new ParkingSystemException("Could not park your car. The space appears to be occupied.",
					ErrorType.BUSINESS_LOGIC);
		}
	}

	public void simulateCarDeparture(ParkingSpace parkingSpace, String licencePlate) {
		parkingSensorService.simulateCarDeparture(parkingSpace, licencePlate);
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