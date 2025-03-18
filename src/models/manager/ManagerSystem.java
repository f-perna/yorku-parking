package models.manager;

import java.util.ArrayList;
import java.util.List;

public class ManagerSystem {

	private static ManagerSystem instance;

	private List<Manager> managers;
	private SuperManager superManager;
	
	private ManagerSystem() {
		this.managers = new ArrayList<>();
		superManager = new SuperManager("super_manager", "master_password");
	}

	public static ManagerSystem getInstance() {
		if (instance == null) {
			instance = new ManagerSystem();
		}

		return instance;
	}

	public boolean Authenticate() {
		return false;
	}

	public void loadFromDatabase() {

	}

	public void addParkingLot() {

	}

	public void deleteParkingLot() {

	}

	public void addParkingSpace() {

	}

	public void deleteParkingSpace() {

	}

	public void enableParkingLot() {

	}

	public void disableParkingLot() {

	}
	
	public Manager createManager(String username, String password) {
		return null;
	}
	
	public void removeManager(String username) {
		
	}


}
