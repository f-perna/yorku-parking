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
	
	
	public void bookParkingSpace() {
		
	}
	
	public void cancelParking() {
		
	}
	
	public void extendParkingTime() {
		
	}
	
	public void makePayment() {
		
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

	public void setDeposit(double deposit) {
		// TODO Auto-genegd method stub
		
	}
	
	public int getRate() {
		return rate;
	}

	public boolean clientnoshow(int durationinhours) {
		// TODO Auto-generated method stub
		return false;
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
