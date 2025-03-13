package client;

public class NonFacultyMember extends Client{

	NonFacultyMember(String name, String email, String password, String licensePlate) {
		super(name, email, password, type.NON_FACULTY, licensePlate);
		rate = 10;
	}

}
