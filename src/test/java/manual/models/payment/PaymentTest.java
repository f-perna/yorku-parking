package manual.models.payment;

import models.booking.Booking;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parkingSpace.ParkingSpace;
import models.payment.Payment;
import models.payment.PaymentMethod;
import models.parkingLot.ParkingLot;
import models.ParkingSystemException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    private Payment payment;
    private Booking booking;
    private UUID fixedBookingId;

    @BeforeEach
    void setUp() {
     
        ParkingLot parkingLot = new ParkingLot("any Lot");
        ParkingSpace parkingSpace = new ParkingSpace(parkingLot, "any Space");
        Client client = GenerateClientFactory.getClientType(
            "any	 Student", "any@student.com", "Psfksjgkjsh123!", Client.type.STUDENT, "ABC123", true
        );
        booking = new Booking(parkingSpace, client, 2); 
        fixedBookingId = UUID.fromString("30da524e-47c1-4658-9edd-9dcd9a0a7147"); 
        
        payment = new Payment(5.0, booking, Payment.generateMethod("Debit"), Payment.PaymentType.DEPOSIT);
    }

    @Test
    void testDefaultConstructorSetsFields() {
        assertNotNull(payment.getPaymentID(), "Payment ID should not be null");
        assertEquals(booking, payment.getBooking(), "Booking should be set");
        assertEquals(5.0, payment.getAmount(), "Amount should be 5.0");
        assertEquals(Payment.PaymentStatus.PENDING, payment.getStatus(), "Status should be PENDING");
        assertEquals(Payment.PaymentType.DEPOSIT, payment.getPaymentType(), "Type should be DEPOSIT");
    }

    @Test
    void testCsvConstructorWithPaymentsCsv() {
        
        UUID paymentId = UUID.fromString("17815b35-ca14-4ab5-a172-7d89fb2190f8");
        Payment csvPayment = new Payment(paymentId, booking, 5.0, Payment.generateMethod("Debit"), 
            Payment.PaymentStatus.PAID, Payment.PaymentType.DEPOSIT);

        assertEquals(paymentId, csvPayment.getPaymentID(), "Payment ID should match CSV");
        assertEquals(booking, csvPayment.getBooking(), "Booking should be set");
        assertEquals(5.0, csvPayment.getAmount(), "Amount should be 5.0");
        assertEquals(Payment.PaymentStatus.PAID, csvPayment.getStatus(), "Status should be PAID");
        assertEquals(Payment.PaymentType.DEPOSIT, csvPayment.getPaymentType(), "Type should be DEPOSIT");
    }

    @Test
    void testProcessPaymentSuccess() {
        assertTrue(payment.processPayment(), "Payment should succeed with Debit");
        assertEquals(Payment.PaymentStatus.PAID, payment.getStatus(), "Status should be PAID after success");
    }

    @Test
    void testProcessPaymentAlreadyProcessed() {
        payment.processPayment(); 
        assertThrows(ParkingSystemException.class, payment::processPayment, 
            "Should throw exception when reprocessing a non-pending payment");
    }

    @Test
    void testSetPaymentMethod() {
        PaymentMethod creditMethod = Payment.generateMethod("Credit"); 
        payment.setPaymentMethod(creditMethod);
        assertEquals(creditMethod, payment.getMethod(), "Payment method should be updated to Credit");
    }

    @Test
    void testSetPaymentType() {
        payment.setPaymentType(Payment.PaymentType.REFUND);
        assertEquals(Payment.PaymentType.REFUND, payment.getPaymentType(), "Payment type should be updated to REFUND");
    }

    @Test
    void testGetBookingID() {
        assertEquals(booking.getBookingID(), payment.getBookingID(), "Booking ID should match");
        Payment noBookingPayment = new Payment(5.0, null, Payment.generateMethod("Debit"), Payment.PaymentType.DEPOSIT);
        assertNull(noBookingPayment.getBookingID(), "Booking ID should be null if no booking is set");
    }

    @Test
    void testRefundPaymentFromCsv() {
        
        UUID paymentId = UUID.fromString("a4853d75-4666-40be-8289-559c08fad456");
        Payment refundPayment = new Payment(paymentId, booking, -5.0, Payment.generateMethod("Credit"), 
            Payment.PaymentStatus.PAID, Payment.PaymentType.REFUND);

        assertEquals(-5.0, refundPayment.getAmount(), "Amount should be -5.0 for refund");
        assertEquals(Payment.PaymentType.REFUND, refundPayment.getPaymentType(), "Type should be REFUND");
        assertEquals(Payment.PaymentStatus.PAID, refundPayment.getStatus(), "Status should be PAID");
    }

    @Test
    void testFinalPaymentFromCsv() {
        
        UUID paymentId = UUID.fromString("862ca8d9-aff4-49c4-8b1f-73d271183679");
        Booking finalBooking = new Booking(
            UUID.fromString("b4845b15-c577-4f39-a8b8-2a153512a3a9"), 
            GenerateClientFactory.getClientType("Test", "t@t.com", "Pass", Client.type.STUDENT, "XYZ789", true),
            new ParkingSpace(new ParkingLot("FinalLot"), "FinalSpace"),
            Booking.BookingStatus.COMPLETED, LocalDateTime.now(), LocalDateTime.now().plusHours(2), 5.0
        );
        Payment finalPayment = new Payment(paymentId, finalBooking, 5.0, Payment.generateMethod("Credit"), 
            Payment.PaymentStatus.PAID, Payment.PaymentType.FINAL);

        assertEquals(5.0, finalPayment.getAmount(), "Amount should be 5.0 for final payment");
        assertEquals(Payment.PaymentType.FINAL, finalPayment.getPaymentType(), "Type should be FINAL");
        assertEquals(Payment.PaymentStatus.PAID, finalPayment.getStatus(), "Status should be PAID");
    }
}