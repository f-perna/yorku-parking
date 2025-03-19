package controllers;

import java.util.List;
import java.util.UUID;
import models.auth.AuthenticationState;
import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parking.ParkingSpaceModel;
import models.parkingSpace.ParkingSpace.ParkingStatus;

public class ParkingSpaceController {
    private ParkingSpaceModel parkingSpaceModel;

    public ParkingSpaceController(ParkingSpaceModel parkingSpaceModel) {
        this.parkingSpaceModel = parkingSpaceModel;
    }

    public List<ParkingSpace> getAvailableSpaces(ParkingLot lot) {
        if (lot == null) {
            throw new IllegalArgumentException("Parking lot cannot be null");
        }

        return parkingSpaceModel.getAvailableSpaces(lot);
    }

    public void addParkingSpace(ParkingLot lot, String spaceName) {
        // Input validation
        if (lot == null) {
            throw new IllegalArgumentException("Lot cannot be null");
        }
        if (spaceName == null || spaceName.trim().isEmpty()) {
            throw new IllegalArgumentException("Space name cannot be empty");
        }

        // Check if user is manager
        Client client = AuthenticationState.getInstance().getLoggedInClient();
        if (client == null || client.getType() != Client.type.FACULTY) {
            throw new IllegalStateException("Only faculty members can add parking spaces");
        }

        parkingSpaceModel.addParkingSpace(lot, spaceName.trim());
    }

    public void setSpaceStatus(UUID spaceId, ParkingStatus newStatus) {
        // Input validation
        if (spaceId == null) {
            throw new IllegalArgumentException("Space ID cannot be null");
        }
        if (newStatus == null) {
            throw new IllegalArgumentException("Status cannot be null");
        }

        // Check if user is manager
        Client client = AuthenticationState.getInstance().getLoggedInClient();
        if (client == null || client.getType() != Client.type.FACULTY) {
            throw new IllegalStateException("Only faculty members can modify parking space status");
        }

        ParkingSpace space = parkingSpaceModel.getParkingSpaceById(spaceId);
        if (space == null) {
            throw new IllegalArgumentException("Parking space not found");
        }

        parkingSpaceModel.updateParkingSpaceStatus(space, newStatus);
    }

    public ParkingSpace getParkingSpaceById(UUID spaceId) {
        if (spaceId == null) {
            throw new IllegalArgumentException("Space ID cannot be null");
        }

        ParkingSpace space = parkingSpaceModel.getParkingSpaceById(spaceId);
        if (space == null) {
            throw new IllegalArgumentException("Parking space not found");
        }

        return space;
    }

    public List<ParkingSpace> getSpacesForLot(UUID lotId) {
        if (lotId == null) {
            throw new IllegalArgumentException("Lot ID cannot be null");
        }
        return parkingSpaceModel.getSpacesForLot(lotId);
    }

    public List<ParkingSpace> getAllSpaces() {
        return parkingSpaceModel.getAllSpaces();
    }
}