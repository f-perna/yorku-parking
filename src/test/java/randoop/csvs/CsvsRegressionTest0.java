package randoop.csvs;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CsvsRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass4 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        csvs.ManagerCSVProcessor.cleanupAndReset("");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        csvs.ClientCSVProcessor.initializeTestFile("hi!");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        csvs.ManagerCSVProcessor.cleanupAndReset("hi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            csvs.PaymentCSVProcessor.initializeTestFile("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            csvs.ClientCSVProcessor.initializeTestFile("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"parkingLots\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        csvs.PaymentCSVProcessor.cleanupAndReset("");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        csvs.ClientCSVProcessor clientCSVProcessor0 = new csvs.ClientCSVProcessor();
        java.lang.Class<?> wildcardClass1 = clientCSVProcessor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.List<models.payment.Payment> paymentList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"payments\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        csvs.ParkingSpaceCSVProcessor.cleanupAndReset("hi!");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        csvs.ParkingSpaceCSVProcessor.cleanupAndReset("");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        csvs.PaymentCSVProcessor.cleanupAndReset("hi!");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            csvs.ParkingLotCSVProcessor.initializeTestFile("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        java.lang.Class<?> wildcardClass1 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        java.lang.Class<?> wildcardClass1 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        csvs.ParkingLotCSVProcessor.cleanupAndReset("");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        csvs.ManagerCSVProcessor.initializeTestFile("hi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        // The following exception was thrown during execution in test generation
        try {
            csvs.ManagerCSVProcessor.initializeTestFile("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        csvs.ClientCSVProcessor.cleanupAndReset("");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        csvs.PaymentCSVProcessor.initializeTestFile("hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        csvs.ParkingSpaceCSVProcessor.initializeTestFile("hi!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        csvs.ParkingLotCSVProcessor.initializeTestFile("hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        csvs.ClientCSVProcessor.cleanupAndReset("hi!");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        csvs.ParkingLotCSVProcessor.cleanupAndReset("hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass2 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        java.lang.Class<?> wildcardClass1 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        // The following exception was thrown during execution in test generation
        try {
            csvs.ParkingSpaceCSVProcessor.initializeTestFile("");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: ");
        } catch (java.io.FileNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass5 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass5 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass4 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass4 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass4 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass4 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass6 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass8 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.List<models.manager.Manager> managerList0 = null;
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass6 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass5 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass6 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass4 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        csvs.PaymentCSVProcessor paymentCSVProcessor0 = new csvs.PaymentCSVProcessor();
        java.lang.Class<?> wildcardClass1 = paymentCSVProcessor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        java.lang.Class<?> wildcardClass1 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = null;
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass7 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass7 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        csvs.ParkingSpaceCSVProcessor parkingSpaceCSVProcessor0 = new csvs.ParkingSpaceCSVProcessor();
        java.lang.Class<?> wildcardClass1 = parkingSpaceCSVProcessor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        csvs.ParkingLotCSVProcessor parkingLotCSVProcessor0 = new csvs.ParkingLotCSVProcessor();
        java.lang.Class<?> wildcardClass1 = parkingLotCSVProcessor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass5 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass7 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass9 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass10 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass8 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.List<models.client.Client> clientList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            csvs.ClientCSVProcessor.setClientData(clientList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.iterator()\" because \"clients\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass7 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        java.lang.Class<?> wildcardClass1 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass6 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass6 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass11 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass5 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass2 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass3 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass3 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass2 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass6 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass5 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass6 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass8 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass4 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass8 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass11 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass7 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass11 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass9 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass7 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass13 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass10 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        csvs.ManagerCSVProcessor managerCSVProcessor0 = new csvs.ManagerCSVProcessor();
        java.lang.Class<?> wildcardClass1 = managerCSVProcessor0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass9 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass7 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass10 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass13 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass3 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass8 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass12 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass3 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass5 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass5 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass14 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass15 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass11 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass8 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass11 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass9 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass12 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass7 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass8 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass6 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass10 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass9 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass11 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass10 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass6 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass4 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass17 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass13 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass15 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass7 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass5 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass12 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass9 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass8 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass13 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass11 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass12 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass2 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass12 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass7 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass18 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass15 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass12 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass14 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass17 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass13 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass13 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass18 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass10 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass14 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass10 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass11 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass14 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass10 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass8 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass12 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass6 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass8 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass13 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass4 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass14 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass20 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass11 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass9 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass17 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass15 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass25 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass2 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass9 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass12 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass16 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass15 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass19 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass20 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass19 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass16 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass21 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass10 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass15 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass22 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass9 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass14 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass16 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass14 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass19 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass3 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass11 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass18 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass14 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass13 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass24 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass15 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass22 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass19 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass21 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass12 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass13 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass20 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass14 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass16 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass19 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass5 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass16 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass4 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass17 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass17 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass17 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass22 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass20 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass15 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass18 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass21 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass13 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass23 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass25 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass19 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass16 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass18 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass21 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass19 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass22 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass18 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass17 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass20 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass20 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass10 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass17 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass15 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass24 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass9 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass16 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass27 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass27 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass30 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass23 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass17 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass18 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass27 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass24 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass23 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass20 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass15 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass16 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass28 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass18 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass12 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass23 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        java.lang.Class<?> wildcardClass26 = parkingSpaceList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass20 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass24 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass18 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass28 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass23 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        models.manager.Manager[] managerArray0 = new models.manager.Manager[] {};
        java.util.ArrayList<models.manager.Manager> managerList1 = new java.util.ArrayList<models.manager.Manager>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.manager.Manager>) managerList1, managerArray0);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        csvs.ManagerCSVProcessor.setManagerData((java.util.List<models.manager.Manager>) managerList1);
        java.lang.Class<?> wildcardClass21 = managerList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass21 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass20 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        java.lang.Class<?> wildcardClass14 = parkingSpaceList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.List<models.manager.Manager> managerList0 = csvs.ManagerCSVProcessor.readManagerData();
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        csvs.ManagerCSVProcessor.setManagerData(managerList0);
        java.lang.Class<?> wildcardClass21 = managerList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(managerList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        java.lang.Class<?> wildcardClass22 = paymentList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.List<models.client.Client> clientList0 = csvs.ClientCSVProcessor.readClientData();
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        csvs.ClientCSVProcessor.setClientData(clientList0);
        java.lang.Class<?> wildcardClass21 = clientList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        java.lang.Class<?> wildcardClass22 = clientList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        java.lang.Class<?> wildcardClass26 = parkingLotList0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList0 = csvs.ParkingSpaceCSVProcessor.readSpaceData();
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData(parkingSpaceList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceList0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        java.lang.Class<?> wildcardClass23 = parkingLotList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        models.client.Client[] clientArray0 = new models.client.Client[] {};
        java.util.ArrayList<models.client.Client> clientList1 = new java.util.ArrayList<models.client.Client>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.client.Client>) clientList1, clientArray0);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        csvs.ClientCSVProcessor.setClientData((java.util.List<models.client.Client>) clientList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(clientArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        models.payment.Payment[] paymentArray0 = new models.payment.Payment[] {};
        java.util.ArrayList<models.payment.Payment> paymentList1 = new java.util.ArrayList<models.payment.Payment>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.payment.Payment>) paymentList1, paymentArray0);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        csvs.PaymentCSVProcessor.setPaymentData((java.util.List<models.payment.Payment>) paymentList1);
        java.lang.Class<?> wildcardClass22 = paymentList1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.util.List<models.parkingLot.ParkingLot> parkingLotList0 = csvs.ParkingLotCSVProcessor.readLotData();
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        csvs.ParkingLotCSVProcessor.setLotData(parkingLotList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotList0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        models.parkingLot.ParkingLot[] parkingLotArray0 = new models.parkingLot.ParkingLot[] {};
        java.util.ArrayList<models.parkingLot.ParkingLot> parkingLotList1 = new java.util.ArrayList<models.parkingLot.ParkingLot>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingLot.ParkingLot>) parkingLotList1, parkingLotArray0);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        csvs.ParkingLotCSVProcessor.setLotData((java.util.List<models.parkingLot.ParkingLot>) parkingLotList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingLotArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        models.parkingSpace.ParkingSpace[] parkingSpaceArray0 = new models.parkingSpace.ParkingSpace[] {};
        java.util.ArrayList<models.parkingSpace.ParkingSpace> parkingSpaceList1 = new java.util.ArrayList<models.parkingSpace.ParkingSpace>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<models.parkingSpace.ParkingSpace>) parkingSpaceList1, parkingSpaceArray0);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        csvs.ParkingSpaceCSVProcessor.setSpaceData((java.util.List<models.parkingSpace.ParkingSpace>) parkingSpaceList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(parkingSpaceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.util.List<models.payment.Payment> paymentList0 = csvs.PaymentCSVProcessor.readPaymentData();
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        csvs.PaymentCSVProcessor.setPaymentData(paymentList0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList0);
    }
}

