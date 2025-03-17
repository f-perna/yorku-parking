package parking;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import auth.AuthenticationState;
import booking.Booking;
import client.Client;
import main.CSVProcessor;
import parking.ParkingSpace.ParkingStatus;
import payment.Payment;

//Concrete Subject class
public class ParkingSystem {

	private static ParkingSystem instance;

	private static List<ParkingLot> parkingLots = new ArrayList<>();
	private static List<Client> clients = new ArrayList<>();
	private static List<Booking> bookings = new ArrayList<>();
	private static List<Payment> payments = new ArrayList<>();
	private static Client loggedInClient;

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
		payments = CSVProcessor.readPaymentsData();
		bookings = CSVProcessor.readBookingData();
	}

	/* Main parking logic methods : */
	public void registerClient(Client client) {
		clients.add(client);
		CSVProcessor.setClientData(clients);
	}

	public Booking createBooking(ParkingSpace parkingSpace, int durationAmount) {
		Booking newBooking = new Booking(parkingSpace, durationAmount, loggedInClient);
		bookings.add(newBooking);
		parkingSpace.setStatus(ParkingStatus.BOOKED);
		CSVProcessor.setBookingData(bookings);
		CSVProcessor.setLotAndSpaceData(parkingLots);
		return newBooking;
	}
	
	public void createPayment(double amount, String paymentMethod, Booking booking) {
		Payment newPayment = new Payment(UUID.randomUUID(), amount, Payment.generateMethod(paymentMethod), Payment.PaymentStatus.PENDING);
		
		payments.add(newPayment);
		booking.setPayment(newPayment);
		CSVProcessor.setPaymentData(payments);
		CSVProcessor.setBookingData(bookings);
	}

	public boolean login(String inputEmail, String inputPassword) {
		for (Client client : clients) {
			String email = client.getEmail();
			String password = client.getPassword();

			if (inputEmail.equals(email) && inputPassword.equals(password)) {
				AuthenticationState.getInstance().setLoggedInClient(client);
				return true;
			}
		}
		return false;
	}

	public Client getLoggedInClient() {
		return AuthenticationState.getInstance().getLoggedInClient();
	}

	public List<Booking> getBookingsForClient(Client client) {
		List<Booking> clientBookings = new ArrayList<>();
		for (Booking booking : bookings) {
			if (booking.getClient().equals(client)) {
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
	
	public Payment getPaymentByID(UUID id) {
		for (Payment payment : payments) {
			if (payment.getPaymentID().equals(id)) {
				return payment;
			}
		}
		return null;
	}

}
