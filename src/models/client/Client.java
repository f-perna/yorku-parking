package models.client;

import models.user.User;

public abstract class Client implements User {
	private String email;
	private String password;
	private String name;
	private String licensePlate;
	private type type;
	protected int rate;
	private boolean approved;

	public static enum type {
		STUDENT, FACULTY, NON_FACULTY, VISITOR;
	}

	Client(String name, String email, String password, type type, String licensePlate, boolean approved) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.type = type;
		this.licensePlate = licensePlate;
		this.approved = approved;
	}

	@Override
	public boolean authenticate(String email, String password) {
		return this.email.equals(email) && this.password.equals(password) && approved;
	}

	public boolean isApproved() {
		return approved;
	}

	// getters
	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getLicencePlate() {
		return licensePlate;
	}

	public type getType() {
		return this.type;
	}

	public int getRate() {
		return rate;
	}

	public void setApproved(boolean approval) {
		this.approved = approval;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass().getSuperclass() != obj.getClass().getSuperclass())
			return false;
		Client other = (Client) obj;
		return email != null && email.equals(other.email);
	}

	@Override
	public int hashCode() {
		return email != null ? email.hashCode() : 0;
	}
}
