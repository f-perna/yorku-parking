package controllers;

import services.BookingService;
import services.ClientService;
import services.ParkingLotService;
import services.ParkingSpaceService;
import services.PaymentService;
import services.ServiceFactory;

public class ControllerFactory {

	private static ControllerFactory instance;

	private BookingController bookingController;
	private ClientController clientController;
	private ParkingLotController parkingLotController;
	private ParkingSpaceController parkingSpaceController;
	private PaymentController paymentController;

	private ControllerFactory() {
		ServiceFactory serviceFactory = ServiceFactory.getInstance();

		BookingService bookingService = serviceFactory.getBookingService();
		ClientService clientService = serviceFactory.getClientService();
		ParkingLotService parkingLotService = serviceFactory.getParkingLotService();
		ParkingSpaceService parkingSpaceService = serviceFactory.getParkingSpaceService();
		PaymentService paymentService = serviceFactory.getPaymentService();

		this.bookingController = new BookingController(bookingService);
		this.clientController = new ClientController(clientService);
		this.parkingLotController = new ParkingLotController(parkingLotService);
		this.parkingSpaceController = new ParkingSpaceController(parkingSpaceService);
		this.paymentController = new PaymentController(paymentService, bookingService);
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

	public ParkingLotController getParkingLotController() {
		return parkingLotController;
	}

	public ParkingSpaceController getParkingSpaceController() {
		return parkingSpaceController;
	}

	public PaymentController getPaymentController() {
		return paymentController;
	}

}