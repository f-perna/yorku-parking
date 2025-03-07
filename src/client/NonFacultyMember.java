package client;

public class NonFacultyMember extends Client{

	NonFacultyMember(String name, String email, String password) {
		super(name, email, password);
		rate = 10;
	}

}
