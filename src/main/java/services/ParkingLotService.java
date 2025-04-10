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
		managerAuth();
		parkingLotRepository.addParkingLot(name);
	}

	public boolean enableParkingLot(ParkingLot parkingLot) {
		managerAuth();
		return parkingLotRepository.enableParkingLot(parkingLot);
	}

	public boolean disableParkingLot(ParkingLot parkingLot) {
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
		return parkingLotRepository.getParkingLotByName(name);
	}

	public ParkingLot getParkingLotById(UUID id) {
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