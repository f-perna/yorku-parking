package services;

import models.auth.AuthenticationState;
import models.superManager.SuperManager;

public class SuperManagerService {
	private AuthenticationState authState;

	public SuperManagerService() {
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
}
