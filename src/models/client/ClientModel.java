package models.client;

import java.util.ArrayList;
import java.util.List;
import main.CSVProcessor;

public class ClientModel {
	private List<Client> clients;

	public ClientModel() {
		this.clients = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		clients = CSVProcessor.readClientData();
	}

	public void registerClient(Client client) {
		clients.add(client);
		CSVProcessor.setClientData(clients);
	}

	public Client authenticateClient(String email, String password) {
		for (Client client : clients) {
			String clientEmail = client.getEmail();
			String clientPassword = client.getPassword();

			if (email.equals(clientEmail) && password.equals(clientPassword)) {
				return client;
			}
		}
		return null;
	}

	public Client getClientByEmail(String email) {
		for (Client client : clients) {
			if (client.getEmail().equals(email)) {
				return client;
			}
		}
		return null;
	}

	public List<Client> getAllClients() {
		return new ArrayList<>(clients);
	}
}
