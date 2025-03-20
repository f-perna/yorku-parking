package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.HashMap;
import java.util.Map;

import models.booking.Booking;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingStatus;
import models.payment.Payment;
import models.payment.PaymentMethod;

public final class CSVProcessor {
	private static final String CSV_DELIMITER = ",";
	private static final String USERS_CSV = "data/client.csv";
	private static final String LOTS_CSV = "data/lots.csv";
	private static final String SPACES_CSV = "data/spaces.csv";
	private static final String PAYMENTS_CSV = "data/payments.csv";
	private static final String BOOKINGS_CSV = "data/bookings.csv";

	private CSVProcessor() {
	}

	public static List<Client> readClientData() {
		List<Client> clients = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(USERS_CSV))) {
			String line = br.readLine();
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
			// Log error but don't show in console
			System.err.println("Warning: Could not read client data completely");
		}
		return clients;
	}

	public static void setClientData(List<Client> clients) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_CSV))) {
			// Write header (assuming the CSV has a header row)
			bw.write("name, email, password, licensePlate, type, approved");
			bw.newLine();

			for (Client client : clients) {
				String line = String.join(CSV_DELIMITER, client.getName(), client.getEmail(), client.getPassword(),
						client.getLicencePlate(), client.getType().name(), String.valueOf(client.isApproved()));
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			System.err.println("Error writing to CSV file: " + e.getMessage());
		}
	}

	public static void setBookingData(List<Booking> bookings) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(BOOKINGS_CSV))) {
			// Write header (assuming the CSV has a header row)
			bw.write("bookingID, clientEmail, parkingID, bookingStatus, startTime, endTime, deposit, finalAmount");
			bw.newLine();

			for (Booking booking : bookings) {
				String paymentID = (booking.getPayment() == null) ? "null"
						: booking.getPayment().getPaymentID().toString();
				String line = String.join(CSV_DELIMITER, booking.getBookingId().toString(),
						booking.getClient().getEmail(), booking.getParkingSpace().getID().toString(),
						booking.getStatus().toString(), booking.getStartTime().toString(),
						booking.getEndTime().toString(), Double.toString(booking.getDeposit()),
						Double.toString(booking.getFinalPaymentAmount()), paymentID);
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			System.err.println("Error writing to CSV file: " + e.getMessage());
		}
	}

