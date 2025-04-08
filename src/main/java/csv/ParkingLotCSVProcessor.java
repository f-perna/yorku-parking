package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import models.parkingLot.ParkingLot;

public class ParkingLotCSVProcessor extends CSVHelper {
	private static final String PARKING_LOTS_CSV = DATA_DIRECTORY + "parkingLots.csv";

	public static List<ParkingLot> readLotData() {
		List<ParkingLot> parkingLots = new ArrayList<>();
		try (BufferedReader br = getFileReader(PARKING_LOTS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return parkingLots; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 3) {
					continue; // Skip invalid lines silently
				}

				try {
					String name = data[0];
					UUID id = UUID.fromString(data[1]);
					boolean enabled = Boolean.parseBoolean(data[2]);

					ParkingLot parkingLot = new ParkingLot(name, id, enabled);
					parkingLots.add(parkingLot);
				} catch (Exception e) {
					// Skip invalid entries silently
					continue;
				}
			}
		} catch (IOException e) {
			logError("Could not read lot data completely: " + e.getMessage());
		}
		return parkingLots;
	}

	public static void setLotData(List<ParkingLot> parkingLots) {
		try (BufferedWriter bw = getFileWriter(PARKING_LOTS_CSV)) {
			// Write header
			bw.write("name,id,enabled");
			bw.newLine();

			for (ParkingLot parkingLot : parkingLots) {
				String line = String.join(CSV_DELIMITER, parkingLot.getName(), parkingLot.getID().toString(),
						String.valueOf(parkingLot.isEnabled()));
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			logError("Error writing lot data: " + e.getMessage());
		}
	}
}