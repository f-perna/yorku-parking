package randoop.models.parkingSensor;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ParkingSensorRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        java.lang.Class<?> wildcardClass2 = parkingSensor1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        boolean boolean2 = parkingSensor1.isCarPresent();
        java.lang.Class<?> wildcardClass3 = parkingSensor1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        java.lang.Class<?> wildcardClass14 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        java.lang.Class<?> wildcardClass8 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("");
        parkingSensor2.initializeWithCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        java.lang.Class<?> wildcardClass7 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        java.lang.Class<?> wildcardClass7 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.lang.String str8 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.lang.Class<?> wildcardClass10 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        java.lang.String str7 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        java.lang.Class<?> wildcardClass8 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.util.UUID uUID6 = parkingSensor2.getId();
        java.lang.Class<?> wildcardClass7 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.util.UUID uUID6 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        java.time.LocalDateTime localDateTime11 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        boolean boolean15 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        models.parkingSensor.ParkingSensorListener parkingSensorListener4 = null;
        parkingSensor2.removeListener(parkingSensorListener4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        boolean boolean12 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.lang.String str6 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        java.util.UUID uUID8 = parkingSensor2.getId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = uUID8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        boolean boolean8 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("");
        parkingSensor2.detectCar("hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.detectCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.addListener(parkingSensorListener5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        parkingSensor1.removeCar();
        models.parkingSensor.ParkingSensorListener parkingSensorListener3 = null;
        parkingSensor1.addListener(parkingSensorListener3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        parkingSensor1.removeCar();
        models.parkingSensor.ParkingSensorListener parkingSensorListener3 = null;
        parkingSensor1.removeListener(parkingSensorListener3);
        models.parkingSpace.ParkingSpace parkingSpace5 = parkingSensor1.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        java.util.UUID uUID8 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        parkingSensor2.detectCar("");
        java.lang.Class<?> wildcardClass15 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.time.LocalDateTime localDateTime8 = parkingSensor2.getLastDetectionTime();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSensor.ParkingSensorListener parkingSensorListener10 = null;
        parkingSensor2.removeListener(parkingSensorListener10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        boolean boolean2 = parkingSensor1.isCarPresent();
        java.time.LocalDateTime localDateTime3 = parkingSensor1.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSensor1.getParkingSpace();
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor1.addListener(parkingSensorListener5);
        java.time.LocalDateTime localDateTime7 = parkingSensor1.getLastDetectionTime();
        // The following exception was thrown during execution in test generation
        try {
            parkingSensor1.detectCar("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSensor.ParkingSensorListener.onCarDetected(models.parkingSensor.ParkingSensor, String, java.time.LocalDateTime)\" because \"listener\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.addListener(parkingSensorListener7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        models.booking.Booking booking14 = null;
        boolean boolean15 = parkingSensor2.isBookingOwnerCar(booking14);
        parkingSensor2.initializeWithCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        java.time.LocalDateTime localDateTime13 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        models.booking.Booking booking9 = null;
        boolean boolean10 = parkingSensor2.isBookingOwnerCar(booking9);
        parkingSensor2.initializeWithCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("");
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        java.lang.String str8 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        java.util.UUID uUID16 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("");
        parkingSensor2.removeCar();
        parkingSensor2.initializeWithCar("");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        java.util.UUID uUID9 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.addListener(parkingSensorListener5);
        parkingSensor2.detectCar("hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.util.UUID uUID9 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        parkingSensor2.detectCar("hi!");
        java.lang.Class<?> wildcardClass11 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        parkingSensor2.detectCar("");
        parkingSensor2.initializeWithCar("hi!");
        parkingSensor2.initializeWithCar("hi!");
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        java.lang.Class<?> wildcardClass5 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        boolean boolean11 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime12 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.addListener(parkingSensorListener13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.removeListener(parkingSensorListener6);
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.addListener(parkingSensorListener8);
        java.lang.Class<?> wildcardClass10 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        boolean boolean15 = parkingSensor2.isCarPresent();
        boolean boolean16 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        java.util.UUID uUID4 = parkingSensor2.getId();
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        java.lang.String str6 = parkingSensor2.getDetectedLicencePlate();
        boolean boolean7 = parkingSensor2.isCarPresent();
        models.booking.Booking booking8 = null;
        boolean boolean9 = parkingSensor2.isBookingOwnerCar(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        parkingSensor2.detectCar("");
        parkingSensor2.initializeWithCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener17 = null;
        parkingSensor2.addListener(parkingSensorListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.addListener(parkingSensorListener6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime16 = parkingSensor2.getLastDetectionTime();
        java.util.UUID uUID17 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID17);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace8 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        java.util.UUID uUID4 = parkingSensor2.getId();
        java.lang.String str5 = parkingSensor2.getDetectedLicencePlate();
        java.lang.Class<?> wildcardClass6 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime16 = parkingSensor2.getLastDetectionTime();
        java.lang.String str17 = parkingSensor2.getDetectedLicencePlate();
        java.lang.Class<?> wildcardClass18 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        parkingSensor2.detectCar("hi!");
        java.util.UUID uUID11 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.time.LocalDateTime localDateTime8 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSensor2.getParkingSpace();
        java.time.LocalDateTime localDateTime10 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        java.time.LocalDateTime localDateTime2 = parkingSensor1.getLastDetectionTime();
        parkingSensor1.detectCar("hi!");
        java.lang.Class<?> wildcardClass5 = parkingSensor1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        java.util.UUID uUID4 = parkingSensor2.getId();
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.removeListener(parkingSensorListener6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("");
        boolean boolean15 = parkingSensor2.isCarPresent();
        boolean boolean16 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.parkingSensor.ParkingSensorListener parkingSensorListener2 = null;
        parkingSensor1.addListener(parkingSensorListener2);
        models.parkingSensor.ParkingSensorListener parkingSensorListener4 = null;
        parkingSensor1.addListener(parkingSensorListener4);
        parkingSensor1.removeCar();
        // The following exception was thrown during execution in test generation
        try {
            parkingSensor1.detectCar("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSensor.ParkingSensorListener.onCarDetected(models.parkingSensor.ParkingSensor, String, java.time.LocalDateTime)\" because \"listener\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("");
        java.util.UUID uUID15 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("");
        models.booking.Booking booking18 = null;
        boolean boolean19 = parkingSensor2.isBookingOwnerCar(booking18);
        boolean boolean20 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        parkingSensor2.detectCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        boolean boolean13 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        models.booking.Booking booking8 = null;
        boolean boolean9 = parkingSensor2.isBookingOwnerCar(booking8);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSensor2.getParkingSpace();
        parkingSensor2.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.util.UUID uUID6 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.addListener(parkingSensorListener7);
        java.lang.Class<?> wildcardClass9 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.parkingSensor.ParkingSensorListener parkingSensorListener2 = null;
        parkingSensor1.addListener(parkingSensorListener2);
        java.util.UUID uUID4 = parkingSensor1.getId();
        java.util.UUID uUID5 = parkingSensor1.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "e7fca520-1b86-4883-a18d-f092323853fe");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "e7fca520-1b86-4883-a18d-f092323853fe");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        java.lang.String str15 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        parkingSensor2.removeCar();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace1);
        models.parkingSensor.ParkingSensorListener parkingSensorListener3 = null;
        parkingSensor2.addListener(parkingSensorListener3);
        java.util.UUID uUID5 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensor parkingSensor6 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID5);
        java.time.LocalDateTime localDateTime7 = parkingSensor6.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "646a8540-4a73-4f19-9f9c-740503ee86bd");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.util.UUID uUID6 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.addListener(parkingSensorListener7);
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSensor2.getParkingSpace();
        java.lang.String str10 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        parkingSensor2.detectCar("");
        parkingSensor2.initializeWithCar("hi!");
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        models.booking.Booking booking14 = null;
        boolean boolean15 = parkingSensor2.isBookingOwnerCar(booking14);
        java.lang.String str16 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        boolean boolean8 = parkingSensor2.isCarPresent();
        java.lang.Class<?> wildcardClass9 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        java.time.LocalDateTime localDateTime11 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        boolean boolean9 = parkingSensor2.isCarPresent();
        parkingSensor2.initializeWithCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSensor2.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = parkingSpace6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        parkingSensor2.initializeWithCar("hi!");
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        java.util.UUID uUID8 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensor parkingSensor9 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID8.toString(), "16d1a830-2494-41a2-a44b-de6eb4c88b49");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        java.lang.String str13 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSensor.ParkingSensorListener parkingSensorListener14 = null;
        parkingSensor2.addListener(parkingSensorListener14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.parkingSensor.ParkingSensorListener parkingSensorListener2 = null;
        parkingSensor1.addListener(parkingSensorListener2);
        models.parkingSensor.ParkingSensorListener parkingSensorListener4 = null;
        parkingSensor1.addListener(parkingSensorListener4);
        parkingSensor1.removeCar();
        parkingSensor1.initializeWithCar("hi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.addListener(parkingSensorListener11);
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        java.util.UUID uUID15 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        models.booking.Booking booking11 = null;
        boolean boolean12 = parkingSensor2.isBookingOwnerCar(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        java.time.LocalDateTime localDateTime2 = parkingSensor1.getLastDetectionTime();
        parkingSensor1.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.parkingSensor.ParkingSensor parkingSensor3 = new models.parkingSensor.ParkingSensor(parkingSpace2);
        boolean boolean4 = parkingSensor3.isCarPresent();
        java.time.LocalDateTime localDateTime5 = parkingSensor3.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSensor3.getParkingSpace();
        parkingSensor3.initializeWithCar("");
        java.util.UUID uUID9 = parkingSensor3.getId();
        models.parkingSensor.ParkingSensor parkingSensor10 = new models.parkingSensor.ParkingSensor(parkingSpace1, uUID9);
        models.parkingSensor.ParkingSensor parkingSensor11 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID9.toString(), "ffd66f5c-5089-4b08-a1c4-0b17bbeee84e");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        models.booking.Booking booking11 = null;
        boolean boolean12 = parkingSensor2.isBookingOwnerCar(booking11);
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        models.booking.Booking booking15 = null;
        boolean boolean16 = parkingSensor2.isBookingOwnerCar(booking15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        models.parkingSensor.ParkingSensorListener parkingSensorListener15 = null;
        parkingSensor2.removeListener(parkingSensorListener15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.removeListener(parkingSensorListener6);
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.addListener(parkingSensorListener8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        boolean boolean8 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        parkingSensor2.initializeWithCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime16 = parkingSensor2.getLastDetectionTime();
        boolean boolean17 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        parkingSensor2.detectCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener12 = null;
        parkingSensor2.addListener(parkingSensorListener12);
        // The following exception was thrown during execution in test generation
        try {
            parkingSensor2.removeCar();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.parkingSensor.ParkingSensorListener.onCarRemoved(models.parkingSensor.ParkingSensor, java.time.LocalDateTime)\" because \"listener\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        parkingSensor2.detectCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        java.util.UUID uUID13 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        parkingSensor2.removeCar();
        models.parkingSensor.ParkingSensorListener parkingSensorListener17 = null;
        parkingSensor2.removeListener(parkingSensorListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime4 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("");
        parkingSensor2.initializeWithCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener20 = null;
        parkingSensor2.addListener(parkingSensorListener20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        boolean boolean16 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        parkingSensor2.removeCar();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        parkingSensor2.detectCar("");
        parkingSensor2.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        parkingSensor2.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        boolean boolean2 = parkingSensor1.isCarPresent();
        boolean boolean3 = parkingSensor1.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        boolean boolean11 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        parkingSensor2.detectCar("hi!");
        models.parkingSpace.ParkingSpace parkingSpace16 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace16);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = new models.parkingSensor.ParkingSensor(parkingSpace3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor4.addListener(parkingSensorListener5);
        java.util.UUID uUID7 = parkingSensor4.getId();
        models.parkingSensor.ParkingSensor parkingSensor8 = new models.parkingSensor.ParkingSensor(parkingSpace2, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor9 = new models.parkingSensor.ParkingSensor(parkingSpace1, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor10 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID7);
        java.time.LocalDateTime localDateTime11 = parkingSensor10.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "e8aaa36c-a2e8-441b-8a58-5fd2576bb63e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.removeListener(parkingSensorListener6);
        parkingSensor2.initializeWithCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime16 = parkingSensor2.getLastDetectionTime();
        java.lang.String str17 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace18 = parkingSensor2.getParkingSpace();
        parkingSensor2.removeCar();
        models.parkingSpace.ParkingSpace parkingSpace20 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace20);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        java.util.UUID uUID5 = parkingSensor2.getId();
        java.util.UUID uUID6 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.booking.Booking booking2 = null;
        boolean boolean3 = parkingSensor1.isBookingOwnerCar(booking2);
        parkingSensor1.initializeWithCar("hi!");
        parkingSensor1.removeCar();
        java.lang.String str7 = parkingSensor1.getDetectedLicencePlate();
        parkingSensor1.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        parkingSensor2.detectCar("");
        models.parkingSensor.ParkingSensorListener parkingSensorListener15 = null;
        parkingSensor2.removeListener(parkingSensorListener15);
        java.time.LocalDateTime localDateTime17 = parkingSensor2.getLastDetectionTime();
        java.time.LocalDateTime localDateTime18 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.detectCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        boolean boolean7 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime16 = parkingSensor2.getLastDetectionTime();
        java.lang.String str17 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace18 = parkingSensor2.getParkingSpace();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        parkingSensor1.removeCar();
        java.lang.Class<?> wildcardClass3 = parkingSensor1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        java.util.UUID uUID11 = parkingSensor2.getId();
        java.lang.String str12 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        java.util.UUID uUID13 = parkingSensor2.getId();
        models.booking.Booking booking14 = null;
        boolean boolean15 = parkingSensor2.isBookingOwnerCar(booking14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        models.parkingSpace.ParkingSpace parkingSpace13 = parkingSensor2.getParkingSpace();
        java.util.UUID uUID14 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener15 = null;
        parkingSensor2.removeListener(parkingSensorListener15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.time.LocalDateTime localDateTime8 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSensor2.getParkingSpace();
        parkingSensor2.detectCar("");
        java.lang.String str12 = parkingSensor2.getDetectedLicencePlate();
        java.lang.Class<?> wildcardClass13 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.booking.Booking booking2 = null;
        boolean boolean3 = parkingSensor1.isBookingOwnerCar(booking2);
        parkingSensor1.initializeWithCar("hi!");
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSensor1.getParkingSpace();
        java.util.UUID uUID7 = parkingSensor1.getId();
        parkingSensor1.initializeWithCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "59e9cc90-02a4-450e-b01e-853a4d13d3cd");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        java.util.UUID uUID4 = parkingSensor2.getId();
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        java.lang.String str6 = parkingSensor2.getDetectedLicencePlate();
        boolean boolean7 = parkingSensor2.isCarPresent();
        parkingSensor2.initializeWithCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.removeListener(parkingSensorListener6);
        boolean boolean8 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.addListener(parkingSensorListener9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSensor2.getParkingSpace();
        parkingSensor2.detectCar("hi!");
        java.time.LocalDateTime localDateTime14 = parkingSensor2.getLastDetectionTime();
        java.util.UUID uUID15 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        parkingSensor2.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        parkingSensor2.detectCar("");
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        parkingSensor2.initializeWithCar("");
        parkingSensor2.removeCar();
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        parkingSensor2.initializeWithCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.booking.Booking booking2 = null;
        boolean boolean3 = parkingSensor1.isBookingOwnerCar(booking2);
        parkingSensor1.initializeWithCar("hi!");
        parkingSensor1.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("");
        java.time.LocalDateTime localDateTime10 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        boolean boolean8 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime9 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking10 = null;
        boolean boolean11 = parkingSensor2.isBookingOwnerCar(booking10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        java.util.UUID uUID4 = parkingSensor2.getId();
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        java.lang.String str6 = parkingSensor2.getDetectedLicencePlate();
        boolean boolean7 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.addListener(parkingSensorListener8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime16 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSensor2.getParkingSpace();
        parkingSensor2.detectCar("hi!");
        java.time.LocalDateTime localDateTime14 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener15 = null;
        parkingSensor2.removeListener(parkingSensorListener15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        models.parkingSpace.ParkingSpace parkingSpace13 = parkingSensor2.getParkingSpace();
        java.util.UUID uUID14 = parkingSensor2.getId();
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.lang.String str16 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("");
        java.util.UUID uUID9 = parkingSensor2.getId();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID8 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.detectCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        parkingSensor2.detectCar("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        java.util.UUID uUID5 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("");
        models.parkingSpace.ParkingSpace parkingSpace8 = parkingSensor2.getParkingSpace();
        models.booking.Booking booking9 = null;
        boolean boolean10 = parkingSensor2.isBookingOwnerCar(booking9);
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.initializeWithCar("");
        parkingSensor2.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.booking.Booking booking2 = null;
        boolean boolean3 = parkingSensor1.isBookingOwnerCar(booking2);
        parkingSensor1.initializeWithCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor1.addListener(parkingSensorListener6);
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor1.addListener(parkingSensorListener8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        models.parkingSpace.ParkingSpace parkingSpace13 = parkingSensor2.getParkingSpace();
        boolean boolean14 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime15 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime15);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        java.util.UUID uUID5 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("");
        models.parkingSpace.ParkingSpace parkingSpace8 = parkingSensor2.getParkingSpace();
        models.booking.Booking booking9 = null;
        boolean boolean10 = parkingSensor2.isBookingOwnerCar(booking9);
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = new models.parkingSensor.ParkingSensor(parkingSpace3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor4.addListener(parkingSensorListener5);
        java.util.UUID uUID7 = parkingSensor4.getId();
        models.parkingSensor.ParkingSensor parkingSensor8 = new models.parkingSensor.ParkingSensor(parkingSpace2, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor9 = new models.parkingSensor.ParkingSensor(parkingSpace1, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor10 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID7);
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSensor10.getParkingSpace();
        models.parkingSensor.ParkingSensorListener parkingSensorListener12 = null;
        parkingSensor10.addListener(parkingSensorListener12);
        models.booking.Booking booking14 = null;
        boolean boolean15 = parkingSensor10.isBookingOwnerCar(booking14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "87909e4c-a417-44f0-88f8-77ade768f925");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace1);
        boolean boolean3 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime4 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace5 = parkingSensor2.getParkingSpace();
        parkingSensor2.initializeWithCar("");
        java.util.UUID uUID8 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensor parkingSensor9 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID8);
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor9.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID8.toString(), "56f8657c-ace1-4878-8cec-e5094030f7d2");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID12 = parkingSensor2.getId();
        java.util.UUID uUID13 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        parkingSensor2.detectCar("hi!");
        java.util.UUID uUID14 = parkingSensor2.getId();
        java.util.UUID uUID15 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        parkingSensor2.initializeWithCar("");
        java.lang.Class<?> wildcardClass10 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("");
        java.util.UUID uUID9 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener10 = null;
        parkingSensor2.removeListener(parkingSensorListener10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.removeListener(parkingSensorListener6);
        java.lang.String str8 = parkingSensor2.getDetectedLicencePlate();
        parkingSensor2.initializeWithCar("hi!");
        java.time.LocalDateTime localDateTime11 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("");
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("hi!");
        java.util.UUID uUID8 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.addListener(parkingSensorListener9);
        models.booking.Booking booking11 = null;
        boolean boolean12 = parkingSensor2.isBookingOwnerCar(booking11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("");
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("hi!");
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.util.UUID uUID9 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        java.util.UUID uUID6 = parkingSensor2.getId();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = new models.parkingSensor.ParkingSensor(parkingSpace3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor4.addListener(parkingSensorListener5);
        java.util.UUID uUID7 = parkingSensor4.getId();
        models.parkingSensor.ParkingSensor parkingSensor8 = new models.parkingSensor.ParkingSensor(parkingSpace2, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor9 = new models.parkingSensor.ParkingSensor(parkingSpace1, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor10 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID7);
        parkingSensor10.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "ca71486e-8e31-4c19-85b8-ef51a4fa9133");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.removeListener(parkingSensorListener6);
        boolean boolean8 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime16 = parkingSensor2.getLastDetectionTime();
        java.lang.String str17 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace18 = parkingSensor2.getParkingSpace();
        models.parkingSpace.ParkingSpace parkingSpace19 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace19);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        parkingSensor2.detectCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        java.util.UUID uUID13 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        parkingSensor2.removeCar();
        boolean boolean17 = parkingSensor2.isCarPresent();
        models.parkingSpace.ParkingSpace parkingSpace18 = parkingSensor2.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = parkingSpace18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        parkingSensor2.initializeWithCar("");
        parkingSensor2.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        java.util.UUID uUID11 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener12 = null;
        parkingSensor2.removeListener(parkingSensorListener12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.initializeWithCar("");
        java.lang.Class<?> wildcardClass9 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        models.booking.Booking booking10 = null;
        boolean boolean11 = parkingSensor2.isBookingOwnerCar(booking10);
        models.parkingSpace.ParkingSpace parkingSpace12 = parkingSensor2.getParkingSpace();
        boolean boolean13 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        models.booking.Booking booking13 = null;
        boolean boolean14 = parkingSensor2.isBookingOwnerCar(booking13);
        models.booking.Booking booking15 = null;
        boolean boolean16 = parkingSensor2.isBookingOwnerCar(booking15);
        java.lang.Class<?> wildcardClass17 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        java.lang.String str13 = parkingSensor2.getDetectedLicencePlate();
        java.time.LocalDateTime localDateTime14 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.addListener(parkingSensorListener7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.addListener(parkingSensorListener9);
        java.lang.Class<?> wildcardClass11 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        java.util.UUID uUID8 = parkingSensor2.getId();
        parkingSensor2.detectCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        java.time.LocalDateTime localDateTime8 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        models.booking.Booking booking8 = null;
        boolean boolean9 = parkingSensor2.isBookingOwnerCar(booking8);
        java.lang.Class<?> wildcardClass10 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("");
        java.util.UUID uUID15 = parkingSensor2.getId();
        boolean boolean16 = parkingSensor2.isCarPresent();
        models.parkingSpace.ParkingSpace parkingSpace17 = parkingSensor2.getParkingSpace();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace17);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.util.UUID uUID9 = parkingSensor2.getId();
        java.time.LocalDateTime localDateTime10 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("");
        boolean boolean15 = parkingSensor2.isCarPresent();
        parkingSensor2.initializeWithCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        models.booking.Booking booking11 = null;
        boolean boolean12 = parkingSensor2.isBookingOwnerCar(booking11);
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        models.parkingSpace.ParkingSpace parkingSpace15 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        java.time.LocalDateTime localDateTime12 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.addListener(parkingSensorListener13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        java.time.LocalDateTime localDateTime2 = parkingSensor1.getLastDetectionTime();
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor1.isBookingOwnerCar(booking3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        boolean boolean11 = parkingSensor2.isCarPresent();
        models.booking.Booking booking12 = null;
        boolean boolean13 = parkingSensor2.isBookingOwnerCar(booking12);
        java.time.LocalDateTime localDateTime14 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime14);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        boolean boolean2 = parkingSensor1.isCarPresent();
        java.time.LocalDateTime localDateTime3 = parkingSensor1.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace4 = parkingSensor1.getParkingSpace();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = parkingSpace4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        java.time.LocalDateTime localDateTime2 = parkingSensor1.getLastDetectionTime();
        parkingSensor1.detectCar("hi!");
        parkingSensor1.removeCar();
        parkingSensor1.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime2);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        java.util.UUID uUID8 = parkingSensor2.getId();
        parkingSensor2.detectCar("");
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        java.time.LocalDateTime localDateTime12 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.booking.Booking booking2 = null;
        boolean boolean3 = parkingSensor1.isBookingOwnerCar(booking2);
        parkingSensor1.initializeWithCar("hi!");
        models.parkingSpace.ParkingSpace parkingSpace6 = parkingSensor1.getParkingSpace();
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor1.removeListener(parkingSensorListener7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("");
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.util.UUID uUID9 = parkingSensor2.getId();
        java.util.UUID uUID10 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("");
        parkingSensor2.removeCar();
        boolean boolean6 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        models.booking.Booking booking13 = null;
        boolean boolean14 = parkingSensor2.isBookingOwnerCar(booking13);
        boolean boolean15 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener16 = null;
        parkingSensor2.removeListener(parkingSensorListener16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        boolean boolean9 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.booking.Booking booking2 = null;
        boolean boolean3 = parkingSensor1.isBookingOwnerCar(booking2);
        models.parkingSensor.ParkingSensorListener parkingSensorListener4 = null;
        parkingSensor1.addListener(parkingSensorListener4);
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor1.isBookingOwnerCar(booking6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        boolean boolean9 = parkingSensor2.isCarPresent();
        java.util.UUID uUID10 = parkingSensor2.getId();
        boolean boolean11 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        java.time.LocalDateTime localDateTime3 = parkingSensor2.getLastDetectionTime();
        java.lang.String str4 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.util.UUID uUID9 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener10 = null;
        parkingSensor2.addListener(parkingSensorListener10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.addListener(parkingSensorListener6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.addListener(parkingSensorListener11);
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        models.parkingSensor.ParkingSensorListener parkingSensorListener15 = null;
        parkingSensor2.removeListener(parkingSensorListener15);
        models.parkingSensor.ParkingSensorListener parkingSensorListener17 = null;
        parkingSensor2.addListener(parkingSensorListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        java.time.LocalDateTime localDateTime3 = parkingSensor2.getLastDetectionTime();
        java.time.LocalDateTime localDateTime4 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.addListener(parkingSensorListener5);
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.parkingSensor.ParkingSensorListener parkingSensorListener2 = null;
        parkingSensor1.addListener(parkingSensorListener2);
        java.util.UUID uUID4 = parkingSensor1.getId();
        parkingSensor1.initializeWithCar("hi!");
        java.lang.Class<?> wildcardClass7 = parkingSensor1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID4.toString(), "76caf253-3ae5-4b7b-92f9-c255d5f28595");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace12 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace12);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.util.UUID uUID6 = parkingSensor2.getId();
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        parkingSensor2.initializeWithCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        parkingSensor2.removeCar();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSensor.ParkingSensorListener parkingSensorListener10 = null;
        parkingSensor2.removeListener(parkingSensorListener10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.initializeWithCar("hi!");
        java.time.LocalDateTime localDateTime13 = parkingSensor2.getLastDetectionTime();
        java.time.LocalDateTime localDateTime14 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        parkingSensor2.initializeWithCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.initializeWithCar("");
        java.util.UUID uUID10 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.time.LocalDateTime localDateTime8 = parkingSensor2.getLastDetectionTime();
        java.lang.Class<?> wildcardClass9 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSensor2.getParkingSpace();
        java.time.LocalDateTime localDateTime10 = parkingSensor2.getLastDetectionTime();
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        java.lang.Class<?> wildcardClass12 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        java.util.UUID uUID5 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener6 = null;
        parkingSensor2.addListener(parkingSensorListener6);
        models.booking.Booking booking8 = null;
        boolean boolean9 = parkingSensor2.isBookingOwnerCar(booking8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        java.time.LocalDateTime localDateTime3 = parkingSensor2.getLastDetectionTime();
        java.time.LocalDateTime localDateTime4 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        parkingSensor2.initializeWithCar("hi!");
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.addListener(parkingSensorListener11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.addListener(parkingSensorListener11);
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        java.lang.String str15 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("");
        parkingSensor2.detectCar("");
        models.parkingSpace.ParkingSpace parkingSpace15 = parkingSensor2.getParkingSpace();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        parkingSensor2.removeCar();
        models.booking.Booking booking9 = null;
        boolean boolean10 = parkingSensor2.isBookingOwnerCar(booking9);
        parkingSensor2.removeCar();
        parkingSensor2.initializeWithCar("");
        models.parkingSensor.ParkingSensorListener parkingSensorListener14 = null;
        parkingSensor2.removeListener(parkingSensorListener14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.removeCar();
        boolean boolean12 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        models.parkingSensor.ParkingSensorListener parkingSensorListener14 = null;
        parkingSensor2.addListener(parkingSensorListener14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.util.UUID uUID6 = parkingSensor2.getId();
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        boolean boolean8 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.addListener(parkingSensorListener9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        models.booking.Booking booking13 = null;
        boolean boolean14 = parkingSensor2.isBookingOwnerCar(booking13);
        models.booking.Booking booking15 = null;
        boolean boolean16 = parkingSensor2.isBookingOwnerCar(booking15);
        java.time.LocalDateTime localDateTime17 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener18 = null;
        parkingSensor2.addListener(parkingSensorListener18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("");
        java.util.UUID uUID15 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener16 = null;
        parkingSensor2.addListener(parkingSensorListener16);
        java.util.UUID uUID18 = parkingSensor2.getId();
        models.parkingSpace.ParkingSpace parkingSpace19 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        boolean boolean11 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime12 = parkingSensor2.getLastDetectionTime();
        java.time.LocalDateTime localDateTime13 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        models.booking.Booking booking2 = null;
        boolean boolean3 = parkingSensor1.isBookingOwnerCar(booking2);
        parkingSensor1.initializeWithCar("hi!");
        parkingSensor1.removeCar();
        parkingSensor1.initializeWithCar("");
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor1.addListener(parkingSensorListener9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.util.UUID uUID6 = parkingSensor2.getId();
        models.parkingSpace.ParkingSpace parkingSpace7 = parkingSensor2.getParkingSpace();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("");
        boolean boolean15 = parkingSensor2.isCarPresent();
        java.lang.Class<?> wildcardClass16 = parkingSensor2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.time.LocalDateTime localDateTime8 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSensor2.getParkingSpace();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = new models.parkingSensor.ParkingSensor(parkingSpace3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor4.addListener(parkingSensorListener5);
        java.util.UUID uUID7 = parkingSensor4.getId();
        models.parkingSensor.ParkingSensor parkingSensor8 = new models.parkingSensor.ParkingSensor(parkingSpace2, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor9 = new models.parkingSensor.ParkingSensor(parkingSpace1, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor10 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID7);
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSensor10.getParkingSpace();
        models.parkingSensor.ParkingSensorListener parkingSensorListener12 = null;
        parkingSensor10.addListener(parkingSensorListener12);
        models.parkingSensor.ParkingSensorListener parkingSensorListener14 = null;
        parkingSensor10.addListener(parkingSensorListener14);
        java.lang.Class<?> wildcardClass16 = parkingSensor10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "7e767bbb-8e6f-46ce-94af-db90612afec7");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        java.util.UUID uUID4 = parkingSensor2.getId();
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        java.lang.String str6 = parkingSensor2.getDetectedLicencePlate();
        boolean boolean7 = parkingSensor2.isCarPresent();
        parkingSensor2.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        boolean boolean10 = parkingSensor2.isCarPresent();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        parkingSensor2.initializeWithCar("hi!");
        models.parkingSpace.ParkingSpace parkingSpace15 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        boolean boolean8 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime9 = parkingSensor2.getLastDetectionTime();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        boolean boolean2 = parkingSensor1.isCarPresent();
        java.time.LocalDateTime localDateTime3 = parkingSensor1.getLastDetectionTime();
        java.lang.String str4 = parkingSensor1.getDetectedLicencePlate();
        parkingSensor1.detectCar("hi!");
        java.time.LocalDateTime localDateTime7 = parkingSensor1.getLastDetectionTime();
        java.time.LocalDateTime localDateTime8 = parkingSensor1.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("");
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        java.lang.Class<?> wildcardClass7 = localDateTime6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.time.LocalDateTime localDateTime8 = parkingSensor2.getLastDetectionTime();
        boolean boolean9 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        parkingSensor2.initializeWithCar("");
        models.booking.Booking booking12 = null;
        boolean boolean13 = parkingSensor2.isBookingOwnerCar(booking12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.time.LocalDateTime localDateTime8 = parkingSensor2.getLastDetectionTime();
        boolean boolean9 = parkingSensor2.isCarPresent();
        java.lang.String str10 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSensor.ParkingSensorListener parkingSensorListener11 = null;
        parkingSensor2.removeListener(parkingSensorListener11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        parkingSensor2.detectCar("hi!");
        java.util.UUID uUID12 = parkingSensor2.getId();
        java.util.UUID uUID13 = parkingSensor2.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSensor.ParkingSensor parkingSensor1 = new models.parkingSensor.ParkingSensor(parkingSpace0);
        boolean boolean2 = parkingSensor1.isCarPresent();
        java.time.LocalDateTime localDateTime3 = parkingSensor1.getLastDetectionTime();
        java.time.LocalDateTime localDateTime4 = parkingSensor1.getLastDetectionTime();
        parkingSensor1.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime4);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        parkingSensor2.initializeWithCar("");
        parkingSensor2.removeCar();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        parkingSensor2.detectCar("");
        java.util.UUID uUID15 = parkingSensor2.getId();
        boolean boolean16 = parkingSensor2.isCarPresent();
        boolean boolean17 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime18 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean5 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime6 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.addListener(parkingSensorListener7);
        java.util.UUID uUID9 = parkingSensor2.getId();
        java.lang.String str10 = parkingSensor2.getDetectedLicencePlate();
        java.time.LocalDateTime localDateTime11 = parkingSensor2.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.parkingSpace.ParkingSpace parkingSpace5 = null;
        models.parkingSpace.ParkingSpace parkingSpace6 = null;
        models.parkingSensor.ParkingSensor parkingSensor7 = new models.parkingSensor.ParkingSensor(parkingSpace6);
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor7.addListener(parkingSensorListener8);
        java.util.UUID uUID10 = parkingSensor7.getId();
        models.parkingSensor.ParkingSensor parkingSensor11 = new models.parkingSensor.ParkingSensor(parkingSpace5, uUID10);
        models.parkingSensor.ParkingSensor parkingSensor12 = new models.parkingSensor.ParkingSensor(parkingSpace4, uUID10);
        models.parkingSensor.ParkingSensor parkingSensor13 = new models.parkingSensor.ParkingSensor(parkingSpace3, uUID10);
        models.parkingSensor.ParkingSensor parkingSensor14 = new models.parkingSensor.ParkingSensor(parkingSpace2, uUID10);
        models.parkingSensor.ParkingSensor parkingSensor15 = new models.parkingSensor.ParkingSensor(parkingSpace1, uUID10);
        models.parkingSensor.ParkingSensor parkingSensor16 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID10);
        java.util.UUID uUID17 = parkingSensor16.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID10.toString(), "7140645e-75de-4534-9177-4eda591ae192");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID17);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID17.toString(), "7140645e-75de-4534-9177-4eda591ae192");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSpace.ParkingSpace parkingSpace9 = parkingSensor2.getParkingSpace();
        models.parkingSpace.ParkingSpace parkingSpace10 = parkingSensor2.getParkingSpace();
        parkingSensor2.initializeWithCar("");
        java.lang.String str13 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        parkingSensor2.removeCar();
        java.util.UUID uUID4 = parkingSensor2.getId();
        java.lang.String str5 = parkingSensor2.getDetectedLicencePlate();
        boolean boolean6 = parkingSensor2.isCarPresent();
        java.lang.String str7 = parkingSensor2.getDetectedLicencePlate();
        models.parkingSensor.ParkingSensorListener parkingSensorListener8 = null;
        parkingSensor2.removeListener(parkingSensorListener8);
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.util.UUID uUID7 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("");
        java.time.LocalDateTime localDateTime10 = parkingSensor2.getLastDetectionTime();
        java.lang.String str11 = parkingSensor2.getDetectedLicencePlate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        models.booking.Booking booking9 = null;
        boolean boolean10 = parkingSensor2.isBookingOwnerCar(booking9);
        models.booking.Booking booking11 = null;
        boolean boolean12 = parkingSensor2.isBookingOwnerCar(booking11);
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.booking.Booking booking7 = null;
        boolean boolean8 = parkingSensor2.isBookingOwnerCar(booking7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        parkingSensor2.detectCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        java.time.LocalDateTime localDateTime14 = parkingSensor2.getLastDetectionTime();
        models.parkingSensor.ParkingSensorListener parkingSensorListener15 = null;
        parkingSensor2.addListener(parkingSensorListener15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("hi!");
        boolean boolean13 = parkingSensor2.isCarPresent();
        parkingSensor2.removeCar();
        parkingSensor2.removeCar();
        parkingSensor2.detectCar("");
        parkingSensor2.initializeWithCar("hi!");
        parkingSensor2.initializeWithCar("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace1);
        models.parkingSensor.ParkingSensorListener parkingSensorListener3 = null;
        parkingSensor2.addListener(parkingSensorListener3);
        java.util.UUID uUID5 = parkingSensor2.getId();
        models.parkingSensor.ParkingSensor parkingSensor6 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID5);
        java.lang.String str7 = parkingSensor6.getDetectedLicencePlate();
        java.time.LocalDateTime localDateTime8 = parkingSensor6.getLastDetectionTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID5.toString(), "cd40d659-34e3-43e3-a3a2-435bc2f0659e");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        models.parkingSensor.ParkingSensorListener parkingSensorListener9 = null;
        parkingSensor2.removeListener(parkingSensorListener9);
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSensor2.getParkingSpace();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        models.parkingSpace.ParkingSpace parkingSpace1 = null;
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        models.parkingSensor.ParkingSensor parkingSensor4 = new models.parkingSensor.ParkingSensor(parkingSpace3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor4.addListener(parkingSensorListener5);
        java.util.UUID uUID7 = parkingSensor4.getId();
        models.parkingSensor.ParkingSensor parkingSensor8 = new models.parkingSensor.ParkingSensor(parkingSpace2, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor9 = new models.parkingSensor.ParkingSensor(parkingSpace1, uUID7);
        models.parkingSensor.ParkingSensor parkingSensor10 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID7);
        models.parkingSpace.ParkingSpace parkingSpace11 = parkingSensor10.getParkingSpace();
        java.util.UUID uUID12 = parkingSensor10.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID7);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID7.toString(), "e3e7bbbc-3eda-4e5c-8061-752c29302dc8");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(parkingSpace11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(uUID12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertEquals(uUID12.toString(), "e3e7bbbc-3eda-4e5c-8061-752c29302dc8");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        models.booking.Booking booking6 = null;
        boolean boolean7 = parkingSensor2.isBookingOwnerCar(booking6);
        java.util.UUID uUID8 = parkingSensor2.getId();
        parkingSensor2.initializeWithCar("");
        parkingSensor2.detectCar("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        java.time.LocalDateTime localDateTime5 = parkingSensor2.getLastDetectionTime();
        parkingSensor2.removeCar();
        java.time.LocalDateTime localDateTime7 = parkingSensor2.getLastDetectionTime();
        java.util.UUID uUID8 = parkingSensor2.getId();
        java.util.UUID uUID9 = parkingSensor2.getId();
        parkingSensor2.removeCar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(localDateTime7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        models.parkingSpace.ParkingSpace parkingSpace0 = null;
        java.util.UUID uUID1 = null;
        models.parkingSensor.ParkingSensor parkingSensor2 = new models.parkingSensor.ParkingSensor(parkingSpace0, uUID1);
        models.booking.Booking booking3 = null;
        boolean boolean4 = parkingSensor2.isBookingOwnerCar(booking3);
        models.parkingSensor.ParkingSensorListener parkingSensorListener5 = null;
        parkingSensor2.removeListener(parkingSensorListener5);
        models.parkingSensor.ParkingSensorListener parkingSensorListener7 = null;
        parkingSensor2.removeListener(parkingSensorListener7);
        java.lang.String str9 = parkingSensor2.getDetectedLicencePlate();
        java.util.UUID uUID10 = parkingSensor2.getId();
        models.booking.Booking booking11 = null;
        boolean boolean12 = parkingSensor2.isBookingOwnerCar(booking11);
        models.parkingSensor.ParkingSensorListener parkingSensorListener13 = null;
        parkingSensor2.removeListener(parkingSensorListener13);
        models.booking.Booking booking15 = null;
        boolean boolean16 = parkingSensor2.isBookingOwnerCar(booking15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(uUID10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}
