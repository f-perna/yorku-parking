package services;

import java.util.List;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
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
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}

		return parkingSpaceModel.getAvailableSpaces(lot);
	}

	public void addParkingSpace(ParkingLot lot, String spaceName) {
		if (lot == null) {
			throw new ParkingSystemException("Lot cannot be null", ErrorType.VALIDATION);
		}
		if (spaceName == null || spaceName.trim().isEmpty()) {
			throw new ParkingSystemException("Space name cannot be empty", ErrorType.VALIDATION);
		}

		parkingSpaceModel.addParkingSpace(lot, spaceName.trim());
	}

	public void addParkingSpace(ParkingLot lot, String spaceName, Manager manager) {
		if (lot == null) {
			throw new ParkingSystemException("Lot cannot be null", ErrorType.VALIDATION);
		}
		if (spaceName == null || spaceName.trim().isEmpty()) {
			throw new ParkingSystemException("Space name cannot be empty", ErrorType.VALIDATION);
		}

		if (manager == null) {
			throw new ParkingSystemException("Only managers can add parking spaces", ErrorType.AUTHORIZATION);
		}

		parkingSpaceModel.addParkingSpace(lot, spaceName.trim());
	}

	public ParkingSpace setSpaceStatus(UUID spaceId, ParkingSpaceStatus newStatus, Client client) {
		if (spaceId == null) {
			throw new ParkingSystemException("Space ID cannot be null", ErrorType.VALIDATION);
		}
		if (newStatus == null) {
			throw new ParkingSystemException("Status cannot be null", ErrorType.VALIDATION);
		}

		if (client == null || client.getType() != Client.type.FACULTY) {
			throw new ParkingSystemException("Only faculty members can modify parking space status",
					ErrorType.AUTHORIZATION);
		}

		ParkingSpace space = parkingSpaceModel.getParkingSpaceById(spaceId);
		if (space == null) {
			throw new ParkingSystemException("Parking space not found", ErrorType.DATA_ACCESS);
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
	// throw new ParkingSystemException("Cannot disable a space that is currently "
	// +
	// parkingSpace.getStatus(), ErrorType.BUSINESS_LOGIC);
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
	// throw new ParkingSystemException("Cannot disable a space that is currently "
	// +
	// parkingSpace.getStatus(), ErrorType.BUSINESS_LOGIC);
	// }
	// }

	public ParkingSpace getParkingSpaceById(UUID spaceId) {
		if (spaceId == null) {
			throw new ParkingSystemException("Space ID cannot be null", ErrorType.VALIDATION);
		}

		ParkingSpace space = parkingSpaceModel.getParkingSpaceById(spaceId);
		if (space == null) {
			throw new ParkingSystemException("Parking space not found", ErrorType.DATA_ACCESS);
		}

		return space;
	}

	public List<ParkingSpace> getSpacesForLot(UUID lotId) {
		if (lotId == null) {
			throw new ParkingSystemException("Lot ID cannot be null", ErrorType.VALIDATION);
		}
		return parkingSpaceModel.getSpacesForLot(lotId);
	}

	public List<ParkingSpace> getAllSpaces() {
		return parkingSpaceModel.getAllSpaces();
	}
}