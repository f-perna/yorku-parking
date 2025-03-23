package services;

import java.util.List;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.manager.Manager;
import models.manager.SuperManager;
import repositories.ManagerRepository;
import utils.RandomCredentialGenerator;

public class SuperManagerService {
	private ManagerRepository managerRepository;
	private AuthenticationState authState;

	public SuperManagerService(ManagerRepository managerRepository) {
		this.managerRepository = managerRepository;
		this.authState = AuthenticationState.getInstance();
	}

	public boolean login(String username, String password) {
		// Get the singleton SuperManager instance
		SuperManager superManager = SuperManager.getInstance();

		// Check credentials
		if (superManager.authenticate(username, password)) {
			authState.setLoggedInUser(superManager);
			return true;
		}

		return false;
	}

	public boolean logout() {
		if (authState.isSuperManagerLoggedIn()) {
			authState.setLoggedInUser(null);
			return true;
		}
		return false;
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

		return managerRepository.addManager(manager);
	}

	public boolean removeManager(String email) {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can remove managers", ErrorType.AUTHORIZATION);
		}

		if (email == null) {
			throw new ParkingSystemException("Email cannot be null", ErrorType.VALIDATION);
		}

		return managerRepository.removeManager(email.toLowerCase().trim());
	}

	public List<Manager> getAllManagers() {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can view all managers", ErrorType.AUTHORIZATION);
		}

		return managerRepository.getAllManagers();
	}

	public Manager getManagerByEmail(String email) {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can view manager details", ErrorType.AUTHORIZATION);
		}

		if (email == null) {
			throw new ParkingSystemException("Email cannot be null", ErrorType.VALIDATION);
		}

		return managerRepository.getManagerByEmail(email.toLowerCase().trim());
	}

	public boolean generateManagerAccount() {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can add new managers", ErrorType.AUTHORIZATION);
		}

		String email = RandomCredentialGenerator.generateRandomEmail();
		String password = RandomCredentialGenerator.generateRandomPassword();

		// Create a manager with the generated credentials
		Manager manager = new Manager(email, password);

		// Return both status and the created manager's credentials
		boolean success = managerRepository.addManager(manager);

		return success;
	}

	public Manager generateAndGetManagerAccount() {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can add new managers", ErrorType.AUTHORIZATION);
		}

		String email = RandomCredentialGenerator.generateRandomEmail();
		String password = RandomCredentialGenerator.generateRandomPassword();

		// Create a manager with the generated credentials
		Manager manager = new Manager(email, password);

		// Add manager to repository
		boolean success = managerRepository.addManager(manager);

		// Return the created manager if successful, null otherwise
		return success ? manager : null;
	}
}
