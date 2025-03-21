package services.impl;

import java.util.List;
import java.util.UUID;

import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpaceModel;
import models.parkingSpace.ParkingSpace.ParkingStatus;
import services.ParkingSpaceService;

public class ParkingSpaceServiceImpl implements ParkingSpaceService {
	private ParkingSpaceModel parkingSpaceModel;

	public ParkingSpaceServiceImpl(ParkingSpaceModel parkingSpaceModel) {
		this.parkingSpaceModel = parkingSpaceModel;
	}

	@Override
	public List<ParkingSpace> getAvailableSpaces(ParkingLot lot) {
		if (lot == null) {
			throw new IllegalArgumentException("Parking lot cannot be null");
		}

		return parkingSpaceModel.getAvailableSpaces(lot);
	}

	@Override
	public void addParkingSpace(ParkingLot lot, String spaceName, Client client) {
		if (lot == null) {
			throw new IllegalArgumentException("Lot cannot be null");
		}
		if (spaceName == null || spaceName.trim().isEmpty()) {
			throw new IllegalArgumentException("Space name cannot be empty");
		}

		if (client == null || client.getType() != Client.type.FACULTY) {
			throw new IllegalStateException("Only faculty members can add parking spaces");
		}

		parkingSpaceModel.addParkingSpace(lot, spaceName.trim());
	}

	@Override
	public void setSpaceStatus(UUID spaceId, ParkingStatus newStatus, Client client) {
		if (spaceId == null) {
			throw new IllegalArgumentException("Space ID cannot be null");
		}
		if (newStatus == null) {
			throw new IllegalArgumentException("Status cannot be null");
		}

		if (client == null || client.getType() != Client.type.FACULTY) {
			throw new IllegalStateException("Only faculty members can modify parking space status");
		}

		ParkingSpace space = parkingSpaceModel.getParkingSpaceById(spaceId);
		if (space == null) {
			throw new IllegalArgumentException("Parking space not found");
		}

		parkingSpaceModel.updateParkingSpaceStatus(space, newStatus);
	}

	@Override
	public ParkingSpace getParkingSpaceById(UUID spaceId) {
		if (spaceId == null) {
			throw new IllegalArgumentException("Space ID cannot be null");
		}

		ParkingSpace space = parkingSpaceModel.getParkingSpaceById(spaceId);
		if (space == null) {
			throw new IllegalArgumentException("Parking space not found");
		}

		return space;
	}

	@Override
	public List<ParkingSpace> getSpacesForLot(UUID lotId) {
		if (lotId == null) {
			throw new IllegalArgumentException("Lot ID cannot be null");
		}
		return parkingSpaceModel.getSpacesForLot(lotId);
	}

	@Override
	public List<ParkingSpace> getAllSpaces() {
		return parkingSpaceModel.getAllSpaces();
	}
}