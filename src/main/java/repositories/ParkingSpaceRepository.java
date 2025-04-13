package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import csvs.ParkingSpaceCSVProcessor;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;

public class ParkingSpaceRepository {
	private List<ParkingSpace> parkingSpaces;

	public ParkingSpaceRepository() {
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
	
	public void removeParkingSpace(ParkingSpace parkingSpace) {
		if (parkingSpace == null) {
			throw new IllegalArgumentException("Parking Space can't be null!");
		}
		parkingSpaces.remove(parkingSpace);
		saveSpaces();
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
	
	public List<ParkingSpace> getBookedSpaces(ParkingLot lot) {
		List<ParkingSpace> bookedSpaces = new ArrayList<>();
		for (ParkingSpace space : parkingSpaces) {
			if (space.getLot().equals(lot) && space.getStatus() == ParkingSpaceStatus.BOOKED) {
				bookedSpaces.add(space);
			}
		}
		
		return bookedSpaces;
	}
	
	public List<ParkingSpace> getEnabledSpaces(ParkingLot lot) {
		List<ParkingSpace> enabledSpaces = new ArrayList<>();
		
		for (ParkingSpace space : parkingSpaces) {
			if (space.isEnabled()) {
				enabledSpaces.add(space);
			}
		}
		
		return enabledSpaces;
	}
	
	public List<ParkingSpace> getDisabledSpaces(ParkingLot lot) {
		List<ParkingSpace> disabledSpaces = new ArrayList<>();
		
		for (ParkingSpace space : parkingSpaces) {
			if (!space.isEnabled()) {
				disabledSpaces.add(space);
			}
		}
		
		return disabledSpaces;
	}

	public ParkingSpace updateParkingSpaceStatus(ParkingSpace space, ParkingSpaceStatus newStatus) {
		ParkingSpace storedSpace = getParkingSpaceByID(space.getID());
		if (storedSpace == null) {
			throw new IllegalArgumentException("Parking space with ID " + space.getID() + " does not exist.");
		}

		storedSpace.setStatus(newStatus);
		saveSpaces();

		return storedSpace;
	}

	public ParkingSpace addParkingSpace(ParkingLot lot, String name) {
		ParkingSpace newSpace = new ParkingSpace(lot, name);
		parkingSpaces.add(newSpace);
		saveSpaces();
		return newSpace;
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