package services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.booking.Booking;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import services.factory.ServiceFactory;

public class PaymenServiceTest {
	private ServiceFactory serviceFactory;
	private Booking testBooking;
	private Client testClient;
	
	@Before
	public void beforePaymenServiceTest() {
		serviceFactory = ServiceFactory.getInstance();
		ParkingSpace parkingSpace = serviceFactory.getParkingSpaceService().getAvailableSpaces(serviceFactory.getParkingLotService().getAllParkingLots().getFirst()).getFirst();
		serviceFactory.getClientService().registerClient("Bob","test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		testBooking = serviceFactory.getBookingService().createBooking(parkingSpace, 5, serviceFactory.getClientService().getClientByEmail("test@gmail.com"));
		testClient = serviceFactory.getClientService().getClientByEmail("test@gmail.com");
	}
	
	@After
	public void afterPaymentServiceTest() {
		serviceFactory.getBookingService().deleteBooking(testBooking);
		serviceFactory.getClientService().removeClient("test@gmail.com");
	}
	
	@Test
	public void verifyProcessDepositPayment() {
		Payment testPayment = serviceFactory.getPaymentService().processDepositPayment(testBooking, "Debit", testClient);
		assertNotNull(testPayment);
		serviceFactory.getPaymentService().removePayment(testPayment);
	}
	
	@Test
	public void verifyDepositPaymentWithNullBooking() {
		try {
			serviceFactory.getPaymentService().processDepositPayment(null, "Credit", testClient);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Booking cannot be null", e.getMessage());
		}
	}
	
	@Test
	public void verifyDepositPaymentWithEmptyMethod() {
		try {
			serviceFactory.getPaymentService().processDepositPayment(testBooking, "", testClient);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Payment method must be specified", e.getMessage());
		}
	}

	@Test
	public void depositPaymentWithWrongClientThrows() {
		Client wrongClient = GenerateClientFactory.getClientType("Dan", "dan@gmail.com", "123", Client.type.VISITOR, "ABC 123", false);
		try {
			serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", wrongClient);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Cannot process payment for another user's booking", e.getMessage());
		}
	}
	
	@Test
	public void verifyGetPaymentsForBooking() {
		Payment payment = serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", testClient);
		assertTrue(serviceFactory.getPaymentService().getPaymentsForBooking(testBooking).contains(payment));
		serviceFactory.getPaymentService().removePayment(payment);
	}

	@Test
	public void verifyGetPaymentByIdReturnsCorrectPayment() {
		Payment payment = serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", testClient);
		Payment fetched = serviceFactory.getPaymentService().getPaymentById(payment.getPaymentID());
		assertTrue(fetched.getPaymentID().equals(payment.getPaymentID()));
		serviceFactory.getPaymentService().removePayment(payment);
	}
	
	@Test
	public void verifyGetPaymentByNullId() {
		try {
			serviceFactory.getPaymentService().getPaymentById(null);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Payment ID cannot be null", e.getMessage());
		}
	}
	
	@Test
	public void verifyFinalPaymentWithInvalidStatus() {
		try {
			serviceFactory.getPaymentService().processFinalPayment(testBooking, "Credit", testClient);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Can only process final payment for checked-in, overstayed or expired bookings", e.getMessage());
		}
	}

	@Test
	public void refundPaymentWithInvalidStatus() {
		// Booking is not canceled, refund not allowed
		try {
			serviceFactory.getPaymentService().processRefundPayment(testBooking, "Credit", testClient);
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Can only process refund for canceled bookings", e.getMessage());
		}
	}
	
	@Test
	public void refundPaymentSuccessfully() {
		Payment deposit = serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", testClient);

		serviceFactory.getBookingService().cancelBooking(testBooking, testClient);

		Payment refund = serviceFactory.getPaymentService().processRefundPayment(testBooking, "Credit", testClient);
		assertNotNull(refund);

		serviceFactory.getPaymentService().removePayment(deposit);
		serviceFactory.getPaymentService().removePayment(refund);
	}



}
