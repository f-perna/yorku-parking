package booking;

import javax.swing.*;
import java.awt.*; 

public class BookingGUI extends JFrame{
	private Booking booking; 
	private JLabel infoLabel; 
	private JButton confirmButton; 
	private JButton cancelButton; 
	private JButton completeButton; 
	
	public BookingGUI() {
		booking = new Booking (1, 101, 50.0); 
		infoLabel = new JLabel(booking.toString());
		
		confirmButton = new JButton("Confirm Booking"); 
		cancelButton = new JButton("Cancel Booking"); 
		completeButton = new JButton ("Complete Booking"); 
		
		confirmButton.addActionListener(e -> {booking.confirm();updateBookingInfo();});
	}

	
}



