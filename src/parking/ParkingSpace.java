package parking;

import java.util.UUID;

public class ParkingSpace {
	
	public static enum ParkingStatus {
		OCCUPIED, AVAILABLE, BOOKED, MAINTENANCE
	}
	
	private UUID id;
	private ParkingLot parkingLot;
	private ParkingStatus status;
	private String name;
	
	public ParkingSpace(UUID id, ParkingLot parkingLot, ParkingStatus status, String name) {
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
	
	public ParkingStatus getStatus() {
		return status;
	}
	
	public String getName() {
		return name;
	}
	
	public void setStatus(ParkingStatus parkingStatus) {
		this.status = parkingStatus;
	}
	
	@Override
    public String toString() {
		return name;
	}
	
}
