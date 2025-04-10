package services;

import java.util.List;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.manager.Manager;
import repositories.ManagerRepository;
import utils.RandomCredentialGenerator;

public class ManagerService {
	private ManagerRepository managerRepository;
	private AuthenticationState authState;

	public ManagerService(ManagerRepository managerRepository) {
		this.managerRepository = managerRepository;
		this.authState = AuthenticationState.getInstance();
	}

	public Manager login(String email, String password) {
		Manager manager = managerRepository.authenticateManager(email, password);
		if (manager == null) {
			throw new ParkingSystemException("Invalid email address or password", ErrorType.AUTHENTICATION);
		}
		return manager;
	}

	private void superManagerAuth() {
		if (!authState.isSuperManagerLoggedIn()) {
			throw new ParkingSystemException("Only super managers can add new managers", ErrorType.AUTHORIZATION);
		}
	}

	public Manager generateAndGetManagerAccount() {
		superManagerAuth();

		String email = RandomCredentialGenerator.generateRandomEmail();
		String password = RandomCredentialGenerator.generateRandomPassword();

		Manager manager = new Manager(email, password);
		boolean success = managerRepository.addManager(manager);

		return success ? manager : null;
	}

	public boolean removeManager(String email) {
		superManagerAuth();
		return managerRepository.removeManager(email.toLowerCase().trim());
	}

	public List<Manager> getAllManagers() {
		superManagerAuth();
		return managerRepository.getAllManagers();
	}

}