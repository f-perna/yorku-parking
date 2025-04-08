package controllers;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.client.Client;
import models.manager.Manager;
import models.superManager.SuperManager;
import models.user.User;
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

	public boolean login(String email, String password, String userType) {
		if (email == null || email.trim().isEmpty()) {
			throw new ParkingSystemException("Email cannot be empty", ErrorType.VALIDATION);
		}
		if (password == null || password.isEmpty()) {
			throw new ParkingSystemException("Password cannot be empty", ErrorType.VALIDATION);
		}
		if (userType == null) {
			throw new ParkingSystemException("User type cannot be null", ErrorType.VALIDATION);
		}

		boolean success = false;

		switch (userType.toLowerCase()) {
		case "client":
			success = clientService.login(email, password);
			break;
		case "manager":
			success = managerService.login(email, password);
			break;
		case "supermanager":
			success = superManagerService.login(email, password);
			break;
		default:
			throw new ParkingSystemException("Invalid user type: " + userType, ErrorType.VALIDATION);
		}

		return success;
	}

	public void logout() {
		if (!authState.isLoggedIn()) {
			throw new ParkingSystemException("No user is currently logged in", ErrorType.AUTHENTICATION);
		}

		authState.setLoggedInUser(null);
	}

	public User getLoggedInUser() {
		return authState.getLoggedInUser();
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

	public boolean isClientLoggedIn() {
		return authState.isClientLoggedIn();
	}

	public boolean isManagerLoggedIn() {
		return authState.isManagerLoggedIn();
	}

	public boolean isSuperManagerLoggedIn() {
		return authState.isSuperManagerLoggedIn();
	}
}