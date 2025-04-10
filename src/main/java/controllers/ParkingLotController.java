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

	public List<ParkingLot> getAllEnabledParkingLots() {
		return parkingLotService.getAllEnabledParkingLots();
	}

	public List<ParkingLot> getAllDisabledParkingLots() {
		return parkingLotService.getAllDisabledParkingLots();
	}

	public ParkingLot getParkingLotByName(String name) {
		return parkingLotService.getParkingLotByName(name);
	}

	public ParkingLot getParkingLotById(UUID id) {
		return parkingLotService.getParkingLotById(id);
	}

	public int getTotalParkingLotsCount() {
		return parkingLotService.getTotalParkingLotsCount();
	}

	public int getEnabledParkingLotsCount() {
		return parkingLotService.getEnabledParkingLotsCount();
	}

	public int getDisabledParkingLotsCount() {
		return parkingLotService.getDisabledParkingLotsCount();
	}
}