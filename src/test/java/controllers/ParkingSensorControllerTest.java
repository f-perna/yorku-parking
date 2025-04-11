package controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.manager.Manager;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.user.UserType;
import models.client.Client;
import models.client.Client.type;
import models.booking.Booking;

public class ParkingSensorControllerTest extends BaseControllerTest {
	private ParkingSensorController parkingSensorController;
	private AuthController authController;
	private BookingController bookingController;
	private ManagerController managerController;
	private SuperManagerController superManagerController;
	private Manager testManager;
	private ParkingLot testLot;
	private ParkingSpace testSpace;
	private Client testClient;
	private Booking testBooking;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeControllers();
		createTestManager();
		createTestParkingLotAndSpace();
		createTestClient();
		createTestBooking();
	}

	private void initializeControllers() {
		parkingSensorController = controllerFactory.getParkingSensorController();
		authController = controllerFactory.getAuthController();
		bookingController = controllerFactory.getBookingController();
		managerController = controllerFactory.getManagerController();
		superManagerController = controllerFactory.getSuperManagerController();
	}

	private void createTestManager() {
		ensureLoggedOut();
		// Login as SuperManager
		authController.login("superadmin@parking.yorku.ca", "Super@dmin123!", UserType.SUPER_MANAGER);

		// Generate manager
		testManager = superManagerController.generateAndGetManagerAccount();

		// Logout and login as manager
		authController.logout();
		authController.login(testManager.getEmail(), testManager.getPassword(), UserType.MANAGER);
	}

	private void createTestParkingLotAndSpace() {
		// Create test parking lot
		managerController.addParkingLot("Test Lot");
		testLot = controllerFactory.getParkingLotController().getParkingLotByName("Test Lot");
		if (testLot == null) {
			throw new IllegalStateException("Failed to create test parking lot");
		}

		// Create test parking space
		managerController.addParkingSpace(testLot, "Test Space");
		List<ParkingSpace> spaces = controllerFactory.getParkingSpaceController()
				.getParkingSpacesForLot(testLot.getID());
		if (spaces.isEmpty()) {
			throw new IllegalStateException("Failed to create test parking space");
		}
		testSpace = spaces.get(0);
	}

	private void createTestClient() {
		// Create and approve test client
		controllerFactory.getClientController().registerClient("Test Client", "test@example.com", "123456Ab!",
				type.STUDENT, "ABC123");
		testClient = controllerFactory.getManagerController().getClientByEmail("test@example.com");
		if (testClient == null) {
			throw new IllegalStateException("Failed to create test client");
		}
		testClient.setApproved(true);
	}

	private void createTestBooking() {
		// Login as client and create booking
		ensureLoggedOut();
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);
		testBooking = bookingController.createBooking(testSpace, 2);
		ensureLoggedOut();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
	}

	@Test
	void testSimulateCarArrival() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

		// Simulate car arrival
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Verify car is present
		assertTrue(parkingSensorController.isCarPresentAtSpace(testSpace));
		assertEquals("ABC123", parkingSensorController.getDetectedLicencePlate(testSpace));
	}

	@Test
	void testSimulateCarArrivalOccupiedSpace() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

		// First arrival should succeed
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Second arrival should fail
		assertThrows(models.ParkingSystemException.class,
				() -> parkingSensorController.simulateCarArrival(testSpace, "ABC123"));
	}

	@Test
	void testSimulateCarDeparture() {
		// Login as client
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);

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
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Now car should be present
		assertTrue(parkingSensorController.isCarPresentAtSpace(testSpace));
	}

	@Test
	void testGetDetectedLicencePlate() {
		// Initially no licence plate should be detected
		assertNull(parkingSensorController.getDetectedLicencePlate(testSpace));

		// Login as client and simulate arrival
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Now licence plate should be detected
		assertEquals("ABC123", parkingSensorController.getDetectedLicencePlate(testSpace));
	}

	@Test
	void testIsBookingOwnerCar() {
		// Login as client and simulate arrival
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);
		parkingSensorController.simulateCarArrival(testSpace, "ABC123");

		// Should be true for the booking owner
		assertTrue(parkingSensorController.isBookingOwnerCar(testBooking));

		authController.logout();

		// Create another booking with different licence plate
		controllerFactory.getClientController().registerClient("Other Client", "other@example.com", "123456Ab!",
				type.STUDENT, "XYZ789");
		Client otherClient = controllerFactory.getManagerController().getClientByEmail("other@example.com");
		otherClient.setApproved(true);
		authController.login(otherClient.getEmail(), "123456Ab!", UserType.CLIENT);
		Booking otherBooking = bookingController.createBooking(testSpace, 2);

		// Should be false for different booking
		assertFalse(parkingSensorController.isBookingOwnerCar(otherBooking));
	}

	@Test
	void testSimulateCarDepartureWrongLicencePlate() {
		// Login as client and simulate arrival
		authController.login(testClient.getEmail(), "123456Ab!", UserType.CLIENT);
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
