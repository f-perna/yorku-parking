package randoop.repositories;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RepositoriesRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getBookingsForClient(client1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingRepository0.createBooking(parkingSpace1, 1, client3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space and client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.UUID uUID1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking2 = bookingRepository0.getBookingById(uUID1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.processPayment(payment1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.payment.Payment.processPayment()\" because \"payment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace3 = parkingSpaceRepository0.addParkingSpace(parkingLot1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingLot.ParkingLot.getID()\" because the return value of \"models.parkingSpace.ParkingSpace.getLot()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorRepository0.removeSensor(parkingSpace1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.completeBooking(booking1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingRepository0.createBooking(parkingSpace1, (int) (short) 1, client3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space and client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.deleteBooking(booking1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkInBooking(booking1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkOutBooking(booking1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = bookingRepository0.hasOverstayedBookings(client1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.processPayment(payment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.payment.Payment.processPayment()\" because \"payment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment3 = paymentRepository0.createRefundPayment(booking1, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment5 = paymentRepository0.createDepositPayment(booking3, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment3 = paymentRepository0.createDepositPayment(booking1, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.confirmBooking(booking1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        models.payment.Payment payment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.processPayment(payment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.payment.Payment.processPayment()\" because \"payment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.client.Client client2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getBookingsForClient(client2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        java.util.UUID uUID3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = parkingSensorRepository0.getSensorBySpaceId(uUID3);
        parkingSensorRepository0.saveSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.UUID uUID2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = bookingRepository0.getBookingById(uUID2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpaceRepository0.removeParkingSpace(parkingSpace5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parking Space can't be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.lang.Class<?> wildcardClass2 = bookingList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment5 = paymentRepository0.createDepositPayment(booking3, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.deleteBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkInBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment6 = paymentRepository0.createFinalPayment((double) 100L, booking4, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.booking.Booking.BookingStatus bookingStatus2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getBookingsByStatus(bookingStatus2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking status cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.noShowBooking(booking1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment7 = paymentRepository0.createRefundPayment(booking5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment7 = paymentRepository0.createRefundPayment(booking5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.UUID uUID5 = null;
        models.payment.Payment payment6 = paymentRepository0.getPaymentByID(uUID5);
        models.booking.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment9 = paymentRepository0.createRefundPayment(booking7, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorRepository0.removeSensor(parkingSpace3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = bookingRepository0.getActiveBookingForSpace(parkingSpace2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace7 = parkingSpaceRepository0.updateParkingSpaceStatus(parkingSpace5, parkingSpaceStatus6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because \"space\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = parkingLotRepository0.enableParkingLot(parkingLot1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingLot.ParkingLot.setEnabled(boolean)\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsOverstayed(booking1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        models.client.Client client3 = clientRepository0.authenticateClient("hi!", "");
        models.client.Client client5 = clientRepository0.getClientByLicensePlate("hi!");
        models.client.Client client7 = clientRepository0.getClientByLicensePlate("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        models.client.Client client3 = clientRepository0.authenticateClient("hi!", "");
        models.client.Client client5 = clientRepository0.getClientByLicensePlate("hi!");
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment5 = paymentRepository0.createDepositPayment(booking3, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkOutBooking(booking4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.client.Client client2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = bookingRepository0.hasOverstayedBookings(client2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.UUID uUID5 = null;
        models.payment.Payment payment6 = paymentRepository0.getPaymentByID(uUID5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment10 = paymentRepository0.createFinalPayment((double) (short) 1, booking8, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        java.util.UUID uUID1 = null;
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotById(uUID1);
        // The following exception was thrown during execution in test generation
        try {
            parkingLotRepository0.addParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: A parking lot with name 'hi!' already exists");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpaceRepository0.removeParkingSpace(parkingSpace3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parking Space can't be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        models.client.Client client7 = clientRepository0.authenticateClient("", "hi!");
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        models.booking.Booking booking4 = null;
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getPaymentsForBooking(booking4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment8 = paymentRepository0.createRefundPayment(booking6, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        models.parkingSensor.ParkingSensor parkingSensor3 = null;
        parkingSensorRepository0.updateSensor(parkingSensor3);
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorRepository0.removeSensor(parkingSpace5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.UUID uUID5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking6 = bookingRepository0.getBookingById(uUID5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.saveClients();
        models.client.Client client2 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.deleteBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment6 = paymentRepository0.createFinalPayment((double) '4', booking4, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.confirmBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        java.util.UUID uUID1 = null;
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotById(uUID1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = parkingLotRepository0.disableParkingLot(parkingLot3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingLot.ParkingLot.setEnabled(boolean)\" because \"parkingLot\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        models.client.Client client9 = clientRepository0.authenticateClient("", "");
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking.BookingStatus bookingStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getBookingsByStatus(bookingStatus3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking status cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        java.util.UUID uUID1 = null;
        models.payment.Payment payment2 = paymentRepository0.getPaymentByID(uUID1);
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment5 = paymentRepository0.createRefundPayment(booking3, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllDisabledParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceByID(uUID5);
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getAvailableSpaces(parkingLot7);
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository0.getBookedSpaces(parkingLot9);
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace13 = parkingSpaceRepository0.updateParkingSpaceStatus(parkingSpace11, parkingSpaceStatus12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because \"space\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        models.client.Client client2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = bookingRepository0.hasOverstayedBookings(client2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        models.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = bookingRepository0.hasOverstayedBookings(client3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository3.getSensorBySpaceId(uUID4);
        models.parkingSensor.ParkingSensor parkingSensor6 = null;
        parkingSensorRepository3.updateSensor(parkingSensor6);
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository3.getSensorBySpaceId(uUID8);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.parkingSensor.ParkingSensor parkingSensor11 = parkingSensorRepository3.createSensor(parkingSpace10);
        parkingSensorRepository0.updateSensor(parkingSensor11);
        models.parkingSpace.ParkingSpace parkingSpace13 = null;
        models.parkingSensor.ParkingSensor parkingSensor14 = parkingSensorRepository0.createSensor(parkingSpace13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor14);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.noShowBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        models.client.Client client8 = clientRepository0.getClientByEmail("hi!");
        clientRepository0.saveClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getBookingsForClient(client3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkOutBooking(booking5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        models.manager.Manager manager5 = null;
        boolean boolean6 = managerRepository0.addManager(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.UUID uUID4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking5 = bookingRepository0.getBookingById(uUID4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getAllBookings();
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList7 = bookingRepository0.getBookingsForClient(client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getAvailableSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository0.getAvailableSpaces(parkingLot9);
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpaceRepository0.removeParkingSpace(parkingSpace11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parking Space can't be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        models.parkingSensor.ParkingSensor parkingSensor3 = null;
        parkingSensorRepository0.updateSensor(parkingSensor3);
        repositories.ParkingSensorRepository parkingSensorRepository5 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID6 = null;
        models.parkingSensor.ParkingSensor parkingSensor7 = parkingSensorRepository5.getSensorBySpaceId(uUID6);
        repositories.ParkingSensorRepository parkingSensorRepository8 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID9 = null;
        models.parkingSensor.ParkingSensor parkingSensor10 = parkingSensorRepository8.getSensorBySpaceId(uUID9);
        models.parkingSensor.ParkingSensor parkingSensor11 = null;
        parkingSensorRepository8.updateSensor(parkingSensor11);
        java.util.UUID uUID13 = null;
        models.parkingSensor.ParkingSensor parkingSensor14 = parkingSensorRepository8.getSensorBySpaceId(uUID13);
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.parkingSensor.ParkingSensor parkingSensor16 = parkingSensorRepository8.createSensor(parkingSpace15);
        parkingSensorRepository5.updateSensor(parkingSensor16);
        parkingSensorRepository0.updateSensor(parkingSensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor16);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getAllBookings();
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsOverstayed(booking6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsOverstayed(booking4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking.BookingStatus bookingStatus5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getBookingsByStatus(bookingStatus5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking status cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking.BookingStatus bookingStatus2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getBookingsByStatus(bookingStatus2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking status cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        models.parkingSensor.ParkingSensor parkingSensor3 = null;
        parkingSensorRepository0.updateSensor(parkingSensor3);
        java.util.UUID uUID5 = null;
        models.parkingSensor.ParkingSensor parkingSensor6 = parkingSensorRepository0.getSensorBySpaceId(uUID5);
        models.parkingSpace.ParkingSpace parkingSpace7 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorRepository0.removeSensor(parkingSpace7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        java.util.UUID uUID1 = null;
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotById(uUID1);
        java.util.UUID uUID3 = null;
        models.parkingLot.ParkingLot parkingLot4 = parkingLotRepository0.getParkingLotById(uUID3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment5 = paymentRepository0.createRefundPayment(booking3, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment10 = paymentRepository0.createDepositPayment(booking8, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllEnabledParkingLots();
        models.parkingLot.ParkingLot parkingLot6 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.UUID uUID7 = null;
        parkingLotRepository0.removeParkingLot(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot6);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment3 = paymentRepository0.createRefundPayment(booking1, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        models.manager.Manager manager1 = null;
        boolean boolean2 = managerRepository0.addManager(manager1);
        models.manager.Manager manager3 = null;
        boolean boolean4 = managerRepository0.addManager(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.deleteBooking(booking6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.UUID uUID5 = null;
        models.payment.Payment payment6 = paymentRepository0.getPaymentByID(uUID5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment10 = paymentRepository0.createFinalPayment((double) '#', booking8, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        models.parkingSensor.ParkingSensor parkingSensor3 = null;
        parkingSensorRepository0.updateSensor(parkingSensor3);
        java.util.UUID uUID5 = null;
        models.parkingSensor.ParkingSensor parkingSensor6 = parkingSensorRepository0.getSensorBySpaceId(uUID5);
        models.parkingSpace.ParkingSpace parkingSpace7 = null;
        models.parkingSensor.ParkingSensor parkingSensor8 = parkingSensorRepository0.createSensor(parkingSpace7);
        parkingSensorRepository0.saveSensors();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorRepository0.removeSensor(parkingSpace10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because \"parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getBookedSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        java.util.UUID uUID9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository0.getSpacesForLot(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.completeBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.client.Client client4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bookingRepository0.hasOverstayedBookings(client4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.noShowBooking(booking5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        models.client.Client client3 = clientRepository0.authenticateClient("hi!", "");
        models.client.Client client5 = clientRepository0.getClientByLicensePlate("hi!");
        clientRepository0.deleteClient("");
        java.util.List<models.client.Client> clientList8 = clientRepository0.getAllClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        java.util.List<models.client.Client> clientList3 = clientRepository0.getAllClients();
        clientRepository0.saveClients();
        java.util.List<models.client.Client> clientList5 = clientRepository0.getAllClients();
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingRepository0.getActiveBookingForSpace(parkingSpace3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager3 = null;
        boolean boolean4 = managerRepository0.addManager(manager3);
        models.manager.Manager manager7 = managerRepository0.authenticateManager("", "hi!");
        models.manager.Manager manager10 = managerRepository0.authenticateManager("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        java.lang.Class<?> wildcardClass7 = clientRepository0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsOverstayed(booking5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.UUID uUID6 = null;
        parkingLotRepository0.removeParkingLot(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        boolean boolean6 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager9 = managerRepository0.authenticateManager("", "");
        models.manager.Manager manager11 = managerRepository0.getManagerByEmail("");
        models.manager.Manager manager14 = managerRepository0.authenticateManager("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.UUID uUID3 = null;
        parkingLotRepository0.removeParkingLot(uUID3);
        java.util.UUID uUID5 = null;
        models.parkingLot.ParkingLot parkingLot6 = parkingLotRepository0.getParkingLotById(uUID5);
        java.util.UUID uUID7 = null;
        parkingLotRepository0.removeParkingLot(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking9 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentRepository0.createFinalPayment((double) '#', booking9, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("");
        java.util.List<models.manager.Manager> managerList3 = managerRepository0.getAllManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getAvailableSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        java.util.UUID uUID9 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSpaceRepository0.getParkingSpaceById(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getAllBookings();
        models.booking.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.confirmBooking(booking7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        models.booking.Booking booking4 = null;
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getPaymentsForBooking(booking4);
        java.util.List<models.payment.Payment> paymentList6 = paymentRepository0.getAllPayments();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot4 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = parkingSpaceRepository3.getBookedSpaces(parkingLot4);
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository3.getBookedSpaces(parkingLot6);
        java.util.UUID uUID8 = null;
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSpaceRepository3.getParkingSpaceById(uUID8);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository3.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository11.getBookedSpaces(parkingLot12);
        java.util.UUID uUID14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = parkingSpaceRepository11.getParkingSpaceById(uUID14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository11.getAvailableSpaces(parkingLot16);
        java.util.UUID uUID18 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList19 = parkingSpaceRepository11.getSpacesForLot(uUID18);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository11.getAvailableSpaces(parkingLot20);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList23 = parkingSpaceRepository11.getDisabledSpaces(parkingLot22);
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository11.getBookedSpaces(parkingLot24);
        repositories.ParkingSpaceRepository parkingSpaceRepository26 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository26.getBookedSpaces(parkingLot27);
        java.util.UUID uUID29 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = parkingSpaceRepository26.getParkingSpaceById(uUID29);
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository26.getBookedSpaces(parkingLot31);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository26.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository34 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot35 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList36 = parkingSpaceRepository34.getBookedSpaces(parkingLot35);
        java.util.UUID uUID37 = null;
        models.parkingSpace.ParkingSpace parkingSpace38 = parkingSpaceRepository34.getParkingSpaceById(uUID37);
        models.parkingLot.ParkingLot parkingLot39 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList40 = parkingSpaceRepository34.getAvailableSpaces(parkingLot39);
        java.util.UUID uUID41 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList42 = parkingSpaceRepository34.getSpacesForLot(uUID41);
        models.parkingLot.ParkingLot parkingLot43 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList44 = parkingSpaceRepository34.getAvailableSpaces(parkingLot43);
        models.parkingLot.ParkingLot parkingLot45 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList46 = parkingSpaceRepository34.getDisabledSpaces(parkingLot45);
        repositories.ParkingLotRepository parkingLotRepository47 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList48 = parkingLotRepository47.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList49 = parkingLotRepository47.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository50 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot52 = parkingLotRepository50.getParkingLotByName("hi!");
        java.util.UUID uUID53 = null;
        parkingLotRepository50.removeParkingLot(uUID53);
        models.parkingLot.ParkingLot parkingLot56 = parkingLotRepository50.getParkingLotByName("hi!");
        boolean boolean57 = parkingLotRepository47.disableParkingLot(parkingLot56);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList58 = parkingSpaceRepository34.getEnabledSpaces(parkingLot56);
        models.parkingSpace.ParkingSpace parkingSpace60 = parkingSpaceRepository26.addParkingSpace(parkingLot56, "hi!");
        parkingSpaceRepository11.removeParkingSpace(parkingSpace60);
        parkingSpaceRepository3.removeParkingSpace(parkingSpace60);
        models.client.Client client64 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking65 = bookingRepository0.createBooking(parkingSpace60, 0, client64);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space and client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace60);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceRepository0.getAllSpaces();
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getAllSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        models.client.Client client5 = clientRepository0.authenticateClient("hi!", "hi!");
        models.client.Client client8 = clientRepository0.authenticateClient("hi!", "hi!");
        clientRepository0.saveClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsOverstayed(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkOutBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getAllBookings();
        java.util.UUID uUID7 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking8 = bookingRepository0.getBookingById(uUID7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        models.client.Client client8 = clientRepository0.getClientByEmail("hi!");
        models.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getAllBookings();
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingRepository0.hasOverstayedBookings(client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot2 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceRepository1.getBookedSpaces(parkingLot2);
        java.util.UUID uUID4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = parkingSpaceRepository1.getParkingSpaceById(uUID4);
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository1.getBookedSpaces(parkingLot6);
        java.util.UUID uUID8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository1.getSpacesForLot(uUID8);
        repositories.ParkingLotRepository parkingLotRepository10 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList11 = parkingLotRepository10.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList12 = parkingLotRepository10.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository13 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot15 = parkingLotRepository13.getParkingLotByName("hi!");
        java.util.UUID uUID16 = null;
        parkingLotRepository13.removeParkingLot(uUID16);
        models.parkingLot.ParkingLot parkingLot19 = parkingLotRepository13.getParkingLotByName("hi!");
        boolean boolean20 = parkingLotRepository10.disableParkingLot(parkingLot19);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository1.getDisabledSpaces(parkingLot19);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList22 = parkingSpaceRepository0.getDisabledSpaces(parkingLot19);
        java.lang.Class<?> wildcardClass23 = parkingSpaceRepository0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment5 = paymentRepository0.createRefundPayment(booking3, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        models.client.Client client5 = clientRepository0.authenticateClient("hi!", "hi!");
        models.client.Client client8 = clientRepository0.authenticateClient("hi!", "hi!");
        clientRepository0.deleteClient("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.client.Client client4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getBookingsForClient(client4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository3.getSensorBySpaceId(uUID4);
        models.parkingSensor.ParkingSensor parkingSensor6 = null;
        parkingSensorRepository3.updateSensor(parkingSensor6);
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository3.getSensorBySpaceId(uUID8);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.parkingSensor.ParkingSensor parkingSensor11 = parkingSensorRepository3.createSensor(parkingSpace10);
        parkingSensorRepository0.updateSensor(parkingSensor11);
        repositories.ParkingSensorRepository parkingSensorRepository13 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID14 = null;
        models.parkingSensor.ParkingSensor parkingSensor15 = parkingSensorRepository13.getSensorBySpaceId(uUID14);
        repositories.ParkingSensorRepository parkingSensorRepository16 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID17 = null;
        models.parkingSensor.ParkingSensor parkingSensor18 = parkingSensorRepository16.getSensorBySpaceId(uUID17);
        models.parkingSensor.ParkingSensor parkingSensor19 = null;
        parkingSensorRepository16.updateSensor(parkingSensor19);
        java.util.UUID uUID21 = null;
        models.parkingSensor.ParkingSensor parkingSensor22 = parkingSensorRepository16.getSensorBySpaceId(uUID21);
        models.parkingSpace.ParkingSpace parkingSpace23 = null;
        models.parkingSensor.ParkingSensor parkingSensor24 = parkingSensorRepository16.createSensor(parkingSpace23);
        parkingSensorRepository13.updateSensor(parkingSensor24);
        repositories.ParkingSensorRepository parkingSensorRepository26 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID27 = null;
        models.parkingSensor.ParkingSensor parkingSensor28 = parkingSensorRepository26.getSensorBySpaceId(uUID27);
        repositories.ParkingSensorRepository parkingSensorRepository29 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID30 = null;
        models.parkingSensor.ParkingSensor parkingSensor31 = parkingSensorRepository29.getSensorBySpaceId(uUID30);
        models.parkingSensor.ParkingSensor parkingSensor32 = null;
        parkingSensorRepository29.updateSensor(parkingSensor32);
        java.util.UUID uUID34 = null;
        models.parkingSensor.ParkingSensor parkingSensor35 = parkingSensorRepository29.getSensorBySpaceId(uUID34);
        models.parkingSpace.ParkingSpace parkingSpace36 = null;
        models.parkingSensor.ParkingSensor parkingSensor37 = parkingSensorRepository29.createSensor(parkingSpace36);
        parkingSensorRepository26.updateSensor(parkingSensor37);
        parkingSensorRepository13.updateSensor(parkingSensor37);
        parkingSensorRepository0.updateSensor(parkingSensor37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor37);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getAllBookings();
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.completeBooking(booking6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot4 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = parkingSpaceRepository3.getBookedSpaces(parkingLot4);
        java.util.UUID uUID6 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSpaceRepository3.getParkingSpaceById(uUID6);
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository3.getAvailableSpaces(parkingLot8);
        java.util.UUID uUID10 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList11 = parkingSpaceRepository3.getSpacesForLot(uUID10);
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository3.getAvailableSpaces(parkingLot12);
        models.parkingLot.ParkingLot parkingLot14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository3.getDisabledSpaces(parkingLot14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository3.getBookedSpaces(parkingLot16);
        repositories.ParkingSpaceRepository parkingSpaceRepository18 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository18.getBookedSpaces(parkingLot19);
        java.util.UUID uUID21 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = parkingSpaceRepository18.getParkingSpaceById(uUID21);
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository18.getBookedSpaces(parkingLot23);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository18.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository26 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository26.getBookedSpaces(parkingLot27);
        java.util.UUID uUID29 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = parkingSpaceRepository26.getParkingSpaceById(uUID29);
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository26.getAvailableSpaces(parkingLot31);
        java.util.UUID uUID33 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository26.getSpacesForLot(uUID33);
        models.parkingLot.ParkingLot parkingLot35 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList36 = parkingSpaceRepository26.getAvailableSpaces(parkingLot35);
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository26.getDisabledSpaces(parkingLot37);
        repositories.ParkingLotRepository parkingLotRepository39 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList40 = parkingLotRepository39.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList41 = parkingLotRepository39.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository42 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot44 = parkingLotRepository42.getParkingLotByName("hi!");
        java.util.UUID uUID45 = null;
        parkingLotRepository42.removeParkingLot(uUID45);
        models.parkingLot.ParkingLot parkingLot48 = parkingLotRepository42.getParkingLotByName("hi!");
        boolean boolean49 = parkingLotRepository39.disableParkingLot(parkingLot48);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList50 = parkingSpaceRepository26.getEnabledSpaces(parkingLot48);
        models.parkingSpace.ParkingSpace parkingSpace52 = parkingSpaceRepository18.addParkingSpace(parkingLot48, "hi!");
        parkingSpaceRepository3.removeParkingSpace(parkingSpace52);
        models.booking.Booking booking54 = bookingRepository0.getActiveBookingForSpace(parkingSpace52);
        models.client.Client client55 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = bookingRepository0.hasOverstayedBookings(client55);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking54);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.confirmBooking(booking5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        parkingSensorRepository0.saveSensors();
        parkingSensorRepository0.saveSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList6 = parkingLotRepository0.getAllEnabledParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment10 = paymentRepository0.createRefundPayment(booking8, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkOutBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository3.getSensorBySpaceId(uUID4);
        models.parkingSensor.ParkingSensor parkingSensor6 = null;
        parkingSensorRepository3.updateSensor(parkingSensor6);
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository3.getSensorBySpaceId(uUID8);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.parkingSensor.ParkingSensor parkingSensor11 = parkingSensorRepository3.createSensor(parkingSpace10);
        parkingSensorRepository0.updateSensor(parkingSensor11);
        parkingSensorRepository0.saveSensors();
        repositories.ParkingSensorRepository parkingSensorRepository14 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID15 = null;
        models.parkingSensor.ParkingSensor parkingSensor16 = parkingSensorRepository14.getSensorBySpaceId(uUID15);
        models.parkingSensor.ParkingSensor parkingSensor17 = null;
        parkingSensorRepository14.updateSensor(parkingSensor17);
        java.util.UUID uUID19 = null;
        models.parkingSensor.ParkingSensor parkingSensor20 = parkingSensorRepository14.getSensorBySpaceId(uUID19);
        models.parkingSpace.ParkingSpace parkingSpace21 = null;
        models.parkingSensor.ParkingSensor parkingSensor22 = parkingSensorRepository14.createSensor(parkingSpace21);
        parkingSensorRepository14.saveSensors();
        models.parkingSpace.ParkingSpace parkingSpace24 = null;
        models.parkingSensor.ParkingSensor parkingSensor25 = parkingSensorRepository14.createSensor(parkingSpace24);
        parkingSensorRepository0.updateSensor(parkingSensor25);
        repositories.ParkingSensorRepository parkingSensorRepository27 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID28 = null;
        models.parkingSensor.ParkingSensor parkingSensor29 = parkingSensorRepository27.getSensorBySpaceId(uUID28);
        repositories.ParkingSensorRepository parkingSensorRepository30 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID31 = null;
        models.parkingSensor.ParkingSensor parkingSensor32 = parkingSensorRepository30.getSensorBySpaceId(uUID31);
        models.parkingSensor.ParkingSensor parkingSensor33 = null;
        parkingSensorRepository30.updateSensor(parkingSensor33);
        java.util.UUID uUID35 = null;
        models.parkingSensor.ParkingSensor parkingSensor36 = parkingSensorRepository30.getSensorBySpaceId(uUID35);
        models.parkingSpace.ParkingSpace parkingSpace37 = null;
        models.parkingSensor.ParkingSensor parkingSensor38 = parkingSensorRepository30.createSensor(parkingSpace37);
        parkingSensorRepository27.updateSensor(parkingSensor38);
        repositories.ParkingSensorRepository parkingSensorRepository40 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID41 = null;
        models.parkingSensor.ParkingSensor parkingSensor42 = parkingSensorRepository40.getSensorBySpaceId(uUID41);
        models.parkingSensor.ParkingSensor parkingSensor43 = null;
        parkingSensorRepository40.updateSensor(parkingSensor43);
        java.util.UUID uUID45 = null;
        models.parkingSensor.ParkingSensor parkingSensor46 = parkingSensorRepository40.getSensorBySpaceId(uUID45);
        models.parkingSpace.ParkingSpace parkingSpace47 = null;
        models.parkingSensor.ParkingSensor parkingSensor48 = parkingSensorRepository40.createSensor(parkingSpace47);
        parkingSensorRepository27.updateSensor(parkingSensor48);
        parkingSensorRepository0.updateSensor(parkingSensor48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor48);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        repositories.BookingRepository bookingRepository1 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository1.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository1.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository4.getBookedSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = parkingSpaceRepository4.getParkingSpaceById(uUID7);
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository4.getAvailableSpaces(parkingLot9);
        java.util.UUID uUID11 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository4.getSpacesForLot(uUID11);
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository4.getAvailableSpaces(parkingLot13);
        models.parkingLot.ParkingLot parkingLot15 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList16 = parkingSpaceRepository4.getDisabledSpaces(parkingLot15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository4.getBookedSpaces(parkingLot17);
        repositories.ParkingSpaceRepository parkingSpaceRepository19 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository19.getBookedSpaces(parkingLot20);
        java.util.UUID uUID22 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = parkingSpaceRepository19.getParkingSpaceById(uUID22);
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository19.getBookedSpaces(parkingLot24);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList26 = parkingSpaceRepository19.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository27 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository27.getBookedSpaces(parkingLot28);
        java.util.UUID uUID30 = null;
        models.parkingSpace.ParkingSpace parkingSpace31 = parkingSpaceRepository27.getParkingSpaceById(uUID30);
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository27.getAvailableSpaces(parkingLot32);
        java.util.UUID uUID34 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList35 = parkingSpaceRepository27.getSpacesForLot(uUID34);
        models.parkingLot.ParkingLot parkingLot36 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList37 = parkingSpaceRepository27.getAvailableSpaces(parkingLot36);
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList39 = parkingSpaceRepository27.getDisabledSpaces(parkingLot38);
        repositories.ParkingLotRepository parkingLotRepository40 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList41 = parkingLotRepository40.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList42 = parkingLotRepository40.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository43 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot45 = parkingLotRepository43.getParkingLotByName("hi!");
        java.util.UUID uUID46 = null;
        parkingLotRepository43.removeParkingLot(uUID46);
        models.parkingLot.ParkingLot parkingLot49 = parkingLotRepository43.getParkingLotByName("hi!");
        boolean boolean50 = parkingLotRepository40.disableParkingLot(parkingLot49);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList51 = parkingSpaceRepository27.getEnabledSpaces(parkingLot49);
        models.parkingSpace.ParkingSpace parkingSpace53 = parkingSpaceRepository19.addParkingSpace(parkingLot49, "hi!");
        parkingSpaceRepository4.removeParkingSpace(parkingSpace53);
        models.booking.Booking booking55 = bookingRepository1.getActiveBookingForSpace(parkingSpace53);
        models.client.Client client57 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking58 = bookingRepository0.createBooking(parkingSpace53, (int) (short) 1, client57);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space and client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking55);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getBookedSpaces(parkingLot5);
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getBookedSpaces(parkingLot7);
        java.util.UUID uUID9 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSpaceRepository0.getParkingSpaceByID(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        boolean boolean6 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager9 = managerRepository0.authenticateManager("", "");
        models.manager.Manager manager11 = managerRepository0.getManagerByEmail("");
        models.manager.Manager manager13 = managerRepository0.getManagerByEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        models.booking.Booking booking4 = null;
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getPaymentsForBooking(booking4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment8 = paymentRepository0.createDepositPayment(booking6, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getAllBookings();
        models.booking.Booking.BookingStatus bookingStatus6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList7 = bookingRepository0.getBookingsByStatus(bookingStatus6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking status cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllEnabledParkingLots();
        // The following exception was thrown during execution in test generation
        try {
            parkingLotRepository0.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: A parking lot with name '' already exists");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceById(uUID5);
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository7.getBookedSpaces(parkingLot8);
        java.util.UUID uUID10 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSpaceRepository7.getParkingSpaceById(uUID10);
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository7.getBookedSpaces(parkingLot12);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository7.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository15 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository15.getBookedSpaces(parkingLot16);
        java.util.UUID uUID18 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = parkingSpaceRepository15.getParkingSpaceById(uUID18);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository15.getAvailableSpaces(parkingLot20);
        java.util.UUID uUID22 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList23 = parkingSpaceRepository15.getSpacesForLot(uUID22);
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository15.getAvailableSpaces(parkingLot24);
        models.parkingLot.ParkingLot parkingLot26 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList27 = parkingSpaceRepository15.getDisabledSpaces(parkingLot26);
        repositories.ParkingLotRepository parkingLotRepository28 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList29 = parkingLotRepository28.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList30 = parkingLotRepository28.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository31 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot33 = parkingLotRepository31.getParkingLotByName("hi!");
        java.util.UUID uUID34 = null;
        parkingLotRepository31.removeParkingLot(uUID34);
        models.parkingLot.ParkingLot parkingLot37 = parkingLotRepository31.getParkingLotByName("hi!");
        boolean boolean38 = parkingLotRepository28.disableParkingLot(parkingLot37);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList39 = parkingSpaceRepository15.getEnabledSpaces(parkingLot37);
        models.parkingSpace.ParkingSpace parkingSpace41 = parkingSpaceRepository7.addParkingSpace(parkingLot37, "hi!");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList42 = parkingSpaceRepository0.getEnabledSpaces(parkingLot37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList42);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        models.client.Client client4 = clientRepository0.getClientByEmail("");
        models.client.Client client7 = clientRepository0.authenticateClient("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceById(uUID5);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository0.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository8.getBookedSpaces(parkingLot9);
        java.util.UUID uUID11 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = parkingSpaceRepository8.getParkingSpaceById(uUID11);
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository8.getAvailableSpaces(parkingLot13);
        java.util.UUID uUID15 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList16 = parkingSpaceRepository8.getSpacesForLot(uUID15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository8.getAvailableSpaces(parkingLot17);
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository8.getDisabledSpaces(parkingLot19);
        models.parkingLot.ParkingLot parkingLot21 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList22 = parkingSpaceRepository8.getBookedSpaces(parkingLot21);
        repositories.ParkingSpaceRepository parkingSpaceRepository23 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository23.getBookedSpaces(parkingLot24);
        java.util.UUID uUID26 = null;
        models.parkingSpace.ParkingSpace parkingSpace27 = parkingSpaceRepository23.getParkingSpaceById(uUID26);
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository23.getBookedSpaces(parkingLot28);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList30 = parkingSpaceRepository23.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository31 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository31.getBookedSpaces(parkingLot32);
        java.util.UUID uUID34 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = parkingSpaceRepository31.getParkingSpaceById(uUID34);
        models.parkingLot.ParkingLot parkingLot36 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList37 = parkingSpaceRepository31.getAvailableSpaces(parkingLot36);
        java.util.UUID uUID38 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList39 = parkingSpaceRepository31.getSpacesForLot(uUID38);
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList41 = parkingSpaceRepository31.getAvailableSpaces(parkingLot40);
        models.parkingLot.ParkingLot parkingLot42 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList43 = parkingSpaceRepository31.getDisabledSpaces(parkingLot42);
        repositories.ParkingLotRepository parkingLotRepository44 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList45 = parkingLotRepository44.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList46 = parkingLotRepository44.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository47 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot49 = parkingLotRepository47.getParkingLotByName("hi!");
        java.util.UUID uUID50 = null;
        parkingLotRepository47.removeParkingLot(uUID50);
        models.parkingLot.ParkingLot parkingLot53 = parkingLotRepository47.getParkingLotByName("hi!");
        boolean boolean54 = parkingLotRepository44.disableParkingLot(parkingLot53);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList55 = parkingSpaceRepository31.getEnabledSpaces(parkingLot53);
        models.parkingSpace.ParkingSpace parkingSpace57 = parkingSpaceRepository23.addParkingSpace(parkingLot53, "hi!");
        parkingSpaceRepository8.removeParkingSpace(parkingSpace57);
        parkingSpaceRepository0.removeParkingSpace(parkingSpace57);
        java.util.UUID uUID60 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList61 = parkingSpaceRepository0.getSpacesForLot(uUID60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList61);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        models.client.Client client3 = clientRepository0.authenticateClient("hi!", "");
        clientRepository0.saveClients();
        java.lang.Class<?> wildcardClass5 = clientRepository0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager3 = null;
        boolean boolean4 = managerRepository0.addManager(manager3);
        java.util.List<models.manager.Manager> managerList5 = managerRepository0.getAllManagers();
        boolean boolean7 = managerRepository0.removeManager("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getAvailableSpaces(parkingLot5);
        models.parkingLot.ParkingLot parkingLot7 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace9 = parkingSpaceRepository0.addParkingSpace(parkingLot7, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingLot.ParkingLot.getID()\" because the return value of \"models.parkingSpace.ParkingSpace.getLot()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        models.parkingLot.ParkingLot parkingLot4 = parkingLotRepository0.getParkingLotByName("");
        models.parkingLot.ParkingLot parkingLot6 = parkingLotRepository0.getParkingLotByName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository6.getBookedSpaces(parkingLot7);
        java.util.UUID uUID9 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSpaceRepository6.getParkingSpaceById(uUID9);
        models.parkingLot.ParkingLot parkingLot11 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository6.getBookedSpaces(parkingLot11);
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository13.getBookedSpaces(parkingLot14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository13.getBookedSpaces(parkingLot16);
        java.util.UUID uUID18 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = parkingSpaceRepository13.getParkingSpaceById(uUID18);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository13.getAllSpaces();
        repositories.ParkingLotRepository parkingLotRepository21 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot23 = parkingLotRepository21.getParkingLotByName("hi!");
        java.util.UUID uUID24 = null;
        parkingLotRepository21.removeParkingLot(uUID24);
        models.parkingLot.ParkingLot parkingLot27 = parkingLotRepository21.getParkingLotByName("hi!");
        models.parkingSpace.ParkingSpace parkingSpace29 = parkingSpaceRepository13.addParkingSpace(parkingLot27, "hi!");
        models.parkingSpace.ParkingSpace parkingSpace31 = parkingSpaceRepository6.addParkingSpace(parkingLot27, "hi!");
        models.client.Client client33 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking34 = bookingRepository0.createBooking(parkingSpace31, (int) (short) 10, client33);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space and client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace31);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceByID(uUID3);
        java.util.UUID uUID5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getSpacesForLot(uUID5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository3.getSensorBySpaceId(uUID4);
        models.parkingSensor.ParkingSensor parkingSensor6 = null;
        parkingSensorRepository3.updateSensor(parkingSensor6);
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository3.getSensorBySpaceId(uUID8);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.parkingSensor.ParkingSensor parkingSensor11 = parkingSensorRepository3.createSensor(parkingSpace10);
        parkingSensorRepository0.updateSensor(parkingSensor11);
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList13 = parkingSensorRepository0.getAllSensors();
        java.util.UUID uUID14 = null;
        models.parkingSensor.ParkingSensor parkingSensor15 = parkingSensorRepository0.getSensorBySpaceId(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor15);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        parkingSensorRepository0.saveSensors();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository0.getSensorBySpaceId(uUID4);
        parkingSensorRepository0.saveSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList1 = parkingLotRepository0.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList2 = parkingLotRepository0.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository3 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot5 = parkingLotRepository3.getParkingLotByName("hi!");
        java.util.UUID uUID6 = null;
        parkingLotRepository3.removeParkingLot(uUID6);
        models.parkingLot.ParkingLot parkingLot9 = parkingLotRepository3.getParkingLotByName("hi!");
        boolean boolean10 = parkingLotRepository0.disableParkingLot(parkingLot9);
        java.util.List<models.parkingLot.ParkingLot> parkingLotList11 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList12 = parkingLotRepository0.getAllEnabledParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList12);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        models.parkingLot.ParkingLot parkingLot4 = parkingLotRepository0.getParkingLotByName("");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllDisabledParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getAllBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.payment.Payment payment6 = null;
        paymentRepository0.removePayment(payment6);
        models.payment.Payment payment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.processPayment(payment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.payment.Payment.processPayment()\" because \"payment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceById(uUID5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parkingSpace6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository5.getBookedSpaces(parkingLot6);
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository5.getBookedSpaces(parkingLot8);
        java.util.UUID uUID10 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSpaceRepository5.getParkingSpaceById(uUID10);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository5.getAllSpaces();
        repositories.ParkingLotRepository parkingLotRepository13 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot15 = parkingLotRepository13.getParkingLotByName("hi!");
        java.util.UUID uUID16 = null;
        parkingLotRepository13.removeParkingLot(uUID16);
        models.parkingLot.ParkingLot parkingLot19 = parkingLotRepository13.getParkingLotByName("hi!");
        models.parkingSpace.ParkingSpace parkingSpace21 = parkingSpaceRepository5.addParkingSpace(parkingLot19, "hi!");
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace23 = parkingSpaceRepository0.updateParkingSpaceStatus(parkingSpace21, parkingSpaceStatus22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parking space with ID a5a55851-4a24-4226-bda0-86f5fe89c571 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace21);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        models.client.Client client5 = clientRepository0.authenticateClient("hi!", "hi!");
        models.client.Client client8 = clientRepository0.authenticateClient("hi!", "hi!");
        models.client.Client client11 = clientRepository0.authenticateClient("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.deleteBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        repositories.ParkingLotRepository parkingLotRepository5 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot7 = parkingLotRepository5.getParkingLotByName("hi!");
        models.parkingLot.ParkingLot parkingLot9 = parkingLotRepository5.getParkingLotByName("");
        models.parkingLot.ParkingLot parkingLot11 = parkingLotRepository5.getParkingLotByName("hi!");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository0.getEnabledSpaces(parkingLot11);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository0.getAllSpaces();
        java.util.UUID uUID14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository0.getSpacesForLot(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("hi!");
        models.client.Client client6 = clientRepository0.getClientByLicensePlate("");
        models.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getAvailableSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        java.util.UUID uUID9 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSpaceRepository0.getParkingSpaceByID(uUID9);
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository11.getBookedSpaces(parkingLot12);
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = new repositories.ParkingSpaceRepository();
        repositories.ParkingSpaceRepository parkingSpaceRepository15 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository15.getBookedSpaces(parkingLot16);
        java.util.UUID uUID18 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = parkingSpaceRepository15.getParkingSpaceById(uUID18);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository15.getBookedSpaces(parkingLot20);
        java.util.UUID uUID22 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList23 = parkingSpaceRepository15.getSpacesForLot(uUID22);
        repositories.ParkingLotRepository parkingLotRepository24 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList25 = parkingLotRepository24.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList26 = parkingLotRepository24.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository27 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot29 = parkingLotRepository27.getParkingLotByName("hi!");
        java.util.UUID uUID30 = null;
        parkingLotRepository27.removeParkingLot(uUID30);
        models.parkingLot.ParkingLot parkingLot33 = parkingLotRepository27.getParkingLotByName("hi!");
        boolean boolean34 = parkingLotRepository24.disableParkingLot(parkingLot33);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList35 = parkingSpaceRepository15.getDisabledSpaces(parkingLot33);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList36 = parkingSpaceRepository14.getDisabledSpaces(parkingLot33);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList37 = parkingSpaceRepository11.getDisabledSpaces(parkingLot33);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository0.getAvailableSpaces(parkingLot33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceByID(uUID3);
        repositories.ParkingLotRepository parkingLotRepository5 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList6 = parkingLotRepository5.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList7 = parkingLotRepository5.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository8 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot10 = parkingLotRepository8.getParkingLotByName("hi!");
        java.util.UUID uUID11 = null;
        parkingLotRepository8.removeParkingLot(uUID11);
        models.parkingLot.ParkingLot parkingLot14 = parkingLotRepository8.getParkingLotByName("hi!");
        boolean boolean15 = parkingLotRepository5.disableParkingLot(parkingLot14);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList16 = parkingSpaceRepository0.getEnabledSpaces(parkingLot14);
        java.util.UUID uUID17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository0.getSpacesForLot(uUID17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        java.util.List<models.payment.Payment> paymentList4 = paymentRepository0.getAllPayments();
        models.booking.Booking booking5 = null;
        java.util.List<models.payment.Payment> paymentList6 = paymentRepository0.getPaymentsForBooking(booking5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment10 = paymentRepository0.createFinalPayment((double) (short) 10, booking8, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        models.manager.Manager manager1 = null;
        boolean boolean2 = managerRepository0.addManager(manager1);
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = bookingRepository0.hasOverstayedBookings(client3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkInBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceById(uUID5);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository0.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository8.getBookedSpaces(parkingLot9);
        java.util.UUID uUID11 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = parkingSpaceRepository8.getParkingSpaceById(uUID11);
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository8.getAvailableSpaces(parkingLot13);
        java.util.UUID uUID15 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList16 = parkingSpaceRepository8.getSpacesForLot(uUID15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository8.getAvailableSpaces(parkingLot17);
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository8.getDisabledSpaces(parkingLot19);
        models.parkingLot.ParkingLot parkingLot21 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList22 = parkingSpaceRepository8.getBookedSpaces(parkingLot21);
        repositories.ParkingSpaceRepository parkingSpaceRepository23 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository23.getBookedSpaces(parkingLot24);
        java.util.UUID uUID26 = null;
        models.parkingSpace.ParkingSpace parkingSpace27 = parkingSpaceRepository23.getParkingSpaceById(uUID26);
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository23.getBookedSpaces(parkingLot28);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList30 = parkingSpaceRepository23.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository31 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository31.getBookedSpaces(parkingLot32);
        java.util.UUID uUID34 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = parkingSpaceRepository31.getParkingSpaceById(uUID34);
        models.parkingLot.ParkingLot parkingLot36 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList37 = parkingSpaceRepository31.getAvailableSpaces(parkingLot36);
        java.util.UUID uUID38 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList39 = parkingSpaceRepository31.getSpacesForLot(uUID38);
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList41 = parkingSpaceRepository31.getAvailableSpaces(parkingLot40);
        models.parkingLot.ParkingLot parkingLot42 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList43 = parkingSpaceRepository31.getDisabledSpaces(parkingLot42);
        repositories.ParkingLotRepository parkingLotRepository44 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList45 = parkingLotRepository44.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList46 = parkingLotRepository44.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository47 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot49 = parkingLotRepository47.getParkingLotByName("hi!");
        java.util.UUID uUID50 = null;
        parkingLotRepository47.removeParkingLot(uUID50);
        models.parkingLot.ParkingLot parkingLot53 = parkingLotRepository47.getParkingLotByName("hi!");
        boolean boolean54 = parkingLotRepository44.disableParkingLot(parkingLot53);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList55 = parkingSpaceRepository31.getEnabledSpaces(parkingLot53);
        models.parkingSpace.ParkingSpace parkingSpace57 = parkingSpaceRepository23.addParkingSpace(parkingLot53, "hi!");
        parkingSpaceRepository8.removeParkingSpace(parkingSpace57);
        parkingSpaceRepository0.removeParkingSpace(parkingSpace57);
        repositories.ParkingSpaceRepository parkingSpaceRepository60 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot61 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList62 = parkingSpaceRepository60.getBookedSpaces(parkingLot61);
        java.util.UUID uUID63 = null;
        models.parkingSpace.ParkingSpace parkingSpace64 = parkingSpaceRepository60.getParkingSpaceById(uUID63);
        models.parkingLot.ParkingLot parkingLot65 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList66 = parkingSpaceRepository60.getBookedSpaces(parkingLot65);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList67 = parkingSpaceRepository60.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository68 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot69 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList70 = parkingSpaceRepository68.getBookedSpaces(parkingLot69);
        java.util.UUID uUID71 = null;
        models.parkingSpace.ParkingSpace parkingSpace72 = parkingSpaceRepository68.getParkingSpaceById(uUID71);
        models.parkingLot.ParkingLot parkingLot73 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList74 = parkingSpaceRepository68.getAvailableSpaces(parkingLot73);
        java.util.UUID uUID75 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList76 = parkingSpaceRepository68.getSpacesForLot(uUID75);
        models.parkingLot.ParkingLot parkingLot77 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList78 = parkingSpaceRepository68.getAvailableSpaces(parkingLot77);
        models.parkingLot.ParkingLot parkingLot79 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList80 = parkingSpaceRepository68.getDisabledSpaces(parkingLot79);
        repositories.ParkingLotRepository parkingLotRepository81 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList82 = parkingLotRepository81.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList83 = parkingLotRepository81.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository84 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot86 = parkingLotRepository84.getParkingLotByName("hi!");
        java.util.UUID uUID87 = null;
        parkingLotRepository84.removeParkingLot(uUID87);
        models.parkingLot.ParkingLot parkingLot90 = parkingLotRepository84.getParkingLotByName("hi!");
        boolean boolean91 = parkingLotRepository81.disableParkingLot(parkingLot90);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList92 = parkingSpaceRepository68.getEnabledSpaces(parkingLot90);
        models.parkingSpace.ParkingSpace parkingSpace94 = parkingSpaceRepository60.addParkingSpace(parkingLot90, "hi!");
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus95 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace96 = parkingSpaceRepository0.updateParkingSpaceStatus(parkingSpace94, parkingSpaceStatus95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parking space with ID 82d184fd-db80-4b42-b310-4318b9400b02 does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace94);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getEnabledSpaces(parkingLot1);
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot4 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = parkingSpaceRepository3.getBookedSpaces(parkingLot4);
        java.util.UUID uUID6 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSpaceRepository3.getParkingSpaceByID(uUID6);
        repositories.ParkingLotRepository parkingLotRepository8 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList9 = parkingLotRepository8.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList10 = parkingLotRepository8.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository11 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot13 = parkingLotRepository11.getParkingLotByName("hi!");
        java.util.UUID uUID14 = null;
        parkingLotRepository11.removeParkingLot(uUID14);
        models.parkingLot.ParkingLot parkingLot17 = parkingLotRepository11.getParkingLotByName("hi!");
        boolean boolean18 = parkingLotRepository8.disableParkingLot(parkingLot17);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList19 = parkingSpaceRepository3.getEnabledSpaces(parkingLot17);
        models.parkingSpace.ParkingSpace parkingSpace21 = parkingSpaceRepository0.addParkingSpace(parkingLot17, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace21);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot4 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = parkingSpaceRepository3.getBookedSpaces(parkingLot4);
        java.util.UUID uUID6 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSpaceRepository3.getParkingSpaceById(uUID6);
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository3.getAvailableSpaces(parkingLot8);
        java.util.UUID uUID10 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList11 = parkingSpaceRepository3.getSpacesForLot(uUID10);
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository3.getAvailableSpaces(parkingLot12);
        models.parkingLot.ParkingLot parkingLot14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository3.getDisabledSpaces(parkingLot14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository3.getBookedSpaces(parkingLot16);
        repositories.ParkingSpaceRepository parkingSpaceRepository18 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository18.getBookedSpaces(parkingLot19);
        java.util.UUID uUID21 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = parkingSpaceRepository18.getParkingSpaceById(uUID21);
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository18.getBookedSpaces(parkingLot23);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository18.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository26 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository26.getBookedSpaces(parkingLot27);
        java.util.UUID uUID29 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = parkingSpaceRepository26.getParkingSpaceById(uUID29);
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository26.getAvailableSpaces(parkingLot31);
        java.util.UUID uUID33 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository26.getSpacesForLot(uUID33);
        models.parkingLot.ParkingLot parkingLot35 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList36 = parkingSpaceRepository26.getAvailableSpaces(parkingLot35);
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository26.getDisabledSpaces(parkingLot37);
        repositories.ParkingLotRepository parkingLotRepository39 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList40 = parkingLotRepository39.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList41 = parkingLotRepository39.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository42 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot44 = parkingLotRepository42.getParkingLotByName("hi!");
        java.util.UUID uUID45 = null;
        parkingLotRepository42.removeParkingLot(uUID45);
        models.parkingLot.ParkingLot parkingLot48 = parkingLotRepository42.getParkingLotByName("hi!");
        boolean boolean49 = parkingLotRepository39.disableParkingLot(parkingLot48);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList50 = parkingSpaceRepository26.getEnabledSpaces(parkingLot48);
        models.parkingSpace.ParkingSpace parkingSpace52 = parkingSpaceRepository18.addParkingSpace(parkingLot48, "hi!");
        parkingSpaceRepository3.removeParkingSpace(parkingSpace52);
        models.booking.Booking booking54 = bookingRepository0.getActiveBookingForSpace(parkingSpace52);
        java.lang.Class<?> wildcardClass55 = bookingRepository0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        clientRepository0.deleteClient("");
        clientRepository0.deleteClient("hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        boolean boolean6 = managerRepository0.removeManager("hi!");
        java.util.List<models.manager.Manager> managerList7 = managerRepository0.getAllManagers();
        models.manager.Manager manager8 = null;
        boolean boolean9 = managerRepository0.addManager(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        java.util.List<models.payment.Payment> paymentList4 = paymentRepository0.getAllPayments();
        models.payment.Payment payment5 = null;
        paymentRepository0.removePayment(payment5);
        models.payment.Payment payment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.processPayment(payment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.payment.Payment.processPayment()\" because \"payment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        java.util.UUID uUID1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = parkingSpaceRepository0.getParkingSpaceById(uUID1);
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot4 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = parkingSpaceRepository3.getBookedSpaces(parkingLot4);
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = new repositories.ParkingSpaceRepository();
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository7.getBookedSpaces(parkingLot8);
        java.util.UUID uUID10 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSpaceRepository7.getParkingSpaceById(uUID10);
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository7.getBookedSpaces(parkingLot12);
        java.util.UUID uUID14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository7.getSpacesForLot(uUID14);
        repositories.ParkingLotRepository parkingLotRepository16 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList17 = parkingLotRepository16.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList18 = parkingLotRepository16.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository19 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot21 = parkingLotRepository19.getParkingLotByName("hi!");
        java.util.UUID uUID22 = null;
        parkingLotRepository19.removeParkingLot(uUID22);
        models.parkingLot.ParkingLot parkingLot25 = parkingLotRepository19.getParkingLotByName("hi!");
        boolean boolean26 = parkingLotRepository16.disableParkingLot(parkingLot25);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList27 = parkingSpaceRepository7.getDisabledSpaces(parkingLot25);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository6.getDisabledSpaces(parkingLot25);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository3.getDisabledSpaces(parkingLot25);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList30 = parkingSpaceRepository0.getAvailableSpaces(parkingLot25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList30);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getBookedSpaces(parkingLot5);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository0.getAllSpaces();
        java.util.UUID uUID8 = null;
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSpaceRepository0.getParkingSpaceById(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot4 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = parkingSpaceRepository3.getBookedSpaces(parkingLot4);
        java.util.UUID uUID6 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSpaceRepository3.getParkingSpaceById(uUID6);
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository3.getAvailableSpaces(parkingLot8);
        java.util.UUID uUID10 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList11 = parkingSpaceRepository3.getSpacesForLot(uUID10);
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository3.getAvailableSpaces(parkingLot12);
        models.parkingLot.ParkingLot parkingLot14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository3.getDisabledSpaces(parkingLot14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository3.getBookedSpaces(parkingLot16);
        repositories.ParkingSpaceRepository parkingSpaceRepository18 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository18.getBookedSpaces(parkingLot19);
        java.util.UUID uUID21 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = parkingSpaceRepository18.getParkingSpaceById(uUID21);
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository18.getBookedSpaces(parkingLot23);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository18.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository26 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository26.getBookedSpaces(parkingLot27);
        java.util.UUID uUID29 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = parkingSpaceRepository26.getParkingSpaceById(uUID29);
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository26.getAvailableSpaces(parkingLot31);
        java.util.UUID uUID33 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository26.getSpacesForLot(uUID33);
        models.parkingLot.ParkingLot parkingLot35 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList36 = parkingSpaceRepository26.getAvailableSpaces(parkingLot35);
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository26.getDisabledSpaces(parkingLot37);
        repositories.ParkingLotRepository parkingLotRepository39 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList40 = parkingLotRepository39.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList41 = parkingLotRepository39.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository42 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot44 = parkingLotRepository42.getParkingLotByName("hi!");
        java.util.UUID uUID45 = null;
        parkingLotRepository42.removeParkingLot(uUID45);
        models.parkingLot.ParkingLot parkingLot48 = parkingLotRepository42.getParkingLotByName("hi!");
        boolean boolean49 = parkingLotRepository39.disableParkingLot(parkingLot48);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList50 = parkingSpaceRepository26.getEnabledSpaces(parkingLot48);
        models.parkingSpace.ParkingSpace parkingSpace52 = parkingSpaceRepository18.addParkingSpace(parkingLot48, "hi!");
        parkingSpaceRepository3.removeParkingSpace(parkingSpace52);
        parkingSpaceRepository0.removeParkingSpace(parkingSpace52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace52);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.confirmBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getAllBookings();
        models.booking.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkInBooking(booking7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        java.util.UUID uUID1 = null;
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotById(uUID1);
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllEnabledParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        java.util.UUID uUID1 = null;
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotById(uUID1);
        java.util.UUID uUID3 = null;
        parkingLotRepository0.removeParkingLot(uUID3);
        java.util.UUID uUID5 = null;
        parkingLotRepository0.removeParkingLot(uUID5);
        models.parkingLot.ParkingLot parkingLot8 = parkingLotRepository0.getParkingLotByName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkInBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        boolean boolean6 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager9 = managerRepository0.authenticateManager("", "");
        models.manager.Manager manager11 = managerRepository0.getManagerByEmail("");
        models.manager.Manager manager12 = null;
        boolean boolean13 = managerRepository0.addManager(manager12);
        boolean boolean15 = managerRepository0.removeManager("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        models.parkingSensor.ParkingSensor parkingSensor3 = null;
        parkingSensorRepository0.updateSensor(parkingSensor3);
        java.util.UUID uUID5 = null;
        models.parkingSensor.ParkingSensor parkingSensor6 = parkingSensorRepository0.getSensorBySpaceId(uUID5);
        models.parkingSpace.ParkingSpace parkingSpace7 = null;
        models.parkingSensor.ParkingSensor parkingSensor8 = parkingSensorRepository0.createSensor(parkingSpace7);
        parkingSensorRepository0.saveSensors();
        java.util.UUID uUID10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSensor.ParkingSensor parkingSensor11 = parkingSensorRepository0.getSensorBySpaceId(uUID10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because the return value of \"models.parkingSensor.ParkingSensor.getParkingSpace()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        models.client.Client client3 = clientRepository0.authenticateClient("hi!", "");
        clientRepository0.saveClients();
        models.client.Client client6 = clientRepository0.getClientByEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsOverstayed(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.saveClients();
        models.client.Client client4 = clientRepository0.authenticateClient("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkInBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking8 = null;
        java.util.List<models.payment.Payment> paymentList9 = paymentRepository0.getPaymentsForBooking(booking8);
        models.payment.Payment payment10 = null;
        paymentRepository0.removePayment(payment10);
        models.payment.Payment payment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentRepository0.processPayment(payment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.payment.Payment.processPayment()\" because \"payment\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceById(uUID5);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository0.getAllSpaces();
        java.util.UUID uUID8 = null;
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSpaceRepository0.getParkingSpaceByID(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceByID(uUID3);
        java.util.UUID uUID5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getSpacesForLot(uUID5);
        java.util.UUID uUID7 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = parkingSpaceRepository0.getParkingSpaceByID(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllEnabledParkingLots();
        models.parkingLot.ParkingLot parkingLot7 = parkingLotRepository0.getParkingLotByName("");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList8 = parkingLotRepository0.getAllEnabledParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList6 = parkingLotRepository0.getAllDisabledParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        models.parkingSensor.ParkingSensor parkingSensor3 = null;
        parkingSensorRepository0.updateSensor(parkingSensor3);
        java.util.UUID uUID5 = null;
        models.parkingSensor.ParkingSensor parkingSensor6 = parkingSensorRepository0.getSensorBySpaceId(uUID5);
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList7 = parkingSensorRepository0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceByID(uUID5);
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getAvailableSpaces(parkingLot7);
        java.util.UUID uUID9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository0.getSpacesForLot(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        boolean boolean6 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager9 = managerRepository0.authenticateManager("", "");
        java.util.List<models.manager.Manager> managerList10 = managerRepository0.getAllManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("");
        models.manager.Manager manager5 = managerRepository0.authenticateManager("hi!", "hi!");
        models.manager.Manager manager8 = managerRepository0.authenticateManager("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        boolean boolean4 = managerRepository0.removeManager("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        models.parkingSensor.ParkingSensor parkingSensor3 = null;
        parkingSensorRepository0.updateSensor(parkingSensor3);
        java.util.UUID uUID5 = null;
        models.parkingSensor.ParkingSensor parkingSensor6 = parkingSensorRepository0.getSensorBySpaceId(uUID5);
        repositories.ParkingSensorRepository parkingSensorRepository7 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository7.getSensorBySpaceId(uUID8);
        repositories.ParkingSensorRepository parkingSensorRepository10 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID11 = null;
        models.parkingSensor.ParkingSensor parkingSensor12 = parkingSensorRepository10.getSensorBySpaceId(uUID11);
        models.parkingSensor.ParkingSensor parkingSensor13 = null;
        parkingSensorRepository10.updateSensor(parkingSensor13);
        java.util.UUID uUID15 = null;
        models.parkingSensor.ParkingSensor parkingSensor16 = parkingSensorRepository10.getSensorBySpaceId(uUID15);
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.parkingSensor.ParkingSensor parkingSensor18 = parkingSensorRepository10.createSensor(parkingSpace17);
        parkingSensorRepository7.updateSensor(parkingSensor18);
        parkingSensorRepository0.updateSensor(parkingSensor18);
        repositories.ParkingSpaceRepository parkingSpaceRepository21 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList23 = parkingSpaceRepository21.getBookedSpaces(parkingLot22);
        java.util.UUID uUID24 = null;
        models.parkingSpace.ParkingSpace parkingSpace25 = parkingSpaceRepository21.getParkingSpaceById(uUID24);
        models.parkingLot.ParkingLot parkingLot26 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList27 = parkingSpaceRepository21.getAvailableSpaces(parkingLot26);
        java.util.UUID uUID28 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository21.getSpacesForLot(uUID28);
        models.parkingLot.ParkingLot parkingLot30 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList31 = parkingSpaceRepository21.getAvailableSpaces(parkingLot30);
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository21.getDisabledSpaces(parkingLot32);
        models.parkingLot.ParkingLot parkingLot34 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList35 = parkingSpaceRepository21.getBookedSpaces(parkingLot34);
        repositories.ParkingSpaceRepository parkingSpaceRepository36 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository36.getBookedSpaces(parkingLot37);
        java.util.UUID uUID39 = null;
        models.parkingSpace.ParkingSpace parkingSpace40 = parkingSpaceRepository36.getParkingSpaceById(uUID39);
        models.parkingLot.ParkingLot parkingLot41 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList42 = parkingSpaceRepository36.getBookedSpaces(parkingLot41);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList43 = parkingSpaceRepository36.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository44 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot45 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList46 = parkingSpaceRepository44.getBookedSpaces(parkingLot45);
        java.util.UUID uUID47 = null;
        models.parkingSpace.ParkingSpace parkingSpace48 = parkingSpaceRepository44.getParkingSpaceById(uUID47);
        models.parkingLot.ParkingLot parkingLot49 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList50 = parkingSpaceRepository44.getAvailableSpaces(parkingLot49);
        java.util.UUID uUID51 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList52 = parkingSpaceRepository44.getSpacesForLot(uUID51);
        models.parkingLot.ParkingLot parkingLot53 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList54 = parkingSpaceRepository44.getAvailableSpaces(parkingLot53);
        models.parkingLot.ParkingLot parkingLot55 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList56 = parkingSpaceRepository44.getDisabledSpaces(parkingLot55);
        repositories.ParkingLotRepository parkingLotRepository57 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList58 = parkingLotRepository57.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList59 = parkingLotRepository57.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository60 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot62 = parkingLotRepository60.getParkingLotByName("hi!");
        java.util.UUID uUID63 = null;
        parkingLotRepository60.removeParkingLot(uUID63);
        models.parkingLot.ParkingLot parkingLot66 = parkingLotRepository60.getParkingLotByName("hi!");
        boolean boolean67 = parkingLotRepository57.disableParkingLot(parkingLot66);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList68 = parkingSpaceRepository44.getEnabledSpaces(parkingLot66);
        models.parkingSpace.ParkingSpace parkingSpace70 = parkingSpaceRepository36.addParkingSpace(parkingLot66, "hi!");
        parkingSpaceRepository21.removeParkingSpace(parkingSpace70);
        models.parkingSensor.ParkingSensor parkingSensor72 = parkingSensorRepository0.createSensor(parkingSpace70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor72);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getAllBookings();
        models.parkingSpace.ParkingSpace parkingSpace6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingRepository0.getActiveBookingForSpace(parkingSpace6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceByID(uUID5);
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getAvailableSpaces(parkingLot7);
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository0.getBookedSpaces(parkingLot9);
        java.util.UUID uUID11 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository0.getSpacesForLot(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList1 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.UUID uUID2 = null;
        parkingLotRepository0.removeParkingLot(uUID2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        models.parkingLot.ParkingLot parkingLot4 = parkingLotRepository0.getParkingLotByName("");
        models.parkingLot.ParkingLot parkingLot6 = parkingLotRepository0.getParkingLotByName("hi!");
        java.lang.Class<?> wildcardClass7 = parkingLotRepository0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.confirmBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        java.util.List<models.payment.Payment> paymentList4 = paymentRepository0.getAllPayments();
        models.booking.Booking booking5 = null;
        java.util.List<models.payment.Payment> paymentList6 = paymentRepository0.getPaymentsForBooking(booking5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment10 = paymentRepository0.createFinalPayment((double) (byte) 100, booking8, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getBookedSpaces(parkingLot5);
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository7.getBookedSpaces(parkingLot8);
        models.parkingLot.ParkingLot parkingLot10 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList11 = parkingSpaceRepository7.getBookedSpaces(parkingLot10);
        java.util.UUID uUID12 = null;
        models.parkingSpace.ParkingSpace parkingSpace13 = parkingSpaceRepository7.getParkingSpaceById(uUID12);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository7.getAllSpaces();
        repositories.ParkingLotRepository parkingLotRepository15 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot17 = parkingLotRepository15.getParkingLotByName("hi!");
        java.util.UUID uUID18 = null;
        parkingLotRepository15.removeParkingLot(uUID18);
        models.parkingLot.ParkingLot parkingLot21 = parkingLotRepository15.getParkingLotByName("hi!");
        models.parkingSpace.ParkingSpace parkingSpace23 = parkingSpaceRepository7.addParkingSpace(parkingLot21, "hi!");
        models.parkingSpace.ParkingSpace parkingSpace25 = parkingSpaceRepository0.addParkingSpace(parkingLot21, "hi!");
        repositories.BookingRepository bookingRepository26 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList27 = bookingRepository26.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList28 = bookingRepository26.getAllBookings();
        repositories.ParkingSensorRepository parkingSensorRepository29 = new repositories.ParkingSensorRepository();
        models.parkingSensor.ParkingSensor parkingSensor30 = null;
        parkingSensorRepository29.updateSensor(parkingSensor30);
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList32 = parkingSensorRepository29.getAllSensors();
        models.parkingSensor.ParkingSensor parkingSensor33 = null;
        parkingSensorRepository29.updateSensor(parkingSensor33);
        java.util.UUID uUID35 = null;
        models.parkingSensor.ParkingSensor parkingSensor36 = parkingSensorRepository29.getSensorBySpaceId(uUID35);
        repositories.ParkingSpaceRepository parkingSpaceRepository37 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot38 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList39 = parkingSpaceRepository37.getBookedSpaces(parkingLot38);
        java.util.UUID uUID40 = null;
        models.parkingSpace.ParkingSpace parkingSpace41 = parkingSpaceRepository37.getParkingSpaceById(uUID40);
        models.parkingLot.ParkingLot parkingLot42 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList43 = parkingSpaceRepository37.getAvailableSpaces(parkingLot42);
        java.util.UUID uUID44 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList45 = parkingSpaceRepository37.getSpacesForLot(uUID44);
        models.parkingLot.ParkingLot parkingLot46 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList47 = parkingSpaceRepository37.getAvailableSpaces(parkingLot46);
        models.parkingLot.ParkingLot parkingLot48 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList49 = parkingSpaceRepository37.getDisabledSpaces(parkingLot48);
        models.parkingLot.ParkingLot parkingLot50 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList51 = parkingSpaceRepository37.getBookedSpaces(parkingLot50);
        repositories.ParkingSpaceRepository parkingSpaceRepository52 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot53 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList54 = parkingSpaceRepository52.getBookedSpaces(parkingLot53);
        java.util.UUID uUID55 = null;
        models.parkingSpace.ParkingSpace parkingSpace56 = parkingSpaceRepository52.getParkingSpaceById(uUID55);
        models.parkingLot.ParkingLot parkingLot57 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList58 = parkingSpaceRepository52.getBookedSpaces(parkingLot57);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList59 = parkingSpaceRepository52.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository60 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot61 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList62 = parkingSpaceRepository60.getBookedSpaces(parkingLot61);
        java.util.UUID uUID63 = null;
        models.parkingSpace.ParkingSpace parkingSpace64 = parkingSpaceRepository60.getParkingSpaceById(uUID63);
        models.parkingLot.ParkingLot parkingLot65 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList66 = parkingSpaceRepository60.getAvailableSpaces(parkingLot65);
        java.util.UUID uUID67 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList68 = parkingSpaceRepository60.getSpacesForLot(uUID67);
        models.parkingLot.ParkingLot parkingLot69 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList70 = parkingSpaceRepository60.getAvailableSpaces(parkingLot69);
        models.parkingLot.ParkingLot parkingLot71 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList72 = parkingSpaceRepository60.getDisabledSpaces(parkingLot71);
        repositories.ParkingLotRepository parkingLotRepository73 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList74 = parkingLotRepository73.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList75 = parkingLotRepository73.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository76 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot78 = parkingLotRepository76.getParkingLotByName("hi!");
        java.util.UUID uUID79 = null;
        parkingLotRepository76.removeParkingLot(uUID79);
        models.parkingLot.ParkingLot parkingLot82 = parkingLotRepository76.getParkingLotByName("hi!");
        boolean boolean83 = parkingLotRepository73.disableParkingLot(parkingLot82);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList84 = parkingSpaceRepository60.getEnabledSpaces(parkingLot82);
        models.parkingSpace.ParkingSpace parkingSpace86 = parkingSpaceRepository52.addParkingSpace(parkingLot82, "hi!");
        parkingSpaceRepository37.removeParkingSpace(parkingSpace86);
        parkingSensorRepository29.removeSensor(parkingSpace86);
        models.booking.Booking booking89 = bookingRepository26.getActiveBookingForSpace(parkingSpace86);
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus90 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace91 = parkingSpaceRepository0.updateParkingSpaceStatus(parkingSpace86, parkingSpaceStatus90);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parking space with ID 75a44445-81dc-4f3c-81a2-7147c4ea0fea does not exist.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking89);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.UUID uUID5 = null;
        models.payment.Payment payment6 = paymentRepository0.getPaymentByID(uUID5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment10 = paymentRepository0.createFinalPayment((double) (short) -1, booking8, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllEnabledParkingLots();
        java.util.UUID uUID6 = null;
        parkingLotRepository0.removeParkingLot(uUID6);
        java.util.List<models.parkingLot.ParkingLot> parkingLotList8 = parkingLotRepository0.getAllParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        models.parkingSensor.ParkingSensor parkingSensor4 = null;
        parkingSensorRepository3.updateSensor(parkingSensor4);
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList6 = parkingSensorRepository3.getAllSensors();
        models.parkingSensor.ParkingSensor parkingSensor7 = null;
        parkingSensorRepository3.updateSensor(parkingSensor7);
        java.util.UUID uUID9 = null;
        models.parkingSensor.ParkingSensor parkingSensor10 = parkingSensorRepository3.getSensorBySpaceId(uUID9);
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository11.getBookedSpaces(parkingLot12);
        java.util.UUID uUID14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = parkingSpaceRepository11.getParkingSpaceById(uUID14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository11.getAvailableSpaces(parkingLot16);
        java.util.UUID uUID18 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList19 = parkingSpaceRepository11.getSpacesForLot(uUID18);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository11.getAvailableSpaces(parkingLot20);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList23 = parkingSpaceRepository11.getDisabledSpaces(parkingLot22);
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository11.getBookedSpaces(parkingLot24);
        repositories.ParkingSpaceRepository parkingSpaceRepository26 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository26.getBookedSpaces(parkingLot27);
        java.util.UUID uUID29 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = parkingSpaceRepository26.getParkingSpaceById(uUID29);
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository26.getBookedSpaces(parkingLot31);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository26.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository34 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot35 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList36 = parkingSpaceRepository34.getBookedSpaces(parkingLot35);
        java.util.UUID uUID37 = null;
        models.parkingSpace.ParkingSpace parkingSpace38 = parkingSpaceRepository34.getParkingSpaceById(uUID37);
        models.parkingLot.ParkingLot parkingLot39 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList40 = parkingSpaceRepository34.getAvailableSpaces(parkingLot39);
        java.util.UUID uUID41 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList42 = parkingSpaceRepository34.getSpacesForLot(uUID41);
        models.parkingLot.ParkingLot parkingLot43 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList44 = parkingSpaceRepository34.getAvailableSpaces(parkingLot43);
        models.parkingLot.ParkingLot parkingLot45 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList46 = parkingSpaceRepository34.getDisabledSpaces(parkingLot45);
        repositories.ParkingLotRepository parkingLotRepository47 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList48 = parkingLotRepository47.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList49 = parkingLotRepository47.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository50 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot52 = parkingLotRepository50.getParkingLotByName("hi!");
        java.util.UUID uUID53 = null;
        parkingLotRepository50.removeParkingLot(uUID53);
        models.parkingLot.ParkingLot parkingLot56 = parkingLotRepository50.getParkingLotByName("hi!");
        boolean boolean57 = parkingLotRepository47.disableParkingLot(parkingLot56);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList58 = parkingSpaceRepository34.getEnabledSpaces(parkingLot56);
        models.parkingSpace.ParkingSpace parkingSpace60 = parkingSpaceRepository26.addParkingSpace(parkingLot56, "hi!");
        parkingSpaceRepository11.removeParkingSpace(parkingSpace60);
        parkingSensorRepository3.removeSensor(parkingSpace60);
        models.booking.Booking booking63 = bookingRepository0.getActiveBookingForSpace(parkingSpace60);
        models.booking.Booking booking64 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking64);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking63);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        models.parkingSensor.ParkingSensor parkingSensor1 = null;
        parkingSensorRepository0.updateSensor(parkingSensor1);
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList3 = parkingSensorRepository0.getAllSensors();
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList4 = parkingSensorRepository0.getAllSensors();
        repositories.ParkingSensorRepository parkingSensorRepository5 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID6 = null;
        models.parkingSensor.ParkingSensor parkingSensor7 = parkingSensorRepository5.getSensorBySpaceId(uUID6);
        repositories.ParkingSensorRepository parkingSensorRepository8 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID9 = null;
        models.parkingSensor.ParkingSensor parkingSensor10 = parkingSensorRepository8.getSensorBySpaceId(uUID9);
        models.parkingSensor.ParkingSensor parkingSensor11 = null;
        parkingSensorRepository8.updateSensor(parkingSensor11);
        java.util.UUID uUID13 = null;
        models.parkingSensor.ParkingSensor parkingSensor14 = parkingSensorRepository8.getSensorBySpaceId(uUID13);
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.parkingSensor.ParkingSensor parkingSensor16 = parkingSensorRepository8.createSensor(parkingSpace15);
        parkingSensorRepository5.updateSensor(parkingSensor16);
        repositories.ParkingSensorRepository parkingSensorRepository18 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID19 = null;
        models.parkingSensor.ParkingSensor parkingSensor20 = parkingSensorRepository18.getSensorBySpaceId(uUID19);
        repositories.ParkingSensorRepository parkingSensorRepository21 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID22 = null;
        models.parkingSensor.ParkingSensor parkingSensor23 = parkingSensorRepository21.getSensorBySpaceId(uUID22);
        models.parkingSensor.ParkingSensor parkingSensor24 = null;
        parkingSensorRepository21.updateSensor(parkingSensor24);
        java.util.UUID uUID26 = null;
        models.parkingSensor.ParkingSensor parkingSensor27 = parkingSensorRepository21.getSensorBySpaceId(uUID26);
        models.parkingSpace.ParkingSpace parkingSpace28 = null;
        models.parkingSensor.ParkingSensor parkingSensor29 = parkingSensorRepository21.createSensor(parkingSpace28);
        parkingSensorRepository18.updateSensor(parkingSensor29);
        parkingSensorRepository5.updateSensor(parkingSensor29);
        parkingSensorRepository0.updateSensor(parkingSensor29);
        java.util.UUID uUID33 = null;
        models.parkingSensor.ParkingSensor parkingSensor34 = parkingSensorRepository0.getSensorBySpaceId(uUID33);
        java.util.UUID uUID35 = null;
        models.parkingSensor.ParkingSensor parkingSensor36 = parkingSensorRepository0.getSensorBySpaceId(uUID35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor36);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.completeBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        java.util.List<models.payment.Payment> paymentList1 = paymentRepository0.getAllPayments();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllEnabledParkingLots();
        models.parkingLot.ParkingLot parkingLot6 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = parkingLotRepository0.getParkingLotById(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        java.util.List<models.payment.Payment> paymentList4 = paymentRepository0.getAllPayments();
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment7 = paymentRepository0.createRefundPayment(booking5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot4 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = parkingSpaceRepository3.getBookedSpaces(parkingLot4);
        java.util.UUID uUID6 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSpaceRepository3.getParkingSpaceById(uUID6);
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository3.getAvailableSpaces(parkingLot8);
        java.util.UUID uUID10 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList11 = parkingSpaceRepository3.getSpacesForLot(uUID10);
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository3.getAvailableSpaces(parkingLot12);
        models.parkingLot.ParkingLot parkingLot14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository3.getDisabledSpaces(parkingLot14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository3.getBookedSpaces(parkingLot16);
        repositories.ParkingSpaceRepository parkingSpaceRepository18 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository18.getBookedSpaces(parkingLot19);
        java.util.UUID uUID21 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = parkingSpaceRepository18.getParkingSpaceById(uUID21);
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository18.getBookedSpaces(parkingLot23);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository18.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository26 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository26.getBookedSpaces(parkingLot27);
        java.util.UUID uUID29 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = parkingSpaceRepository26.getParkingSpaceById(uUID29);
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository26.getAvailableSpaces(parkingLot31);
        java.util.UUID uUID33 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository26.getSpacesForLot(uUID33);
        models.parkingLot.ParkingLot parkingLot35 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList36 = parkingSpaceRepository26.getAvailableSpaces(parkingLot35);
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository26.getDisabledSpaces(parkingLot37);
        repositories.ParkingLotRepository parkingLotRepository39 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList40 = parkingLotRepository39.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList41 = parkingLotRepository39.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository42 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot44 = parkingLotRepository42.getParkingLotByName("hi!");
        java.util.UUID uUID45 = null;
        parkingLotRepository42.removeParkingLot(uUID45);
        models.parkingLot.ParkingLot parkingLot48 = parkingLotRepository42.getParkingLotByName("hi!");
        boolean boolean49 = parkingLotRepository39.disableParkingLot(parkingLot48);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList50 = parkingSpaceRepository26.getEnabledSpaces(parkingLot48);
        models.parkingSpace.ParkingSpace parkingSpace52 = parkingSpaceRepository18.addParkingSpace(parkingLot48, "hi!");
        parkingSpaceRepository3.removeParkingSpace(parkingSpace52);
        models.booking.Booking booking54 = bookingRepository0.getActiveBookingForSpace(parkingSpace52);
        models.booking.Booking booking55 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.noShowBooking(booking55);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking54);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllEnabledParkingLots();
        models.parkingLot.ParkingLot parkingLot7 = parkingLotRepository0.getParkingLotByName("");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList8 = parkingLotRepository0.getAllParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        models.client.Client client3 = clientRepository0.authenticateClient("hi!", "");
        models.client.Client client5 = clientRepository0.getClientByLicensePlate("hi!");
        clientRepository0.deleteClient("hi!");
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        models.manager.Manager manager3 = managerRepository0.authenticateManager("", "hi!");
        models.manager.Manager manager6 = managerRepository0.authenticateManager("", "hi!");
        boolean boolean8 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager9 = null;
        boolean boolean10 = managerRepository0.addManager(manager9);
        boolean boolean12 = managerRepository0.removeManager("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkOutBooking(booking4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking5 = bookingRepository0.getActiveBookingForSpace(parkingSpace4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        models.manager.Manager manager3 = managerRepository0.authenticateManager("", "hi!");
        models.manager.Manager manager6 = managerRepository0.authenticateManager("", "hi!");
        boolean boolean8 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager11 = managerRepository0.authenticateManager("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getAllBookings();
        models.booking.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.deleteBooking(booking7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getBookedSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpaceRepository0.removeParkingSpace(parkingSpace9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Parking Space can't be null!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        boolean boolean6 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager9 = managerRepository0.authenticateManager("", "");
        models.manager.Manager manager11 = managerRepository0.getManagerByEmail("");
        boolean boolean13 = managerRepository0.removeManager("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        java.util.UUID uUID4 = null;
        models.payment.Payment payment5 = paymentRepository0.getPaymentByID(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment7 = paymentRepository0.createFinalPayment(0.0d, booking5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager3 = null;
        boolean boolean4 = managerRepository0.addManager(manager3);
        boolean boolean6 = managerRepository0.removeManager("hi!");
        java.util.List<models.manager.Manager> managerList7 = managerRepository0.getAllManagers();
        boolean boolean9 = managerRepository0.removeManager("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.UUID uUID3 = null;
        parkingLotRepository0.removeParkingLot(uUID3);
        java.util.UUID uUID5 = null;
        models.parkingLot.ParkingLot parkingLot6 = parkingLotRepository0.getParkingLotById(uUID5);
        models.parkingLot.ParkingLot parkingLot8 = parkingLotRepository0.getParkingLotByName("");
        java.util.UUID uUID9 = null;
        models.parkingLot.ParkingLot parkingLot10 = parkingLotRepository0.getParkingLotById(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository3.getSensorBySpaceId(uUID4);
        models.parkingSensor.ParkingSensor parkingSensor6 = null;
        parkingSensorRepository3.updateSensor(parkingSensor6);
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository3.getSensorBySpaceId(uUID8);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.parkingSensor.ParkingSensor parkingSensor11 = parkingSensorRepository3.createSensor(parkingSpace10);
        parkingSensorRepository0.updateSensor(parkingSensor11);
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList13 = parkingSensorRepository0.getAllSensors();
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot15 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList16 = parkingSpaceRepository14.getBookedSpaces(parkingLot15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository14.getBookedSpaces(parkingLot17);
        java.util.UUID uUID19 = null;
        models.parkingSpace.ParkingSpace parkingSpace20 = parkingSpaceRepository14.getParkingSpaceById(uUID19);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository14.getAllSpaces();
        repositories.ParkingLotRepository parkingLotRepository22 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot24 = parkingLotRepository22.getParkingLotByName("hi!");
        java.util.UUID uUID25 = null;
        parkingLotRepository22.removeParkingLot(uUID25);
        models.parkingLot.ParkingLot parkingLot28 = parkingLotRepository22.getParkingLotByName("hi!");
        models.parkingSpace.ParkingSpace parkingSpace30 = parkingSpaceRepository14.addParkingSpace(parkingLot28, "hi!");
        models.parkingSensor.ParkingSensor parkingSensor31 = parkingSensorRepository0.createSensor(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor31);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        models.client.Client client5 = clientRepository0.authenticateClient("hi!", "hi!");
        models.client.Client client8 = clientRepository0.authenticateClient("hi!", "hi!");
        java.util.List<models.client.Client> clientList9 = clientRepository0.getAllClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList9);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository4.getBookedSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = parkingSpaceRepository4.getParkingSpaceById(uUID7);
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository4.getBookedSpaces(parkingLot9);
        java.util.UUID uUID11 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository4.getSpacesForLot(uUID11);
        repositories.ParkingLotRepository parkingLotRepository13 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList14 = parkingLotRepository13.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList15 = parkingLotRepository13.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository16 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot18 = parkingLotRepository16.getParkingLotByName("hi!");
        java.util.UUID uUID19 = null;
        parkingLotRepository16.removeParkingLot(uUID19);
        models.parkingLot.ParkingLot parkingLot22 = parkingLotRepository16.getParkingLotByName("hi!");
        boolean boolean23 = parkingLotRepository13.disableParkingLot(parkingLot22);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository4.getDisabledSpaces(parkingLot22);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository3.getDisabledSpaces(parkingLot22);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList26 = parkingSpaceRepository0.getDisabledSpaces(parkingLot22);
        java.util.UUID uUID27 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository0.getSpacesForLot(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        models.client.Client client4 = clientRepository0.getClientByLicensePlate("hi!");
        java.lang.Class<?> wildcardClass5 = clientRepository0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.noShowBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllEnabledParkingLots();
        java.util.UUID uUID6 = null;
        parkingLotRepository0.removeParkingLot(uUID6);
        java.util.UUID uUID8 = null;
        parkingLotRepository0.removeParkingLot(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("hi!");
        models.client.Client client7 = clientRepository0.authenticateClient("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("");
        models.manager.Manager manager5 = managerRepository0.authenticateManager("hi!", "hi!");
        models.manager.Manager manager7 = managerRepository0.getManagerByEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository3.getSensorBySpaceId(uUID4);
        models.parkingSensor.ParkingSensor parkingSensor6 = null;
        parkingSensorRepository3.updateSensor(parkingSensor6);
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository3.getSensorBySpaceId(uUID8);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.parkingSensor.ParkingSensor parkingSensor11 = parkingSensorRepository3.createSensor(parkingSpace10);
        parkingSensorRepository0.updateSensor(parkingSensor11);
        repositories.ParkingSensorRepository parkingSensorRepository13 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID14 = null;
        models.parkingSensor.ParkingSensor parkingSensor15 = parkingSensorRepository13.getSensorBySpaceId(uUID14);
        models.parkingSensor.ParkingSensor parkingSensor16 = null;
        parkingSensorRepository13.updateSensor(parkingSensor16);
        java.util.UUID uUID18 = null;
        models.parkingSensor.ParkingSensor parkingSensor19 = parkingSensorRepository13.getSensorBySpaceId(uUID18);
        models.parkingSpace.ParkingSpace parkingSpace20 = null;
        models.parkingSensor.ParkingSensor parkingSensor21 = parkingSensorRepository13.createSensor(parkingSpace20);
        parkingSensorRepository0.updateSensor(parkingSensor21);
        repositories.ParkingSensorRepository parkingSensorRepository23 = new repositories.ParkingSensorRepository();
        repositories.BookingRepository bookingRepository24 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList25 = bookingRepository24.getConfirmedBookings();
        repositories.ParkingSensorRepository parkingSensorRepository26 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID27 = null;
        models.parkingSensor.ParkingSensor parkingSensor28 = parkingSensorRepository26.getSensorBySpaceId(uUID27);
        models.parkingSensor.ParkingSensor parkingSensor29 = null;
        parkingSensorRepository26.updateSensor(parkingSensor29);
        java.util.UUID uUID31 = null;
        models.parkingSensor.ParkingSensor parkingSensor32 = parkingSensorRepository26.getSensorBySpaceId(uUID31);
        repositories.BookingRepository bookingRepository33 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList34 = bookingRepository33.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList35 = bookingRepository33.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository36 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository36.getBookedSpaces(parkingLot37);
        java.util.UUID uUID39 = null;
        models.parkingSpace.ParkingSpace parkingSpace40 = parkingSpaceRepository36.getParkingSpaceById(uUID39);
        models.parkingLot.ParkingLot parkingLot41 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList42 = parkingSpaceRepository36.getAvailableSpaces(parkingLot41);
        java.util.UUID uUID43 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList44 = parkingSpaceRepository36.getSpacesForLot(uUID43);
        models.parkingLot.ParkingLot parkingLot45 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList46 = parkingSpaceRepository36.getAvailableSpaces(parkingLot45);
        models.parkingLot.ParkingLot parkingLot47 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList48 = parkingSpaceRepository36.getDisabledSpaces(parkingLot47);
        models.parkingLot.ParkingLot parkingLot49 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList50 = parkingSpaceRepository36.getBookedSpaces(parkingLot49);
        repositories.ParkingSpaceRepository parkingSpaceRepository51 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot52 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList53 = parkingSpaceRepository51.getBookedSpaces(parkingLot52);
        java.util.UUID uUID54 = null;
        models.parkingSpace.ParkingSpace parkingSpace55 = parkingSpaceRepository51.getParkingSpaceById(uUID54);
        models.parkingLot.ParkingLot parkingLot56 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList57 = parkingSpaceRepository51.getBookedSpaces(parkingLot56);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList58 = parkingSpaceRepository51.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository59 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot60 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList61 = parkingSpaceRepository59.getBookedSpaces(parkingLot60);
        java.util.UUID uUID62 = null;
        models.parkingSpace.ParkingSpace parkingSpace63 = parkingSpaceRepository59.getParkingSpaceById(uUID62);
        models.parkingLot.ParkingLot parkingLot64 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList65 = parkingSpaceRepository59.getAvailableSpaces(parkingLot64);
        java.util.UUID uUID66 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList67 = parkingSpaceRepository59.getSpacesForLot(uUID66);
        models.parkingLot.ParkingLot parkingLot68 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList69 = parkingSpaceRepository59.getAvailableSpaces(parkingLot68);
        models.parkingLot.ParkingLot parkingLot70 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList71 = parkingSpaceRepository59.getDisabledSpaces(parkingLot70);
        repositories.ParkingLotRepository parkingLotRepository72 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList73 = parkingLotRepository72.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList74 = parkingLotRepository72.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository75 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot77 = parkingLotRepository75.getParkingLotByName("hi!");
        java.util.UUID uUID78 = null;
        parkingLotRepository75.removeParkingLot(uUID78);
        models.parkingLot.ParkingLot parkingLot81 = parkingLotRepository75.getParkingLotByName("hi!");
        boolean boolean82 = parkingLotRepository72.disableParkingLot(parkingLot81);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList83 = parkingSpaceRepository59.getEnabledSpaces(parkingLot81);
        models.parkingSpace.ParkingSpace parkingSpace85 = parkingSpaceRepository51.addParkingSpace(parkingLot81, "hi!");
        parkingSpaceRepository36.removeParkingSpace(parkingSpace85);
        models.booking.Booking booking87 = bookingRepository33.getActiveBookingForSpace(parkingSpace85);
        parkingSensorRepository26.removeSensor(parkingSpace85);
        models.booking.Booking booking89 = bookingRepository24.getActiveBookingForSpace(parkingSpace85);
        parkingSensorRepository23.removeSensor(parkingSpace85);
        models.parkingSensor.ParkingSensor parkingSensor91 = parkingSensorRepository0.createSensor(parkingSpace85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor91);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getBookedSpaces(parkingLot5);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository0.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository8.getBookedSpaces(parkingLot9);
        java.util.UUID uUID11 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = parkingSpaceRepository8.getParkingSpaceById(uUID11);
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository8.getAvailableSpaces(parkingLot13);
        java.util.UUID uUID15 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList16 = parkingSpaceRepository8.getSpacesForLot(uUID15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository8.getAvailableSpaces(parkingLot17);
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository8.getDisabledSpaces(parkingLot19);
        repositories.ParkingLotRepository parkingLotRepository21 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList22 = parkingLotRepository21.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList23 = parkingLotRepository21.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository24 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot26 = parkingLotRepository24.getParkingLotByName("hi!");
        java.util.UUID uUID27 = null;
        parkingLotRepository24.removeParkingLot(uUID27);
        models.parkingLot.ParkingLot parkingLot30 = parkingLotRepository24.getParkingLotByName("hi!");
        boolean boolean31 = parkingLotRepository21.disableParkingLot(parkingLot30);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository8.getEnabledSpaces(parkingLot30);
        models.parkingSpace.ParkingSpace parkingSpace34 = parkingSpaceRepository0.addParkingSpace(parkingLot30, "hi!");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList35 = parkingSpaceRepository0.getAllSpaces();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList35);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot4 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = parkingSpaceRepository3.getBookedSpaces(parkingLot4);
        java.util.UUID uUID6 = null;
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSpaceRepository3.getParkingSpaceById(uUID6);
        models.parkingLot.ParkingLot parkingLot8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository3.getAvailableSpaces(parkingLot8);
        java.util.UUID uUID10 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList11 = parkingSpaceRepository3.getSpacesForLot(uUID10);
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository3.getAvailableSpaces(parkingLot12);
        models.parkingLot.ParkingLot parkingLot14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository3.getDisabledSpaces(parkingLot14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository3.getBookedSpaces(parkingLot16);
        repositories.ParkingSpaceRepository parkingSpaceRepository18 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository18.getBookedSpaces(parkingLot19);
        java.util.UUID uUID21 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = parkingSpaceRepository18.getParkingSpaceById(uUID21);
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository18.getBookedSpaces(parkingLot23);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository18.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository26 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot27 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository26.getBookedSpaces(parkingLot27);
        java.util.UUID uUID29 = null;
        models.parkingSpace.ParkingSpace parkingSpace30 = parkingSpaceRepository26.getParkingSpaceById(uUID29);
        models.parkingLot.ParkingLot parkingLot31 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository26.getAvailableSpaces(parkingLot31);
        java.util.UUID uUID33 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository26.getSpacesForLot(uUID33);
        models.parkingLot.ParkingLot parkingLot35 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList36 = parkingSpaceRepository26.getAvailableSpaces(parkingLot35);
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository26.getDisabledSpaces(parkingLot37);
        repositories.ParkingLotRepository parkingLotRepository39 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList40 = parkingLotRepository39.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList41 = parkingLotRepository39.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository42 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot44 = parkingLotRepository42.getParkingLotByName("hi!");
        java.util.UUID uUID45 = null;
        parkingLotRepository42.removeParkingLot(uUID45);
        models.parkingLot.ParkingLot parkingLot48 = parkingLotRepository42.getParkingLotByName("hi!");
        boolean boolean49 = parkingLotRepository39.disableParkingLot(parkingLot48);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList50 = parkingSpaceRepository26.getEnabledSpaces(parkingLot48);
        models.parkingSpace.ParkingSpace parkingSpace52 = parkingSpaceRepository18.addParkingSpace(parkingLot48, "hi!");
        parkingSpaceRepository3.removeParkingSpace(parkingSpace52);
        models.booking.Booking booking54 = bookingRepository0.getActiveBookingForSpace(parkingSpace52);
        models.booking.Booking booking55 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkInBooking(booking55);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking54);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment8 = paymentRepository0.createRefundPayment(booking6, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.UUID uUID4 = null;
        models.parkingLot.ParkingLot parkingLot5 = parkingLotRepository0.getParkingLotById(uUID4);
        java.util.UUID uUID6 = null;
        parkingLotRepository0.removeParkingLot(uUID6);
        java.util.List<models.parkingLot.ParkingLot> parkingLotList8 = parkingLotRepository0.getAllDisabledParkingLots();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        repositories.ParkingLotRepository parkingLotRepository5 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot7 = parkingLotRepository5.getParkingLotByName("hi!");
        models.parkingLot.ParkingLot parkingLot9 = parkingLotRepository5.getParkingLotByName("");
        models.parkingLot.ParkingLot parkingLot11 = parkingLotRepository5.getParkingLotByName("hi!");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository0.getEnabledSpaces(parkingLot11);
        java.lang.Class<?> wildcardClass13 = parkingLot11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        repositories.ManagerRepository managerRepository0 = new repositories.ManagerRepository();
        boolean boolean2 = managerRepository0.removeManager("hi!");
        models.manager.Manager manager4 = managerRepository0.getManagerByEmail("");
        java.util.List<models.manager.Manager> managerList5 = managerRepository0.getAllManagers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getAvailableSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = parkingSpaceRepository0.getParkingSpaceById(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking8 = null;
        java.util.List<models.payment.Payment> paymentList9 = paymentRepository0.getPaymentsForBooking(booking8);
        models.payment.Payment payment10 = null;
        paymentRepository0.removePayment(payment10);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment14 = paymentRepository0.createRefundPayment(booking12, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        clientRepository0.deleteClient("");
        models.client.Client client8 = clientRepository0.getClientByEmail("");
        java.util.List<models.client.Client> clientList9 = clientRepository0.getAllClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllEnabledParkingLots();
        models.parkingLot.ParkingLot parkingLot7 = parkingLotRepository0.getParkingLotByName("");
        java.util.UUID uUID8 = null;
        parkingLotRepository0.removeParkingLot(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot6 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository5.getEnabledSpaces(parkingLot6);
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository8.getBookedSpaces(parkingLot9);
        models.parkingLot.ParkingLot parkingLot11 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository8.getBookedSpaces(parkingLot11);
        java.util.UUID uUID13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = parkingSpaceRepository8.getParkingSpaceById(uUID13);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository8.getAllSpaces();
        repositories.ParkingLotRepository parkingLotRepository16 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot18 = parkingLotRepository16.getParkingLotByName("hi!");
        java.util.UUID uUID19 = null;
        parkingLotRepository16.removeParkingLot(uUID19);
        models.parkingLot.ParkingLot parkingLot22 = parkingLotRepository16.getParkingLotByName("hi!");
        models.parkingSpace.ParkingSpace parkingSpace24 = parkingSpaceRepository8.addParkingSpace(parkingLot22, "hi!");
        models.parkingSpace.ParkingSpace parkingSpace26 = parkingSpaceRepository5.addParkingSpace(parkingLot22, "hi!");
        models.client.Client client28 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking29 = bookingRepository0.createBooking(parkingSpace26, (int) (byte) -1, client28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space and client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace26);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getAllBookings();
        models.booking.Booking booking7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.checkOutBooking(booking7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        models.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getBookingsForClient(client5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        parkingSensorRepository0.saveSensors();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("hi!");
        models.client.Client client6 = clientRepository0.getClientByLicensePlate("");
        models.client.Client client8 = clientRepository0.getClientByEmail("");
        models.client.Client client10 = clientRepository0.getClientByEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        clientRepository0.saveClients();
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            clientRepository0.registerClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Client cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        java.util.UUID uUID1 = null;
        models.payment.Payment payment2 = paymentRepository0.getPaymentByID(uUID1);
        models.booking.Booking booking3 = null;
        java.util.List<models.payment.Payment> paymentList4 = paymentRepository0.getPaymentsForBooking(booking3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList3 = parkingLotRepository0.getAllDisabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = parkingLotRepository0.getAllParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList5 = parkingLotRepository0.getAllParkingLots();
        java.util.UUID uUID6 = null;
        parkingLotRepository0.removeParkingLot(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceByID(uUID3);
        java.util.UUID uUID5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getSpacesForLot(uUID5);
        repositories.ParkingLotRepository parkingLotRepository7 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList8 = parkingLotRepository7.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList9 = parkingLotRepository7.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository10 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot12 = parkingLotRepository10.getParkingLotByName("hi!");
        java.util.UUID uUID13 = null;
        parkingLotRepository10.removeParkingLot(uUID13);
        models.parkingLot.ParkingLot parkingLot16 = parkingLotRepository10.getParkingLotByName("hi!");
        boolean boolean17 = parkingLotRepository7.disableParkingLot(parkingLot16);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository0.getDisabledSpaces(parkingLot16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        models.client.Client client4 = clientRepository0.getClientByEmail("");
        clientRepository0.saveClients();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getBookedSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        models.parkingSpace.ParkingSpace parkingSpace8 = parkingSpaceRepository0.getParkingSpaceByID(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        clientRepository0.deleteClient("hi!");
        clientRepository0.deleteClient("");
        models.client.Client client6 = clientRepository0.getClientByEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        java.util.List<models.payment.Payment> paymentList4 = paymentRepository0.getAllPayments();
        models.booking.Booking booking5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment7 = paymentRepository0.createDepositPayment(booking5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot2 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.UUID uUID3 = null;
        parkingLotRepository0.removeParkingLot(uUID3);
        models.parkingLot.ParkingLot parkingLot6 = parkingLotRepository0.getParkingLotByName("hi!");
        java.util.UUID uUID7 = null;
        models.parkingLot.ParkingLot parkingLot8 = parkingLotRepository0.getParkingLotById(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingLot8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        models.parkingSensor.ParkingSensor parkingSensor1 = null;
        parkingSensorRepository0.updateSensor(parkingSensor1);
        parkingSensorRepository0.saveSensors();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository0.getSensorBySpaceId(uUID4);
        parkingSensorRepository0.saveSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking8 = null;
        java.util.List<models.payment.Payment> paymentList9 = paymentRepository0.getPaymentsForBooking(booking8);
        models.payment.Payment payment10 = null;
        paymentRepository0.removePayment(payment10);
        java.util.UUID uUID12 = null;
        models.payment.Payment payment13 = paymentRepository0.getPaymentByID(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment13);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getAvailableSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository0.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = new repositories.ParkingSpaceRepository();
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository11.getBookedSpaces(parkingLot12);
        java.util.UUID uUID14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = parkingSpaceRepository11.getParkingSpaceById(uUID14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository11.getBookedSpaces(parkingLot16);
        java.util.UUID uUID18 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList19 = parkingSpaceRepository11.getSpacesForLot(uUID18);
        repositories.ParkingLotRepository parkingLotRepository20 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList21 = parkingLotRepository20.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList22 = parkingLotRepository20.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository23 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot25 = parkingLotRepository23.getParkingLotByName("hi!");
        java.util.UUID uUID26 = null;
        parkingLotRepository23.removeParkingLot(uUID26);
        models.parkingLot.ParkingLot parkingLot29 = parkingLotRepository23.getParkingLotByName("hi!");
        boolean boolean30 = parkingLotRepository20.disableParkingLot(parkingLot29);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList31 = parkingSpaceRepository11.getDisabledSpaces(parkingLot29);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository10.getDisabledSpaces(parkingLot29);
        models.parkingSpace.ParkingSpace parkingSpace34 = parkingSpaceRepository0.addParkingSpace(parkingLot29, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace34);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        java.util.UUID uUID3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = parkingSensorRepository0.getSensorBySpaceId(uUID3);
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList5 = parkingSensorRepository0.getAllSensors();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        models.booking.Booking booking4 = null;
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getPaymentsForBooking(booking4);
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment10 = paymentRepository0.createRefundPayment(booking8, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getConfirmedBookings();
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getAvailableSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository0.getAvailableSpaces(parkingLot9);
        models.parkingLot.ParkingLot parkingLot11 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList12 = parkingSpaceRepository0.getDisabledSpaces(parkingLot11);
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository0.getBookedSpaces(parkingLot13);
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.parkingSpace.ParkingSpace.ParkingSpaceStatus parkingSpaceStatus16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace17 = parkingSpaceRepository0.updateParkingSpaceStatus(parkingSpace15, parkingSpaceStatus16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getID()\" because \"space\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSensorRepository parkingSensorRepository2 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = parkingSensorRepository2.getSensorBySpaceId(uUID3);
        models.parkingSensor.ParkingSensor parkingSensor5 = null;
        parkingSensorRepository2.updateSensor(parkingSensor5);
        java.util.UUID uUID7 = null;
        models.parkingSensor.ParkingSensor parkingSensor8 = parkingSensorRepository2.getSensorBySpaceId(uUID7);
        repositories.BookingRepository bookingRepository9 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList10 = bookingRepository9.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList11 = bookingRepository9.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository12.getBookedSpaces(parkingLot13);
        java.util.UUID uUID15 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = parkingSpaceRepository12.getParkingSpaceById(uUID15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository12.getAvailableSpaces(parkingLot17);
        java.util.UUID uUID19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository12.getSpacesForLot(uUID19);
        models.parkingLot.ParkingLot parkingLot21 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList22 = parkingSpaceRepository12.getAvailableSpaces(parkingLot21);
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository12.getDisabledSpaces(parkingLot23);
        models.parkingLot.ParkingLot parkingLot25 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList26 = parkingSpaceRepository12.getBookedSpaces(parkingLot25);
        repositories.ParkingSpaceRepository parkingSpaceRepository27 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository27.getBookedSpaces(parkingLot28);
        java.util.UUID uUID30 = null;
        models.parkingSpace.ParkingSpace parkingSpace31 = parkingSpaceRepository27.getParkingSpaceById(uUID30);
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository27.getBookedSpaces(parkingLot32);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository27.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository35 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot36 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList37 = parkingSpaceRepository35.getBookedSpaces(parkingLot36);
        java.util.UUID uUID38 = null;
        models.parkingSpace.ParkingSpace parkingSpace39 = parkingSpaceRepository35.getParkingSpaceById(uUID38);
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList41 = parkingSpaceRepository35.getAvailableSpaces(parkingLot40);
        java.util.UUID uUID42 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList43 = parkingSpaceRepository35.getSpacesForLot(uUID42);
        models.parkingLot.ParkingLot parkingLot44 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList45 = parkingSpaceRepository35.getAvailableSpaces(parkingLot44);
        models.parkingLot.ParkingLot parkingLot46 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList47 = parkingSpaceRepository35.getDisabledSpaces(parkingLot46);
        repositories.ParkingLotRepository parkingLotRepository48 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList49 = parkingLotRepository48.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList50 = parkingLotRepository48.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository51 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot53 = parkingLotRepository51.getParkingLotByName("hi!");
        java.util.UUID uUID54 = null;
        parkingLotRepository51.removeParkingLot(uUID54);
        models.parkingLot.ParkingLot parkingLot57 = parkingLotRepository51.getParkingLotByName("hi!");
        boolean boolean58 = parkingLotRepository48.disableParkingLot(parkingLot57);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList59 = parkingSpaceRepository35.getEnabledSpaces(parkingLot57);
        models.parkingSpace.ParkingSpace parkingSpace61 = parkingSpaceRepository27.addParkingSpace(parkingLot57, "hi!");
        parkingSpaceRepository12.removeParkingSpace(parkingSpace61);
        models.booking.Booking booking63 = bookingRepository9.getActiveBookingForSpace(parkingSpace61);
        parkingSensorRepository2.removeSensor(parkingSpace61);
        models.booking.Booking booking65 = bookingRepository0.getActiveBookingForSpace(parkingSpace61);
        models.booking.Booking booking66 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.markAsExpired(booking66);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking65);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        repositories.ClientRepository clientRepository0 = new repositories.ClientRepository();
        models.client.Client client3 = clientRepository0.authenticateClient("hi!", "");
        clientRepository0.saveClients();
        clientRepository0.saveClients();
        models.client.Client client7 = clientRepository0.getClientByLicensePlate("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        repositories.BookingRepository bookingRepository1 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository1.getConfirmedBookings();
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository3.getSensorBySpaceId(uUID4);
        models.parkingSensor.ParkingSensor parkingSensor6 = null;
        parkingSensorRepository3.updateSensor(parkingSensor6);
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository3.getSensorBySpaceId(uUID8);
        repositories.BookingRepository bookingRepository10 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList11 = bookingRepository10.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList12 = bookingRepository10.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot14 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList15 = parkingSpaceRepository13.getBookedSpaces(parkingLot14);
        java.util.UUID uUID16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = parkingSpaceRepository13.getParkingSpaceById(uUID16);
        models.parkingLot.ParkingLot parkingLot18 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList19 = parkingSpaceRepository13.getAvailableSpaces(parkingLot18);
        java.util.UUID uUID20 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository13.getSpacesForLot(uUID20);
        models.parkingLot.ParkingLot parkingLot22 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList23 = parkingSpaceRepository13.getAvailableSpaces(parkingLot22);
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository13.getDisabledSpaces(parkingLot24);
        models.parkingLot.ParkingLot parkingLot26 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList27 = parkingSpaceRepository13.getBookedSpaces(parkingLot26);
        repositories.ParkingSpaceRepository parkingSpaceRepository28 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot29 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList30 = parkingSpaceRepository28.getBookedSpaces(parkingLot29);
        java.util.UUID uUID31 = null;
        models.parkingSpace.ParkingSpace parkingSpace32 = parkingSpaceRepository28.getParkingSpaceById(uUID31);
        models.parkingLot.ParkingLot parkingLot33 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository28.getBookedSpaces(parkingLot33);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList35 = parkingSpaceRepository28.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository36 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot37 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList38 = parkingSpaceRepository36.getBookedSpaces(parkingLot37);
        java.util.UUID uUID39 = null;
        models.parkingSpace.ParkingSpace parkingSpace40 = parkingSpaceRepository36.getParkingSpaceById(uUID39);
        models.parkingLot.ParkingLot parkingLot41 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList42 = parkingSpaceRepository36.getAvailableSpaces(parkingLot41);
        java.util.UUID uUID43 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList44 = parkingSpaceRepository36.getSpacesForLot(uUID43);
        models.parkingLot.ParkingLot parkingLot45 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList46 = parkingSpaceRepository36.getAvailableSpaces(parkingLot45);
        models.parkingLot.ParkingLot parkingLot47 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList48 = parkingSpaceRepository36.getDisabledSpaces(parkingLot47);
        repositories.ParkingLotRepository parkingLotRepository49 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList50 = parkingLotRepository49.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList51 = parkingLotRepository49.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository52 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot54 = parkingLotRepository52.getParkingLotByName("hi!");
        java.util.UUID uUID55 = null;
        parkingLotRepository52.removeParkingLot(uUID55);
        models.parkingLot.ParkingLot parkingLot58 = parkingLotRepository52.getParkingLotByName("hi!");
        boolean boolean59 = parkingLotRepository49.disableParkingLot(parkingLot58);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList60 = parkingSpaceRepository36.getEnabledSpaces(parkingLot58);
        models.parkingSpace.ParkingSpace parkingSpace62 = parkingSpaceRepository28.addParkingSpace(parkingLot58, "hi!");
        parkingSpaceRepository13.removeParkingSpace(parkingSpace62);
        models.booking.Booking booking64 = bookingRepository10.getActiveBookingForSpace(parkingSpace62);
        parkingSensorRepository3.removeSensor(parkingSpace62);
        models.booking.Booking booking66 = bookingRepository1.getActiveBookingForSpace(parkingSpace62);
        parkingSpaceRepository0.removeParkingSpace(parkingSpace62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking66);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.payment.Payment payment1 = null;
        paymentRepository0.removePayment(payment1);
        java.util.List<models.payment.Payment> paymentList3 = paymentRepository0.getAllPayments();
        models.booking.Booking booking4 = null;
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getPaymentsForBooking(booking4);
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking9 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentRepository0.createFinalPayment(0.0d, booking9, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceById(uUID5);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository0.getAllSpaces();
        java.util.UUID uUID8 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList9 = parkingSpaceRepository0.getSpacesForLot(uUID8);
        java.util.UUID uUID10 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSpaceRepository0.getParkingSpaceById(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSensorRepository parkingSensorRepository2 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = parkingSensorRepository2.getSensorBySpaceId(uUID3);
        models.parkingSensor.ParkingSensor parkingSensor5 = null;
        parkingSensorRepository2.updateSensor(parkingSensor5);
        java.util.UUID uUID7 = null;
        models.parkingSensor.ParkingSensor parkingSensor8 = parkingSensorRepository2.getSensorBySpaceId(uUID7);
        repositories.BookingRepository bookingRepository9 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList10 = bookingRepository9.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList11 = bookingRepository9.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository12.getBookedSpaces(parkingLot13);
        java.util.UUID uUID15 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = parkingSpaceRepository12.getParkingSpaceById(uUID15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository12.getAvailableSpaces(parkingLot17);
        java.util.UUID uUID19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository12.getSpacesForLot(uUID19);
        models.parkingLot.ParkingLot parkingLot21 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList22 = parkingSpaceRepository12.getAvailableSpaces(parkingLot21);
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository12.getDisabledSpaces(parkingLot23);
        models.parkingLot.ParkingLot parkingLot25 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList26 = parkingSpaceRepository12.getBookedSpaces(parkingLot25);
        repositories.ParkingSpaceRepository parkingSpaceRepository27 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository27.getBookedSpaces(parkingLot28);
        java.util.UUID uUID30 = null;
        models.parkingSpace.ParkingSpace parkingSpace31 = parkingSpaceRepository27.getParkingSpaceById(uUID30);
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository27.getBookedSpaces(parkingLot32);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository27.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository35 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot36 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList37 = parkingSpaceRepository35.getBookedSpaces(parkingLot36);
        java.util.UUID uUID38 = null;
        models.parkingSpace.ParkingSpace parkingSpace39 = parkingSpaceRepository35.getParkingSpaceById(uUID38);
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList41 = parkingSpaceRepository35.getAvailableSpaces(parkingLot40);
        java.util.UUID uUID42 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList43 = parkingSpaceRepository35.getSpacesForLot(uUID42);
        models.parkingLot.ParkingLot parkingLot44 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList45 = parkingSpaceRepository35.getAvailableSpaces(parkingLot44);
        models.parkingLot.ParkingLot parkingLot46 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList47 = parkingSpaceRepository35.getDisabledSpaces(parkingLot46);
        repositories.ParkingLotRepository parkingLotRepository48 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList49 = parkingLotRepository48.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList50 = parkingLotRepository48.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository51 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot53 = parkingLotRepository51.getParkingLotByName("hi!");
        java.util.UUID uUID54 = null;
        parkingLotRepository51.removeParkingLot(uUID54);
        models.parkingLot.ParkingLot parkingLot57 = parkingLotRepository51.getParkingLotByName("hi!");
        boolean boolean58 = parkingLotRepository48.disableParkingLot(parkingLot57);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList59 = parkingSpaceRepository35.getEnabledSpaces(parkingLot57);
        models.parkingSpace.ParkingSpace parkingSpace61 = parkingSpaceRepository27.addParkingSpace(parkingLot57, "hi!");
        parkingSpaceRepository12.removeParkingSpace(parkingSpace61);
        models.booking.Booking booking63 = bookingRepository9.getActiveBookingForSpace(parkingSpace61);
        parkingSensorRepository2.removeSensor(parkingSpace61);
        models.booking.Booking booking65 = bookingRepository0.getActiveBookingForSpace(parkingSpace61);
        models.booking.Booking booking66 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingRepository0.cancelBooking(booking66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking65);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        models.parkingLot.ParkingLot parkingLot5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getBookedSpaces(parkingLot5);
        java.util.UUID uUID7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getSpacesForLot(uUID7);
        java.util.UUID uUID9 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSpaceRepository0.getParkingSpaceById(uUID9);
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository11.getBookedSpaces(parkingLot12);
        java.util.UUID uUID14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = parkingSpaceRepository11.getParkingSpaceById(uUID14);
        models.parkingLot.ParkingLot parkingLot16 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList17 = parkingSpaceRepository11.getBookedSpaces(parkingLot16);
        java.util.UUID uUID18 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList19 = parkingSpaceRepository11.getSpacesForLot(uUID18);
        repositories.ParkingLotRepository parkingLotRepository20 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList21 = parkingLotRepository20.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList22 = parkingLotRepository20.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository23 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot25 = parkingLotRepository23.getParkingLotByName("hi!");
        java.util.UUID uUID26 = null;
        parkingLotRepository23.removeParkingLot(uUID26);
        models.parkingLot.ParkingLot parkingLot29 = parkingLotRepository23.getParkingLotByName("hi!");
        boolean boolean30 = parkingLotRepository20.disableParkingLot(parkingLot29);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList31 = parkingSpaceRepository11.getDisabledSpaces(parkingLot29);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList32 = parkingSpaceRepository0.getEnabledSpaces(parkingLot29);
        java.util.UUID uUID33 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository0.getSpacesForLot(uUID33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getConfirmedBookings();
        repositories.ParkingSensorRepository parkingSensorRepository2 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = parkingSensorRepository2.getSensorBySpaceId(uUID3);
        models.parkingSensor.ParkingSensor parkingSensor5 = null;
        parkingSensorRepository2.updateSensor(parkingSensor5);
        java.util.UUID uUID7 = null;
        models.parkingSensor.ParkingSensor parkingSensor8 = parkingSensorRepository2.getSensorBySpaceId(uUID7);
        repositories.BookingRepository bookingRepository9 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList10 = bookingRepository9.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList11 = bookingRepository9.getConfirmedBookings();
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository12.getBookedSpaces(parkingLot13);
        java.util.UUID uUID15 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = parkingSpaceRepository12.getParkingSpaceById(uUID15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository12.getAvailableSpaces(parkingLot17);
        java.util.UUID uUID19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository12.getSpacesForLot(uUID19);
        models.parkingLot.ParkingLot parkingLot21 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList22 = parkingSpaceRepository12.getAvailableSpaces(parkingLot21);
        models.parkingLot.ParkingLot parkingLot23 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository12.getDisabledSpaces(parkingLot23);
        models.parkingLot.ParkingLot parkingLot25 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList26 = parkingSpaceRepository12.getBookedSpaces(parkingLot25);
        repositories.ParkingSpaceRepository parkingSpaceRepository27 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository27.getBookedSpaces(parkingLot28);
        java.util.UUID uUID30 = null;
        models.parkingSpace.ParkingSpace parkingSpace31 = parkingSpaceRepository27.getParkingSpaceById(uUID30);
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository27.getBookedSpaces(parkingLot32);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList34 = parkingSpaceRepository27.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository35 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot36 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList37 = parkingSpaceRepository35.getBookedSpaces(parkingLot36);
        java.util.UUID uUID38 = null;
        models.parkingSpace.ParkingSpace parkingSpace39 = parkingSpaceRepository35.getParkingSpaceById(uUID38);
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList41 = parkingSpaceRepository35.getAvailableSpaces(parkingLot40);
        java.util.UUID uUID42 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList43 = parkingSpaceRepository35.getSpacesForLot(uUID42);
        models.parkingLot.ParkingLot parkingLot44 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList45 = parkingSpaceRepository35.getAvailableSpaces(parkingLot44);
        models.parkingLot.ParkingLot parkingLot46 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList47 = parkingSpaceRepository35.getDisabledSpaces(parkingLot46);
        repositories.ParkingLotRepository parkingLotRepository48 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList49 = parkingLotRepository48.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList50 = parkingLotRepository48.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository51 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot53 = parkingLotRepository51.getParkingLotByName("hi!");
        java.util.UUID uUID54 = null;
        parkingLotRepository51.removeParkingLot(uUID54);
        models.parkingLot.ParkingLot parkingLot57 = parkingLotRepository51.getParkingLotByName("hi!");
        boolean boolean58 = parkingLotRepository48.disableParkingLot(parkingLot57);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList59 = parkingSpaceRepository35.getEnabledSpaces(parkingLot57);
        models.parkingSpace.ParkingSpace parkingSpace61 = parkingSpaceRepository27.addParkingSpace(parkingLot57, "hi!");
        parkingSpaceRepository12.removeParkingSpace(parkingSpace61);
        models.booking.Booking booking63 = bookingRepository9.getActiveBookingForSpace(parkingSpace61);
        parkingSensorRepository2.removeSensor(parkingSpace61);
        models.booking.Booking booking65 = bookingRepository0.getActiveBookingForSpace(parkingSpace61);
        models.client.Client client66 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = bookingRepository0.hasOverstayedBookings(client66);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking65);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        repositories.ParkingSensorRepository parkingSensorRepository0 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = parkingSensorRepository0.getSensorBySpaceId(uUID1);
        repositories.ParkingSensorRepository parkingSensorRepository3 = new repositories.ParkingSensorRepository();
        java.util.UUID uUID4 = null;
        models.parkingSensor.ParkingSensor parkingSensor5 = parkingSensorRepository3.getSensorBySpaceId(uUID4);
        models.parkingSensor.ParkingSensor parkingSensor6 = null;
        parkingSensorRepository3.updateSensor(parkingSensor6);
        java.util.UUID uUID8 = null;
        models.parkingSensor.ParkingSensor parkingSensor9 = parkingSensorRepository3.getSensorBySpaceId(uUID8);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.parkingSensor.ParkingSensor parkingSensor11 = parkingSensorRepository3.createSensor(parkingSpace10);
        parkingSensorRepository0.updateSensor(parkingSensor11);
        java.util.List<models.parkingSensor.ParkingSensor> parkingSensorList13 = parkingSensorRepository0.getAllSensors();
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot15 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList16 = parkingSpaceRepository14.getEnabledSpaces(parkingLot15);
        repositories.ParkingSpaceRepository parkingSpaceRepository17 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot18 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList19 = parkingSpaceRepository17.getBookedSpaces(parkingLot18);
        models.parkingLot.ParkingLot parkingLot20 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList21 = parkingSpaceRepository17.getBookedSpaces(parkingLot20);
        java.util.UUID uUID22 = null;
        models.parkingSpace.ParkingSpace parkingSpace23 = parkingSpaceRepository17.getParkingSpaceById(uUID22);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList24 = parkingSpaceRepository17.getAllSpaces();
        repositories.ParkingLotRepository parkingLotRepository25 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot27 = parkingLotRepository25.getParkingLotByName("hi!");
        java.util.UUID uUID28 = null;
        parkingLotRepository25.removeParkingLot(uUID28);
        models.parkingLot.ParkingLot parkingLot31 = parkingLotRepository25.getParkingLotByName("hi!");
        models.parkingSpace.ParkingSpace parkingSpace33 = parkingSpaceRepository17.addParkingSpace(parkingLot31, "hi!");
        models.parkingSpace.ParkingSpace parkingSpace35 = parkingSpaceRepository14.addParkingSpace(parkingLot31, "hi!");
        models.parkingSensor.ParkingSensor parkingSensor36 = parkingSensorRepository0.createSensor(parkingSpace35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSensor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensor36);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        java.util.UUID uUID3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceRepository0.getParkingSpaceById(uUID3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceByID(uUID5);
        models.parkingLot.ParkingLot parkingLot7 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList8 = parkingSpaceRepository0.getDisabledSpaces(parkingLot7);
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot10 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList11 = parkingSpaceRepository9.getBookedSpaces(parkingLot10);
        models.parkingLot.ParkingLot parkingLot12 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList13 = parkingSpaceRepository9.getBookedSpaces(parkingLot12);
        repositories.ParkingLotRepository parkingLotRepository14 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList15 = parkingLotRepository14.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList16 = parkingLotRepository14.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository17 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot19 = parkingLotRepository17.getParkingLotByName("hi!");
        java.util.UUID uUID20 = null;
        parkingLotRepository17.removeParkingLot(uUID20);
        models.parkingLot.ParkingLot parkingLot23 = parkingLotRepository17.getParkingLotByName("hi!");
        boolean boolean24 = parkingLotRepository14.disableParkingLot(parkingLot23);
        java.util.List<models.parkingLot.ParkingLot> parkingLotList25 = parkingLotRepository14.getAllParkingLots();
        models.parkingLot.ParkingLot parkingLot27 = parkingLotRepository14.getParkingLotByName("hi!");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList28 = parkingSpaceRepository9.getAvailableSpaces(parkingLot27);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository0.getDisabledSpaces(parkingLot27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        java.util.UUID uUID5 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList6 = parkingSpaceRepository0.getSpacesForLot(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList6);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        repositories.PaymentRepository paymentRepository0 = new repositories.PaymentRepository();
        models.booking.Booking booking1 = null;
        java.util.List<models.payment.Payment> paymentList2 = paymentRepository0.getPaymentsForBooking(booking1);
        models.payment.Payment payment3 = null;
        paymentRepository0.removePayment(payment3);
        java.util.List<models.payment.Payment> paymentList5 = paymentRepository0.getAllPayments();
        models.booking.Booking booking6 = null;
        java.util.List<models.payment.Payment> paymentList7 = paymentRepository0.getPaymentsForBooking(booking6);
        models.booking.Booking booking8 = null;
        java.util.List<models.payment.Payment> paymentList9 = paymentRepository0.getPaymentsForBooking(booking8);
        java.util.UUID uUID10 = null;
        models.payment.Payment payment11 = paymentRepository0.getPaymentByID(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(payment11);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        repositories.BookingRepository bookingRepository0 = new repositories.BookingRepository();
        java.util.List<models.booking.Booking> bookingList1 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList2 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList3 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList4 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList5 = bookingRepository0.getConfirmedBookings();
        java.util.List<models.booking.Booking> bookingList6 = bookingRepository0.getAllBookings();
        java.util.List<models.booking.Booking> bookingList7 = bookingRepository0.getConfirmedBookings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList7);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        repositories.ParkingLotRepository parkingLotRepository0 = new repositories.ParkingLotRepository();
        repositories.ParkingLotRepository parkingLotRepository1 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot3 = parkingLotRepository1.getParkingLotByName("hi!");
        java.util.UUID uUID4 = null;
        parkingLotRepository1.removeParkingLot(uUID4);
        models.parkingLot.ParkingLot parkingLot7 = parkingLotRepository1.getParkingLotByName("hi!");
        boolean boolean8 = parkingLotRepository0.disableParkingLot(parkingLot7);
        java.lang.Class<?> wildcardClass9 = parkingLot7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot1 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceRepository0.getBookedSpaces(parkingLot1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceRepository0.getBookedSpaces(parkingLot3);
        java.util.UUID uUID5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSpaceRepository0.getParkingSpaceById(uUID5);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList7 = parkingSpaceRepository0.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot9 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList10 = parkingSpaceRepository8.getBookedSpaces(parkingLot9);
        java.util.UUID uUID11 = null;
        models.parkingSpace.ParkingSpace parkingSpace12 = parkingSpaceRepository8.getParkingSpaceById(uUID11);
        models.parkingLot.ParkingLot parkingLot13 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList14 = parkingSpaceRepository8.getAvailableSpaces(parkingLot13);
        java.util.UUID uUID15 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList16 = parkingSpaceRepository8.getSpacesForLot(uUID15);
        models.parkingLot.ParkingLot parkingLot17 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList18 = parkingSpaceRepository8.getAvailableSpaces(parkingLot17);
        models.parkingLot.ParkingLot parkingLot19 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList20 = parkingSpaceRepository8.getDisabledSpaces(parkingLot19);
        models.parkingLot.ParkingLot parkingLot21 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList22 = parkingSpaceRepository8.getBookedSpaces(parkingLot21);
        repositories.ParkingSpaceRepository parkingSpaceRepository23 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot24 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList25 = parkingSpaceRepository23.getBookedSpaces(parkingLot24);
        java.util.UUID uUID26 = null;
        models.parkingSpace.ParkingSpace parkingSpace27 = parkingSpaceRepository23.getParkingSpaceById(uUID26);
        models.parkingLot.ParkingLot parkingLot28 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList29 = parkingSpaceRepository23.getBookedSpaces(parkingLot28);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList30 = parkingSpaceRepository23.getAllSpaces();
        repositories.ParkingSpaceRepository parkingSpaceRepository31 = new repositories.ParkingSpaceRepository();
        models.parkingLot.ParkingLot parkingLot32 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList33 = parkingSpaceRepository31.getBookedSpaces(parkingLot32);
        java.util.UUID uUID34 = null;
        models.parkingSpace.ParkingSpace parkingSpace35 = parkingSpaceRepository31.getParkingSpaceById(uUID34);
        models.parkingLot.ParkingLot parkingLot36 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList37 = parkingSpaceRepository31.getAvailableSpaces(parkingLot36);
        java.util.UUID uUID38 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList39 = parkingSpaceRepository31.getSpacesForLot(uUID38);
        models.parkingLot.ParkingLot parkingLot40 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList41 = parkingSpaceRepository31.getAvailableSpaces(parkingLot40);
        models.parkingLot.ParkingLot parkingLot42 = null;
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList43 = parkingSpaceRepository31.getDisabledSpaces(parkingLot42);
        repositories.ParkingLotRepository parkingLotRepository44 = new repositories.ParkingLotRepository();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList45 = parkingLotRepository44.getAllEnabledParkingLots();
        java.util.List<models.parkingLot.ParkingLot> parkingLotList46 = parkingLotRepository44.getAllDisabledParkingLots();
        repositories.ParkingLotRepository parkingLotRepository47 = new repositories.ParkingLotRepository();
        models.parkingLot.ParkingLot parkingLot49 = parkingLotRepository47.getParkingLotByName("hi!");
        java.util.UUID uUID50 = null;
        parkingLotRepository47.removeParkingLot(uUID50);
        models.parkingLot.ParkingLot parkingLot53 = parkingLotRepository47.getParkingLotByName("hi!");
        boolean boolean54 = parkingLotRepository44.disableParkingLot(parkingLot53);
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList55 = parkingSpaceRepository31.getEnabledSpaces(parkingLot53);
        models.parkingSpace.ParkingSpace parkingSpace57 = parkingSpaceRepository23.addParkingSpace(parkingLot53, "hi!");
        parkingSpaceRepository8.removeParkingSpace(parkingSpace57);
        parkingSpaceRepository0.removeParkingSpace(parkingSpace57);
        java.util.UUID uUID60 = null;
        models.parkingSpace.ParkingSpace parkingSpace61 = parkingSpaceRepository0.getParkingSpaceByID(uUID60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLot53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpace57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace61);
    }
}

