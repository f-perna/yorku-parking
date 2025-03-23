package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.client.Client;
import models.client.GenerateClientFactory;

public class ClientCSVProcessor extends CSVHelper {
	private static final String CLIENTS_CSV = DATA_DIRECTORY + "clients.csv";

	public static List<Client> readClientData() {
		List<Client> clients = new ArrayList<>();
		try (BufferedReader br = getFileReader(CLIENTS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return clients; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 6) {
					continue; // Skip invalid lines silently
				}

				try {
					String type = data[4].toUpperCase();
					Client.type clientType = Client.type.valueOf(type);
					String name = data[0];
					String email = data[1];
					String password = data[2];
					String licensePlate = data[3];
					Boolean approved = Boolean.valueOf(data[5]);

					Client client = GenerateClientFactory.getClientType(name, email, password, clientType, licensePlate,
							approved);
					if (client != null) {
						clients.add(client);
					}
				} catch (Exception e) {
					// Skip invalid entries silently
					continue;
				}
			}
		} catch (IOException e) {
			logError("Could not read client data completely: " + e.getMessage());
		}
		return clients;
	}

	public static void setClientData(List<Client> clients) {
		try (BufferedWriter bw = getFileWriter(CLIENTS_CSV)) {
			// Write header
			bw.write("name,email,password,licensePlate,type,approved");
			bw.newLine();

			for (Client client : clients) {
				String line = String.join(CSV_DELIMITER, client.getName(), client.getEmail(), client.getPassword(),
						client.getLicencePlate(), client.getType().name(), String.valueOf(client.isApproved()));
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			logError("Error writing client data: " + e.getMessage());
		}
	}
}