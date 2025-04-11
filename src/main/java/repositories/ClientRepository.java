package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import csv.ClientCSVProcessor;
import models.client.Client;

public class ClientRepository {
	private final List<Client> clients;
	private final Object lock = new Object();

	public ClientRepository() {
		this.clients = new CopyOnWriteArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		synchronized (lock) {
			clients.clear();
			clients.addAll(ClientCSVProcessor.readClientData());
		}
	}

	public void registerClient(Client client) {
		if (client == null) {
			throw new IllegalArgumentException("Client cannot be null");
		}
		synchronized (lock) {
			clients.add(client);
			saveClients();
		}
	}
	
	public void deleteClient(String email) {
		if (email == null) {
			throw new IllegalArgumentException("Email cannot be null");
		}
		synchronized (lock) {
			Client removeClient = null;
			for (Client client : clients) {
				if (client.getEmail().equals(email)) {
					removeClient = client;
				}
			}
			clients.remove(removeClient);
			saveClients();
		}
	}

	public void saveClients() {
		synchronized (lock) {
			ClientCSVProcessor.setClientData(new ArrayList<>(clients));
		}
	}

	public Client authenticateClient(String email, String password) {
		if (email == null || password == null) {
			return null;
		}
		return clients.stream().filter(client -> client.authenticate(email, password)).findFirst().orElse(null);
	}

	public Client getClientByEmail(String email) {
		if (email == null) {
			return null;
		}
		return clients.stream().filter(client -> client.getEmail().equals(email)).findFirst().orElse(null);
	}
	
	public Client getClientByLicensePlate(String licensePlate) {
		if (licensePlate == null) {
			return null;
		}
		
		return clients.stream().filter(client -> client.getLicencePlate().equals(licensePlate)).findFirst().orElse(null);
	}

	public List<Client> getAllClients() {
		return new ArrayList<>(clients);
	}
}
