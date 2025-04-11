package controllers;

import java.util.List;
import java.util.UUID;

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
	
	public List<ParkingSpace> getBookedSpaces(ParkingLot lot) {
		return parkingSpaceService.getBookedSpaces(lot);
	}
	
	
	public List<ParkingSpace> getOccupiedSpaces(ParkingLot lot) {
		return parkingSpaceService.getOccupiedSpaces(lot);
	}
	
	public List<ParkingSpace> getUnOccupiedSpaces(ParkingLot lot) {
		return parkingSpaceService.getUnOccupiedSpaces(lot);
	}
	
	
	public List<ParkingSpace> getDisabledSpaces(ParkingLot lot) {
		return parkingSpaceService.getDisabledSpaces(lot);
	}
	
	public List<ParkingSpace> getEnabledSpaces(ParkingLot lot) {
		return parkingSpaceService.getEnabledSpaces(lot);
	}
	
	public ParkingSpace getParkingSpaceById(UUID spaceId) {
		return parkingSpaceService.getParkingSpaceById(spaceId);
	}
	
	public List<ParkingSpace> getParkingSpacesForLot(UUID lotId) {
		return parkingSpaceService.getSpacesForLot(lotId);
	}
	
	public List<ParkingSpace> getAllSpaces() {
		return parkingSpaceService.getAllSpaces();
	}
	

}