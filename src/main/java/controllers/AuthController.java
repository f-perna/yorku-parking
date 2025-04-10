package controllers;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.client.Client;
import models.manager.Manager;
import models.superManager.SuperManager;
import models.user.User;
import models.user.UserType;
import services.ClientService;
import services.ManagerService;
import services.SuperManagerService;

public class AuthController {
	private ClientService clientService;
	private ManagerService managerService;
	private SuperManagerService superManagerService;
	private AuthenticationState authState;

	public AuthController(ClientService clientService, ManagerService managerService,
			SuperManagerService superManagerService) {
		this.clientService = clientService;
		this.managerService = managerService;
		this.superManagerService = superManagerService;
		this.authState = AuthenticationState.getInstance();
	}

	public boolean login(String email, String password, UserType userType) {
		if (authState.isLoggedIn()) {
			throw new ParkingSystemException("Another user is currently logged in", ErrorType.AUTHENTICATION);
		}

		if (email == null || email.trim().isEmpty()) {
			throw new ParkingSystemException("Email cannot be empty", ErrorType.VALIDATION);
		}
		if (password == null || password.isEmpty()) {
			throw new ParkingSystemException("Password cannot be empty", ErrorType.VALIDATION);
		}
		if (userType == null) {
			throw new ParkingSystemException("User type cannot be null", ErrorType.VALIDATION);
		}

		User loggedInUser = null;

		switch (userType) {
			case CLIENT:
				loggedInUser = clientService.login(email, password);
				break;
			case MANAGER:
				loggedInUser = managerService.login(email, password);
				break;
			case SUPER_MANAGER:
				loggedInUser = superManagerService.login(email, password);
				break;
		}

		if (loggedInUser != null) {
			authState.setLoggedInUser(loggedInUser);
			return true;
		}
		return false;
	}

	public void logout() {
		if (!authState.isLoggedIn()) {
			throw new ParkingSystemException("No user is currently logged in", ErrorType.AUTHENTICATION);
		}

		authState.setLoggedInUser(null);
	}

	public Client getLoggedInClient() {
		return authState.getLoggedInClient();
	}

	public Manager getLoggedInManager() {
		return authState.getLoggedInManager();
	}

	public SuperManager getLoggedInSuperManager() {
		return authState.getLoggedInSuperManager();
	}

	public boolean isLoggedIn() {
		return authState.isLoggedIn();
	}
}