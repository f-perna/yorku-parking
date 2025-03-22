package models.manager;

import java.util.UUID;

public class SuperManager {
	private static SuperManager instance;
	private String username;
	private String password;
	private UUID id;

	private SuperManager(String username, String password) {
		this.username = username;
		this.password = password;
		this.id = UUID.randomUUID();
	}

	public static synchronized SuperManager getInstance() {
		if (instance == null) {
			instance = new SuperManager("superadmin", "SuperSecurePassword123!");
		}
		return instance;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public UUID getId() {
		return id;
	}
}