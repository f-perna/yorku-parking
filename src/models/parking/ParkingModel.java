package models.parking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.CSVProcessor;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingStatus;

public class ParkingModel {
    private List<ParkingLot> parkingLots;

    public ParkingModel() {
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

    public ParkingSpace getParkingSpaceById(UUID id) {
        for (ParkingLot parkingLot : parkingLots) {
            for (ParkingSpace parkingSpace : parkingLot.getParkingSpaces()) {
                if (parkingSpace.getID().equals(id)) {
                    return parkingSpace;
                }
            }
        }
        return null;
    }

    public List<ParkingSpace> getAvailableSpaces(ParkingLot lot) {
        List<ParkingSpace> availableSpaces = new ArrayList<>();
        for (ParkingSpace space : lot.getParkingSpaces()) {
            if (space.getStatus() == ParkingStatus.AVAILABLE) {
                availableSpaces.add(space);
            }
        }
        return availableSpaces;
    }

    public void updateParkingSpaceStatus(ParkingSpace space, ParkingStatus newStatus) {
        space.setStatus(newStatus);
        CSVProcessor.setLotAndSpaceData(parkingLots);
    }

    public void addParkingSpace(ParkingLot lot, UUID id, ParkingStatus status, String name) {
        lot.addParkingSpace(id, status, name);
        CSVProcessor.setLotAndSpaceData(parkingLots);
    }

    public void addParkingLot(String name) {
        ParkingLot newLot = new ParkingLot(name, UUID.randomUUID());
        parkingLots.add(newLot);
        CSVProcessor.setLotAndSpaceData(parkingLots);
    }

    public List<ParkingSpace> getAllSpaces() {
        List<ParkingSpace> allSpaces = new ArrayList<>();
        for (ParkingLot lot : parkingLots) {
            allSpaces.addAll(lot.getParkingSpaces());
        }
        return allSpaces;
    }
}
