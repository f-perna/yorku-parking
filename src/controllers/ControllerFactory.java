package controllers;

import services.BookingService;
import services.ClientService;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSpaceService;
import services.PaymentService;
import services.ServiceFactory;
import services.SuperManagerService;

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

		// Create controllers with their required dependencies
		this.bookingController = new BookingController(bookingService);
		this.clientController = new ClientController(clientService);
		this.parkingLotController = new ParkingLotController(parkingLotService);
		this.parkingSpaceController = new ParkingSpaceController(parkingSpaceService);
		this.paymentController = new PaymentController(paymentService);

		// Create controllers that depend on multiple services
		this.managerController = new ManagerController(managerService, parkingLotService, parkingSpaceService,
				clientService);
		this.authController = new AuthController(clientService, managerService, superManagerService);
		this.superManagerController = new SuperManagerController(superManagerService);
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
}