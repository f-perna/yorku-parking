package services;

import java.util.List;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.manager.Manager;
import repositories.ManagerRepository;

public class ManagerService {
	private ManagerRepository managerModel;
	private AuthenticationState authState;

	public ManagerService(ManagerRepository managerModel) {
		this.managerModel = managerModel;
		this.authState = AuthenticationState.getInstance();
	}

	public boolean login(String email, String password) {
		email = email.toLowerCase().trim();

		Manager manager = managerModel.authenticateManager(email, password);

		if (manager != null) {
			authState.setLoggedInUser(manager);
			return true;
		}

		return false;
	}

	public List<Manager> getAllManagers() {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can view all managers", ErrorType.AUTHORIZATION);
		}

		return managerModel.getAllManagers();
	}

	public Manager getManagerByEmail(String email) {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can view manager details", ErrorType.AUTHORIZATION);
		}

		if (email == null) {
			throw new ParkingSystemException("Email cannot be null", ErrorType.VALIDATION);
		}

		return managerModel.getManagerByEmail(email.toLowerCase().trim());
	}

	public boolean addManager(String email, String password) {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can add new managers", ErrorType.AUTHORIZATION);
		}

		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			throw new ParkingSystemException("Invalid email format", ErrorType.VALIDATION);
		}

		if (password == null || password.length() < 6) {
			throw new ParkingSystemException("Password must be at least 6 characters", ErrorType.VALIDATION);
		}

		email = email.toLowerCase().trim();
		Manager manager = new Manager(email, password);

		return managerModel.addManager(manager);
	}

	public boolean removeManager(String email) {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can remove managers", ErrorType.AUTHORIZATION);
		}

		if (email == null) {
			throw new ParkingSystemException("Email cannot be null", ErrorType.VALIDATION);
		}

		return managerModel.removeManager(email.toLowerCase().trim());
	}

	public boolean logout() {
		if (authState.isManagerLoggedIn()) {
			authState.setLoggedInUser(null);
			return true;
		}
		return false;
	}
}