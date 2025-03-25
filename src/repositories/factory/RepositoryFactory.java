package repositories.factory;

import repositories.BookingRepository;
import repositories.ClientRepository;
import repositories.ManagerRepository;
import repositories.ParkingLotRepository;
import repositories.ParkingSensorRepository;
import repositories.ParkingSpaceRepository;
import repositories.PaymentRepository;

public class RepositoryFactory {
	private static RepositoryFactory instance;

	private BookingRepository bookingRepository;
	private ClientRepository clientRepository;
	private ManagerRepository managerRepository;
	private ParkingLotRepository parkingLotRepository;
	private ParkingSpaceRepository parkingSpaceRepository;
	private ParkingSensorRepository parkingSensorRepository;
	private PaymentRepository paymentRepository;

	private RepositoryFactory() {
		this.bookingRepository = new BookingRepository();
		this.clientRepository = new ClientRepository();
		this.managerRepository = new ManagerRepository();
		this.parkingLotRepository = new ParkingLotRepository();
		this.parkingSpaceRepository = new ParkingSpaceRepository();
		this.parkingSensorRepository = new ParkingSensorRepository();
		this.paymentRepository = new PaymentRepository();
	}

	public static synchronized RepositoryFactory getInstance() {
		if (instance == null) {
			instance = new RepositoryFactory();
		}
		return instance;
	}

	public BookingRepository getBookingRepository() {
		return bookingRepository;
	}

	public ClientRepository getClientRepository() {
		return clientRepository;
	}

	public ManagerRepository getManagerRepository() {
		return managerRepository;
	}

	public ParkingLotRepository getParkingLotRepository() {
		return parkingLotRepository;
	}

	public ParkingSpaceRepository getParkingSpaceRepository() {
		return parkingSpaceRepository;
	}

	public ParkingSensorRepository getParkingSensorRepository() {
		return parkingSensorRepository;
	}

	public PaymentRepository getPaymentRepository() {
		return paymentRepository;
	}
}