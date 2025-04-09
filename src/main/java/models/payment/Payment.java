package models.payment;

import java.util.UUID;

import models.booking.Booking;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;

public class Payment {
	private UUID id;
	private Booking booking;
	private double amount;
	private PaymentStatus status = PaymentStatus.PENDING;
	private PaymentMethod method;
	private PaymentType type;

	public static enum PaymentStatus {
		PENDING, PAID, FAILED;
	}

	public static enum PaymentType {
		DEPOSIT, FINAL, REFUND
	}

	public Payment(double amount, Booking booking, PaymentMethod method, PaymentType type) {
		this.id = UUID.randomUUID();
		this.booking = booking;
		this.amount = amount;
		this.method = method;
		this.type = type;
	}

	// Constructor to retrieve data from payments.csv
	public Payment(UUID id, Booking booking, double amount, PaymentMethod method, PaymentStatus status,
			PaymentType type) {
		this.id = id;
		this.booking = booking;
		this.amount = amount;
		this.method = method;
		this.status = status;
		this.type = type;
	}

	public void setPaymentMethod(PaymentMethod method) {
		this.method = method;
	}

	public void setPaymentType(PaymentType type) {
		this.type = type;
	}

	public Booking getBooking() {
		return booking;
	}

	public PaymentType getPaymentType() {
		return type;
	}

	// process payment using the selected strategy
	public boolean processPayment() {
		if (simulatedSuccess()) {
			this.status = PaymentStatus.PAID;
			return true;
		} else {
			throw new ParkingSystemException("Payment failed. Please try a different payment method.",
					ErrorType.BUSINESS_LOGIC);
		}
	}

	private boolean simulatedSuccess() {
		if (this.status != PaymentStatus.PENDING) {
			throw new ParkingSystemException("Cannot process payment of a payment that is not pending.",
					ErrorType.BUSINESS_LOGIC);
		}
		if (method.processPayment(amount)) {
			// payment process
			return true;
		} else {
			return false;
		}
	}

	public PaymentStatus getStatus() {
		return status;
	}

	public UUID getPaymentID() {
		return id;
	}

	public double getAmount() {
		return amount;
	}

	public PaymentMethod getMethod() {
		return method;
	}

	public static PaymentMethod generateMethod(String method) {
		if (method == null) {
			return null;
		}

		// Normalize the method string
		String normalizedMethod = method.trim();

		// Handle common patterns in the method names
		if (normalizedMethod.contains("Debit") || normalizedMethod.equals("Debit Card")) {
			return new Debit();
		} else if (normalizedMethod.contains("Credit") || normalizedMethod.equals("Credit Card")) {
			return new Credit();
		} else if (normalizedMethod.contains("Mobile") || normalizedMethod.equals("Mobile Payment")) {
			return new Mobile();
		} else if (normalizedMethod.contains("Cash")) {
			return new Cash();
		} else {
			System.out.println("Warning: Unrecognized payment method: " + method);
			// Default to Credit as a fallback
			return new Credit();
		}
	}

	/**
	 * Gets the booking ID safely
	 * 
	 * @return The booking ID, or null if no booking is associated
	 */
	public UUID getBookingID() {
		return booking != null ? booking.getBookingID() : null;
	}
}