package services;

import java.time.LocalDateTime;

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

			if (now.isBefore(startTime)) {
				System.out.println("Parking rejected: Too early for booking " + booking.getBookingID()
						+ ". Parking allowed from " + startTime);
				return;
			}

			if (now.isAfter(endTime)) {
				System.out.println("Parking rejected: Booking " + booking.getBookingID() + " expired at " + endTime);
				return;
			}

			if (licencePlate.equals(booking.getLicencePlate())) {
				System.out.println("Authorized car detected for booking: " + booking.getBookingID());
			} else {
				System.out.println("Unauthorized car detected in booked space: " + licencePlate);
			}
		} else if (parkingSpace.getStatus() == ParkingSpaceStatus.AVAILABLE) {
			System.out.println("Car detected in available space: " + licencePlate);
		}

		parkingSensorRepository.updateSensor(sensor);
	}

	@Override
	public void onCarRemoved(ParkingSensor sensor, LocalDateTime removalTime) {
		ParkingSpace parkingSpace = sensor.getParkingSpace();

		Booking booking = bookingRepository.getActiveBookingForSpace(parkingSpace);

		if (booking != null) {
			System.out.println("Car departed from space with booking: " + booking.getBookingID());
		} else {
			System.out.println("Car departed from space: " + parkingSpace.getName());
		}

		parkingSensorRepository.updateSensor(sensor);
	}

	public void checkForNoShows() {
		LocalDateTime now = LocalDateTime.now();

		for (Booking booking : bookingRepository.getConfirmedBookings()) {
			if (booking.getStartTime().plusHours(1).isBefore(now)) {
				ParkingSpace space = booking.getParkingSpace();
				ParkingSensor sensor = getSensorForSpace(space);

				if (!sensor.isCarPresent()) {
					bookingRepository.noShowBooking(booking);
					parkingSpaceRepository.updateParkingSpaceStatus(space, ParkingSpaceStatus.AVAILABLE);
					System.out.println("Booking marked as no-show: " + booking.getBookingID());
				}
			}
		}
	}

	/**
	 * Checks for early arrivals that should now be checked in because their booking
	 * period has started
	 */
	public void checkForEarlyArrivalsToCheckIn() {
		LocalDateTime now = LocalDateTime.now();

		for (Booking booking : bookingRepository.getConfirmedBookings()) {
			// If booking start time has passed and we're not yet past 1 hour into the
			// booking
			if (booking.getStartTime().isBefore(now) && booking.getStartTime().plusHours(1).isAfter(now)) {
				ParkingSpace space = booking.getParkingSpace();
				ParkingSensor sensor = getSensorForSpace(space);

				// If car is present but booking is still in CONFIRMED state (early arrival)
				if (sensor.isCarPresent() && booking.getStatus() == BookingStatus.CONFIRMED) {
					String detectedPlate = sensor.getDetectedLicencePlate();

					// Verify this is the right car for this booking
					if (detectedPlate != null && detectedPlate.equals(booking.getLicencePlate())) {
						System.out.println("Checking in early arrival for booking: " + booking.getBookingID());
						bookingRepository.checkInBooking(booking);
					}
				}
			}
		}
	}

	public boolean simulateCarArrival(ParkingSpace parkingSpace, String licencePlate) {
		return simulateCarArrival(parkingSpace, licencePlate, true);
	}

	public boolean simulateCarArrival(ParkingSpace parkingSpace, String licencePlate, boolean shouldCheckIn) {
		ParkingSensor sensor = getSensorForSpace(parkingSpace);

		if (sensor.isCarPresent()) {
			System.out.println("Space is already occupied. Cannot park.");
			return false;
		}

		Booking booking = bookingRepository.getActiveBookingForSpace(parkingSpace);

		if (booking != null && booking.getStatus() == BookingStatus.CONFIRMED
				&& licencePlate.equals(booking.getLicencePlate()) && shouldCheckIn) {
			System.out.println("Checking in booking: " + booking.getBookingID());
			bookingRepository.checkInBooking(booking);
		} else if (booking != null && booking.getStatus() == BookingStatus.CONFIRMED
				&& licencePlate.equals(booking.getLicencePlate()) && !shouldCheckIn) {
			System.out.println(
					"Car detected for booking " + booking.getBookingID() + " but not checking in yet (early arrival)");
		}

		sensor.detectCar(licencePlate);
		parkingSensorRepository.updateSensor(sensor);
		return true;
	}

	public void simulateCarDeparture(ParkingSpace parkingSpace) {
		ParkingSensor sensor = getSensorForSpace(parkingSpace);
		sensor.removeCar();
		parkingSensorRepository.updateSensor(sensor);
	}

	/**
	 * Checks if a client's car (identified by licence plate) is currently
	 * parked in any parking space in the system.
	 * 
	 * @param licencePlate The licence plate to check for
	 * @return true if the car is present in any space, false otherwise
	 */
	public boolean isClientCarParkedAnywhere(String licencePlate) {
		if (licencePlate == null || licencePlate.trim().isEmpty()) {
			return false;
		}

		// Check all sensors to see if any has detected this licence plate
		for (ParkingSensor sensor : parkingSensorRepository.getAllSensors()) {
			if (sensor.isCarPresent() &&
					licencePlate.equals(sensor.getDetectedLicencePlate())) {
				return true;
			}
		}

		return false;
	}
}