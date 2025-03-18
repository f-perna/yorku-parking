package models.client;

public class Student extends Client {
	
	Student(String name, String email, String password, String licensePlate, boolean approved) {
		super(name, email, password, type.STUDENT, licensePlate, approved);
		rate = 5;
	}
}
