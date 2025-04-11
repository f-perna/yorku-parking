package manual.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.AuthController;
import controllers.SuperManagerController;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.manager.Manager;
import repositories.ManagerRepository;
import services.ManagerService;

public class SuperManagerControllerTest extends BaseControllerTest {
	private SuperManagerController superManagerController;
	private AuthController authController;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeControllers();
		super.loginAsSuperManager();
	}

	private void initializeControllers() {
		superManagerController = controllerFactory.getSuperManagerController();
		authController = controllerFactory.getAuthController();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.superManagerController = null;
		this.authController = null;
		super.tearDown();
	}

	@Test
	void testGenerateAndGetManagerAccount() {
		Manager newManager = superManagerController.generateAndGetManagerAccount();

		assertNotNull(newManager);
		assertNotNull(newManager.getEmail());
		assertNotNull(newManager.getPassword());

		List<Manager> managers = superManagerController.getAllManagers();
		assertTrue(managers.contains(newManager));
	}

	@Test
	void testRemoveManager() {
		// Create a manager
		Manager newManager = superManagerController.generateAndGetManagerAccount();
		assertNotNull(newManager);

		// Verify manager exists in the list before removal (covers the TRUE branch)
		List<Manager> managersBeforeRemoval = superManagerController.getAllManagers();
		assertTrue(managersBeforeRemoval.contains(newManager));

		// Remove the manager
		boolean removeResult = superManagerController.removeManager(newManager.getEmail());
		assertTrue(removeResult);

		// Verify manager no longer exists in the list (covers the FALSE branch)
		List<Manager> managersAfterRemoval = superManagerController.getAllManagers();
		assertFalse(managersAfterRemoval.contains(newManager));
	}

	@Test
	void testRemoveManagerWithNullEmail() {
		// Arrange & Act & Assert
		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> superManagerController.removeManager(null));

		// Additional assertions on the exception
		assertEquals("Email cannot be null", exception.getMessage());
		assertEquals(ErrorType.VALIDATION, exception.getErrorType());
	}

	@Test
	void testGetAllManagers() {
		Manager manager1 = superManagerController.generateAndGetManagerAccount();
		Manager manager2 = superManagerController.generateAndGetManagerAccount();

		List<Manager> managers = superManagerController.getAllManagers();

		assertTrue(managers.contains(manager1));
		assertTrue(managers.contains(manager2));
	}

	@Test
	void testGenerateManagerWithoutSuperManagerLogin() {
		authController.logout();

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> superManagerController.generateAndGetManagerAccount());

		assertEquals("Only super managers can add new managers", exception.getMessage());
		assertEquals(ErrorType.AUTHORIZATION, exception.getErrorType());
	}

	@Test
	void testRemoveManagerWithoutSuperManagerLogin() {
		Manager newManager = superManagerController.generateAndGetManagerAccount();
		assertNotNull(newManager);

		authController.logout();

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> superManagerController.removeManager(newManager.getEmail()));
		assertEquals("Only super managers can add new managers", exception.getMessage());
		assertEquals(ErrorType.AUTHORIZATION, exception.getErrorType());
	}

	@Test
	void testGetAllManagersWithoutSuperManagerLogin() {
		authController.logout();

		ParkingSystemException exception = assertThrows(ParkingSystemException.class,
				() -> superManagerController.getAllManagers());
		assertEquals("Only super managers can add new managers", exception.getMessage());
		assertEquals(ErrorType.AUTHORIZATION, exception.getErrorType());
	}

	@Test
	void testManagerPasswordValidation() {
		Manager newManager = superManagerController.generateAndGetManagerAccount();
		assertNotNull(newManager);

		String password = newManager.getPassword();
		assertTrue(password.matches(".*[A-Z].*"), "Password should contain at least one uppercase letter");
		assertTrue(password.matches(".*[a-z].*"), "Password should contain at least one lowercase letter");
		assertTrue(password.matches(".*[0-9].*"), "Password should contain at least one number");
		assertTrue(password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"),
				"Password should contain at least one special character");
	}

	@Test
	void testManagerPasswordLength() {
		Manager newManager = superManagerController.generateAndGetManagerAccount();
		assertNotNull(newManager);
		String password = newManager.getPassword();

		// Test minimum length
		assertTrue(password.length() >= 12, "Password should be at least 12 characters long");

		// Test maximum length
		assertTrue(password.length() <= 15, "Password should be at most 15 characters long");
	}

	@Test
	void testManagerAccountUniqueness() {
		Manager manager1 = superManagerController.generateAndGetManagerAccount();
		Manager manager2 = superManagerController.generateAndGetManagerAccount();

		assertNotNull(manager1);
		assertNotNull(manager2);
		assertNotEquals(manager1.getEmail(), manager2.getEmail(), "Generated managers should have unique emails");
		assertNotEquals(manager1.getPassword(), manager2.getPassword(),
				"Generated managers should have unique passwords");
	}

	@Test
	void testGenerateManagerAccountWhenAdditionFails() {
		// Create a ManagerService with a repository that always fails to add managers
		ManagerRepository failingRepository = new ManagerRepository() {
			@Override
			public boolean addManager(Manager manager) {
				return false;
			}
		};
		ManagerService failingManagerService = new ManagerService(failingRepository);
		SuperManagerController controller = new SuperManagerController(failingManagerService);

		// Test that null is returned when manager addition fails
		Manager result = controller.generateAndGetManagerAccount();
		assertNull(result);
	}
}
