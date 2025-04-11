package manual.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.ParkingSystemException;
import models.client.Client;
import models.user.UserType;
import models.manager.Manager;

public class AuthControllerTest extends BaseControllerTest {

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
	}

	@Test
	void testUnsuccessfulSuperManagerLogin() {
		String correctEmail = "superadmin@parking.yorku.ca";
		String correctPassword = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		String wrongPassword = "WrongPassword123!";
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(correctEmail, wrongPassword, userType));
		assertEquals("Invalid username or password", exception.getMessage());

		String wrongEmail = "wrongadmin@example.com";
		exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(wrongEmail, correctPassword, userType));
		assertEquals("Invalid username or password", exception.getMessage());
	}

	@Test
	void testSuccessfulSuperManagerLogin() {
		String email = "superadmin@parking.yorku.ca";
		String password = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		boolean loginResult = controllerFactory.getAuthController().login(email, password, userType);
		assertTrue(loginResult);
		assertTrue(controllerFactory.getAuthController().isLoggedIn());
		assertNotNull(controllerFactory.getAuthController().getLoggedInSuperManager());
	}

	@Test
	void testAutoManagerAccountGeneration() {
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		boolean loginResult = controllerFactory.getAuthController().login(superEmail, superPassword, userType);
		assertTrue(loginResult);
		assertTrue(controllerFactory.getAuthController().isLoggedIn());
		assertNotNull(controllerFactory.getAuthController().getLoggedInSuperManager());

		Manager newManager = controllerFactory.getSuperManagerController().generateAndGetManagerAccount();
		assertNotNull(newManager);
		assertNotNull(newManager.getEmail());
		assertNotNull(newManager.getPassword());

		List<Manager> managers = controllerFactory.getSuperManagerController().getAllManagers();
		assertTrue(managers.contains(newManager));
		assertEquals(1, managers.size());
	}

	@Test
	void testSuccessfulManagerLogin() {
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		boolean loginResult = controllerFactory.getAuthController().login(superEmail, superPassword, userType);
		assertTrue(loginResult);
		assertTrue(controllerFactory.getAuthController().isLoggedIn());
		assertNotNull(controllerFactory.getAuthController().getLoggedInSuperManager());

		Manager newManager = controllerFactory.getSuperManagerController().generateAndGetManagerAccount();
		assertNotNull(newManager);
		assertNotNull(newManager.getEmail());
		assertNotNull(newManager.getPassword());

		List<Manager> managers = controllerFactory.getSuperManagerController().getAllManagers();
		assertTrue(managers.contains(newManager));
		assertEquals(1, managers.size());

		controllerFactory.getAuthController().logout();

		boolean managerLoginResult = controllerFactory.getAuthController().login(newManager.getEmail(),
				newManager.getPassword(), UserType.MANAGER);
		assertTrue(managerLoginResult);
		assertTrue(controllerFactory.getAuthController().isLoggedIn());
		assertNotNull(controllerFactory.getAuthController().getLoggedInManager());
		assertEquals(newManager.getEmail(), controllerFactory.getAuthController().getLoggedInManager().getEmail());
	}

	@Test
	void testUnsuccessfulManagerLogin() {
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		UserType userType = UserType.SUPER_MANAGER;

		boolean loginResult = controllerFactory.getAuthController().login(superEmail, superPassword, userType);
		assertTrue(loginResult);
		assertTrue(controllerFactory.getAuthController().isLoggedIn());
		assertNotNull(controllerFactory.getAuthController().getLoggedInSuperManager());

		Manager newManager = controllerFactory.getSuperManagerController().generateAndGetManagerAccount();
		assertNotNull(newManager);
		assertNotNull(newManager.getEmail());
		assertNotNull(newManager.getPassword());

		controllerFactory.getAuthController().logout();

		String wrongPassword = "WrongPassword123!";
		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getAuthController().login(newManager.getEmail(), wrongPassword, UserType.MANAGER));
		assertEquals("Invalid email address or password", exception.getMessage());
		assertFalse(controllerFactory.getAuthController().isLoggedIn());
		assertNull(controllerFactory.getAuthController().getLoggedInManager());

		String wrongEmail = "wrongmanager@example.com";
		exception = assertThrows(ParkingSystemException.class, () -> controllerFactory.getAuthController()
				.login(wrongEmail, newManager.getPassword(), UserType.MANAGER));
		assertEquals("Invalid email address or password", exception.getMessage());
		assertFalse(controllerFactory.getAuthController().isLoggedIn());
		assertNull(controllerFactory.getAuthController().getLoggedInManager());

		exception = assertThrows(ParkingSystemException.class, () -> controllerFactory.getAuthController()
				.login(newManager.getEmail(), newManager.getPassword(), UserType.CLIENT));
		assertEquals("Invalid email address or password", exception.getMessage());
		assertFalse(controllerFactory.getAuthController().isLoggedIn());
		assertNull(controllerFactory.getAuthController().getLoggedInManager());
	}

	@Test
	void testNonApprovedNonFacultyLogin() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		UserType userType = UserType.CLIENT;
		Client.type clientType = Client.type.NON_FACULTY;
		String licencePlate = "ABC123";
		boolean registerResult = controllerFactory.getClientController().registerClient(name, email, password,
				clientType, licencePlate);
		assertTrue(registerResult);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(email, password, userType));
		assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.",
				exception.getMessage());
		assertFalse(controllerFactory.getAuthController().isLoggedIn());
		assertNull(controllerFactory.getAuthController().getLoggedInClient());
		List<Client> clients = controllerFactory.getClientController().getAllClients();
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
		boolean registerResult = controllerFactory.getClientController().registerClient(name, email, password,
				clientType, licencePlate);
		assertTrue(registerResult);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(email, password, userType));
		assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.",
				exception.getMessage());
		assertFalse(controllerFactory.getAuthController().isLoggedIn());
		assertNull(controllerFactory.getAuthController().getLoggedInClient());
		List<Client> clients = controllerFactory.getClientController().getAllClients();
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

		boolean registerResult = controllerFactory.getClientController().registerClient(name, email, password,
				clientType, licencePlate);
		assertTrue(registerResult);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(email, password, userType));

		assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.",
				exception.getMessage());
		assertFalse(controllerFactory.getAuthController().isLoggedIn());
		assertNull(controllerFactory.getAuthController().getLoggedInClient());
		List<Client> clients = controllerFactory.getClientController().getAllClients();
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

		boolean registerResult = controllerFactory.getClientController().registerClient(name, email, password,
				clientType, licencePlate);
		assertTrue(registerResult);

		boolean loginResult = controllerFactory.getAuthController().login(email, password, userType);
		assertTrue(loginResult);
		assertTrue(controllerFactory.getAuthController().isLoggedIn());

		Client loggedInClient = controllerFactory.getAuthController().getLoggedInClient();
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

		boolean registerResult = controllerFactory.getClientController().registerClient(name, email, password,
				clientType, licencePlate);
		assertTrue(registerResult);

		List<Client> clients = controllerFactory.getClientController().getAllClients();
		assertEquals(1, clients.size());
		Client client = clients.get(0);
		assertFalse(client.isApproved());

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(email, password, UserType.CLIENT));
		assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.",
				exception.getMessage());

		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		boolean loginResult = controllerFactory.getAuthController().login(superEmail, superPassword,
				UserType.SUPER_MANAGER);
		assertTrue(loginResult);

		Manager newManager = controllerFactory.getSuperManagerController().generateAndGetManagerAccount();
		assertNotNull(newManager);

		controllerFactory.getAuthController().logout();
		loginResult = controllerFactory.getAuthController().login(newManager.getEmail(), newManager.getPassword(),
				UserType.MANAGER);
		assertTrue(loginResult);

		boolean approveResult = controllerFactory.getManagerController().approveClient(email);
		assertTrue(approveResult);

		clients = controllerFactory.getClientController().getAllClients();
		client = clients.get(0);
		assertTrue(client.isApproved());

		controllerFactory.getAuthController().logout();
		loginResult = controllerFactory.getAuthController().login(email, password, UserType.CLIENT);
		assertTrue(loginResult);
		assertTrue(controllerFactory.getAuthController().isLoggedIn());
		assertNotNull(controllerFactory.getAuthController().getLoggedInClient());
		assertEquals(email, controllerFactory.getAuthController().getLoggedInClient().getEmail());
	}

	@Test
	void testLogoutWhenNoUserLoggedIn() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().logout());
		assertEquals("No user is currently logged in", exception.getMessage());
	}

	@Test
	void testActionsAfterLogout() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		String licencePlate = "ABC123";
		controllerFactory.getClientController().registerClient(name, email, password, Client.type.VISITOR,
				licencePlate);
		boolean loginResult = controllerFactory.getAuthController().login(email, password, UserType.CLIENT);
		assertTrue(loginResult);

		controllerFactory.getAuthController().logout();
		assertFalse(controllerFactory.getAuthController().isLoggedIn());

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().logout());
		assertEquals("No user is currently logged in", exception.getMessage());

		assertNull(controllerFactory.getAuthController().getLoggedInClient());
		assertNull(controllerFactory.getAuthController().getLoggedInManager());
		assertNull(controllerFactory.getAuthController().getLoggedInSuperManager());
	}

	@Test
	void testLoginWhileAnotherUserLoggedIn() {
		String superEmail = "superadmin@parking.yorku.ca";
		String superPassword = "Super@dmin123!";
		boolean loginResult = controllerFactory.getAuthController().login(superEmail, superPassword,
				UserType.SUPER_MANAGER);
		assertTrue(loginResult);
		assertTrue(controllerFactory.getAuthController().isLoggedIn());

		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		String licencePlate = "ABC123";
		controllerFactory.getClientController().registerClient(name, email, password, Client.type.VISITOR,
				licencePlate);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(email, password, UserType.CLIENT));
		assertEquals("Another user is currently logged in", exception.getMessage());

		assertTrue(controllerFactory.getAuthController().isLoggedIn());
		assertNotNull(controllerFactory.getAuthController().getLoggedInSuperManager());
	}

	@Test
	void testLoginWithMismatchedUserTypes() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		String licencePlate = "ABC123";
		controllerFactory.getClientController().registerClient(name, email, password, Client.type.VISITOR,
				licencePlate);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(email, password, UserType.MANAGER));
		assertEquals("Invalid email address or password", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(email, password, UserType.SUPER_MANAGER));
		assertEquals("Invalid username or password", exception.getMessage());
	}

	@Test
	void testLoginWithInvalidCredentials() {
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login(null, "password", UserType.CLIENT));
		assertEquals("Email cannot be empty", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login("email@test.com", null, UserType.CLIENT));
		assertEquals("Password cannot be empty", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login("email@test.com", "password", null));
		assertEquals("User type cannot be null", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login("", "password", UserType.CLIENT));
		assertEquals("Email cannot be empty", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login("email@test.com", "", UserType.CLIENT));
		assertEquals("Password cannot be empty", exception.getMessage());

		exception = assertThrows(ParkingSystemException.class,
				() -> controllerFactory.getAuthController().login("   ", "password", UserType.CLIENT));
		assertEquals("Email cannot be empty", exception.getMessage());
	}
}