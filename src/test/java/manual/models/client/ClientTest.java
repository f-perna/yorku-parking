package manual.models.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import models.client.Client;
import models.client.GenerateClientFactory;

public class ClientTest {
	
	static Client client;
	
	@BeforeClass
	public static void beforeAllClientTest() {
		client = GenerateClientFactory.getClientType("Bob", "bob@gmail.com", "1234", Client.type.STUDENT, "ABC 123", false);
		assertNotNull(client);
	}
	
	@Test
	public void createClient() {
		assertNotNull(client);
	}
	
	@Test
	public void verifyAuthentication() {
		Boolean authenticated = client.authenticate("bob@gmail.com", "1234");
		
		assertTrue(authenticated);
	}
	
	@Test
	public void verifyApprovedStatus() {
		assertFalse(client.isApproved());
		
		client.setApproved(true);
		
		assertTrue(client.isApproved());
	}
	
	@Test
	public void testGetters() {
	    assertEquals("Bob", client.getName());
	    assertEquals("bob@gmail.com", client.getEmail());
	    assertEquals("1234", client.getPassword());
	    assertEquals("ABC 123", client.getLicencePlate());
	    assertEquals(Client.type.STUDENT, client.getType());
	}
	
	@Test
	public void testEqualsAndHashCode() {
	    Client client2 = GenerateClientFactory.getClientType("Bob", "bob@gmail.com", "1234", Client.type.STUDENT, "XYZ 999", true);
	    Client client3 = GenerateClientFactory.getClientType("Alice", "alice@gmail.com", "5678", Client.type.FACULTY, "DEF 456", true);

	    assertEquals(client, client2); // same email
	    assertEquals(client.hashCode(), client2.hashCode());

	    assertNotEquals(client, client3);
	    assertNotEquals(client.hashCode(), client3.hashCode());
	}
	
	@Test
	public void testAuthenticationFailsWithWrongEmail() {
	    assertFalse(client.authenticate("notbob@gmail.com", "1234"));
	}
	
	@Test
	public void testAuthenticationFailsWithWrongPassword() {
	    assertFalse(client.authenticate("bob@gmail.com", "12345"));
	}
	
	@Test
	public void testClientTypes() {
		Client visitor = GenerateClientFactory.getClientType("Bob", "bob1@gmail.com", "1234", Client.type.VISITOR, "XYZ 999", true);
		assertEquals(Client.type.VISITOR, visitor.getType());
		
		Client faculty = GenerateClientFactory.getClientType("Bob", "bob2@gmail.com", "1234", Client.type.FACULTY, "XYZ 999", true);
		assertEquals(Client.type.FACULTY, faculty.getType());
		
		Client nonFaculty = GenerateClientFactory.getClientType("Bob", "bob3@gmail.com", "1234", Client.type.NON_FACULTY, "XYZ 999", true);
		assertEquals(Client.type.NON_FACULTY, nonFaculty.getType());
	}
	
	@Test
	public void testClientRates() {
		assertEquals(5.0, client.getRate(), 0.1);
		
		Client visitor = GenerateClientFactory.getClientType("Bob", "bob1@gmail.com", "1234", Client.type.VISITOR, "XYZ 999", true);
		assertEquals(15.0, visitor.getRate(), 0.1);
		
		Client faculty = GenerateClientFactory.getClientType("Bob", "bob2@gmail.com", "1234", Client.type.FACULTY, "XYZ 999", true);
		assertEquals(8.0, faculty.getRate(), 0.1);
		
		Client nonFaculty = GenerateClientFactory.getClientType("Bob", "bob3@gmail.com", "1234", Client.type.NON_FACULTY, "XYZ 999", true);
		assertEquals(10.0, nonFaculty.getRate(), 0.1);
	}
	
	@Test
	public void testComparison() {
		Client student = GenerateClientFactory.getClientType("Bob", "bob@gmail.com", "1234", Client.type.STUDENT, "ABC 123", false);
		
		assertTrue(client.equals(student));
	}
}
