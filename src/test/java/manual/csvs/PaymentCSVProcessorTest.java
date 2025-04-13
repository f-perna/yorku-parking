package manual.csvs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDateTime;
import csvs.PaymentCSVProcessor;
import csvs.BookingCSVProcessor;
import csvs.ClientCSVProcessor;
import csvs.ParkingLotCSVProcessor;
import csvs.ParkingSpaceCSVProcessor;
import models.booking.Booking;
import models.booking.Booking.BookingStatus;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.client.Client.type;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;
import models.payment.Payment;
import models.payment.Payment.PaymentStatus;
import models.payment.Payment.PaymentType;

public class PaymentCSVProcessorTest {
    private static final String TEST_PAYMENTS_FILE_PATH = "data/test_payments.csv";
    private static final String TEST_BOOKINGS_FILE_PATH = "data/test_bookings.csv";
    private static final String TEST_CLIENTS_FILE_PATH = "data/test_clients.csv";
    private static final String TEST_LOTS_FILE_PATH = "data/test_parking_lots.csv";
    private static final String TEST_SPACES_FILE_PATH = "data/test_parking_spaces.csv";
    private List<Payment> testPayments;
    private Booking testBooking;

    @BeforeEach
    void setUp() throws IOException {
        // Initialize test files
        PaymentCSVProcessor.initializeTestFile(TEST_PAYMENTS_FILE_PATH);
        BookingCSVProcessor.initializeTestFile(TEST_BOOKINGS_FILE_PATH);
        ClientCSVProcessor.initializeTestFile(TEST_CLIENTS_FILE_PATH);
        ParkingLotCSVProcessor.initializeTestFile(TEST_LOTS_FILE_PATH);
        ParkingSpaceCSVProcessor.initializeTestFile(TEST_SPACES_FILE_PATH);

        // Create and save test client
        Client client = GenerateClientFactory.getClientType(
                "Test Client",
                "test@example.com",
                "password123",
                type.STUDENT,
                "ABC123",
                true);
        List<Client> clients = new ArrayList<>();
        clients.add(client);
        ClientCSVProcessor.setClientData(clients);

        // Create and save test parking lot
        UUID lotId = UUID.randomUUID();
        ParkingLot lot = new ParkingLot("Test Lot", lotId, true);
        List<ParkingLot> lots = new ArrayList<>();
        lots.add(lot);
        ParkingLotCSVProcessor.setLotData(lots);

        // Create and save test parking space
        UUID spaceId = UUID.randomUUID();
        ParkingSpace space = new ParkingSpace(spaceId, lot, ParkingSpaceStatus.AVAILABLE, "A1", true);
        List<ParkingSpace> spaces = new ArrayList<>();
        spaces.add(space);
        ParkingSpaceCSVProcessor.setSpaceData(spaces);

        // Create and save test booking
        UUID bookingId = UUID.randomUUID();
        testBooking = new Booking(
                bookingId,
                client,
                space,
                BookingStatus.CONFIRMED,
                LocalDateTime.now(),
                LocalDateTime.now().plusHours(2),
                5.0);
        List<Booking> bookings = new ArrayList<>();
        bookings.add(testBooking);
        BookingCSVProcessor.setBookingData(bookings);

        // Create test payments
        testPayments = new ArrayList<>();
        UUID paymentId1 = UUID.randomUUID();
        UUID paymentId2 = UUID.randomUUID();
        UUID paymentId3 = UUID.randomUUID();
        UUID paymentId4 = UUID.randomUUID();

        Payment payment1 = new Payment(
                paymentId1,
                testBooking,
                10.50,
                Payment.generateMethod("Debit"),
                PaymentStatus.PAID,
                PaymentType.DEPOSIT);

        Payment payment2 = new Payment(
                paymentId2,
                testBooking,
                15.75,
                Payment.generateMethod("Credit"),
                PaymentStatus.PENDING,
                PaymentType.FINAL);

        Payment payment3 = new Payment(
                paymentId3,
                testBooking,
                5.25,
                Payment.generateMethod("Mobile"),
                PaymentStatus.FAILED,
                PaymentType.DEPOSIT);

        Payment payment4 = new Payment(
                paymentId4,
                testBooking,
                20.00,
                Payment.generateMethod("Cash"),
                PaymentStatus.PAID,
                PaymentType.FINAL);

        testPayments.add(payment1);
        testPayments.add(payment2);
        testPayments.add(payment3);
        testPayments.add(payment4);
    }

    @AfterEach
    void tearDown() {
        PaymentCSVProcessor.cleanupAndReset(TEST_PAYMENTS_FILE_PATH);
        BookingCSVProcessor.cleanupAndReset(TEST_BOOKINGS_FILE_PATH);
        ClientCSVProcessor.cleanupAndReset(TEST_CLIENTS_FILE_PATH);
        ParkingLotCSVProcessor.cleanupAndReset(TEST_LOTS_FILE_PATH);
        ParkingSpaceCSVProcessor.cleanupAndReset(TEST_SPACES_FILE_PATH);
    }

