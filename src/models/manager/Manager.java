package models.manager;

import java.io.Serializable;
import models.user.User;

public class Manager implements User {
	private String email;
	private String password;

	public Manager(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public String getEmail() {
		return email;
	}

	@Override
	public boolean authenticate(String email, String password) {
		return this.email.equals(email) && this.password.equals(password);
	}

	public String getPassword() {
		return password;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return email != null && email.equals(other.email);
	}

	@Override
	public int hashCode() {
		return email != null ? email.hashCode() : 0;
	}
}
