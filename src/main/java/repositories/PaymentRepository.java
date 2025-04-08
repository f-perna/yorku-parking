package repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import csv.PaymentCSVProcessor;
import models.booking.Booking;
import models.payment.Payment;
import models.payment.Payment.PaymentType;

public class PaymentRepository {
	private List<Payment> payments;

	public PaymentRepository() {
		this.payments = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		payments = PaymentCSVProcessor.readPaymentData();
	}

	private void savePayments() {
		PaymentCSVProcessor.setPaymentData(payments);
	}

	// test if it saves
	public void processPayment(Payment payment) {
		payment.processPayment();
		savePayments();
	}

	public Payment createDepositPayment(Booking booking, String paymentMethod) {
		if (booking == null) {
			throw new models.ParkingSystemException("Booking cannot be null",
					models.ParkingSystemException.ErrorType.VALIDATION);
		}

		// Validate booking ID to ensure it's properly set
		if (booking.getBookingID() == null) {
			throw new models.ParkingSystemException("Booking ID cannot be null",
					models.ParkingSystemException.ErrorType.VALIDATION);
		}

		Payment newPayment = new Payment(booking.getDeposit(), booking, Payment.generateMethod(paymentMethod),
				PaymentType.DEPOSIT);

		// Verify that the payment has a valid booking before saving
		if (newPayment.getBooking() == null) {
			throw new models.ParkingSystemException("Failed to associate booking with payment",
					models.ParkingSystemException.ErrorType.SYSTEM_ERROR);
		}

		payments.add(newPayment);
		savePayments();
		return newPayment;
	}

	public Payment createFinalPayment(double finalAmount, Booking booking, String paymentMethod) {
		if (booking == null) {
			throw new models.ParkingSystemException("Booking cannot be null",
					models.ParkingSystemException.ErrorType.VALIDATION);
		}

		// Validate booking ID to ensure it's properly set
		if (booking.getBookingID() == null) {
			throw new models.ParkingSystemException("Booking ID cannot be null",
					models.ParkingSystemException.ErrorType.VALIDATION);
		}

		Payment newPayment = new Payment(finalAmount, booking, Payment.generateMethod(paymentMethod),
				PaymentType.FINAL);

		// Verify that the payment has a valid booking before saving
		if (newPayment.getBooking() == null) {
			throw new models.ParkingSystemException("Failed to associate booking with payment",
					models.ParkingSystemException.ErrorType.SYSTEM_ERROR);
		}

		payments.add(newPayment);
		savePayments();
		return newPayment;
	}

	public Payment getPaymentByID(UUID paymentID) {
		for (Payment payment : payments) {
			if (payment.getPaymentID().equals(paymentID)) {
				return payment;
			}
		}
		return null;
	}

	public List<Payment> getAllPayments() {
		return new ArrayList<>(payments);
	}

	public List<Payment> getPaymentsForBooking(Booking booking) {
		List<Payment> bookingPayments = new ArrayList<>();
		for (Payment payment : payments) {
			if (payment.getBooking().equals(booking)) {
				bookingPayments.add(payment);
			}
		}
		return bookingPayments;
	}

	public Payment createRefundPayment(Booking booking, String paymentMethod) {
		if (booking == null) {
			throw new models.ParkingSystemException("Booking cannot be null",
					models.ParkingSystemException.ErrorType.VALIDATION);
		}

		// Validate booking ID to ensure it's properly set
		if (booking.getBookingID() == null) {
			throw new models.ParkingSystemException("Booking ID cannot be null",
					models.ParkingSystemException.ErrorType.VALIDATION);
		}

		// Create a refund payment with the deposit amount (negative amount signifies
		// refund)
		Payment refundPayment = new Payment(-booking.getDeposit(), booking, Payment.generateMethod(paymentMethod),
				PaymentType.REFUND);

		// Verify that the payment has a valid booking before saving
		if (refundPayment.getBooking() == null) {
			throw new models.ParkingSystemException("Failed to associate booking with refund payment",
					models.ParkingSystemException.ErrorType.SYSTEM_ERROR);
		}

		payments.add(refundPayment);
		savePayments();
		return refundPayment;
	}
}