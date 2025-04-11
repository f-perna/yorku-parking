package randoop.services;

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
        repositories.ManagerRepository managerRepository0 = null;
        services.ManagerService managerService1 = new services.ManagerService(managerRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.manager.Manager manager4 = managerService1.login("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ManagerRepository.authenticateManager(String, String)\" because \"this.managerRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        repositories.ManagerRepository managerRepository0 = null;
        services.ManagerService managerService1 = new services.ManagerService(managerRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.manager.Manager manager2 = managerService1.generateAndGetManagerAccount();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Only super managers can add new managers");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        repositories.ManagerRepository managerRepository0 = null;
        services.ManagerService managerService1 = new services.ManagerService(managerRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = managerService1.removeManager("hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Only super managers can add new managers");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        repositories.ParkingLotRepository parkingLotRepository0 = null;
        // The following exception was thrown during execution in test generation
        try {
            services.ParkingLotService parkingLotService1 = new services.ParkingLotService(parkingLotRepository0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking lot repository cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        services.SuperManagerService superManagerService0 = new services.SuperManagerService();
        java.lang.Class<?> wildcardClass1 = superManagerService0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        java.util.UUID uUID3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceService2.getParkingSpaceById(uUID3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Space ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        repositories.ParkingSensorRepository parkingSensorRepository2 = null;
        // The following exception was thrown during execution in test generation
        try {
            services.ParkingSensorService parkingSensorService3 = new services.ParkingSensorService(bookingRepository0, parkingSpaceRepository1, parkingSensorRepository2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ParkingSensorRepository.getAllSensors()\" because \"parkingSensorRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceService2.disableParkingSpace(parkingSpace3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Only managers can disable parking spaces");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        repositories.ManagerRepository managerRepository0 = null;
        services.ManagerService managerService1 = new services.ManagerService(managerRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.manager.Manager manager4 = managerService1.login("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ManagerRepository.authenticateManager(String, String)\" because \"this.managerRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceService2.getOccupiedSpaces(parkingLot3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking lot cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        java.util.UUID uUID3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceService2.getSpacesForLot(uUID3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Lot ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList3 = parkingSpaceService2.getAllSpaces();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ParkingSpaceRepository.getAllSpaces()\" because \"this.parkingSpaceRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceService2.getEnabledSpaces(parkingLot3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking lot cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceService2.getAvailableSpaces(parkingLot3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking lot cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        services.SuperManagerService superManagerService0 = new services.SuperManagerService();
        // The following exception was thrown during execution in test generation
        try {
            models.superManager.SuperManager superManager3 = superManagerService0.login("", "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid username or password");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceService2.getDisabledSpaces(parkingLot3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking lot cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        models.booking.Booking booking3 = null;
        models.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment6 = paymentService2.processRefundPayment(booking3, "hi!", client5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.client.Client client3 = clientService1.getClientByEmail("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.getClientByEmail(String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = clientService1.approveClient("hi!", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.getClientByEmail(String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.parkingSpace.ParkingSpace parkingSpace4 = parkingSpaceService2.enableParkingSpace(parkingSpace3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Only managers can enable parking spaces");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpaceService2.addParkingSpace(parkingLot3, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Only managers can add parking spaces");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        models.booking.Booking booking3 = null;
        models.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment6 = paymentService2.processFinalPayment(booking3, "", client5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        services.SuperManagerService superManagerService0 = new services.SuperManagerService();
        // The following exception was thrown during execution in test generation
        try {
            models.superManager.SuperManager superManager3 = superManagerService0.login("", "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid username or password");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = clientService1.approveClient("", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.getClientByEmail(String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = clientService1.approveClient("hi!", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.getClientByEmail(String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        models.booking.Booking booking3 = null;
        models.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment6 = paymentService2.processDepositPayment(booking3, "", client5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        java.lang.Class<?> wildcardClass3 = paymentService2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        repositories.ManagerRepository managerRepository0 = null;
        services.ManagerService managerService1 = new services.ManagerService(managerRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.manager.Manager manager4 = managerService1.login("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ManagerRepository.authenticateManager(String, String)\" because \"this.managerRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceService2.getUnOccupiedSpaces(parkingLot3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking lot cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.client.Client> clientList2 = clientService1.getAllClients();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.getAllClients()\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("", "hi!", "", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.client.Client client4 = clientService1.login("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.authenticateClient(String, String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        models.booking.Booking booking3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList4 = paymentService2.getPaymentsForBooking(booking3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        models.booking.Booking booking3 = null;
        models.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment6 = paymentService2.processDepositPayment(booking3, "hi!", client5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.client.Client client3 = clientService1.getClientByEmail("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.getClientByEmail(String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            clientService1.removeClient("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.deleteClient(String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        java.lang.Class<?> wildcardClass3 = parkingSpaceService2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        repositories.ManagerRepository managerRepository0 = null;
        services.ManagerService managerService1 = new services.ManagerService(managerRepository0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.manager.Manager> managerList2 = managerService1.getAllManagers();
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Only super managers can add new managers");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            clientService1.removeClient("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.deleteClient(String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bookingService3.isLatestBookingForSpaceAndClient(booking4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        models.payment.Payment payment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService3.confirmBooking(booking4, payment5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingSpace.ParkingSpace parkingSpace3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpaceService2.removeParkingSpace(parkingSpace3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.client.Client client4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bookingService3.hasOverstayedBookings(client4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService4.deleteBooking(booking6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingService4.isLatestBookingForSpaceAndClient(booking6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        models.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService3.cancelBooking(booking4, client5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, (int) (byte) 100, client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService3.deleteBooking(booking4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.payment.Payment payment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService4.completeBooking(booking6, payment7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        models.payment.Payment payment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService2.removePayment(payment3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingService4.cancel(booking6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("", "", "hi!", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingService4.checkIn(booking6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bookingService3.checkIn(booking4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.payment.Payment payment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService5.removePayment(payment6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.parkingSpace.ParkingSpace> parkingSpaceList4 = parkingSpaceService2.getBookedSpaces(parkingLot3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking lot cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = clientService1.approveClient("", true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.getClientByEmail(String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        repositories.ParkingSpaceRepository parkingSpaceRepository0 = null;
        repositories.ParkingSensorRepository parkingSensorRepository1 = null;
        services.ParkingSpaceService parkingSpaceService2 = new services.ParkingSpaceService(parkingSpaceRepository0, parkingSensorRepository1);
        models.parkingLot.ParkingLot parkingLot3 = null;
        // The following exception was thrown during execution in test generation
        try {
            parkingSpaceService2.addParkingSpace(parkingLot3, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Only managers can add parking spaces");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList7 = bookingService4.getBookingsForClient(client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.client.Client client4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList5 = bookingService3.getBookingsForClient(client4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking8 = bookingService4.extendBookingTime(booking6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, 0, client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking8 = bookingService4.extendBookingTime(booking6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.client.Client client7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService4.cancelBooking(booking6, client7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.client.Client client4 = clientService1.login("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.authenticateClient(String, String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        java.util.UUID uUID8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment9 = paymentService7.getPaymentById(uUID8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.parkingSpace.ParkingSpace parkingSpace6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking9 = bookingService4.createBooking(parkingSpace6, (-1), client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.payment.Payment payment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService5.confirmBooking(booking8, payment9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        java.lang.Class<?> wildcardClass8 = bookingService5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = bookingService5.isLatestBookingForSpaceAndClient(booking8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        java.util.UUID uUID6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment7 = paymentService5.getPaymentById(uUID6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        java.lang.Class<?> wildcardClass10 = bookingService6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = bookingService5.cancel(booking8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        java.util.UUID uUID8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking9 = bookingService5.getBookingById(uUID8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.payment.Payment payment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService9.removePayment(payment10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, 0, client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = bookingService6.checkIn(booking10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        repositories.ManagerRepository managerRepository0 = null;
        services.ManagerService managerService1 = new services.ManagerService(managerRepository0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = managerService1.removeManager("");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Only super managers can add new managers");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.payment.Payment payment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService6.confirmBooking(booking10, payment11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentService7.processFinalPayment(booking8, "", client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("", "hi!", "hi!", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = bookingService6.isClientCarParkedAnywhere(client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.client.Client client4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bookingService3.isClientCarParkedAnywhere(client4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("", "", "", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.client.Client client11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService6.cancelBooking(booking10, client11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList11 = paymentService9.getPaymentsForBooking(booking10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = bookingService6.cancel(booking10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService5.cancelBooking(booking8, client9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList11 = bookingService6.getBookingsForClient(client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentService7.processRefundPayment(booking8, "", client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment9 = paymentService5.processFinalPayment(booking6, "hi!", client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        java.util.UUID uUID10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentService9.getPaymentById(uUID10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.parkingSpace.ParkingSpace parkingSpace8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking11 = bookingService5.createBooking(parkingSpace8, (int) '4', client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.client.Client client4 = clientService1.login("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.authenticateClient(String, String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList9 = bookingService5.getBookingsForClient(client8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.payment.Payment payment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService6.completeBooking(booking10, payment11);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingService4.isClientCarParkedAnywhere(client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        java.util.UUID uUID3 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment4 = paymentService2.getPaymentById(uUID3);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment9 = paymentService5.processFinalPayment(booking6, "", client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.parkingSpace.ParkingSpace parkingSpace6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking9 = bookingService4.createBooking(parkingSpace6, (int) (byte) 10, client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        java.lang.Class<?> wildcardClass10 = paymentService9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = bookingService4.hasOverstayedBookings(client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.payment.Payment payment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService5.completeBooking(booking8, payment9);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment13 = paymentService9.processFinalPayment(booking10, "", client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = bookingService5.isClientCarParkedAnywhere(client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.parkingSpace.ParkingSpace parkingSpace6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking9 = bookingService4.createBooking(parkingSpace6, (int) '4', client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = bookingService6.hasOverstayedBookings(client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment13 = paymentService9.processFinalPayment(booking10, "hi!", client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        java.lang.Class<?> wildcardClass6 = paymentService5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.payment.Payment payment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService4.confirmBooking(booking6, payment7);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        java.util.UUID uUID10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking11 = bookingService6.getBookingById(uUID10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("hi!", "hi!", "hi!", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid email format");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        java.util.UUID uUID4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking5 = bookingService3.getBookingById(uUID4);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = bookingService5.hasOverstayedBookings(client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = bookingService3.cancel(booking4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService5.deleteBooking(booking8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment13 = paymentService9.processRefundPayment(booking10, "hi!", client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        repositories.ManagerRepository managerRepository0 = null;
        services.ManagerService managerService1 = new services.ManagerService(managerRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.manager.Manager manager4 = managerService1.login("hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ManagerRepository.authenticateManager(String, String)\" because \"this.managerRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking8 = bookingService4.extendBookingTime(booking6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService6.deleteBooking(booking10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking6 = bookingService3.extendBookingTime(booking4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        // The following exception was thrown during execution in test generation
        try {
            models.client.Client client4 = clientService1.login("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.ClientRepository.authenticateClient(String, String)\" because \"this.clientRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.payment.Payment payment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService7.removePayment(payment8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.parkingSpace.ParkingSpace parkingSpace8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking11 = bookingService5.createBooking(parkingSpace8, (int) (short) 0, client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentService7.processDepositPayment(booking8, "", client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentService7.processRefundPayment(booking8, "hi!", client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList9 = paymentService7.getPaymentsForBooking(booking8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        java.lang.Class<?> wildcardClass8 = paymentService7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = bookingService7.cancel(booking12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment13 = paymentService9.processDepositPayment(booking10, "hi!", client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        java.util.UUID uUID6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService4.getBookingById(uUID6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList7 = paymentService5.getPaymentsForBooking(booking6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        models.payment.Payment payment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService3.completeBooking(booking4, payment5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        java.util.UUID uUID12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment13 = paymentService11.getPaymentById(uUID12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = bookingService7.isClientCarParkedAnywhere(client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = bookingService7.isLatestBookingForSpaceAndClient(booking12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, (int) (byte) 0, client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment15 = paymentService11.processFinalPayment(booking12, "hi!", client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("", "hi!", "", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("hi!", "", "hi!", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid email format");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment9 = paymentService5.processRefundPayment(booking6, "", client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment15 = paymentService11.processDepositPayment(booking12, "hi!", client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = bookingService7.checkIn(booking12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = bookingService7.hasOverstayedBookings(client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        services.SuperManagerService superManagerService0 = new services.SuperManagerService();
        // The following exception was thrown during execution in test generation
        try {
            models.superManager.SuperManager superManager3 = superManagerService0.login("hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid username or password");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService7.deleteBooking(booking12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment15 = paymentService11.processRefundPayment(booking12, "", client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment9 = paymentService5.processRefundPayment(booking6, "hi!", client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentService7.processDepositPayment(booking8, "hi!", client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, 1, client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        models.booking.Booking booking3 = null;
        models.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment6 = paymentService2.processRefundPayment(booking3, "", client5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.payment.Payment payment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService11.removePayment(payment12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("hi!", "hi!", "", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid email format");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.payment.Payment payment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService7.completeBooking(booking12, payment13);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        java.util.UUID uUID12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService7.getBookingById(uUID12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        java.lang.Class<?> wildcardClass4 = bookingService3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("", "", "", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = bookingService6.isLatestBookingForSpaceAndClient(booking10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.parkingSpace.ParkingSpace parkingSpace8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking11 = bookingService5.createBooking(parkingSpace8, 0, client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.payment.Payment payment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService13.removePayment(payment14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.payment.Payment payment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService9.confirmBooking(booking16, payment17);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.payment.Payment payment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService8.completeBooking(booking14, payment15);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList13 = paymentService11.getPaymentsForBooking(booking12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.payment.Payment payment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService8.confirmBooking(booking14, payment15);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bookingService9.hasOverstayedBookings(client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment17 = paymentService13.processDepositPayment(booking14, "", client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, 1, client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment17 = paymentService13.processFinalPayment(booking14, "", client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking6 = bookingService3.extendBookingTime(booking4, (int) 'a');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, 10, client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bookingService9.isClientCarParkedAnywhere(client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking12 = bookingService6.extendBookingTime(booking10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = bookingService8.checkIn(booking14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking8 = bookingService4.extendBookingTime(booking6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        java.util.UUID uUID14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment15 = paymentService13.getPaymentById(uUID14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment13 = paymentService9.processRefundPayment(booking10, "", client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("hi!", "hi!", "hi!", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid email format");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bookingService9.cancel(booking16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment17 = paymentService13.processRefundPayment(booking14, "hi!", client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking8 = bookingService4.extendBookingTime(booking6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment19 = paymentService15.processDepositPayment(booking16, "", client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        java.lang.Class<?> wildcardClass12 = bookingService7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.client.Client client15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService8.cancelBooking(booking14, client15);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking16 = bookingService8.extendBookingTime(booking14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment19 = paymentService15.processFinalPayment(booking16, "", client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking12 = bookingService6.extendBookingTime(booking10, 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking19 = bookingService9.createBooking(parkingSpace16, (int) (byte) 1, client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking19 = bookingService9.createBooking(parkingSpace16, 10, client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, (-1), client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        services.SuperManagerService superManagerService0 = new services.SuperManagerService();
        // The following exception was thrown during execution in test generation
        try {
            models.superManager.SuperManager superManager3 = superManagerService0.login("hi!", "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid username or password");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList13 = bookingService7.getBookingsForClient(client12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList17 = bookingService9.getBookingsForClient(client16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService9.deleteBooking(booking16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, (int) '4', client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.client.Client client17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService9.cancelBooking(booking16, client17);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment17 = paymentService13.processDepositPayment(booking14, "hi!", client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("", "", "hi!", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bookingService9.isLatestBookingForSpaceAndClient(booking16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = bookingService8.isClientCarParkedAnywhere(client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, (int) '4', client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList15 = bookingService8.getBookingsForClient(client14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking19 = bookingService9.createBooking(parkingSpace16, (int) 'a', client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.client.Client client13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService7.cancelBooking(booking12, client13);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList17 = paymentService15.getPaymentsForBooking(booking16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment9 = paymentService5.processDepositPayment(booking6, "hi!", client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService7.createBooking(parkingSpace12, (int) (byte) -1, client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking18 = bookingService9.extendBookingTime(booking16, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment17 = paymentService13.processFinalPayment(booking14, "hi!", client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment15 = paymentService11.processFinalPayment(booking12, "", client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.payment.Payment payment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService9.completeBooking(booking16, payment17);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment11 = paymentService7.processFinalPayment(booking8, "hi!", client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        java.lang.Class<?> wildcardClass14 = bookingService8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking16 = bookingService8.extendBookingTime(booking14, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        java.util.UUID uUID16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService9.getBookingById(uUID16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking18 = bookingService9.extendBookingTime(booking16, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        java.lang.Class<?> wildcardClass12 = paymentService11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = bookingService5.checkIn(booking8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, (int) (short) 10, client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("", "hi!", "hi!", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Name cannot be empty");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService7.createBooking(parkingSpace12, 10, client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking18 = bookingService9.extendBookingTime(booking16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = bookingService10.checkIn(booking18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        java.lang.Class<?> wildcardClass6 = bookingService4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment19 = paymentService15.processFinalPayment(booking16, "hi!", client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService7.createBooking(parkingSpace12, (int) (byte) 10, client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.payment.Payment payment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService10.completeBooking(booking18, payment19);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment17 = paymentService13.processRefundPayment(booking14, "", client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        java.util.UUID uUID14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService8.getBookingById(uUID14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        java.lang.Class<?> wildcardClass18 = bookingService10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.payment.Payment payment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService7.confirmBooking(booking12, payment13);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment9 = paymentService5.processDepositPayment(booking6, "", client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, (int) (byte) 0, client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment21 = paymentService17.processFinalPayment(booking18, "", client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService8.deleteBooking(booking14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("hi!", "hi!", "", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid email format");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = bookingService10.isLatestBookingForSpaceAndClient(booking18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = bookingService10.isClientCarParkedAnywhere(client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, (int) (byte) -1, client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, (int) (short) 100, client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("hi!", "", "hi!", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid email format");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        java.util.UUID uUID18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment19 = paymentService17.getPaymentById(uUID18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.client.Client client19 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService10.cancelBooking(booking18, client19);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.payment.Payment payment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService10.confirmBooking(booking18, payment19);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking8 = bookingService4.extendBookingTime(booking6, (int) '#');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, (int) '4', client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("hi!", "", "", type5, "");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid email format");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.payment.Payment payment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService15.removePayment(payment16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList15 = paymentService13.getPaymentsForBooking(booking14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking20 = bookingService10.extendBookingTime(booking18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        java.util.UUID uUID18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking19 = bookingService10.getBookingById(uUID18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking16 = bookingService8.extendBookingTime(booking14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        java.util.UUID uUID16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment17 = paymentService15.getPaymentById(uUID16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment15 = paymentService11.processRefundPayment(booking12, "hi!", client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, (-1), client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = bookingService10.hasOverstayedBookings(client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment21 = paymentService17.processDepositPayment(booking18, "", client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.payment.Payment payment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService17.removePayment(payment18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList19 = paymentService17.getPaymentsForBooking(booking18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking6 = bookingService3.extendBookingTime(booking4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment19 = paymentService15.processRefundPayment(booking16, "", client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = bookingService8.hasOverstayedBookings(client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment21 = paymentService17.processRefundPayment(booking18, "hi!", client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, (int) '#', client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment19 = paymentService15.processRefundPayment(booking16, "hi!", client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking19 = bookingService9.createBooking(parkingSpace16, (int) (byte) 0, client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking12 = bookingService6.extendBookingTime(booking10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment21 = paymentService17.processFinalPayment(booking18, "hi!", client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = bookingService8.isLatestBookingForSpaceAndClient(booking14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.parkingSpace.ParkingSpace parkingSpace6 = null;
        models.client.Client client8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking9 = bookingService4.createBooking(parkingSpace6, 1, client8);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList19 = bookingService10.getBookingsForClient(client18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.parkingSpace.ParkingSpace parkingSpace8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking11 = bookingService5.createBooking(parkingSpace8, (int) (byte) 10, client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        java.lang.Class<?> wildcardClass16 = paymentService15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        java.lang.Class<?> wildcardClass2 = clientService1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = bookingService10.cancel(booking18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = bookingService8.cancel(booking14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        repositories.PaymentRepository paymentRepository0 = null;
        services.BookingService bookingService1 = null;
        services.PaymentService paymentService2 = new services.PaymentService(paymentRepository0, bookingService1);
        models.booking.Booking booking3 = null;
        models.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment6 = paymentService2.processFinalPayment(booking3, "hi!", client5);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.parkingSpace.ParkingSpace parkingSpace8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking11 = bookingService5.createBooking(parkingSpace8, (int) (byte) 1, client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = bookingService11.isClientCarParkedAnywhere(client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment15 = paymentService11.processDepositPayment(booking12, "", client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, 10, client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService7.createBooking(parkingSpace12, 100, client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.parkingSpace.ParkingSpace parkingSpace18 = null;
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking21 = bookingService10.createBooking(parkingSpace18, 10, client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking18 = bookingService9.extendBookingTime(booking16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.payment.Payment payment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService11.confirmBooking(booking20, payment21);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = bookingService11.hasOverstayedBookings(client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList21 = paymentService19.getPaymentsForBooking(booking20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, 0, client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment23 = paymentService19.processDepositPayment(booking20, "hi!", client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        java.lang.Class<?> wildcardClass18 = paymentService17.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        java.lang.Class<?> wildcardClass20 = paymentService19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService12.deleteBooking(booking22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = bookingService11.isLatestBookingForSpaceAndClient(booking20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList23 = paymentService21.getPaymentsForBooking(booking22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        java.util.UUID uUID22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment23 = paymentService21.getPaymentById(uUID22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.parkingSpace.ParkingSpace parkingSpace18 = null;
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking21 = bookingService10.createBooking(parkingSpace18, 0, client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment25 = paymentService21.processDepositPayment(booking22, "hi!", client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking18 = bookingService9.extendBookingTime(booking16, (int) 'a');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking12 = bookingService6.extendBookingTime(booking10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment19 = paymentService15.processDepositPayment(booking16, "hi!", client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking6 = bookingService3.extendBookingTime(booking4, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = bookingService12.checkIn(booking22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService10.deleteBooking(booking18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = bookingService12.cancel(booking22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment21 = paymentService17.processDepositPayment(booking18, "hi!", client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, (int) 'a', client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        models.payment.Payment payment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService13.completeBooking(booking24, payment25);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking20 = bookingService10.extendBookingTime(booking18, 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.parkingSpace.ParkingSpace parkingSpace8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking11 = bookingService5.createBooking(parkingSpace8, 100, client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        java.util.UUID uUID20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking21 = bookingService11.getBookingById(uUID20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService11.deleteBooking(booking20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = bookingService13.checkIn(booking24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        models.client.Client client25 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService13.cancelBooking(booking24, client25);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        java.lang.Class<?> wildcardClass20 = bookingService11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, (int) (byte) 1, client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = bookingService12.isClientCarParkedAnywhere(client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService7.createBooking(parkingSpace12, (int) (short) 10, client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        java.lang.Class<?> wildcardClass22 = paymentService21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.parkingSpace.ParkingSpace parkingSpace24 = null;
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking27 = bookingService13.createBooking(parkingSpace24, (int) (byte) 100, client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = bookingService11.checkIn(booking20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        java.lang.Class<?> wildcardClass14 = paymentService13.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        java.util.UUID uUID20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment21 = paymentService19.getPaymentById(uUID20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment23 = paymentService19.processFinalPayment(booking20, "hi!", client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = bookingService12.isLatestBookingForSpaceAndClient(booking22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking24 = bookingService12.extendBookingTime(booking22, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.payment.Payment payment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService19.removePayment(payment20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList25 = paymentService23.getPaymentsForBooking(booking24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList23 = bookingService12.getBookingsForClient(client22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment21 = paymentService17.processRefundPayment(booking18, "", client20);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.booking.Booking booking14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking16 = bookingService8.extendBookingTime(booking14, (int) '4');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.client.Client client20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList21 = bookingService11.getBookingsForClient(client20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.parkingSpace.ParkingSpace parkingSpace24 = null;
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking27 = bookingService13.createBooking(parkingSpace24, 100, client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.parkingSpace.ParkingSpace parkingSpace4 = null;
        models.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking7 = bookingService3.createBooking(parkingSpace4, (int) (short) -1, client6);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment13 = paymentService9.processDepositPayment(booking10, "", client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        repositories.BookingRepository bookingRepository0 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository1 = null;
        services.ParkingSensorService parkingSensorService2 = null;
        services.BookingService bookingService3 = new services.BookingService(bookingRepository0, parkingSpaceRepository1, parkingSensorService2);
        models.booking.Booking booking4 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking6 = bookingService3.extendBookingTime(booking4, 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.payment.Payment payment22 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService21.removePayment(payment22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, (int) ' ', client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking24 = bookingService12.extendBookingTime(booking22, 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList25 = bookingService13.getBookingsForClient(client24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment25 = paymentService21.processFinalPayment(booking22, "hi!", client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.payment.Payment payment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService12.completeBooking(booking22, payment23);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.client.Client client23 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService12.cancelBooking(booking22, client23);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.payment.Payment payment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService11.completeBooking(booking20, payment21);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = bookingService12.hasOverstayedBookings(client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment25 = paymentService21.processFinalPayment(booking22, "", client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.payment.Payment payment24 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService23.removePayment(payment24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking18 = bookingService9.extendBookingTime(booking16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment23 = paymentService19.processFinalPayment(booking20, "", client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = bookingService13.hasOverstayedBookings(client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.booking.Booking booking16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bookingService9.checkIn(booking16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking12 = bookingService6.extendBookingTime(booking10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.booking.Booking booking12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking14 = bookingService7.extendBookingTime(booking12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = bookingService11.cancel(booking20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        java.util.UUID uUID24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment25 = paymentService23.getPaymentById(uUID24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.parkingSpace.ParkingSpace parkingSpace20 = null;
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking23 = bookingService11.createBooking(parkingSpace20, (int) (short) 100, client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking19 = bookingService9.createBooking(parkingSpace16, 100, client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, (int) (short) 0, client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.payment.Payment payment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService12.confirmBooking(booking22, payment23);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, (int) (byte) 0, client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment27 = paymentService23.processDepositPayment(booking24, "hi!", client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        models.payment.Payment payment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService13.confirmBooking(booking24, payment25);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        repositories.ClientRepository clientRepository0 = null;
        services.ClientService clientService1 = new services.ClientService(clientRepository0);
        models.client.Client.type type5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = clientService1.registerClient("hi!", "", "", type5, "hi!");
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Invalid email format");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, 1, client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.BookingRepository bookingRepository1 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository2 = null;
        services.ParkingSensorService parkingSensorService3 = null;
        services.BookingService bookingService4 = new services.BookingService(bookingRepository1, parkingSpaceRepository2, parkingSensorService3);
        services.PaymentService paymentService5 = new services.PaymentService(paymentRepository0, bookingService4);
        models.booking.Booking booking6 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking8 = bookingService4.extendBookingTime(booking6, 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment25 = paymentService21.processRefundPayment(booking22, "hi!", client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking12 = bookingService6.extendBookingTime(booking10, (int) '4');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = bookingService13.cancel(booking24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.BookingRepository bookingRepository5 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository6 = null;
        services.ParkingSensorService parkingSensorService7 = null;
        services.BookingService bookingService8 = new services.BookingService(bookingRepository5, parkingSpaceRepository6, parkingSensorService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository4, bookingService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository3, bookingService8);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository2, bookingService8);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository1, bookingService8);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository0, bookingService8);
        models.parkingSpace.ParkingSpace parkingSpace14 = null;
        models.client.Client client16 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking17 = bookingService8.createBooking(parkingSpace14, (int) (byte) -1, client16);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking20 = bookingService10.extendBookingTime(booking18, (int) '4');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        java.util.UUID uUID22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking23 = bookingService12.getBookingById(uUID22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment27 = paymentService23.processDepositPayment(booking24, "", client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = bookingService14.isClientCarParkedAnywhere(client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = bookingService14.isLatestBookingForSpaceAndClient(booking26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        models.client.Client client28 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment29 = paymentService25.processDepositPayment(booking26, "", client28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        java.util.UUID uUID26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking27 = bookingService14.getBookingById(uUID26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment23 = paymentService19.processRefundPayment(booking20, "", client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = bookingService13.isLatestBookingForSpaceAndClient(booking24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, (int) (short) -1, client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = bookingService13.isClientCarParkedAnywhere(client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService7.createBooking(parkingSpace12, (int) (short) 0, client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        models.payment.Payment payment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService14.confirmBooking(booking26, payment27);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        models.client.Client client28 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment29 = paymentService25.processRefundPayment(booking26, "", client28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking28 = bookingService14.extendBookingTime(booking26, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        java.lang.Class<?> wildcardClass16 = bookingService9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        models.payment.Payment payment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService14.completeBooking(booking26, payment27);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking28 = bookingService14.extendBookingTime(booking26, (int) ' ');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment25 = paymentService21.processDepositPayment(booking22, "", client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = bookingService14.cancel(booking26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        models.client.Client client27 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService14.cancelBooking(booking26, client27);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        models.client.Client client28 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment29 = paymentService25.processFinalPayment(booking26, "hi!", client28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.parkingSpace.ParkingSpace parkingSpace10 = null;
        models.client.Client client12 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking13 = bookingService6.createBooking(parkingSpace10, (int) '#', client12);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment27 = paymentService23.processRefundPayment(booking24, "hi!", client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.BookingRepository bookingRepository6 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository7 = null;
        services.ParkingSensorService parkingSensorService8 = null;
        services.BookingService bookingService9 = new services.BookingService(bookingRepository6, parkingSpaceRepository7, parkingSensorService8);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository5, bookingService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository4, bookingService9);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository3, bookingService9);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository2, bookingService9);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository1, bookingService9);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository0, bookingService9);
        models.parkingSpace.ParkingSpace parkingSpace16 = null;
        models.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking19 = bookingService9.createBooking(parkingSpace16, (int) '4', client18);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.parkingSpace.ParkingSpace parkingSpace20 = null;
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking23 = bookingService11.createBooking(parkingSpace20, (int) (byte) 1, client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.parkingSpace.ParkingSpace parkingSpace26 = null;
        models.client.Client client28 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking29 = bookingService14.createBooking(parkingSpace26, 0, client28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment27 = paymentService23.processRefundPayment(booking24, "", client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        java.util.UUID uUID26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment27 = paymentService25.getPaymentById(uUID26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.parkingSpace.ParkingSpace parkingSpace22 = null;
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking25 = bookingService12.createBooking(parkingSpace22, (int) (short) 10, client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking22 = bookingService11.extendBookingTime(booking20, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService14.deleteBooking(booking26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService13.deleteBooking(booking24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking24 = bookingService12.extendBookingTime(booking22, (int) 'a');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking22 = bookingService11.extendBookingTime(booking20, (int) ' ');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = bookingService14.checkIn(booking26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking26 = bookingService13.extendBookingTime(booking24, 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        java.util.UUID uUID24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking25 = bookingService13.getBookingById(uUID24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        models.client.Client client30 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment31 = paymentService27.processFinalPayment(booking28, "", client30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.parkingSpace.ParkingSpace parkingSpace22 = null;
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking25 = bookingService12.createBooking(parkingSpace22, 0, client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.client.Client client21 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService11.cancelBooking(booking20, client21);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = bookingService14.hasOverstayedBookings(client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = bookingService15.cancel(booking28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        java.lang.Class<?> wildcardClass26 = paymentService25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking12 = bookingService6.extendBookingTime(booking10, 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        java.lang.Class<?> wildcardClass28 = bookingService15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.client.Client client28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList29 = bookingService15.getBookingsForClient(client28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        models.client.Client client29 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService15.cancelBooking(booking28, client29);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.payment.Payment payment26 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService25.removePayment(payment26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking26 = bookingService13.extendBookingTime(booking24, (int) ' ');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList29 = paymentService27.getPaymentsForBooking(booking28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        models.client.Client client30 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment31 = paymentService27.processRefundPayment(booking28, "", client30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        java.util.UUID uUID28 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking29 = bookingService15.getBookingById(uUID28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, (int) '#');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking22 = bookingService11.extendBookingTime(booking20, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        models.client.Client client28 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment29 = paymentService25.processDepositPayment(booking26, "hi!", client28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        java.lang.Class<?> wildcardClass22 = bookingService12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.booking.Booking> bookingList27 = bookingService14.getBookingsForClient(client26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"repositories.BookingRepository.getBookingsForClient(models.client.Client)\" because \"this.bookingRepository\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking24 = bookingService12.extendBookingTime(booking22, (int) '#');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService15.deleteBooking(booking28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking22 = bookingService11.extendBookingTime(booking20, (-1));
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.client.Client client28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = bookingService15.isClientCarParkedAnywhere(client28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        models.client.Client client30 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment31 = paymentService27.processDepositPayment(booking28, "", client30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        models.client.Client client30 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment31 = paymentService27.processDepositPayment(booking28, "hi!", client30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking24 = bookingService12.extendBookingTime(booking22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.BookingRepository bookingRepository7 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository8 = null;
        services.ParkingSensorService parkingSensorService9 = null;
        services.BookingService bookingService10 = new services.BookingService(bookingRepository7, parkingSpaceRepository8, parkingSensorService9);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository6, bookingService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository5, bookingService10);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository4, bookingService10);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository3, bookingService10);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository2, bookingService10);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository1, bookingService10);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository0, bookingService10);
        models.booking.Booking booking18 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking20 = bookingService10.extendBookingTime(booking18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.parkingSpace.ParkingSpace parkingSpace8 = null;
        models.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking11 = bookingService5.createBooking(parkingSpace8, (int) (byte) 0, client10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking26 = bookingService13.extendBookingTime(booking24, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking26 = bookingService13.extendBookingTime(booking24, 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.BookingRepository bookingRepository9 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository10 = null;
        services.ParkingSensorService parkingSensorService11 = null;
        services.BookingService bookingService12 = new services.BookingService(bookingRepository9, parkingSpaceRepository10, parkingSensorService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository8, bookingService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository7, bookingService12);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository6, bookingService12);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository5, bookingService12);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository4, bookingService12);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository3, bookingService12);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository2, bookingService12);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository1, bookingService12);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository0, bookingService12);
        models.booking.Booking booking22 = null;
        models.client.Client client24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment25 = paymentService21.processRefundPayment(booking22, "", client24);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        models.client.Client client30 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment31 = paymentService27.processRefundPayment(booking28, "hi!", client30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment23 = paymentService19.processDepositPayment(booking20, "", client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        java.util.UUID uUID28 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment29 = paymentService27.getPaymentById(uUID28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        models.client.Client client30 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment31 = paymentService27.processFinalPayment(booking28, "hi!", client30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.booking.Booking booking30 = null;
        models.client.Client client31 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService16.cancelBooking(booking30, client31);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.parkingSpace.ParkingSpace parkingSpace30 = null;
        models.client.Client client32 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking33 = bookingService16.createBooking(parkingSpace30, (int) (byte) 0, client32);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.payment.Payment payment28 = null;
        // The following exception was thrown during execution in test generation
        try {
            paymentService27.removePayment(payment28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Payment cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.booking.Booking booking30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = bookingService16.isLatestBookingForSpaceAndClient(booking30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        java.util.UUID uUID30 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking31 = bookingService16.getBookingById(uUID30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking ID cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.booking.Booking booking30 = null;
        models.client.Client client32 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment33 = paymentService29.processDepositPayment(booking30, "", client32);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.booking.Booking booking24 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking26 = bookingService13.extendBookingTime(booking24, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = bookingService15.isLatestBookingForSpaceAndClient(booking28);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.booking.Booking booking30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = bookingService16.checkIn(booking30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList27 = paymentService25.getPaymentsForBooking(booking26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.BookingRepository bookingRepository8 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository9 = null;
        services.ParkingSensorService parkingSensorService10 = null;
        services.BookingService bookingService11 = new services.BookingService(bookingRepository8, parkingSpaceRepository9, parkingSensorService10);
        services.PaymentService paymentService12 = new services.PaymentService(paymentRepository7, bookingService11);
        services.PaymentService paymentService13 = new services.PaymentService(paymentRepository6, bookingService11);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository5, bookingService11);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository4, bookingService11);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository3, bookingService11);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository2, bookingService11);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository1, bookingService11);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository0, bookingService11);
        models.booking.Booking booking20 = null;
        models.client.Client client22 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment23 = paymentService19.processRefundPayment(booking20, "hi!", client22);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.booking.Booking booking28 = null;
        models.payment.Payment payment29 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService15.completeBooking(booking28, payment29);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.booking.Booking booking30 = null;
        models.client.Client client32 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.payment.Payment payment33 = paymentService29.processRefundPayment(booking30, "hi!", client32);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.BookingRepository bookingRepository12 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository13 = null;
        services.ParkingSensorService parkingSensorService14 = null;
        services.BookingService bookingService15 = new services.BookingService(bookingRepository12, parkingSpaceRepository13, parkingSensorService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository11, bookingService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository10, bookingService15);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository9, bookingService15);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository8, bookingService15);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository7, bookingService15);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository6, bookingService15);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository5, bookingService15);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository4, bookingService15);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository3, bookingService15);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository2, bookingService15);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository1, bookingService15);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository0, bookingService15);
        models.parkingSpace.ParkingSpace parkingSpace28 = null;
        models.client.Client client30 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking31 = bookingService15.createBooking(parkingSpace28, (int) (byte) -1, client30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.booking.Booking booking30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<models.payment.Payment> paymentList31 = paymentService29.getPaymentsForBooking(booking30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.booking.Booking booking30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = bookingService16.cancel(booking30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"models.booking.Booking.getStartTime()\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.client.Client client30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = bookingService16.isClientCarParkedAnywhere(client30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Client cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.PaymentRepository paymentRepository11 = null;
        repositories.PaymentRepository paymentRepository12 = null;
        repositories.BookingRepository bookingRepository13 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository14 = null;
        services.ParkingSensorService parkingSensorService15 = null;
        services.BookingService bookingService16 = new services.BookingService(bookingRepository13, parkingSpaceRepository14, parkingSensorService15);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository12, bookingService16);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository11, bookingService16);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository10, bookingService16);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository9, bookingService16);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository8, bookingService16);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository7, bookingService16);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository6, bookingService16);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository5, bookingService16);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository4, bookingService16);
        services.PaymentService paymentService26 = new services.PaymentService(paymentRepository3, bookingService16);
        services.PaymentService paymentService27 = new services.PaymentService(paymentRepository2, bookingService16);
        services.PaymentService paymentService28 = new services.PaymentService(paymentRepository1, bookingService16);
        services.PaymentService paymentService29 = new services.PaymentService(paymentRepository0, bookingService16);
        models.booking.Booking booking30 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingService16.deleteBooking(booking30);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.PaymentRepository paymentRepository10 = null;
        repositories.BookingRepository bookingRepository11 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository12 = null;
        services.ParkingSensorService parkingSensorService13 = null;
        services.BookingService bookingService14 = new services.BookingService(bookingRepository11, parkingSpaceRepository12, parkingSensorService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository10, bookingService14);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository9, bookingService14);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository8, bookingService14);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository7, bookingService14);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository6, bookingService14);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository5, bookingService14);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository4, bookingService14);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository3, bookingService14);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository2, bookingService14);
        services.PaymentService paymentService24 = new services.PaymentService(paymentRepository1, bookingService14);
        services.PaymentService paymentService25 = new services.PaymentService(paymentRepository0, bookingService14);
        models.booking.Booking booking26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking28 = bookingService14.extendBookingTime(booking26, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.BookingRepository bookingRepository3 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository4 = null;
        services.ParkingSensorService parkingSensorService5 = null;
        services.BookingService bookingService6 = new services.BookingService(bookingRepository3, parkingSpaceRepository4, parkingSensorService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository2, bookingService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository1, bookingService6);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository0, bookingService6);
        models.booking.Booking booking10 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking12 = bookingService6.extendBookingTime(booking10, (int) '#');
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService7.createBooking(parkingSpace12, (int) (short) 1, client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.BookingRepository bookingRepository2 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository3 = null;
        services.ParkingSensorService parkingSensorService4 = null;
        services.BookingService bookingService5 = new services.BookingService(bookingRepository2, parkingSpaceRepository3, parkingSensorService4);
        services.PaymentService paymentService6 = new services.PaymentService(paymentRepository1, bookingService5);
        services.PaymentService paymentService7 = new services.PaymentService(paymentRepository0, bookingService5);
        models.booking.Booking booking8 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking10 = bookingService5.extendBookingTime(booking8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Booking cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.PaymentRepository paymentRepository4 = null;
        repositories.PaymentRepository paymentRepository5 = null;
        repositories.PaymentRepository paymentRepository6 = null;
        repositories.PaymentRepository paymentRepository7 = null;
        repositories.PaymentRepository paymentRepository8 = null;
        repositories.PaymentRepository paymentRepository9 = null;
        repositories.BookingRepository bookingRepository10 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository11 = null;
        services.ParkingSensorService parkingSensorService12 = null;
        services.BookingService bookingService13 = new services.BookingService(bookingRepository10, parkingSpaceRepository11, parkingSensorService12);
        services.PaymentService paymentService14 = new services.PaymentService(paymentRepository9, bookingService13);
        services.PaymentService paymentService15 = new services.PaymentService(paymentRepository8, bookingService13);
        services.PaymentService paymentService16 = new services.PaymentService(paymentRepository7, bookingService13);
        services.PaymentService paymentService17 = new services.PaymentService(paymentRepository6, bookingService13);
        services.PaymentService paymentService18 = new services.PaymentService(paymentRepository5, bookingService13);
        services.PaymentService paymentService19 = new services.PaymentService(paymentRepository4, bookingService13);
        services.PaymentService paymentService20 = new services.PaymentService(paymentRepository3, bookingService13);
        services.PaymentService paymentService21 = new services.PaymentService(paymentRepository2, bookingService13);
        services.PaymentService paymentService22 = new services.PaymentService(paymentRepository1, bookingService13);
        services.PaymentService paymentService23 = new services.PaymentService(paymentRepository0, bookingService13);
        models.parkingSpace.ParkingSpace parkingSpace24 = null;
        models.client.Client client26 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking27 = bookingService13.createBooking(parkingSpace24, (int) (short) 0, client26);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        repositories.PaymentRepository paymentRepository0 = null;
        repositories.PaymentRepository paymentRepository1 = null;
        repositories.PaymentRepository paymentRepository2 = null;
        repositories.PaymentRepository paymentRepository3 = null;
        repositories.BookingRepository bookingRepository4 = null;
        repositories.ParkingSpaceRepository parkingSpaceRepository5 = null;
        services.ParkingSensorService parkingSensorService6 = null;
        services.BookingService bookingService7 = new services.BookingService(bookingRepository4, parkingSpaceRepository5, parkingSensorService6);
        services.PaymentService paymentService8 = new services.PaymentService(paymentRepository3, bookingService7);
        services.PaymentService paymentService9 = new services.PaymentService(paymentRepository2, bookingService7);
        services.PaymentService paymentService10 = new services.PaymentService(paymentRepository1, bookingService7);
        services.PaymentService paymentService11 = new services.PaymentService(paymentRepository0, bookingService7);
        models.parkingSpace.ParkingSpace parkingSpace12 = null;
        models.client.Client client14 = null;
        // The following exception was thrown during execution in test generation
        try {
            models.booking.Booking booking15 = bookingService7.createBooking(parkingSpace12, (int) '#', client14);
            org.junit.Assert.fail("Expected exception of type models.ParkingSystemException; message: Parking space cannot be null");
        } catch (models.ParkingSystemException e) {
        // Expected exception.
        }
    }
}

