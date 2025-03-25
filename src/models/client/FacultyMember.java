package models.client;

public class FacultyMember extends Client {

	FacultyMember(String name, String email, String password, String licencePlate, boolean approved) {
		super(name, email, password, type.FACULTY, licencePlate, approved);
		rate = 8;
	}

}
