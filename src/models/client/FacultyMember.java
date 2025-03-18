package models.client;

public class FacultyMember extends Client{

	FacultyMember(String name, String email, String password, String licensePlate, boolean approved) {
		super(name, email, password, type.FACULTY, licensePlate, approved);
		rate = 8;
	}

}
