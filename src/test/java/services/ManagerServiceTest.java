package services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
import models.manager.Manager;
import models.superManager.SuperManager;
import services.factory.ServiceFactory;
import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;

public class ManagerServiceTest {
	private ServiceFactory serviceFactory;
	private AuthenticationState authState;
	private SuperManager superManager;

	private String testBookingsFilePath;
	private String testParkingLotsFilePath;
	private String testParkingSpacesFilePath;
	private String testParkingSensorFilePath;
	private String testClientsFilePath;
	private String testManagersFilePath;

	@TempDir
	File tempDir;

	@BeforeEach
	void setUp() throws IOException {
		initializeTestFiles();
		initializeFactories();
		initializeAuth();
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

	private void initializeAuth() {
		authState = AuthenticationState.getInstance();
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);
	}

	@AfterEach
	void tearDown() throws NoSuchFieldException, IllegalAccessException {
		authState.setLoggedInUser(null);
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
	}

	private void resetFactory(Class<?> factoryClass, String instanceFieldName)
			throws NoSuchFieldException, IllegalAccessException {
		Field instance = factoryClass.getDeclaredField(instanceFieldName);
		instance.setAccessible(true);
		instance.set(null, null);
	}

	@Test
	public void verifyManagerLogin() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();

		Manager loggedInManager = serviceFactory.getManagerService().login(testManager.getEmail(),
				testManager.getPassword());

		assertNotNull(loggedInManager);

		authState.setLoggedInUser(superManager);

		serviceFactory.getManagerService().removeManager(testManager.getEmail());
	}

	@Test
	public void verifyInvalidAutoGenerateManagerAccount() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();

		Manager loggedInManager = serviceFactory.getManagerService().login(testManager.getEmail(),
				testManager.getPassword());

		assertNotNull(loggedInManager);
		authState.setLoggedInUser(loggedInManager);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getManagerService().generateAndGetManagerAccount());
		assertEquals("Only super managers can add new managers", exception.getMessage());

		authState.setLoggedInUser(superManager);
	}

	@Test
	public void verifyInvalidManagerLoginEmail() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> serviceFactory
				.getManagerService().login(testManager.getEmail() + "bad", testManager.getPassword()));
		assertEquals("Invalid email address or password", exception.getMessage());

	}

	@Test
	public void verifyInvalidManagerLoginPassword() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> serviceFactory
				.getManagerService().login(testManager.getEmail(), testManager.getPassword() + "bad"));
		assertEquals("Invalid email address or password", exception.getMessage());
	}

	@Test
	public void verifySuperManagerLogin() {
		SuperManager loggedInSuperManager = serviceFactory.getSuperManagerService().login("superadmin@parking.yorku.ca",
				"Super@dmin123!");

		assertNotNull(loggedInSuperManager);
	}

	@Test
	public void verifyInvalidSuperManagerLoginEmail() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getManagerService().login("superadminbad@parking.yorku.ca", "Super@dmin123!"));
		assertEquals("Invalid email address or password", exception.getMessage());
	}

	@Test
	public void verifyInvalidSuperManagerLoginPassword() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getManagerService().login("superadmin@parking.yorku.ca", "Super@dmin123!bad"));
		assertEquals("Invalid email address or password", exception.getMessage());
	}

	@Test
	public void verifyRemoveManager() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();

		Boolean removed = serviceFactory.getManagerService().removeManager(testManager.getEmail());

		assertTrue(removed);
	}

	@Test
	public void verifyInvalidRemoveManager() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();

		Manager loggedInManager = serviceFactory.getManagerService().login(testManager.getEmail(),
				testManager.getPassword());

		assertNotNull(loggedInManager);
		authState.setLoggedInUser(loggedInManager);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> serviceFactory.getManagerService().removeManager(testManager.getEmail()));
		assertEquals("Only super managers can add new managers", exception.getMessage());

		authState.setLoggedInUser(superManager);
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
	}

	@Test
	public void verifyGetManagers() {
		int initialSize = serviceFactory.getManagerService().getAllManagers().size();

		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();

		assertEquals(initialSize + 1, serviceFactory.getManagerService().getAllManagers().size());

		serviceFactory.getManagerService().removeManager(testManager.getEmail());
	}
}
