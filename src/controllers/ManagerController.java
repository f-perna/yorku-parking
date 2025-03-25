package controllers;

import java.util.List;
import java.util.UUID;

import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import services.ClientService;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSpaceService;

public class ManagerController {
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private ClientService clientService;

	public ManagerController(ParkingLotService parkingLotService,
			ParkingSpaceService parkingSpaceService, ClientService clientService) {
		this.parkingLotService = parkingLotService;
		this.parkingSpaceService = parkingSpaceService;
		this.clientService = clientService;
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

	public void addParkingSpace(ParkingLot lot, String spaceName) {
		parkingSpaceService.addParkingSpace(lot, spaceName);
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

	public ParkingSpace enableParkingSpace(ParkingSpace parkingSpace) {
		return parkingSpaceService.enableParkingSpace(parkingSpace);
	}

	public ParkingSpace disableParkingSpace(ParkingSpace parkingSpace) {
		return parkingSpaceService.disableParkingSpace(parkingSpace);
	}

	public List<Client> getAllClients() {
		return clientService.getAllClients();
	}

	public boolean approveClient(String email) {
		return clientService.approveClient(email, true);
	}

	public boolean denyClient(String email) {
		return clientService.approveClient(email, false);
	}
}
