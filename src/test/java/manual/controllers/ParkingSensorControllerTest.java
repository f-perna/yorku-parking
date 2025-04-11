package manual.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.AuthController;
import controllers.BookingController;
import controllers.ParkingSensorController;
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

	private ParkingLot testLot;
	private ParkingSpace testSpace;
	private Client testClient;
	private Booking testBooking;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeControllers();

		this.testLot = super.createTestParkingLot();
		this.testSpace = super.createTestParkingSpace(testLot);
		this.testClient = super.createTestClient();
		this.testBooking = super.createTestBooking(testClient, testSpace);
	}

	private void initializeControllers() {
		parkingSensorController = controllerFactory.getParkingSensorController();
		authController = controllerFactory.getAuthController();
		bookingController = controllerFactory.getBookingController();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.testLot = null;
		this.testSpace = null;
		this.testClient = null;
		this.testBooking = null;
		this.parkingSensorController = null;
		this.bookingController = null;
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
