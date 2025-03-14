package parking;

public class ParkingSpace {
	
	private int id;
	private ParkingLot parkingLot;
	
	public ParkingSpace(int id, ParkingLot parkingLot) {
		this.parkingLot = parkingLot;
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
	
}
