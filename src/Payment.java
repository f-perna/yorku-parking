public abstract class Payment {
	private int paymentID;
	private double amount;
  	public PaymentStatus status;
	public PaymentMethod method;

	public static enum PaymentStatus {
		PENDING, COMPLETED, FAILED, REFUNDED;
	}
	
	public Payment(int paymentID, double amount, PaymentMethod method) {
		this.paymentID = paymentID;
		this.amount = amount;
		this.method = method;
		this.status = PaymentStatus.PENDING;
	}

	public boolean processPayment() {
		if (status == PaymentStatus.PENDING) {
			// payment process
			status = PaymentStatus.COMPLETED;
			System.out.println("Payment processed successfully.");
			return true;
		}
		return false;	
	}

  	public void refundDeposit(){
  		if (status == PaymentStatus.COMPLETED) {
			status = PaymentStatus.REFUNDED;
			System.out,println("Deposit refunded.");
		}
  	}

  	public void setPaymentMethod(PaymentMethod method) {
		this.method = method;
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
		return method;
	}
}
