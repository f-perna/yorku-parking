package views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
	private JLabel bookingLabel, lotLabel, lotValue, spaceLabel, spaceValue, durationLabel, durationValue, depositLabel,
			depositValue, statusLabel, statusValue, totalLabel, totalValue, errorLabel;
	private JButton checkinButton, checkoutButton, deleteButton, extendTimeButton;

	public ClientPage(JFrame parent) {
		this.bookingController = ControllerFactory.getInstance().getBookingController();
		this.clientController = ControllerFactory.getInstance().getClientController();
		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 10, 5, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		// Welcome message at the top
		welcomeMessage = new JLabel();
		welcomeMessage.setFont(new Font("Arial", Font.BOLD, 18));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(20, 10, 20, 10);
		gbc.anchor = GridBagConstraints.CENTER;
		add(welcomeMessage, gbc);

		// Book button below welcome message
		JButton bookButton = new JButton("Book Parking Space");
		gbc.gridy = 1;
		gbc.insets = new Insets(5, 10, 20, 10);
		add(bookButton, gbc);
		bookButton.addActionListener(e -> handleNewBooking());

		// Reset gridwidth for other components
		gbc.gridwidth = 1;
		gbc.insets = new Insets(5, 10, 5, 10);

		// Bookings dropdown section
		bookingLabel = new JLabel("Bookings: ");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.EAST;
		add(bookingLabel, gbc);
		bookingLabel.setVisible(false);

		bookingsList = new JComboBox<>();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(bookingsList, gbc);
		bookingsList.setVisible(false);
		bookingsList.addActionListener(e -> refreshBookingInfo());

		// Booking details section
		lotLabel = new JLabel("Lot: ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.EAST;
		add(lotLabel, gbc);
		lotLabel.setVisible(false);

		lotValue = new JLabel();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(lotValue, gbc);
		lotValue.setVisible(false);

		spaceLabel = new JLabel("Space: ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.EAST;
		add(spaceLabel, gbc);
		spaceLabel.setVisible(false);

		spaceValue = new JLabel();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(spaceValue, gbc);
		spaceValue.setVisible(false);

		durationLabel = new JLabel("Duration: ");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.anchor = GridBagConstraints.EAST;
		add(durationLabel, gbc);
		durationLabel.setVisible(false);

		durationValue = new JLabel();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(durationValue, gbc);
		durationValue.setVisible(false);

		statusLabel = new JLabel("Status: ");
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.EAST;
		add(statusLabel, gbc);
		statusLabel.setVisible(false);

		statusValue = new JLabel();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(statusValue, gbc);
		statusValue.setVisible(false);

		depositLabel = new JLabel("Deposit Paid: ");
		gbc.gridx = 0;
		gbc.gridy = 7;
		gbc.anchor = GridBagConstraints.EAST;
		add(depositLabel, gbc);
		depositLabel.setVisible(false);

		depositValue = new JLabel();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(depositValue, gbc);
		depositValue.setVisible(false);

		totalLabel = new JLabel("Total Due Upon Checkout: ");
		gbc.gridx = 0;
		gbc.gridy = 8;
		gbc.anchor = GridBagConstraints.EAST;
		add(totalLabel, gbc);
		totalLabel.setVisible(false);

		totalValue = new JLabel();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(totalValue, gbc);
		totalValue.setVisible(false);

		// Action buttons panel
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
		checkinButton = new JButton("Check-In");
		checkoutButton = new JButton("Check-Out");
		// deleteButton = new JButton("Delete");
		extendTimeButton = new JButton("Extend Time");

		buttonPanel.add(checkinButton);
		buttonPanel.add(checkoutButton);
		// buttonPanel.add(deleteButton);
		buttonPanel.add(extendTimeButton);

		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 10, 15, 10);
		add(buttonPanel, gbc);

		checkinButton.setVisible(false);
		checkoutButton.setVisible(false);
		// deleteButton.setVisible(false);
		extendTimeButton.setVisible(false);

		checkinButton.addActionListener(e -> handleCheckin());
		// deleteButton.addActionListener(e -> handleDelete());
		extendTimeButton.addActionListener(e -> handleExtendTime());

		// Error label at the bottom
		errorLabel = new JLabel();
		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(10, 10, 20, 10);
		add(errorLabel, gbc);
	}

	private void handleCheckin() {
		Booking booking = ((Booking) bookingsList.getSelectedItem());
		if (booking == null) {
			ErrorDialog.show(this, "Check-in Error", "Please select a booking to check in");
			return;
		}

		try {
			boolean checkedin = bookingController.CheckIn(booking);
			if (checkedin) {
				errorLabel.setText("Checked-In!");
				errorLabel.setForeground(Color.GREEN);
				refreshBookingInfo();
			} else {
				ErrorDialog.show(this, "Check-in Error", "You can't check-in yet. Please check your booking time.");
			}
		} catch (Exception e) {
			ErrorDialog.show(this, "Check-in Error", "An error occurred while checking in: " + e.getMessage());
		}
	}

	public void handleNewBooking() {
		try {
			BookingPage bookingPage = (BookingPage) NavigationController.getPage("Booking");
			bookingPage.refresh();
			NavigationController.showPage("Booking");
		} catch (Exception e) {
			ErrorDialog.show(this, "Booking Error", "Could not open booking page: " + e.getMessage());
		}
	}

	public void refresh() {
		try {
			Client client = clientController.getLoggedInClient();
			if (client == null) {
				ErrorDialog.show(this, "Error", "No user is currently logged in");
				NavigationController.showPage("Login");
				return;
			}

			List<Booking> clientBookings = bookingController.getCurrentUserBookings();
			welcomeMessage.setText("Welcome, " + client.getName());

			bookingsList.removeAllItems();
			bookingsList.addItem(null); // Add null as first item

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
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not load client data: " + e.getMessage());
		}
	}

	public void refreshBookingInfo() {
		try {
			Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
			if (selectedBooking == null) {
				lotValue.setText("");
				spaceValue.setText("");
				durationValue.setText("");
				statusValue.setText("");
				depositValue.setText("");
				totalValue.setText("");

				// Hide all labels and values
				lotLabel.setVisible(false);
				spaceLabel.setVisible(false);
				durationLabel.setVisible(false);
				statusLabel.setVisible(false);
				depositLabel.setVisible(false);
				totalLabel.setVisible(false);
				lotValue.setVisible(false);
				spaceValue.setVisible(false);
				durationValue.setVisible(false);
				statusValue.setVisible(false);
				depositValue.setVisible(false);
				totalValue.setVisible(false);

				// Hide action buttons
				checkinButton.setVisible(false);
				checkoutButton.setVisible(false);
				extendTimeButton.setVisible(false);
				return;
			}

			try {
				lotValue.setText(selectedBooking.getParkingSpace().getLot().getName());
				spaceValue.setText(selectedBooking.getParkingSpace().getName());
				durationValue.setText(selectedBooking.getDuration());
				statusValue.setText(selectedBooking.getStatus().toString());
				depositValue.setText(Double.toString(selectedBooking.getDeposit()));
				totalValue.setText(Double.toString(selectedBooking.calculatePrice()));
			} catch (Exception e) {
				ErrorDialog.show(this, "Error", "Could not load booking details: " + e.getMessage());
				return;
			}

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

			if (selectedBooking.getStatus() == Booking.BookingStatus.PENDING) {
				checkinButton.setVisible(true);
				checkoutButton.setVisible(false);
				extendTimeButton.setVisible(false);
			} else if (selectedBooking.getStatus() == Booking.BookingStatus.CONFIRMED) {
				checkinButton.setVisible(false);
				checkoutButton.setVisible(true);
				extendTimeButton.setVisible(true);
			} else {
				checkinButton.setVisible(false);
				checkoutButton.setVisible(false);
				extendTimeButton.setVisible(false);
			}
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not refresh booking information: " + e.getMessage());
		}
	}

	private void handleExtendTime() {
		Booking booking = (Booking) bookingsList.getSelectedItem();
		if (booking == null) {
			ErrorDialog.show(this, "Error", "Please select a booking to extend");
			return;
		}

		if (booking.getStatus() != Booking.BookingStatus.CONFIRMED) {
			ErrorDialog.show(this, "Error", "You can only extend confirmed bookings");
			return;
		}

		try {
			BookingPage bookingPage = (BookingPage) NavigationController.getPage("Booking");
			bookingPage.refresh();
			NavigationController.showPage("Booking");
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not open booking extension page: " + e.getMessage());
		}
	}
}
