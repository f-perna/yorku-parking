package controllers;

import java.util.UUID;
import models.auth.AuthenticationState;
import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;
import services.BookingService;
import services.PaymentService;

public class PaymentController {
	private PaymentService paymentService;
	private BookingService bookingService;
	private AuthenticationState authState;

	public PaymentController(PaymentService paymentService, BookingService bookingService) {
		this.paymentService = paymentService;
		this.bookingService = bookingService;
		this.authState = AuthenticationState.getInstance();
	}

	public Payment processPayment(Booking booking, String paymentMethod) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to process payment");
		}

		return paymentService.processPayment(booking, paymentMethod, client);
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

	public void completeBooking(Booking booking) {
		Client client = authState.getLoggedInClient();
		if (client == null) {
			throw new IllegalStateException("User must be logged in to complete a booking");
		}

		if (!booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot complete another user's booking");
		}

		try {
			System.out.println("PaymentController: Completing booking " + booking.getBookingId());

			bookingService.completeBooking(booking);

			System.out.println("PaymentController: Booking completed successfully");
		} catch (Exception e) {
			System.err.println("PaymentController: Error completing booking: " + e.getMessage());
			e.printStackTrace();
			throw e;
		}
	}

	public Payment getPaymentById(UUID paymentId) {
		return paymentService.getPaymentById(paymentId);
	}
}