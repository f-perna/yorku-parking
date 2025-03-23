package controllers;

import java.util.List;
import java.util.UUID;

import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSpaceService;

public class ManagerController {
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private ManagerService managerService;

	public ManagerController(ManagerService managerService, ParkingLotService parkingLotService,
			ParkingSpaceService parkingSpaceService) {
		this.managerService = managerService;
		this.parkingLotService = parkingLotService;
		this.parkingSpaceService = parkingSpaceService;
	}

	public List<ParkingLot> getAllParkingLots() {
		return parkingLotService.getAllParkingLots();
	}

	public List<ParkingSpace> getAllParkingSpaces() {
		return parkingSpaceService.getAllSpaces();
	}

	public void addParkingLot(String name) {
		parkingLotService.addParkingLot(name);
	}

	public boolean enableParkingLot(ParkingLot parkingLot) {
		return parkingLotService.enableParkingLot(parkingLot);
	}

	public boolean disableParkingLot(ParkingLot parkingLot) {
		return parkingLotService.disableParkingLot(parkingLot);
	}

	public List<ParkingSpace> getParkingSpacesForLot(UUID lotId) {
		return parkingSpaceService.getSpacesForLot(lotId);
	}

	// public void enableParkingSpace(ParkingSpace parkingSpace) {
	// authenticate();
	// parkingSpaceService.enableParkingSpace(parkingSpace);
	// }
	//
	// public void disableParkingSpaceForMaintenance(ParkingSpace parkingSpace) {
	// authenticate();
	// parkingSpaceService.disableParkingSpace(parkingSpace);
	// }
}
