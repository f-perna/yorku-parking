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
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;

public class ParkingSpaceService {
	private static final int MAX_SPACES_PER_LOT = 100;
	private final ParkingSpaceRepository parkingSpaceRepository;
	private final ParkingSensorRepository parkingSensorRepository;
	private final AuthenticationState authState;

	public ParkingSpaceService(ParkingSpaceRepository parkingSpaceRepository) {
		this.parkingSpaceRepository = parkingSpaceRepository;
		this.parkingSensorRepository = null;
		this.authState = AuthenticationState.getInstance();
	}

	public ParkingSpaceService(ParkingSpaceRepository parkingSpaceRepository,
			ParkingSensorRepository parkingSensorRepository) {
		this.parkingSpaceRepository = parkingSpaceRepository;
		this.parkingSensorRepository = parkingSensorRepository;
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

		// Check for duplicate space names within the same lot
		for (ParkingSpace space : existingSpaces) {
			if (space.getName().equalsIgnoreCase(spaceName.trim())) {
				throw new ParkingSystemException("A parking space with name '" + spaceName.trim()
						+ "' already exists in lot '" + lot.getName() + "'", ErrorType.VALIDATION);
			}
		}

		// Create the new parking space
		ParkingSpace newSpace = parkingSpaceRepository.addParkingSpace(lot, spaceName.trim());

		// Create a sensor for the new space if the repository is available
		if (parkingSensorRepository != null) {
			parkingSensorRepository.createSensor(newSpace);
		}
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