package controllers;

import java.util.List;

import models.manager.Manager;
import services.SuperManagerService;

public class SuperManagerController {
	private SuperManagerService superManagerService;

	public SuperManagerController(SuperManagerService superManagerService) {
		this.superManagerService = superManagerService;
	}

	public boolean addManager(String email, String password) {
		return superManagerService.addManager(email, password);
	}

	public boolean removeManager(String email) {
		return superManagerService.removeManager(email);
	}

	public List<Manager> getAllManagers() {
		return superManagerService.getAllManagers();
	}

	public Manager getManagerByEmail(String email) {
		return superManagerService.getManagerByEmail(email);
	}
}
