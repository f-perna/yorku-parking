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
		SuperManager superManager = SuperManager.getInstance();

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

	public Manager generateAndGetManagerAccount() {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can add new managers", ErrorType.AUTHORIZATION);
		}

		String email = RandomCredentialGenerator.generateRandomEmail();
		String password = RandomCredentialGenerator.generateRandomPassword();

		Manager manager = new Manager(email, password);

		boolean success = managerRepository.addManager(manager);

		return success ? manager : null;
	}
}
