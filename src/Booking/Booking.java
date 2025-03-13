package Booking;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Booking {
	private int bookingId; 
	private int parkingSpaceId; 
	private String startTime;
	private String endTime;
	private double deposit; 
	private BookingStatus status; 
	
	public Booking(int bookingId, int parkingSpceId, double desposit) {
		this.bookingId = bookingId; 
		this.parkingSpaceId = parkingSpaceId; 
		this.deposit = deposit; 
		this.startTime = getCurrentTime();
		this.endTime = "";
	}
	
	private String getCurrentTime() {
		// TODO Auto-generated method stub
		return null;
	}

	public void confirm() {
		this.status = BookingStatus.CONFIRMED;
		System.out.println("Booking " + bookingId + "Confirmed.");
	}
	
	public void cancel() {
		this.status = BookingStatus.CANCELED;
		System.out.println("Booking " + bookingId + "Canceled.");
	}
	
	
	

}
