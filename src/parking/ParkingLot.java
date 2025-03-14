package parking;

import java.util.List;
import parking.ParkingSpace;

public class ParkingLot {
	
	private String name;
	private int id;
	private List<ParkingSpace> parkingSpaces;
	
	
	public ParkingLot(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
	public void addParkingSpace(ParkingSpace parkingSpace) {
		parkingSpaces.add(parkingSpace);
	}
	
	public void addParkingSpace(int id) {
		parkingSpaces.add(new ParkingSpace(id, this));
	}
	
	public List<ParkingSpace> getParkingSpaces() {
		return parkingSpaces;
	}
}
