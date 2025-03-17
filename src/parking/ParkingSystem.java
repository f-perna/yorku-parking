package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import booking.Booking;
import client.Client;
import main.CSVProcessor;
import parking.ParkingSpace.ParkingStatus;

//Concrete Subject class
public class ParkingSystem {

	private static ParkingSystem instance;

	private List<ParkingLot> parkingLots;
	private List<Client> clients;
	private List<Booking> bookings;
	private Client loggedInClient;

	private ParkingSystem() {
		parkingLots = new ArrayList<>();
		clients = new ArrayList<>();
		bookings = new ArrayList<>();
	}

	public static ParkingSystem getInstance() {
		if (instance == null) {
			instance = new ParkingSystem();
		}

		return instance;
	}

	public void loadFromDatabase() {
		clients = CSVProcessor.readClientData();
		parkingLots = CSVProcessor.readLotData();
		CSVProcessor.readSpaceData();
		bookings = CSVProcessor.readBookingData();
	}

	/* Main parking logic methods : */
	public void registerClient(Client Client) {
		clients.add(Client);
		CSVProcessor.setClientData(clients);
	}

	public void createBooking(ParkingSpace parkingSpace, int durationAmount) {
		bookings.add(new Booking(parkingSpace, durationAmount, loggedInClient));
		parkingSpace.setStatus(ParkingStatus.BOOKED);
		CSVProcessor.setBookingData(bookings);
		CSVProcessor.setLotAndSpaceData(parkingLots);
	}

	public boolean login(String inputEmail, String inputPassword) {
		for (Client client : clients) {
			String email = client.getEmail();
			String password = client.getPassword();

			if (inputEmail.equals(email) && inputPassword.equals(password)) {
				loggedInClient = client;
				return true;
			}
		}
		return false;
	}

	public Client getLoggedInClient() {
		return loggedInClient;
	}

	public List<Booking> getBookingsForClient(Client inputClient) {
		List<Booking> clientBookings = new ArrayList<>();
		for (Booking booking : bookings) {
			if (booking.getClient() == inputClient) {
				clientBookings.add(booking);
			}
		}
		return clientBookings;
	}

	public List<ParkingLot> getParkingLots() {
		return parkingLots;
	}

	public ParkingLot getParkingLotByID(UUID id) {
		for (ParkingLot parkingLot : parkingLots) {
			if (parkingLot.getID().equals(id)) {
				return parkingLot;
			}
		}
		return null;
	}

	public Client getClientByEmail(String email) {
		for (Client client : clients) {
			if (client.getEmail().equals(email)) {
				return client;
			}
		}
		return null;
	}

	public ParkingSpace getParkingSpaceByID(UUID id) {
		for (ParkingLot parkingLot : parkingLots) {
			for (ParkingSpace parkingSpace : parkingLot.getParkingSpaces()) {
				if (parkingSpace.getID().equals(id)) {
					return parkingSpace;
				}
			}
		}
		return null;
	}

}
