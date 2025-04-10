package csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import models.ParkingSystemException;
import models.booking.Booking;
import models.payment.Payment;
import models.payment.Payment.PaymentType;
import models.payment.PaymentMethod;

public class PaymentCSVProcessor extends CSVHelper {
	private static final String PAYMENTS_CSV = DATA_DIRECTORY + "payments.csv";
	private static final int EXPECTED_FIELDS = 6;

	public static List<Payment> readPaymentData() {
		List<Payment> payments = new ArrayList<>();
		Map<UUID, Booking> bookingMap = new HashMap<>();

		// First load all bookings
		try {
			List<Booking> bookings = BookingCSVProcessor.readBookingData();
			for (Booking booking : bookings) {
				bookingMap.put(booking.getBookingID(), booking);
			}
		} catch (Exception e) {
			logError("Failed to load booking data: " + e.getMessage());
			return payments;
		}

		try (BufferedReader br = getFileReader(PAYMENTS_CSV)) {
			String line = br.readLine(); // Skip header
			if (line == null) {
				return payments; // Return empty list if file is empty
			}

			int lineNumber = 2; // Start from 2 since we skipped header
			while ((line = br.readLine()) != null) {
				String[] data = line.split(CSV_DELIMITER);
				if (data.length != EXPECTED_FIELDS) {
					logError(String.format("Invalid payment data format at line %d (expected %d fields): %s",
							lineNumber, EXPECTED_FIELDS, line));
					lineNumber++;
					continue;
				}

				try {
					UUID id = UUID.fromString(data[0]);
					UUID bookingID = UUID.fromString(data[1]);
					double amount = Double.parseDouble(data[2]);
					Payment.PaymentStatus status = Payment.PaymentStatus.valueOf(data[3]);
					PaymentMethod paymentMethod = Payment.generateMethod(data[4]);
					PaymentType paymentType = PaymentType.valueOf(data[5]);

					Booking booking = bookingMap.get(bookingID);
					if (booking == null) {
						logError(String.format("Payment %s references non-existent booking %s at line %d", id,
								bookingID, lineNumber));
						continue;
					}

					Payment newPayment = new Payment(id, booking, amount, paymentMethod, status, paymentType);
					payments.add(newPayment);
				} catch (IllegalArgumentException e) {
					logError(String.format("Error parsing payment data at line %d: %s", lineNumber, e.getMessage()));
				} catch (ParkingSystemException e) {
					logError(String.format("Validation error at line %d: %s", lineNumber, e.getMessage()));
				} catch (Exception e) {
					logError(String.format("Unexpected error at line %d: %s", lineNumber, e.getMessage()));
				}
				lineNumber++;
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
				try {
					if (payment == null) {
						logError("Skipping null payment");
						continue;
					}

					if (payment.getBooking() == null) {
						logError("Skipping payment " + payment.getPaymentID() + " with null booking");
						continue;
					}

					String line = String.join(CSV_DELIMITER, payment.getPaymentID().toString(),
							payment.getBooking().getBookingID().toString(), Double.toString(payment.getAmount()),
							payment.getStatus().toString(), payment.getMethod().toString(),
							payment.getPaymentType().toString());

					bw.write(line);
					bw.newLine();
				} catch (Exception e) {
					logError("Error writing payment data for payment "
							+ (payment != null ? payment.getPaymentID() : "null") + ": " + e.getMessage());
				}
			}
		} catch (IOException e) {
			logError("Error writing payment data: " + e.getMessage());
		}
	}
}