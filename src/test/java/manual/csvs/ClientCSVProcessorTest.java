package manual.csvs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import csvs.ClientCSVProcessor;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.client.Client.type;

public class ClientCSVProcessorTest {
    private static final String TEST_FILE_PATH = "data/test_clients.csv";
    private List<Client> testClients;

    @BeforeEach
    void setUp() throws IOException {
        ClientCSVProcessor.initializeTestFile(TEST_FILE_PATH);
        testClients = new ArrayList<>();

        // Create test clients with different types and statuses
        Client client1 = GenerateClientFactory.getClientType(
                "John Doe",
                "john@example.com",
                "password123",
                type.STUDENT,
                "ABC123",
                true);

        Client client2 = GenerateClientFactory.getClientType(
                "Jane Smith",
                "jane@example.com",
                "password456",
                type.FACULTY,
                "XYZ789",
                false);

        Client client3 = GenerateClientFactory.getClientType(
                "Bob Wilson",
                "bob@example.com",
                "password789",
                type.NON_FACULTY,
                "DEF456",
                true);

        Client client4 = GenerateClientFactory.getClientType(
                "Alice Brown",
                "alice@example.com",
                "password012",
                type.VISITOR,
                "GHI789",
                false);

        testClients.add(client1);
        testClients.add(client2);
        testClients.add(client3);
        testClients.add(client4);
    }

    @AfterEach
    void tearDown() {
        ClientCSVProcessor.cleanupAndReset(TEST_FILE_PATH);
    }

    @Test
    void testWriteAndReadClients() {
        // Write clients to file
        ClientCSVProcessor.setClientData(testClients);

        // Read clients from file
        List<Client> readClients = ClientCSVProcessor.readClientData();

        // Verify the number of clients
        assertEquals(4, readClients.size());

        // Verify first client
        Client firstClient = readClients.get(0);
        assertEquals("John Doe", firstClient.getName());
        assertEquals("john@example.com", firstClient.getEmail());
        assertEquals("password123", firstClient.getPassword());
        assertEquals("ABC123", firstClient.getLicencePlate());
        assertEquals(type.STUDENT, firstClient.getType());
        assertTrue(firstClient.isApproved());

        // Verify second client
        Client secondClient = readClients.get(1);
        assertEquals("Jane Smith", secondClient.getName());
        assertEquals("jane@example.com", secondClient.getEmail());
        assertEquals("password456", secondClient.getPassword());
        assertEquals("XYZ789", secondClient.getLicencePlate());
        assertEquals(type.FACULTY, secondClient.getType());
        assertFalse(secondClient.isApproved());
    }

    @Test
    void testReadEmptyFile() {
        List<Client> clients = ClientCSVProcessor.readClientData();
        assertTrue(clients.isEmpty());
    }

    @Test
    void testWriteEmptyList() {
        ClientCSVProcessor.setClientData(new ArrayList<>());
        List<Client> clients = ClientCSVProcessor.readClientData();
        assertTrue(clients.isEmpty());
    }

    @Test
    void testInvalidDataHandling() throws IOException {
        // Write invalid data directly to the file
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
            writer.write("name,email,password,licencePlate,type,approved\n");
            writer.write("Invalid Name,invalid-email,short,123,INVALID_TYPE,true\n");
        }

        // Reading should handle invalid data gracefully
        List<Client> clients = ClientCSVProcessor.readClientData();
        assertTrue(clients.isEmpty());
    }

    @Test
    void testInvalidEmailFormat() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
            writer.write("name,email,password,licencePlate,type,approved\n");
            writer.write("John Doe,invalid-email,password123,ABC123,STUDENT,true\n");
        }

        List<Client> clients = ClientCSVProcessor.readClientData();
        assertTrue(clients.isEmpty());
    }

    @Test
    void testInvalidPasswordLength() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
            writer.write("name,email,password,licencePlate,type,approved\n");
            writer.write("John Doe,john@example.com,short,ABC123,STUDENT,true\n");
        }

        List<Client> clients = ClientCSVProcessor.readClientData();
        assertTrue(clients.isEmpty());
    }

    @Test
    void testInvalidLicencePlateFormat() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
            writer.write("name,email,password,licencePlate,type,approved\n");
            writer.write("John Doe,john@example.com,password123,123456789,STUDENT,true\n");
        }

        List<Client> clients = ClientCSVProcessor.readClientData();
        assertTrue(clients.isEmpty());
    }

    @Test
    void testMissingFields() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
            writer.write("name,email,password,licencePlate,type,approved\n");
            writer.write("John Doe,john@example.com,password123,ABC123\n");
        }

        List<Client> clients = ClientCSVProcessor.readClientData();
        assertTrue(clients.isEmpty());
    }

    @Test
    void testNullValues() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_FILE_PATH)) {
            writer.write("name,email,password,licencePlate,type,approved\n");
            writer.write(",,,ABC123,STUDENT,true\n");
        }

        List<Client> clients = ClientCSVProcessor.readClientData();
        assertTrue(clients.isEmpty());
    }

    @Test
    void testSpecialCharactersInName() {
        Client client = GenerateClientFactory.getClientType(
                "John O'Connor",
                "john@example.com",
                "password123",
                type.STUDENT,
                "ABC123",
                true);

        List<Client> clients = new ArrayList<>();
        clients.add(client);
        ClientCSVProcessor.setClientData(clients);

        List<Client> readClients = ClientCSVProcessor.readClientData();
        assertEquals(1, readClients.size());
        assertEquals("John O'Connor", readClients.get(0).getName());
    }

    @Test
    void testMixedCaseEmail() {
        Client client = GenerateClientFactory.getClientType(
                "John Doe",
                "John.Doe@Example.com",
                "password123",
                type.STUDENT,
                "ABC123",
                true);

        List<Client> clients = new ArrayList<>();
        clients.add(client);
        ClientCSVProcessor.setClientData(clients);

        List<Client> readClients = ClientCSVProcessor.readClientData();
        assertEquals(1, readClients.size());
        assertEquals("John.Doe@Example.com", readClients.get(0).getEmail());
    }

    @Test
    void testAllClientTypes() {
        List<Client> clients = new ArrayList<>();

        for (Client.type type : Client.type.values()) {
            Client client = GenerateClientFactory.getClientType(
                    "Test Client",
                    "test@example.com",
                    "password123",
                    type,
                    "ABC123",
                    true);
            clients.add(client);
        }

        ClientCSVProcessor.setClientData(clients);
        List<Client> readClients = ClientCSVProcessor.readClientData();

        assertEquals(Client.type.values().length, readClients.size());
        for (int i = 0; i < readClients.size(); i++) {
            assertEquals(Client.type.values()[i], readClients.get(i).getType());
        }
    }
}
