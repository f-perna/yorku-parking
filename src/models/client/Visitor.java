package models.client;

public class Visitor extends Client {

	Visitor(String name, String email, String password, String licencePlate, boolean approved) {
		super(name, email, password, type.VISITOR, licencePlate, approved);
		rate = 15;
	}
    
}
