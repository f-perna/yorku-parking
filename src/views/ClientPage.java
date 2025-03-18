package views;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.NavigationController;
import models.booking.Booking;
import models.client.Client;
import models.parking.ParkingSystem;

public class ClientPage extends JPanel {
	
	private ParkingSystem parkingSystem = ParkingSystem.getInstance();
	
	private JComboBox<Booking> bookingsList;
	private JLabel welcomeMessage;
	private JLabel bookingLabel, lotLabel, lotValue, spaceLabel, spaceValue, durationLabel, durationValue, depositLabel, depositValue,
	statusLabel, statusValue, totalLabel, totalValue;
	private JButton checkinButton, checkoutButton;

	public ClientPage(JFrame parent) {
		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		welcomeMessage = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;
		welcomeMessage.setBorder(new EmptyBorder(20, 0, 20, 0));
		add(welcomeMessage, gbc);
		
		JButton bookButton = new JButton("Book Parking Space");
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookButton, gbc);
		bookButton.addActionListener((ActionEvent e) -> handleNewBooking());
		
		bookingLabel = new JLabel("Bookings: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		bookingLabel.setBorder(new EmptyBorder(50, 0, 50, 0));
		add(bookingLabel, gbc);
		bookingLabel.hide();
		
		bookingsList = new JComboBox<>();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookingsList, gbc);
		bookingsList.hide();
		
		bookingsList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				refreshBookingInfo();
			}
		});
		
		lotLabel = new JLabel("Lot: ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		add(lotLabel, gbc);
		lotLabel.hide();
		
		lotValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		add(lotValue, gbc);
		lotValue.hide();
		
		spaceLabel = new JLabel("Space: ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		add(spaceLabel, gbc);
		spaceLabel.hide();
		
		spaceValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		add(spaceValue, gbc);
		spaceValue.hide();
		
		durationLabel = new JLabel("Duration: ");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.CENTER;
		add(durationLabel, gbc);
		durationLabel.hide();
		
		durationValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.CENTER;
		add(durationValue, gbc);
		durationValue.hide();
		
		statusLabel = new JLabel("Status: ");
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.CENTER;
		add(statusLabel, gbc);
		statusLabel.hide();
		
		statusValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.CENTER;
		add(statusValue, gbc);
		statusValue.hide();
		
		depositLabel = new JLabel("Deposit Paid: ");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.anchor = GridBagConstraints.CENTER;
		add(depositLabel, gbc);
		depositLabel.hide();
		
		depositValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.anchor = GridBagConstraints.CENTER;
		add(depositValue, gbc);
		depositValue.hide();
		
		totalLabel = new JLabel("Total Due Upon Checkout: ");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.anchor = GridBagConstraints.CENTER;
		add(totalLabel, gbc);
		totalLabel.hide();
		
		totalValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.anchor = GridBagConstraints.CENTER;
		add(totalValue, gbc);
		totalValue.hide();
		
		checkinButton = new JButton("Check-In");
		gbc.gridy = 9;
		gbc.anchor = GridBagConstraints.CENTER;
		add(checkinButton, gbc);
		checkinButton.hide();
		
		checkoutButton = new JButton("Check-Out");
		gbc.gridy = 9;
		gbc.anchor = GridBagConstraints.CENTER;
		add(checkoutButton, gbc);
		checkoutButton.hide();
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
	     
	     if (clientBookings.size() > 0) {
	    	 bookingLabel.show();
	    	 bookingsList.show();
	     } else {
	    	 bookingLabel.hide();
	    	 bookingsList.hide();
		}
	}
	
	public void refreshBookingInfo() {
		lotValue.setText(((Booking) bookingsList.getSelectedItem()).getParkingSpace().getLot().getName());
		spaceValue.setText(((Booking) bookingsList.getSelectedItem()).getParkingSpace().getName());
		durationValue.setText(((Booking) bookingsList.getSelectedItem()).getDuration());
		statusValue.setText(((Booking) bookingsList.getSelectedItem()).getStatus().toString());
		depositValue.setText(Double.toString(((Booking) bookingsList.getSelectedItem()).getDeposit()));
		totalValue.setText(Double.toString(((Booking) bookingsList.getSelectedItem()).calculatePrice()));
		lotLabel.show();
		spaceLabel.show();
		durationLabel.show();
		statusLabel.show();
		depositLabel.show();
		totalLabel.show();
		lotValue.show();
		spaceValue.show();
		durationValue.show();
		statusValue.show();
		depositValue.show();
		totalValue.show();
		checkinButton.show();
		//checkoutButton.show();
	}
}
