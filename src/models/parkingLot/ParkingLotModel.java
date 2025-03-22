package models.parkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.CSVProcessor;

public class ParkingLotModel {
    private List<ParkingLot> parkingLots;

    public ParkingLotModel() {
        this.parkingLots = new ArrayList<>();
        loadFromDatabase();
    }

    private void loadFromDatabase() {
        parkingLots = CSVProcessor.readLotData();
        CSVProcessor.readSpaceData();
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
        saveLots();
    }

    public void removeParkingLot(UUID id) {
        parkingLots.removeIf(lot -> lot.getID().equals(id));
        saveLots();
    }

    private void saveLots() {
        // CSVProcessor.setLotAndSpaceData(parkingLots);
    }
}