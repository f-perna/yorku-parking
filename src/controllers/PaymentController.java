package controllers;

import java.util.UUID;
import models.auth.AuthenticationState;
import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;
import models.payment.PaymentModel;

public class PaymentController {
	private PaymentModel paymentModel;
	private AuthenticationState authState;

	public PaymentController(PaymentModel paymentModel, AuthenticationState authState) {
		this.paymentModel = paymentModel;
		this.authState = authState;
	}

	public void processPayment(Booking booking, String paymentMethod) {
		// Input validation
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}
		if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
			throw new IllegalArgumentException("Payment method must be specified");
		}

		// Verify booking belongs to logged-in user
		Client client = authState.getLoggedInClient();
		if (client == null || !booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot process payment for another user's booking");
		}

		// Verify booking status
		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new IllegalStateException("Can only process payment for pending bookings");
		}

		// Calculate final amount
		double amount = booking.calculatePrice();

		// Create payment
		paymentModel.createPayment(amount, paymentMethod, booking);
	}

	public Payment getPaymentById(UUID paymentId) {
		if (paymentId == null) {
			throw new IllegalArgumentException("Payment ID cannot be null");
		}
		return paymentModel.getPaymentById(paymentId);
	}
}