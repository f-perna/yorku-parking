package controllers;

import java.util.List;
import java.util.UUID;

import models.auth.AuthenticationState;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSpaceService;
import services.ServiceFactory;

public class ManagerController {
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private AuthenticationState authState;

	public ManagerController(ManagerService managerService, ParkingLotService parkingLotService,
			ParkingSpaceService parkingSpaceService) {
		this.authState = AuthenticationState.getInstance();
		this.parkingLotService = parkingLotService;
		this.parkingSpaceService = parkingSpaceService;
	}

	private void authenticate() {
		Manager manager = authState.getLoggedInManager();
		if (manager == null) {
			throw new IllegalStateException("Manager must be logged in to add parking lots");
		}
	}

	public List<ParkingLot> getAllParkingLots() {
		return parkingLotService.getAllParkingLots();
	}

	public List<ParkingSpace> getAllParkingSpaces() {
		return parkingSpaceService.getAllSpaces();
	}

	public void addParkingLot(String name) {
		authenticate();
		parkingLotService.addParkingLot(name);
	}

	public boolean enableParkingLot(ParkingLot parkingLot) {
		authenticate();
		return parkingLotService.enableParkingLot(parkingLot);
	}

	public boolean disableParkingLot(ParkingLot parkingLot) {
		authenticate();
		return parkingLotService.disableParkingLot(parkingLot);
	}

	public List<ParkingSpace> getParkingSpacesForLot(UUID lotId) {
		return parkingSpaceService.getSpacesForLot(lotId);
	}

//	public void enableParkingSpace(ParkingSpace parkingSpace) {
//		authenticate();
//		parkingSpaceService.enableParkingSpace(parkingSpace);
//	}
//
//	public void disableParkingSpaceForMaintenance(ParkingSpace parkingSpace) {
//		authenticate();
//		parkingSpaceService.disableParkingSpace(parkingSpace);
//	}
}
