package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.booking.Booking;
import models.client.Client;
import models.parkingSpace.ParkingSpace;

public class BookingCSVProcessor extends CSVHelper {
	private static final String BOOKINGS_CSV = DATA_DIRECTORY + "bookings.csv";
	private static final int EXPECTED_FIELDS = 7;

	public static List<Booking> readBookingData() {
		List<Booking> bookings = new ArrayList<>();
		Map<String, Client> clientMap = new HashMap<>();
		Map<UUID, ParkingSpace> spaceMap = new HashMap<>();

		// First load all clients and spaces
		try {
			List<Client> clients = ClientCSVProcessor.readClientData();
			for (Client client : clients) {
				clientMap.put(client.getEmail(), client);
			}

			List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
			for (ParkingSpace space : spaces) {
				spaceMap.put(space.getID(), space);
			}
		} catch (Exception e) {
			logError("Failed to load client or parking space data: " + e.getMessage());
			return bookings;
		}

		try (BufferedReader br = getFileReader(BOOKINGS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return bookings; // Return empty list if file is empty
			}

			int lineNumber = 2; // Start from 2 since we skipped header
			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length < EXPECTED_FIELDS) {
					logError(String.format("Invalid booking data format at line %d (expected %d fields): %s",
							lineNumber, EXPECTED_FIELDS, line));
					lineNumber++;
					continue;
				}

				try {
					UUID bookingId = UUID.fromString(data[0]);
					String clientEmail = data[1];
					UUID spaceId = UUID.fromString(data[2]);
					Booking.BookingStatus status = Booking.BookingStatus.valueOf(data[3]);
					LocalDateTime startTime = LocalDateTime.parse(data[4]);
					LocalDateTime endTime = LocalDateTime.parse(data[5]);
					double deposit = Double.parseDouble(data[6]);

					// Validate data
					if (startTime.isAfter(endTime)) {
						throw new ParkingSystemException("Start time cannot be after end time", ErrorType.VALIDATION);
					}
					if (deposit < 0) {
						throw new ParkingSystemException("Deposit cannot be negative", ErrorType.VALIDATION);
					}

					// Get related objects
					Client client = clientMap.get(clientEmail);
					ParkingSpace space = spaceMap.get(spaceId);

					if (client == null) {
						logError(String.format("Client not found for email %s at line %d", clientEmail, lineNumber));
						continue;
					}
					if (space == null) {
						logError(String.format("Parking space not found for ID %s at line %d", spaceId, lineNumber));
						continue;
					}

					Booking booking = new Booking(bookingId, client, space, status, startTime, endTime, deposit);
					bookings.add(booking);
				} catch (IllegalArgumentException e) {
					logError(String.format("Error parsing booking data at line %d: %s", lineNumber, e.getMessage()));
				} catch (DateTimeParseException e) {
					logError(String.format("Error parsing date/time at line %d: %s", lineNumber, e.getMessage()));
				} catch (ParkingSystemException e) {
					logError(String.format("Validation error at line %d: %s", lineNumber, e.getMessage()));
				} catch (Exception e) {
					logError(String.format("Unexpected error at line %d: %s", lineNumber, e.getMessage()));
				}
				lineNumber++;
			}
		} catch (IOException e) {
			logError("Could not read booking data completely: " + e.getMessage());
		}
		return bookings;
	}

	public static void setBookingData(List<Booking> bookings) {
		try (BufferedWriter bw = getFileWriter(BOOKINGS_CSV)) {
			// Write header
			bw.write("id,clientEmail,spaceId,status,startTime,endTime,deposit");
			bw.newLine();

			for (Booking booking : bookings) {
				try {
					if (booking == null) {
						logError("Skipping null booking");
						continue;
					}

					if (booking.getClient() == null || booking.getParkingSpace() == null) {
						logError("Skipping booking " + booking.getBookingID() + " with null client or parking space");
						continue;
					}

					String line = String.join(CSV_DELIMITER, booking.getBookingID().toString(),
							booking.getClient().getEmail(), booking.getParkingSpace().getID().toString(),
							booking.getStatus().toString(), booking.getStartTime().toString(),
							booking.getEndTime().toString(), Double.toString(booking.getDeposit()));

					bw.write(line);
					bw.newLine();
				} catch (Exception e) {
					logError("Error writing booking data for booking "
							+ (booking != null ? booking.getBookingID() : "null") + ": " + e.getMessage());
				}
			}
		} catch (IOException e) {
			logError("Error writing booking data: " + e.getMessage());
		}
	}
}