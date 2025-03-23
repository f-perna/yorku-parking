package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import models.booking.Booking;
import models.parkingLot.ParkingLot;
import models.payment.Payment;
import models.payment.Payment.PaymentType;
import models.payment.PaymentMethod;

public class PaymentCSVProcessor extends CSVHelper {
	private static final String PAYMENTS_CSV = DATA_DIRECTORY + "payments.csv";

	public static List<Payment> readPaymentsData() {
		List<Payment> payments = new ArrayList<>();
		Map<UUID, Booking> bookingMap = new HashMap<>();

		List<Booking> bookings = BookingCSVProcessor.readBookingData();
		for (Booking booking : bookings) {
			bookingMap.put(booking.getBookingID(), booking);
		}

		try (BufferedReader br = getFileReader(PAYMENTS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return payments; // Return empty list if file is empty
			}

			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != 6) {
					continue; // Skip invalid lines silently
				}

				try {
					UUID id = UUID.fromString(data[0]);
					UUID bookingID = UUID.fromString(data[1]);
					double amount = Double.parseDouble(data[2]);
					Payment.PaymentStatus status = Payment.PaymentStatus.valueOf(data[3]);
					PaymentMethod paymentMethod = Payment.generateMethod(data[4]);
					PaymentType paymentType = Payment.PaymentType.valueOf(data[5]);

					Booking booking = bookingMap.get(bookingID);

					Payment newPayment = new Payment(id, booking, amount, paymentMethod, status, paymentType);
					payments.add(newPayment);
				} catch (Exception e) {
					// Skip invalid entries silently
					continue;
				}
			}
		} catch (IOException e) {
			logError("Could not read payment data completely: " + e.getMessage());
		}
		return payments;
	}

	public static void setPaymentData(List<Payment> payments) {
		try (BufferedWriter bw = getFileWriter(PAYMENTS_CSV)) {
			// Write header
			bw.write("id,bookingID,amount,status,method,type");
			bw.newLine();

			for (Payment payment : payments) {
				String line = String.join(CSV_DELIMITER, payment.getPaymentID().toString(), payment.getBooking().getBookingID().toString(),
						Double.toString(payment.getAmount()), payment.getStatus().toString(),
						payment.getMethod().toString(), payment.getPaymentType().toString());
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			logError("Error writing payment data: " + e.getMessage());
		}
	}
}