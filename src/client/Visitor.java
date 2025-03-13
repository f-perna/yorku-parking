package client;

public class Visitor extends Client {

	Visitor(String name, String email, String password, String licensePlate) {
		super(name, email, password, type.VISITOR, licensePlate);
		rate = 15;
	}
    
}
