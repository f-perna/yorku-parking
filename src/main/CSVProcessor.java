package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import booking.Booking;
import client.Client;
import client.GenerateClientFactory;
import parking.ParkingLot;
import parking.ParkingSpace;
import parking.ParkingSystem;
import parking.ParkingSpace.ParkingStatus;

public final class CSVProcessor {
	private static final String CSV_DELIMITER = ",";
	private static final String USERS_CSV = "data/client.csv";
	private static final String LOTS_CSV = "data/lots.csv";
	private static final String SPACES_CSV = "data/spaces.csv";
	private static final String BOOKINGS_CSV = "data/bookings.csv";

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
				Boolean approved = Boolean.valueOf(data[5]);

				Client client = GenerateClientFactory.getClientType(name, email, password, clientType, licensePlate, approved);
				clients.add(client);
			}

		} catch (IOException e) {
			System.err.println("Error reading CSV file: " + e.getMessage());
		}

		return clients;
	}
	
	public static void setClientData(List<Client> clients) {
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(USERS_CSV))) {
	        // Write header (assuming the CSV has a header row)
	        bw.write("name, email, password, licensePlate, type, approved");
	        bw.newLine();

	        for (Client client : clients) {
	            String line = String.join(CSV_DELIMITER, 
	                client.getName(), 
	                client.getEmail(), 
	                client.getPassword(), 
	                client.getLicencePlate(), 
	                client.getType().name(), 
	                String.valueOf(client.isApproved()) // Ensure boolean is written as a string
	            );
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
	            String line = String.join(CSV_DELIMITER, 
	                booking.getBookingId().toString(), 
	                booking.getClient().getEmail(), 
	                booking.getParkingSpace().getID().toString(), 
	                booking.getStartTime().toString(), 
	                booking.getEndTime().toString(),
	                Double.toString(booking.getDeposit()),
	                Double.toString(booking.getFinalPaymentAmount())
	            );
	            bw.write(line);
	            bw.newLine();
	        }

	    } catch (IOException e) {
	        System.err.println("Error writing to CSV file: " + e.getMessage());
	    }
	}
	
	public static void setLotAndSpaceData(List<ParkingLot> parkingLots) {
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(LOTS_CSV))) {
	        // Write header (assuming the CSV has a header row)
	        bw.write("name, id");
	        bw.newLine();

	        for (ParkingLot parkingLot : parkingLots) {
	            String line = String.join(CSV_DELIMITER, 
	                parkingLot.getName(),
	                parkingLot.getID().toString()
	            );
	            bw.write(line);
	            bw.newLine();
	        }

	    } catch (IOException e) {
	        System.err.println("Error writing to CSV file: " + e.getMessage());
	    }
	    
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(SPACES_CSV))) {
	        // Write header (assuming the CSV has a header row)
	        bw.write("id, lotID, status, name");
	        bw.newLine();

	        for (ParkingLot parkingLot : parkingLots) {
	            for (ParkingSpace parkingSpace : parkingLot.getParkingSpaces()) {
	            	String line = String.join(CSV_DELIMITER, 
    	                parkingSpace.getID().toString(),
    	                parkingSpace.getLot().getID().toString(),
    	                parkingSpace.getStatus().toString(),
    	                parkingSpace.getName()
    	            );
    	            bw.write(line);
    	            bw.newLine();
	            }
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
				System.err.println("Error: CSV file is empty");
				return parkingLots;
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 2) {
					System.err.println("Error: Invalid number of columns in line: " + line);
					continue;
				}

				String name = data[0];
				UUID id = UUID.fromString(data[1]);

				ParkingLot parkingLot = new ParkingLot(name, id);
				parkingLots.add(parkingLot);
			}

		} catch (IOException e) {
			System.err.println("Error reading CSV file: " + e.getMessage());
		}

		return parkingLots;
	}

	public static void readSpaceData() {
		List<ParkingLot> parkingLots = ParkingSystem.getParkingLots();

		try (BufferedReader br = new BufferedReader(new FileReader(SPACES_CSV))) {

			String line = br.readLine();

			if (line == null) {
				System.err.println("Error: CSV file is empty");
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 4) {
					System.err.println("Error: Invalid number of columns in line: " + line);
					continue;
				}

				UUID id = UUID.fromString(data[0]);
				UUID lotID = UUID.fromString(data[1]);
				ParkingStatus status = ParkingStatus.valueOf(data[2]);
				String name = data[3];

				ParkingLot parkingLot = ParkingSystem.getParkingLotByID(lotID);

				parkingLot.addParkingSpace(id, status, name);
			}

		} catch (IOException e) {
			System.err.println("Error reading CSV file: " + e.getMessage());
		}
	}

	public static List<Booking> readBookingData() {
		List<Booking> bookings = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(BOOKINGS_CSV))) {

			String line = br.readLine();

			if (line == null) {
				System.err.println("Error: CSV file is empty");
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 8) {
					System.err.println("Error: Invalid number of columns in line: " + line);
					continue;
				}

				UUID bookingID = UUID.fromString(data[0]);
				Client client = ParkingSystem.getClientByEmail(data[1]);
				ParkingSpace parkingSpace = ParkingSystem.getParkingSpaceByID(UUID.fromString(data[2]));
				Booking.BookingStatus status = Booking.BookingStatus.valueOf(data[3]);
				LocalDateTime startTime = LocalDateTime.parse(data[4]);
				LocalDateTime endTime = LocalDateTime.parse(data[5]);
				double deposit = Double.parseDouble(data[6]);
				double finalAmount = Double.parseDouble(data[6]);

				Booking booking = new Booking(bookingID, client, parkingSpace, status, startTime, endTime, deposit,
						finalAmount);
				bookings.add(booking);
			}

		} catch (IOException e) {
			System.err.println("Error reading CSV file: " + e.getMessage());
		}

		return bookings;
	}
}
