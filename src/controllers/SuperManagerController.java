package controllers;

import java.util.List;

import models.manager.Manager;
import services.SuperManagerService;

public class SuperManagerController {
	private SuperManagerService superManagerService;

	public SuperManagerController(SuperManagerService superManagerService) {
		this.superManagerService = superManagerService;
	}

	public Manager generateAndGetManagerAccount() {
		return superManagerService.generateAndGetManagerAccount();
	}

	public boolean removeManager(String email) {
		return superManagerService.removeManager(email);
	}

	public List<Manager> getAllManagers() {
		return superManagerService.getAllManagers();
	}

}
