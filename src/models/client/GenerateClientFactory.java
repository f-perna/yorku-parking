package models.client;

public class GenerateClientFactory {
	public static Client getClientType(String name, String email, String password, Client.type clientType, String licencePlate, boolean approved) {
		if (clientType == Client.type.STUDENT) {
			return new Student(name, email, password, licencePlate, approved);
		} else if (clientType == Client.type.FACULTY) {
			return new FacultyMember(name, email, password, licencePlate, approved);
		} else if (clientType == Client.type.NON_FACULTY) {
			return new NonFacultyMember(name, email, password, licencePlate, approved);
		} else if (clientType == Client.type.VISITOR) {
			return new Visitor(name, email, password, licencePlate, approved);
		} else {
			return null;
		}
	}
}
