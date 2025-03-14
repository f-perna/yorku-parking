package parking;

import java.util.ArrayList;
import java.util.List;

import booking.Booking;
import client.Client;
import main.CSVProcessor;


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
    }
    
    /* Main parking logic methods : */
    public void addClient(Client Client) {
        clients.add(Client);
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
    
    public static ParkingLot getParkingLotByID(int id) {
    	for (ParkingLot parkingLot : parkingLots) {
    		if (parkingLot.getID() == id) {
    			return parkingLot;
    		}
    	}
    	return null;
    }

}

