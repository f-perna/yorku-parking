package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import client.Client;
import client.GenerateClientFactory;

public final class CSVProcessor {
	private static final String CSV_DELIMITER = ",";
	private static final String USERS_CSV = "data/client.csv";

	private CSVProcessor() {
	}

	public static List<Client> readClientData() {
		List<Client> clients = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(USERS_CSV))) {

			String line = br.readLine();

			if (line == null) {
				System.err.println("Error: CSV file is empty");
				return clients;
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 6) {
					System.err.println("Error: Invalid number of columns in line: " + line);
					continue;
				}

				String type = data[4].toUpperCase();
				Client.type clientType;
				try {
					clientType = Client.type.valueOf(type);
				} catch (IllegalArgumentException e) {
					System.err.println("Invalid client type: " + type + " in line: " + line);
					continue;
				}

				String name = data[0];
				String email = data[1];
				String password = data[2];
				String licensePlate = data[3];

				Client client = GenerateClientFactory.getClientType(name, email, password, clientType, licensePlate);
				clients.add(client);
			}

		} catch (IOException e) {
			System.err.println("Error reading CSV file: " + e.getMessage());
		}

		return clients;
	}
}
