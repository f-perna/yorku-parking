package manual.csvs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import csvs.ManagerCSVProcessor;
import models.manager.Manager;

public class ManagerCSVProcessorTest {
    private static final String TEST_FILE_PATH = "data/test_managers.csv";
    private List<Manager> testManagers;

    @BeforeEach
    void setUp() throws IOException {
        ManagerCSVProcessor.initializeTestFile(TEST_FILE_PATH);
        testManagers = new ArrayList<>();

        // Create test managers
        Manager manager1 = new Manager("admin@example.com", "admin123");
        Manager manager2 = new Manager("supervisor@example.com", "supervisor456");

        testManagers.add(manager1);
        testManagers.add(manager2);
    }

    @AfterEach
    void tearDown() {
        ManagerCSVProcessor.cleanupAndReset(TEST_FILE_PATH);
    }

    @Test
    void testWriteAndReadManagers() {
        // Write managers to file
        ManagerCSVProcessor.setManagerData(testManagers);

        // Read managers from file
        List<Manager> readManagers = ManagerCSVProcessor.readManagerData();

        // Verify the number of managers
        assertEquals(2, readManagers.size());

        // Verify first manager
        Manager firstManager = readManagers.get(0);
        assertEquals("admin@example.com", firstManager.getEmail());
        assertEquals("admin123", firstManager.getPassword());

        // Verify second manager
        Manager secondManager = readManagers.get(1);
        assertEquals("supervisor@example.com", secondManager.getEmail());
        assertEquals("supervisor456", secondManager.getPassword());
    }

    @Test
    void testReadEmptyFile() {
        List<Manager> managers = ManagerCSVProcessor.readManagerData();
        assertTrue(managers.isEmpty());
    }

    @Test
    void testWriteEmptyList() {
        ManagerCSVProcessor.setManagerData(new ArrayList<>());
        List<Manager> managers = ManagerCSVProcessor.readManagerData();
        assertTrue(managers.isEmpty());
    }

    @Test
    void testInvalidDataHandling() throws IOException {
        // Write invalid data directly to the file
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
            writer.write("email,password\n");
            writer.write("invalid-email\n"); // Missing password
        }

        // Reading should handle invalid data gracefully
        List<Manager> managers = ManagerCSVProcessor.readManagerData();
        assertTrue(managers.isEmpty());
    }
}