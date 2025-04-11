package services;

import java.time.LocalDateTime;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
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
	
	public void removeSensor(ParkingSpace parkingSpace) {
		parkingSensorRepository.removeSensor(parkingSpace);
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
		
		
		System.out.println("HELLO");
		Booking booking = bookingRepository.getActiveBookingForSpace(sensor.getParkingSpace());
		if (booking != null) {
			bookingRepository.checkInBooking(booking);
		}
		parkingSensorRepository.updateSensor(sensor);
	}

	@Override
	public void onCarRemoved(ParkingSensor sensor, LocalDateTime removalTime) {
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
		ParkingSensor sensor = getSensorForSpace(parkingSpace);

		if (sensor.isCarPresent()) {
			System.out.println("Space is already occupied. Cannot park.");
			return false;
		}

		sensor.detectCar(licencePlate);
//		parkingSensorRepository.updateSensor(sensor);
		return true;
	}

	public void simulateCarDeparture(ParkingSpace parkingSpace, String licencePlate) {
		ParkingSensor sensor = getSensorForSpace(parkingSpace);

		if (!sensor.isCarPresent()) {
			throw new ParkingSystemException("Space is not occupied, cannot remove car.", ErrorType.BUSINESS_LOGIC);
		}

		String parkedLicencePlate = sensor.getDetectedLicencePlate();
		if (!parkedLicencePlate.equals(licencePlate)) {
			throw new ParkingSystemException("Could not depart parking space. Car does not belong to you!",
					ErrorType.BUSINESS_LOGIC);
		}

		sensor.removeCar();
//		parkingSensorRepository.updateSensor(sensor);
	}

	public boolean isClientCarParkedAnywhere(String licencePlate) {
		if (licencePlate == null || licencePlate.trim().isEmpty()) {
			return false;
		}

		// Check all sensors to see if any has detected this licence plate
		for (ParkingSensor sensor : parkingSensorRepository.getAllSensors()) {
			if (sensor.isCarPresent() && licencePlate.equals(sensor.getDetectedLicencePlate())) {
				return true;
			}
		}

		return false;
	}
}