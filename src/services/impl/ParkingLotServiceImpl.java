package services.impl;

import java.util.List;
import java.util.UUID;

import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingLot.ParkingLotModel;
import services.ParkingLotService;

public class ParkingLotServiceImpl implements ParkingLotService {
	private ParkingLotModel parkingLotModel;

	public ParkingLotServiceImpl(ParkingLotModel parkingLotModel) {
		this.parkingLotModel = parkingLotModel;
	}

	@Override
	public List<ParkingLot> getAllParkingLots() {
		return parkingLotModel.getAllParkingLots();
	}

	@Override
	public void addParkingLot(String name, Client client) {
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Lot name cannot be empty");
		}

		if (client == null || client.getType() != Client.type.FACULTY) {
			throw new IllegalStateException("Only faculty members can add parking lots");
		}

		parkingLotModel.addParkingLot(name.trim());
	}

	@Override
	public ParkingLot getParkingLotById(UUID lotId) {
		if (lotId == null) {
			throw new IllegalArgumentException("Lot ID cannot be null");
		}

		ParkingLot lot = parkingLotModel.getParkingLotById(lotId);
		if (lot == null) {
			throw new IllegalArgumentException("Parking lot not found");
		}

		return lot;
	}

	@Override
	public void removeParkingLot(UUID lotId, Client client) {
		if (lotId == null) {
			throw new IllegalArgumentException("Lot ID cannot be null");
		}

		if (client == null || client.getType() != Client.type.FACULTY) {
			throw new IllegalStateException("Only faculty members can remove parking lots");
		}

		ParkingLot lot = parkingLotModel.getParkingLotById(lotId);
		if (lot == null) {
			throw new IllegalArgumentException("Parking lot not found");
		}

		parkingLotModel.removeParkingLot(lotId);
	}
}