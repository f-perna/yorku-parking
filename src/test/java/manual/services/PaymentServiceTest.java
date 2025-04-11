package manual.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.booking.Booking;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import models.superManager.SuperManager;
import services.factory.ServiceFactory;
import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;
import csv.PaymentCSVProcessor;

public class PaymentServiceTest {
	private ServiceFactory serviceFactory;
	private Booking testBooking;
	private Client testClient;
	private ParkingSpace testSpace;
	private AuthenticationState authState;
	private SuperManager superManager;
	private Manager testManager;

	private String testBookingsFilePath;
	private String testParkingLotsFilePath;
	private String testParkingSpacesFilePath;
	private String testParkingSensorFilePath;
	private String testClientsFilePath;
	private String testManagersFilePath;
	private String testPaymentsFilePath;

	@TempDir
	File tempDir;

	@BeforeEach
	public void setUp() throws IOException {
		initializeTestFiles();
		initializeFactories();
		initializeAuth();
		createTestData();
	}

	private void initializeTestFiles() throws IOException {
		// Initialize test CSV file paths
		testBookingsFilePath = tempDir.getAbsolutePath() + "/test_bookings.csv";
		testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
		testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
		testParkingSensorFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";
		testPaymentsFilePath = tempDir.getAbsolutePath() + "/test_payments.csv";

		// Initialize test CSV files
		BookingCSVProcessor.initializeTestFile(testBookingsFilePath);
		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);
		PaymentCSVProcessor.initializeTestFile(testPaymentsFilePath);
	}

	private void initializeFactories() {
		serviceFactory = ServiceFactory.getInstance();
	}

	private void initializeAuth() {
		authState = AuthenticationState.getInstance();
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);

		testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
		authState.setLoggedInUser(testManager);
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
	public void tearDown() throws NoSuchFieldException, IllegalAccessException {
		authState.setLoggedInUser(superManager);
		cleanupTestFiles();
		resetFactories();
	}

	private void cleanupTestFiles() {
		BookingCSVProcessor.cleanupAndReset(testBookingsFilePath);
		ParkingLotCSVProcessor.cleanupAndReset(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.cleanupAndReset(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.cleanupAndReset(testParkingSensorFilePath);
		ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
		ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);
		PaymentCSVProcessor.cleanupAndReset(testPaymentsFilePath);
	}

	private void resetFactories() throws NoSuchFieldException, IllegalAccessException {
		resetFactory(repositories.factory.RepositoryFactory.class, "instance");
		resetFactory(ServiceFactory.class, "instance");
	}

	private void resetFactory(Class<?> factoryClass, String instanceFieldName)
			throws NoSuchFieldException, IllegalAccessException {
		Field instance = factoryClass.getDeclaredField(instanceFieldName);
		instance.setAccessible(true);
		instance.set(null, null);
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
		Payment deposit = serviceFactory.getPaymentService().processDepositPayment(testBooking, "Credit", testClient);

		serviceFactory.getBookingService().cancelBooking(testBooking, testClient);

		Payment refund = serviceFactory.getPaymentService().processRefundPayment(testBooking, "Credit", testClient);
		assertNotNull(refund);
	}
}
