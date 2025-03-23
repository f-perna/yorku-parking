package services;

import repositories.BookingRepository;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSpaceRepository;
import repositories.PaymentRepository;

public class ServiceFactory {
	private static ServiceFactory instance;

	private BookingService bookingService;
	private ClientService clientService;
	private ManagerService managerService;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private PaymentService paymentService;

	private ServiceFactory() {
		// Create models
		BookingRepository bookingModel = new BookingRepository();
		ClientRepository clientModel = new ClientRepository();
		ManagerRepository managerModel = new ManagerRepository();
		ParkingLotRepository parkingLotModel = new ParkingLotRepository();
		ParkingSpaceRepository parkingSpaceModel = new ParkingSpaceRepository();
		PaymentRepository paymentModel = new PaymentRepository();

		// Create services
		this.bookingService = new BookingService(bookingModel, parkingSpaceModel);
		this.clientService = new ClientService(clientModel);
		this.managerService = new ManagerService(managerModel);
		this.parkingLotService = new ParkingLotService(parkingLotModel);
		this.parkingSpaceService = new ParkingSpaceService(parkingSpaceModel);
		this.paymentService = new PaymentService(paymentModel, this.bookingService);

		// Set dependencies between services after all are created
		this.parkingLotService.setDependencies(this.parkingSpaceService);
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