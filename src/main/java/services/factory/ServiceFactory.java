package services.factory;

import repositories.BookingRepository;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSpaceRepository;
import repositories.PaymentRepository;
import repositories.factory.RepositoryFactory;
import services.BookingService;
import services.ClientService;
import services.ManagerService;
import services.ParkingLotService;
import services.ParkingSensorService;
import services.ParkingSpaceService;
import services.PaymentService;
import services.SuperManagerService;
import repositories.ParkingSensorRepository;

public class ServiceFactory {
	private static ServiceFactory instance;

	private BookingService bookingService;
	private ClientService clientService;
	private ManagerService managerService;
	private ParkingLotService parkingLotService;
	private ParkingSpaceService parkingSpaceService;
	private PaymentService paymentService;
	private SuperManagerService superManagerService;
	private ParkingSensorService parkingSensorService;

	private ServiceFactory() {
		initializeServices();
	}

	private void initializeServices() {
		RepositoryFactory repoFactory = RepositoryFactory.getInstance();
		BookingRepository bookingRepository = repoFactory.getBookingRepository();
		ClientRepository clientRepository = repoFactory.getClientRepository();
		ManagerRepository managerRepository = repoFactory.getManagerRepository();
		ParkingLotRepository parkingLotRepository = repoFactory.getParkingLotRepository();
		ParkingSpaceRepository parkingSpaceRepository = repoFactory.getParkingSpaceRepository();
		ParkingSensorRepository parkingSensorRepository = repoFactory.getParkingSensorRepository();
		PaymentRepository paymentRepository = repoFactory.getPaymentRepository();

		this.clientService = new ClientService(clientRepository);
		this.managerService = new ManagerService(managerRepository);
		this.superManagerService = new SuperManagerService();
		this.parkingSpaceService = new ParkingSpaceService(parkingSpaceRepository, parkingSensorRepository);
		this.parkingLotService = new ParkingLotService(parkingLotRepository);

		// Initialize ParkingSensorService before BookingService since BookingService
		// now depends on it
		this.parkingSensorService = new ParkingSensorService(bookingRepository, parkingSpaceRepository,
				parkingSensorRepository);

		// Update BookingService to include ParkingSensorService
		this.bookingService = new BookingService(bookingRepository, parkingSpaceRepository, parkingSensorService);
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

	public ParkingSensorService getParkingSensorService() {
		return parkingSensorService;
	}
}