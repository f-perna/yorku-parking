package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.booking.Booking;
import models.client.Client;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import models.payment.Payment.PaymentType;
import repositories.BookingRepository;
import repositories.ClientRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;

public class BookingServiceTest {
	private BookingRepository bookingRepository;
	private BookingService bookingService;
	private ParkingSpaceRepository parkingSpaceRepository;
	private ParkingLotRepository parkingLotRepository;
	private ParkingSensorService parkingSensorService;
	private ParkingSensorRepository parkingSensorRepository;
	private ClientRepository clientRepository;
	private ClientService clientService;
	
	@Before
	public void beforeClientServiceTest() {
		bookingRepository = new BookingRepository();
		parkingSensorRepository = new ParkingSensorRepository();
		parkingSpaceRepository = new ParkingSpaceRepository();
		parkingSensorService = new ParkingSensorService(bookingRepository, parkingSpaceRepository, parkingSensorRepository);
		bookingService = new BookingService(bookingRepository, parkingSpaceRepository, parkingSensorService);
		parkingLotRepository = new ParkingLotRepository();
		clientRepository = new ClientRepository();
		clientService = new ClientService(clientRepository);
	}
	
	@Test
	public void verifyValidBooking() {
		ParkingSpace parkingSpace = parkingSpaceRepository.getAvailableSpaces(parkingLotRepository.getAllParkingLots().getFirst()).getFirst();
		clientService.registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		
		Booking testBooking = bookingService.createBooking(parkingSpace, 5, clientRepository.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();
		
		assertNotNull(testBooking);
		
		bookingService.confirmBooking(testBooking, testPayment);
		bookingService.cancel(testBooking);
		clientRepository.deleteClient(clientRepository.getClientByEmail("test@gmail.com"));
	}
	
	@Test
	public void verifyInvalidBookingTime() {
		ParkingSpace parkingSpace = parkingSpaceRepository.getAvailableSpaces(parkingLotRepository.getAllParkingLots().getFirst()).getFirst();
		clientService.registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		
		try {
			bookingService.createBooking(parkingSpace, 25, clientRepository.getClientByEmail("test@gmail.com"));
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Duration must be between 1 and 24 hours", e.getMessage());
	    }
		clientRepository.deleteClient(clientRepository.getClientByEmail("test@gmail.com"));
	}
	
	@Test
	public void verifyInvalidBookingClientApproval() {
		ParkingSpace parkingSpace = parkingSpaceRepository.getAvailableSpaces(parkingLotRepository.getAllParkingLots().getFirst()).getFirst();
		clientService.registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		
		try {
			bookingService.createBooking(parkingSpace, 5, clientRepository.getClientByEmail("test@gmail.com"));
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Client must be approved to make a booking", e.getMessage());
	    }
		clientRepository.deleteClient(clientRepository.getClientByEmail("test@gmail.com"));
	}
}
