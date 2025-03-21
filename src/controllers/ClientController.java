package controllers;

import models.client.Client;
import services.ClientService;

public class ClientController {
	private ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	public boolean registerClient(String name, String email, String password, Client.type clientType,
			String licensePlate) {
		return clientService.registerClient(name, email, password, clientType, licensePlate);
	}

	public boolean login(String email, String password) {
		return clientService.login(email, password);
	}

	public Client getLoggedInClient() {
		return clientService.getLoggedInClient();
	}

	public void logout() {
		clientService.logout();
	}
}
