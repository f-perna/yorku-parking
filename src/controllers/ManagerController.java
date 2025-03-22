package controllers;

import models.manager.Manager;
import services.ManagerService;

public class ManagerController {
    private ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    public boolean managerLogin(String username, String password, boolean isSuperManager) {
        return managerService.managerLogin(username, password, isSuperManager);
    }

    public Manager getLoggedInManager() {
        return managerService.getLoggedInManager();
    }

    public void logout() {
        managerService.logout();
    }
}
