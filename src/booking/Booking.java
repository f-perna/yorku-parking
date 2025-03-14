package booking;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class Booking {
	private int bookingId; 
	private int parkingSpaceId; 
	private long startTime;
	private long endTime;
	private double deposit; 
	private BookingStatus status; 
	
	public Booking(int bookingId, int parkingSpceId, double desposit) {
		this.bookingId = bookingId; 
		this.parkingSpaceId = parkingSpaceId; 
		this.deposit = deposit; 
		this.status = BookingStatus.PENDING;
		this.startTime = System.currentTimeMillis();
		this.endTime = 0;
	}
	

	public void confirm() {
		this.status = BookingStatus.CONFIRMED;
		System.out.println("Booking " + bookingId + "Confirmed.");
	}
	
	public void cancel() {
		this.status = BookingStatus.CANCELED;
		System.out.println("Booking " + bookingId + "Canceled.");
	}
	
	public void complete() {
		this.status = BookingStatus.COMPELETED;
		this.endTime = System.currentTimeMillis();
		System.out.println("Booking " + bookingId + "Completed.");
	}
	
	public void updateStatus(BookingStatus newStatus) {
		this.status = newStatus;
		System.out.println("Booking " + bookingId + " updated to " + newStatus);
	}
	
	public int getBookingId() {
		return bookingId;
	}
	
	public int getParkingSpaceId(){
		return parkingSpaceId;
	}
	
	public long getStartTime() {
		return startTime;
	}
	
	public long getEndTime() {
		return endTime;
	}
	
	public double getDeposit() {
		return deposit;
		
	}
	
	public BookingStatus getStatus(){
		return status; 
	
	}
	
	@Override 
	public String toString() {
		return "booking [ID= " + bookingId + ", ParkingSpaceID " + parkingSpaceId + ", Deposit= " + deposit + " , Status=" + status + ", StartTime=" + startTime + ", EndTime=" +endTime + "]";
	}
}
