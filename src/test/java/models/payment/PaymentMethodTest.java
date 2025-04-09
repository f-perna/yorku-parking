package models.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentMethodTest {

    @Test
    void testDebitProcessPaymentPositiveAmount() {
        PaymentMethod debit = new Debit();
        assertTrue(debit.processPayment(5.0), "Debit payment should succeed for positive amount (payment)");
    }

    @Test
    void testDebitProcessPaymentZeroAmount() {
        PaymentMethod debit = new Debit();
        assertTrue(debit.processPayment(0.0), "Debit payment should succeed for zero amount (no refund of deposit)");
    }

    @Test
    void testDebitProcessPaymentNegativeAmount() {
        PaymentMethod debit = new Debit();
        assertTrue(debit.processPayment(-5.0), "Debit payment should succeed for negative amount (refund)");
    }

    @Test
    void testDebitToString() {
        PaymentMethod debit = new Debit();
        assertEquals("Debit", debit.toString(), "Debit toString should return 'Debit'");
    }

    @Test
    void testCreditProcessPaymentPositiveAmount() {
        PaymentMethod credit = new Credit();
        assertTrue(credit.processPayment(5.0), "Credit payment should succeed for positive amount (payment)");
    }

    @Test
    void testCreditProcessPaymentZeroAmount() {
        PaymentMethod credit = new Credit();
        assertTrue(credit.processPayment(0.0), "Credit payment should succeed for zero amount (no refund of deposit)");
    }

    @Test
    void testCreditProcessPaymentNegativeAmount() {
        PaymentMethod credit = new Credit();
        assertTrue(credit.processPayment(-5.0), "Credit payment should succeed for negative amount (refund)");
    }

    @Test
    void testCreditToString() {
        PaymentMethod credit = new Credit();
        assertEquals("Credit", credit.toString(), "Credit toString should return 'Credit'");
    }

    @Test
    void testMobileProcessPaymentPositiveAmount() {
        PaymentMethod mobile = new Mobile();
        assertTrue(mobile.processPayment(5.0), "Mobile payment should succeed for positive amount (payment)");
    }

    @Test
    void testMobileProcessPaymentZeroAmount() {
        PaymentMethod mobile = new Mobile();
        assertTrue(mobile.processPayment(0.0), "Mobile payment should succeed for zero amount (no refund of deposit)");
    }

    @Test
    void testMobileProcessPaymentNegativeAmount() {
        PaymentMethod mobile = new Mobile();
        assertTrue(mobile.processPayment(-5.0), "Mobile payment should succeed for negative amount (refund)");
    }

    @Test
    void testMobileToString() {
        PaymentMethod mobile = new Mobile();
        assertEquals("Mobile", mobile.toString(), "Mobile toString should return 'Mobile'");
    }

    @Test
    void testCashProcessPaymentPositiveAmount() {
        PaymentMethod cash = new Cash();
        assertTrue(cash.processPayment(5.0), "Cash payment should succeed for positive amount (payment)");
    }

    @Test
    void testCashProcessPaymentZeroAmount() {
        PaymentMethod cash = new Cash();
        assertTrue(cash.processPayment(0.0), "Cash payment should succeed for zero amount (no refund of deposit)");
    }

    @Test
    void testCashProcessPaymentNegativeAmount() {
        PaymentMethod cash = new Cash();
        assertTrue(cash.processPayment(-5.0), "Cash payment should succeed for negative amount (refund)");
    }

    @Test
    void testCashToString() {
        PaymentMethod cash = new Cash();
        assertEquals("Cash", cash.toString(), "Cash toString should return 'Cash'");
    }
}