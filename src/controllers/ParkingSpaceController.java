package controllers;

import java.util.List;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import services.ParkingSpaceService;

public class ParkingSpaceController {
	private ParkingSpaceService parkingSpaceService;

	public ParkingSpaceController(ParkingSpaceService parkingSpaceService) {
		this.parkingSpaceService = parkingSpaceService;
	}

	public List<ParkingSpace> getAvailableSpaces(ParkingLot lot) {
		return parkingSpaceService.getAvailableSpaces(lot);
	}

}