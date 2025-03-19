package models.parking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.CSVProcessor;
import models.parkingLot.ParkingLot;

public class ParkingLotModel {
    private List<ParkingLot> parkingLots;

    public ParkingLotModel() {
        this.parkingLots = new ArrayList<>();
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        parkingLots = CSVProcessor.readLotData();
        CSVProcessor.readSpaceData(); // This populates spaces into the lots
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
        ParkingLot newLot = new ParkingLot(name, UUID.randomUUID());
        parkingLots.add(newLot);
        saveToDatabase();
    }

    public void removeParkingLot(UUID id) {
        parkingLots.removeIf(lot -> lot.getID().equals(id));
        saveToDatabase();
    }

    private void saveToDatabase() {
        CSVProcessor.setLotAndSpaceData(parkingLots);
    }
}