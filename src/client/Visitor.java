package client;

public class Visitor extends Client {

	Visitor(String name, String email, String password) {
		super(name, email, password);
		rate = 15;
	}
    
}
