package services;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.client.Client;
import models.client.GenerateClientFactory;
import repositories.ClientRepository;

import java.util.List;
import java.util.regex.Pattern;

public class ClientService {
	private final ClientRepository clientRepository;
	private final AuthenticationState authState;

	// Password pattern: at least one uppercase, one lowercase, one digit, one
	// special character, min 8 chars
	private static final Pattern PASSWORD_PATTERN = Pattern
			.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&_#])[A-Za-z\\d@$!%*?&_#]{8,}$");

	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
		this.authState = AuthenticationState.getInstance();
	}

	public boolean registerClient(String name, String email, String password, Client.type clientType,
			String licencePlate) {
		if (name == null || name.trim().isEmpty()) {
			throw new ParkingSystemException("Name cannot be empty", ErrorType.VALIDATION);
		}
		if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			throw new ParkingSystemException("Invalid email format", ErrorType.VALIDATION);
		}
		if (password == null || !PASSWORD_PATTERN.matcher(password).matches()) {
			throw new ParkingSystemException(
					"Password must contain at least one uppercase letter, one lowercase letter, one number, and one symbol (minimum 8 characters)",
					ErrorType.VALIDATION);
		}
		if (licencePlate == null || !licencePlate.matches("^[A-Z0-9\\s]{2,8}$")) {
			throw new ParkingSystemException("Invalid licence plate format", ErrorType.VALIDATION);
		}

		if (clientRepository.getClientByEmail(email) != null) {
			throw new ParkingSystemException("Email address is already registered in the system",
					ErrorType.BUSINESS_LOGIC);
		}

		boolean approved = (clientType == Client.type.VISITOR);

		Client newClient = GenerateClientFactory.getClientType(name.trim(), email.toLowerCase(), password, clientType,
				licencePlate.toUpperCase(), approved);

		clientRepository.registerClient(newClient);
		return true;
	}

	public boolean login(String email, String password) {
		if (email == null || password == null) {
			return false;
		}

		email = email.toLowerCase().trim();

		Client client = clientRepository.authenticateClient(email, password);
		if (client == null) {
			throw new ParkingSystemException("Invalid email address or password", ErrorType.AUTHENTICATION);
		}

		if (!client.isApproved() && client.getType() != Client.type.VISITOR) {
			throw new ParkingSystemException(
					"Your account is pending approval by a manager. Please wait for approval to access the system.",
					ErrorType.AUTHORIZATION);
		}

		authState.setLoggedInUser(client);
		return true;
	}

	public List<Client> getAllClients() {
		return clientRepository.getAllClients();
	}

	public Client getClientByEmail(String email) {
		if (email == null) {
			throw new ParkingSystemException("Email address must be provided", ErrorType.VALIDATION);
		}

		Client currentUser = (Client) authState.getLoggedInUser();
		if (currentUser == null || (!currentUser.getEmail().equals(email) && !authState.isManagerLoggedIn())) {
			throw new ParkingSystemException("You are not authorized to view this client's information",
					ErrorType.AUTHORIZATION);
		}
		return clientRepository.getClientByEmail(email);
	}

	public boolean approveClient(String email, boolean approved) {
		if (email == null) {
			throw new ParkingSystemException("Email address must be provided", ErrorType.VALIDATION);
		}

		if (!authState.isManagerLoggedIn()) {
			throw new ParkingSystemException("Only managers can approve clients", ErrorType.AUTHORIZATION);
		}

		Client client = clientRepository.getClientByEmail(email);
		if (client == null) {
			throw new ParkingSystemException("Client account not found", ErrorType.BUSINESS_LOGIC);
		}

		if (client.getType() == Client.type.VISITOR) {
			throw new ParkingSystemException("Visitor accounts cannot be approved", ErrorType.BUSINESS_LOGIC);
		}

		client.setApproved(approved);
		clientRepository.saveClients();
		return true;
	}
}