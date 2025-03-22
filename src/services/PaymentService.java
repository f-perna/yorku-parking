package services;

import java.util.UUID;

import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;

public interface PaymentService {

    Payment processPayment(Booking booking, String paymentMethod, Client client);

    Payment processFinalPayment(Booking booking, String paymentMethod, Client client);

    Payment getPaymentById(UUID paymentId);

    void savePayment(Payment payment);
}