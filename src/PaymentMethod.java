public abstract class PaymentMethod {
        protected String paymentType;

        public abstract void setPaymentMethod(String method);

        public String getPaymentType() {
                return paymentType;
        }
}

class Debit extends PaymentMethod {
        @Override
        public void setPaymentMethod(String method) {
                this.paymentType = "Debit";
        }
}

class Credit extends PaymentMethod {
        @Override
        public void setPaymentMethod(String method) {
                this.paymentType = "Credit";
        }
}

class Mobile extends PaymentMethod {
        @Override
        public void setPaymentMethod(String method) {
                this.paymentType = "Mobile";
        }
}

class Cash extends PaymentMethod {
        @Override
        public void setPaymentMethod(String method) {
                this.paymentType = "Cash";
        }
}
