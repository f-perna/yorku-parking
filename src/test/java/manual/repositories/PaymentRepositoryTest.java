package manual.repositories;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.booking.Booking;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import repositories.PaymentRepository;

public class PaymentRepositoryTest {
	private PaymentRepository  paymentRepository;
	private Client testClient;
	private ParkingSpace testSpace;
	private Booking testBooking;
	
	@Before
	public void beforeBookingRepositoryTest() {
		paymentRepository = new PaymentRepository();
		testClient = GenerateClientFactory.getClientType("Bob", "test@gmail.com", "123", Client.type.VISITOR, "TES 123", false);
		ParkingLot testLot = new ParkingLot("Test Lot");
		testSpace = new ParkingSpace(testLot, "Test Space");
		testBooking = new Booking(testSpace, testClient, 5);
	}
	
	@Test
	public void verifyCreateDepositPayment() {
		Payment deposit = paymentRepository.createDepositPayment(testBooking, "Debit");
		assertNotNull(deposit);
		
		paymentRepository.removePayment(deposit);
	}
	
	@Test
	public void verifyCreateFinalPayment() {
		Payment finalPayment = paymentRepository.createFinalPayment(10.0, testBooking, "Credit");
		assertNotNull(finalPayment);
		paymentRepository.removePayment(finalPayment);
	}
	
	@Test
	public void verifyCreateRefundPayment() {
		Payment refund = paymentRepository.createRefundPayment(testBooking, "Credit");
		assertNotNull(refund);
		paymentRepository.removePayment(refund);
	}
	
	@Test
	public void verifyGetAllPayments() {
		Payment payment = paymentRepository.createDepositPayment(testBooking, "Debit");
		assertTrue(paymentRepository.getAllPayments().contains(payment));
		paymentRepository.removePayment(payment);
	}
	
	@Test
	public void verifyGetPaymentByID() {
		Payment payment = paymentRepository.createDepositPayment(testBooking, "Credit");
		Payment found = paymentRepository.getPaymentByID(payment.getPaymentID());
		assertEquals(payment, found);
		paymentRepository.removePayment(payment);
	}
	
	@Test
	public void verifyGetPaymentsForBooking() {
		Payment payment = paymentRepository.createDepositPayment(testBooking, "Credit");
		assertTrue(paymentRepository.getPaymentsForBooking(testBooking).contains(payment));
		paymentRepository.removePayment(payment);
	}
	
	@Test
	public void verifyCreateDepositPaymentWithNullBooking() {
		try {
			paymentRepository.createDepositPayment(null, "Debit");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Booking cannot be null", e.getMessage());
		}
	}
	
	@Test
	public void verifyCreateFinalPaymentWithNullBooking() {
		try {
			paymentRepository.createFinalPayment(10.0, null, "Credit");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Booking cannot be null", e.getMessage());
		}
	}
	
	@Test
	public void verifyCreateRefundPaymentWithNullBookingThrows() {
		try {
			paymentRepository.createRefundPayment(null, "Credit");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Booking cannot be null", e.getMessage());
		}
	}
	
	@Test
	public void verifyRemovePayment() {
		Payment payment = paymentRepository.createDepositPayment(testBooking, "Debit");
		paymentRepository.removePayment(payment);
		assertFalse(paymentRepository.getAllPayments().contains(payment));
	}
}
