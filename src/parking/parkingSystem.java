package parking;

import java.util.ArrayList;
import java.util.List;

import client.Client;

//Subject class
abstract class parkingsystemsubject {
/*
 * Req3: Any registered client can book a valid parking space (i.e., currently not occupied or booked by other Clients)
 */
    abstract void registeredobserver(parkingspaceobserver observer);
    abstract void removeobserver(parkingspaceobserver observer);
    abstract void notifyobservers();
}

//Concrete Subject class
class parkingSystem extends parkingsystemsubject {
	
	private static parkingSystem instance;
	
    public List<parkingspaceobserver> observers;
    public List<parkingspace> parkingspaces;
    public List<Client> Clients;

    private parkingSystem() {
        observers = new ArrayList<>();
        parkingspaces = new ArrayList<>();
        Clients = new ArrayList<>();
    }
    
    public static synchronized parkingSystem getInstance() {
        if (instance == null) {
            instance = new parkingSystem();
        }
        return instance;
    }
    
    /* Main parking logic methods : */
    public void addparkingspace(parkingspace parkingspace) {
        parkingspaces.add(parkingspace);
        notifyobservers();
    }

    public void addClient(Client Client) {
        Clients.add(Client);
    }

    public boolean Login(String licenceplateN) {
        for (Client Client : Clients) {
            if (Client.getLicencePlate().equalsIgnoreCase(licenceplateN)) {
                return true;
            }
        }
        return false;
    }

    public boolean bookparkingspace(Client client, int spacenumber) {
        // Check if client is logged in
        if (!Clients.contains(client)) {
            System.out.println("Please log in to book a parking space.");
            return false;
        }
        // Initialization and search for parking space
        parkingspace space = null;
        for (parkingspace parkingSpace : parkingspaces) {
            if (parkingSpace.getspacenumber() == spacenumber) {
                space = parkingSpace;
                break;
            }
        }
        if (space == null) {
            System.out.println("Parking space " + spacenumber + " does not exist.");
            return false;
        } else if (!space.isAvailable()) {
            System.out.println("Parking space " + spacenumber + " is not available.");
            return false;
        } else {
            // Book the parking space
            space.book(client);
            System.out.println("Parking space is" + spacenumber + " booked for " + client.getName() );
            notifyobservers();
            return true;
        }
    }
    
    public void removebookedparking(Client client, int spaceNumber) {
        // Check if client is logged in
        if (!Clients.contains(client)) {
            System.out.println("removeBookedParking: FAILED, Client does not exist in the database.");
            return;
        }

        // initialize and search for parking space
        parkingspace space = null;
        for (parkingspace parkingSpace : parkingspaces) {
            if (parkingSpace.getspacenumber() == spaceNumber) {
                space = parkingSpace;
                break;
            }
        }

      
        if (space == null) {
            System.out.println("Parking space " + spaceNumber + " does not exist.");
        } else if (space.isAvailable()) {
            System.out.println("Parking space " + spaceNumber + " cannot be removed as the parking space is not booked.");
        } else {
            // Remove booking of parking space
            space.fundsdeducted(0);
            System.out.println("Parking space " + spaceNumber + " unbooked by " + client.getName());
            notifyobservers();
        }
    }

    // Observer methods : 
    public void registeredobserver(parkingspaceobserver observer) {
        observers.add(observer);
    }

    public void removeobserver(parkingspaceobserver observer) {
        observers.remove(observer);
    }

    public void notifyobservers() {
        for (parkingspaceobserver observer : observers) {
            observer.update(parkingspaces);
        }
    }
}

//Observer/Subscriber interface
interface parkingspaceobserver {
 void update(List<parkingspace> parkingspaces);
}

/*
 * Req 5: Suppose each parking space has a sensor to detect if a car is using the parking space or not.
 * In addition, the sensor can also scan the basic info of cars, and further send the essential
 * information to the system.
 */
//Concrete observer class
class parkingsensor implements parkingspaceobserver {
 private List<parkingspace> availablespaces;

 public parkingsensor() {
     availablespaces = new ArrayList<>();
 }

 public void update(List<parkingspace> parkingspaces) {
     availablespaces.clear();

     for (parkingspace space : parkingspaces) {
         if (space.isAvailable()) {
             availablespaces.add(space);
         }
     }

     
     for (parkingspace space : availablespaces) {
         System.out.println(space.getspacenumber());
     }
     System.out.println("Total available parking spaces: " + availablespaces.size());
 }
}

/*
 * Req7: Each parking space will have a unique identification number and other details including its
 * location and its parting lot, which will help with the navigation for clients.
 */
class parkingspace {
    public int spacenumber;
    public boolean available;
    public Client bookedby;
    public double rateperhour;
    public int id; 
    public String location; 
    
    public parkingspace(int spacenumber, String location){
        this.spacenumber = spacenumber;
        this.location = location;
   }

    public int getspacenumber() {
        return spacenumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public Client getbookedby() {
        return bookedby;
    }

    public double getrateperhour() {
        return rateperhour;
    }

    public void setrateperhour(double rateperhour) {
    	this.rateperhour = rateperhour;
    }
    
    public void book(Client Client) {
        this.bookedby = Client;
        this.available = false;
    }
    // will check this method again
    public void booking(Client client, int durationinhours) {
        if (!this.available) {
            System.out.println("Cannot book: Parking space is already booked.");
            return;
        }
     
        double deposit = durationinhours * (this.rateperhour+1); // One hour base + one extra hour
        client.setDeposit(deposit);
        this.bookedby = client;
        this.available = false;
    }
    
    public String getClientLicence() {
    	return bookedby.getLicencePlate();
    }
    
    // will check this method again
    public void fundsdeducted(int durationinhours) {
        if (!this.available) {
            if (this.bookedby.clientnoshow(durationinhours)) {
                System.out.println("No-show detected : Deposit of " + this.bookedby.getDeposit() + 
                                   " will not be refunded.");
            } else {
                double cost = durationinhours * this.rateperhour;
                double refund = this.bookedby.getDeposit() - cost;
                if (refund > 0) {
                    System.out.println("Refund of " + refund + " will be issued to " + 
                                       this.bookedby.getName());
                    this.bookedby.setDeposit(refund);
                } else {
                    System.out.println("Deposit of " + this.bookedby.getDeposit() + 
                                       " is insufficient to cover cost of " + cost + ". No refund.");
                }
            }
            this.bookedby = null;
            this.available = true;
        } else {
            System.out.println("No action taken: Parking space is already available.");
        }
    }}



