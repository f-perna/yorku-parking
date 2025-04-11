package controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import csv.ClientCSVProcessor;
import models.ParkingSystemException;
import models.client.Client;

class ClientControllerTest extends BaseControllerTest {

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
	}

	@Test
	void testRegisterClient_Valid() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "ABC123";

		boolean result = controllerFactory.getClientController().registerClient(name, email, password, clientType,
				licencePlate);

		assertTrue(result);

		List<Client> clients = ClientCSVProcessor.readClientData();
		assertEquals(1, clients.size());
		assertEquals(name, clients.get(0).getName());
		assertEquals(email.toLowerCase(), clients.get(0).getEmail());
		assertEquals(licencePlate.toUpperCase(), clients.get(0).getLicencePlate());
	}

	@Test
	void testRegisterDuplicateLicensePlate() {
		Client.type clientType = Client.type.STUDENT;
		String password = "Password123!";
		String licencePlate = "ABC123";

		String name1 = "John Doe";
		String email1 = "john@example.com";

		String name2 = "James Smith";
		String email2 = "james_smith@example.com";

		boolean result = controllerFactory.getClientController().registerClient(name1, email1, password, clientType,
				licencePlate);
		assertTrue(result);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name2, email2, password, clientType, licencePlate));

		assertEquals("License Plate is already being used by a user in the system", exception.getMessage());
	}

	@Test
	void testRegisterDuplicateEmail() {
		Client.type clientType = Client.type.STUDENT;
		String password = "Password123!";
		String email = "john@example.com";

		String name1 = "John Doe";
		String licencePlate1 = "ABC123";

		String name2 = "James Smith";
		String licencePlate2 = "XYZ123";

		boolean result = controllerFactory.getClientController().registerClient(name1, email, password, clientType,
				licencePlate1);
		assertTrue(result);

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name2, email, password, clientType, licencePlate2));

		assertEquals("Email address is already registered in the system", exception.getMessage());
	}

	@Test
	void testRegisterClient_NullName() {
		String name = null;
		String email = "john@example.com";
		String password = "Password123!";
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "ABC123";

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name, email, password, clientType, licencePlate));

		assertEquals("Name must be provided", exception.getMessage());
	}

	@Test
	void testRegisterClient_InvalidEmail() {
		String name = "John Doe";
		String email = "invalid-email";
		String password = "Password123!";
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "ABC123";

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name, email, password, clientType, licencePlate));

		assertEquals("Email address must be in a valid format (e.g., user@domain.com)", exception.getMessage());
	}

	@Test
	void testRegisterClient_ShortPassword() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Short";
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "ABC123";

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name, email, password, clientType, licencePlate));

		assertEquals("Password must be at least 8 characters long", exception.getMessage());
	}

	@Test
	void testRegisterClient_NoUpperCase() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "12345678ab!";
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "ABC123";

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name, email, password, clientType, licencePlate));

		assertEquals("Password must include uppercase, lowercase, number and symbol (min 8 chars)",
				exception.getMessage());
	}

	@Test
	void testRegisterClient_NoLowerCase() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "12345678AB!";
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "ABC123";

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name, email, password, clientType, licencePlate));

		assertEquals("Password must include uppercase, lowercase, number and symbol (min 8 chars)",
				exception.getMessage());
	}

	@Test
	void testRegisterClient_NoSymbols() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "12345678aB";
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "ABC123";

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name, email, password, clientType, licencePlate));

		assertEquals("Password must include uppercase, lowercase, number and symbol (min 8 chars)",
				exception.getMessage());
	}

	@Test
	void testRegisterClient_InvalidLicencePlate() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		Client.type clientType = Client.type.STUDENT;
		String licencePlate = "a-b-c"; // Invalid format

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name, email, password, clientType, licencePlate));

		assertEquals("Licence plate must contain 2-8 uppercase letters, numbers, and spaces", exception.getMessage());
	}

	@Test
	void testRegisterClient_NullClientType() {
		String name = "John Doe";
		String email = "john@example.com";
		String password = "Password123!";
		Client.type clientType = null;
		String licencePlate = "ABC123";

		ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> controllerFactory
				.getClientController().registerClient(name, email, password, clientType, licencePlate));

		assertEquals("Client type must be specified", exception.getMessage());
	}

	@Test
	void testGetAllClients() {
		controllerFactory.getClientController().registerClient("Test User", "test@example.com", "Password123!",
				Client.type.STUDENT, "TEST123");

		List<Client> clients = controllerFactory.getClientController().getAllClients();

		assertEquals(1, clients.size());
		assertEquals("Test User", clients.get(0).getName());
		assertEquals("test@example.com", clients.get(0).getEmail());
	}
}
