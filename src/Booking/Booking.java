package Booking;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Booking {
	private int bookingId; 
	private int parkingSpaceId; 
	private long startTime;
	private String endTime;
	private double deposit; 
	private BookingStatus status; 
	
	public Booking(int bookingId, int parkingSpceId, double desposit) {
		this.bookingId = bookingId; 
		this.parkingSpaceId = parkingSpaceId; 
		this.deposit = deposit; 
		this.startTime = System.currentTimeMillis();
		this.endTime = "";
	}
	
	

}
