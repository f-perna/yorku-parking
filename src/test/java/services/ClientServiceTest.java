package services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import models.ParkingSystemException;
import models.client.Client;
import repositories.ClientRepository;

public class ClientServiceTest {
	private ClientRepository clientRepository;
	private ClientService clientService;
	
	@Before
	public void beforeClientServiceTest() {
		clientRepository = new ClientRepository();
		clientService = new ClientService(clientRepository);
	}
	
	
	@Test
	public void veifyRegister() {
		Boolean register = clientService.registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		
		assertTrue(register);
		
		clientRepository.deleteClient(clientRepository.getClientByEmail("testregister@gmail.com"));
	}
	
	@Test
	public void veifyInvalidNameRegister() {
		try {
			clientService.registerClient("","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Name cannot be empty", e.getMessage());
	    }
	}
	
	@Test
	public void veifyInvalidEmailRegister() {
		try {
			clientService.registerClient("Bob","", "ABc123!!", Client.type.STUDENT, "ABC 123");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Invalid email format", e.getMessage());
	    }
	}
	
	@Test
	public void veifyInvalidPasswordRegister() {
	    try {
	    	clientService.registerClient("Bob","testpassword@gmail.com", "123", Client.type.STUDENT, "ABC 123");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Password must include uppercase, lowercase, number and symbol (min 8 chars)", e.getMessage());
	    }
	}
	
	@Test
	public void veifyInvalidPlateRegister() {
	    try {
	    	clientService.registerClient("Bob","testpassword@gmail.com", "ABc123!!", Client.type.STUDENT, "1");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Licence plate must be 2-8 uppercase letters, numbers, or spaces", e.getMessage());
	    }
	}
	
	@Test
	public void veifyDuplicateEmailRegister() {
		clientService.registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		
	    try {
	    	clientService.registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Email address is already registered in the system", e.getMessage());
	    }
	    
	    clientRepository.deleteClient(clientRepository.getClientByEmail("testregister@gmail.com"));
	}
	
	@Test
	public void veifyLogin() {
		Boolean register = clientService.registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		
		assertTrue(register);
		
		Boolean login = clientService.login("testregister@gmail.com", "ABc123!!");
		
		assertTrue(login);
		
		clientRepository.deleteClient(clientRepository.getClientByEmail("testregister@gmail.com"));
	}
	
	@Test
	public void veifyInvalidLogin() {
		Boolean register = clientService.registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		
		assertTrue(register);
		
		try {
			clientService.login("testregisterbad@gmail.com", "ABc123!!");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Invalid email address or password", e.getMessage());
	    }
		
		clientRepository.deleteClient(clientRepository.getClientByEmail("testregister@gmail.com"));
	}
	
	@Test
	public void veifyApprovalException() {
		Boolean register = clientService.registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.STUDENT, "ABC 123");
		
		assertTrue(register);
		
		try {
	    	clientService.login("testregister@gmail.com", "ABc123!!");
	        fail("Expected ParkingSystemException");
	    } catch (ParkingSystemException e) {
	        assertEquals("Your account is pending approval by a manager. Please wait for approval to access the system.", e.getMessage());
	    }
		
		clientRepository.deleteClient(clientRepository.getClientByEmail("testregister@gmail.com"));
	}
	
	@Test
	public void veifyLoockupEmail() {
		Boolean register = clientService.registerClient("Bob","testregister@gmail.com", "ABc123!!", Client.type.VISITOR, "ABC 123");
		
		assertTrue(register);
		
		Boolean login = clientService.login("testregister@gmail.com", "ABc123!!");
		
		assertTrue(login);
		
		assertEquals(clientRepository.getClientByEmail("testregister@gmail.com"), clientService.getClientByEmail("testregister@gmail.com"));
		
		clientRepository.deleteClient(clientRepository.getClientByEmail("testregister@gmail.com"));
	}
	

}
