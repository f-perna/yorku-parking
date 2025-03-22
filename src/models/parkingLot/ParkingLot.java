package models.parkingLot;

import java.util.UUID;

public class ParkingLot {

	private String name;
	private UUID id;
	// add status

	public ParkingLot(String name, UUID id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public UUID getID() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(UUID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		ParkingLot other = (ParkingLot) obj;
		return id.equals(other.id);
	}
}
