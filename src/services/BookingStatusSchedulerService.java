package services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import controllers.ParkingSensorController;
import controllers.factory.ControllerFactory;
import models.booking.Booking;
import models.booking.Booking.BookingStatus;
import models.parkingSpace.ParkingSpace;
import repositories.BookingRepository;
import repositories.ParkingSpaceRepository;
import repositories.factory.RepositoryFactory;
import services.factory.ServiceFactory;

public class BookingStatusSchedulerService {
	private static BookingStatusSchedulerService instance;
	private Timer timer;
	private static final long CHECK_INTERVAL = 60 * 1000; // Check every minute

	private BookingRepository bookingRepository;
	private ParkingSpaceRepository parkingSpaceRepository;
	private ParkingSensorService parkingSensorService;

	private BookingStatusSchedulerService() {
		timer = new Timer(true); // Run as daemon thread

		this.bookingRepository = RepositoryFactory.getInstance().getBookingRepository();
		this.parkingSpaceRepository = RepositoryFactory.getInstance().getParkingSpaceRepository();
		this.parkingSensorService = ServiceFactory.getInstance().getParkingSensorService();

		startScheduler();
	}

	public static synchronized BookingStatusSchedulerService getInstance() {
		if (instance == null) {
			instance = new BookingStatusSchedulerService();
		}
		return instance;
	}

	private void startScheduler() {
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				try {
					System.out
							.println("[BookingStatusScheduler] Running scheduled status check: " + LocalDateTime.now());

					checkForNoShows();
					checkForExpiredBookings();
					checkForOverstayedBookings();
					checkForEarlyArrivalsToCheckIn();

				} catch (Exception e) {
					System.err.println("Error in booking status scheduler: " + e.getMessage());
					e.printStackTrace();
				}
			}
		}, 0, CHECK_INTERVAL);
	}

	private void checkForNoShows() {
		LocalDateTime now = LocalDateTime.now();

		List<Booking> confirmedBookings = bookingRepository.getConfirmedBookings();

		for (Booking booking : confirmedBookings) {
			if (booking.getStartTime().plusHours(1).isBefore(now)) {
				ParkingSpace space = booking.getParkingSpace();

				if (!parkingSensorService.isCarPresentAtSpace(space)) {
					System.out.println(
							"[BookingStatusScheduler] Marking booking " + booking.getBookingID() + " as no-show");

					bookingRepository.noShowBooking(booking);

					parkingSpaceRepository.updateParkingSpaceStatus(space, ParkingSpace.ParkingSpaceStatus.AVAILABLE);
				}
			}
		}
	}

	private void checkForExpiredBookings() {
		LocalDateTime now = LocalDateTime.now();
		List<Booking> checkedInBookings = bookingRepository.getBookingsByStatus(BookingStatus.CHECKED_IN);

		for (Booking booking : checkedInBookings) {
			if (booking.getEndTime().isBefore(now)) {
				ParkingSpace space = booking.getParkingSpace();

				if (parkingSensorService.isCarPresentAtSpace(space)) {
					System.out.println("[BookingStatusScheduler] Booking " + booking.getBookingID()
							+ " has expired but car is still present. Marking as OVERSTAYED.");

					bookingRepository.markAsOverstayed(booking);
				} else {
					System.out.println("[BookingStatusScheduler] Booking " + booking.getBookingID()
							+ " has expired and car is not present. Marking as EXPIRED.");

					bookingRepository.markAsExpired(booking);
					parkingSpaceRepository.updateParkingSpaceStatus(space, ParkingSpace.ParkingSpaceStatus.AVAILABLE);
				}
			}
		}
	}

	private void checkForOverstayedBookings() {
		List<Booking> overstayedBookings = bookingRepository.getBookingsByStatus(BookingStatus.OVERSTAYED);

		for (Booking booking : overstayedBookings) {
			ParkingSpace space = booking.getParkingSpace();

			if (!parkingSensorService.isCarPresentAtSpace(space)) {
				System.out.println("[BookingStatusScheduler] Car has left for overstayed booking "
						+ booking.getBookingID() + ". User must complete checkout manually.");
			}
		}
	}

	private void checkForEarlyArrivalsToCheckIn() {
		LocalDateTime now = LocalDateTime.now();
		List<Booking> confirmedBookings = bookingRepository.getConfirmedBookings();

		for (Booking booking : confirmedBookings) {
			// If booking start time has passed and we're not yet past 1 hour into the
			// booking
			if (booking.getStartTime().isBefore(now) && booking.getStartTime().plusHours(1).isAfter(now)) {
				ParkingSpace space = booking.getParkingSpace();

				if (parkingSensorService.isCarPresentAtSpace(space)) {
					String detectedPlate = parkingSensorService.getDetectedLicencePlate(space);

					// Verify this is the right car for this booking
					if (detectedPlate != null && detectedPlate.equals(booking.getLicencePlate())) {
						System.out.println("[BookingStatusScheduler] Checking in early arrival for booking: "
								+ booking.getBookingID());
						bookingRepository.checkInBooking(booking);
					}
				}
			}
		}
	}

	public void stop() {
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
	}
}