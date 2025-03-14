package parking;

import java.util.UUID;

public class ParkingSpace {
	
	private UUID id;
	private ParkingLot parkingLot;
	
	public ParkingSpace(UUID id, ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
		this.id = id;
	}
	
	public UUID getID() {
		return id;
	}
	
}
