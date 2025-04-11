package manual.models.manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import models.manager.Manager;

public class ManagerTest {
	
	static Manager manager;
	
	@BeforeClass
	public static void beforeAllManagerTest() {
		 manager = new Manager("admin@example.com", "123");
	}
	
	@Test
    public void testGetEmail() {
        assertEquals("admin@example.com", manager.getEmail());
    }

    @Test
    public void testGetPassword() {
        assertEquals("123", manager.getPassword());
    }

    @Test
    public void testSuccessfulAuthentication() {
        assertTrue(manager.authenticate("admin@example.com", "123"));
    }

    @Test
    public void testAuthenticationFailsWithWrongEmail() {
        assertFalse(manager.authenticate("wrong@example.com", "123"));
    }

    @Test
    public void testAuthenticationFailsWithWrongPassword() {
        assertFalse(manager.authenticate("admin@example.com", "wrongpass"));
    }

    @Test
    public void testAuthenticationFailsWithBothWrong() {
        assertFalse(manager.authenticate("wrong@example.com", "wrongpass"));
    }

    @Test
    public void testEqualsSameEmail() {
        Manager other = new Manager("admin@example.com", "differentPass");
        assertEquals(manager, other);  // same email = equal
    }

    @Test
    public void testNotEqualsDifferentEmail() {
        Manager other = new Manager("other@example.com", "123");
        assertNotEquals(manager, other);
    }

    @Test
    public void testEqualsSameObject() {
        assertEquals(manager, manager); // identity check
    }

    @Test
    public void testHashCodeConsistencyWithEquals() {
        Manager other = new Manager("admin@example.com", "123456");
        assertEquals(manager.hashCode(), other.hashCode());
    }

}
