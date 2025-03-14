package booking;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import client.Client;
import parking.ParkingLot;
import parking.ParkingSpace;

public class Booking {
	private int bookingId; 
	private ParkingSpace parkingSpace;
	private long startTime;
	private long endTime;
	private double deposit; 
	private BookingStatus status; 
	private Client client;
	
	public Booking(int bookingId, ParkingSpace parkingSpace, double deposit, Client client) {
		this.client = client;
		this.bookingId = bookingId; 
		this.parkingSpace = parkingSpace;
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
	
	public Client getClient() {
		return client;
	}
	
	public int getParkingSpaceId(){
		return parkingSpace.getID();
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
}
