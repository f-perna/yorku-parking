package client;

public class FacultyMember extends Client{

	FacultyMember(String name, String email, String password) {
		super(name, email, password, type.FACULTY);
		rate = 8;
	}

}
