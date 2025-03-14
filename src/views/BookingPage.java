package views;

import javax.swing.*;

import booking.Booking;

import java.awt.*; 

public class BookingPage extends JFrame{
	private Booking booking; 
	private JLabel infoLabel; 
	private JButton confirmButton; 
	private JButton cancelButton; 
	private JButton completeButton; 
	
	public BookingPage() {
		//booking = new Booking (1, 101, 50.0); 
		infoLabel = new JLabel(booking.toString());
		
		confirmButton = new JButton("Confirm Booking"); 
		cancelButton = new JButton("Cancel Booking"); 
		completeButton = new JButton ("Complete Booking"); 
		
		//confirmButton.addActionListener(e -> {booking.confirm();updateBookingInfo();});
	}

	
}



