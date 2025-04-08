package models.parkingLot;

import java.util.UUID;

public class ParkingLot {

	private String name;
	private UUID id;
	private boolean enabled = true;

	public ParkingLot(String name) {
		this.id = UUID.randomUUID();
		this.name = name;
	}

	// Constructor to retrieve data from bookings.csv
	public ParkingLot(String name, UUID id, boolean enabled) {
		this.name = name;
		this.id = id;
		this.enabled = enabled;
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

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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
