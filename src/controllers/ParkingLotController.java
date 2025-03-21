package controllers;

import java.util.List;
import java.util.UUID;
import models.auth.AuthenticationState;
import models.client.Client;
import models.parkingLot.ParkingLot;
import services.ParkingLotService;

public class ParkingLotController {
	private ParkingLotService parkingLotService;
	private AuthenticationState authState;

	public ParkingLotController(ParkingLotService parkingLotService) {
		this.parkingLotService = parkingLotService;
		this.authState = AuthenticationState.getInstance();
	}

	public List<ParkingLot> getAllParkingLots() {
		return parkingLotService.getAllParkingLots();
	}

	public void addParkingLot(String name) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to add parking lots");
		}

		parkingLotService.addParkingLot(name, client);
	}

	public ParkingLot getParkingLotById(UUID lotId) {
		return parkingLotService.getParkingLotById(lotId);
	}

	public void removeParkingLot(UUID lotId) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to remove parking lots");
		}

		parkingLotService.removeParkingLot(lotId, client);
	}
}