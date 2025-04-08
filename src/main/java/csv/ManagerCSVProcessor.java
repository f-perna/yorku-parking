package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import models.client.Client;
import models.client.GenerateClientFactory;
import models.manager.Manager;

/**
 * CSV processor for client operations
 */
public class ManagerCSVProcessor extends CSVHelper {
	private static final String MANAGERS_CSV = DATA_DIRECTORY + "managers.csv";

	public static List<Manager> readManagerData() {
		List<Manager> managers = new ArrayList<>();

		try (BufferedReader br = getFileReader(MANAGERS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return managers; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 2) {
					continue; // Skip invalid lines silently
				}

				try {
					String email = data[0];
					String password = data[1];

					Manager manager = new Manager(email, password);
					if (manager != null) {
						managers.add(manager);
					}
				} catch (Exception e) {
					// Skip invalid entries silently
					continue;
				}
			}
		} catch (IOException e) {
			logError("Could not read manager data completely: " + e.getMessage());
		}
		return managers;
	}

	public static void setManagerData(List<Manager> managers) {
		try (BufferedWriter bw = getFileWriter(MANAGERS_CSV)) {
			// Write header
			bw.write("email,password");
			bw.newLine();

			for (Manager manager : managers) {
				String line = String.join(CSV_DELIMITER, manager.getEmail(), manager.getPassword());
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			logError("Error writing client data: " + e.getMessage());
		}
	}
}