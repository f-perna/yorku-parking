package client;

public abstract class Client {
	private String email;
	private String password;
	private String name;
	private String licensePlate;
	protected int rate;
	
	public static enum type {
		STUDENT, FACULTY, NON_FACULTY, VISITOR;
	}
	
	Client(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public void login(String email, String password) {
		//TODO Implement
		System.out.println("Logged in");
	}
	
	public void bookParkingSpace() {
		
	}
	
	public void cancelParking() {
		
	}
	
	public void extendParkingTime() {
		
	}
	
	public void makePayment() {
		
	}
	
}
