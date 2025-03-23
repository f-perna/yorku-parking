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
}