package models.auth;

import java.util.ArrayList;
import java.util.List;

import models.client.Client;
import models.manager.Manager;
import models.superManager.SuperManager;
import models.user.User;

public class AuthenticationState {
	private static AuthenticationState instance;
	private List<AuthStateObserver> observers;
	private User loggedInUser;

	private AuthenticationState() {
		observers = new ArrayList<>();
	}

	public static synchronized AuthenticationState getInstance() {
		if (instance == null) {
			instance = new AuthenticationState();
		}
		return instance;
	}

	public void addObserver(AuthStateObserver observer) {
		observers.add(observer);
	}

	public void removeObserver(AuthStateObserver observer) {
		observers.remove(observer);
	}

	public User getLoggedInUser() {
		return loggedInUser;
	}

	public Client getLoggedInClient() {
		if (isClientLoggedIn() == false) {
			return null;
		}

		return (Client) loggedInUser;
	}

	public Manager getLoggedInManager() {
		if (isManagerLoggedIn() == false) {
			return null;
		}

		return (Manager) loggedInUser;
	}

	public SuperManager getLoggedInSuperManager() {
		if (isSuperManagerLoggedIn() == false) {
			return null;
		}

		return (SuperManager) loggedInUser;
	}

	public void setLoggedInUser(User user) {
		this.loggedInUser = user;
		notifyObservers();
	}

	public boolean isLoggedIn() {
		return loggedInUser != null;
	}

	public boolean isClientLoggedIn() {
		return loggedInUser instanceof Client;
	}

	public boolean isManagerLoggedIn() {
		return loggedInUser instanceof Manager;
	}

	public boolean isSuperManagerLoggedIn() {
		return loggedInUser instanceof SuperManager;
	}

	private void notifyObservers() {
		for (AuthStateObserver observer : observers) {
			observer.onAuthStateChanged(isLoggedIn());
		}
	}
}