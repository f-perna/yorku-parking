package manual.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.ParkingSystemException;
import models.booking.Booking;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;

public class PaymentServiceTest extends BaseServiceTest {
	private Booking testBooking;
	private Client testClient;
	private ParkingSpace testSpace;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		super.createAndLogInAsTestManager();
		createTestData();
	}

	private void createTestData() {
		// Create test parking lot and space
		serviceFactory.getParkingLotService().addParkingLot("Test Lot");
		ParkingLot testLot = serviceFactory.getParkingLotService().getParkingLotByName("Test Lot");
		serviceFactory.getParkingSpaceService().addParkingSpace(testLot, "Test Space");
		testSpace = serviceFactory.getParkingSpaceService().getAllSpaces().stream()
				.filter(space -> space.getName().equals("Test Space")).findFirst().orElse(null);

		// Create test client and booking
		serviceFactory.getClientService().registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR,
				"ABC 123");
		serviceFactory.getClientService().login("test@gmail.com", "ABc123!!");
		testClient = serviceFactory.getClientService().getClientByEmail("test@gmail.com");
		testBooking = serviceFactory.getBookingService().createBooking(testSpace, 5, testClient);
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		authState.setLoggedInUser(null);
		cleanupTestFiles();
		resetFactories();
	}

	@Test
	public void verifyProcessDepositPayment() {
		Payment testPayment = serviceFactory.getPaymentService().processDepositPayment(testBooking, "Debit",
				testClient);
		assertNotNull(testPayment);
	}

	@Test
	public void verifyDepositPaymentWithNullBooking() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getPaymentService().processDepositPayment(null, "Credit", testClient));
		assertEquals("Booking cannot be null", exception.getMessage());
	}

	@Test
	public void verifyDepositPaymentWithEmptyMethod() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getPaymentService().processDepositPayment(testBooking, "", testClient));
		assertEquals("Payment method must be specified", exception.getMessage());
	}

	@Test
	public void depositPaymentWithWrongClientThrows() {
		Client wrongClient = GenerateClientFactory.getClientType("Dan", "dan@gmail.com", "123", Client.type.VISITOR,
				"ABC 123", false);
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", wrongClient));
		assertEquals("Cannot process payment for another user's booking", exception.getMessage());
	}

	@Test
	public void verifyGetPaymentsForBooking() {
		Payment payment = serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", testClient);
		assertTrue(serviceFactory.getPaymentService().getPaymentsForBooking(testBooking).contains(payment));
	}

	@Test
	public void verifyGetPaymentByIdReturnsCorrectPayment() {
		Payment payment = serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", testClient);
		Payment fetched = serviceFactory.getPaymentService().getPaymentById(payment.getPaymentID());
		assertEquals(payment.getPaymentID(), fetched.getPaymentID());
	}

	@Test
	public void verifyGetPaymentByNullId() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getPaymentService().getPaymentById(null));
		assertEquals("Payment ID cannot be null", exception.getMessage());
	}

	@Test
	public void verifyFinalPaymentWithInvalidStatus() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getPaymentService().processFinalPayment(testBooking, "Credit", testClient));
		assertEquals("Can only process final payment for checked-in, overstayed or expired bookings",
				exception.getMessage());
	}

	@Test
	public void refundPaymentWithInvalidStatus() {
		// Booking is not canceled, refund not allowed
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getPaymentService().processRefundPayment(testBooking, "Credit", testClient));
		assertEquals("Can only process refund for canceled bookings", exception.getMessage());
	}

	@Test
	public void refundPaymentSuccessfully() {
		serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", testClient);

		serviceFactory.getBookingService().cancelBooking(testBooking, testClient);

		Payment refund = serviceFactory.getPaymentService().processRefundPayment(testBooking, "Credit", testClient);
		assertNotNull(refund);
	}
}
