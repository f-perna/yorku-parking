package models.parkingSensor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import models.booking.Booking;
import models.parkingSpace.ParkingSpace;

public class ParkingSensor {
	private UUID id;
	private ParkingSpace parkingSpace;
	private boolean carPresent = false;
	private String detectedLicencePlate = null;
	private LocalDateTime lastDetectionTime;
	private List<ParkingSensorListener> listeners = new ArrayList<>();

	public ParkingSensor(ParkingSpace parkingSpace) {
		this.id = UUID.randomUUID();
		this.parkingSpace = parkingSpace;
	}

	public ParkingSensor(ParkingSpace parkingSpace, UUID id) {
		this.id = id;
		this.parkingSpace = parkingSpace;
	}

	public void initializeWithCar(String licencePlate) {
		this.carPresent = true;
		this.detectedLicencePlate = licencePlate;
		this.lastDetectionTime = LocalDateTime.now();
	}

	public void addListener(ParkingSensorListener listener) {
		if (!listeners.contains(listener)) {
			listeners.add(listener);
		}
	}

	public void removeListener(ParkingSensorListener listener) {
		listeners.remove(listener);
	}

	public void detectCar(String licencePlate) {
		if (!carPresent || !licencePlate.equals(detectedLicencePlate)) {
			carPresent = true;
			detectedLicencePlate = licencePlate;
			lastDetectionTime = LocalDateTime.now();

			// Notify all listeners about the car detection event
			for (ParkingSensorListener listener : listeners) {
				listener.onCarDetected(this, licencePlate, lastDetectionTime);
			}
		}
	}

	public void removeCar() {
		if (carPresent) {
			carPresent = false;
			detectedLicencePlate = null;
			LocalDateTime removalTime = LocalDateTime.now();

			// Notify all listeners about the car removal event
			for (ParkingSensorListener listener : listeners) {
				listener.onCarRemoved(this, removalTime);
			}
		}
	}

	public UUID getId() {
		return id;
	}

	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}

	public boolean isCarPresent() {
		return carPresent;
	}

	public String getDetectedLicencePlate() {
		return detectedLicencePlate;
	}

	public LocalDateTime getLastDetectionTime() {
		return lastDetectionTime;
	}

	public boolean isBookingOwnerCar(Booking booking) {
		if (!carPresent || detectedLicencePlate == null || booking == null) {
			return false;
		}

		return detectedLicencePlate.equals(booking.getLicencePlate());
	}
}