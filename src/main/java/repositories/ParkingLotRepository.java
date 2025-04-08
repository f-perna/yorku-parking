package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import csv.ParkingLotCSVProcessor;
import models.parkingLot.ParkingLot;

public class ParkingLotRepository {
	private List<ParkingLot> parkingLots;

	public ParkingLotRepository() {
		this.parkingLots = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		parkingLots = ParkingLotCSVProcessor.readLotData();
	}

	public List<ParkingLot> getAllParkingLots() {
		return new ArrayList<>(parkingLots);
	}

	public ParkingLot getParkingLotById(UUID id) {
		for (ParkingLot parkingLot : parkingLots) {
			if (parkingLot.getID().equals(id)) {
				return parkingLot;
			}
		}
		return null;
	}

	public void addParkingLot(String name) {
		ParkingLot newLot = new ParkingLot(name);
		parkingLots.add(newLot);
		saveLots();
	}

	public void removeParkingLot(UUID id) {
		parkingLots.removeIf(lot -> lot.getID().equals(id));
		saveLots();
	}

	public boolean enableParkingLot(ParkingLot parkingLot) {
		parkingLot.setEnabled(true);
		saveLots();
		return true;
	}

	public boolean disableParkingLot(ParkingLot parkingLot) {
		parkingLot.setEnabled(false);
		saveLots();
		return true;

	}

	private void saveLots() {
		ParkingLotCSVProcessor.setLotData(parkingLots);
	}
}