package models.payment;

import java.util.UUID;

public class Payment {
	private UUID paymentID;
	private double amount;
  	public PaymentStatus status;
	public PaymentMethod paymentMethod;

	public static enum PaymentStatus {
		PENDING, COMPLETED, FAILED, REFUNDED;
	}
	
	public Payment(UUID paymentID, double amount, PaymentMethod method, PaymentStatus status) {
		this.paymentID = paymentID;
		this.amount = amount;
		this.paymentMethod = method;
		this.status = status;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	// process payment using the selected strategy
	public boolean processPayment() {
		if (status == PaymentStatus.PENDING) {
			if (paymentMethod.processPayment(amount)) {
				// payment process
				status = PaymentStatus.COMPLETED;
				System.out.println("Payment processed successfully.");
				return true;
			}
		}
		return false;	
	}

  	public void refundDeposit(){
  		if (status == PaymentStatus.COMPLETED) {
			status = PaymentStatus.REFUNDED;
			System.out.println("Deposit refunded.");
		}
  	}

	public PaymentStatus getStatus() {
		return status;
	}

	public UUID getPaymentID() {
		return paymentID;
	}

	public double getAmount() {
		return amount;
	}

	public PaymentMethod getMethod() {
		return paymentMethod;
	}
	
	public static PaymentMethod generateMethod(String method) {
		if (method.equals("Debit")) {
			return new Debit();
		} else if (method.equals("Credit")) {
			return new Credit();
		} else if (method.equals("Mobile")) {
			return new Mobile();
		} else if (method.equals("Cash")) {
			return new Cash();
		} else {
			return null;
		}
	}
}
