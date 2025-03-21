package services;

import java.util.List;
import java.util.UUID;

import models.parkingLot.ParkingLot;
import models.client.Client;

public interface ParkingLotService {

    List<ParkingLot> getAllParkingLots();
    void addParkingLot(String name, Client client);
    ParkingLot getParkingLotById(UUID lotId);
    void removeParkingLot(UUID lotId, Client client);
}