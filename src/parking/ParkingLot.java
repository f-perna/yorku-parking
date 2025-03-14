package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import parking.ParkingSpace;

public class ParkingLot {
	
	private String name;
	private UUID id;
	private List<ParkingSpace> parkingSpaces;
	
	
	public ParkingLot(String name, UUID id) {
		this.parkingSpaces = new ArrayList<>();
		this.name = name;
		this.id = id;
	}
	
	public UUID getID() {
		return id;
	}
	
	public void addParkingSpace(ParkingSpace parkingSpace) {
		parkingSpaces.add(parkingSpace);
	}
	
	public void addParkingSpace(UUID id) {
		parkingSpaces.add(new ParkingSpace(id, this));
	}
	
	public List<ParkingSpace> getParkingSpaces() {
		return parkingSpaces;
	}
}
