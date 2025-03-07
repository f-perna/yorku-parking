package client;

public class GenerateClientFactory {
	public static Client getClientType(String name, String email, String password, Client.type clientType) {
		if (clientType == Client.type.STUDENT) {
			return new Student(name, email, password);
		} else if (clientType == Client.type.FACULTY) {
			return new FacultyMember(name, email, password);
		} else if (clientType == Client.type.NON_FACULTY) {
			return new NonFacultyMember(name, email, password);
		} else if (clientType == Client.type.VISITOR) {
			return new Visitor(name, email, password);
		} else {
			return null;
		}
	}
}
