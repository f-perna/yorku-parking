package models.client;

public class NonFacultyMember extends Client{

	NonFacultyMember(String name, String email, String password, String licencePlate, boolean approved) {
		super(name, email, password, type.NON_FACULTY, licencePlate, approved);
		rate = 10;
	}

}
