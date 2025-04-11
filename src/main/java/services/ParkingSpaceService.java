package services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSensor.ParkingSensor;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;

public class ParkingSpaceService {
	private static final int MAX_SPACES_PER_LOT = 100;
	private final ParkingSpaceRepository parkingSpaceRepository;
	private final ParkingSensorRepository parkingSensorRepository;
	private final AuthenticationState authState;

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

		List<ParkingSpace> availableSpaces = parkingSpaceRepository.getAvailableSpaces(lot);
		List<ParkingSpace> unOccupiedAvailableSpaces = new ArrayList<>();

		for (ParkingSpace space : availableSpaces) {
			ParkingSensor sensor = parkingSensorRepository.getSensorBySpaceId(space.getID());

			// If no sensor exists yet or no car is present, the space is truly available
			if (sensor == null || !sensor.isCarPresent()) {
				unOccupiedAvailableSpaces.add(space);
			}
		}

		return unOccupiedAvailableSpaces;
	}

	public List<ParkingSpace> getBookedSpaces(ParkingLot lot) {
		if (lot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}

		List<ParkingSpace> bookedSpaces = parkingSpaceRepository.getBookedSpaces(lot);
		return bookedSpaces;
	}

	public List<ParkingSpace> getOccupiedSpaces(ParkingLot lot) {
		if (lot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}

		List<ParkingSpace> allSpaces = parkingSpaceRepository.getSpacesForLot(lot.getID());
		List<ParkingSpace> occupiedSpaces = new ArrayList<>();

		for (ParkingSpace space : allSpaces) {
			ParkingSensor sensor = parkingSensorRepository.getSensorBySpaceId(space.getID());

			// A space is occupied only if it has a sensor AND that sensor detects a car
			if (sensor != null && sensor.isCarPresent()) {
				occupiedSpaces.add(space);
			}
		}

		return occupiedSpaces;
	}

	public List<ParkingSpace> getUnOccupiedSpaces(ParkingLot lot) {
		if (lot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}

		List<ParkingSpace> allSpaces = parkingSpaceRepository.getSpacesForLot(lot.getID());
		List<ParkingSpace> unOccupiedSpaces = new ArrayList<>();

		for (ParkingSpace space : allSpaces) {
			ParkingSensor sensor = parkingSensorRepository.getSensorBySpaceId(space.getID());

			// A space is unoccupied if it has no sensor OR its sensor doesn't detect a car
			if (sensor == null || !sensor.isCarPresent()) {
				unOccupiedSpaces.add(space);
			}
		}

		return unOccupiedSpaces;
	}
	
	public List<ParkingSpace> getEnabledSpaces(ParkingLot lot) {
		if (lot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}
		
		return parkingSpaceRepository.getEnabledSpaces(lot);
	}
	
	public List<ParkingSpace> getDisabledSpaces(ParkingLot lot) {
		if (lot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}
		
		return parkingSpaceRepository.getDisabledSpaces(lot);
	}

	public void addParkingSpace(ParkingLot lot, String spaceName) {
		if (!authState.isManagerLoggedIn()) {
			throw new ParkingSystemException("Only managers can add parking spaces", ErrorType.AUTHORIZATION);
		}

		if (lot == null) {
			throw new ParkingSystemException("Space cannot be null", ErrorType.VALIDATION);
		}
		if (spaceName == null || spaceName.trim().isEmpty()) {
			throw new ParkingSystemException("Space name cannot be empty", ErrorType.VALIDATION);
		}

		List<ParkingSpace> existingSpaces = parkingSpaceRepository.getSpacesForLot(lot.getID());
		if (existingSpaces.size() >= MAX_SPACES_PER_LOT) {
			throw new ParkingSystemException("Parking lot '" + lot.getName() + "' already has the maximum of "
					+ MAX_SPACES_PER_LOT + " spaces allowed", ErrorType.BUSINESS_LOGIC);
		}

		for (ParkingSpace space : existingSpaces) {
			if (space.getName().equalsIgnoreCase(spaceName.trim())) {
				throw new ParkingSystemException("A parking space with name '" + spaceName.trim()
						+ "' already exists in lot '" + lot.getName() + "'", ErrorType.VALIDATION);
			}
		}

		ParkingSpace newSpace = parkingSpaceRepository.addParkingSpace(lot, spaceName.trim());

		parkingSensorRepository.createSensor(newSpace);

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
	
	public void removeParkingSpace(ParkingSpace parkingSpace) {
		if (parkingSpace == null) {
			throw new ParkingSystemException("Parking space cannot be null", ErrorType.VALIDATION);
		}
		parkingSpaceRepository.removeParkingSpace(parkingSpace);
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