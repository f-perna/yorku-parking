package controllers;

import java.util.List;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.manager.Manager;
import services.ManagerService;

public class SuperManagerController {
	private ManagerService managerService;

	public SuperManagerController(ManagerService managerService) {
		this.managerService = managerService;
	}

	public Manager generateAndGetManagerAccount() {
		return managerService.generateAndGetManagerAccount();
	}

	public boolean removeManager(String email) {
		if (email == null) {
			throw new ParkingSystemException("Email cannot be null", ErrorType.VALIDATION);
		}

		return managerService.removeManager(email);
	}

	public List<Manager> getAllManagers() {
		return managerService.getAllManagers();
	}

}
