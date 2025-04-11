package controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import models.ParkingSystemException;
import models.client.Client;
import models.user.UserType;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import services.ClientService;
import services.ManagerService;
import services.SuperManagerService;
import models.manager.Manager;
import repositories.ParkingLotRepository;
import services.ParkingLotService;
import repositories.ParkingSpaceRepository;
import services.ParkingSpaceService;

public class AuthControllerTest {

	private ClientService clientService;
	private ManagerService managerService;
	private SuperManagerService superManagerService;
	private ClientController clientController;
	private ManagerController managerController;
	private AuthController authController;
	private String testClientsFilePath;
	private String testManagersFilePath;

	@TempDir
	File tempDir;

	@BeforeEach
	void setUp() throws IOException {
		testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
		ClientCSVProcessor.initializeTestFile(testClientsFilePath);

		testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";
		ManagerCSVProcessor.initializeTestFile(testManagersFilePath);

		ClientRepository clientRepository = new ClientRepository();
		clientService = new ClientService(clientRepository);
		clientController = new ClientController(clientService);

		ManagerRepository managerRepository = new ManagerRepository();
		managerService = new ManagerService(managerRepository);

		managerController = new ManagerController(null, null, clientService);

		superManagerService = new SuperManagerService();

		authController = new AuthController(clientService, managerService, superManagerService);
	}

