package services;

import java.util.List;
import java.util.UUID;

import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingStatus;

public interface ParkingSpaceService {

    List<ParkingSpace> getAvailableSpaces(ParkingLot lot);
    void addParkingSpace(ParkingLot lot, String spaceName, Client client);
    void setSpaceStatus(UUID spaceId, ParkingStatus newStatus, Client client);
    ParkingSpace getParkingSpaceById(UUID spaceId);
    List<ParkingSpace> getSpacesForLot(UUID lotId);
    List<ParkingSpace> getAllSpaces();
}