package models.client;

public class NonFacultyMember extends Client{

	NonFacultyMember(String name, String email, String password, String licensePlate, boolean approved) {
		super(name, email, password, type.NON_FACULTY, licensePlate, approved);
		rate = 10;
	}

}
