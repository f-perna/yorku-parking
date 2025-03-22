package models.client;

public abstract class Client {
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

	public String getLicencePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRate() {
		return rate;
	}

	public type getType() {
		return this.type;
	}

	public void setType(type type) {
		this.type = type;
	}

	public boolean isApproved() {
		return approved;
	}
}
