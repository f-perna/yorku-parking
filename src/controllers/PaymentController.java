package controllers;

import java.util.UUID;
import java.util.List;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.auth.AuthenticationState;
import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;
import services.BookingService;
import services.PaymentService;

public class PaymentController {
	private PaymentService paymentService;
	private AuthenticationState authState;

	public PaymentController(PaymentService paymentService) {
		this.paymentService = paymentService;
		this.authState = AuthenticationState.getInstance();
	}

	public Payment processDepositPayment(Booking booking, String paymentMethod) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to process payment", ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot complete another user's booking", ErrorType.AUTHORIZATION);
		}

		return paymentService.processDepositPayment(booking, paymentMethod, client);
	}

	public Payment processFinalPayment(Booking booking, String paymentMethod) {
		// Allow payment processing for both CHECKED_IN and OVERSTAYED bookings
		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN &&
				booking.getStatus() != Booking.BookingStatus.OVERSTAYED
				&& booking.getStatus() != Booking.BookingStatus.EXPIRED) {
			throw new ParkingSystemException(
					"Can only process final payment for checked-in, overstayed or expired bookings");
		}

		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to process payment", ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot complete another user's booking", ErrorType.AUTHORIZATION);
		}

		return paymentService.processFinalPayment(booking, paymentMethod, client);
	}

	public Payment processRefundPayment(Booking booking, String paymentMethod) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to process refund", ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot process refund for another user's booking",
					ErrorType.AUTHORIZATION);
		}

		return paymentService.processRefundPayment(booking, paymentMethod, client);
	}

	public Payment getPaymentById(UUID paymentId) {
		return paymentService.getPaymentById(paymentId);
	}

	public List<Payment> getPaymentsForBooking(Booking booking) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new ParkingSystemException("User must be logged in to view payments", ErrorType.AUTHENTICATION);
		}

		if (!booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot view payments for another user's booking",
					ErrorType.AUTHORIZATION);
		}

		return paymentService.getPaymentsForBooking(booking);
	}
}