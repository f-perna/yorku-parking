package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
import services.factory.ServiceFactory;

public class BookingServiceTest {
	private ServiceFactory serviceFactory;
	
	@Before
	public void beforeClientServiceTest() {
		serviceFactory = ServiceFactory.getInstance();
	}
	
	@Test
	public void verifyValidBooking() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		Booking testBooking = serviceFactory.getBookingService().createBooking(parkingSpace, 5, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();
		
		assertNotNull(testBooking);
		
		serviceFactory.getBookingService().deleteBooking(testBooking);
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyConfirmBooking() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		Booking testBooking = serviceFactory.getBookingService().createBooking(parkingSpace, 5, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();
		
		try {
			assertNotNull(testBooking);
			serviceFactory.getBookingService().confirmBooking(testBooking, testPayment);
	    } catch (ParkingSystemException e) {
	        fail("Failed to confirm booking");
	    }
		
		serviceFactory.getBookingService().deleteBooking(testBooking);
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyExtendBooking() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		Booking testBooking = serviceFactory.getBookingService().createBooking(parkingSpace, 5, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();
		
		try {
			assertNotNull(testBooking);
			serviceFactory.getBookingService().confirmBooking(testBooking, testPayment);
			serviceFactory.getBookingService().extendBookingTime(testBooking, 3);
	    } catch (ParkingSystemException e) {
	        fail("Failed to extend booking");
	    }
		
		serviceFactory.getBookingService().deleteBooking(testBooking);
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyCancelBooking() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		Booking testBooking = serviceFactory.getBookingService().createBooking(parkingSpace, 5, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();
		
		try {
			assertNotNull(testBooking);
			serviceFactory.getBookingService().confirmBooking(testBooking, testPayment);
			serviceFactory.getBookingService().cancel(testBooking);
	    } catch (ParkingSystemException e) {
	        fail("Failed to cancel booking");
	    }
		
		serviceFactory.getBookingService().deleteBooking(testBooking);
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyNoOverstayedBookings() {
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		assertFalse(serviceFactory.getBookingService().hasOverstayedBookings(serviceFactory.getClientService().getClientByEmail("test@gmail.com")));
		
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyInvalidExtenedBookingTime() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		Booking testBooking = serviceFactory.getBookingService().createBooking(parkingSpace, 5, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();
		
		try {
			assertNotNull(testBooking);
			serviceFactory.getBookingService().confirmBooking(testBooking, testPayment);
			serviceFactory.getBookingService().extendBookingTime(testBooking, 30); // 30 Hours, max 24
			fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	    	assertEquals("Additional hours must be between 1 and 24", e.getMessage());
	    }
		
		serviceFactory.getBookingService().deleteBooking(testBooking);
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyInvalidBookingPayment() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		Booking testBooking = serviceFactory.getBookingService().createBooking(parkingSpace, 5, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		
		try {
			assertNotNull(testBooking);
			serviceFactory.getBookingService().confirmBooking(testBooking, testPayment);
			fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	    	assertEquals("Payment must be successfuly made.", e.getMessage());
	    }
		
		serviceFactory.getBookingService().deleteBooking(testBooking);
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyInvalidBookingCheckin() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		Booking testBooking = serviceFactory.getBookingService().createBooking(parkingSpace, 5, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();
		
		try {
			assertNotNull(testBooking);
			serviceFactory.getBookingService().confirmBooking(testBooking, testPayment);
			serviceFactory.getBookingService().checkIn(testBooking);
			fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	    	assertEquals("Check-in period is not open yet! Please try again at least 5 minutes before your booking.", e.getMessage());
	    }
		
		serviceFactory.getBookingService().deleteBooking(testBooking);
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyInvalidBookingTime() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		
		try {
			// 25 Hours, Max is 24
			serviceFactory.getBookingService().createBooking(parkingSpace, 25, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Duration must be between 1 and 24 hours", e.getMessage());
	    }
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyInvalidBookingClientApproval() {
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		Client client = null;
		
		for (Client testClient : serviceFactory.getClientService().getAllClients()) {
			if (testClient.getEmail().equals("test@gmail.com")) {
				client = testClient;
				break;
			}
		}
		
		try {
			serviceFactory.getBookingService().createBooking(parkingSpace, 5, client);
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Client must be approved to make a booking", e.getMessage());
	    }
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
}
