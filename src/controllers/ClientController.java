package controllers;

import models.client.Client;
import services.ClientService;
import java.util.List;

public class ClientController {
	private ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	public boolean registerClient(String name, String email, String password, Client.type clientType,
			String licensePlate) {
		return clientService.registerClient(name, email, password, clientType, licensePlate);
	}

	public List<Client> getAllClients() {
		return clientService.getAllClients();
	}

	public Client getClientByEmail(String email) {
		return clientService.getClientByEmail(email);
	}

	public boolean approveClient(String email, boolean approved) {
		return clientService.approveClient(email, approved);
	}
}
