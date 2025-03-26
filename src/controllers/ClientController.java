package controllers;

import models.client.Client;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import services.ClientService;
import java.util.List;

public class ClientController {
	private final ClientService clientService;

	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	public boolean registerClient(String name, String email, String password, Client.type clientType,
			String licencePlate) {
		if (name == null || name.trim().isEmpty()) {
			throw new ParkingSystemException("Name must be provided", ErrorType.VALIDATION);
		}
		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			throw new ParkingSystemException("Email address must be in a valid format (e.g., user@domain.com)",
					ErrorType.VALIDATION);
		}
		if (password == null || password.length() < 8) {
			throw new ParkingSystemException("Password must be at least 8 characters long", ErrorType.VALIDATION);
		}
		if (licencePlate == null || !licencePlate.matches("^[A-Z0-9\\s]{2,8}$")) {
			throw new ParkingSystemException("Licence plate must contain 2-8 uppercase letters, numbers, and spaces",
					ErrorType.VALIDATION);
		}
		if (clientType == null) {
			throw new ParkingSystemException("Client type must be specified", ErrorType.VALIDATION);
		}

		String formattedName = name.trim();
		String formattedEmail = email.toLowerCase().trim();
		String formattedLicencePlate = licencePlate.toUpperCase().trim();

		return clientService.registerClient(formattedName, formattedEmail, password, clientType, formattedLicencePlate);
	}

	public List<Client> getAllClients() {
		return clientService.getAllClients();
	}

	public Client getClientByEmail(String email) {
		if (email == null || email.trim().isEmpty()) {
			throw new ParkingSystemException("Email address must be provided", ErrorType.VALIDATION);
		}
		if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			throw new ParkingSystemException("Email address must be in a valid format (e.g., user@domain.com)",
					ErrorType.VALIDATION);
		}

		String formattedEmail = email.toLowerCase().trim();
		return clientService.getClientByEmail(formattedEmail);
	}
}
