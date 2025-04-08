package services;

import java.util.List;

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

		List<ParkingLot> existingLots = parkingLotRepository.getAllParkingLots();
		for (ParkingLot lot : existingLots) {
			if (lot.getName().equalsIgnoreCase(name)) {
				throw new ParkingSystemException("A parking lot with name '" + name + "' already exists",
						ErrorType.VALIDATION);
			}
		}

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
}