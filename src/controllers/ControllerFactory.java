package controllers;

import models.auth.AuthenticationState;
import models.booking.BookingModel;
import models.client.ClientModel;
import models.parking.ParkingLotModel;
import models.parking.ParkingSpaceModel;
import models.payment.PaymentModel;

public class ControllerFactory {

	private static ControllerFactory instance;

	private AuthenticationState authState;

	private BookingController bookingController;
	private ClientController clientController;
	private ParkingLotController parkingLotController;
	private ParkingSpaceController parkingSpaceController;
	private PaymentController paymentController;

	private ControllerFactory() {
		this.authState = AuthenticationState.getInstance();

		BookingModel bookingModel = new BookingModel();
		ClientModel clientModel = new ClientModel();
		ParkingLotModel parkingLotModel = new ParkingLotModel();
		ParkingSpaceModel parkingSpaceModel = new ParkingSpaceModel();
		PaymentModel paymentModel = new PaymentModel();

		this.bookingController = new BookingController(bookingModel);
		this.clientController = new ClientController(clientModel);
		this.parkingLotController = new ParkingLotController(parkingLotModel);
		this.parkingSpaceController = new ParkingSpaceController(parkingSpaceModel);
		this.paymentController = new PaymentController(paymentModel, authState);
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