package models.client;

public class Student extends Client {
	
	Student(String name, String email, String password, String licencePlate, boolean approved) {
		super(name, email, password, type.STUDENT, licencePlate, approved);
		rate = 5;
	}
}
