package client;

public class FacultyMember extends Client{

	FacultyMember(String name, String email, String password, String licensePlate) {
		super(name, email, password, type.FACULTY, licensePlate);
		rate = 8;
	}

}