	@AfterEach
	void tearDown() {
		ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
		ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);
		if (authController.isLoggedIn()) {
			authController.logout();
		}
	}

	@Test
	void testUnsuccessfulSuperManagerLogin() {
		String correctEmail = "superadmin@parking.yorku.ca";
		String correctPassword = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		String wrongPassword = "WrongPassword123!";
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(correctEmail, wrongPassword, userType));
		assertEquals("Invalid username or password", exception.getMessage());

		String wrongEmail = "wrongadmin@example.com";
		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(wrongEmail, correctPassword, userType));
		assertEquals("Invalid username or password", exception.getMessage());
	}

	@Test
	void testSuccessfulSuperManagerLogin() {
		String email = "superadmin@parking.yorku.ca";
		String password = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		boolean loginResult = authController.login(email, password, userType);
		assertTrue(loginResult);
		assertTrue(authController.isLoggedIn());
		assertNotNull(authController.getLoggedInSuperManager());
	}

	@Test
	void testAutoManagerAccountGeneration() {
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		boolean loginResult = authController.login(superEmail, superPassword, userType);
		assertTrue(loginResult);
		assertTrue(authController.isLoggedIn());
		assertNotNull(authController.getLoggedInSuperManager());

		Manager newManager = managerService.generateAndGetManagerAccount();
		assertNotNull(newManager);
		assertNotNull(newManager.getEmail());
		assertNotNull(newManager.getPassword());

		List<Manager> managers = managerService.getAllManagers();
		assertTrue(managers.contains(newManager));
		assertEquals(1, managers.size());
	}

	@Test
	void testSuccessfulManagerLogin() {
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		boolean loginResult = authController.login(superEmail, superPassword, userType);
		assertTrue(loginResult);
		assertTrue(authController.isLoggedIn());
		assertNotNull(authController.getLoggedInSuperManager());

		Manager newManager = managerService.generateAndGetManagerAccount();
		assertNotNull(newManager);
		assertNotNull(newManager.getEmail());
		assertNotNull(newManager.getPassword());

		List<Manager> managers = managerService.getAllManagers();
		assertTrue(managers.contains(newManager));
		assertEquals(1, managers.size());

		authController.logout();

		boolean managerLoginResult = authController.login(newManager.getEmail(), newManager.getPassword(),
				UserType.MANAGER);
		assertTrue(managerLoginResult);
		assertTrue(authController.isLoggedIn());
		assertNotNull(authController.getLoggedInManager());
		assertEquals(newManager.getEmail(), authController.getLoggedInManager().getEmail());
	}

	@Test
	void testUnsuccessfulManagerLogin() {
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		boolean loginResult = authController.login(superEmail, superPassword, userType);
		assertTrue(loginResult);
		assertTrue(authController.isLoggedIn());
		assertNotNull(authController.getLoggedInSuperManager());

		Manager newManager = managerService.generateAndGetManagerAccount();
		assertNotNull(newManager);
		assertNotNull(newManager.getEmail());
		assertNotNull(newManager.getPassword());

		authController.logout();

		String wrongPassword = "WrongPassword123!";
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(newManager.getEmail(), wrongPassword, UserType.MANAGER));
		assertEquals("Invalid email address or password", exception.getMessage());
		assertFalse(authController.isLoggedIn());
		assertNull(authController.getLoggedInManager());

		String wrongEmail = "wrongmanager@example.com";
		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(wrongEmail, newManager.getPassword(), UserType.MANAGER));
		assertEquals("Invalid email address or password", exception.getMessage());
		assertFalse(authController.isLoggedIn());
		assertNull(authController.getLoggedInManager());

		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(newManager.getEmail(), newManager.getPassword(), UserType.CLIENT));
		assertEquals("Invalid email address or password", exception.getMessage());
		assertFalse(authController.isLoggedIn());
		assertNull(authController.getLoggedInManager());
	}

	@Test
	void testNonApprovedNonFacultyLogin() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		UserType userType = UserType.CLIENT;
		Client.type clientType = Client.type.NON_FACULTY;
		String licencePlate = "ABC123";
		boolean registerResult = clientController.registerClient(name, email, password, clientType, licencePlate);
		assertTrue(registerResult);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(email, password, userType));
		assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.",
				exception.getMessage());
		assertFalse(authController.isLoggedIn());
		assertNull(authController.getLoggedInClient());
		List<Client> clients = clientController.getAllClients();
		assertEquals(1, clients.size());
	}

	@Test
	void testNonApprovedFacultyLogin() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		UserType userType = UserType.CLIENT;
		Client.type clientType = Client.type.FACULTY;
		String licencePlate = "ABC123";
		boolean registerResult = clientController.registerClient(name, email, password, clientType, licencePlate);
		assertTrue(registerResult);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(email, password, userType));
		assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.",
				exception.getMessage());
		assertFalse(authController.isLoggedIn());
		assertNull(authController.getLoggedInClient());
		List<Client> clients = clientController.getAllClients();
		assertEquals(1, clients.size());
	}

	@Test
	void testNonApprovedStudentLogin() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		UserType userType = UserType.CLIENT;
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "ABC123";

		boolean registerResult = clientController.registerClient(name, email, password, clientType, licencePlate);
		assertTrue(registerResult);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(email, password, userType));

		assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.",
				exception.getMessage());
		assertFalse(authController.isLoggedIn());
		assertNull(authController.getLoggedInClient());
		List<Client> clients = clientController.getAllClients();
		assertEquals(1, clients.size());
	}

	@Test
	void testSuccessfulVisitorLogin() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		UserType userType = UserType.CLIENT;
		Client.type clientType = Client.type.VISITOR;
		String licencePlate = "ABC123";

		boolean registerResult = clientController.registerClient(name, email, password, clientType, licencePlate);
		assertTrue(registerResult);

		boolean loginResult = authController.login(email, password, userType);
		assertTrue(loginResult);
		assertTrue(authController.isLoggedIn());

		Client loggedInClient = authController.getLoggedInClient();
		assertNotNull(loggedInClient);
		assertEquals(email, loggedInClient.getEmail());
		assertEquals(name, loggedInClient.getName());
		assertEquals(licencePlate, loggedInClient.getLicencePlate());
		assertEquals(clientType, loggedInClient.getType());
		assertTrue(loggedInClient.isApproved());
	}

	@Test
	void testApprovedClientLogin() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		Client.type clientType = Client.type.FACULTY;
		String licencePlate = "ABC123";

		boolean registerResult = clientController.registerClient(name, email, password, clientType, licencePlate);
		assertTrue(registerResult);

		List<Client> clients = clientController.getAllClients();
		assertEquals(1, clients.size());
		Client client = clients.get(0);
		assertFalse(client.isApproved());

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(email, password, UserType.CLIENT));
		assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.",
				exception.getMessage());

		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		boolean loginResult = authController.login(superEmail, superPassword, UserType.SUPER_MANAGER);
		assertTrue(loginResult);

		Manager newManager = managerService.generateAndGetManagerAccount();
		assertNotNull(newManager);

		authController.logout();
		loginResult = authController.login(newManager.getEmail(), newManager.getPassword(), UserType.MANAGER);
		assertTrue(loginResult);

		boolean approveResult = managerController.approveClient(email);
		assertTrue(approveResult);

		clients = clientController.getAllClients();
		client = clients.get(0);
		assertTrue(client.isApproved());

		authController.logout();
		loginResult = authController.login(email, password, UserType.CLIENT);
		assertTrue(loginResult);
		assertTrue(authController.isLoggedIn());
		assertNotNull(authController.getLoggedInClient());
		assertEquals(email, authController.getLoggedInClient().getEmail());
	}

	@Test
	void testLogoutWhenNoUserLoggedIn() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> authController.logout());
		assertEquals("No user is currently logged in", exception.getMessage());
	}

	@Test
	void testActionsAfterLogout() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		String licencePlate = "ABC123";
		clientController.registerClient(name, email, password, Client.type.VISITOR, licencePlate);
		boolean loginResult = authController.login(email, password, UserType.CLIENT);
		assertTrue(loginResult);

		authController.logout();
		assertFalse(authController.isLoggedIn());

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> authController.logout());
		assertEquals("No user is currently logged in", exception.getMessage());

		assertNull(authController.getLoggedInClient());
		assertNull(authController.getLoggedInManager());
		assertNull(authController.getLoggedInSuperManager());
	}

	@Test
	void testLoginWhileAnotherUserLoggedIn() {
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		boolean loginResult = authController.login(superEmail, superPassword, UserType.SUPER_MANAGER);
		assertTrue(loginResult);
		assertTrue(authController.isLoggedIn());

		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		String licencePlate = "ABC123";
		clientController.registerClient(name, email, password, Client.type.VISITOR, licencePlate);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(email, password, UserType.CLIENT));
		assertEquals("Another user is currently logged in", exception.getMessage());

		assertTrue(authController.isLoggedIn());
		assertNotNull(authController.getLoggedInSuperManager());
	}

	@Test
	void testLoginWithMismatchedUserTypes() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		String licencePlate = "ABC123";
		clientController.registerClient(name, email, password, Client.type.VISITOR, licencePlate);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(email, password, UserType.MANAGER));
		assertEquals("Invalid email address or password", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(email, password, UserType.SUPER_MANAGER));
		assertEquals("Invalid username or password", exception.getMessage());
	}

	@Test
	void testLoginWithInvalidCredentials() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> authController.login(null, "password", UserType.CLIENT));
		assertEquals("Email cannot be empty", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login("email@test.com", null, UserType.CLIENT));
		assertEquals("Password cannot be empty", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login("email@test.com", "password", null));
		assertEquals("User type cannot be null", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login("", "password", UserType.CLIENT));
		assertEquals("Email cannot be empty", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login("email@test.com", "", UserType.CLIENT));
		assertEquals("Password cannot be empty", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> authController.login("   ", "password", UserType.CLIENT));
		assertEquals("Email cannot be empty", exception.getMessage());
	}
}