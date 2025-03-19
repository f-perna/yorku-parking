package controllers;

import models.client.Client;
import models.client.GenerateClientFactory;
import models.client.ClientModel;
import models.auth.AuthenticationState;

public class ClientController {
	private ClientModel clientModel;
	private AuthenticationState authState;

	public ClientController(ClientModel clientModel) {
		this.authState = AuthenticationState.getInstance();
		this.clientModel = clientModel;
	}

	public boolean registerClient(String name, String email, String password, Client.type clientType,
			String licensePlate) {

		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty");
		}
		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			throw new IllegalArgumentException("Invalid email format");
		}
		if (password == null || password.length() < 6) {
			throw new IllegalArgumentException("Password must be at least 6 characters");
		}
		if (licensePlate == null || !licensePlate.matches("^[A-Z0-9]{2,8}$")) {
			throw new IllegalArgumentException("Invalid license plate format");
		}

		if (clientModel.getClientByEmail(email) != null) {
			return false;
		}

		boolean approved = (clientType == Client.type.VISITOR);

		Client newClient = GenerateClientFactory.getClientType(name.trim(), email.toLowerCase(), password, clientType,
				licensePlate.toUpperCase(), approved);

		clientModel.registerClient(newClient);
		return true;
	}

	public boolean login(String email, String password) {
		if (email == null || password == null) {
			return false;
		}

		email = email.toLowerCase().trim();

		Client client = clientModel.authenticateClient(email, password);
		if (client != null) {
			authState.setLoggedInClient(client);
			return true;
		}
		return false;
	}

	public Client getLoggedInClient() {
		return authState.getLoggedInClient();
	}

	public void logout() {
		if (!authState.isLoggedIn()) {
			throw new IllegalStateException("No user is currently logged in");
		}
		authState.setLoggedInClient(null);
	}
}
