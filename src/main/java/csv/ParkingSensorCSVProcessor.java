package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.parkingSensor.ParkingSensor;
import models.parkingSpace.ParkingSpace;

public class ParkingSensorCSVProcessor extends CSVHelper {
	private static final String SENSORS_CSV = DATA_DIRECTORY + "parkingSensors.csv";
	private static final int EXPECTED_FIELDS = 4;

	public static List<ParkingSensor> readSensorData() {
		List<ParkingSensor> sensors = new ArrayList<>();
		Map<UUID, ParkingSpace> spacesMap = new HashMap<>();

		// First load all parking spaces
		try {
			List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
			for (ParkingSpace space : spaces) {
				spacesMap.put(space.getID(), space);
			}
		} catch (Exception e) {
			logError("Failed to load parking space data: " + e.getMessage());
			return sensors;
		}

		try (BufferedReader br = getFileReader(SENSORS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return sensors; // Return empty list if file is empty
			}

			int lineNumber = 2; // Start from 2 since we skipped header
			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != EXPECTED_FIELDS) {
					logError(String.format("Invalid sensor data format at line %d (expected %d fields): %s", lineNumber,
							EXPECTED_FIELDS, line));
					lineNumber++;
					continue;
				}

				try {
					UUID sensorId = UUID.fromString(data[0]);
					UUID parkingSpaceId = UUID.fromString(data[1]);
					boolean carPresent = Boolean.parseBoolean(data[2]);
					String licencePlate = data[3].equals("null") ? null : data[3];

					// Validate data
					if (carPresent && (licencePlate == null || licencePlate.trim().isEmpty())) {
						throw new ParkingSystemException("Licence plate is required when a car is present",
								ErrorType.VALIDATION);
					}

					ParkingSpace parkingSpace = spacesMap.get(parkingSpaceId);
					if (parkingSpace == null) {
						logError(String.format("Sensor %s references non-existent parking space %s at line %d",
								sensorId, parkingSpaceId, lineNumber));
						continue;
					}

					ParkingSensor sensor = new ParkingSensor(parkingSpace, sensorId);
					if (carPresent && licencePlate != null) {
						// Initialize the sensor with a car present if it was saved that way
						sensor.initializeWithCar(licencePlate);
					}
					sensors.add(sensor);
				} catch (IllegalArgumentException e) {
					logError(String.format("Error parsing sensor data at line %d: %s", lineNumber, e.getMessage()));
				} catch (ParkingSystemException e) {
					logError(String.format("Validation error at line %d: %s", lineNumber, e.getMessage()));
				} catch (Exception e) {
					logError(String.format("Unexpected error at line %d: %s", lineNumber, e.getMessage()));
				}
				lineNumber++;
			}
		} catch (IOException e) {
			logError("Could not read sensor data completely: " + e.getMessage());
		}
		return sensors;
	}

	public static void setSensorData(List<ParkingSensor> sensors) {
		try (BufferedWriter bw = getFileWriter(SENSORS_CSV)) {
			// Write header
			bw.write("sensorId,parkingSpaceId,carPresent,licencePlate");
			bw.newLine();

			for (ParkingSensor sensor : sensors) {
				try {
					if (sensor == null) {
						logError("Skipping null sensor");
						continue;
					}

					if (sensor.getParkingSpace() == null) {
						logError("Skipping sensor " + sensor.getId() + " with null parking space");
						continue;
					}

					String line = String.join(CSV_DELIMITER, sensor.getId().toString(),
							sensor.getParkingSpace().getID().toString(), Boolean.toString(sensor.isCarPresent()),
							sensor.getDetectedLicencePlate() != null ? sensor.getDetectedLicencePlate() : "null");

					bw.write(line);
					bw.newLine();
				} catch (Exception e) {
					logError("Error writing sensor data for sensor " + (sensor != null ? sensor.getId() : "null") + ": "
							+ e.getMessage());
				}
			}
		} catch (IOException e) {
			logError("Error writing sensor data: " + e.getMessage());
		}
	}
}