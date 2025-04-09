package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.auth.AuthenticationState;
import models.client.Client;
import models.manager.Manager;
import repositories.ClientRepository;
import services.factory.ServiceFactory;

public class ClientServiceTest {
	private ServiceFactory serviceFactory;
	
	@Before
	public void beforeClientServiceTest() {
		serviceFactory = ServiceFactory.getInstance();
	}
	
	
	@Test
	public void veifyRegister() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		
		assertTrue(register);
		
		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}
	
	@Test
	public void veifyInvalidNameRegister() {
		try {
			serviceFactory.getClientService().registerClient("","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Name cannot be empty", e.getMessage());
	    }
	}
	
	@Test
	public void veifyInvalidEmailRegister() {
		try {
			serviceFactory.getClientService().registerClient("Bob","", "ABc123!!", Client.type.STUDENT, "ABC 123");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Invalid email format", e.getMessage());
	    }
	}
	
	@Test
	public void veifyInvalidPasswordRegister() {
	    try {
	    	serviceFactory.getClientService().registerClient("Bob","testpassword@gmail.com", "123", Client.type.STUDENT, "ABC 123");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Password must include uppercase, lowercase, number and symbol (min 8 chars)", e.getMessage());
	    }
	}
	
	@Test
	public void veifyInvalidPlateRegister() {
	    try {
	    	serviceFactory.getClientService().registerClient("Bob","testpassword@gmail.com", "ABc123!!", Client.type.STUDENT, "1");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Licence plate must be 2-8 uppercase letters, numbers, or spaces", e.getMessage());
	    }
	}
	
	@Test
	public void veifyDuplicateEmailRegister() {
		serviceFactory.getClientService().registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		
	    try {
	    	serviceFactory.getClientService().registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Email address is already registered in the system", e.getMessage());
	    }
	    
	    serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}
	
	@Test
	public void veifyLogin() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		
		assertTrue(register);
		
		Boolean login = serviceFactory.getClientService().login("testregister@gmail.com", "ABc123!!");
		
		assertTrue(login);
		
		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}
	
	@Test
	public void veifyInvalidLogin() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		
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
	public void veifyApprovalException() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		
		assertTrue(register);
		
		try {
			serviceFactory.getClientService().login("testregister@gmail.com", "ABc123!!");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.", e.getMessage());
	    }
		
		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}
	
	@Test
	public void veifyLoockupEmail() {
		Boolean register = serviceFactory.getClientService().registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		
		assertTrue(register);
		
		Boolean login = serviceFactory.getClientService().login("testregister@gmail.com", "ABc123!!");
		
		assertTrue(login);
		
		assertEquals(serviceFactory.getClientService().getClientByEmail("testregister@gmail.com"), serviceFactory.getClientService().getClientByEmail("testregister@gmail.com"));
		
		serviceFactory.getClientService().removeClient("testregister@gmail.com");
	}
}
