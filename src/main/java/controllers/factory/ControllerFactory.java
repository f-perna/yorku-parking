package controllers.factory;

import controllers.AuthController;
import controllers.BookingController;
import controllers.ClientController;
import controllers.ManagerController;
import controllers.ParkingLotController;
import controllers.ParkingSensorController;
import controllers.ParkingSpaceController;
import controllers.PaymentController;
import controllers.SuperManagerController;
import services.BookingService;
import services.ClientService;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSpaceService;
import services.PaymentService;
import services.SuperManagerService;
import services.factory.ServiceFactory;
import services.ParkingSensorService;

public class ControllerFactory {

	private static ControllerFactory instance;

	private BookingController bookingController;
	private ClientController clientController;
	private ParkingLotController parkingLotController;
	private ParkingSpaceController parkingSpaceController;
	private PaymentController paymentController;
	private ManagerController managerController;
	private AuthController authController;
	private SuperManagerController superManagerController;
	private ParkingSensorController parkingSensorController;

	private ControllerFactory() {
		initializeControllers();
	}

	private void initializeControllers() {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();

		// Get all required services
		BookingService bookingService = serviceFactory.getBookingService();
		ClientService clientService = serviceFactory.getClientService();
		ManagerService managerService = serviceFactory.getManagerService();
		ParkingLotService parkingLotService = serviceFactory.getParkingLotService();
		ParkingSpaceService parkingSpaceService = serviceFactory.getParkingSpaceService();
		PaymentService paymentService = serviceFactory.getPaymentService();
		SuperManagerService superManagerService = serviceFactory.getSuperManagerService();
		ParkingSensorService parkingSensorService = serviceFactory.getParkingSensorService();

		// Create controllers with their required dependencies
		this.bookingController = new BookingController(bookingService);
		this.clientController = new ClientController(clientService);
		this.parkingLotController = new ParkingLotController(parkingLotService);
		this.parkingSpaceController = new ParkingSpaceController(parkingSpaceService);
		this.paymentController = new PaymentController(paymentService);

		// Create controllers that depend on multiple services
		this.managerController = new ManagerController(parkingLotService, parkingSpaceService, clientService);
		this.authController = new AuthController(clientService, managerService, superManagerService);
		this.superManagerController = new SuperManagerController(managerService);
		this.parkingSensorController = new ParkingSensorController(parkingSensorService);
	}

	public static synchronized ControllerFactory getInstance() {
		if (instance == null) {
			instance = new ControllerFactory();
		}
		return instance;
	}

	public BookingController getBookingController() {
		return bookingController;
	}

	public ClientController getClientController() {
		return clientController;
	}

	public ManagerController getManagerController() {
		return managerController;
	}

	public ParkingLotController getParkingLotController() {
		return parkingLotController;
	}

	public ParkingSpaceController getParkingSpaceController() {
		return parkingSpaceController;
	}

	public PaymentController getPaymentController() {
		return paymentController;
	}

	public AuthController getAuthController() {
		return authController;
	}

	public SuperManagerController getSuperManagerController() {
		return superManagerController;
	}

	public ParkingSensorController getParkingSensorController() {
		return parkingSensorController;
	}
}