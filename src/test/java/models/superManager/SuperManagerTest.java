package models.superManager;

import models.superManager.SuperManager;
import models.user.User;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class SuperManagerTest {

    @Before
    public void resetSingleton() throws SecurityException, NoSuchFieldException,IllegalArgumentException, IllegalAccessException {
        Field instance = SuperManager.class.getDeclaredField("instance");
        instance.setAccessible(true);
        instance.set(null, null);
    }

    @Test
    public void testSingletonInstance() {
        
        SuperManager instance1 = SuperManager.getInstance();
        SuperManager instance2 = SuperManager.getInstance();
        assertNotNull(instance1);
        assertSame("Should return same instance", instance1, instance2);
    }

    @Test
    public void testDefaultCredentials() {
        SuperManager manager = SuperManager.getInstance();
        assertEquals("Email should be superadmin", "superadmin", manager.getEmail());
        assertEquals("Password should be something like Super@dmin123!", "Super@dmin123!", 
                    manager.getPassword());
    }

    @Test
    public void testAuthenticationSuccess() {
        SuperManager manager = SuperManager.getInstance();
        boolean authenticated = manager.authenticate("superadmin", "Super@dmin123!");
        assertTrue("Authentication should succeed with correct credentials", 
                  authenticated);
    }

    @Test
    public void testAuthenticationFailureWrongPassword() {
        SuperManager manager = SuperManager.getInstance();
        boolean authenticated = manager.authenticate("superadmin", "wrongpassword");
        assertFalse("Authentication should fail with wrong password", 
                   authenticated);
    }

    @Test
    public void testAuthenticationFailureWrongEmail() {
        SuperManager manager = SuperManager.getInstance();
        boolean authenticated = manager.authenticate("wrongemail", "Super@dmin123!");
        assertFalse("Authentication should fail with wrong email", 
                   authenticated);
    }

    @Test
    public void testUserInterfaceImplementation() {
        SuperManager manager = SuperManager.getInstance();
        
       
        assertTrue("SuperManager should implement User interface", 
                  manager instanceof User);
        assertNotNull("getEmail should return non-null", manager.getEmail());
        assertNotNull("getPassword should return non-null", manager.getPassword());
    }

    @Test
    public void testThreadSafety() throws InterruptedException {
        SuperManager[] instances = new SuperManager[2];
        Thread[] threads = new Thread[2];

        // Creating two threads that try to get the instance simultaneously
        for (int i = 0; i < 2; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                instances[index] = SuperManager.getInstance();
            });
            threads[i].start();
        }

        // Wait for other threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        // Making sure that both threads got the same instance
        assertSame("Multiple threads should get same instance", 
                  instances[0], instances[1]);
    }
}
