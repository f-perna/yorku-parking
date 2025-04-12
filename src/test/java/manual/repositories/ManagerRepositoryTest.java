package manual.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import models.manager.Manager;
import repositories.ManagerRepository;

public class ManagerRepositoryTest extends BaseRepositoryTest {
	private ManagerRepository managerRepository;

	@BeforeEach
	protected void setUp() throws IOException {
		super.setUp();
		initializeRepositories();
	}

	private void initializeRepositories() {
		managerRepository = repositoryFactory.getManagerRepository();
	}

	@AfterEach
	protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
		this.managerRepository = null;
		super.tearDown();
	}

	@Test
	public void verifyAddManager() {
		Manager testManager = new Manager("test@manager.com", "123");
		Boolean addedManager = managerRepository.addManager(testManager);
		assertTrue(addedManager);
		managerRepository.removeManager("test@manager.com");
	}

	@Test
	public void verifyAddInvalidManager() {
		Manager testManager = null;
		Boolean addedManager = managerRepository.addManager(testManager);
		assertFalse(addedManager);
	}

	@Test
	public void verifyRemoveManager() {
		Manager testManager = new Manager("test@manager.com", "123");
		managerRepository.addManager(testManager);
		Boolean removedManager = managerRepository.removeManager("test@manager.com");
		assertTrue(removedManager);
	}

	@Test
	public void verifyRemoveInvalidManager() {
		Boolean removedManager = managerRepository.removeManager("test@manager.com");
		assertFalse(removedManager);
	}

	@Test
	public void verifyGetManager() {
		Manager testManager = new Manager("test@manager.com", "123");
		Boolean addedManager = managerRepository.addManager(testManager);
		assertTrue(addedManager);

		Manager getManager = managerRepository.getManagerByEmail("test@manager.com");

		assertEquals(testManager, getManager);

		managerRepository.removeManager("test@manager.com");
	}

	@Test
	public void verifyGetManagerNullEmail() {
		Manager getManager = managerRepository.getManagerByEmail(null);
		assertNull(getManager);
	}

	@Test
	public void verifyGetManagerInvalidEmail() {
		Manager getManager = managerRepository.getManagerByEmail("test@manager.com");
		assertNull(getManager);
	}

	@Test
	public void verifyAuthenticateManager() {
		Manager testManager = new Manager("test@manager.com", "123");
		Boolean addedManager = managerRepository.addManager(testManager);
		assertTrue(addedManager);

		Manager authManager = managerRepository.authenticateManager("test@manager.com", "123");

		assertEquals(testManager, authManager);

		managerRepository.removeManager("test@manager.com");
	}

	@Test
	public void verifyNullAuthenticateManager() {
		Manager authManager = managerRepository.authenticateManager(null, null);
		assertNull(authManager);
	}

	@Test
	public void verifyInvalidAuthenticateManager() {
		Manager authManager = managerRepository.authenticateManager("test@manager.com", "123");
		assertNull(authManager);
	}
}
