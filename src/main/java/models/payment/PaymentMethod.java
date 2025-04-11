package models.payment;

// PaymentMethod Interface (Strategy Pattern)
public interface PaymentMethod {
	boolean processPayment(double amount);
}

// Strategies for each Payment Method

class Debit implements PaymentMethod {
	@Override
	public boolean processPayment(double amount) {
		// Simulate debit payment
		System.out.println("Processing debit payment of " + amount);
		return true;
	}

	@Override
	public String toString() {
		return "Debit";
	}
}

class Credit implements PaymentMethod {
	@Override
	public boolean processPayment(double amount) {
		// Simulate credit payment
		System.out.println("Processing credit payment of " + amount);
		return true;
	}

	@Override
	public String toString() {
		return "Credit";
	}
}

class Mobile implements PaymentMethod {
	@Override
	public boolean processPayment(double amount) {
		// Simulate mobile payment
		System.out.println("Processing mobile payment of " + amount);
		return true;
	}

	@Override
	public String toString() {
		return "Mobile";
	}
}

class Cash implements PaymentMethod {
	@Override
	public boolean processPayment(double amount) {
		// Simulate cash payment
		System.out.println("Processing cash payment of " + amount);
		return true;
	}

	@Override
	public String toString() {
		return "Cash";
	}
}