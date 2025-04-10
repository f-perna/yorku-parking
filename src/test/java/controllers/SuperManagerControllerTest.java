package controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.manager.Manager;
import repositories.ManagerRepository;
import services.ManagerService;
import services.SuperManagerService;
import csv.ManagerCSVProcessor;

public class SuperManagerControllerTest {
    private SuperManagerController superManagerController;
    private ManagerService managerService;
    private SuperManagerService superManagerService;
    private AuthController authController;
    private String testManagersFilePath;

    @TempDir
    File tempDir;

    @BeforeEach
    void setUp() throws IOException {
        testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";
        ManagerCSVProcessor.initializeTestFile(testManagersFilePath);

        ManagerRepository managerRepository = new ManagerRepository();
        managerService = new ManagerService(managerRepository);
        superManagerController = new SuperManagerController(managerService);

        superManagerService = new SuperManagerService();
        authController = new AuthController(null, managerService, superManagerService);

        String superEmail = "superadmin@parking.yorku.ca";
        String superPassword = "Super@dmin123!";
        authController.login(superEmail, superPassword, models.user.UserType.SUPER_MANAGER);
    }

    @AfterEach
    void tearDown() {
        ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);
        if (authController.isLoggedIn()) {
            authController.logout();
        }
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
        Manager newManager = superManagerController.generateAndGetManagerAccount();
        assertNotNull(newManager);

        boolean removeResult = superManagerController.removeManager(newManager.getEmail());
        assertTrue(removeResult);

        List<Manager> managers = superManagerController.getAllManagers();
        assertTrue(!managers.contains(newManager));
    }

    @Test
    void testRemoveManagerWithNullEmail() {
        ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> {
            superManagerController.removeManager(null);
        });
        assertEquals("Email cannot be null", exception.getMessage());
        assertEquals(ErrorType.VALIDATION, exception.getErrorType());
    }

    @Test
    void testRemoveNonExistentManager() {
        boolean removeResult = superManagerController.removeManager("nonexistent@example.com");
        assertTrue(!removeResult);
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

        ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> {
            superManagerController.generateAndGetManagerAccount();
        });
        assertEquals("Only super managers can add new managers", exception.getMessage());
        assertEquals(ErrorType.AUTHORIZATION, exception.getErrorType());
    }

    @Test
    void testRemoveManagerWithoutSuperManagerLogin() {
        Manager newManager = superManagerController.generateAndGetManagerAccount();
        assertNotNull(newManager);

        authController.logout();

        ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> {
            superManagerController.removeManager(newManager.getEmail());
        });
        assertEquals("Only super managers can add new managers", exception.getMessage());
        assertEquals(ErrorType.AUTHORIZATION, exception.getErrorType());
    }

    @Test
    void testGetAllManagersWithoutSuperManagerLogin() {
        authController.logout();

        ParkingSystemException exception = assertThrows(ParkingSystemException.class, () -> {
            superManagerController.getAllManagers();
        });
        assertEquals("Only super managers can add new managers", exception.getMessage());
        assertEquals(ErrorType.AUTHORIZATION, exception.getErrorType());
    }

    @Test
    void testManagerPasswordValidation() {
        Manager newManager = superManagerController.generateAndGetManagerAccount();
        assertNotNull(newManager);

        String password = newManager.getPassword();
        assertTrue(password.length() >= 8, "Password should be at least 8 characters long");
        assertTrue(password.matches(".*[A-Z].*"), "Password should contain at least one uppercase letter");
        assertTrue(password.matches(".*[a-z].*"), "Password should contain at least one lowercase letter");
        assertTrue(password.matches(".*[0-9].*"), "Password should contain at least one number");
        assertTrue(password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"),
                "Password should contain at least one special character");
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

}
