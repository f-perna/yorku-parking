package services;

import models.booking.BookingModel;
import models.client.ClientModel;
import models.parkingLot.ParkingLotModel;
import models.parkingSpace.ParkingSpaceModel;
import models.payment.PaymentModel;
import services.impl.BookingServiceImpl;
import services.impl.ClientServiceImpl;
import services.impl.ParkingLotServiceImpl;
import services.impl.ParkingSpaceServiceImpl;
import services.impl.PaymentServiceImpl;

public class ServiceFactory {
	private static ServiceFactory instance;

	private BookingService bookingService;
	private ClientService clientService;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private PaymentService paymentService;

	private ServiceFactory() {
		BookingModel bookingModel = new BookingModel();
		ClientModel clientModel = new ClientModel();
		ParkingLotModel parkingLotModel = new ParkingLotModel();
		ParkingSpaceModel parkingSpaceModel = new ParkingSpaceModel();
		PaymentModel paymentModel = new PaymentModel();

		this.bookingService = new BookingServiceImpl(bookingModel, parkingSpaceModel);
		this.clientService = new ClientServiceImpl(clientModel);
		this.parkingLotService = new ParkingLotServiceImpl(parkingLotModel);
		this.parkingSpaceService = new ParkingSpaceServiceImpl(parkingSpaceModel);

		this.paymentService = new PaymentServiceImpl(paymentModel, this.bookingService);
	}

	public static synchronized ServiceFactory getInstance() {
		if (instance == null) {
			instance = new ServiceFactory();
		}
		return instance;
	}

	public BookingService getBookingService() {
		return bookingService;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public ParkingLotService getParkingLotService() {
		return parkingLotService;
	}

	public ParkingSpaceService getParkingSpaceService() {
		return parkingSpaceService;
	}

	public PaymentService getPaymentService() {
		return paymentService;
	}
}