package services;

import java.util.List;
import java.util.UUID;

import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;
import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;
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
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
			throw new ParkingSystemException("Payment method must be specified", ErrorType.VALIDATION);
		}

		if (client == null || !booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot process payment for another user's booking",
					ErrorType.AUTHORIZATION);
		}

		if (booking.getStatus() != Booking.BookingStatus.PENDING) {
			throw new ParkingSystemException("Can only process payment for pending bookings", ErrorType.BUSINESS_LOGIC);
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
			throw new ParkingSystemException("Payment processing failed", ErrorType.BUSINESS_LOGIC);
		}
	}

	public Payment processFinalPayment(Booking booking, String paymentMethod, Client client) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
			throw new ParkingSystemException("Payment method must be specified", ErrorType.VALIDATION);
		}

		if (client == null || !booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot process payment for another user's booking",
					ErrorType.AUTHORIZATION);
		}

		if (booking.getStatus() != Booking.BookingStatus.CHECKED_IN &&
				booking.getStatus() != Booking.BookingStatus.OVERSTAYED
				&& booking.getStatus() != Booking.BookingStatus.EXPIRED) {
			throw new ParkingSystemException(
					"Can only process final payment for checked-in, overstayed or expired bookings");
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
			throw new ParkingSystemException("Payment processing failed", ErrorType.BUSINESS_LOGIC);
		}
	}

	public Payment getPaymentById(UUID paymentID) {
		if (paymentID == null) {
			throw new ParkingSystemException("Payment ID cannot be null", ErrorType.VALIDATION);
		}
		return paymentModel.getPaymentByID(paymentID);
	}

	public List<Payment> getPaymentsForBooking(Booking booking) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		return paymentModel.getPaymentsForBooking(booking);
	}

	public Payment processRefundPayment(Booking booking, String paymentMethod, Client client) {
		if (booking == null) {
			throw new ParkingSystemException("Booking cannot be null", ErrorType.VALIDATION);
		}
		if (paymentMethod == null || paymentMethod.trim().isEmpty()) {
			throw new ParkingSystemException("Payment method must be specified", ErrorType.VALIDATION);
		}

		if (client == null || !booking.getClient().equals(client)) {
			throw new ParkingSystemException("Cannot process refund for another user's booking",
					ErrorType.AUTHORIZATION);
		}

		if (booking.getStatus() != Booking.BookingStatus.CANCELED) {
			throw new ParkingSystemException("Can only process refund for canceled bookings", ErrorType.BUSINESS_LOGIC);
		}

		// create refund payment
		Payment refundPayment = paymentModel.createRefundPayment(booking, paymentMethod);

		// process payment (refund)
		paymentModel.processPayment(refundPayment);

		if (refundPayment.getStatus() == Payment.PaymentStatus.PAID) {
			return refundPayment;
		} else {
			throw new ParkingSystemException("Refund processing failed", ErrorType.BUSINESS_LOGIC);
		}
	}
}