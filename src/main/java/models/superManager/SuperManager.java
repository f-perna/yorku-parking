package models.superManager;

import models.user.User;

public class SuperManager implements User {
	private static SuperManager instance;
	private String email;
	private String password;
	
	private SuperManager(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public static synchronized SuperManager getInstance() {
		if (instance == null) {
			instance = new SuperManager("superadmin@parking.yorku.ca", "Super@dmin123!");
		}
		return instance;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public boolean authenticate(String email, String password) {
		return this.email.equals(email) && this.password.equals(password);
	}
}