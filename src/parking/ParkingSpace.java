package parking;

import java.util.UUID;

public class ParkingSpace {
	
	public static enum ParkingStatus {
		OCCUPIED, AVAILABLE, BOOKED, MAINTENANCE
	}
	
	private UUID id;
	private ParkingLot parkingLot;
	private ParkingStatus status;
	
	public ParkingSpace(UUID id, ParkingLot parkingLot, ParkingStatus status) {
		this.parkingLot = parkingLot;
		this.id = id;
		this.status = status;
	}
	
	public UUID getID() {
		return id;
	}
	
	public ParkingLot getLot() {
		return parkingLot;
	}
	
}
