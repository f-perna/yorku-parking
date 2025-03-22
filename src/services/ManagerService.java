package services;

import java.util.List;

import models.manager.Manager;
import models.parkingLot.ParkingLot;

public interface ManagerService {

	boolean loginManager(String username, String password);

	Manager getManagerByUsername(String username);

	List<Manager> getAllManagers();

	void addParkingLot(ParkingLot parkingLot);

	void removeParkingLot(ParkingLot parkingLot);
	// void enableParkingLot(ParkingLot parkingLot);
	// void disableParkingLot(ParkingLot parkingLot);
	// void addParkingSpace(ParkingLot parkingLot, String spaceName);
	// void removeParkingSpace(ParkingSpace parkingSpace);
	// void enableParkingSpace(ParkingSpace parkingSpace);
	// void disableParkingSpace(ParkingSpace parkingSpace);

	boolean managerLogin(String username, String password, boolean isSuperManager);

	Manager getLoggedInManager();

	void logout();
}
