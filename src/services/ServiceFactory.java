package services;

import repositories.BookingRepository;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSpaceRepository;
import repositories.PaymentRepository;
import repositories.RepositoryFactory;

public class ServiceFactory {
	private static ServiceFactory instance;

	private BookingService bookingService;
	private ClientService clientService;
	private ManagerService managerService;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private PaymentService paymentService;
	private SuperManagerService superManagerService;

	private ServiceFactory() {
		initializeServices();
	}

	private void initializeServices() {
		// Get repositories from a repository factory
		RepositoryFactory repoFactory = RepositoryFactory.getInstance();
		BookingRepository bookingRepository = repoFactory.getBookingRepository();
		ClientRepository clientRepository = repoFactory.getClientRepository();
		ManagerRepository managerRepository = repoFactory.getManagerRepository();
		ParkingLotRepository parkingLotRepository = repoFactory.getParkingLotRepository();
		ParkingSpaceRepository parkingSpaceRepository = repoFactory.getParkingSpaceRepository();
		PaymentRepository paymentRepository = repoFactory.getPaymentRepository();

		// Create services in the right order to handle dependencies
		this.clientService = new ClientService(clientRepository);
		this.managerService = new ManagerService(managerRepository);
		this.superManagerService = new SuperManagerService(managerRepository);
		this.parkingSpaceService = new ParkingSpaceService(parkingSpaceRepository);
		this.parkingLotService = new ParkingLotService(parkingLotRepository);

		// Set dependencies for services that need them
		this.parkingLotService.setDependencies(this.parkingSpaceService);

		// Create services that depend on other services
		this.bookingService = new BookingService(bookingRepository, parkingSpaceRepository);
		this.paymentService = new PaymentService(paymentRepository, this.bookingService);
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

	public SuperManagerService getSuperManagerService() {
		return superManagerService;
	}
}