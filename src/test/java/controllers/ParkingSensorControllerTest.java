package controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;
import models.booking.Booking;
import models.client.Client;
import models.client.Client.type;
import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import repositories.BookingRepository;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;
import services.BookingService;
import services.ClientService;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSensorService;
import services.ParkingSpaceService;
import services.SuperManagerService;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

public class ParkingSensorControllerTest {

	private AuthController authController;
	private BookingController bookingController;
	private ParkingSensorController parkingSensorController;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private ParkingSensorService parkingSensorService;
	private ClientService clientService;
	private ClientRepository clientRepository;
	private ManagerService managerService;
	private SuperManagerService superManagerService;
	private SuperManagerController superManagerController;

	private String testBookingsFilePath;
	private String testParkingLotsFilePath;
	private String testParkingSpacesFilePath;
	private String testParkingSensorFilePath;
	private String testClientsFilePath;
	private String testManagersFilePath;

	private ParkingLot testLot;
	private ParkingSpace testSpace;
	private Client testClient;
	private Booking testBooking;

	@TempDir
	File tempDir;

	@BeforeEach
	void setUp() throws IOException {
		// Initialize test CSV files
		testBookingsFilePath = tempDir.getAbsolutePath() + "/test_bookings.csv";
		testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
		testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
		testParkingSensorFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";

		BookingCSVProcessor.initializeTestFile(testBookingsFilePath);
		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);

		// Initialize repositories
		BookingRepository bookingRepository = new BookingRepository();
		ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
		ParkingSpaceRepository parkingSpaceRepository = new ParkingSpaceRepository();
		ParkingSensorRepository parkingSensorRepository = new ParkingSensorRepository();
		clientRepository = new ClientRepository();
		ManagerRepository managerRepository = new ManagerRepository();

		// Initialize services with repositories
		parkingLotService = new ParkingLotService(parkingLotRepository);
		parkingSpaceService = new ParkingSpaceService(parkingSpaceRepository, parkingSensorRepository);
		parkingSensorService = new ParkingSensorService(bookingRepository, parkingSpaceRepository,
				parkingSensorRepository);
		clientService = new ClientService(clientRepository);
		managerService = new ManagerService(managerRepository);
		superManagerService = new SuperManagerService();

		// Create manager controller
		superManagerController = new SuperManagerController(managerService);

		// Create booking service and controller
		BookingService bookingService = new BookingService(bookingRepository, parkingSpaceRepository,
				parkingSensorService);
		bookingController = new BookingController(bookingService);

		// Create parking sensor controller
		parkingSensorController = new ParkingSensorController(parkingSensorService);

		// Create auth controller
		authController = new AuthController(clientService, managerService, superManagerService);

		// Login as SuperManager
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		authController.login(superEmail, superPassword, models.user.UserType.SUPER_MANAGER);

		// Generate manager
		Manager newManager = superManagerController.generateAndGetManagerAccount();

		// logout as SuperManager
		authController.logout();

		// Login as manager
		authController.login(newManager.getEmail(), newManager.getPassword(), models.user.UserType.MANAGER);

		// Create test parking lot and space
		parkingLotService.addParkingLot("Test Lot");
		testLot = parkingLotService.getParkingLotByName("Test Lot");
		parkingSpaceService.addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> spaces = parkingSpaceService.getSpacesForLot(testLot.getID());
		testSpace = spaces.get(0);

		// Create test client
		clientService.registerClient("Test Client", "test@example.com", "123456Ab!", type.STUDENT, "ABC123");
		testClient = clientRepository.getClientByEmail("test@example.com");
		testClient.setApproved(true);

		// Create test booking
		authController.logout();
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		testBooking = bookingController.createBooking(testSpace, 2);

		authController.logout();

	}

	@AfterEach
	void tearDown() {
		BookingCSVProcessor.cleanupAndReset(testBookingsFilePath);
		ParkingLotCSVProcessor.cleanupAndReset(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.cleanupAndReset(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.cleanupAndReset(testParkingSensorFilePath);
		ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
		ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);

		if (authController.isLoggedIn()) {
			authController.logout();
		}
	}

	@Test
	void testSimulateCarArrival() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// Simulate car arrival
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Verify car is present
		assertTrue(parkingSensorController.isCarPresentAtSpace(testSpace));
		assertEquals("ABC123", parkingSensorController.getDetectedLicencePlate(testSpace));
	}

	@Test
	void testSimulateCarArrivalOccupiedSpace() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// First arrival should succeed
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Second arrival should fail
		assertThrows(models.ParkingSystemException.class,
				() -> parkingSensorController.simulateCarArrival(testSpace, "ABC123"));
	}

	@Test
	void testSimulateCarDeparture() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);

		// First simulate arrival
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Then simulate departure
		parkingSensorController.simulateCarDeparture(testSpace, "ABC123");

		// Verify car is not present
		assertFalse(parkingSensorController.isCarPresentAtSpace(testSpace));
		assertNull(parkingSensorController.getDetectedLicencePlate(testSpace));
	}

	@Test
	void testIsCarPresentAtSpace() {
		// Initially no car should be present
		assertFalse(parkingSensorController.isCarPresentAtSpace(testSpace));

		// Login as client and simulate arrival
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Now car should be present
		assertTrue(parkingSensorController.isCarPresentAtSpace(testSpace));
	}

	@Test
	void testGetDetectedLicencePlate() {
		// Initially no licence plate should be detected
		assertNull(parkingSensorController.getDetectedLicencePlate(testSpace));

		// Login as client and simulate arrival
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Now licence plate should be detected
		assertEquals("ABC123", parkingSensorController.getDetectedLicencePlate(testSpace));
	}

	@Test
	void testIsBookingOwnerCar() {
		// Login as client and simulate arrival
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Should be true for the booking owner
		assertTrue(parkingSensorController.isBookingOwnerCar(testBooking));

		authController.logout();

		// Create another booking with different licence plate
		clientService.registerClient("Other Client", "other@example.com", "123456Ab!", type.STUDENT, "XYZ789");
		Client otherClient = clientRepository.getClientByEmail("other@example.com");
		otherClient.setApproved(true);
		authController.login(otherClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		Booking otherBooking = bookingController.createBooking(testSpace, 2);

		// Should be false for different booking
		assertFalse(parkingSensorController.isBookingOwnerCar(otherBooking));
	}

	@Test
	void testSimulateCarDepartureWrongLicencePlate() {
		// Login as client and simulate arrival
		authController.login(testClient.getEmail(), "123456Ab!", models.user.UserType.CLIENT);
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Try to depart with wrong license plate
		assertThrows(models.ParkingSystemException.class,
				() -> parkingSensorController.simulateCarDeparture(testSpace, "WRONG123"));

		// Verify car is still present
		assertTrue(parkingSensorController.isCarPresentAtSpace(testSpace));
		assertEquals("ABC123", parkingSensorController.getDetectedLicencePlate(testSpace));
	}

	@Test
	void testSimulateCarDepartureEmptySpace() {
		// Verify space is initially empty
		assertFalse(parkingSensorController.isCarPresentAtSpace(testSpace));
		assertNull(parkingSensorController.getDetectedLicencePlate(testSpace));

		// Try to depart from empty space
		assertThrows(models.ParkingSystemException.class,
				() -> parkingSensorController.simulateCarDeparture(testSpace, "ABC123"));

		// Verify space is still empty
		assertFalse(parkingSensorController.isCarPresentAtSpace(testSpace));
		assertNull(parkingSensorController.getDetectedLicencePlate(testSpace));
	}
}
