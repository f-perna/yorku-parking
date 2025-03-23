package controllers;

import java.util.UUID;
import java.util.List;
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
			throw new IllegalStateException("User must be logged in to process payment");
		}

		if (!booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot complete another user's booking");
		}

		return paymentService.processDepositPayment(booking, paymentMethod, client);
	}

	public Payment processFinalPayment(Booking booking, String paymentMethod) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to process payment");
		}

		if (!booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot complete another user's booking");
		}

		return paymentService.processFinalPayment(booking, paymentMethod, client);
	}

	public Payment getPaymentById(UUID paymentId) {
		return paymentService.getPaymentById(paymentId);
	}

	public List<Payment> getPaymentsForBooking(Booking booking) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to view payments");
		}

		if (!booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot view payments for another user's booking");
		}

		return paymentService.getPaymentsForBooking(booking);
	}
}