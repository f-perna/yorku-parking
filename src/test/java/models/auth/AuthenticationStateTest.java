package models.auth;

import models.client.Client;
import models.client.GenerateClientFactory;
import models.manager.Manager;
import models.superManager.SuperManager;
import models.user.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

public class AuthenticationStateTest {

    private AuthenticationState authState;
    private static Manager manager;
    private static Client client;
    private static SuperManager superManager;

    @BeforeEach
    void setUp() throws NoSuchFieldException, IllegalAccessException {
    	
    	// we are testing singleton too, this is how its generally done
       
        if (manager == null) {
            manager = new Manager("manager@example.com", "password");
        }
        if (client == null) {
            client = GenerateClientFactory.getClientType(
                "testingstudent ame", "student@gmail.com", "passworddhdwfkhfjkjdsk", Client.type.STUDENT, "ABC123", true
            );
        }
        if (superManager == null) {
            superManager = SuperManager.getInstance();
        }
        
        //Reseting the singleton objects to prevent tests from affecting each other.
        Field authStateInstanceField = AuthenticationState.class.getDeclaredField("instance");
        authStateInstanceField.setAccessible(true);
        authStateInstanceField.set(null, null);

        
        Field superManagerInstanceField = SuperManager.class.getDeclaredField("instance");
        superManagerInstanceField.setAccessible(true);
        superManagerInstanceField.set(null, null);

        authState = AuthenticationState.getInstance();
    }

    @Test
    void testGetInstanceReturnsSameInstance() {
        AuthenticationState instance1 = AuthenticationState.getInstance();
        AuthenticationState instance2 = AuthenticationState.getInstance();
        assertSame(instance1, instance2, "getInstance should return the same singleton instance");
    }

    @Test
    void testAddObserverNotifiesOnLogin() {
        final boolean[] lastAuthState = {false};
        AuthStateObserver observer = isLoggedIn -> lastAuthState[0] = isLoggedIn;

        authState.addObserver(observer);
        authState.setLoggedInUser(manager);
        assertTrue(lastAuthState[0], "Observer should be notified of login (true)");
    }

    @Test
    void testAddObserverNotifiesOnLogout() {
        final boolean[] lastAuthState = {false};
        AuthStateObserver observer = isLoggedIn -> lastAuthState[0] = isLoggedIn;

        authState.addObserver(observer);
        authState.setLoggedInUser(manager); // Login
        authState.setLoggedInUser(null); // Logout
        assertFalse(lastAuthState[0], "Observer should be notified of logout (false)");
    }

    @Test
    void testRemoveObserverDoesNotNotify() {
        final boolean[] lastAuthState = {false};
        AuthStateObserver observer = isLoggedIn -> lastAuthState[0] = isLoggedIn;

        authState.addObserver(observer);
        authState.removeObserver(observer);
        authState.setLoggedInUser(manager);
        assertFalse(lastAuthState[0], "Removed observer should not be notified");
    }

    @Test
    void testGetLoggedInUserWhenNoUser() {
        assertNull(authState.getLoggedInUser(), "getLoggedInUser should return null when no user is logged in");
    }

    @Test
    void testSetLoggedInUserAndGetLoggedInUser() {
        authState.setLoggedInUser(manager);
        assertSame(manager, authState.getLoggedInUser(), "getLoggedInUser should return the set user");
    }

    @Test
    void testIsLoggedInWhenNoUser() {
        assertFalse(authState.isLoggedIn(), "isLoggedIn should return false when no user is logged in");
    }

    @Test
    void testIsLoggedInWhenUserLoggedIn() {
        authState.setLoggedInUser(manager);
        assertTrue(authState.isLoggedIn(), "isLoggedIn should return true when a user is logged in");
    }

    @Test
    void testIsClientLoggedInWhenNoUser() {
        assertFalse(authState.isClientLoggedIn(), "isClientLoggedIn should return false when no user is logged in");
    }

    @Test
    void testIsClientLoggedInWhenClientLoggedIn() {
        authState.setLoggedInUser(client);
        assertTrue(authState.isClientLoggedIn(), "isClientLoggedIn should return true when a Client is logged in");
    }

    @Test
    void testIsClientLoggedInWhenManagerLoggedIn() {
        authState.setLoggedInUser(manager);
        assertFalse(authState.isClientLoggedIn(), "isClientLoggedIn should return false when a Manager is logged in");
    }

