package randoop.controllers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ControllerRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = managerController3.getAllParkingSpaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getAllSpaces()\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingLot.ParkingLot> parkingLotList4 = managerController3.getAllParkingLots();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getAllParkingLots()\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace5 = managerController3.enableParkingSpace(parkingSpace4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.enableParkingSpace(models.parkingSpace.ParkingSpace)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.awt.CardLayout cardLayout0 = null;
        javax.swing.JPanel jPanel1 = null;
        controllers.NavigationController.init(cardLayout0, jPanel1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        models.parkingLot.ParkingLot parkingLot4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = managerController3.disableParkingLot(parkingLot4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.disableParkingLot(models.parkingLot.ParkingLot)\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        javax.swing.JPanel jPanel1 = controllers.NavigationController.getPage("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPanel1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        java.util.UUID uUID4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList5 = managerController3.getParkingSpacesForLot(uUID4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getSpacesForLot(java.util.UUID)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        models.parkingLot.ParkingLot parkingLot4 = null;
        // The following exception was thrown during execution in test generation
        try {
            managerController3.addParkingSpace(parkingLot4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.addParkingSpace(models.parkingLot.ParkingLot, String)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.client.Client> clientList2 = clientController1.getAllClients();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ClientService.getAllClients()\" because \"this.clientService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            models.client.Client client5 = managerController3.getClientByEmail("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ClientService.getClientByEmail(String)\" because \"this.clientService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = managerController3.approveClient("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ClientService.approveClient(String, boolean)\" because \"this.clientService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        controllers.NavigationController.forwardPage();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.client.Client> clientList4 = managerController3.getAllClients();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ClientService.getAllClients()\" because \"this.clientService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        javax.swing.JPanel jPanel1 = controllers.NavigationController.getPage("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPanel1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace5 = managerController3.disableParkingSpace(parkingSpace4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.disableParkingSpace(models.parkingSpace.ParkingSpace)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            managerController3.addParkingLot("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.addParkingLot(String)\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        services.PaymentService paymentService0 = null;
        controllers.PaymentController paymentController1 = new controllers.PaymentController(paymentService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment4 = paymentController1.processDepositPayment(booking2, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to process payment");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        models.parkingLot.ParkingLot parkingLot4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = managerController3.enableParkingLot(parkingLot4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.enableParkingLot(models.parkingLot.ParkingLot)\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("hi!", "hi!", "", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email address must be in a valid format (e.g., user@domain.com)");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = managerController3.denyClient("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ClientService.approveClient(String, boolean)\" because \"this.clientService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        services.PaymentService paymentService0 = null;
        controllers.PaymentController paymentController1 = new controllers.PaymentController(paymentService0);
        java.util.UUID uUID2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment3 = paymentController1.getPaymentById(uUID2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.PaymentService.getPaymentById(java.util.UUID)\" because \"this.paymentService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            managerController3.addParkingLot("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.addParkingLot(String)\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        javax.swing.JPanel jPanel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllers.NavigationController.addPage("hi!", jPanel1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.swing.JPanel.add(java.awt.Component, Object)\" because \"controllers.NavigationController.cardPanel\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            models.client.Client client5 = managerController3.getClientByEmail("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ClientService.getClientByEmail(String)\" because \"this.clientService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        javax.swing.JPanel jPanel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            controllers.NavigationController.addPage("", jPanel1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.swing.JPanel.add(java.awt.Component, Object)\" because \"controllers.NavigationController.cardPanel\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        services.ManagerService managerService0 = null;
        controllers.SuperManagerController superManagerController1 = new controllers.SuperManagerController(managerService0);
        // The following exception was thrown during execution in test generation
        try {
            models.manager.Manager manager2 = superManagerController1.generateAndGetManagerAccount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ManagerService.generateAndGetManagerAccount()\" because \"this.managerService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        services.PaymentService paymentService0 = null;
        controllers.PaymentController paymentController1 = new controllers.PaymentController(paymentService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList3 = paymentController1.getPaymentsForBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to view payments");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = managerController3.denyClient("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ClientService.approveClient(String, boolean)\" because \"this.clientService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        services.ManagerService managerService0 = null;
        controllers.SuperManagerController superManagerController1 = new controllers.SuperManagerController(managerService0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.manager.Manager> managerList2 = superManagerController1.getAllManagers();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ManagerService.getAllManagers()\" because \"this.managerService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = managerController3.approveClient("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ClientService.approveClient(String, boolean)\" because \"this.clientService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        services.ManagerService managerService0 = null;
        controllers.SuperManagerController superManagerController1 = new controllers.SuperManagerController(managerService0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = superManagerController1.removeManager("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ManagerService.removeManager(String)\" because \"this.managerService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingLot.ParkingLot> parkingLotList2 = parkingLotController1.getAllDisabledParkingLots();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getAllDisabledParkingLots()\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingLot.ParkingLot> parkingLotList2 = parkingLotController1.getAllParkingLots();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getAllParkingLots()\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        // The following exception was thrown during execution in test generation
        try {
            models.parkingLot.ParkingLot parkingLot3 = parkingLotController1.getParkingLotByName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getParkingLotByName(String)\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = parkingLotController1.getEnabledParkingLotsCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getEnabledParkingLotsCount()\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        services.PaymentService paymentService0 = null;
        controllers.PaymentController paymentController1 = new controllers.PaymentController(paymentService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment4 = paymentController1.processFinalPayment(booking2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = parkingLotController1.getTotalParkingLotsCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getTotalParkingLotsCount()\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingLot.ParkingLot> parkingLotList2 = parkingLotController1.getAllEnabledParkingLots();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getAllEnabledParkingLots()\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingController1.cancelBooking(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = bookingController1.checkIn(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        models.parkingLot.ParkingLot parkingLot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceController1.getOccupiedSpaces(parkingLot2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getOccupiedSpaces(models.parkingLot.ParkingLot)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = parkingLotController1.getDisabledParkingLotsCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getDisabledParkingLotsCount()\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList2 = parkingSpaceController1.getAllSpaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getAllSpaces()\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList2 = bookingController1.getBookingsForClient();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = parkingSensorController1.isBookingOwnerCar(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        models.parkingLot.ParkingLot parkingLot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceController1.getBookedSpaces(parkingLot2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getBookedSpaces(models.parkingLot.ParkingLot)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        models.parkingLot.ParkingLot parkingLot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceController1.getEnabledSpaces(parkingLot2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getEnabledSpaces(models.parkingLot.ParkingLot)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        java.util.UUID uUID2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace3 = parkingSpaceController1.getParkingSpaceById(uUID2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getParkingSpaceById(java.util.UUID)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        java.util.UUID uUID2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceController1.getParkingSpacesForLot(uUID2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getSpacesForLot(java.util.UUID)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorController1.checkForEarlyArrivalsToCheckIn();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSensorService.checkForEarlyArrivalsToCheckIn()\" because \"this.parkingSensorService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = parkingSensorController1.getDetectedLicencePlate(parkingSpace2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        services.ManagerService managerService0 = null;
        controllers.SuperManagerController superManagerController1 = new controllers.SuperManagerController(managerService0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = superManagerController1.removeManager("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ManagerService.removeManager(String)\" because \"this.managerService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        models.parkingLot.ParkingLot parkingLot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceController1.getAvailableSpaces(parkingLot2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getAvailableSpaces(models.parkingLot.ParkingLot)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorController1.simulateCarArrival(parkingSpace2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSensorService.isCarPresentAtSpace(models.parkingSpace.ParkingSpace)\" because \"this.parkingSensorService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("hi!", "hi!", "", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email address must be in a valid format (e.g., user@domain.com)");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        // The following exception was thrown during execution in test generation
        try {
            models.parkingLot.ParkingLot parkingLot3 = parkingLotController1.getParkingLotByName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getParkingLotByName(String)\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        services.ParkingLotService parkingLotService0 = null;
        controllers.ParkingLotController parkingLotController1 = new controllers.ParkingLotController(parkingLotService0);
        java.util.UUID uUID2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingLot.ParkingLot parkingLot3 = parkingLotController1.getParkingLotById(uUID2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingLotService.getParkingLotById(java.util.UUID)\" because \"this.parkingLotService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        services.PaymentService paymentService0 = null;
        controllers.PaymentController paymentController1 = new controllers.PaymentController(paymentService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment4 = paymentController1.processDepositPayment(booking2, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to process payment");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = bookingController1.cancel(booking2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        services.PaymentService paymentService0 = null;
        controllers.PaymentController paymentController1 = new controllers.PaymentController(paymentService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment4 = paymentController1.processRefundPayment(booking2, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to process refund");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        models.parkingLot.ParkingLot parkingLot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceController1.getUnOccupiedSpaces(parkingLot2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getUnOccupiedSpaces(models.parkingLot.ParkingLot)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorController1.checkForNoShows();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSensorService.checkForNoShows()\" because \"this.parkingSensorService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        java.lang.Class<?> wildcardClass5 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        models.parkingLot.ParkingLot parkingLot2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceController1.getDisabledSpaces(parkingLot2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.getDisabledSpaces(models.parkingLot.ParkingLot)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        services.ParkingLotService parkingLotService0 = null;
        services.ParkingSpaceService parkingSpaceService1 = null;
        services.ClientService clientService2 = null;
        controllers.ManagerController managerController3 = new controllers.ManagerController(parkingLotService0, parkingSpaceService1, clientService2);
        models.parkingLot.ParkingLot parkingLot4 = null;
        // The following exception was thrown during execution in test generation
        try {
            managerController3.addParkingSpace(parkingLot4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSpaceService.addParkingSpace(models.parkingLot.ParkingLot, String)\" because \"this.parkingSpaceService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorController1.simulateCarDeparture(parkingSpace2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSensorService.simulateCarDeparture(models.parkingSpace.ParkingSpace, String)\" because \"this.parkingSensorService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorController1.simulateCarArrival(parkingSpace2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSensorService.isCarPresentAtSpace(models.parkingSpace.ParkingSpace)\" because \"this.parkingSensorService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        services.PaymentService paymentService0 = null;
        controllers.PaymentController paymentController1 = new controllers.PaymentController(paymentService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment4 = paymentController1.processFinalPayment(booking2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStatus()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("", "", "", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name must be provided");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        services.ParkingSpaceService parkingSpaceService0 = null;
        controllers.ParkingSpaceController parkingSpaceController1 = new controllers.ParkingSpaceController(parkingSpaceService0);
        java.lang.Class<?> wildcardClass2 = parkingSpaceController1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.user.UserType userType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authController3.login("hi!", "hi!", userType7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("hi!", "", "", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email address must be in a valid format (e.g., user@domain.com)");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        services.ManagerService managerService0 = null;
        controllers.SuperManagerController superManagerController1 = new controllers.SuperManagerController(managerService0);
        java.lang.Class<?> wildcardClass2 = superManagerController1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.user.UserType userType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authController3.login("hi!", "", userType7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSensorController1.simulateCarDeparture(parkingSpace2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.ParkingSensorService.simulateCarDeparture(models.parkingSpace.ParkingSpace, String)\" because \"this.parkingSensorService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        services.PaymentService paymentService0 = null;
        controllers.PaymentController paymentController1 = new controllers.PaymentController(paymentService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment4 = paymentController1.processRefundPayment(booking2, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to process refund");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = bookingController1.isLatestBookingForSpaceAndClient(booking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"services.BookingService.isLatestBookingForSpaceAndClient(models.booking.Booking)\" because \"this.bookingService\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass7 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (-1));
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = manager4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = parkingSensorController1.isCarPresentAtSpace(parkingSpace2);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.user.UserType userType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = authController3.login("", "hi!", userType9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.user.UserType userType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = authController3.login("", "", userType8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("", "hi!", "hi!", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name must be provided");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) '#');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("hi!", "", "hi!", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email address must be in a valid format (e.g., user@domain.com)");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("hi!", "", "hi!", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email address must be in a valid format (e.g., user@domain.com)");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) '4');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.user.UserType userType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = authController3.login("", "hi!", userType10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        models.user.UserType userType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = authController3.login("hi!", "hi!", userType9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass7 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("", "", "hi!", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name must be provided");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        boolean boolean5 = authController3.isLoggedIn();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass7 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("hi!", "", "", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email address must be in a valid format (e.g., user@domain.com)");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        java.lang.Class<?> wildcardClass9 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.user.UserType userType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = authController3.login("hi!", "", userType10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("hi!", "hi!", "hi!", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email address must be in a valid format (e.g., user@domain.com)");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        java.lang.Class<?> wildcardClass7 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = client4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.user.UserType userType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = authController3.login("hi!", "hi!", userType8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass8 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("", "hi!", "", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name must be provided");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("", "", "hi!", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name must be provided");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        boolean boolean9 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("", "hi!", "hi!", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name must be provided");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) '4');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass9 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.user.UserType userType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = authController3.login("", "", userType10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("hi!", "hi!", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("hi!", "hi!", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        services.ParkingSensorService parkingSensorService0 = null;
        controllers.ParkingSensorController parkingSensorController1 = new controllers.ParkingSensorController(parkingSensorService0);
        java.lang.Class<?> wildcardClass2 = parkingSensorController1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.user.UserType userType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authController3.login("", "", userType7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass7 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("", "hi!", "", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name must be provided");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("", "", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.user.UserType userType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = authController3.login("hi!", "hi!", userType8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        models.user.UserType userType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = authController3.login("hi!", "hi!", userType9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        models.client.Client client10 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        controllers.NavigationController navigationController0 = new controllers.NavigationController();
        java.lang.Class<?> wildcardClass1 = navigationController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        java.lang.Class<?> wildcardClass2 = bookingController1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.client.Client client9 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = client8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = superManager8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.user.UserType userType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = authController3.login("hi!", "", userType12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        boolean boolean9 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        java.lang.Class<?> wildcardClass9 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = client9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.user.UserType userType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = authController3.login("", "hi!", userType12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass8 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.client.Client client10 = authController3.getLoggedInClient();
        models.user.UserType userType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = authController3.login("", "hi!", userType13);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass9 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.user.UserType userType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = authController3.login("hi!", "hi!", userType10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        boolean boolean5 = authController3.isLoggedIn();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.user.UserType userType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = authController3.login("hi!", "hi!", userType9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        boolean boolean5 = authController3.isLoggedIn();
        models.client.Client client6 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        boolean boolean8 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.client.Client client10 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.user.UserType userType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = authController3.login("hi!", "hi!", userType10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.client.Client client10 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        boolean boolean9 = authController3.isLoggedIn();
        boolean boolean10 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        models.user.UserType userType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = authController3.login("hi!", "hi!", userType9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        models.client.Client client10 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = manager8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = client8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.user.UserType userType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = authController3.login("", "hi!", userType12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        boolean boolean9 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        boolean boolean5 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass6 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        boolean boolean9 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) 'a');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        java.lang.Class<?> wildcardClass9 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        boolean boolean10 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass11 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        models.client.Client client8 = authController3.getLoggedInClient();
        boolean boolean9 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = superManager9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("hi!", "", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        models.client.Client client8 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.client.Client client11 = authController3.getLoggedInClient();
        models.user.UserType userType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = authController3.login("hi!", "hi!", userType14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass9 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        boolean boolean5 = authController3.isLoggedIn();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        boolean boolean8 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("", "hi!", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass8 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        boolean boolean10 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass11 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        boolean boolean10 = authController3.isLoggedIn();
        models.manager.Manager manager11 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = manager11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("hi!", "", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.manager.Manager manager10 = authController3.getLoggedInManager();
        java.lang.Class<?> wildcardClass11 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.client.Client client9 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = client7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        boolean boolean9 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = client7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        java.lang.Class<?> wildcardClass6 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        boolean boolean10 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        boolean boolean6 = authController3.isLoggedIn();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("hi!", "", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("", "", "", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name must be provided");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.manager.Manager manager10 = authController3.getLoggedInManager();
        models.user.UserType userType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = authController3.login("hi!", "", userType13);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = superManager10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass5 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.client.Client client10 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.user.UserType userType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = authController3.login("hi!", "", userType9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientController1.registerClient("hi!", "hi!", "hi!", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email address must be in a valid format (e.g., user@domain.com)");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.manager.Manager manager10 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass8 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager12 = authController3.getLoggedInManager();
        models.client.Client client13 = authController3.getLoggedInClient();
        models.manager.Manager manager14 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager14);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.user.UserType userType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = authController3.login("", "hi!", userType12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        models.client.Client client10 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.user.UserType userType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = authController3.login("hi!", "", userType10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        boolean boolean9 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        boolean boolean7 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass8 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        services.ClientService clientService0 = null;
        controllers.ClientController clientController1 = new controllers.ClientController(clientService0);
        java.lang.Class<?> wildcardClass2 = clientController1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.manager.Manager manager10 = authController3.getLoggedInManager();
        java.lang.Class<?> wildcardClass11 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = manager8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        boolean boolean9 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager11 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        java.lang.Class<?> wildcardClass9 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.user.UserType userType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authController3.login("", "", userType7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        models.user.UserType userType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = authController3.login("", "hi!", userType9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.user.UserType userType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = authController3.login("", "", userType12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        boolean boolean6 = authController3.isLoggedIn();
        models.user.UserType userType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = authController3.login("", "", userType9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = superManager7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.manager.Manager manager10 = authController3.getLoggedInManager();
        models.manager.Manager manager11 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = manager11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = manager9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        models.client.Client client10 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        models.client.Client client10 = authController3.getLoggedInClient();
        boolean boolean11 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager12 = authController3.getLoggedInSuperManager();
        boolean boolean13 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass14 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("hi!", "hi!", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        boolean boolean5 = authController3.isLoggedIn();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        boolean boolean8 = authController3.isLoggedIn();
        models.client.Client client9 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = client9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        java.lang.Class<?> wildcardClass10 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager12 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager13 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager14 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager14);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        boolean boolean9 = authController3.isLoggedIn();
        boolean boolean10 = authController3.isLoggedIn();
        boolean boolean11 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        models.client.Client client10 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        boolean boolean6 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager10 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager12 = authController3.getLoggedInManager();
        models.client.Client client13 = authController3.getLoggedInClient();
        java.lang.Class<?> wildcardClass14 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.client.Client client10 = authController3.getLoggedInClient();
        models.manager.Manager manager11 = authController3.getLoggedInManager();
        boolean boolean12 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.manager.Manager manager5 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        boolean boolean9 = authController3.isLoggedIn();
        boolean boolean10 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass11 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.manager.Manager manager10 = authController3.getLoggedInManager();
        models.manager.Manager manager11 = authController3.getLoggedInManager();
        models.manager.Manager manager12 = authController3.getLoggedInManager();
        models.client.Client client13 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client13);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        java.lang.Class<?> wildcardClass9 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = superManager5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        boolean boolean8 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.booking.Booking booking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.extendBookingTime(booking2, (-1));
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        boolean boolean9 = authController3.isLoggedIn();
        models.user.UserType userType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = authController3.login("", "hi!", userType12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass11 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        boolean boolean7 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass8 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = manager8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.user.UserType userType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = authController3.login("", "", userType10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = superManager11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.client.Client client10 = authController3.getLoggedInClient();
        models.client.Client client11 = authController3.getLoggedInClient();
        models.client.Client client12 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client12);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass10 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        boolean boolean10 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("hi!", "hi!", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        boolean boolean10 = authController3.isLoggedIn();
        boolean boolean11 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        models.client.Client client12 = authController3.getLoggedInClient();
        models.manager.Manager manager13 = authController3.getLoggedInManager();
        java.lang.Class<?> wildcardClass14 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        models.user.UserType userType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authController3.login("", "", userType7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.user.UserType userType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = authController3.login("hi!", "", userType11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.client.Client client5 = authController3.getLoggedInClient();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.client.Client client9 = authController3.getLoggedInClient();
        boolean boolean10 = authController3.isLoggedIn();
        models.client.Client client11 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        boolean boolean9 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass11 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = manager8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        models.user.UserType userType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = authController3.login("hi!", "", userType12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Password cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = client8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        models.manager.Manager manager5 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager6 = authController3.getLoggedInSuperManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        boolean boolean10 = authController3.isLoggedIn();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        services.BookingService bookingService0 = null;
        controllers.BookingController bookingController1 = new controllers.BookingController(bookingService0);
        models.parkingSpace.ParkingSpace parkingSpace2 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking4 = bookingController1.createBooking(parkingSpace2, (int) '#');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User must be logged in to create a booking");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        boolean boolean8 = authController3.isLoggedIn();
        boolean boolean9 = authController3.isLoggedIn();
        boolean boolean10 = authController3.isLoggedIn();
        models.manager.Manager manager11 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager11);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager12 = authController3.getLoggedInManager();
        models.client.Client client13 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager14 = authController3.getLoggedInSuperManager();
        models.client.Client client15 = authController3.getLoggedInClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client15);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        models.manager.Manager manager10 = authController3.getLoggedInManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager10);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        java.lang.Class<?> wildcardClass6 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.client.Client client8 = authController3.getLoggedInClient();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        boolean boolean4 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.user.UserType userType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = authController3.login("", "", userType8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Email cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        boolean boolean7 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager9 = authController3.getLoggedInSuperManager();
        // The following exception was thrown during execution in test generation
        try {
            authController3.logout();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: No user is currently logged in");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        models.manager.Manager manager7 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = manager7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager7);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        boolean boolean10 = authController3.isLoggedIn();
        models.user.UserType userType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = authController3.login("hi!", "hi!", userType13);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager5 = authController3.getLoggedInManager();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = manager5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.manager.Manager manager4 = authController3.getLoggedInManager();
        boolean boolean5 = authController3.isLoggedIn();
        boolean boolean6 = authController3.isLoggedIn();
        boolean boolean7 = authController3.isLoggedIn();
        models.client.Client client8 = authController3.getLoggedInClient();
        models.manager.Manager manager9 = authController3.getLoggedInManager();
        models.user.UserType userType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = authController3.login("hi!", "hi!", userType12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager9);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.superManager.SuperManager superManager4 = authController3.getLoggedInSuperManager();
        boolean boolean5 = authController3.isLoggedIn();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager8 = authController3.getLoggedInSuperManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        java.lang.Class<?> wildcardClass11 = authController3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.client.Client client6 = authController3.getLoggedInClient();
        models.client.Client client7 = authController3.getLoggedInClient();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager10 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager12 = authController3.getLoggedInSuperManager();
        boolean boolean13 = authController3.isLoggedIn();
        models.user.UserType userType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = authController3.login("hi!", "hi!", userType16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: User type cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        services.ClientService clientService0 = null;
        services.ManagerService managerService1 = null;
        services.SuperManagerService superManagerService2 = null;
        controllers.AuthController authController3 = new controllers.AuthController(clientService0, managerService1, superManagerService2);
        models.client.Client client4 = authController3.getLoggedInClient();
        models.superManager.SuperManager superManager5 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager6 = authController3.getLoggedInManager();
        models.superManager.SuperManager superManager7 = authController3.getLoggedInSuperManager();
        models.manager.Manager manager8 = authController3.getLoggedInManager();
        boolean boolean9 = authController3.isLoggedIn();
        boolean boolean10 = authController3.isLoggedIn();
        models.superManager.SuperManager superManager11 = authController3.getLoggedInSuperManager();
        models.superManager.SuperManager superManager12 = authController3.getLoggedInSuperManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(client4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(manager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(superManager12);
    }
}

