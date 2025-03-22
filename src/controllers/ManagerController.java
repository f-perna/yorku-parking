package controllers;

import models.manager.Manager;
import services.ManagerService;

public class ManagerController {
	private ManagerService managerService;
	

	public ManagerController(ManagerService managerService) {
		this.managerService = managerService;
	}

}
