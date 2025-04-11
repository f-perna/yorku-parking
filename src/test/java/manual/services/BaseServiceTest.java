package manual.services;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.io.TempDir;

import models.auth.AuthenticationState;
import models.manager.Manager;
import models.superManager.SuperManager;
import services.factory.ServiceFactory;
import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;
import csv.PaymentCSVProcessor;

public abstract class BaseServiceTest {
    protected ServiceFactory serviceFactory;
    protected AuthenticationState authState;
    protected SuperManager superManager;
    protected Manager testManager;

    protected String testBookingsFilePath;
    protected String testParkingLotsFilePath;
    protected String testParkingSpacesFilePath;
    protected String testParkingSensorFilePath;
    protected String testClientsFilePath;
    protected String testManagersFilePath;
    protected String testPaymentsFilePath;

    @TempDir
    protected File tempDir;

    @BeforeEach
    protected void setUp() throws IOException {
        initializeTestFiles();
        initializeFactories();
        initializeAuth();
    }

    protected void initializeTestFiles() throws IOException {
        // Initialize test CSV file paths
        testBookingsFilePath = tempDir.getAbsolutePath() + "/test_bookings.csv";
        testParkingLotsFilePath = tempDir.getAbsolutePath() + "/test_parking_lots.csv";
        testParkingSpacesFilePath = tempDir.getAbsolutePath() + "/test_parking_spaces.csv";
        testParkingSensorFilePath = tempDir.getAbsolutePath() + "/test_parking_sensors.csv";
        testClientsFilePath = tempDir.getAbsolutePath() + "/test_clients.csv";
        testManagersFilePath = tempDir.getAbsolutePath() + "/test_managers.csv";
        testPaymentsFilePath = tempDir.getAbsolutePath() + "/test_payments.csv";

        // Initialize test CSV files
        BookingCSVProcessor.initializeTestFile(testBookingsFilePath);
        ParkingLotCSVProcessor.initializeTestFile(testParkingLotsFilePath);
        ParkingSpaceCSVProcessor.initializeTestFile(testParkingSpacesFilePath);
        ParkingSensorCSVProcessor.initializeTestFile(testParkingSensorFilePath);
        ClientCSVProcessor.initializeTestFile(testClientsFilePath);
        ManagerCSVProcessor.initializeTestFile(testManagersFilePath);
        PaymentCSVProcessor.initializeTestFile(testPaymentsFilePath);
    }

    protected void initializeFactories() {
        serviceFactory = ServiceFactory.getInstance();
    }

    protected void initializeAuth() {
        authState = AuthenticationState.getInstance();
        superManager = SuperManager.getInstance();
        authState.setLoggedInUser(superManager);

        testManager = serviceFactory.getManagerService().generateAndGetManagerAccount();
        serviceFactory.getManagerService().login(testManager.getEmail(), testManager.getPassword());
        authState.setLoggedInUser(testManager);
    }

    @AfterEach
    protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
        authState.setLoggedInUser(superManager);
        cleanupTestFiles();
        resetFactories();
    }

    protected void cleanupTestFiles() {
        BookingCSVProcessor.cleanupAndReset(testBookingsFilePath);
        ParkingLotCSVProcessor.cleanupAndReset(testParkingLotsFilePath);
        ParkingSpaceCSVProcessor.cleanupAndReset(testParkingSpacesFilePath);
        ParkingSensorCSVProcessor.cleanupAndReset(testParkingSensorFilePath);
        ClientCSVProcessor.cleanupAndReset(testClientsFilePath);
        ManagerCSVProcessor.cleanupAndReset(testManagersFilePath);
        PaymentCSVProcessor.cleanupAndReset(testPaymentsFilePath);
    }

    protected void resetFactories() throws NoSuchFieldException, IllegalAccessException {
        // Reset factories in dependency order
        resetFactory(repositories.factory.RepositoryFactory.class, "instance");
        resetFactory(ServiceFactory.class, "instance");
    }

    private void resetFactory(Class<?> factoryClass, String instanceFieldName)
            throws NoSuchFieldException, IllegalAccessException {
        Field instance = factoryClass.getDeclaredField(instanceFieldName);
        instance.setAccessible(true);
        instance.set(null, null);
    }
}