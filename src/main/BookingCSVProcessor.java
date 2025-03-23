package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import models.booking.Booking;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;

public class BookingCSVProcessor extends CSVHelper {
	private static final String BOOKINGS_CSV = DATA_DIRECTORY + "bookings.csv";

	public static List<Booking> readBookingData() {
		List<Booking> bookings = new ArrayList<>();
		Map<String, Client> clientMap = new HashMap<>();
		Map<UUID, ParkingSpace> spaceMap = new HashMap<>();

		// First, load all related data
		List<Client> clients = ClientCSVProcessor.readClientData();
		for (Client client : clients) {
			clientMap.put(client.getEmail(), client);
		}

		List<ParkingSpace> spaces = ParkingSpaceCSVProcessor.readSpaceData();
		for (ParkingSpace space : spaces) {
			spaceMap.put(space.getID(), space);
		}

		try (BufferedReader br = getFileReader(BOOKINGS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return bookings; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 7) {
					continue; // Skip invalid lines silently
				}

				try {
					UUID bookingId = UUID.fromString(data[0]);
					String clientEmail = data[1];
					UUID spaceId = UUID.fromString(data[2]);
					Booking.BookingStatus status = Booking.BookingStatus.valueOf(data[3]);
					LocalDateTime startTime = LocalDateTime.parse(data[4]);
					LocalDateTime endTime = LocalDateTime.parse(data[5]);
					double deposit = Double.parseDouble(data[6]);

					// Get related objects
					Client client = clientMap.get(clientEmail);
					ParkingSpace space = spaceMap.get(spaceId);

					if (client != null && space != null) {
						Booking booking = new Booking(bookingId, client, space, status, startTime, endTime, deposit);
						bookings.add(booking);
					}
				} catch (Exception e) {
					// Skip invalid entries silently
					continue;
				}
			}
		} catch (IOException e) {
			logError("Could not read booking data completely: " + e.getMessage());
		}
		return bookings;
	}

	public static void setBookingData(List<Booking> bookings) {
		try (BufferedWriter bw = getFileWriter(BOOKINGS_CSV)) {
			// Write header
			bw.write("bookingID,clientEmail,parkingID,bookingStatus,startTime,endTime,deposit");
			bw.newLine();

			for (Booking booking : bookings) {
				String line = String.join(CSV_DELIMITER, booking.getBookingID().toString(),
						booking.getClient().getEmail(), booking.getParkingSpace().getID().toString(),
						booking.getStatus().toString(), booking.getStartTime().toString(),
						booking.getEndTime().toString(), Double.toString(booking.getDeposit()));
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			logError("Error writing booking data: " + e.getMessage());
		}
	}
}