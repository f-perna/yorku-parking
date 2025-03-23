package services;

import models.auth.AuthenticationState;
import models.client.Client;
import models.client.GenerateClientFactory;
import repositories.ClientRepository;

import java.util.List;

public class ClientService {
	private ClientRepository clientModel;
	private AuthenticationState authState;

	public ClientService(ClientRepository clientModel) {
		this.clientModel = clientModel;
		this.authState = AuthenticationState.getInstance();
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
			authState.setLoggedInUser(client);
			return true;
		}
		return false;
	}

	public List<Client> getAllClients() {
		return clientModel.getAllClients();
	}

	public Client getClientByEmail(String email) {
		if (email == null) {
			throw new IllegalArgumentException("Email cannot be null");
		}

		return clientModel.getClientByEmail(email.toLowerCase().trim());
	}

	public boolean approveClient(String email, boolean approved) {
		if (email == null) {
			throw new IllegalArgumentException("Email cannot be null");
		}

		if (!authState.isManagerLoggedIn() && !authState.isSuperManagerLoggedIn()) {
			throw new IllegalStateException("Only managers can approve clients");
		}

		Client client = clientModel.getClientByEmail(email.toLowerCase().trim());
		if (client == null) {
			return false;
		}

		client.setApproved(approved);
		clientModel.saveClients();
		return true;
	}

}