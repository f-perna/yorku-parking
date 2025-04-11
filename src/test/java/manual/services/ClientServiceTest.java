package manual.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.client.Client;
import services.factory.ServiceFactory;
import controllers.factory.ControllerFactory;
import controllers.AuthController;
import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;

public class ClientServiceTest {
	private ServiceFactory serviceFactory;

	private String testBookingsFilePath;
	private String testParkingLotsFilePath;
	private String testParkingSpacesFilePath;
	private String testParkingSensorFilePath;
	private String testClientsFilePath;
	private String testManagersFilePath;

	private AuthenticationState authState;

	@TempDir
	File tempDir;

	@BeforeEach
	void setUp() throws IOException {
		authState = AuthenticationState.getInstance();
		initializeTestFiles();
		initializeFactories();
	}

	private void initializeTestFiles() throws IOException {
		// Initialize test CSV file paths
		testBookingsFilePath = tempDir.getAbsolutePath() + "/test_bookings.csv";
		testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
		testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
		testParkingSensorFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";

		// Initialize test CSV files
		BookingCSVProcessor.initializeTestFile(testBookingsFilePath);
		ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
		ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
		ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);
	}

	private void initializeFactories() {
		// Initialize factories
		serviceFactory = ServiceFactory.getInstance();
	}

	@AfterEach
	void tearDown() throws NoSuchFieldException, IllegalAccessException {
		if (authState.getLoggedInUser() != null) {
			authState.setLoggedInUser(null);
		}
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
	}

	private void resetFactories() throws NoSuchFieldException, IllegalAccessException {
		// Reset factories in dependency order
		resetFactory(repositories.factory.RepositoryFactory.class, "instance");
		resetFactory(ServiceFactory.class, "instance");
		resetFactory(ControllerFactory.class, "instance");
	}

	private void resetFactory(Class<?> factoryClass, String instanceFieldName)
			throws NoSuchFieldException, IllegalAccessException {
		Field instance = factoryClass.getDeclaredField(instanceFieldName);
		instance.setAccessible(true);
		instance.set(null, null);
	}

	@Test
	public void verifyRegister() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob", "testregister@gmail.com", "ABc123!!",
				Client.type.STUDENT, "ABC 123");

		assertTrue(register);

		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}

	@Test
	public void verifyInvalidNameRegister() {
		try {
			serviceFactory.getClientService().registerClient("", "testregister@gmail.com", "ABc123!!",
					Client.type.STUDENT, "ABC 123");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Name cannot be empty", e.getMessage());
		}
	}

	@Test
	public void verifyInvalidEmailRegister() {
		try {
			serviceFactory.getClientService().registerClient("Bob", "", "ABc123!!", Client.type.STUDENT, "ABC 123");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Invalid email format", e.getMessage());
		}
	}

	@Test
	public void verifyInvalidPasswordRegister() {
		try {
			serviceFactory.getClientService().registerClient("Bob", "testpassword@gmail.com", "123",
					Client.type.STUDENT, "ABC 123");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Password must include uppercase, lowercase, number and symbol (min 8 chars)", e.getMessage());
		}
	}

	@Test
	public void verifyInvalidPlateRegister() {
		try {
			serviceFactory.getClientService().registerClient("Bob", "testpassword@gmail.com", "ABc123!!",
					Client.type.STUDENT, "1");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Licence plate must be 2-8 uppercase letters, numbers, or spaces", e.getMessage());
		}
	}

	@Test
	public void verifyDuplicateEmailRegister() {
		serviceFactory.getClientService().registerClient("Bob", "testregister@gmail.com", "ABc123!!",
				Client.type.STUDENT, "ABC 123");

		try {
			serviceFactory.getClientService().registerClient("Bob", "testregister@gmail.com", "ABc123!!",
					Client.type.STUDENT, "ABC 123");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Email address is already registered in the system", e.getMessage());
		}

		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}

	@Test
	public void verifyLogin() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob", "testregister@gmail.com", "ABc123!!",
				Client.type.VISITOR, "ABC 123");

		assertTrue(register);

		Client loggedInClient = serviceFactory.getClientService().login("testregister@gmail.com", "ABc123!!");

		assertNotNull(loggedInClient);

		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}

	@Test
	public void verifyInvalidLogin() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob", "testregister@gmail.com", "ABc123!!",
				Client.type.VISITOR, "ABC 123");

		assertTrue(register);

		try {
			serviceFactory.getClientService().login("testregisterbad@gmail.com", "ABc123!!");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals("Invalid email address or password", e.getMessage());
		}

		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}

	@Test
	public void verifyApprovalException() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob", "testregister@gmail.com", "ABc123!!",
				Client.type.STUDENT, "ABC 123");

		assertTrue(register);

		try {
			serviceFactory.getClientService().login("testregister@gmail.com", "ABc123!!");
			fail("Expected ParkingSystemException");
		} catch (ParkingSystemException e) {
			assertEquals(
					"Your account is pending approval by a manager. Please wait for approval to access the system.",
					e.getMessage());
		}

		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}

	@Test
	public void verifyLookUpEmail() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob", "testregister@gmail.com", "ABc123!!",
				Client.type.VISITOR, "ABC 123");

		assertTrue(register);

		Client loggedInClient = serviceFactory.getClientService().login("testregister@gmail.com", "ABc123!!");

		assertNotNull(loggedInClient);

		assertEquals(serviceFactory.getClientService().getClientByEmail("testregister@gmail.com"),
				serviceFactory.getClientService().getClientByEmail("testregister@gmail.com"));

		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}
}
