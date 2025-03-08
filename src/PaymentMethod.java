// PaymentMethod Interface (Strategy Pattern)
public interface PaymentMethod {
        boolean processPayment(double amount);
}

// Strategies for each Payment Method

class Debit implements PaymentMethod {
        @Override
        public boolean processPayment(double amount) {
                //Simulate debit payment
                System.out.println("Processing debit payment of " + amount);
                return true;
        }
}

class Credit implements PaymentMethod {
        @Override
        public boolean processPayment(double amount) {
                //Simulate credit payment
                System.out.println("Processing credit payment of " + amount);
                return true;
        }
}

class Mobile implements PaymentMethod {
        @Override
        public boolean processPayment(double amount) {
                //Simulate mobile payment
                System.out.println("Processing mobile payment of " + amount);
                return true;
        }
}

class Cash implements PaymentMethod {
        @Override
        public boolean processPayment(double amount) {
                //Simulate cash payment
                System.out.println("Processing cash payment of " + amount);
                return true;
        }
}
