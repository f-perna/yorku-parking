package models.booking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.UUID;

import models.client.Client;
import models.parking.ParkingSpace;
import models.payment.Payment;

public class Booking {

	public static enum BookingStatus {
		PENDING, CONFIRMED, CANCELED, COMPLETED, NO_SHOW
	}

	private UUID bookingId;
	private ParkingSpace parkingSpace;
	private LocalDateTime startTime;
	private Client client;
	private LocalDateTime endTime;
	private double deposit = 0;
	private double finalPaymentAmount;
	private BookingStatus status;
	private Payment payment;

	public Booking(ParkingSpace parkingSpace, int durationAmount, Client client) {
		this.bookingId = UUID.randomUUID();
		this.client = client;
		this.parkingSpace = parkingSpace;
		this.status = BookingStatus.PENDING;
		this.startTime = LocalDateTime.now();
		this.endTime = this.startTime.plusHours(durationAmount);
		this.deposit = this.client.getRate();
		this.finalPaymentAmount = this.calculatePrice();
	}
	
	public Booking(UUID bookingId, Client client, ParkingSpace parkingSpace, BookingStatus status, LocalDateTime startTime, LocalDateTime endTime, double deposit, double finalAmount, Payment payment) {
		this.bookingId = UUID.randomUUID();
		this.client = client;
		this.parkingSpace = parkingSpace;
		this.status = BookingStatus.PENDING;
		this.startTime = startTime;
		this.endTime = endTime;
		this.deposit = deposit;
		this.finalPaymentAmount = this.calculatePrice();
		this.payment = payment;
	}
	
	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public void confirmBooking() {
		this.status = BookingStatus.CONFIRMED;
		System.out.println("Booking " + bookingId + " Confirmed.");
	}

	public void cancelBooking() {
		this.status = BookingStatus.CANCELED;
		System.out.println("Booking " + bookingId + " Canceled.");
	}

	public void updateStatus(BookingStatus newStatus) {
		this.status = newStatus;
		System.out.println("Booking " + bookingId + " updated to " + newStatus);
	}

	public void extendBooking(LocalDateTime endTime) {
		if (this.endTime.isAfter(endTime)) {
			throw new IllegalArgumentException("New end time must be greater than the current end time.");
		}
		this.endTime = endTime;
	}

	public long calculateHours() {
		long minutes = Duration.between(startTime, endTime).toMinutes();
		return (minutes + 59) / 60;
	}

	public double calculatePrice() {
		return this.calculateHours() * this.client.getRate();
	}

	public void payDeposit() {
		this.deposit = this.client.getRate();
		this.status = BookingStatus.CONFIRMED;
		System.out.println("Deposit of $" + this.deposit + " paid for booking " + bookingId);
	}

	public void noShow() {
		if (this.status == BookingStatus.CONFIRMED) {
			this.status = BookingStatus.NO_SHOW;
//			this.depositRefunded = false;
			System.out.println("Client no-show for booking " + bookingId);
			System.out.println("Deposit of $" + deposit + " not refunded.");
		} else {
			System.out.println("Cannot mark as no-show for booking with status: " + status);
		}
	}

	public UUID getBookingId() {
		return bookingId;
	}
	
	public Client getClient() {
		return client;
	}
	
	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}
	
	public Payment getPayment() {
		return payment;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public double getDeposit() {
		return deposit;
	}

	public double getFinalPaymentAmount() {
		return finalPaymentAmount;
	}

	public BookingStatus getStatus() {
		return status;
	}
	
	public String getDuration() {
		DateTimeFormatter startFormatter = DateTimeFormatter.ofPattern("MMMM d: h:m a", Locale.US);
		DateTimeFormatter endFormatter = DateTimeFormatter.ofPattern("h:m a", Locale.US);
		return startTime.format(startFormatter) + " - " + endTime.format(endFormatter);
	}
	
	@Override
    public String toString() {
		DateTimeFormatter startFormatter = DateTimeFormatter.ofPattern("MMMM d: h:m a", Locale.US);
		DateTimeFormatter endFormatter = DateTimeFormatter.ofPattern("h:m a", Locale.US);
        return "Lot " + parkingSpace.getLot().getName() + " | " + startTime.format(startFormatter) + " - " + endTime.format(endFormatter);
    }
}
