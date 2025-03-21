package controllers;

import java.util.List;
import java.util.UUID;
import models.auth.AuthenticationState;
import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingStatus;
import services.ParkingSpaceService;

public class ParkingSpaceController {
	private ParkingSpaceService parkingSpaceService;
	private AuthenticationState authState;

	public ParkingSpaceController(ParkingSpaceService parkingSpaceService) {
		this.parkingSpaceService = parkingSpaceService;
		this.authState = AuthenticationState.getInstance();
	}

	public List<ParkingSpace> getAvailableSpaces(ParkingLot lot) {
		return parkingSpaceService.getAvailableSpaces(lot);
	}

	public void addParkingSpace(ParkingLot lot, String spaceName) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to add parking spaces");
		}

		parkingSpaceService.addParkingSpace(lot, spaceName, client);
	}

	public void setSpaceStatus(UUID spaceId, ParkingStatus newStatus) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to modify parking space status");
		}

		parkingSpaceService.setSpaceStatus(spaceId, newStatus, client);
	}

	public ParkingSpace getParkingSpaceById(UUID spaceId) {
		return parkingSpaceService.getParkingSpaceById(spaceId);
	}

	public List<ParkingSpace> getSpacesForLot(UUID lotId) {
		return parkingSpaceService.getSpacesForLot(lotId);
	}

	public List<ParkingSpace> getAllSpaces() {
		return parkingSpaceService.getAllSpaces();
	}
}