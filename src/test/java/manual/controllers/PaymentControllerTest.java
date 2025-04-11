package manual.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.AuthController;
import controllers.BookingController;
import controllers.PaymentController;
import models.booking.Booking;
import models.client.Client;
import models.client.Client.type;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import models.user.UserType;

public class PaymentControllerTest extends BaseControllerTest {
	private AuthController authController;
	private BookingController bookingController;
	private PaymentController paymentController;
	private ParkingLot testLot;
	private ParkingSpace testSpace;
	private Client testClient;
	private Booking testBooking;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeControllers();
		super.createAndLogInAsTestManager();
		this.testLot = super.createTestParkingLot();
		this.testSpace = super.createTestParkingSpace(testLot);
		this.testClient = super.createTestClient();
		this.testBooking = super.createTestBooking(testClient, testSpace);
	}

	private void initializeControllers() {
		authController = controllerFactory.getAuthController();
		bookingController = controllerFactory.getBookingController();
		paymentController = controllerFactory.getPaymentController();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.testLot = null;
		this.testSpace = null;
		this.testClient = null;
		this.testBooking = null;
		this.authController = null;
		this.bookingController = null;
		this.paymentController = null;
		this.paymentController = null;
		super.tearDown();
	}

	@Test
	void testProcessDepositPayment() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

		// Process deposit payment
		Payment payment = paymentController.processDepositPayment(testBooking, "Credit");

		// Verify payment
		assertNotNull(payment);
		assertEquals(Payment.PaymentStatus.PAID, payment.getStatus());
		assertEquals(Payment.PaymentType.DEPOSIT, payment.getPaymentType());
		assertEquals(testBooking.getDeposit(), payment.getAmount());
	}

	@Test
	void testProcessDepositPaymentWithoutLogin() {
		assertThrows(models.ParkingSystemException.class,
				() -> paymentController.processDepositPayment(testBooking, "Credit"));
	}

	@Test
	void testProcessDepositPaymentOtherUsersBooking() {
		// Create another client
		controllerFactory.getClientController().registerClient("Other Client", "other@example.com", "123456Ab!",
				type.STUDENT, "XYZ789");
		Client otherClient = controllerFactory.getManagerController().getClientByEmail("other@example.com");
		otherClient.setApproved(true);
		authController.login(otherClient.getEmail(), "123456Ab!", UserType.CLIENT);

		assertThrows(models.ParkingSystemException.class,
				() -> paymentController.processDepositPayment(testBooking, "Credit"));
	}

	@Test
	void testProcessFinalPayment() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

		// Create a new booking with start time 5 minutes in the past
		LocalDateTime startTime = LocalDateTime.now().minusMinutes(5);
		Booking newBooking = createBookingWithCustomStartTime(testSpace, 2, startTime);

		// First process deposit payment (booking should be PENDING)
		paymentController.processDepositPayment(newBooking, "Credit");

		// Now confirm the booking for check-in
		newBooking.confirmBooking();

		// Check in the booking
		bookingController.checkIn(newBooking);

		// Process final payment
		Payment payment = paymentController.processFinalPayment(newBooking, "Credit");

		// Verify payment
		assertNotNull(payment);
		assertEquals(Payment.PaymentStatus.PAID, payment.getStatus());
		assertEquals(Payment.PaymentType.FINAL, payment.getPaymentType());
		assertEquals(newBooking.deductedPrice(), payment.getAmount());
	}

	@Test
	void testProcessFinalPaymentWithoutLogin() {
		assertThrows(models.ParkingSystemException.class,
				() -> paymentController.processFinalPayment(testBooking, "Credit"));
	}

	@Test
	void testProcessFinalPaymentOtherUsersBooking() {
		// Create another client
		controllerFactory.getClientController().registerClient("Other Client", "other@example.com", "123456Ab!",
				type.STUDENT, "XYZ789");
		Client otherClient = controllerFactory.getManagerController().getClientByEmail("other@example.com");
		otherClient.setApproved(true);
		authController.login(otherClient.getEmail(), "123456Ab!", UserType.CLIENT);

		assertThrows(models.ParkingSystemException.class,
				() -> paymentController.processFinalPayment(testBooking, "Credit"));
	}

	@Test
	void testGetPaymentById() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

		// Process deposit payment
		Payment payment = paymentController.processDepositPayment(testBooking, "Credit");

		// Get payment by ID
		Payment retrievedPayment = paymentController.getPaymentById(payment.getPaymentID());

		// Verify payment
		assertNotNull(retrievedPayment);
		assertEquals(payment.getPaymentID(), retrievedPayment.getPaymentID());
		assertEquals(payment.getAmount(), retrievedPayment.getAmount());
		assertEquals(payment.getStatus(), retrievedPayment.getStatus());
	}

	@Test
	void testGetPaymentsForBooking() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

		// Create a new booking with start time 5 minutes in the past
		LocalDateTime startTime = LocalDateTime.now().minusMinutes(5);
		Booking newBooking = createBookingWithCustomStartTime(testSpace, 2, startTime);

		// Process deposit payment (booking should be PENDING)
		paymentController.processDepositPayment(newBooking, "Credit");

		// Now confirm the booking for check-in
		newBooking.confirmBooking();

		// Check in the booking
		bookingController.checkIn(newBooking);

		// Process final payment
		paymentController.processFinalPayment(newBooking, "Credit");

		// Get payments for booking
		List<Payment> payments = paymentController.getPaymentsForBooking(newBooking);

		// Verify payments
		assertEquals(2, payments.size());
		assertTrue(payments.stream().anyMatch(p -> p.getPaymentType() == Payment.PaymentType.DEPOSIT));
		assertTrue(payments.stream().anyMatch(p -> p.getPaymentType() == Payment.PaymentType.FINAL));
	}

	private Booking createBookingWithCustomStartTime(ParkingSpace space, int durationHours, LocalDateTime startTime) {
		Booking booking = new Booking(space, testClient, durationHours) {
			@Override
			public LocalDateTime getStartTime() {
				return startTime;
			}
		};
		// Don't confirm the booking here - it should start as PENDING
		return booking;
	}
}