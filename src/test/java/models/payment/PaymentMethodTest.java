package models.payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentMethodTest {

    @Test
    void testDebitProcessPaymentAmount() {
        PaymentMethod debit = new Debit();
        assertTrue(debit.processPayment(5.0), "Debit payment should succeed for positive amount");
    }
    
    @Test
    void testDebitToString() {
    	PaymentMethod debit = new Debit();
        assertEquals("Debit", debit.toString(), "Debit toString should return 'Debit'");
    }
    
    @Test
    void testCreditProcessPaymentAmount() {
        PaymentMethod credit = new Credit();
        assertTrue(credit.processPayment(5.0), "Credit payment should succeed for positive amount");
    }
    
    @Test
    void testCreditToString() {
    	PaymentMethod credit = new Credit();
        assertEquals("Credit", credit.toString(), "Credit toString should return 'Credit'");
    }
   
    @Test
    void testMobileProcessPaymentAmount() {
        PaymentMethod mobile = new Mobile();
        assertTrue(mobile.processPayment(5.0), "Mobile payment should succeed for positive amount");
    }


    @Test
    void testMobileToString() {
        PaymentMethod mobile = new Mobile();
        assertEquals("Mobile", mobile.toString(), "Mobile toString should return 'Mobile'");
    }

    @Test
    void testCashProcessPaymentAmount() {
        PaymentMethod cash = new Cash();
        assertTrue(cash.processPayment(5.0), "Cash payment should succeed for positive amount");
    }

    @Test
    void testCashToString() {
        PaymentMethod cash = new Cash();
        assertEquals("Cash", cash.toString(), "Cash toString should return 'Cash'");
    }
}