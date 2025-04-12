package manual.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import models.ParkingSystemException;
import models.booking.Booking;
import models.client.Client;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import repositories.PaymentRepository;

public class PaymentRepositoryTest extends BaseRepositoryTest {
	private PaymentRepository paymentRepository;
	private Client testClient;
	private ParkingSpace testSpace;
	private Booking testBooking;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeRepositories();
		this.testClient = super.createTestClient();
		ParkingLot testLot = super.createTestParkingLot();
		this.testSpace = super.createTestParkingSpace(testLot);
		this.testBooking = super.createTestBooking(testSpace, testClient);
	}

	private void initializeRepositories() {
		paymentRepository = repositoryFactory.getPaymentRepository();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.paymentRepository = null;
		this.testClient = null;
		this.testSpace = null;
		this.testBooking = null;
		super.tearDown();
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
		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> {
			paymentRepository.createDepositPayment(null, "Debit");
		});
		assertEquals("Booking cannot be null", exception.getMessage());
	}

	@Test
	public void verifyCreateFinalPaymentWithNullBooking() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> {
			paymentRepository.createFinalPayment(10.0, null, "Credit");
		});
		assertEquals("Booking cannot be null", exception.getMessage());
	}

	@Test
	public void verifyCreateRefundPaymentWithNullBookingThrows() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> {
			paymentRepository.createRefundPayment(null, "Credit");
		});
		assertEquals("Booking cannot be null", exception.getMessage());
	}

	@Test
	public void verifyRemovePayment() {
		Payment payment = paymentRepository.createDepositPayment(testBooking, "Debit");
		paymentRepository.removePayment(payment);
		assertFalse(paymentRepository.getAllPayments().contains(payment));
	}
}
