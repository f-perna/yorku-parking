package manual.controllers.factory;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import controllers.AuthController;
import controllers.BookingController;
import controllers.ClientController;
import controllers.ManagerController;
import controllers.ParkingLotController;
import controllers.ParkingSensorController;
import controllers.ParkingSpaceController;
import controllers.PaymentController;
import controllers.SuperManagerController;
import controllers.factory.ControllerFactory;
import manual.controllers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class ControllerFactoryTest extends BaseControllerTest {

    @BeforeEach
    protected void setUp() throws IOException {
        super.setUp();
    }

    @AfterEach
    protected void tearDown() throws NoSuchFieldException, IllegalAccessException {
        super.tearDown();
    }

    @Test
    void testSingletonBehavior() {
        ControllerFactory instance1 = ControllerFactory.getInstance();
        ControllerFactory instance2 = ControllerFactory.getInstance();

        assertSame(instance1, instance2, "ControllerFactory should return the same instance");
    }

    @Test
    void testAllControllersAreInitialized() {
        assertNotNull(controllerFactory.getAuthController(), "AuthController should not be null");
        assertNotNull(controllerFactory.getBookingController(), "BookingController should not be null");
        assertNotNull(controllerFactory.getClientController(), "ClientController should not be null");
        assertNotNull(controllerFactory.getManagerController(), "ManagerController should not be null");
        assertNotNull(controllerFactory.getParkingLotController(), "ParkingLotController should not be null");
        assertNotNull(controllerFactory.getParkingSpaceController(), "ParkingSpaceController should not be null");
        assertNotNull(controllerFactory.getPaymentController(), "PaymentController should not be null");
        assertNotNull(controllerFactory.getSuperManagerController(), "SuperManagerController should not be null");
        assertNotNull(controllerFactory.getParkingSensorController(), "ParkingSensorController should not be null");
    }

    @Test
    void testControllerInstanceConsistency() {
        AuthController auth1 = controllerFactory.getAuthController();
        AuthController auth2 = controllerFactory.getAuthController();
        assertSame(auth1, auth2, "AuthController instance should be reused");

        BookingController booking1 = controllerFactory.getBookingController();
        BookingController booking2 = controllerFactory.getBookingController();
        assertSame(booking1, booking2, "BookingController instance should be reused");

        ClientController client1 = controllerFactory.getClientController();
        ClientController client2 = controllerFactory.getClientController();
        assertSame(client1, client2, "ClientController instance should be reused");

        ManagerController manager1 = controllerFactory.getManagerController();
        ManagerController manager2 = controllerFactory.getManagerController();
        assertSame(manager1, manager2, "ManagerController instance should be reused");

        ParkingLotController parkingLot1 = controllerFactory.getParkingLotController();
        ParkingLotController parkingLot2 = controllerFactory.getParkingLotController();
        assertSame(parkingLot1, parkingLot2, "ParkingLotController instance should be reused");

        ParkingSpaceController parkingSpace1 = controllerFactory.getParkingSpaceController();
        ParkingSpaceController parkingSpace2 = controllerFactory.getParkingSpaceController();
        assertSame(parkingSpace1, parkingSpace2, "ParkingSpaceController instance should be reused");

        PaymentController payment1 = controllerFactory.getPaymentController();
        PaymentController payment2 = controllerFactory.getPaymentController();
        assertSame(payment1, payment2, "PaymentController instance should be reused");

        SuperManagerController superManager1 = controllerFactory.getSuperManagerController();
        SuperManagerController superManager2 = controllerFactory.getSuperManagerController();
        assertSame(superManager1, superManager2, "SuperManagerController instance should be reused");

        ParkingSensorController parkingSensor1 = controllerFactory.getParkingSensorController();
        ParkingSensorController parkingSensor2 = controllerFactory.getParkingSensorController();
        assertSame(parkingSensor1, parkingSensor2, "ParkingSensorController instance should be reused");
    }

    @Test
    void testConcurrentAccess() throws InterruptedException {
        Thread[] threads = new Thread[10];
        ControllerFactory[] instances = new ControllerFactory[10];

        for (int i = 0; i < 10; i++) {
            final int index = i;
            threads[i] = new Thread(() -> {
                instances[index] = ControllerFactory.getInstance();
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        for (int i = 1; i < instances.length; i++) {
            assertSame(instances[0], instances[i],
                    "ControllerFactory instances should be the same across threads");
        }
    }
}