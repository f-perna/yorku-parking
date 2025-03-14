package booking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;
import client.Client;

public class Booking {

	public static enum BookingStatus {
		PENDING, CONFIRMED, CANCELED, COMPLETED, NO_SHOW
	}

	private UUID bookingId;
	private int parkingSpaceId;
	private LocalDateTime startTime;
	private Client client;
	private LocalDateTime endTime;
	private double deposit = 0;
	private double finalPaymentAmount;
	private BookingStatus status;

	public Booking(int parkingSpaceId, LocalDateTime endTime, Client client) {
		this.bookingId = UUID.randomUUID();
		this.client = client;
		this.parkingSpaceId = parkingSpaceId;
		this.status = BookingStatus.PENDING;
		this.startTime = LocalDateTime.now();
		this.endTime = endTime;
		this.finalPaymentAmount = this.calculatePrice();
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

	// Implement this method
	public void completeBooking() {
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

	public int getParkingSpaceId() {
		return parkingSpaceId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
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

	public Client getClient() {
		return client;
	}

	public BookingStatus getStatus() {
		return status;
	}
}