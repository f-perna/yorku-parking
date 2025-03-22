package services;

import models.booking.BookingModel;
import models.client.ClientModel;
import models.manager.ManagerModel;
import models.parkingLot.ParkingLotModel;
import models.parkingSpace.ParkingSpaceModel;
import models.payment.PaymentModel;

public class ServiceFactory {
	private static ServiceFactory instance;

	private BookingService bookingService;
	private ClientService clientService;
	private ManagerService managerService;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private PaymentService paymentService;

	private ServiceFactory() {
		BookingModel bookingModel = new BookingModel();
		ClientModel clientModel = new ClientModel();
		ManagerModel managerModel = new ManagerModel();
		ParkingLotModel parkingLotModel = new ParkingLotModel();
		ParkingSpaceModel parkingSpaceModel = new ParkingSpaceModel();
		PaymentModel paymentModel = new PaymentModel();

		this.bookingService = new BookingService(bookingModel, parkingSpaceModel);
		this.clientService = new ClientService(clientModel);
		this.managerService = new ManagerService(managerModel);
		this.parkingLotService = new ParkingLotService(parkingLotModel);
		this.parkingSpaceService = new ParkingSpaceService(parkingSpaceModel);

		this.paymentService = new PaymentService(paymentModel, this.bookingService);
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

	public ManagerService getManagerService() {
		return managerService;
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