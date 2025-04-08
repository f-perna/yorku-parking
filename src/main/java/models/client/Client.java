package models.client;

import models.user.User;
import java.util.Objects;

public abstract class Client implements User {
	private final String email;
	private final String password;
	private final String name;
	private final String licencePlate;
	private final type type;
	protected int rate;
	private boolean approved;

	public static enum type {
		STUDENT, FACULTY, NON_FACULTY, VISITOR;
	}

	protected Client(String name, String email, String password, type type, String licencePlate, boolean approved) {
		this.name = Objects.requireNonNull(name, "Name cannot be null");
		this.email = Objects.requireNonNull(email, "Email cannot be null");
		this.password = Objects.requireNonNull(password, "Password cannot be null");
		this.type = Objects.requireNonNull(type, "Type cannot be null");
		this.licencePlate = Objects.requireNonNull(licencePlate, "Licence plate cannot be null");
		this.approved = approved;
	}

	@Override
	public boolean authenticate(String email, String password) {
		return this.email.equals(email) && this.password.equals(password);
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
		return licencePlate;
	}

	public type getType() {
		return type;
	}

	public int getRate() {
		return rate;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass().getSuperclass() != obj.getClass().getSuperclass()) {
			return false;
		}
		Client other = (Client) obj;
		return email.equals(other.email);
	}

	@Override
	public int hashCode() {
		return email.hashCode();
	}
}