    @Test
    void testWriteAndReadPayments() {
        // Write payments to file
        PaymentCSVProcessor.setPaymentData(testPayments);

        // Read payments from file
        List<Payment> readPayments = PaymentCSVProcessor.readPaymentData();

        // Verify the number of payments
        assertEquals(4, readPayments.size());

        // Verify first payment
        Payment firstPayment = readPayments.get(0);
        assertEquals(testPayments.get(0).getPaymentID(), firstPayment.getPaymentID());
        assertEquals(testBooking.getBookingID(), firstPayment.getBooking().getBookingID());
        assertEquals(10.50, firstPayment.getAmount());
        assertEquals(PaymentStatus.PAID, firstPayment.getStatus());
        assertEquals("Debit", firstPayment.getMethod().toString());
        assertEquals(PaymentType.DEPOSIT, firstPayment.getPaymentType());

        // Verify second payment
        Payment secondPayment = readPayments.get(1);
        assertEquals(testPayments.get(1).getPaymentID(), secondPayment.getPaymentID());
        assertEquals(testBooking.getBookingID(), secondPayment.getBooking().getBookingID());
        assertEquals(15.75, secondPayment.getAmount());
        assertEquals(PaymentStatus.PENDING, secondPayment.getStatus());
        assertEquals("Credit", secondPayment.getMethod().toString());
        assertEquals(PaymentType.FINAL, secondPayment.getPaymentType());
    }

    @Test
    void testReadEmptyFile() {
        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testWriteEmptyList() {
        PaymentCSVProcessor.setPaymentData(new ArrayList<>());
        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testInvalidDataHandling() throws IOException {
        // Write invalid data directly to the file
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_PAYMENTS_FILE_PATH)) {
            writer.write("id,bookingID,amount,status,method,type\n");
            writer.write("not-a-uuid,not-a-uuid,not-a-number,INVALID_STATUS,Invalid Method,INVALID_TYPE\n");
        }

        // Reading should handle invalid data gracefully
        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testInvalidUUIDFormat() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_PAYMENTS_FILE_PATH)) {
            writer.write("id,bookingID,amount,status,method,type\n");
            writer.write("invalid-uuid," + testBooking.getBookingID() + ",10.50,PAID,Debit,DEPOSIT\n");
        }

        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testInvalidBookingID() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_PAYMENTS_FILE_PATH)) {
            writer.write("id,bookingID,amount,status,method,type\n");
            writer.write(UUID.randomUUID() + ",invalid-booking-id,10.50,PAID,Debit,DEPOSIT\n");
        }

        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testInvalidAmount() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_PAYMENTS_FILE_PATH)) {
            writer.write("id,bookingID,amount,status,method,type\n");
            writer.write(UUID.randomUUID() + "," + testBooking.getBookingID() + ",not-a-number,PAID,Debit,DEPOSIT\n");
        }

        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testInvalidStatus() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_PAYMENTS_FILE_PATH)) {
            writer.write("id,bookingID,amount,status,method,type\n");
            writer.write(
                    UUID.randomUUID() + "," + testBooking.getBookingID() + ",10.50,INVALID_STATUS,Debit,DEPOSIT\n");
        }

        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testInvalidType() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_PAYMENTS_FILE_PATH)) {
            writer.write("id,bookingID,amount,status,method,type\n");
            writer.write(UUID.randomUUID() + "," + testBooking.getBookingID() + ",10.50,PAID,Debit,INVALID_TYPE\n");
        }

        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testMissingFields() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_PAYMENTS_FILE_PATH)) {
            writer.write("id,bookingID,amount,status,method,type\n");
            writer.write(UUID.randomUUID() + "," + testBooking.getBookingID() + ",10.50,PAID,Debit\n");
        }

        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testNullValues() throws IOException {
        try (java.io.FileWriter writer = new java.io.FileWriter(TEST_PAYMENTS_FILE_PATH)) {
            writer.write("id,bookingID,amount,status,method,type\n");
            writer.write(",,,PAID,Debit,DEPOSIT\n");
        }

        List<Payment> payments = PaymentCSVProcessor.readPaymentData();
        assertTrue(payments.isEmpty());
    }

    @Test
    void testAllPaymentMethods() {
        List<Payment> payments = new ArrayList<>();
        String[] methods = { "Debit", "Credit", "Mobile", "Cash" };

        for (String method : methods) {
            Payment payment = new Payment(
                    UUID.randomUUID(),
                    testBooking,
                    10.50,
                    Payment.generateMethod(method),
                    PaymentStatus.PAID,
                    PaymentType.DEPOSIT);
            payments.add(payment);
        }

        PaymentCSVProcessor.setPaymentData(payments);
        List<Payment> readPayments = PaymentCSVProcessor.readPaymentData();

        assertEquals(methods.length, readPayments.size());
        for (int i = 0; i < methods.length; i++) {
            assertEquals(methods[i], readPayments.get(i).getMethod().toString());
        }
    }

    @Test
    void testAllPaymentTypes() {
        List<Payment> payments = new ArrayList<>();

        for (PaymentType type : PaymentType.values()) {
            Payment payment = new Payment(
                    UUID.randomUUID(),
                    testBooking,
                    10.50,
                    Payment.generateMethod("Debit"),
                    PaymentStatus.PAID,
                    type);
            payments.add(payment);
        }

        PaymentCSVProcessor.setPaymentData(payments);
        List<Payment> readPayments = PaymentCSVProcessor.readPaymentData();

        assertEquals(PaymentType.values().length, readPayments.size());
        for (int i = 0; i < readPayments.size(); i++) {
            assertEquals(PaymentType.values()[i], readPayments.get(i).getPaymentType());
        }
    }
}