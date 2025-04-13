package repositories;

import java.util.ArrayList;
import java.util.List;

import csvs.ManagerCSVProcessor;
import models.manager.Manager;

public class ManagerRepository {
	private List<Manager> managers;

	public ManagerRepository() {
		this.managers = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		managers = ManagerCSVProcessor.readManagerData();
	}

	private void saveManagers() {
		ManagerCSVProcessor.setManagerData(managers);
	}

	public List<Manager> getAllManagers() {
		return new ArrayList<>(managers);
	}

	public Manager getManagerByEmail(String email) {
		if (email == null) {
			return null;
		}

		for (Manager manager : managers) {
			if (email.equals(manager.getEmail())) {
				return manager;
			}
		}

		return null;
	}

	public boolean addManager(Manager manager) {
		if (manager == null || getManagerByEmail(manager.getEmail()) != null) {
			return false;
		}

		managers.add(manager);
		saveManagers();
		return true;
	}

	public boolean removeManager(String email) {
		Manager manager = getManagerByEmail(email);
		if (manager == null) {
			return false;
		}

		managers.remove(manager);
		saveManagers();
		return true;
	}

	public Manager authenticateManager(String email, String password) {
		Manager manager = getManagerByEmail(email);
		if (manager != null && manager.authenticate(email, password)) {
			return manager;
		}
		return null;
	}
}