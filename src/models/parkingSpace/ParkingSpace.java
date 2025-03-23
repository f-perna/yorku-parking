package models.parkingSpace;

import java.util.UUID;

import models.parkingLot.ParkingLot;

public class ParkingSpace {

	public static enum ParkingSpaceStatus {
		OCCUPIED, AVAILABLE, BOOKED, DISABLED
	}

	private UUID id;
	private ParkingLot parkingLot;
	private ParkingSpaceStatus status = ParkingSpaceStatus.AVAILABLE;;
	private String name;
	private boolean enabled = true;

	public ParkingSpace(ParkingLot parkingLot, String name) {
		this.id = UUID.randomUUID();
		this.parkingLot = parkingLot;
		this.name = name;
	}

	// Constructor to retrieve data from ParkingSpaces.csv
	public ParkingSpace(UUID id, ParkingLot parkingLot, ParkingSpaceStatus status, String name, boolean enabled) {
		this.parkingLot = parkingLot;
		this.id = id;
		this.status = status;
		this.name = name;
		this.enabled = enabled;
	}

	public UUID getID() {
		return id;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public ParkingLot getLot() {
		return parkingLot;
	}

	public ParkingSpaceStatus getStatus() {
		return status;
	}

	public String getName() {
		return name;
	}

	public void setStatus(ParkingSpaceStatus parkingStatus) {
		this.status = parkingStatus;
	}

	@Override
	public String toString() {
		return name;
	}

}
