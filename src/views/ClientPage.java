package views;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import booking.Booking;
import client.Client;
import controllers.NavigationController;
import parking.ParkingSystem;

public class ClientPage extends JPanel {
	
	private ParkingSystem parkingSystem = ParkingSystem.getInstance();
	
	private JComboBox<Booking> bookingsList;
	private JLabel welcomeMessage;

	public ClientPage(JFrame parent) {
		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		welcomeMessage = new JLabel();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTH;
		add(welcomeMessage, gbc);
		
		JButton bookButton = new JButton("Book Parking Space");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookButton, gbc);
		bookButton.addActionListener((ActionEvent e) -> handleNewBooking());
		
		JLabel bookingsMessage = new JLabel("Bookings: ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookingsMessage, gbc);
		
		bookingsList = new JComboBox<>();
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookingsList, gbc);
	}
	
	public void handleNewBooking() {
		BookingPage bookingPage = (BookingPage) NavigationController.getPage("Booking");
		bookingPage.refresh();
		NavigationController.showPage("Booking");
	}
	
	public void refresh() {
	     Client client = parkingSystem.getLoggedInClient();
	     List<Booking> clientBookings = parkingSystem.getBookingsForClient(client);
	     
	     welcomeMessage.setText("Welcome, " + client.getName());
	     
	     bookingsList.removeAllItems();

	     for (Booking booking : clientBookings) {
	         bookingsList.addItem(booking);
	     }
	}
}
