package services;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.superManager.SuperManager;

public class SuperManagerService {
	public SuperManagerService() {
	}

	public SuperManager login(String username, String password) {
		SuperManager superManager = SuperManager.getInstance();
		if (!superManager.authenticate(username, password)) {
			throw new ParkingSystemException("Invalid username or password", ErrorType.AUTHENTICATION);
		}
		return superManager;
	}
}
