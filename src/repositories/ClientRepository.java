package repositories;

import java.util.ArrayList;
import java.util.List;
import main.ClientCSVProcessor;
import models.client.Client;

public class ClientRepository {
	private List<Client> clients;

	public ClientRepository() {
		this.clients = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		clients = ClientCSVProcessor.readClientData();
	}

	public void registerClient(Client client) {
		clients.add(client);
		saveClients();
	}

	public void saveClients() {
		ClientCSVProcessor.setClientData(clients);
	}

	public Client authenticateClient(String email, String password) {
		for (Client client : clients) {
			if (client.authenticate(email, password)) {
				return client;
			}
			;
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