    @Test
    void testIsManagerLoggedInWhenNoUser() {
        assertFalse(authState.isManagerLoggedIn(), "isManagerLoggedIn should return false when no user is logged in");
    }

    @Test
    void testIsManagerLoggedInWhenManagerLoggedIn() {
        authState.setLoggedInUser(manager);
        assertTrue(authState.isManagerLoggedIn(), "isManagerLoggedIn should return true when a Manager is logged in");
    }

    @Test
    void testIsManagerLoggedInWhenClientLoggedIn() {
        authState.setLoggedInUser(client);
        assertFalse(authState.isManagerLoggedIn(), "isManagerLoggedIn should return false when a Client is logged in");
    }

    @Test
    void testIsSuperManagerLoggedInWhenNoUser() {
        assertFalse(authState.isSuperManagerLoggedIn(), "isSuperManagerLoggedIn should return false when no user is logged in");
    }

    @Test
    void testIsSuperManagerLoggedInWhenSuperManagerLoggedIn() {
        authState.setLoggedInUser(superManager);
        assertTrue(authState.isSuperManagerLoggedIn(), "isSuperManagerLoggedIn should return true when a SuperManager is logged in");
    }

    @Test
    void testIsSuperManagerLoggedInWhenManagerLoggedIn() {
        authState.setLoggedInUser(manager);
        assertFalse(authState.isSuperManagerLoggedIn(), "isSuperManagerLoggedIn should return false when a Manager is logged in");
    }

    @Test
    void testGetLoggedInClientWhenNoUser() {
        assertNull(authState.getLoggedInClient(), "getLoggedInClient should return null when no user is logged in");
    }

    @Test
    void testGetLoggedInClientWhenClientLoggedIn() {
        authState.setLoggedInUser(client);
        assertSame(client, authState.getLoggedInClient(), "getLoggedInClient should return the logged-in Client");
    }

    @Test
    void testGetLoggedInClientWhenManagerLoggedIn() {
        authState.setLoggedInUser(manager);
        assertNull(authState.getLoggedInClient(), "getLoggedInClient should return null when a Manager is logged in");
    }

    @Test
    void testGetLoggedInManagerWhenNoUser() {
        assertNull(authState.getLoggedInManager(), "getLoggedInManager should return null when no user is logged in");
    }

    @Test
    void testGetLoggedInManagerWhenManagerLoggedIn() {
        authState.setLoggedInUser(manager);
        assertSame(manager, authState.getLoggedInManager(), "getLoggedInManager should return the logged-in Manager");
    }

    @Test
    void testGetLoggedInManagerWhenClientLoggedIn() {
        authState.setLoggedInUser(client);
        assertNull(authState.getLoggedInManager(), "getLoggedInManager should return null when a Client is logged in");
    }

    @Test
    void testGetLoggedInSuperManagerWhenNoUser() {
        assertNull(authState.getLoggedInSuperManager(), "getLoggedInSuperManager should return null when no user is logged in");
    }

    @Test
    void testGetLoggedInSuperManagerWhenSuperManagerLoggedIn() {
        authState.setLoggedInUser(superManager);
        assertSame(superManager, authState.getLoggedInSuperManager(), "getLoggedInSuperManager should return the logged-in SuperManager");
    }

    @Test
    void testGetLoggedInSuperManagerWhenManagerLoggedIn() {
        authState.setLoggedInUser(manager);
        assertNull(authState.getLoggedInSuperManager(), "getLoggedInSuperManager should return null when a Manager is logged in");
    }

    @Test
    void testMultipleObserversNotified() {
        final boolean[] lastAuthState1 = {false};
        final boolean[] lastAuthState2 = {false};
        AuthStateObserver observer1 = isLoggedIn -> lastAuthState1[0] = isLoggedIn;
        AuthStateObserver observer2 = isLoggedIn -> lastAuthState2[0] = isLoggedIn;

        authState.addObserver(observer1);
        authState.addObserver(observer2);
        authState.setLoggedInUser(manager);
        assertTrue(lastAuthState1[0], "First observer should be notified of login");
        assertTrue(lastAuthState2[0], "Second observer should be notified of login");
    }
}