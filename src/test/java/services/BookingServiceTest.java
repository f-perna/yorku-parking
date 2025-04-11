package services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.ParkingSystemException;
import models.booking.Booking;
import models.client.Client;
import models.client.Client.type;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import models.payment.Payment.PaymentType;

public class BookingServiceTest extends BaseServiceTest {
	private BookingService bookingService;
	private ClientService clientService;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;

	private ParkingLot testLot;
	private ParkingSpace testSpace;
	private Client testClient;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeServices();
		super.createAndLogInAsTestManager();
		createTestParkingLotAndSpace();
		createTestClient();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
	}

	private void initializeServices() {
		parkingLotService = serviceFactory.getParkingLotService();
		bookingService = serviceFactory.getBookingService();
		clientService = serviceFactory.getClientService();
		parkingLotService = serviceFactory.getParkingLotService();
		parkingSpaceService = serviceFactory.getParkingSpaceService();
	}

	private void createTestParkingLotAndSpace() {
		// Create test parking lot
		parkingLotService.addParkingLot("Test Lot");
		testLot = parkingLotService.getParkingLotByName("Test Lot");
		if (testLot == null) {
			throw new IllegalStateException("Failed to create test parking lot");
		}

		// Create test parking space
		parkingSpaceService.addParkingSpace(testLot, "Test Space");
		testSpace = parkingSpaceService.getSpacesForLot(testLot.getID()).get(0);
		if (testSpace == null) {
			throw new IllegalStateException("Failed to create test parking space");
		}
	}

	private void createTestClient() {
		// Create and approve test client
		clientService.registerClient("Test Client", "test@example.com", "123456Ab!", type.STUDENT, "ABC123");
		testClient = clientService.getClientByEmail("test@example.com");
		if (testClient == null) {
			throw new IllegalStateException("Failed to create test client");
		}
		testClient.setApproved(true);
	}

	@Test
	void verifyValidBooking() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		assertNotNull(testBooking);
	}

	@Test
	void verifyConfirmBooking() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		assertNotNull(testBooking);
		bookingService.confirmBooking(testBooking, testPayment);
	}

	@Test
	void verifyExtendBooking() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		assertNotNull(testBooking);
		bookingService.confirmBooking(testBooking, testPayment);
		bookingService.extendBookingTime(testBooking, 3);
	}

	@Test
	void verifyCancelBooking() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		assertNotNull(testBooking);
		bookingService.confirmBooking(testBooking, testPayment);
		bookingService.cancel(testBooking);
	}

	@Test
	void verifyNoOverstayedBookings() {
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		assertFalse(bookingService.hasOverstayedBookings(clientService.getClientByEmail("test@gmail.com")));
	}

	@Test
	void verifyInvalidExtenedBookingTime() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		assertNotNull(testBooking);
		bookingService.confirmBooking(testBooking, testPayment);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> bookingService.extendBookingTime(testBooking, 30));
		assertEquals("Additional hours must be between 1 and 24", exception.getMessage());
	}

	@Test
	void verifyInvalidBookingPayment() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);

		assertNotNull(testBooking);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> bookingService.confirmBooking(testBooking, testPayment));
		assertEquals("Payment must be successfuly made.", exception.getMessage());
	}

	@Test
	void verifyInvalidBookingCheckin() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		Booking testBooking = bookingService.createBooking(parkingSpace, 5,
				clientService.getClientByEmail("test@gmail.com"));
		Payment testPayment = new Payment(10, testBooking, Payment.generateMethod("Debit"), PaymentType.DEPOSIT);
		testPayment.processPayment();

		assertNotNull(testBooking);
		bookingService.confirmBooking(testBooking, testPayment);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> bookingService.checkIn(testBooking));
		assertEquals("Check-in period is not open yet! Please try again at least 5 minutes before your booking.",
				exception.getMessage());
	}

	@Test
	void verifyInvalidBookingTime() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		clientService.login("test@gmail.com", "ABc123!!");

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> bookingService.createBooking(parkingSpace, 25, clientService.getClientByEmail("test@gmail.com")));
		assertEquals("Duration must be between 1 and 24 hours", exception.getMessage());
	}

	@Test
	void verifyInvalidBookingClientApproval() {
		ParkingSpace parkingSpace = parkingSpaceService.getAvailableSpaces(parkingLotService.getAllParkingLots().get(0))
				.get(0);
		clientService.registerClient("Bob", "test@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		final Client client = clientService.getClientByEmail("test@gmail.com");

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> bookingService.createBooking(parkingSpace, 5, client));
		assertEquals("Client must be approved to make a booking", exception.getMessage());
	}
}
