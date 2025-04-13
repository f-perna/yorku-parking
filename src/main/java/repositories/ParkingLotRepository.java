package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import csvs.ParkingLotCSVProcessor;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
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
	
	public List<ParkingLot> getAllEnabledParkingLots() {
		List<ParkingLot> enabledLots = new ArrayList<>();
		
		for (ParkingLot lot : parkingLots) {
			if (lot.isEnabled()) {
				enabledLots.add(lot);
			}
		}
		return enabledLots;
	}
	
	public List<ParkingLot> getAllDisabledParkingLots() {
		List<ParkingLot> disabledLots = new ArrayList<>();
		for (ParkingLot lot : parkingLots) {
			if (!lot.isEnabled()) {
				disabledLots.add(lot);
			}
		}
		return disabledLots;
	}

	public ParkingLot getParkingLotById(UUID id) {
		for (ParkingLot parkingLot : parkingLots) {
			if (parkingLot.getID().equals(id)) {
				return parkingLot;
			}
		}
		return null;
	}
	
	public ParkingLot getParkingLotByName(String name) {
		for (ParkingLot lot : parkingLots) {
			if (lot.getName().equalsIgnoreCase(name)) {
				return lot;
			}
		}
		return null;
	}

	public ParkingLot addParkingLot(String name) {
		for (ParkingLot lot : parkingLots) {
			if (lot.getName().equalsIgnoreCase(name)) {
				throw new ParkingSystemException("A parking lot with name '" + name + "' already exists",
						ErrorType.VALIDATION);
			}
		}

		ParkingLot newLot = new ParkingLot(name);
		parkingLots.add(newLot);
		saveLots();
		
		return newLot;
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