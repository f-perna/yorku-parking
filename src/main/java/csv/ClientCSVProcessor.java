package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.client.Client;
import models.client.GenerateClientFactory;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;

public class ClientCSVProcessor extends CSVHelper {
	private static String CLIENTS_CSV = DATA_DIRECTORY + "clients.csv";
	private static final int EXPECTED_FIELDS = 6;
	private static final String HEADER = "name,email,password,licencePlate,type,approved";

	public static void initializeTestFile(String filePath) throws IOException {
		CLIENTS_CSV = filePath;
		initializeTestFile(filePath, HEADER);
	}

	public static void cleanupAndReset(String filePath) {
		cleanupTestFile(filePath);
		CLIENTS_CSV = DATA_DIRECTORY + "clients.csv";
	}

	public static List<Client> readClientData() {
		List<Client> clients = new ArrayList<>();
		try (BufferedReader br = getFileReader(CLIENTS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return clients; // Return empty list if file is empty
			}

			int lineNumber = 2; // Start from 2 since we skipped header
			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != EXPECTED_FIELDS) {
					logError(String.format("Invalid client data format at line %d (expected %d fields): %s", lineNumber,
							EXPECTED_FIELDS, line));
					lineNumber++;
					continue;
				}

				try {
					String type = data[4].toUpperCase();
					Client.type clientType = Client.type.valueOf(type);
					String name = data[0];
					String email = data[1];
					String password = data[2];
					String licencePlate = data[3];
					Boolean approved = Boolean.valueOf(data[5]);

					if (name == null || name.trim().isEmpty()) {
						throw new ParkingSystemException("Name cannot be empty", ErrorType.VALIDATION);
					}
					if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
						throw new ParkingSystemException("Invalid email format", ErrorType.VALIDATION);
					}
					if (password == null || password.length() < 6) {
						throw new ParkingSystemException("Password must be at least 6 characters",
								ErrorType.VALIDATION);
					}
					if (licencePlate == null || !licencePlate.matches("^[A-Z0-9\\s]{2,8}$")) {
						throw new ParkingSystemException("Invalid licence plate format", ErrorType.VALIDATION);
					}

					Client client = GenerateClientFactory.getClientType(name, email, password, clientType, licencePlate,
							approved);
					if (client != null) {
						clients.add(client);
					}
				} catch (IllegalArgumentException e) {
					logError(String.format("Error parsing client data at line %d: %s", lineNumber, e.getMessage()));
				} catch (ParkingSystemException e) {
					logError(String.format("Validation error at line %d: %s", lineNumber, e.getMessage()));
				} catch (Exception e) {
					logError(String.format("Unexpected error at line %d: %s", lineNumber, e.getMessage()));
				}
				lineNumber++;
			}
		} catch (IOException e) {
			logError("Could not read client data completely: " + e.getMessage());
		}
		return clients;
	}

	public static void setClientData(List<Client> clients) {
		try (BufferedWriter bw = getFileWriter(CLIENTS_CSV)) {
			// Write header
			bw.write("name,email,password,licencePlate,type,approved");
			bw.newLine();

			for (Client client : clients) {
				try {
					if (client == null) {
						logError("Skipping null client");
						continue;
					}

					String line = String.join(CSV_DELIMITER, client.getName(), client.getEmail(), client.getPassword(),
							client.getLicencePlate(), client.getType().toString(),
							Boolean.toString(client.isApproved()));

					bw.write(line);
					bw.newLine();
				} catch (Exception e) {
					logError("Error writing client data for client " + (client != null ? client.getEmail() : "null")
							+ ": " + e.getMessage());
				}
			}
		} catch (IOException e) {
			logError("Error writing client data: " + e.getMessage());
		}
	}
}