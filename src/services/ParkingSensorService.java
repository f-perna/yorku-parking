package services;

import java.time.LocalDateTime;
import java.util.UUID;

import models.booking.Booking;
import models.booking.Booking.BookingStatus;
import models.parkingSensor.ParkingSensor;
import models.parkingSensor.ParkingSensorListener;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;
import repositories.BookingRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;

public class ParkingSensorService implements ParkingSensorListener {
	private ParkingSensorRepository parkingSensorRepository;
	private BookingRepository bookingRepository;
	private ParkingSpaceRepository parkingSpaceRepository;

	public ParkingSensorService(BookingRepository bookingRepository, ParkingSpaceRepository parkingSpaceRepository,
			ParkingSensorRepository parkingSensorRepository) {
		this.bookingRepository = bookingRepository;
		this.parkingSpaceRepository = parkingSpaceRepository;
		this.parkingSensorRepository = parkingSensorRepository;

		// Add this service as listener to all sensors
		for (ParkingSensor sensor : parkingSensorRepository.getAllSensors()) {
			sensor.addListener(this);
		}
	}

	public ParkingSensor createSensor(ParkingSpace parkingSpace) {
		ParkingSensor sensor = parkingSensorRepository.createSensor(parkingSpace);
		sensor.addListener(this);
		return sensor;
	}

	public ParkingSensor getSensorForSpace(ParkingSpace parkingSpace) {
		ParkingSensor sensor = parkingSensorRepository.getSensorBySpaceId(parkingSpace.getID());
		if (sensor == null) {
			sensor = createSensor(parkingSpace);
		}
		return sensor;
	}

	public boolean isCarPresentAtSpace(ParkingSpace parkingSpace) {
		ParkingSensor sensor = getSensorForSpace(parkingSpace);
		return sensor.isCarPresent();
	}

	public String getDetectedLicencePlate(ParkingSpace parkingSpace) {
		ParkingSensor sensor = getSensorForSpace(parkingSpace);
		return sensor.getDetectedLicencePlate();
	}

	public boolean isBookingOwnerCar(Booking booking) {
		if (booking == null) {
			return false;
		}

		ParkingSensor sensor = getSensorForSpace(booking.getParkingSpace());
		return sensor.isBookingOwnerCar(booking);
	}

	@Override
	public void onCarDetected(ParkingSensor sensor, String licencePlate, LocalDateTime detectionTime) {
		ParkingSpace parkingSpace = sensor.getParkingSpace();

		Booking booking = bookingRepository.getActiveBookingForSpace(parkingSpace);

		if (booking != null && booking.getStatus() == BookingStatus.CONFIRMED) {
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime startTime = booking.getStartTime();
			LocalDateTime endTime = booking.getEndTime();

			// Only allow parking after the booking start time
			if (now.isBefore(startTime)) {
				// Too early to park - reject the parking attempt
				System.out.println("Parking rejected: Too early for booking " + booking.getBookingID()
						+ ". Parking allowed from " + startTime);
				return;
			}

			if (now.isAfter(endTime)) {
				// Too late to park - reject the parking attempt
				System.out.println("Parking rejected: Booking " + booking.getBookingID() + " expired at " + endTime);
				return;
			}

			// Check if the detected licence plate matches the booking
			if (licencePlate.equals(booking.getLicencePlate())) {
				// This is the expected car for this booking
				System.out.println("Authorized car detected for booking: " + booking.getBookingID());
			} else {
				// Unauthorized car detected in a booked space
				System.out.println("Unauthorized car detected in booked space: " + licencePlate);
				// You might want to trigger an alert or notification here
			}
		} else if (parkingSpace.getStatus() == ParkingSpaceStatus.AVAILABLE) {
			// No booking for this space, but a car arrived
			System.out.println("Car detected in available space: " + licencePlate);
		}

		// Update the sensor in the repository
		parkingSensorRepository.updateSensor(sensor);
	}

	@Override
	public void onCarRemoved(ParkingSensor sensor, LocalDateTime removalTime) {
		ParkingSpace parkingSpace = sensor.getParkingSpace();

		// Find booking for this space
		Booking booking = bookingRepository.getActiveBookingForSpace(parkingSpace);

		if (booking != null) {
			System.out.println("Car departed from space with booking: " + booking.getBookingID());
		} else {
			System.out.println("Car departed from space: " + parkingSpace.getName());
		}

		// Update the sensor in the repository
		parkingSensorRepository.updateSensor(sensor);
	}

	/**
	 * Check for no-shows in confirmed bookings This should be called periodically
	 * by a scheduler
	 */
	public void checkForNoShows() {
		LocalDateTime now = LocalDateTime.now();

		// Get all confirmed bookings
		for (Booking booking : bookingRepository.getConfirmedBookings()) {
			// If the booking start time was more than 1 hour ago and the car isn't present
			if (booking.getStartTime().plusHours(1).isBefore(now)) {
				ParkingSpace space = booking.getParkingSpace();
				ParkingSensor sensor = getSensorForSpace(space);

				if (!sensor.isCarPresent()) {
					// Mark as no-show and make the space available again
					bookingRepository.noShowBooking(booking);
					parkingSpaceRepository.updateParkingSpaceStatus(space, ParkingSpaceStatus.AVAILABLE);
					System.out.println("Booking marked as no-show: " + booking.getBookingID());
				}
			}
		}
	}

	/**
	 * Simulate car arrival at a parking space Returns true if the car successfully
	 * parked, false if the space is already occupied
	 */
	public boolean simulateCarArrival(ParkingSpace parkingSpace, String licencePlate) {
		ParkingSensor sensor = getSensorForSpace(parkingSpace);

		// Check if the space is already occupied
		if (sensor.isCarPresent()) {
			System.out.println("Space is already occupied. Cannot park.");
			return false;
		}

		// Find booking for this space
		Booking booking = bookingRepository.getActiveBookingForSpace(parkingSpace);

		// If the booking is CONFIRMED and the licence plate matches, check in the
		// booking
		if (booking != null && booking.getStatus() == BookingStatus.CONFIRMED
				&& licencePlate.equals(booking.getLicencePlate())) {
			System.out.println("Checking in booking: " + booking.getBookingID());
			bookingRepository.checkInBooking(booking);
		}

		sensor.detectCar(licencePlate);
		parkingSensorRepository.updateSensor(sensor);
		return true;
	}

	/**
	 * Simulate car departure from a parking space
	 */
	public void simulateCarDeparture(ParkingSpace parkingSpace) {
		ParkingSensor sensor = getSensorForSpace(parkingSpace);
		sensor.removeCar();
		parkingSensorRepository.updateSensor(sensor);
	}
}