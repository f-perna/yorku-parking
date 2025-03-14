package client;

public class Visitor extends Client {

	Visitor(String name, String email, String password, String licensePlate, boolean approved) {
		super(name, email, password, type.VISITOR, licensePlate, approved);
		rate = 15;
	}
    
}
