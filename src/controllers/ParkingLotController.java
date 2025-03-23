package controllers;

import java.util.List;
import java.util.UUID;
import models.parkingLot.ParkingLot;
import services.ParkingLotService;

public class ParkingLotController {
	private ParkingLotService parkingLotService;

	public ParkingLotController(ParkingLotService parkingLotService) {
		this.parkingLotService = parkingLotService;
	}

	public List<ParkingLot> getAllParkingLots() {
		return parkingLotService.getAllParkingLots();
	}

	public void addParkingLot(String name) {
		parkingLotService.addParkingLot(name);
	}

	public ParkingLot getParkingLotById(UUID lotId) {
		return parkingLotService.getParkingLotById(lotId);
	}
}