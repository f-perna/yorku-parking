package models.parkingSpace;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.CSVProcessor;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace.ParkingStatus;

public class ParkingSpaceModel {
	private List<ParkingSpace> parkingSpaces;

	public ParkingSpaceModel() {
		this.parkingSpaces = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		parkingSpaces = CSVProcessor.readSpaceData();
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
			if (space.getLot().equals(lot) && space.getStatus() == ParkingStatus.AVAILABLE) {
				availableSpaces.add(space);
			}
		}
		return availableSpaces;
	}

	public void updateParkingSpaceStatus(ParkingSpace space, ParkingStatus newStatus) {
		System.out.println("ParkingSpaceModel: Updating space " + space.getID() + " status from " + space.getStatus()
				+ " to " + newStatus);
		space.setStatus(newStatus);
		saveSpaces();
	}

	public void addParkingSpace(ParkingLot lot, String name) {
		ParkingSpace newSpace = new ParkingSpace(UUID.randomUUID(), lot, ParkingStatus.AVAILABLE, name);
		parkingSpaces.add(newSpace);
		saveSpaces();
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
		System.out.println("ParkingSpaceModel: Saving " + parkingSpaces.size() + " spaces to database");
		CSVProcessor.setSpaceData(parkingSpaces);
		System.out.println("ParkingSpaceModel: Database save completed");
	}
}