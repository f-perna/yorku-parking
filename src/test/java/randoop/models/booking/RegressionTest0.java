package randoop.models.booking;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        models.booking.Booking.BookingStatus bookingStatus0 = models.booking.Booking.BookingStatus.CHECKED_IN;
        java.lang.Class<?> wildcardClass1 = bookingStatus0.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + models.booking.Booking.BookingStatus.CHECKED_IN + "'", bookingStatus0.equals(models.booking.Booking.BookingStatus.CHECKED_IN));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        models.booking.Booking.BookingStatus bookingStatus0 = models.booking.Booking.BookingStatus.NO_SHOW;
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + models.booking.Booking.BookingStatus.NO_SHOW + "'", bookingStatus0.equals(models.booking.Booking.BookingStatus.NO_SHOW));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        models.booking.Booking.BookingStatus bookingStatus0 = models.booking.Booking.BookingStatus.CONFIRMED;
        java.lang.Class<?> wildcardClass1 = bookingStatus0.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + models.booking.Booking.BookingStatus.CONFIRMED + "'", bookingStatus0.equals(models.booking.Booking.BookingStatus.CONFIRMED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus9 = models.booking.Booking.BookingStatus.EXPIRED;
        java.lang.Class<?> wildcardClass10 = bookingStatus9.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = booking7.equals((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class models.booking.Booking (java.lang.Class is in module java.base of loader 'bootstrap'; models.booking.Booking is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.EXPIRED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        models.booking.Booking.BookingStatus bookingStatus0 = models.booking.Booking.BookingStatus.PENDING;
        java.lang.Class<?> wildcardClass1 = bookingStatus0.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus0 + "' != '" + models.booking.Booking.BookingStatus.PENDING + "'", bookingStatus0.equals(models.booking.Booking.BookingStatus.PENDING));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.client.Client client10 = booking7.getClient();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        booking7.noShow();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        booking7.cancelBooking();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration(0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.confirmBooking();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.client.Client client10 = booking7.getClient();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        java.util.UUID uUID10 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus11, localDateTime12, localDateTime13, (double) '#');
        booking15.noShow();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long8 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        models.booking.Booking.BookingStatus bookingStatus13 = booking7.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.CHECKED_IN + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.CANCELED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.CANCELED));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        java.util.UUID uUID9 = null;
        models.client.Client client10 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        models.booking.Booking.BookingStatus bookingStatus12 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID9, client10, parkingSpace11, bookingStatus12, localDateTime13, localDateTime14, (double) ' ');
        models.client.Client client17 = booking16.getClient();
        booking16.noShow();
        models.booking.Booking.BookingStatus bookingStatus19 = booking16.getStatus();
        models.booking.Booking.BookingStatus bookingStatus20 = models.booking.Booking.BookingStatus.EXPIRED;
        booking16.updateStatus(bookingStatus20);
        boolean boolean22 = booking7.equals((java.lang.Object) bookingStatus20);
        double double23 = booking7.getDeposit();
        models.booking.Booking.BookingStatus bookingStatus24 = models.booking.Booking.BookingStatus.COMPLETED;
        java.lang.Class<?> wildcardClass25 = bookingStatus24.getClass();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = booking7.equals((java.lang.Object) wildcardClass25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Class cannot be cast to class models.booking.Booking (java.lang.Class is in module java.base of loader 'bootstrap'; models.booking.Booking is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client17);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus19.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus20.equals(models.booking.Booking.BookingStatus.EXPIRED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 32.0d + "'", double23 == 32.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus24.equals(models.booking.Booking.BookingStatus.COMPLETED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double8 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, (double) 100);
        boolean boolean21 = booking7.equals((java.lang.Object) client14);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        booking7.setParkingSpace(parkingSpace12);
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        booking7.cancelBooking();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace13 = null;
        booking7.setParkingSpace(parkingSpace13);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus12, localDateTime13, localDateTime14, (double) 0L);
        booking16.markAsExpired();
        // The following exception was thrown during execution in test generation
        try {
            booking16.extendDuration((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        // The following exception was thrown during execution in test generation
        try {
            double double29 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        double double18 = booking17.getDeposit();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = booking17.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.client.Client client10 = booking7.getClient();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        double double12 = booking7.getDeposit();
        java.util.UUID uUID13 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        booking7.markAsOverstayed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        java.lang.Class<?> wildcardClass11 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = booking7.getStatus();
        booking7.cancelBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        models.parkingSpace.ParkingSpace parkingSpace13 = null;
        booking7.setParkingSpace(parkingSpace13);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        booking7.markAsOverstayed();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        booking7.markAsOverstayed();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.lang.Class<?> wildcardClass11 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.util.UUID uUID11 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        double double12 = booking7.getDeposit();
        booking7.noShow();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration(0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) 0);
        booking7.noShow();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        booking7.confirmBooking();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus12, localDateTime13, localDateTime14, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = booking16.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        double double12 = booking7.getDeposit();
        booking7.markAsExpired();
        java.util.UUID uUID14 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        models.parkingSpace.ParkingSpace parkingSpace11 = booking7.getParkingSpace();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        booking7.cancelBooking();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.parkingSpace.ParkingSpace parkingSpace12 = booking7.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        models.booking.Booking.BookingStatus bookingStatus12 = booking7.getStatus();
        booking7.cancelBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.COMPLETED));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        booking7.confirmBooking();
        java.time.LocalDateTime localDateTime14 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.COMPLETED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) '#');
        java.time.LocalDateTime localDateTime8 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.COMPLETED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus12, localDateTime13, localDateTime14, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = booking16.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        double double18 = booking17.getDeposit();
        java.util.UUID uUID19 = null;
        models.client.Client client20 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = null;
        models.booking.Booking.BookingStatus bookingStatus22 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        models.booking.Booking booking26 = new models.booking.Booking(uUID19, client20, parkingSpace21, bookingStatus22, localDateTime23, localDateTime24, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus27 = booking26.getStatus();
        boolean boolean28 = booking17.equals((java.lang.Object) booking26);
        // The following exception was thrown during execution in test generation
        try {
            booking26.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus22.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus27.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        booking7.noShow();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.confirmBooking();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.CONFIRMED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.CONFIRMED));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        double double12 = booking7.getDeposit();
        booking7.markAsExpired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        double double12 = booking7.getDeposit();
        java.util.UUID uUID13 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        booking7.confirmBooking();
        models.client.Client client14 = booking7.getClient();
        booking7.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        java.time.LocalDateTime localDateTime11 = booking7.getStartTime();
        booking7.cancelBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        booking7.confirmBooking();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration(0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        double double18 = booking17.getDeposit();
        java.util.UUID uUID19 = null;
        models.client.Client client20 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = null;
        models.booking.Booking.BookingStatus bookingStatus22 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        models.booking.Booking booking26 = new models.booking.Booking(uUID19, client20, parkingSpace21, bookingStatus22, localDateTime23, localDateTime24, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus27 = booking26.getStatus();
        boolean boolean28 = booking17.equals((java.lang.Object) booking26);
        booking17.noShow();
        java.time.LocalDateTime localDateTime30 = booking17.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus22.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus27.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsExpired();
        booking7.confirmBooking();
        booking7.completeBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        models.booking.Booking.BookingStatus bookingStatus11 = booking7.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        java.time.LocalDateTime localDateTime10 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        booking7.setParkingSpace(parkingSpace12);
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsExpired();
        models.client.Client client12 = booking7.getClient();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client12);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        booking7.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) 100);
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        booking7.checkIn();
        booking7.completeBooking();
        java.time.LocalDateTime localDateTime31 = booking7.getStartTime();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime31);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        booking7.checkIn();
        java.time.LocalDateTime localDateTime10 = booking7.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        booking7.confirmBooking();
        models.client.Client client14 = booking7.getClient();
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        booking7.noShow();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        booking7.confirmBooking();
        booking7.markAsExpired();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.COMPLETED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) '#');
        booking7.checkIn();
        java.lang.Class<?> wildcardClass9 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.COMPLETED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.parkingSpace.ParkingSpace parkingSpace12 = booking7.getParkingSpace();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.CANCELED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, 0.0d);
        booking7.updateStatus(bookingStatus16);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.CANCELED));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = booking17.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        booking7.cancelBooking();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsExpired();
        booking7.cancelBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        booking7.noShow();
        double double10 = booking7.getDeposit();
        booking7.completeBooking();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        double double18 = booking17.getDeposit();
        java.util.UUID uUID19 = null;
        models.client.Client client20 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = null;
        models.booking.Booking.BookingStatus bookingStatus22 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        models.booking.Booking booking26 = new models.booking.Booking(uUID19, client20, parkingSpace21, bookingStatus22, localDateTime23, localDateTime24, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus27 = booking26.getStatus();
        boolean boolean28 = booking17.equals((java.lang.Object) booking26);
        java.util.UUID uUID29 = booking17.getBookingID();
        models.client.Client client30 = booking17.getClient();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus22.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus27.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client30);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        booking7.checkIn();
        java.time.LocalDateTime localDateTime10 = booking7.getStartTime();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        booking7.setParkingSpace(parkingSpace12);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        booking7.noShow();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        boolean boolean13 = booking7.equals((java.lang.Object) (byte) 0);
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus11, localDateTime12, localDateTime13, (double) '#');
        booking15.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            booking15.extendDuration((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        models.client.Client client13 = booking7.getClient();
        models.parkingSpace.ParkingSpace parkingSpace14 = booking7.getParkingSpace();
        models.parkingSpace.ParkingSpace parkingSpace15 = booking7.getParkingSpace();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        booking7.noShow();
        double double10 = booking7.getDeposit();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.checkIn();
        java.util.UUID uUID13 = booking10.getBookingID();
        booking10.markAsExpired();
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        java.util.UUID uUID18 = null;
        models.client.Client client19 = null;
        models.parkingSpace.ParkingSpace parkingSpace20 = null;
        models.booking.Booking.BookingStatus bookingStatus21 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime22 = null;
        java.time.LocalDateTime localDateTime23 = null;
        models.booking.Booking booking25 = new models.booking.Booking(uUID18, client19, parkingSpace20, bookingStatus21, localDateTime22, localDateTime23, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus26 = booking25.getStatus();
        java.time.LocalDateTime localDateTime27 = null;
        java.time.LocalDateTime localDateTime28 = null;
        models.booking.Booking booking30 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus26, localDateTime27, localDateTime28, (double) '#');
        booking10.updateStatus(bookingStatus26);
        java.time.LocalDateTime localDateTime32 = null;
        java.time.LocalDateTime localDateTime33 = null;
        models.booking.Booking booking35 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus26, localDateTime32, localDateTime33, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus21.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus26.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        booking7.cancelBooking();
        booking7.markAsOverstayed();
        java.lang.Class<?> wildcardClass14 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        java.util.UUID uUID12 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        booking7.checkIn();
        java.time.LocalDateTime localDateTime10 = booking7.getStartTime();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        booking7.confirmBooking();
        java.time.LocalDateTime localDateTime14 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.EXPIRED;
        booking7.updateStatus(bookingStatus11);
        booking7.markAsOverstayed();
        java.util.UUID uUID14 = null;
        models.client.Client client15 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.booking.Booking.BookingStatus bookingStatus17 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        models.booking.Booking booking21 = new models.booking.Booking(uUID14, client15, parkingSpace16, bookingStatus17, localDateTime18, localDateTime19, (double) ' ');
        booking21.noShow();
        booking21.completeBooking();
        booking21.checkIn();
        booking21.completeBooking();
        booking21.markAsOverstayed();
        java.time.LocalDateTime localDateTime27 = booking21.getEndTime();
        boolean boolean28 = booking7.equals((java.lang.Object) booking21);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = booking21.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.EXPIRED));
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus17.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsExpired();
        booking7.confirmBooking();
        java.time.LocalDateTime localDateTime13 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus12, localDateTime13, localDateTime14, (double) 0L);
        models.booking.Booking.BookingStatus bookingStatus17 = booking16.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus17.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.parkingSpace.ParkingSpace parkingSpace9 = booking7.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = booking17.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        java.time.LocalDateTime localDateTime11 = booking7.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        booking7.markAsOverstayed();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        booking7.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        java.lang.Class<?> wildcardClass10 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        booking7.markAsExpired();
        java.time.LocalDateTime localDateTime12 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace13 = null;
        booking10.setParkingSpace(parkingSpace13);
        models.booking.Booking.BookingStatus bookingStatus15 = booking10.getStatus();
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        models.booking.Booking booking19 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus15, localDateTime16, localDateTime17, (double) 100);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.EXPIRED;
        booking7.updateStatus(bookingStatus11);
        booking7.markAsOverstayed();
        java.util.UUID uUID14 = null;
        models.client.Client client15 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.booking.Booking.BookingStatus bookingStatus17 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        models.booking.Booking booking21 = new models.booking.Booking(uUID14, client15, parkingSpace16, bookingStatus17, localDateTime18, localDateTime19, (double) ' ');
        booking21.noShow();
        booking21.completeBooking();
        booking21.checkIn();
        booking21.completeBooking();
        booking21.markAsOverstayed();
        java.time.LocalDateTime localDateTime27 = booking21.getEndTime();
        boolean boolean28 = booking7.equals((java.lang.Object) booking21);
        java.time.LocalDateTime localDateTime29 = booking21.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.EXPIRED));
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus17.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = booking17.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        booking7.cancelBooking();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        booking10.setParkingSpace(parkingSpace12);
        models.booking.Booking.BookingStatus bookingStatus14 = booking10.getStatus();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        models.booking.Booking booking18 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus14, localDateTime15, localDateTime16, (double) '4');
        booking18.completeBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus14.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.booking.Booking.BookingStatus bookingStatus12 = booking7.getStatus();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        java.util.UUID uUID16 = null;
        models.client.Client client17 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = null;
        models.booking.Booking.BookingStatus bookingStatus19 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        models.booking.Booking booking23 = new models.booking.Booking(uUID16, client17, parkingSpace18, bookingStatus19, localDateTime20, localDateTime21, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus24 = booking23.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        models.booking.Booking booking28 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus24, localDateTime25, localDateTime26, (double) '#');
        booking7.updateStatus(bookingStatus24);
        java.util.UUID uUID30 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus19.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus24.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID30);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        models.client.Client client11 = booking7.getClient();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        java.time.LocalDateTime localDateTime11 = booking7.getStartTime();
        booking7.cancelBooking();
        java.time.LocalDateTime localDateTime13 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.client.Client client9 = booking7.getClient();
        java.time.LocalDateTime localDateTime10 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        booking10.noShow();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.booking.Booking.BookingStatus bookingStatus15 = models.booking.Booking.BookingStatus.CANCELED;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        models.booking.Booking booking19 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus15, localDateTime16, localDateTime17, 0.0d);
        booking10.updateStatus(bookingStatus15);
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        models.booking.Booking booking24 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus15, localDateTime21, localDateTime22, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.CANCELED));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        booking7.checkIn();
        booking7.completeBooking();
        booking7.cancelBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        java.util.UUID uUID11 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        models.booking.Booking.BookingStatus bookingStatus12 = models.booking.Booking.BookingStatus.EXPIRED;
        booking7.updateStatus(bookingStatus12);
        java.util.UUID uUID14 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.EXPIRED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        double double12 = booking7.getDeposit();
        models.booking.Booking.BookingStatus bookingStatus13 = booking7.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.EXPIRED));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = booking7.getStatus();
        booking7.noShow();
        booking7.markAsExpired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus12, localDateTime13, localDateTime14, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = booking16.equals((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Boolean cannot be cast to class models.booking.Booking (java.lang.Boolean is in module java.base of loader 'bootstrap'; models.booking.Booking is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = null;
        models.client.Client client9 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID8, client9, parkingSpace10, bookingStatus11, localDateTime12, localDateTime13, (double) ' ');
        booking15.noShow();
        java.util.UUID uUID17 = null;
        models.client.Client client18 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = null;
        models.booking.Booking.BookingStatus bookingStatus20 = models.booking.Booking.BookingStatus.CANCELED;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        models.booking.Booking booking24 = new models.booking.Booking(uUID17, client18, parkingSpace19, bookingStatus20, localDateTime21, localDateTime22, 0.0d);
        booking15.updateStatus(bookingStatus20);
        booking7.updateStatus(bookingStatus20);
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus20.equals(models.booking.Booking.BookingStatus.CANCELED));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus11, localDateTime12, localDateTime13, (double) '#');
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.EXPIRED;
        booking15.updateStatus(bookingStatus16);
        java.util.UUID uUID18 = booking15.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus19 = booking15.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.EXPIRED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID18);
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus19.equals(models.booking.Booking.BookingStatus.EXPIRED));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        booking7.markAsExpired();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, (double) 100);
        booking7.updateStatus(bookingStatus16);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        booking7.confirmBooking();
        models.client.Client client14 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus16 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace17 = booking7.getParkingSpace();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.NO_SHOW + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.NO_SHOW));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus11, localDateTime12, localDateTime13, (double) '#');
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.EXPIRED;
        booking15.updateStatus(bookingStatus16);
        java.util.UUID uUID18 = booking15.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            booking15.extendDuration((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.EXPIRED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID18);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.booking.Booking.BookingStatus bookingStatus15 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        models.booking.Booking booking19 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus15, localDateTime16, localDateTime17, (double) ' ');
        models.client.Client client20 = booking19.getClient();
        booking19.noShow();
        models.booking.Booking.BookingStatus bookingStatus22 = booking19.getStatus();
        models.booking.Booking.BookingStatus bookingStatus23 = models.booking.Booking.BookingStatus.EXPIRED;
        booking19.updateStatus(bookingStatus23);
        boolean boolean25 = booking10.equals((java.lang.Object) bookingStatus23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        models.booking.Booking booking29 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus23, localDateTime26, localDateTime27, 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client20);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus22.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.EXPIRED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.util.UUID uUID11 = booking7.getBookingID();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        booking7.setParkingSpace(parkingSpace12);
        java.util.UUID uUID14 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.booking.Booking.BookingStatus bookingStatus12 = booking7.getStatus();
        booking7.noShow();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        booking7.markAsExpired();
        models.parkingSpace.ParkingSpace parkingSpace12 = booking7.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.client.Client client9 = booking7.getClient();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.cancelBooking();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, (double) ' ');
        booking20.noShow();
        booking20.completeBooking();
        booking20.checkIn();
        booking20.markAsExpired();
        booking20.cancelBooking();
        boolean boolean26 = booking7.equals((java.lang.Object) booking20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        models.booking.Booking.BookingStatus bookingStatus12 = booking7.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.COMPLETED));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        models.booking.Booking.BookingStatus bookingStatus11 = booking7.getStatus();
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.client.Client client9 = booking7.getClient();
        booking7.noShow();
        models.client.Client client11 = booking7.getClient();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        double double12 = booking7.getDeposit();
        booking7.markAsExpired();
        booking7.confirmBooking();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.parkingSpace.ParkingSpace parkingSpace12 = booking7.getParkingSpace();
        booking7.noShow();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        java.util.UUID uUID9 = null;
        models.client.Client client10 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        models.booking.Booking.BookingStatus bookingStatus12 = models.booking.Booking.BookingStatus.CANCELED;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID9, client10, parkingSpace11, bookingStatus12, localDateTime13, localDateTime14, 0.0d);
        booking7.updateStatus(bookingStatus12);
        models.booking.Booking.BookingStatus bookingStatus18 = booking7.getStatus();
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.CANCELED));
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.CANCELED));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) 0);
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        java.time.LocalDateTime localDateTime9 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        double double18 = booking17.getDeposit();
        java.util.UUID uUID19 = null;
        models.client.Client client20 = null;
        models.parkingSpace.ParkingSpace parkingSpace21 = null;
        models.booking.Booking.BookingStatus bookingStatus22 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime23 = null;
        java.time.LocalDateTime localDateTime24 = null;
        models.booking.Booking booking26 = new models.booking.Booking(uUID19, client20, parkingSpace21, bookingStatus22, localDateTime23, localDateTime24, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus27 = booking26.getStatus();
        boolean boolean28 = booking17.equals((java.lang.Object) booking26);
        booking17.noShow();
        java.time.LocalDateTime localDateTime30 = booking17.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus22.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus27 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus27.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime30);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        double double12 = booking7.getDeposit();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        booking7.cancelBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        booking7.confirmBooking();
        double double14 = booking7.getDeposit();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = booking7.getStatus();
        booking7.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        booking7.markAsExpired();
        java.lang.Class<?> wildcardClass13 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        models.client.Client client13 = booking7.getClient();
        models.parkingSpace.ParkingSpace parkingSpace14 = booking7.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus11, localDateTime12, localDateTime13, (double) '#');
        booking15.completeBooking();
        booking15.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.COMPLETED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) '#');
        models.client.Client client8 = booking7.getClient();
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.COMPLETED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus15 = null;
        booking7.updateStatus(bookingStatus15);
        booking7.completeBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        booking7.checkIn();
        java.time.LocalDateTime localDateTime13 = booking7.getStartTime();
        java.util.UUID uUID14 = null;
        models.client.Client client15 = null;
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.booking.Booking.BookingStatus bookingStatus17 = models.booking.Booking.BookingStatus.CANCELED;
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        models.booking.Booking booking21 = new models.booking.Booking(uUID14, client15, parkingSpace16, bookingStatus17, localDateTime18, localDateTime19, 1.0d);
        booking7.updateStatus(bookingStatus17);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + bookingStatus17 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus17.equals(models.booking.Booking.BookingStatus.CANCELED));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.parkingSpace.ParkingSpace parkingSpace12 = booking7.getParkingSpace();
        booking7.markAsOverstayed();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        double double18 = booking17.getDeposit();
        // The following exception was thrown during execution in test generation
        try {
            booking17.extendDuration(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        double double12 = booking7.getDeposit();
        booking7.markAsExpired();
        booking7.markAsExpired();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.booking.Booking.BookingStatus bookingStatus15 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        models.booking.Booking booking19 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus15, localDateTime16, localDateTime17, (double) 0);
        booking7.updateStatus(bookingStatus15);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        booking7.noShow();
        java.lang.Class<?> wildcardClass15 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.booking.Booking.BookingStatus bookingStatus12 = booking7.getStatus();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        java.util.UUID uUID16 = null;
        models.client.Client client17 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = null;
        models.booking.Booking.BookingStatus bookingStatus19 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        models.booking.Booking booking23 = new models.booking.Booking(uUID16, client17, parkingSpace18, bookingStatus19, localDateTime20, localDateTime21, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus24 = booking23.getStatus();
        java.time.LocalDateTime localDateTime25 = null;
        java.time.LocalDateTime localDateTime26 = null;
        models.booking.Booking booking28 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus24, localDateTime25, localDateTime26, (double) '#');
        booking7.updateStatus(bookingStatus24);
        booking7.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus19.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus24.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        booking7.markAsExpired();
        java.util.UUID uUID14 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.booking.Booking.BookingStatus bookingStatus15 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        models.booking.Booking booking19 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus15, localDateTime16, localDateTime17, (double) ' ');
        booking19.noShow();
        booking19.completeBooking();
        booking19.checkIn();
        booking19.completeBooking();
        models.booking.Booking.BookingStatus bookingStatus24 = booking19.getStatus();
        booking7.updateStatus(bookingStatus24);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus24 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus24.equals(models.booking.Booking.BookingStatus.COMPLETED));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        java.util.UUID uUID9 = null;
        models.client.Client client10 = null;
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        models.booking.Booking.BookingStatus bookingStatus12 = models.booking.Booking.BookingStatus.CANCELED;
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID9, client10, parkingSpace11, bookingStatus12, localDateTime13, localDateTime14, 0.0d);
        booking7.updateStatus(bookingStatus12);
        models.booking.Booking.BookingStatus bookingStatus18 = booking7.getStatus();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.CANCELED));
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.CANCELED));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = booking17.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsExpired();
        booking7.confirmBooking();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        java.util.UUID uUID16 = null;
        models.client.Client client17 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = null;
        models.booking.Booking.BookingStatus bookingStatus19 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        models.booking.Booking booking23 = new models.booking.Booking(uUID16, client17, parkingSpace18, bookingStatus19, localDateTime20, localDateTime21, (double) ' ');
        java.util.UUID uUID24 = booking23.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus25 = booking23.getStatus();
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        models.booking.Booking booking29 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus25, localDateTime26, localDateTime27, (double) 10);
        boolean boolean30 = booking7.equals((java.lang.Object) client14);
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus19.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID24);
        org.junit.Assert.assertTrue("'" + bookingStatus25 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus25.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        java.util.UUID uUID29 = null;
        models.client.Client client30 = null;
        models.parkingSpace.ParkingSpace parkingSpace31 = null;
        models.booking.Booking.BookingStatus bookingStatus32 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        models.booking.Booking booking36 = new models.booking.Booking(uUID29, client30, parkingSpace31, bookingStatus32, localDateTime33, localDateTime34, (double) ' ');
        java.util.UUID uUID37 = booking36.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus38 = booking36.getStatus();
        booking7.updateStatus(bookingStatus38);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus32.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID37);
        org.junit.Assert.assertTrue("'" + bookingStatus38 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus38.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        booking7.markAsOverstayed();
        java.time.LocalDateTime localDateTime13 = booking7.getEndTime();
        booking7.completeBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        booking7.noShow();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.EXPIRED;
        booking7.updateStatus(bookingStatus11);
        booking7.confirmBooking();
        models.client.Client client14 = booking7.getClient();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.EXPIRED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.EXPIRED;
        booking7.updateStatus(bookingStatus11);
        booking7.cancelBooking();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.EXPIRED));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        booking7.cancelBooking();
        booking7.markAsExpired();
        booking7.noShow();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus12, localDateTime13, localDateTime14, (double) 0L);
        booking16.markAsExpired();
        booking16.noShow();
        booking16.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        booking7.confirmBooking();
        java.util.UUID uUID12 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        booking7.noShow();
        java.util.UUID uUID13 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsExpired();
        booking7.cancelBooking();
        models.booking.Booking.BookingStatus bookingStatus13 = models.booking.Booking.BookingStatus.COMPLETED;
        booking7.updateStatus(bookingStatus13);
        java.time.LocalDateTime localDateTime15 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.COMPLETED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        booking7.confirmBooking();
        models.client.Client client14 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus16 = booking7.getStatus();
        booking7.noShow();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.NO_SHOW + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.NO_SHOW));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        booking7.completeBooking();
        booking7.markAsExpired();
        models.parkingSpace.ParkingSpace parkingSpace16 = booking7.getParkingSpace();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        models.booking.Booking.BookingStatus bookingStatus14 = booking10.getStatus();
        java.time.LocalDateTime localDateTime15 = null;
        java.time.LocalDateTime localDateTime16 = null;
        models.booking.Booking booking18 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus14, localDateTime15, localDateTime16, (double) 0.0f);
        booking18.confirmBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = booking18.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus14 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus14.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.util.UUID uUID11 = booking7.getBookingID();
        booking7.cancelBooking();
        models.parkingSpace.ParkingSpace parkingSpace13 = null;
        booking7.setParkingSpace(parkingSpace13);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        booking7.confirmBooking();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        booking7.confirmBooking();
        booking7.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        booking7.noShow();
        booking7.checkIn();
        models.booking.Booking.BookingStatus bookingStatus11 = booking7.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.CHECKED_IN + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.EXPIRED;
        booking7.updateStatus(bookingStatus11);
        booking7.confirmBooking();
        booking7.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.EXPIRED));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        booking7.cancelBooking();
        booking7.checkIn();
        double double14 = booking7.getDeposit();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) 100);
        models.client.Client client8 = booking7.getClient();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.EXPIRED;
        booking7.updateStatus(bookingStatus11);
        booking7.cancelBooking();
        booking7.completeBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.EXPIRED));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        java.time.LocalDateTime localDateTime11 = booking7.getStartTime();
        boolean boolean13 = booking7.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        models.booking.Booking.BookingStatus bookingStatus12 = booking7.getStatus();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        java.util.UUID uUID16 = null;
        models.client.Client client17 = null;
        models.parkingSpace.ParkingSpace parkingSpace18 = null;
        models.booking.Booking.BookingStatus bookingStatus19 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime20 = null;
        java.time.LocalDateTime localDateTime21 = null;
        models.booking.Booking booking23 = new models.booking.Booking(uUID16, client17, parkingSpace18, bookingStatus19, localDateTime20, localDateTime21, (double) ' ');
        booking23.noShow();
        booking23.completeBooking();
        booking23.checkIn();
        booking23.completeBooking();
        models.booking.Booking.BookingStatus bookingStatus28 = booking23.getStatus();
        java.time.LocalDateTime localDateTime29 = null;
        java.time.LocalDateTime localDateTime30 = null;
        models.booking.Booking booking32 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus28, localDateTime29, localDateTime30, (double) 0);
        boolean boolean33 = booking7.equals((java.lang.Object) localDateTime30);
        java.time.LocalDateTime localDateTime34 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.COMPLETED));
        org.junit.Assert.assertTrue("'" + bookingStatus19 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus19.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus28.equals(models.booking.Booking.BookingStatus.COMPLETED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime34);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        booking7.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.parkingSpace.ParkingSpace parkingSpace8 = null;
        booking7.setParkingSpace(parkingSpace8);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.client.Client client10 = booking7.getClient();
        booking7.cancelBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        booking7.confirmBooking();
        models.client.Client client14 = booking7.getClient();
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace24 = null;
        booking22.setParkingSpace(parkingSpace24);
        models.booking.Booking.BookingStatus bookingStatus26 = booking22.getStatus();
        java.util.UUID uUID27 = booking22.getBookingID();
        boolean boolean28 = booking7.equals((java.lang.Object) uUID27);
        booking7.cancelBooking();
        booking7.cancelBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus26.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        booking7.setParkingSpace(parkingSpace12);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        booking7.setParkingSpace(parkingSpace14);
        booking7.cancelBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.cancelBooking();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, (double) ' ');
        booking20.noShow();
        booking20.completeBooking();
        booking20.checkIn();
        booking20.markAsExpired();
        booking20.cancelBooking();
        boolean boolean26 = booking7.equals((java.lang.Object) booking20);
        booking7.markAsExpired();
        models.client.Client client28 = booking7.getClient();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client28);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        booking7.checkIn();
        java.util.UUID uUID30 = null;
        models.client.Client client31 = null;
        models.parkingSpace.ParkingSpace parkingSpace32 = null;
        models.booking.Booking.BookingStatus bookingStatus33 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime34 = null;
        java.time.LocalDateTime localDateTime35 = null;
        models.booking.Booking booking37 = new models.booking.Booking(uUID30, client31, parkingSpace32, bookingStatus33, localDateTime34, localDateTime35, (double) ' ');
        java.util.UUID uUID38 = booking37.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus39 = booking37.getStatus();
        booking7.updateStatus(bookingStatus39);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus33 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus33.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID38);
        org.junit.Assert.assertTrue("'" + bookingStatus39 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus39.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        models.client.Client client9 = booking7.getClient();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        models.client.Client client11 = booking7.getClient();
        booking7.completeBooking();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        models.client.Client client10 = booking7.getClient();
        booking7.confirmBooking();
        double double12 = booking7.getDeposit();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        booking10.noShow();
        booking10.completeBooking();
        booking10.checkIn();
        booking10.markAsExpired();
        booking10.cancelBooking();
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.COMPLETED;
        booking10.updateStatus(bookingStatus16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        models.booking.Booking booking21 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus16, localDateTime18, localDateTime19, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.COMPLETED));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        booking7.markAsExpired();
        java.time.LocalDateTime localDateTime13 = booking7.getEndTime();
        booking7.markAsExpired();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = booking7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSpace.ParkingSpace.getLot()\" because \"this.parkingSpace\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus12, localDateTime13, localDateTime14, (double) 0L);
        booking16.markAsExpired();
        booking16.noShow();
        // The following exception was thrown during execution in test generation
        try {
            booking16.extendDuration((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        models.client.Client client13 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus15 = booking7.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client13);
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.CHECKED_IN + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        java.time.LocalDateTime localDateTime12 = booking7.getStartTime();
        booking7.confirmBooking();
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        booking7.setParkingSpace(parkingSpace14);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        booking7.cancelBooking();
        booking7.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.cancelBooking();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        java.time.LocalDateTime localDateTime12 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.client.Client client9 = booking7.getClient();
        models.client.Client client10 = booking7.getClient();
        booking7.cancelBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        double double18 = booking17.getDeposit();
        booking17.cancelBooking();
        java.util.UUID uUID20 = null;
        models.client.Client client21 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = null;
        models.booking.Booking.BookingStatus bookingStatus23 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID20, client21, parkingSpace22, bookingStatus23, localDateTime24, localDateTime25, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus28 = booking27.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace29 = null;
        booking27.setParkingSpace(parkingSpace29);
        models.booking.Booking.BookingStatus bookingStatus31 = booking27.getStatus();
        java.util.UUID uUID32 = booking27.getBookingID();
        models.client.Client client33 = booking27.getClient();
        java.util.UUID uUID34 = booking27.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus35 = booking27.getStatus();
        boolean boolean36 = booking17.equals((java.lang.Object) booking27);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus28 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus28.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus31 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus31.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID34);
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus35.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        booking10.noShow();
        booking10.completeBooking();
        booking10.checkIn();
        booking10.markAsExpired();
        booking10.cancelBooking();
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.COMPLETED;
        booking10.updateStatus(bookingStatus16);
        java.time.LocalDateTime localDateTime18 = null;
        java.time.LocalDateTime localDateTime19 = null;
        models.booking.Booking booking21 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus16, localDateTime18, localDateTime19, 0.0d);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.COMPLETED));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        models.booking.Booking.BookingStatus bookingStatus12 = booking7.getStatus();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus21 = booking20.getStatus();
        booking7.updateStatus(bookingStatus21);
        booking7.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.COMPLETED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus21 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus21.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        models.booking.Booking.BookingStatus bookingStatus11 = booking7.getStatus();
        java.util.UUID uUID12 = booking7.getBookingID();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, (double) ' ');
        booking20.noShow();
        booking20.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace23 = null;
        booking20.setParkingSpace(parkingSpace23);
        boolean boolean25 = booking7.equals((java.lang.Object) parkingSpace23);
        booking7.checkIn();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus11, localDateTime12, localDateTime13, (double) '#');
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.EXPIRED;
        booking15.updateStatus(bookingStatus16);
        // The following exception was thrown during execution in test generation
        try {
            booking15.extendDuration((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.EXPIRED));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        booking7.confirmBooking();
        booking7.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        booking7.markAsExpired();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = booking7.calculatePrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.client.Client client1 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking3 = new models.booking.Booking(parkingSpace0, client1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsExpired();
        booking7.cancelBooking();
        booking7.completeBooking();
        booking7.completeBooking();
        java.time.LocalDateTime localDateTime15 = booking7.getStartTime();
        java.time.LocalDateTime localDateTime16 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime16);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.checkIn();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.client.Client client11 = booking10.getClient();
        booking10.noShow();
        models.booking.Booking.BookingStatus bookingStatus13 = booking10.getStatus();
        java.time.LocalDateTime localDateTime14 = null;
        java.time.LocalDateTime localDateTime15 = null;
        models.booking.Booking booking17 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus13, localDateTime14, localDateTime15, 0.0d);
        models.client.Client client18 = booking17.getClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = booking17.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        org.junit.Assert.assertTrue("'" + bookingStatus13 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus13.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client18);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        booking7.markAsOverstayed();
        booking7.markAsExpired();
        booking7.cancelBooking();
        booking7.cancelBooking();
        java.time.LocalDateTime localDateTime14 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        booking7.cancelBooking();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.booking.Booking.BookingStatus bookingStatus15 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        models.booking.Booking booking19 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus15, localDateTime16, localDateTime17, (double) ' ');
        models.client.Client client20 = booking19.getClient();
        booking19.checkIn();
        java.util.UUID uUID22 = booking19.getBookingID();
        booking19.markAsExpired();
        java.util.UUID uUID24 = null;
        models.client.Client client25 = null;
        models.parkingSpace.ParkingSpace parkingSpace26 = null;
        java.util.UUID uUID27 = null;
        models.client.Client client28 = null;
        models.parkingSpace.ParkingSpace parkingSpace29 = null;
        models.booking.Booking.BookingStatus bookingStatus30 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        models.booking.Booking booking34 = new models.booking.Booking(uUID27, client28, parkingSpace29, bookingStatus30, localDateTime31, localDateTime32, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus35 = booking34.getStatus();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        models.booking.Booking booking39 = new models.booking.Booking(uUID24, client25, parkingSpace26, bookingStatus35, localDateTime36, localDateTime37, (double) '#');
        booking19.updateStatus(bookingStatus35);
        booking19.confirmBooking();
        boolean boolean42 = booking7.equals((java.lang.Object) booking19);
        double double43 = booking19.getDeposit();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID22);
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus30.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus35.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 32.0d + "'", double43 == 32.0d);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        double double9 = booking7.getDeposit();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.client.Client client9 = booking7.getClient();
        booking7.noShow();
        booking7.markAsOverstayed();
        booking7.confirmBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        double double12 = booking7.getDeposit();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = booking7.getStatus();
        java.time.LocalDateTime localDateTime12 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.checkIn();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.cancelBooking();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, (double) ' ');
        booking20.noShow();
        booking20.completeBooking();
        booking20.checkIn();
        booking20.markAsExpired();
        booking20.cancelBooking();
        boolean boolean26 = booking7.equals((java.lang.Object) booking20);
        java.util.UUID uUID27 = booking20.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = booking20.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID27);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        java.time.LocalDateTime localDateTime11 = booking7.getEndTime();
        booking7.checkIn();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.parkingSpace.ParkingSpace parkingSpace12 = booking7.getParkingSpace();
        booking7.markAsOverstayed();
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = null;
        models.client.Client client9 = null;
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID8, client9, parkingSpace10, bookingStatus11, localDateTime12, localDateTime13, (double) ' ');
        booking15.noShow();
        java.util.UUID uUID17 = null;
        models.client.Client client18 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = null;
        models.booking.Booking.BookingStatus bookingStatus20 = models.booking.Booking.BookingStatus.CANCELED;
        java.time.LocalDateTime localDateTime21 = null;
        java.time.LocalDateTime localDateTime22 = null;
        models.booking.Booking booking24 = new models.booking.Booking(uUID17, client18, parkingSpace19, bookingStatus20, localDateTime21, localDateTime22, 0.0d);
        booking15.updateStatus(bookingStatus20);
        booking7.updateStatus(bookingStatus20);
        java.util.UUID uUID27 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus20 + "' != '" + models.booking.Booking.BookingStatus.CANCELED + "'", bookingStatus20.equals(models.booking.Booking.BookingStatus.CANCELED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID27);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        models.parkingSpace.ParkingSpace parkingSpace11 = null;
        booking7.setParkingSpace(parkingSpace11);
        models.parkingSpace.ParkingSpace parkingSpace13 = null;
        booking7.setParkingSpace(parkingSpace13);
        models.booking.Booking.BookingStatus bookingStatus15 = booking7.getStatus();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.CHECKED_IN + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.CHECKED_IN));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.time.LocalDateTime localDateTime12 = null;
        java.time.LocalDateTime localDateTime13 = null;
        models.booking.Booking booking15 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus11, localDateTime12, localDateTime13, (double) '#');
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.EXPIRED;
        booking15.updateStatus(bookingStatus16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = booking15.getLicencePlate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getLicencePlate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.EXPIRED));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace9 = null;
        booking7.setParkingSpace(parkingSpace9);
        booking7.cancelBooking();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.booking.Booking.BookingStatus bookingStatus15 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        models.booking.Booking booking19 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus15, localDateTime16, localDateTime17, (double) ' ');
        models.client.Client client20 = booking19.getClient();
        booking19.checkIn();
        java.util.UUID uUID22 = booking19.getBookingID();
        booking19.markAsExpired();
        java.util.UUID uUID24 = null;
        models.client.Client client25 = null;
        models.parkingSpace.ParkingSpace parkingSpace26 = null;
        java.util.UUID uUID27 = null;
        models.client.Client client28 = null;
        models.parkingSpace.ParkingSpace parkingSpace29 = null;
        models.booking.Booking.BookingStatus bookingStatus30 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime31 = null;
        java.time.LocalDateTime localDateTime32 = null;
        models.booking.Booking booking34 = new models.booking.Booking(uUID27, client28, parkingSpace29, bookingStatus30, localDateTime31, localDateTime32, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus35 = booking34.getStatus();
        java.time.LocalDateTime localDateTime36 = null;
        java.time.LocalDateTime localDateTime37 = null;
        models.booking.Booking booking39 = new models.booking.Booking(uUID24, client25, parkingSpace26, bookingStatus35, localDateTime36, localDateTime37, (double) '#');
        booking19.updateStatus(bookingStatus35);
        booking19.confirmBooking();
        boolean boolean42 = booking7.equals((java.lang.Object) booking19);
        booking7.cancelBooking();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID22);
        org.junit.Assert.assertTrue("'" + bookingStatus30 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus30.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus35 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus35.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        booking7.confirmBooking();
        models.client.Client client14 = booking7.getClient();
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace24 = null;
        booking22.setParkingSpace(parkingSpace24);
        models.booking.Booking.BookingStatus bookingStatus26 = booking22.getStatus();
        java.util.UUID uUID27 = booking22.getBookingID();
        boolean boolean28 = booking7.equals((java.lang.Object) uUID27);
        java.time.LocalDateTime localDateTime29 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus26 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus26.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime29);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        booking7.checkIn();
        java.util.UUID uUID13 = booking7.getBookingID();
        java.time.LocalDateTime localDateTime14 = booking7.getEndTime();
        models.client.Client client15 = booking7.getClient();
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client15);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        double double12 = booking7.getDeposit();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Additional hours must be positive");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        booking7.confirmBooking();
        models.parkingSpace.ParkingSpace parkingSpace13 = null;
        booking7.setParkingSpace(parkingSpace13);
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        models.booking.Booking.BookingStatus bookingStatus29 = null;
        booking7.updateStatus(bookingStatus29);
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        booking7.cancelBooking();
        java.util.UUID uUID13 = null;
        models.client.Client client14 = null;
        models.parkingSpace.ParkingSpace parkingSpace15 = null;
        models.booking.Booking.BookingStatus bookingStatus16 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime17 = null;
        java.time.LocalDateTime localDateTime18 = null;
        models.booking.Booking booking20 = new models.booking.Booking(uUID13, client14, parkingSpace15, bookingStatus16, localDateTime17, localDateTime18, (double) ' ');
        booking20.noShow();
        booking20.completeBooking();
        booking20.checkIn();
        booking20.markAsExpired();
        booking20.cancelBooking();
        boolean boolean26 = booking7.equals((java.lang.Object) booking20);
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.time.LocalDateTime localDateTime11 = null;
        java.time.LocalDateTime localDateTime12 = null;
        models.booking.Booking booking14 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus6, localDateTime11, localDateTime12, (double) 10);
        java.time.LocalDateTime localDateTime15 = booking14.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.parkingSpace.ParkingSpace parkingSpace12 = booking7.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            booking7.extendDuration(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusHours(long)\" because \"this.endTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.COMPLETED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) '#');
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID10 = booking7.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.COMPLETED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = null;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) (-1L));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.confirmBooking();
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        booking7.confirmBooking();
        java.time.LocalDateTime localDateTime13 = booking7.getStartTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        java.util.UUID uUID8 = booking7.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus9 = booking7.getStatus();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        models.parkingSpace.ParkingSpace parkingSpace12 = booking7.getParkingSpace();
        booking7.markAsOverstayed();
        booking7.markAsExpired();
        booking7.markAsExpired();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        org.junit.Assert.assertTrue("'" + bookingStatus9 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus9.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        booking7.noShow();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        booking7.markAsOverstayed();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking7.getDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.format(java.time.format.DateTimeFormatter)\" because \"this.startTime\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsExpired();
        booking7.cancelBooking();
        booking7.completeBooking();
        booking7.completeBooking();
        models.parkingSpace.ParkingSpace parkingSpace15 = booking7.getParkingSpace();
        java.util.UUID uUID16 = booking7.getBookingID();
        java.util.UUID uUID17 = null;
        models.client.Client client18 = null;
        models.parkingSpace.ParkingSpace parkingSpace19 = null;
        java.util.UUID uUID20 = null;
        models.client.Client client21 = null;
        models.parkingSpace.ParkingSpace parkingSpace22 = null;
        models.booking.Booking.BookingStatus bookingStatus23 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID20, client21, parkingSpace22, bookingStatus23, localDateTime24, localDateTime25, (double) ' ');
        booking27.noShow();
        booking27.completeBooking();
        booking27.checkIn();
        booking27.completeBooking();
        models.booking.Booking.BookingStatus bookingStatus32 = booking27.getStatus();
        java.time.LocalDateTime localDateTime33 = null;
        java.time.LocalDateTime localDateTime34 = null;
        models.booking.Booking booking36 = new models.booking.Booking(uUID17, client18, parkingSpace19, bookingStatus32, localDateTime33, localDateTime34, (double) 0);
        models.booking.Booking.BookingStatus bookingStatus37 = booking36.getStatus();
        boolean boolean38 = booking7.equals((java.lang.Object) bookingStatus37);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID16);
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus32 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus32.equals(models.booking.Booking.BookingStatus.COMPLETED));
        org.junit.Assert.assertTrue("'" + bookingStatus37 + "' != '" + models.booking.Booking.BookingStatus.COMPLETED + "'", bookingStatus37.equals(models.booking.Booking.BookingStatus.COMPLETED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.markAsOverstayed();
        java.util.UUID uUID12 = booking7.getBookingID();
        booking7.confirmBooking();
        models.client.Client client14 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus16 = booking7.getStatus();
        java.time.LocalDateTime localDateTime17 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client14);
        org.junit.Assert.assertTrue("'" + bookingStatus16 + "' != '" + models.booking.Booking.BookingStatus.NO_SHOW + "'", bookingStatus16.equals(models.booking.Booking.BookingStatus.NO_SHOW));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime17);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus8 = booking7.getStatus();
        booking7.noShow();
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        booking7.setParkingSpace(parkingSpace10);
        booking7.markAsOverstayed();
        java.time.LocalDateTime localDateTime13 = booking7.getEndTime();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus8 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus8.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        java.time.LocalDateTime localDateTime9 = booking7.getStartTime();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = booking7.deductedPrice();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) 0L);
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        booking7.noShow();
        booking7.completeBooking();
        booking7.checkIn();
        booking7.completeBooking();
        double double12 = booking7.getDeposit();
        booking7.markAsExpired();
        models.parkingSpace.ParkingSpace parkingSpace14 = booking7.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            booking7.payDeposit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.client.Client.getRate()\" because \"this.client\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace14);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        java.util.UUID uUID15 = null;
        models.client.Client client16 = null;
        models.parkingSpace.ParkingSpace parkingSpace17 = null;
        models.booking.Booking.BookingStatus bookingStatus18 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime19 = null;
        java.time.LocalDateTime localDateTime20 = null;
        models.booking.Booking booking22 = new models.booking.Booking(uUID15, client16, parkingSpace17, bookingStatus18, localDateTime19, localDateTime20, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus23 = booking22.getStatus();
        java.time.LocalDateTime localDateTime24 = null;
        java.time.LocalDateTime localDateTime25 = null;
        models.booking.Booking booking27 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus23, localDateTime24, localDateTime25, (double) '#');
        booking7.updateStatus(bookingStatus23);
        models.booking.Booking.BookingStatus bookingStatus29 = null;
        booking7.updateStatus(bookingStatus29);
        booking7.markAsOverstayed();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        org.junit.Assert.assertTrue("'" + bookingStatus18 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus18.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        java.util.UUID uUID11 = booking10.getBookingID();
        models.booking.Booking.BookingStatus bookingStatus12 = booking10.getStatus();
        java.time.LocalDateTime localDateTime13 = null;
        java.time.LocalDateTime localDateTime14 = null;
        models.booking.Booking booking16 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus12, localDateTime13, localDateTime14, (double) 0L);
        java.util.UUID uUID17 = booking16.getBookingID();
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        org.junit.Assert.assertTrue("'" + bookingStatus12 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus12.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID17);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.noShow();
        models.booking.Booking.BookingStatus bookingStatus10 = booking7.getStatus();
        models.booking.Booking.BookingStatus bookingStatus11 = models.booking.Booking.BookingStatus.EXPIRED;
        booking7.updateStatus(bookingStatus11);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = booking7.calculateHours();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.temporal.Temporal.until(java.time.temporal.Temporal, java.time.temporal.TemporalUnit)\" because \"startInclusive\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        org.junit.Assert.assertTrue("'" + bookingStatus10 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus10.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.EXPIRED));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        java.util.UUID uUID3 = null;
        models.client.Client client4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.booking.Booking.BookingStatus bookingStatus6 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime7 = null;
        java.time.LocalDateTime localDateTime8 = null;
        models.booking.Booking booking10 = new models.booking.Booking(uUID3, client4, parkingSpace5, bookingStatus6, localDateTime7, localDateTime8, (double) ' ');
        models.booking.Booking.BookingStatus bookingStatus11 = booking10.getStatus();
        java.util.UUID uUID12 = null;
        models.client.Client client13 = null;
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.booking.Booking.BookingStatus bookingStatus15 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime16 = null;
        java.time.LocalDateTime localDateTime17 = null;
        models.booking.Booking booking19 = new models.booking.Booking(uUID12, client13, parkingSpace14, bookingStatus15, localDateTime16, localDateTime17, (double) ' ');
        models.client.Client client20 = booking19.getClient();
        booking19.noShow();
        models.booking.Booking.BookingStatus bookingStatus22 = booking19.getStatus();
        models.booking.Booking.BookingStatus bookingStatus23 = models.booking.Booking.BookingStatus.EXPIRED;
        booking19.updateStatus(bookingStatus23);
        boolean boolean25 = booking10.equals((java.lang.Object) bookingStatus23);
        java.time.LocalDateTime localDateTime26 = null;
        java.time.LocalDateTime localDateTime27 = null;
        models.booking.Booking booking29 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus23, localDateTime26, localDateTime27, 10.0d);
        models.parkingSpace.ParkingSpace parkingSpace30 = null;
        booking29.setParkingSpace(parkingSpace30);
        models.parkingSpace.ParkingSpace parkingSpace32 = null;
        booking29.setParkingSpace(parkingSpace32);
        org.junit.Assert.assertTrue("'" + bookingStatus6 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus6.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus11 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus11.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus15 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus15.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client20);
        org.junit.Assert.assertTrue("'" + bookingStatus22 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus22.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        org.junit.Assert.assertTrue("'" + bookingStatus23 + "' != '" + models.booking.Booking.BookingStatus.EXPIRED + "'", bookingStatus23.equals(models.booking.Booking.BookingStatus.EXPIRED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.util.UUID uUID0 = null;
        models.client.Client client1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.booking.Booking.BookingStatus bookingStatus3 = models.booking.Booking.BookingStatus.OVERSTAYED;
        java.time.LocalDateTime localDateTime4 = null;
        java.time.LocalDateTime localDateTime5 = null;
        models.booking.Booking booking7 = new models.booking.Booking(uUID0, client1, parkingSpace2, bookingStatus3, localDateTime4, localDateTime5, (double) ' ');
        models.client.Client client8 = booking7.getClient();
        booking7.checkIn();
        java.util.UUID uUID10 = booking7.getBookingID();
        booking7.markAsExpired();
        double double12 = booking7.getDeposit();
        booking7.markAsExpired();
        booking7.confirmBooking();
        java.lang.Class<?> wildcardClass15 = booking7.getClass();
        org.junit.Assert.assertTrue("'" + bookingStatus3 + "' != '" + models.booking.Booking.BookingStatus.OVERSTAYED + "'", bookingStatus3.equals(models.booking.Booking.BookingStatus.OVERSTAYED));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

