package parking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import booking.Booking;
import client.Client;
import main.CSVProcessor;
import parking.ParkingSpace.ParkingStatus;


//Concrete Subject class
public class ParkingSystem {
	
    public static List<ParkingLot> parkingLots = new ArrayList<>();
    public static List<Client> clients = new ArrayList<>();
    public static List<Booking> bookings = new ArrayList<>();
    
    private static Client loggedInClient;
    
    public static void loadFromDatabase() {
        clients = CSVProcessor.readClientData();
        parkingLots = CSVProcessor.readLotData();
        CSVProcessor.readSpaceData();
        bookings = CSVProcessor.readBookingData();
    }
    
    /* Main parking logic methods : */
    public static void registerClient(Client Client) {
        clients.add(Client);
        CSVProcessor.setClientData(clients);
    }
    
    public static void createBooking(ParkingSpace parkingSpace, int durationAmount) {
    	bookings.add(new Booking(parkingSpace, durationAmount, loggedInClient));
    	parkingSpace.setStatus(ParkingStatus.BOOKED);
    	CSVProcessor.setBookingData(bookings);
    	CSVProcessor.setLotAndSpaceData(parkingLots);
    }

    public static boolean login(String inputEmail, String inputPassword) {
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
    
    public static Client getLoggedInClient() {
    	return loggedInClient;
    }
    
    public static List<Booking> getBookingsForClient(Client inputClient) {
    	List<Booking> clientBookings = new ArrayList<>();
    	for (Booking booking : bookings) {
    		if (booking.getClient() == inputClient) {
    			clientBookings.add(booking);
    		}
    	}
    	return clientBookings;
    }
    
    public static List<ParkingLot> getParkingLots() {
    	return parkingLots;
    }
    
    public static ParkingLot getParkingLotByID(UUID id) {
    	for (ParkingLot parkingLot : parkingLots) {
    		if (parkingLot.getID().equals(id)) {
    			return parkingLot;
    		}
    	}
    	return null;
    }
    
    public static Client getClientByEmail(String email) {
    	for (Client client : clients) {
    		if (client.getEmail().equals(email)) {
    			return client;
    		}
    	}
    	return null;
    }
    
    public static ParkingSpace getParkingSpaceByID(UUID id) {
    	for (ParkingLot parkingLot : parkingLots) {
    		for (ParkingSpace parkingSpace: parkingLot.getParkingSpaces()) {
    			if (parkingSpace.getID().equals(id)) {
    				return parkingSpace;
    			}
    		}
    	}
    	return null;
    }

}

