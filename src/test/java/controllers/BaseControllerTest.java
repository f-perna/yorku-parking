package controllers;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.io.TempDir;

import controllers.factory.ControllerFactory;
import csv.BookingCSVProcessor;
import csv.ClientCSVProcessor;
import csv.ManagerCSVProcessor;
import csv.ParkingLotCSVProcessor;
import csv.ParkingSensorCSVProcessor;
import csv.ParkingSpaceCSVProcessor;
import csv.PaymentCSVProcessor;
import services.factory.ServiceFactory;

public abstract class BaseControllerTest {
    protected ControllerFactory controllerFactory;
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
        controllerFactory = ControllerFactory.getInstance();
    }

    @AfterEach
    protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
        ensureLoggedOut();
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
        resetFactory(ControllerFactory.class, "instance");
    }

    private void resetFactory(Class<?> factoryClass, String instanceFieldName)
            throws NoSuchFieldException, IllegalAccessException {
        Field instance = factoryClass.getDeclaredField(instanceFieldName);
        instance.setAccessible(true);
        instance.set(null, null);
    }
    
    protected void ensureLoggedOut() {
		if (controllerFactory.getAuthController().isLoggedIn()) {
			controllerFactory.getAuthController().logout();
		}
	}
}