package manual.services;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import models.ParkingSystemException;
import models.manager.Manager;
import models.superManager.SuperManager;

public class ManagerServiceTest extends BaseServiceTest {

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		super.loginAsSuperManager();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		super.tearDown();
	}

	@Test
	public void verifyManagerLogin() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();

		Manager loggedInManager = serviceFactory.getManagerService().login(testManager.getEmail(),
				testManager.getPassword());

		assertNotNull(loggedInManager);

		super.loginAsSuperManager();

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

		super.loginAsSuperManager();
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
