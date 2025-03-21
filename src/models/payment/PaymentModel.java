package models.payment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import main.CSVProcessor;
import models.booking.Booking;

public class PaymentModel {
	private List<Payment> payments;

	public PaymentModel() {
		this.payments = new ArrayList<>();
		loadFromDatabase();
	}

	private void loadFromDatabase() {
		payments = CSVProcessor.readPaymentsData();
	}

	public Payment createPayment(double amount, String paymentMethod, Booking booking) {
		Payment newPayment = new Payment(UUID.randomUUID(), amount, Payment.generateMethod(paymentMethod),
				Payment.PaymentStatus.PENDING);

		payments.add(newPayment);
		booking.setPayment(newPayment);

		// Save to database
		CSVProcessor.setPaymentData(payments);
		return newPayment;
	}

	public Payment getPaymentById(UUID paymentId) {
		for (Payment payment : payments) {
			if (payment.getPaymentID().equals(paymentId)) {
				return payment;
			}
		}
		return null;
	}

	public List<Payment> getAllPayments() {
		return new ArrayList<>(payments);
	}
}