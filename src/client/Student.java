package client;

public class Student extends Client {
	
	Student(String name, String email, String password) {
		super(name, email, password, type.STUDENT);
		rate = 5;
	}
}
