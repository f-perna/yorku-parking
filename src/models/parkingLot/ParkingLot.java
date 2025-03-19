package models.parkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingStatus;

public class ParkingLot {
	
	private String name;
	private UUID id;
	private List<ParkingSpace> parkingSpaces;
	
	
	public ParkingLot(String name, UUID id) {
		this.parkingSpaces = new ArrayList<>();
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public UUID getID() {
		return id;
	}
	
	public void addParkingSpace(ParkingSpace parkingSpace) {
		parkingSpaces.add(parkingSpace);
	}
	
	public void addParkingSpace(UUID id, ParkingStatus status, String name) {
		parkingSpaces.add(new ParkingSpace(id, this, status, name));
	}
	
	public List<ParkingSpace> getParkingSpaces() {
		return parkingSpaces;
	}
	
	@Override
    public String toString() {
		return name;
    }
}
