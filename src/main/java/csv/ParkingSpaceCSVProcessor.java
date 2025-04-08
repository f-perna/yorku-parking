package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;

public class ParkingSpaceCSVProcessor extends CSVHelper {
	private static final String SPACES_CSV = DATA_DIRECTORY + "parkingSpaces.csv";

	public static List<ParkingSpace> readSpaceData() {
		List<ParkingSpace> spaces = new ArrayList<>();
		Map<UUID, ParkingLot> lotMap = new HashMap<>();

		// First read all parking lots
		List<ParkingLot> lots = ParkingLotCSVProcessor.readLotData();
		for (ParkingLot lot : lots) {
			lotMap.put(lot.getID(), lot);
		}

		try (BufferedReader br = getFileReader(SPACES_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return spaces; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 5) {
					continue; // Skip invalid lines silently
				}

				try {
					UUID id = UUID.fromString(data[0]);
					UUID lotID = UUID.fromString(data[1]);
					ParkingSpaceStatus status = ParkingSpaceStatus.valueOf(data[2]);
					String name = data[3];
					boolean enabled = Boolean.parseBoolean(data[4]);

					ParkingLot parkingLot = lotMap.get(lotID);
					if (parkingLot != null) {
						ParkingSpace space = new ParkingSpace(id, parkingLot, status, name, enabled);
						spaces.add(space);
					}
				} catch (Exception e) {
					// Skip invalid entries silently
					System.out.println("Error parsing space data: " + e.getMessage());
					continue;
				}
			}
		} catch (IOException e) {
			logError("Could not read space data completely: " + e.getMessage());
		}
		return spaces;
	}

	public static void setSpaceData(List<ParkingSpace> spaces) {
		try (BufferedWriter bw = getFileWriter(SPACES_CSV)) {
			// Write header
			bw.write("id,lotID,status,name,enabled");
			bw.newLine();

			for (ParkingSpace space : spaces) {
				String line = String.join(CSV_DELIMITER, space.getID().toString(), space.getLot().getID().toString(),
						space.getStatus().toString(), space.getName(), String.valueOf(space.isEnabled()));
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			logError("Error writing space data: " + e.getMessage());
		}
	}
}