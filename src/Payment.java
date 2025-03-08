public class Payment {
	private int paymentID;
	private double amount;
  	public PaymentStatus status;
	public PaymentMethod paymentMethod;

	public static enum PaymentStatus {
		PENDING, COMPLETED, FAILED, REFUNDED;
	}
	
	public Payment(int paymentID, double amount, PaymentMethod method) {
		this.paymentID = paymentID;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.status = PaymentStatus.PENDING;
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

	public int getPaymentID() {
		return paymentID;
	}

	public double getAmount() {
		return amount;
	}

	public PaymentMethod getMethod() {
		return paymentMethod;
	}
}
