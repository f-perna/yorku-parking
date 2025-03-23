package models.parkingSpace;

import java.util.UUID;

import models.parkingLot.ParkingLot;

public class ParkingSpace {

	public static enum ParkingSpaceStatus {
		OCCUPIED, AVAILABLE, BOOKED, DISABLED
	}

	private UUID id;
	private ParkingLot parkingLot;
	private ParkingSpaceStatus status;
	private String name;

	public ParkingSpace(ParkingLot parkingLot, String name) {
		this.id = UUID.randomUUID();
		this.parkingLot = parkingLot;
		this.name = name;
	}
	
	// Constructor to retrieve data from ParkingSpaces.csv
	public ParkingSpace(UUID id, ParkingLot parkingLot, ParkingSpaceStatus status, String name) {
		this.parkingLot = parkingLot;
		this.id = id;
		this.status = status;
		this.name = name;
	}

	public UUID getID() {
		return id;
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
