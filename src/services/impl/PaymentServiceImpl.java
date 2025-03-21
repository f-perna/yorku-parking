package services.impl;

import java.util.UUID;

import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;
import models.payment.PaymentModel;
import services.BookingService;
import services.PaymentService;

public class PaymentServiceImpl implements PaymentService {
	private PaymentModel paymentModel;
	private BookingService bookingService;

	public PaymentServiceImpl(PaymentModel paymentModel, BookingService bookingService) {
		this.paymentModel = paymentModel;
		this.bookingService = bookingService;
	}

	@Override
	public Payment processPayment(Booking booking, String paymentMethod, Client client) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}
		if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
			throw new IllegalArgumentException("Payment method must be specified");
		}

		if (client == null || !booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot process payment for another user's booking");
		}

		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new IllegalStateException("Can only process payment for pending bookings");
		}

		double amount = booking.getDeposit();

		Payment payment = paymentModel.createPayment(amount, paymentMethod, booking);

		payment.processPayment();

		if (payment.getStatus() == Payment.PaymentStatus.COMPLETED) {
			bookingService.confirmBooking(booking);

			bookingService.saveBooking(booking);
		} else {
			throw new IllegalStateException("Payment processing failed");
		}

		return payment;
	}

	@Override
	public Payment processFinalPayment(Booking booking, String paymentMethod, Client client) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}
		if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
			throw new IllegalArgumentException("Payment method must be specified");
		}

		if (client == null || !booking.getClient().equals(client)) {
			throw new IllegalStateException("Cannot process payment for another user's booking");
		}

		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			throw new IllegalStateException("Can only process final payment for confirmed bookings");
		}

		double finalAmount = booking.calculatePrice() - booking.getDeposit();

		if (finalAmount <= 0) {
			System.out.println("No additional payment needed - deposit covers the cost");
			bookingService.completeBooking(booking);
			return booking.getPayment();
		}

		Payment payment = paymentModel.createPayment(finalAmount, paymentMethod, booking);

		payment.processPayment();

		if (payment.getStatus() == Payment.PaymentStatus.COMPLETED) {
			bookingService.completeBooking(booking);
		} else {
			throw new IllegalStateException("Final payment processing failed");
		}

		return payment;
	}

	@Override
	public Payment getPaymentById(UUID paymentId) {
		if (paymentId == null) {
			throw new IllegalArgumentException("Payment ID cannot be null");
		}
		return paymentModel.getPaymentById(paymentId);
	}
}