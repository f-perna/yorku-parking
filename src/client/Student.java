package client;

public class Student extends Client {
	
	Student(String name, String email, String password, String licensePlate) {
		super(name, email, password, type.STUDENT, licensePlate);
		rate = 5;
	}
}
