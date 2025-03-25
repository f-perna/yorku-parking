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

/**
 * Service that automatically manages booking statuses based on time and events.
 * This service runs periodic checks to: 1. Mark no-shows for confirmed bookings
 * where the user didn't arrive 2. Auto-complete checked-in bookings when the
 * end time is reached 3. Handle expired bookings 4. Automatically check the
 * status of cars in parking spaces
 */
public class BookingStatusSchedulerService {
	private static BookingStatusSchedulerService instance;
	private Timer timer;
	private static final long CHECK_INTERVAL = 60 * 1000; // Check every minute

	private BookingRepository bookingRepository;
	private ParkingSpaceRepository parkingSpaceRepository;
	private PaymentService paymentService;
	private ParkingSensorService parkingSensorService;

	private BookingStatusSchedulerService() {
		timer = new Timer(true); // Run as daemon thread

		// Get repository and service instances
		this.bookingRepository = RepositoryFactory.getInstance().getBookingRepository();
		this.parkingSpaceRepository = RepositoryFactory.getInstance().getParkingSpaceRepository();
		this.paymentService = ServiceFactory.getInstance().getPaymentService();
		this.parkingSensorService = ServiceFactory.getInstance().getParkingSensorService();

		startScheduler();
	}

	public static synchronized BookingStatusSchedulerService getInstance() {
		if (instance == null) {
			instance = new BookingStatusSchedulerService();
		}
		return instance;
	}

	/**
	 * Start the scheduler to check booking statuses at regular intervals
	 */
	private void startScheduler() {
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				try {
					System.out
							.println("[BookingStatusScheduler] Running scheduled status check: " + LocalDateTime.now());

					// Run the various status checks
					checkForNoShows();
					checkForExpiredBookings();
					checkForOverstayedBookings();

				} catch (Exception e) {
					System.err.println("Error in booking status scheduler: " + e.getMessage());
					e.printStackTrace();
				}
			}
		}, 0, CHECK_INTERVAL); // Changed from CHECK_INTERVAL to 0 for the first delay
	}

	/**
	 * Check for no-shows in confirmed bookings
	 */
	private void checkForNoShows() {
		LocalDateTime now = LocalDateTime.now();

		// Get all confirmed bookings
		List<Booking> confirmedBookings = bookingRepository.getConfirmedBookings();

		for (Booking booking : confirmedBookings) {
			// If booking started more than 1 hour ago and car is not present, mark as
			// no-show
			if (booking.getStartTime().plusHours(1).isBefore(now)) {
				ParkingSpace space = booking.getParkingSpace();

				// Only mark as no-show if car is not present at the space
				if (!parkingSensorService.isCarPresentAtSpace(space)) {
					System.out.println(
							"[BookingStatusScheduler] Marking booking " + booking.getBookingID() + " as no-show");

					// Mark as no-show and free up the parking space
					bookingRepository.noShowBooking(booking);

					// Set the space status back to AVAILABLE
					parkingSpaceRepository.updateParkingSpaceStatus(space, ParkingSpace.ParkingSpaceStatus.AVAILABLE);
				}
			}
		}
	}

	/**
	 * Check for bookings that have ended and should be completed
	 */
	private void checkForExpiredBookings() {
		LocalDateTime now = LocalDateTime.now();
		List<Booking> checkedInBookings = bookingRepository.getBookingsByStatus(BookingStatus.CHECKED_IN);

		for (Booking booking : checkedInBookings) {
			// If the booking end time has passed
			if (booking.getEndTime().isBefore(now)) {
				ParkingSpace space = booking.getParkingSpace();

				if (parkingSensorService.isCarPresentAtSpace(space)) {
					// Car is still present after booking end time - mark as OVERSTAYED
					System.out.println("[BookingStatusScheduler] Booking " + booking.getBookingID()
							+ " has expired but car is still present. Marking as OVERSTAYED.");

					bookingRepository.markAsOverstayed(booking);
				} else {
					// Car is not present - mark as EXPIRED (not auto-complete)
					System.out.println("[BookingStatusScheduler] Booking " + booking.getBookingID()
							+ " has expired and car is not present. Marking as EXPIRED.");

					// Mark booking as EXPIRED instead of auto-completing it
					bookingRepository.markAsExpired(booking);

					// Set the space status back to AVAILABLE
					parkingSpaceRepository.updateParkingSpaceStatus(space, ParkingSpace.ParkingSpaceStatus.AVAILABLE);
				}
			}
		}
	}

	/**
	 * Check for overstayed bookings where the car has finally left This allows
	 * completing overstayed bookings once the car is gone
	 */
	private void checkForOverstayedBookings() {
		List<Booking> overstayedBookings = bookingRepository.getBookingsByStatus(BookingStatus.OVERSTAYED);

		for (Booking booking : overstayedBookings) {
			ParkingSpace space = booking.getParkingSpace();

			// If the car is no longer present, we can potentially auto-complete the booking
			if (!parkingSensorService.isCarPresentAtSpace(space)) {
				System.out.println("[BookingStatusScheduler] Car has left for overstayed booking "
						+ booking.getBookingID() + ". User must complete checkout manually.");

				// We don't auto-process payment for overstayed bookings
				// User needs to check out and pay manually
			}
		}
	}

	/**
	 * Stop the scheduler
	 */
	public void stop() {
		if (timer != null) {
			timer.cancel();
			timer = null;
		}
	}
}