//	public static void setLotAndSpaceData(List<ParkingLot> parkingLots) {
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOTS_CSV))) {
//			// Write header (assuming the CSV has a header row)
//			bw.write("name, id");
//			bw.newLine();
//
//			for (ParkingLot parkingLot : parkingLots) {
//				String line = String.join(CSV_DELIMITER, parkingLot.getName(), parkingLot.getID().toString());
//				bw.write(line);
//				bw.newLine();
//			}
//
//		} catch (IOException e) {
//			System.err.println("Error writing to CSV file: " + e.getMessage());
//		}
//
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(SPACES_CSV))) {
//			// Write header (assuming the CSV has a header row)
//			bw.write("id, lotID, status, name");
//			bw.newLine();
//
//			for (ParkingLot parkingLot : parkingLots) {
//				for (ParkingSpace parkingSpace : parkingLot.getParkingSpaces()) {
//					String line = String.join(CSV_DELIMITER, parkingSpace.getID().toString(),
//							parkingSpace.getLot().getID().toString(), parkingSpace.getStatus().toString(),
//							parkingSpace.getName());
//					bw.write(line);
//					bw.newLine();
//				}
//			}
//
//		} catch (IOException e) {
//			System.err.println("Error writing to CSV file: " + e.getMessage());
//		}
//	}

	public static void setPaymentData(List<Payment> payments) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(PAYMENTS_CSV))) {
			// Write header (assuming the CSV has a header row)
			bw.write("paymentID, amount, status, paymentMethod");
			bw.newLine();

			for (Payment payment : payments) {
				String line = String.join(CSV_DELIMITER, payment.getPaymentID().toString(),
						Double.toString(payment.getAmount()), payment.getStatus().toString(),
						payment.getMethod().toString());
				bw.write(line);
				bw.newLine();
			}

		} catch (IOException e) {
			System.err.println("Error writing to CSV file: " + e.getMessage());
		}
	}

	public static List<ParkingLot> readLotData() {
		List<ParkingLot> parkingLots = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(LOTS_CSV))) {
			String line = br.readLine();
			if (line == null) {
				return parkingLots; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 2) {
					continue; // Skip invalid lines silently
				}

				try {
					String name = data[0];
					UUID id = UUID.fromString(data[1]);
					ParkingLot parkingLot = new ParkingLot(name, id);
					parkingLots.add(parkingLot);
				} catch (Exception e) {
					// Skip invalid entries silently
					continue;
				}
			}
		} catch (IOException e) {
			// Log error but don't show in console
			System.err.println("Warning: Could not read lot data completely");
		}
		return parkingLots;
	}

	public static List<ParkingSpace> readSpaceData() {
		List<ParkingSpace> spaces = new ArrayList<>();
		Map<UUID, ParkingLot> lotMap = new HashMap<>();

		// First read all parking lots
		List<ParkingLot> lots = readLotData();
		for (ParkingLot lot : lots) {
			lotMap.put(lot.getID(), lot);
		}

		try (BufferedReader br = new BufferedReader(new FileReader(SPACES_CSV))) {
			String line = br.readLine();
			if (line == null) {
				return spaces; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 4) {
					continue; // Skip invalid lines silently
				}

				try {
					UUID id = UUID.fromString(data[0]);
					UUID lotID = UUID.fromString(data[1]);
					ParkingStatus status = ParkingStatus.valueOf(data[2]);
					String name = data[3];

					ParkingLot parkingLot = lotMap.get(lotID);
					if (parkingLot != null) {
						ParkingSpace space = new ParkingSpace(id, parkingLot, status, name);
						spaces.add(space);
					}
				} catch (Exception e) {
					// Skip invalid entries silently
					continue;
				}
			}
		} catch (IOException e) {
			// Log error but don't show in console
			System.err.println("Warning: Could not read space data completely");
		}
		return spaces;
	}

	public static List<Payment> readPaymentsData() {
		List<Payment> payments = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(PAYMENTS_CSV))) {
			String line = br.readLine();
			if (line == null) {
				return payments; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 4) {
					continue; // Skip invalid lines silently
				}

				try {
					UUID id = UUID.fromString(data[0]);
					double amount = Double.parseDouble(data[1]);
					Payment.PaymentStatus status = Payment.PaymentStatus.valueOf(data[2]);
					PaymentMethod paymentMethod = Payment.generateMethod(data[3]);

					Payment newPayment = new Payment(id, amount, paymentMethod, status);
					payments.add(newPayment);
				} catch (Exception e) {
					// Skip invalid entries silently
					continue;
				}
			}
		} catch (IOException e) {
			// Log error but don't show in console
			System.err.println("Warning: Could not read payment data completely");
		}
		return payments;
	}

	public static List<Booking> readBookingData() {
		List<Booking> bookings = new ArrayList<>();
		Map<String, Client> clientMap = new HashMap<>();
		Map<UUID, ParkingSpace> spaceMap = new HashMap<>();
		Map<UUID, Payment> paymentMap = new HashMap<>();

		// Load all clients, spaces and payments first
		List<Client> clients = readClientData();
		for (Client client : clients) {
			clientMap.put(client.getEmail(), client);
		}

		List<ParkingSpace> spaces = readSpaceData();
		for (ParkingSpace space : spaces) {
			spaceMap.put(space.getID(), space);
		}

		List<Payment> payments = readPaymentsData();
		for (Payment payment : payments) {
			paymentMap.put(payment.getPaymentID(), payment);
		}

		try (BufferedReader br = new BufferedReader(new FileReader(BOOKINGS_CSV))) {
			String line = br.readLine();

			if (line == null) {
				System.err.println("Error: CSV file is empty");
				return bookings;
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 9) {
					System.err.println("Error: Invalid number of columns in line: " + line);
					continue;
				}

				UUID bookingID = UUID.fromString(data[0]);
				Client client = clientMap.get(data[1]);
				ParkingSpace parkingSpace = spaceMap.get(UUID.fromString(data[2]));

				if (client == null || parkingSpace == null) {
					System.err.println("Error: Invalid client or parking space reference");
					continue;
				}

				Booking.BookingStatus status = Booking.BookingStatus.valueOf(data[3]);
				LocalDateTime startTime = LocalDateTime.parse(data[4]);
				LocalDateTime endTime = LocalDateTime.parse(data[5]);
				double deposit = Double.parseDouble(data[6]);
				double finalAmount = Double.parseDouble(data[7]);

				Payment payment = null;
				if (data[8] != null && !data[8].equalsIgnoreCase("null")) {
					payment = paymentMap.get(UUID.fromString(data[8]));
				}

				Booking booking = new Booking(bookingID, client, parkingSpace, status, startTime, endTime, deposit,
						finalAmount, payment);
				bookings.add(booking);
			}
		} catch (IOException e) {
			System.err.println("Error reading CSV file: " + e.getMessage());
		}
		return bookings;
	}

	public static void setSpaceData(List<ParkingSpace> spaces) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(SPACES_CSV))) {
			writer.write("id,lotID,status,name\n");

			for (ParkingSpace space : spaces) {
				writer.write(String.format("%s,%s,%s,%s\n", space.getID(), space.getLot().getID(), space.getStatus(),
						space.getName()));
			}
		} catch (IOException e) {
			System.err.println("Error writing to CSV file: " + e.getMessage());
		}
	}
}
