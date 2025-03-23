package models.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.PaymentCSVProcessor;
import models.booking.Booking;
import models.payment.Payment.PaymentType;

public class PaymentModel {
	private List<Payment> payments;

	public PaymentModel() {
		this.payments = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		payments = PaymentCSVProcessor.readPaymentsData();
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
		Payment newPayment = new Payment(booking.getDeposit(), booking, Payment.generateMethod(paymentMethod),
				PaymentType.DEPOSIT);
		payments.add(newPayment);
		savePayments();
		return newPayment;
	}

	public Payment createFinalPayment(double finalAmount, Booking booking, String paymentMethod) {
		Payment newPayment = new Payment(finalAmount, booking, Payment.generateMethod(paymentMethod),
				PaymentType.FINAL);
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

	public Payment refundDepositPayment(Booking booking) {
		Payment depositPayment = findDepositPayment(booking);
		System.out.println(depositPayment);
		if (depositPayment != null) {
			boolean refunded = depositPayment.refundDeposit();
			if (!refunded) {
				throw new IllegalArgumentException("Could not refund deposit");
			} else {
				// Save the refund status
				savePayments();
				return depositPayment;
			}
		} else {
			throw new IllegalArgumentException("Could not find deposit payment");
		}

	}

	public Payment findDepositPayment(Booking booking) {
		for (Payment payment : payments) {
			if (payment.getBooking().equals(booking) && payment.getPaymentType() == PaymentType.DEPOSIT
					&& payment.getStatus() == Payment.PaymentStatus.PAID) {
				return payment;
			}
		}
		return null;
	}

	public List<Payment> getAllPayments() {
		return new ArrayList<>(payments);
	}
}