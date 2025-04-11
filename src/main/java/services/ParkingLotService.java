package services;

import java.util.List;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.parkingLot.ParkingLot;
import repositories.ParkingLotRepository;

public class ParkingLotService {
	private ParkingLotRepository parkingLotRepository;
	private AuthenticationState authState;

	public ParkingLotService(ParkingLotRepository parkingLotRepository) {
		if (parkingLotRepository == null) {
			throw new ParkingSystemException("Parking lot repository cannot be null", ErrorType.VALIDATION);
		}
		this.parkingLotRepository = parkingLotRepository;
		this.authState = AuthenticationState.getInstance();
	}

	private void managerAuth() {
		if (!authState.isManagerLoggedIn()) {
			throw new ParkingSystemException("Manager must be logged in to add parking lots", ErrorType.AUTHORIZATION);
		}
	}

	public List<ParkingLot> getAllParkingLots() {
		return parkingLotRepository.getAllParkingLots();
	}

	public void addParkingLot(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new ParkingSystemException("Parking lot name cannot be null or empty", ErrorType.VALIDATION);
		}
		managerAuth();
		parkingLotRepository.addParkingLot(name);
	}

	public void removeParkingLot(ParkingLot parkingLot) {
		if (parkingLot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}
		managerAuth();
		parkingLotRepository.removeParkingLot(parkingLot.getID());
	}

	public boolean enableParkingLot(ParkingLot parkingLot) {
		if (parkingLot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}
		managerAuth();
		return parkingLotRepository.enableParkingLot(parkingLot);
	}

	public boolean disableParkingLot(ParkingLot parkingLot) {
		if (parkingLot == null) {
			throw new ParkingSystemException("Parking lot cannot be null", ErrorType.VALIDATION);
		}
		managerAuth();
		return parkingLotRepository.disableParkingLot(parkingLot);
	}

	public List<ParkingLot> getAllEnabledParkingLots() {
		return parkingLotRepository.getAllEnabledParkingLots();
	}

	public List<ParkingLot> getAllDisabledParkingLots() {
		return parkingLotRepository.getAllDisabledParkingLots();
	}

	public ParkingLot getParkingLotByName(String name) {
		if (name == null || name.trim().isEmpty()) {
			throw new ParkingSystemException("Parking lot name cannot be null or empty", ErrorType.VALIDATION);
		}
		return parkingLotRepository.getParkingLotByName(name);
	}

	public ParkingLot getParkingLotById(UUID id) {
		if (id == null) {
			throw new ParkingSystemException("Parking lot ID cannot be null", ErrorType.VALIDATION);
		}
		return parkingLotRepository.getParkingLotById(id);
	}

	public int getTotalParkingLotsCount() {
		return parkingLotRepository.getAllParkingLots().size();
	}

	public int getEnabledParkingLotsCount() {
		return getAllEnabledParkingLots().size();
	}

	public int getDisabledParkingLotsCount() {
		return getAllDisabledParkingLots().size();
	}
}