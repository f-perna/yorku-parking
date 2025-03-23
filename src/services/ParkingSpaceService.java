package services;

import java.util.List;
import java.util.UUID;

import models.client.Client;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;
import repositories.ParkingSpaceRepository;

public class ParkingSpaceService {
	private ParkingSpaceRepository parkingSpaceModel;

	public ParkingSpaceService(ParkingSpaceRepository parkingSpaceModel) {
		this.parkingSpaceModel = parkingSpaceModel;
	}

	public ParkingSpaceRepository getParkingSpaceModel() {
		return this.parkingSpaceModel;
	}

	public List<ParkingSpace> getAvailableSpaces(ParkingLot lot) {
		if (lot == null) {
			throw new IllegalArgumentException("Parking lot cannot be null");
		}

		return parkingSpaceModel.getAvailableSpaces(lot);
	}

	public void addParkingSpace(ParkingLot lot, String spaceName) {
		if (lot == null) {
			throw new IllegalArgumentException("Lot cannot be null");
		}
		if (spaceName == null || spaceName.trim().isEmpty()) {
			throw new IllegalArgumentException("Space name cannot be empty");
		}

		parkingSpaceModel.addParkingSpace(lot, spaceName.trim());
	}

	public void addParkingSpace(ParkingLot lot, String spaceName, Manager manager) {
		if (lot == null) {
			throw new IllegalArgumentException("Lot cannot be null");
		}
		if (spaceName == null || spaceName.trim().isEmpty()) {
			throw new IllegalArgumentException("Space name cannot be empty");
		}

		if (manager == null) {
			throw new IllegalStateException("Only managers can add parking spaces");
		}

		parkingSpaceModel.addParkingSpace(lot, spaceName.trim());
	}

	public ParkingSpace setSpaceStatus(UUID spaceId, ParkingSpaceStatus newStatus, Client client) {
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

		ParkingSpace updatedSpace = parkingSpaceModel.updateParkingSpaceStatus(space, newStatus);
		return updatedSpace;
	}

	// public void enableParkingSpace(ParkingSpace parkingSpace) {
	// if (parkingSpace.getStatus() == ParkingSpaceStatus.DISABLED) {
	// parkingSpaceModel.updateParkingSpaceStatus(parkingSpace.getID(),
	// ParkingSpaceStatus.AVAILABLE);
	// }
	// }
	//
	// public void disableParkingSpace(ParkingSpace parkingSpace) {
	// if (parkingSpace.getStatus() == ParkingSpaceStatus.AVAILABLE) {
	// parkingSpaceModel.updateParkingSpaceStatus(parkingSpace,
	// ParkingSpaceStatus.DISABLED);
	// } else {
	// throw new IllegalStateException("Cannot disable a space that is currently " +
	// parkingSpace.getStatus());
	// }
	// }

	// public ParkingSpace enableParkingSpace(ParkingSpace parkingSpace) {
	// if (parkingSpace.getStatus() == ParkingSpaceStatus.DISABLED) {
	// return parkingSpaceModel.updateParkingSpaceStatus(parkingSpace,
	// ParkingSpaceStatus.AVAILABLE);
	// }
	// return parkingSpace;
	// }
	//
	// public ParkingSpace disableParkingSpace(ParkingSpace parkingSpace) {
	// if (parkingSpace.getStatus() == ParkingSpaceStatus.AVAILABLE) {
	// return parkingSpaceModel.updateParkingSpaceStatus(parkingSpace,
	// ParkingSpaceStatus.DISABLED);
	// } else {
	// throw new IllegalStateException("Cannot disable a space that is currently " +
	// parkingSpace.getStatus());
	// }
	// }

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

	public List<ParkingSpace> getSpacesForLot(UUID lotId) {
		if (lotId == null) {
			throw new IllegalArgumentException("Lot ID cannot be null");
		}
		return parkingSpaceModel.getSpacesForLot(lotId);
	}

	public List<ParkingSpace> getAllSpaces() {
		return parkingSpaceModel.getAllSpaces();
	}
}