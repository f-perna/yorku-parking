package services.impl;

import java.util.List;
import java.util.UUID;

import models.auth.AuthenticationState;
import models.manager.Manager;
import models.manager.Manager.ManagerType;
import models.parkingLot.ParkingLot;
import services.ManagerService;

public class ManagerServiceImpl implements ManagerService {
	private AuthenticationState authState;

	// Hardcoded credentials for demonstration - in a real app, these would be
	// stored securely
	private static final String MANAGER_USERNAME = "manager";
	private static final String MANAGER_PASSWORD = "manager123";
	private static final String SUPER_MANAGER_USERNAME = "superadmin";
	private static final String SUPER_MANAGER_PASSWORD = "admin123";

	public ManagerServiceImpl() {
		this.authState = AuthenticationState.getInstance();
	}

	@Override
	public boolean managerLogin(String username, String password, boolean isSuperManager) {
		if (username == null || password == null) {
			return false;
		}

		boolean isAuthenticated = false;
		ManagerType managerType;

		if (isSuperManager) {
			isAuthenticated = SUPER_MANAGER_USERNAME.equals(username) &&
					SUPER_MANAGER_PASSWORD.equals(password);
			managerType = ManagerType.SUPER_MANAGER;
		} else {
			isAuthenticated = MANAGER_USERNAME.equals(username) &&
					MANAGER_PASSWORD.equals(password);
			managerType = ManagerType.MANAGER;
		}

		if (isAuthenticated) {
			Manager manager = new Manager(UUID.randomUUID(), username, password, managerType);
			authState.setLoggedInManager(manager);
			return true;
		}

		return false;
	}

	@Override
	public Manager getLoggedInManager() {
		return authState.getLoggedInManager();
	}

	@Override
	public void logout() {
		if (!authState.isManagerLoggedIn()) {
			throw new IllegalStateException("No manager is currently logged in");
		}
		authState.setLoggedInManager(null);
	}

	@Override
	public Manager getManagerByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> getAllManagers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addParkingLot(ParkingLot parkingLot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeParkingLot(ParkingLot parkingLot) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean loginManager(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
