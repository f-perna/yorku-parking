package randoop.controllers.factory;

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
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        java.lang.Class<?> wildcardClass4 = bookingController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        java.lang.Class<?> wildcardClass4 = paymentController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        java.lang.Class<?> wildcardClass3 = parkingSensorController2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        java.lang.Class<?> wildcardClass5 = paymentController4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.BookingController bookingController1 = controllerFactory0.getBookingController();
        java.lang.Class<?> wildcardClass2 = bookingController1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController4 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController7 = controllerFactory0.getManagerController();
        java.lang.Class<?> wildcardClass8 = managerController7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController4 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController4 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController6 = controllerFactory0.getParkingSensorController();
        java.lang.Class<?> wildcardClass7 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController7 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.PaymentController paymentController9 = controllerFactory0.getPaymentController();
        controllers.SuperManagerController superManagerController10 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        java.lang.Class<?> wildcardClass9 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.BookingController bookingController1 = controllerFactory0.getBookingController();
        controllers.ClientController clientController2 = controllerFactory0.getClientController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass7 = authController6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ClientController clientController4 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        controllers.ClientController clientController8 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController9 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController10 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        controllers.SuperManagerController superManagerController9 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController5 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        java.lang.Class<?> wildcardClass9 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        java.lang.Class<?> wildcardClass7 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        java.lang.Class<?> wildcardClass5 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController4 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController5 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController9 = controllerFactory0.getBookingController();
        java.lang.Class<?> wildcardClass10 = bookingController9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        java.lang.Class<?> wildcardClass6 = superManagerController5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass5 = authController4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        java.lang.Class<?> wildcardClass6 = parkingSensorController5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController4 = controllerFactory0.getSuperManagerController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        java.lang.Class<?> wildcardClass10 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        java.lang.Class<?> wildcardClass9 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController3 = controllerFactory0.getManagerController();
        controllers.SuperManagerController superManagerController4 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.PaymentController paymentController8 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.SuperManagerController superManagerController1 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController2 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController5 = controllerFactory0.getParkingLotController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController6 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        java.lang.Class<?> wildcardClass9 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController8 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController8 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSpaceController parkingSpaceController9 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController8 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        java.lang.Class<?> wildcardClass7 = superManagerController6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.SuperManagerController superManagerController8 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController9 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController10 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController8 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController8);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        java.lang.Class<?> wildcardClass5 = bookingController4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.BookingController bookingController1 = controllerFactory0.getBookingController();
        controllers.ClientController clientController2 = controllerFactory0.getClientController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController9 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass4 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController9 = controllerFactory0.getManagerController();
        controllers.ManagerController managerController10 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController2 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        java.lang.Class<?> wildcardClass8 = parkingLotController7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        java.lang.Class<?> wildcardClass8 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController6 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController4 = controllerFactory0.getParkingSensorController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController7 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.ClientController clientController8 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass5 = authController4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController2 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass5 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController4 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        java.lang.Class<?> wildcardClass2 = clientController1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.ClientController clientController9 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.ClientController clientController6 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController10 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        java.lang.Class<?> wildcardClass10 = parkingLotController9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ParkingSpaceController parkingSpaceController9 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController10 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController11 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ParkingSpaceController parkingSpaceController9 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController10 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController4 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController9 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ClientController clientController9 = controllerFactory0.getClientController();
        java.lang.Class<?> wildcardClass10 = clientController9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController10 = controllerFactory0.getPaymentController();
        controllers.SuperManagerController superManagerController11 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController12 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController12);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController4 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController7 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        java.lang.Class<?> wildcardClass5 = parkingSpaceController4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.ClientController clientController8 = controllerFactory0.getClientController();
        java.lang.Class<?> wildcardClass9 = clientController8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        java.lang.Class<?> wildcardClass6 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController9 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController4 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController10 = controllerFactory0.getParkingLotController();
        controllers.ManagerController managerController11 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController11);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        controllers.ClientController clientController9 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController9 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ClientController clientController9 = controllerFactory0.getClientController();
        java.lang.Class<?> wildcardClass10 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController2 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.ManagerController managerController2 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController10 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController8 = controllerFactory0.getPaymentController();
        java.lang.Class<?> wildcardClass9 = paymentController8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController9 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController10 = controllerFactory0.getClientController();
        controllers.BookingController bookingController11 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController10 = controllerFactory0.getPaymentController();
        controllers.SuperManagerController superManagerController11 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController12 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController6 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        java.lang.Class<?> wildcardClass6 = parkingSensorController5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ClientController clientController2 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController6 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.ManagerController managerController7 = controllerFactory0.getManagerController();
        controllers.ClientController clientController8 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ClientController clientController9 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController10 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ClientController clientController4 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        java.lang.Class<?> wildcardClass6 = bookingController5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.ClientController clientController10 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController10 = controllerFactory0.getPaymentController();
        controllers.ParkingLotController parkingLotController11 = controllerFactory0.getParkingLotController();
        controllers.ManagerController managerController12 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        java.lang.Class<?> wildcardClass6 = managerController5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ClientController clientController2 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        java.lang.Class<?> wildcardClass6 = clientController5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass6 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        java.lang.Class<?> wildcardClass7 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        java.lang.Class<?> wildcardClass6 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController2 = controllerFactory0.getClientController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ClientController clientController9 = controllerFactory0.getClientController();
        controllers.ManagerController managerController10 = controllerFactory0.getManagerController();
        controllers.ParkingSensorController parkingSensorController11 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController12 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass5 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.ClientController clientController8 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController9 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.SuperManagerController superManagerController8 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController9 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ClientController clientController6 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        java.lang.Class<?> wildcardClass2 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController4 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController9 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController9);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.ParkingLotController parkingLotController5 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController4 = controllerFactory0.getClientController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController8 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController8);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController3 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ClientController clientController9 = controllerFactory0.getClientController();
        controllers.ClientController clientController10 = controllerFactory0.getClientController();
        controllers.ParkingLotController parkingLotController11 = controllerFactory0.getParkingLotController();
        controllers.SuperManagerController superManagerController12 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSpaceController parkingSpaceController13 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.SuperManagerController superManagerController8 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController9 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController10 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass11 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.BookingController bookingController1 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController2 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController10 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController11 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        java.lang.Class<?> wildcardClass6 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ClientController clientController2 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController9 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        controllers.ParkingLotController parkingLotController10 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController3 = controllerFactory0.getManagerController();
        controllers.ParkingSensorController parkingSensorController4 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController4 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController4 = controllerFactory0.getParkingLotController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        controllers.ManagerController managerController9 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController10 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController8 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController9 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController9);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        java.lang.Class<?> wildcardClass5 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController2 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        java.lang.Class<?> wildcardClass5 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController2 = controllerFactory0.getClientController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        java.lang.Class<?> wildcardClass4 = controllerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ManagerController managerController9 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        controllers.ManagerController managerController9 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController9 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController4 = controllerFactory0.getParkingLotController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.ParkingLotController parkingLotController4 = controllerFactory0.getParkingLotController();
        java.lang.Class<?> wildcardClass5 = parkingLotController4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        controllers.SuperManagerController superManagerController10 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController11 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController12 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController8 = controllerFactory0.getParkingLotController();
        controllers.ManagerController managerController9 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController10 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.BookingController bookingController1 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController2 = controllerFactory0.getPaymentController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ParkingSpaceController parkingSpaceController9 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController10 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        java.lang.Class<?> wildcardClass9 = parkingSpaceController8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController5 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSensorController parkingSensorController6 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ClientController clientController6 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController8 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController9 = controllerFactory0.getManagerController();
        controllers.SuperManagerController superManagerController10 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController8 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController2 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ClientController clientController2 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController5 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController3 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.ParkingLotController parkingLotController8 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController10 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController2 = controllerFactory0.getParkingLotController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController7 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController10 = controllerFactory0.getPaymentController();
        controllers.SuperManagerController superManagerController11 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController12 = controllerFactory0.getParkingLotController();
        controllers.ClientController clientController13 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        controllers.PaymentController paymentController8 = controllerFactory0.getPaymentController();
        controllers.ParkingSensorController parkingSensorController9 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController10 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController10);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController3 = controllerFactory0.getAuthController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.ManagerController managerController7 = controllerFactory0.getManagerController();
        controllers.AuthController authController8 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController8 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        controllers.SuperManagerController superManagerController10 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController11 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController12 = controllerFactory0.getParkingSensorController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController12);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ClientController clientController9 = controllerFactory0.getClientController();
        controllers.ClientController clientController10 = controllerFactory0.getClientController();
        controllers.PaymentController paymentController11 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController12 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController6 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController9 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.AuthController authController5 = controllerFactory0.getAuthController();
        controllers.ParkingSpaceController parkingSpaceController6 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController3 = controllerFactory0.getParkingSpaceController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        controllers.SuperManagerController superManagerController9 = controllerFactory0.getSuperManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.ClientController clientController8 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController8);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController5 = controllerFactory0.getBookingController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        controllers.ManagerController managerController10 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        controllers.SuperManagerController superManagerController8 = controllerFactory0.getSuperManagerController();
        java.lang.Class<?> wildcardClass9 = superManagerController8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController4 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController5 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController6 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController6);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController4 = controllerFactory0.getManagerController();
        controllers.ParkingLotController parkingLotController5 = controllerFactory0.getParkingLotController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        controllers.AuthController authController7 = controllerFactory0.getAuthController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.BookingController bookingController1 = controllerFactory0.getBookingController();
        controllers.SuperManagerController superManagerController2 = controllerFactory0.getSuperManagerController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.ClientController clientController3 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingLotController parkingLotController9 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.AuthController authController6 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController7 = controllerFactory0.getParkingSensorController();
        controllers.ParkingSensorController parkingSensorController8 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController9 = controllerFactory0.getManagerController();
        controllers.ParkingSpaceController parkingSpaceController10 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSpaceController parkingSpaceController2 = controllerFactory0.getParkingSpaceController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.ParkingSpaceController parkingSpaceController4 = controllerFactory0.getParkingSpaceController();
        controllers.ManagerController managerController5 = controllerFactory0.getManagerController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController5);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ParkingSpaceController parkingSpaceController1 = controllerFactory0.getParkingSpaceController();
        controllers.AuthController authController2 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController3 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController4 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.ManagerController managerController6 = controllerFactory0.getManagerController();
        controllers.BookingController bookingController7 = controllerFactory0.getBookingController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController7);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController4 = controllerFactory0.getPaymentController();
        controllers.ClientController clientController5 = controllerFactory0.getClientController();
        controllers.BookingController bookingController6 = controllerFactory0.getBookingController();
        controllers.ClientController clientController7 = controllerFactory0.getClientController();
        controllers.PaymentController paymentController8 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.SuperManagerController superManagerController8 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController9 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController10 = controllerFactory0.getPaymentController();
        controllers.PaymentController paymentController11 = controllerFactory0.getPaymentController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController11);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.PaymentController paymentController7 = controllerFactory0.getPaymentController();
        controllers.ParkingLotController parkingLotController8 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController8);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.ClientController clientController1 = controllerFactory0.getClientController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.BookingController bookingController3 = controllerFactory0.getBookingController();
        controllers.ParkingSensorController parkingSensorController4 = controllerFactory0.getParkingSensorController();
        java.lang.Class<?> wildcardClass5 = parkingSensorController4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.ParkingLotController parkingLotController7 = controllerFactory0.getParkingLotController();
        controllers.ParkingSpaceController parkingSpaceController8 = controllerFactory0.getParkingSpaceController();
        controllers.ParkingSpaceController parkingSpaceController9 = controllerFactory0.getParkingSpaceController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceController9);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        controllers.factory.ControllerFactory controllerFactory0 = controllers.factory.ControllerFactory.getInstance();
        controllers.AuthController authController1 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController2 = controllerFactory0.getParkingSensorController();
        controllers.PaymentController paymentController3 = controllerFactory0.getPaymentController();
        controllers.AuthController authController4 = controllerFactory0.getAuthController();
        controllers.ParkingSensorController parkingSensorController5 = controllerFactory0.getParkingSensorController();
        controllers.SuperManagerController superManagerController6 = controllerFactory0.getSuperManagerController();
        controllers.SuperManagerController superManagerController7 = controllerFactory0.getSuperManagerController();
        controllers.ManagerController managerController8 = controllerFactory0.getManagerController();
        controllers.AuthController authController9 = controllerFactory0.getAuthController();
        controllers.ClientController clientController10 = controllerFactory0.getClientController();
        controllers.ParkingLotController parkingLotController11 = controllerFactory0.getParkingLotController();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(controllerFactory0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentController3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSensorController5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(superManagerController7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerController8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(authController9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientController10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotController11);
    }
}

