package views;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controllers.BookingController;
import controllers.ClientController;
import controllers.ControllerFactory;
import controllers.NavigationController;
import models.booking.Booking;
import models.client.Client;

public class ClientPage extends JPanel {
	private BookingController bookingController;
	private ClientController clientController;

	private JComboBox<Booking> bookingsList;
	private JLabel welcomeMessage;
	private JLabel bookingLabel, lotLabel, lotValue, spaceLabel, spaceValue, durationLabel, durationValue, depositLabel, depositValue,
	statusLabel, statusValue, totalLabel, totalValue, errorLabel;
	private JButton checkinButton, checkoutButton;

	public ClientPage(JFrame parent) {
		this.bookingController =  ControllerFactory.getInstance().getBookingController();
		this.clientController = ControllerFactory.getInstance().getClientController();
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
		bookButton.addActionListener(_ -> handleNewBooking());
		
		bookingLabel = new JLabel("Bookings: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		bookingLabel.setBorder(new EmptyBorder(50, 0, 50, 0));
		add(bookingLabel, gbc);
		bookingLabel.setVisible(false);
		
		bookingsList = new JComboBox<>();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookingsList, gbc);
		bookingsList.setVisible(false);
		
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
		lotLabel.setVisible(false);
		
		lotValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		add(lotValue, gbc);
		lotValue.setVisible(false);
		
		spaceLabel = new JLabel("Space: ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		add(spaceLabel, gbc);
		spaceLabel.setVisible(false);
		
		spaceValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		add(spaceValue, gbc);
		spaceValue.setVisible(false);
		
		durationLabel = new JLabel("Duration: ");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.CENTER;
		add(durationLabel, gbc);
		durationLabel.setVisible(false);
		
		durationValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.CENTER;
		add(durationValue, gbc);
		durationValue.setVisible(false);
		
		statusLabel = new JLabel("Status: ");
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.CENTER;
		add(statusLabel, gbc);
		statusLabel.setVisible(false);
		
		statusValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.CENTER;
		add(statusValue, gbc);
		statusValue.setVisible(false);
		
		depositLabel = new JLabel("Deposit Paid: ");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.anchor = GridBagConstraints.CENTER;
		add(depositLabel, gbc);
		depositLabel.setVisible(false);
		
		depositValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 7;
		gbc.anchor = GridBagConstraints.CENTER;
		add(depositValue, gbc);
		depositValue.setVisible(false);
		
		totalLabel = new JLabel("Total Due Upon Checkout: ");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.anchor = GridBagConstraints.CENTER;
		add(totalLabel, gbc);
		totalLabel.setVisible(false);
		
		totalValue = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 8;
		gbc.anchor = GridBagConstraints.CENTER;
		add(totalValue, gbc);
		totalValue.setVisible(false);
		
		checkinButton = new JButton("Check-In");
		gbc.gridy = 9;
		gbc.anchor = GridBagConstraints.CENTER;
		add(checkinButton, gbc);
		checkinButton.setVisible(false);
		checkinButton.addActionListener(_ -> handleCheckin());
		
		checkoutButton = new JButton("Check-Out");
		gbc.gridy = 9;
		gbc.anchor = GridBagConstraints.CENTER;
		add(checkoutButton, gbc);
		checkoutButton.setVisible(false);
		
		errorLabel = new JLabel();
		gbc.gridx = 1;
		gbc.gridy = 10;
		gbc.anchor = GridBagConstraints.CENTER;
		add(errorLabel, gbc);
	}
	
	private void handleCheckin() {
		Booking booking = ((Booking) bookingsList.getSelectedItem());
		
		boolean checkedin = parkingSystem.checkin(booking);
		
		if (checkedin) {
			errorLabel.setText("Checked-In!");
			errorLabel.setForeground(Color.GREEN);
			refreshBookingInfo();
		} else {
			errorLabel.setText("You can't check-in yet!");
			errorLabel.setForeground(Color.RED);
		}
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
	    	 bookingLabel.setVisible(true);
	    	 bookingsList.setVisible(true);
	     } else {
	    	 bookingLabel.setVisible(false);
	    	 bookingsList.setVisible(false);
		}
	}
	
	public void refreshBookingInfo() {
		lotValue.setText(((Booking) bookingsList.getSelectedItem()).getParkingSpace().getLot().getName());
		spaceValue.setText(((Booking) bookingsList.getSelectedItem()).getParkingSpace().getName());
		durationValue.setText(((Booking) bookingsList.getSelectedItem()).getDuration());
		statusValue.setText(((Booking) bookingsList.getSelectedItem()).getStatus().toString());
		depositValue.setText(Double.toString(((Booking) bookingsList.getSelectedItem()).getDeposit()));
		totalValue.setText(Double.toString(((Booking) bookingsList.getSelectedItem()).calculatePrice()));
		lotLabel.setVisible(true);
		spaceLabel.setVisible(true);
		durationLabel.setVisible(true);
		statusLabel.setVisible(true);
		depositLabel.setVisible(true);
		totalLabel.setVisible(true);
		lotValue.setVisible(true);
		spaceValue.setVisible(true);
		durationValue.setVisible(true);
		statusValue.setVisible(true);
		depositValue.setVisible(true);
		totalValue.setVisible(true);
		
		if (((Booking) bookingsList.getSelectedItem()).getStatus() == Booking.BookingStatus.PENDING) {
			checkinButton.setVisible(true);
			checkoutButton.setVisible(false);
		} else if (((Booking) bookingsList.getSelectedItem()).getStatus() == Booking.BookingStatus.CONFIRMED) {
			checkinButton.setVisible(false);
			checkoutButton.setVisible(true);
		} else {
			checkinButton.setVisible(false);
			checkoutButton.setVisible(false);
		}
	}
}
