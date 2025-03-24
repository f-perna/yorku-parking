package services;

import java.util.List;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.client.Client;
import models.parkingLot.ParkingLot;
import repositories.ParkingLotRepository;

public class ParkingLotService {
	private ParkingLotRepository parkingLotModel;
	private ParkingSpaceService parkingSpaceService;
	private AuthenticationState authState;

	public ParkingLotService(ParkingLotRepository parkingLotModel) {
		this.parkingLotModel = parkingLotModel;
		// Will be set in setDependencies to avoid circular dependency
		this.parkingSpaceService = null;
		this.authState = AuthenticationState.getInstance();
	}

	// Used by ServiceFactory to inject dependencies after construction
	public void setDependencies(ParkingSpaceService parkingSpaceService) {
		this.parkingSpaceService = parkingSpaceService;
	}

	// Helper to ensure dependencies are available
	private ParkingSpaceService getParkingSpaceService() {
		if (this.parkingSpaceService == null) {
			this.parkingSpaceService = ServiceFactory.getInstance().getParkingSpaceService();
		}
		return this.parkingSpaceService;
	}

	public List<ParkingLot> getAllParkingLots() {
		return parkingLotModel.getAllParkingLots();
	}

	public void addParkingLot(String name) {
		if (!authState.isManagerLoggedIn() && !authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Manager must be logged in to add parking lots", ErrorType.AUTHORIZATION);
		}

		if (name == null || name.trim().isEmpty()) {
			throw new ParkingSystemException("Lot name cannot be empty", ErrorType.VALIDATION);
		}

		// Add the parking lot
		parkingLotModel.addParkingLot(name.trim());

		// Get the newly created lot
		List<ParkingLot> allLots = parkingLotModel.getAllParkingLots();
		ParkingLot newLot = allLots.get(allLots.size() - 1); // Get the last added lot

		// Create 100 parking spaces for this lot using the service
		for (int i = 1; i <= 100; i++) {
			String spaceName = "Space " + i;
			getParkingSpaceService().addParkingSpace(newLot, spaceName);
		}
	}

	public ParkingLot getParkingLotById(UUID lotId) {
		if (lotId == null) {
			throw new ParkingSystemException("Lot ID cannot be null", ErrorType.VALIDATION);
		}

		ParkingLot lot = parkingLotModel.getParkingLotById(lotId);
		if (lot == null) {
			throw new ParkingSystemException("Parking lot not found", ErrorType.DATA_ACCESS);
		}

		return lot;
	}

	public boolean enableParkingLot(ParkingLot parkingLot) {
		if (!authState.isManagerLoggedIn() && !authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Manager must be logged in to enable parking lots",
					ErrorType.AUTHORIZATION);
		}
		return parkingLotModel.enableParkingLot(parkingLot);
	}

	public boolean disableParkingLot(ParkingLot parkingLot) {
		if (!authState.isManagerLoggedIn() && !authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Manager must be logged in to disable parking lots",
					ErrorType.AUTHORIZATION);
		}
		return parkingLotModel.disableParkingLot(parkingLot);
	}
}