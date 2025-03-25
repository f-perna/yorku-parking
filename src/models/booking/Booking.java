package models.booking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.UUID;

import models.client.Client;
import models.parkingSpace.ParkingSpace;
import models.ParkingSystemException;
import models.ParkingSystemException.ErrorType;

public class Booking {

	public static enum BookingStatus {
		PENDING, CONFIRMED, CHECKED_IN, CANCELED, COMPLETED, NO_SHOW, OVERSTAYED, EXPIRED
	}

	private UUID bookingID;
	private ParkingSpace parkingSpace;
	private LocalDateTime startTime;
	private Client client;
	private LocalDateTime endTime;
	private double deposit;
	private BookingStatus status;

	public Booking(ParkingSpace parkingSpace, Client client, int durationAmount) {
		this.bookingID = UUID.randomUUID();
		this.client = client;
		this.parkingSpace = parkingSpace;
		this.status = BookingStatus.PENDING;
		this.startTime = LocalDateTime.now().plusMinutes(0); // booking will start 30 minutes from the time it was
																// placed.
		this.endTime = this.startTime.plusHours(durationAmount);
		this.deposit = this.client.getRate();

		if (client.getLicencePlate() == null || client.getLicencePlate().trim().isEmpty()) {
			throw new ParkingSystemException("Client must have a licence plate number", ErrorType.VALIDATION);
		}
	}

	// Constructor to retrieve data from bookings.csv
	public Booking(UUID bookingID, Client client, ParkingSpace parkingSpace, BookingStatus status,
			LocalDateTime startTime, LocalDateTime endTime, double deposit) {
		this.bookingID = bookingID;
		this.client = client;
		this.parkingSpace = parkingSpace;
		this.status = status;
		this.startTime = startTime;
		this.endTime = endTime;
		this.deposit = deposit;
	}

	public void confirmBooking() {
		this.status = BookingStatus.CONFIRMED;
	}

	public void completeBooking() {
		this.status = BookingStatus.COMPLETED;
	}

	public void checkIn() {
		this.status = BookingStatus.CHECKED_IN;
	}

	public void cancelBooking() {
		this.status = BookingStatus.CANCELED;
	}

	public void markAsOverstayed() {
		if (this.status == BookingStatus.CHECKED_IN) {
			this.status = BookingStatus.OVERSTAYED;
		} else {
			System.out.println("Cannot mark as overstayed for booking with status: " + status);
		}
	}

	public void markAsExpired() {
		if (this.status == BookingStatus.CHECKED_IN) {
			this.status = BookingStatus.EXPIRED;
		} else {
			System.out.println("Cannot mark as expired for booking with status: " + status);
		}
	}

	public void updateStatus(BookingStatus newStatus) {
		this.status = newStatus;
	}

	public void extendDuration(int additionalHours) {
		if (additionalHours <= 0) {
			throw new ParkingSystemException("Additional hours must be positive", ErrorType.VALIDATION);
		}
		this.endTime = this.endTime.plusHours(additionalHours);
	}

	public long calculateHours() {
		long minutes = Duration.between(startTime, endTime).toMinutes();
		return (minutes + 59) / 60;
	}

	public double calculatePrice() {
		return this.calculateHours() * this.client.getRate();
	}

	public double deductedPrice() {
		return this.calculatePrice() - this.deposit;
	}

	public void payDeposit() {
		this.deposit = this.client.getRate();
		this.status = BookingStatus.CONFIRMED;
	}

	public void noShow() {
		if (this.status == BookingStatus.CONFIRMED) {
			this.status = BookingStatus.NO_SHOW;
		} else {
			System.out.println("Cannot mark as no-show for booking with status: " + status);
		}
	}

	public UUID getBookingID() {
		return bookingID;
	}

	public Client getClient() {
		return client;
	}

	public ParkingSpace getParkingSpace() {
		return parkingSpace;
	}

	public void setParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpace = parkingSpace;
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

	public BookingStatus getStatus() {
		return status;
	}

	public String getLicencePlate() {
		return client.getLicencePlate();
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
		return "Lot " + parkingSpace.getLot().getName() + ", Space " + parkingSpace.getName() + " | "
				+ startTime.format(startFormatter) + " - "
				+ endTime.format(endFormatter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass().getSuperclass() != obj.getClass().getSuperclass())
			return false;
		Booking other = (Booking) obj;
		return bookingID != null && bookingID.equals(other.bookingID);
	}

	@Override
	public int hashCode() {
		return bookingID != null ? bookingID.hashCode() : 0;
	}
}
