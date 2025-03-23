package models.parkingSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.ParkingSpaceCSVProcessor;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;
import models.payment.Payment;

public class ParkingSpaceModel {
	private List<ParkingSpace> parkingSpaces;

	public ParkingSpaceModel() {
		this.parkingSpaces = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		parkingSpaces = ParkingSpaceCSVProcessor.readSpaceData();
	}

	public ParkingSpace getParkingSpaceById(UUID id) {
		for (ParkingSpace space : parkingSpaces) {
			if (space.getID().equals(id)) {
				return space;
			}
		}
		return null;
	}

	public List<ParkingSpace> getAvailableSpaces(ParkingLot lot) {
		List<ParkingSpace> availableSpaces = new ArrayList<>();
		for (ParkingSpace space : parkingSpaces) {
			if (space.getLot().equals(lot) && space.getStatus() == ParkingSpaceStatus.AVAILABLE) {
				availableSpaces.add(space);
			}
		}
		return availableSpaces;
	}

	public ParkingSpace updateParkingSpaceStatus(ParkingSpace space, ParkingSpaceStatus newStatus) {
		System.out.println("ParkingSpaceModel: Updating space " + space.getID() + " status from " + space.getStatus()
				+ " to " + newStatus);

		ParkingSpace storedSpace = getParkingSpaceByID(space.getID());
		if (storedSpace == null) {
			throw new IllegalArgumentException("Parking space with ID " + space.getID() + " does not exist.");
		}

		storedSpace.setStatus(newStatus);
		saveSpaces();

		return storedSpace;
	}

	public void addParkingSpace(ParkingLot lot, String name) {
		ParkingSpace newSpace = new ParkingSpace(UUID.randomUUID(), lot, ParkingSpaceStatus.AVAILABLE, name);
		parkingSpaces.add(newSpace);
		saveSpaces();
	}

	public ParkingSpace getParkingSpaceByID(UUID parkingSpaceID) {
		for (ParkingSpace parkingSpace : parkingSpaces) {
			if (parkingSpace.getID().equals(parkingSpaceID)) {
				return parkingSpace;
			}
		}
		return null;
	}

	public List<ParkingSpace> getAllSpaces() {
		return new ArrayList<>(parkingSpaces);
	}

	public List<ParkingSpace> getSpacesForLot(UUID lotId) {
		List<ParkingSpace> lotSpaces = new ArrayList<>();
		for (ParkingSpace space : parkingSpaces) {
			if (space.getLot().getID().equals(lotId)) {
				lotSpaces.add(space);
			}
		}
		return lotSpaces;
	}

	private void saveSpaces() {
		ParkingSpaceCSVProcessor.setSpaceData(parkingSpaces);
	}
}