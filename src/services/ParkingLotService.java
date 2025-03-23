package services;

import java.util.List;
import java.util.UUID;

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

	public void addParkingLot(String name, Client client) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Lot name cannot be empty");
		}

		if (client == null || client.getType() != Client.type.FACULTY) {
			throw new IllegalStateException("Only faculty members can add parking lots");
		}

		parkingLotModel.addParkingLot(name.trim());
	}

	public void addParkingLot(String name) {
		if (!authState.isManagerLoggedIn() && !authState.isSuperManagerLoggedIn()) {
			throw new IllegalStateException("Manager must be logged in to add parking lots");
		}

		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Lot name cannot be empty");
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
			throw new IllegalArgumentException("Lot ID cannot be null");
		}

		ParkingLot lot = parkingLotModel.getParkingLotById(lotId);
		if (lot == null) {
			throw new IllegalArgumentException("Parking lot not found");
		}

		return lot;
	}

	public boolean enableParkingLot(ParkingLot parkingLot) {
		if (!authState.isManagerLoggedIn() && !authState.isSuperManagerLoggedIn()) {
			throw new IllegalStateException("Manager must be logged in to enable parking lots");
		}
		return parkingLotModel.enableParkingLot(parkingLot);
	}

	public boolean disableParkingLot(ParkingLot parkingLot) {
		if (!authState.isManagerLoggedIn() && !authState.isSuperManagerLoggedIn()) {
			throw new IllegalStateException("Manager must be logged in to disable parking lots");
		}
		return parkingLotModel.disableParkingLot(parkingLot);
	}
}