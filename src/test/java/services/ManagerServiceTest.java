package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.manager.Manager;
import models.superManager.SuperManager;
import repositories.ManagerRepository;

public class ManagerServiceTest {
	private ManagerRepository managerRepository;
	private ManagerService managerService;
	private SuperManagerService superManagerService;
	private AuthenticationState authState;
	private SuperManager superManager;
	
	@Before
	public void beforeManagerServiceTest() {
		managerRepository = new ManagerRepository();
		managerService = new ManagerService(managerRepository);
		superManagerService = new SuperManagerService();
		authState = AuthenticationState.getInstance();
		
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);
	}
	
	@Test
	public void verifyManagerLogin() {
		Manager testManager = managerService.generateAndGetManagerAccount();
		
		Boolean login = managerService.login(testManager.getEmail(), testManager.getPassword());
		
		assertTrue(login);
		
		authState.setLoggedInUser(superManager);
		
		managerService.removeManager(testManager.getEmail());
		
	}
	
	@Test
	public void verifyInvalidManagerLogin() {
		Manager testManager = managerService.generateAndGetManagerAccount();
		
		Boolean login = managerService.login(testManager.getEmail()+"bad", testManager.getPassword());
		
		assertFalse(login);
		
		managerService.removeManager(testManager.getEmail());
		
	}
	
	@Test
	public void verifySuperManagerLogin() {
		Boolean login = superManagerService.login("superadmin", "Super@dmin123!");
		
		assertTrue(login);
	}
	
	@Test
	public void verifyInvalidSuperManagerLogin() {
		Boolean login = superManagerService.login("superadminbad", "Super@dmin123!");
		
		assertFalse(login);
	}
	
	@Test
	public void verifyRemoveManager() {
		Manager testManager = managerService.generateAndGetManagerAccount();
		
		Boolean removed = managerService.removeManager(testManager.getEmail());
		
		assertTrue(removed);
		
	}
	
	@Test
	public void verifyInvalidRemoveManager() {
		Manager testManager = managerService.generateAndGetManagerAccount();
		
		Boolean login = managerService.login(testManager.getEmail(), testManager.getPassword());
		
		assertTrue(login);
		
		try {
			managerService.removeManager(testManager.getEmail());
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Only super managers can add new managers", e.getMessage());
	    }
		
		
		authState.setLoggedInUser(superManager);
		
		managerService.removeManager(testManager.getEmail());
		
	}
	
	@Test
	public void verifyGetManagers() {
		List<Manager> managers = managerService.getAllManagers();
		int size = managers.size();
		
		Manager testManager = managerService.generateAndGetManagerAccount();
		
		assertEquals(size+1, managerService.getAllManagers().size());
		
		managerService.removeManager(testManager.getEmail());
		
	}
	
}
