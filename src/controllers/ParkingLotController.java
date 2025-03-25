package controllers;

import java.util.List;
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

}