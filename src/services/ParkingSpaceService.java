package services;

import java.util.List;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.client.Client;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;
import repositories.ParkingSpaceRepository;

public class ParkingSpaceService {
	private static final int MAX_SPACES_PER_LOT = 100;
	private ParkingSpaceRepository parkingSpaceRepository;
	private AuthenticationState authState;

	public ParkingSpaceService(ParkingSpaceRepository parkingSpaceRepository) {
		this.parkingSpaceRepository = parkingSpaceRepository;
		this.authState = AuthenticationState.getInstance();
	}

	public List<ParkingSpace> getAvailableSpaces(ParkingLot lot) {
		if (lot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}

		return parkingSpaceRepository.getAvailableSpaces(lot);
	}

	public void addParkingSpace(ParkingLot lot, String spaceName) {
		if (!authState.isManagerLoggedIn()) {
			throw new ParkingSystemException("Only managers can add parking spaces", ErrorType.AUTHORIZATION);
		}

		if (lot == null) {
			throw new ParkingSystemException("Lot cannot be null", ErrorType.VALIDATION);
		}
		if (spaceName == null || spaceName.trim().isEmpty()) {
			throw new ParkingSystemException("Space name cannot be empty", ErrorType.VALIDATION);
		}

		List<ParkingSpace> existingSpaces = parkingSpaceRepository.getSpacesForLot(lot.getID());
		if (existingSpaces.size() >= MAX_SPACES_PER_LOT) {
			throw new ParkingSystemException("Parking lot '" + lot.getName() + "' already has the maximum of "
					+ MAX_SPACES_PER_LOT + " spaces allowed", ErrorType.BUSINESS_LOGIC);
		}

		parkingSpaceRepository.addParkingSpace(lot, spaceName.trim());
	}

	public ParkingSpace enableParkingSpace(ParkingSpace parkingSpace) {
		if (!authState.isManagerLoggedIn()) {
			throw new ParkingSystemException("Only managers can enable parking spaces", ErrorType.AUTHORIZATION);
		}

		if (parkingSpace == null) {
			throw new ParkingSystemException("Parking space cannot be null", ErrorType.VALIDATION);
		}

		ParkingSpace space = parkingSpaceRepository.getParkingSpaceById(parkingSpace.getID());

		if (space.isEnabled()) {
			throw new ParkingSystemException("Space is already enabled", ErrorType.BUSINESS_LOGIC);
		}

		space.setEnabled(true);
		return parkingSpaceRepository.updateParkingSpaceStatus(space, space.getStatus());
	}

	public ParkingSpace disableParkingSpace(ParkingSpace parkingSpace) {
		if (!authState.isManagerLoggedIn()) {
			throw new ParkingSystemException("Only managers can disable parking spaces", ErrorType.AUTHORIZATION);
		}

		if (parkingSpace == null) {
			throw new ParkingSystemException("Parking space cannot be null", ErrorType.VALIDATION);
		}

		ParkingSpace space = parkingSpaceRepository.getParkingSpaceById(parkingSpace.getID());

		if (!space.isEnabled()) {
			throw new ParkingSystemException("Space is already disabled", ErrorType.BUSINESS_LOGIC);
		}

		space.setEnabled(false);

		return parkingSpaceRepository.updateParkingSpaceStatus(space, space.getStatus());
	}

	public ParkingSpace getParkingSpaceById(UUID spaceId) {
		if (spaceId == null) {
			throw new ParkingSystemException("Space ID cannot be null", ErrorType.VALIDATION);
		}

		ParkingSpace space = parkingSpaceRepository.getParkingSpaceById(spaceId);
		if (space == null) {
			throw new ParkingSystemException("Parking space not found", ErrorType.DATA_ACCESS);
		}

		return space;
	}

	public List<ParkingSpace> getSpacesForLot(UUID lotId) {
		if (lotId == null) {
			throw new ParkingSystemException("Lot ID cannot be null", ErrorType.VALIDATION);
		}
		return parkingSpaceRepository.getSpacesForLot(lotId);
	}

	public List<ParkingSpace> getAllSpaces() {
		return parkingSpaceRepository.getAllSpaces();
	}
}