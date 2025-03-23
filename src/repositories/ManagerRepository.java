package repositories;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import main.ManagerCSVProcessor;
import models.manager.Manager;

public class ManagerRepository implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<Manager> managers;
	private static final String DATA_FILE = "data/managers.dat";

	public ManagerRepository() {
		this.managers = new ArrayList<>();
		loadFromDatabase();
	}

	public List<Manager> getAllManagers() {
		return new ArrayList<>(managers);
	}

	public Manager getManagerByEmail(String email) {
		if (email == null) {
			return null;
		}

		return managers.stream().filter(manager -> email.equals(manager.getEmail())).findFirst().orElse(null);
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

	private void loadFromDatabase() {
		managers = ManagerCSVProcessor.readManagerData();
	}

	public void saveManagers() {
		ManagerCSVProcessor.setManagerData(managers);
	}
}