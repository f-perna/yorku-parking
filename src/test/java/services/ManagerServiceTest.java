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
import services.factory.ServiceFactory;

public class ManagerServiceTest {
	private AuthenticationState authState;
	private SuperManager superManager;
	private ServiceFactory serviceFactory;
	
	@Before
	public void beforeManagerServiceTest() {
		serviceFactory = ServiceFactory.getInstance();
		authState = AuthenticationState.getInstance();
		
		superManager = SuperManager.getInstance();
		authState.setLoggedInUser(superManager);
	}
	
	@Test
	public void verifyManagerLogin() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		
		Boolean login = serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
		
		assertTrue(login);
		
		authState.setLoggedInUser(superManager);
		
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
		
	}
	
	@Test
	public void verifyInvalidAutoGenerateManagerAccount() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		
		Boolean login = serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
		
		assertTrue(login);
		
		try {
			serviceFactory.getManagerService().generateAndGetManagerAccount();
		} catch (ParkingSystemException e) {
			assertEquals("Only super managers can add new managers", e.getMessage());
		}
		
		authState.setLoggedInUser(superManager);
		
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
		
	}
	
	@Test
	public void verifyInvalidManagerLoginEmail() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		
		Boolean login = serviceFactory.getManagerService().login(testManager.getEmail()+"bad", testManager.getPassword());
		
		assertFalse(login);
		
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
		
	}
	
	@Test
	public void verifyInvalidManagerLoginPassword() {
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		
		Boolean login = serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword()+"bad");
		
		assertFalse(login);
		
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
		
	}
	
	@Test
	public void verifySuperManagerLogin() {
		Boolean login = serviceFactory.getSuperManagerService().login("superadmin", "Super@dmin123!");
		
		assertTrue(login);
	}
	
	@Test
	public void verifyInvalidSuperManagerLoginEmail() {
		Boolean login = serviceFactory.getManagerService().login("superadminbad", "Super@dmin123!");
		
		assertFalse(login);
	}
	
	@Test
	public void verifyInvalidSuperManagerLoginPassword() {
		Boolean login = serviceFactory.getManagerService().login("superadmin", "Super@dmin123!bad");
		
		assertFalse(login);
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
		
		Boolean login = serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
		
		assertTrue(login);
		
		try {
			serviceFactory.getManagerService().removeManager(testManager.getEmail());
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Only super managers can add new managers", e.getMessage());
	    }
		
		
		authState.setLoggedInUser(superManager);
		
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
		
	}
	
	@Test
	public void verifyGetManagers() {
		List<Manager> managers = serviceFactory.getManagerService().getAllManagers();
		int size = managers.size();
		
		Manager testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
		
		assertEquals(size+1, serviceFactory.getManagerService().getAllManagers().size());
		
		serviceFactory.getManagerService().removeManager(testManager.getEmail());
		
	}
	
}
