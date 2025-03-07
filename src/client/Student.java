package client;

public class Student extends Client {
	
	Student(String name, String email, String password) {
		super(name, email, password);
		rate = 5;
	}
}
