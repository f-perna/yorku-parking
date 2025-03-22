package models.manager;

import java.util.UUID;

public class Manager {
	protected UUID id;
	protected String username;
	protected String password;
	private ManagerType type;

	public static enum ManagerType {
		MANAGER, SUPER_MANAGER
	}

	public Manager(UUID id, String username, String password, ManagerType type) {
		this.username = username;
		this.password = password;
		this.id = id;
		this.type = type;
	}

	public UUID getID() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public ManagerType getType() {
		return type;
	}

	public boolean isSuperManager() {
		return type == ManagerType.SUPER_MANAGER;
	}

	public void setID(UUID id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return username != null && username.equals(other.username);
	}

	@Override
	public int hashCode() {
		return username != null ? username.hashCode() : 0;
	}
}
