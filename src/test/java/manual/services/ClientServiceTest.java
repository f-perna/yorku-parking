package manual.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.ParkingSystemException;
import models.client.Client;

public class ClientServiceTest extends BaseServiceTest {

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
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
