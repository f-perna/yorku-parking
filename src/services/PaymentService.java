package services;

import java.util.List;
import java.util.UUID;

import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;
import models.payment.Payment.PaymentType;
import repositories.PaymentRepository;

public class PaymentService {
	private PaymentRepository paymentModel;
	private BookingService bookingService;

	public PaymentService(PaymentRepository paymentModel, BookingService bookingService) {
		this.paymentModel = paymentModel;
		this.bookingService = bookingService;
	}

	public Payment processDepositPayment(Booking booking, String paymentMethod, Client client) {
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

		// create payment
		Payment payment = paymentModel.createDepositPayment(booking, paymentMethod);

		// process payment
		paymentModel.processPayment(payment);

		// update booking
		if (payment.getStatus() == Payment.PaymentStatus.PAID) {
			bookingService.confirmBooking(booking, payment);
			return payment;
		} else {
			throw new IllegalStateException("Payment processing failed");
		}
	}

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

		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN) {
			throw new IllegalStateException("Can only process final payment for checked in bookings");
		}

		double finalAmount = booking.deductedPrice();

		Payment payment = paymentModel.createFinalPayment(finalAmount, booking, paymentMethod);

		// process payment
		paymentModel.processPayment(payment);

		// update booking
		if (payment.getStatus() == Payment.PaymentStatus.PAID) {
			bookingService.completeBooking(booking, payment);
			return payment;
		} else {
			throw new IllegalStateException("Payment processing failed");
		}
	}

	public Payment getPaymentById(UUID paymentID) {
		if (paymentID == null) {
			throw new IllegalArgumentException("Payment ID cannot be null");
		}
		return paymentModel.getPaymentByID(paymentID);
	}

	public List<Payment> getPaymentsForBooking(Booking booking) {
		if (booking == null) {
			throw new IllegalArgumentException("Booking cannot be null");
		}
		return paymentModel.getPaymentsForBooking(booking);
	}
}