package views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Component;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JScrollPane;
import javax.swing.DefaultListCellRenderer;

import controllers.AuthController;
import controllers.BookingController;
import controllers.ClientController;
import controllers.ControllerFactory;
import controllers.NavigationController;
import controllers.PaymentController;
import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;

public class ClientPage extends JPanel {
	private BookingController bookingController;
	private ClientController clientController;
	private AuthController authController;
	private PaymentController paymentController;

	private JComboBox<Booking> bookingsList;
	private JLabel welcomeMessage;
	private JLabel bookingLabel, lotLabel, lotValue, spaceLabel, spaceValue, durationLabel, durationValue, depositLabel,
			depositValue, statusLabel, statusValue, totalLabel, totalValue, errorLabel, paymentsLabel;
	private JButton checkinButton, checkoutButton, deleteButton, extendTimeButton, cancelButton;
	private JList<Payment> paymentsList;
	private DefaultListModel<Payment> paymentsListModel;

	public ClientPage(JFrame parent) {
		this.bookingController = ControllerFactory.getInstance().getBookingController();
		this.clientController = ControllerFactory.getInstance().getClientController();
		this.authController = ControllerFactory.getInstance().getAuthController();
		this.paymentController = ControllerFactory.getInstance().getPaymentController();
		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 10, 5, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		welcomeMessage = new JLabel();
		welcomeMessage.setFont(new Font("Arial", Font.BOLD, 18));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(20, 10, 20, 10);
		gbc.anchor = GridBagConstraints.CENTER;
		add(welcomeMessage, gbc);

		JButton bookButton = new JButton("Book Parking Space");
		gbc.gridy = 1;
		gbc.insets = new Insets(5, 10, 20, 10);
		add(bookButton, gbc);
		bookButton.addActionListener(e -> handleNewBooking());

		gbc.gridwidth = 1;
		gbc.insets = new Insets(5, 10, 5, 10);

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

		depositLabel = new JLabel("Deposit Paid (refundable at checkout): ");
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

		// Add payments section
		paymentsLabel = new JLabel("Payments: ");
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.anchor = GridBagConstraints.EAST;
		add(paymentsLabel, gbc);
		paymentsLabel.setVisible(false);

		paymentsListModel = new DefaultListModel<>();
		paymentsList = new JList<>(paymentsListModel);
		paymentsList.setCellRenderer(new PaymentListCellRenderer());
		JScrollPane paymentsScrollPane = new JScrollPane(paymentsList);
		paymentsScrollPane.setPreferredSize(new Dimension(300, 100));
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(paymentsScrollPane, gbc);
		paymentsScrollPane.setVisible(false);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
		cancelButton = new JButton("Cancel");
		checkinButton = new JButton("Check-In");
		checkoutButton = new JButton("Check-Out");
		extendTimeButton = new JButton("Extend Time");

		buttonPanel.add(cancelButton);
		buttonPanel.add(checkinButton);
		buttonPanel.add(checkoutButton);
		buttonPanel.add(extendTimeButton);

		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 10, 15, 10);
		add(buttonPanel, gbc);

		cancelButton.setVisible(false);
		checkinButton.setVisible(false);
		checkoutButton.setVisible(false);
		extendTimeButton.setVisible(false);

		cancelButton.addActionListener(e -> handleCancel());
		checkinButton.addActionListener(e -> handleCheckin());
		extendTimeButton.addActionListener(e -> handleExtendTime());

		checkoutButton.addActionListener(e -> handleCheckout());

		errorLabel = new JLabel();
		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 11;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(10, 10, 20, 10);
		add(errorLabel, gbc);
	}

	private void handleCancel() {
		try {
			Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
			if (selectedBooking == null) {
				ErrorDialog.show(this, "Error", "No booking selected");
				return;
			}

			boolean cancelSuccessful = bookingController.cancel(selectedBooking);

			if (cancelSuccessful) {
				SuccessDialog.show(this, "Cancel Successful", "You have successfully canceled!");
				refresh();
			} else {
				ErrorDialog.show(this, "Cancel Failed", "It is too late to cancel.");
				refresh();
			}
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "An error occurred during cancellation: " + e.getMessage());
			refresh();
		}
	}

	private void handleCheckin() {
		try {
			Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
			if (selectedBooking == null) {
				ErrorDialog.show(this, "Error", "No booking selected");
				return;
			}

			boolean checkInSuccessful = bookingController.checkIn(selectedBooking);

			if (checkInSuccessful) {
				SuccessDialog.show(this, "Check In Successful", "You have successfully checked in!");
				refresh();
			} else {
				ErrorDialog.show(this, "Check In Failed", "Could not check in at this time. Please try again later.");
				refresh();
			}
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "An error occurred during check-in: " + e.getMessage());
			refresh();
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
			Client loggedInClient = authController.getLoggedInClient();
			if (loggedInClient == null) {
				NavigationController.showPage("Login");
				return;
			}

			welcomeMessage.setText("Welcome, " + loggedInClient.getName() + "!");

			List<Booking> clientBookings = bookingController.getBookingsForClient();

			if (clientBookings.isEmpty()) {
				bookingLabel.setVisible(false);
				bookingsList.setVisible(false);
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
				checkinButton.setVisible(false);
				checkoutButton.setVisible(false);
				extendTimeButton.setVisible(false);
				paymentsLabel.setVisible(false);
				paymentsList.setVisible(false);
				cancelButton.setVisible(false);
			} else {
				bookingLabel.setVisible(true);
				bookingsList.setVisible(true);
				bookingsList.removeAllItems();

				for (Booking booking : clientBookings) {
					bookingsList.addItem(booking);
				}

				bookingsList.setSelectedIndex(0);
				refreshBookingInfo();
			}

		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not load client info: " + e.getMessage());
			e.printStackTrace();
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
				paymentsLabel.setVisible(false);
				paymentsList.getParent().getParent().setVisible(false);

				cancelButton.setVisible(false);
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
				totalValue.setText(Double.toString(selectedBooking.deductedPrice()));

				// Show payments
				paymentsListModel.clear();
				List<Payment> payments = paymentController.getPaymentsForBooking(selectedBooking);
				for (Payment payment : payments) {
					paymentsListModel.addElement(payment);
				}
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
			paymentsLabel.setVisible(true);
			paymentsList.getParent().getParent().setVisible(true);

			if (selectedBooking.getStatus() == Booking.BookingStatus.PENDING) {
				cancelButton.setVisible(false);
				checkinButton.setVisible(false);
				checkoutButton.setVisible(false);
				extendTimeButton.setVisible(false);
				// show pay deposit button
			} else if (selectedBooking.getStatus() == Booking.BookingStatus.CONFIRMED) {
				cancelButton.setVisible(true);
				checkinButton.setVisible(true);
				checkoutButton.setVisible(false);
				extendTimeButton.setVisible(true);
			} else if (selectedBooking.getStatus() == Booking.BookingStatus.CHECKED_IN) {
				cancelButton.setVisible(false);
				checkinButton.setVisible(false);
				checkoutButton.setVisible(true);
				extendTimeButton.setVisible(true);
			} else {
				cancelButton.setVisible(false);
				checkinButton.setVisible(false);
				checkoutButton.setVisible(false);
				extendTimeButton.setVisible(false);
			}
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not refresh booking information: " + e.getMessage());
		}
	}

	private void handleExtendTime() {
		Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
		if (ExtendTimePopup.showDialog(this, selectedBooking)) {
			refresh();
		}
	}

	private void handleCheckout() {
		Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
		if (CheckoutPopup.showDialog(this, selectedBooking)) {
			refresh();
		}
	}
}

// Custom renderer for the payments list
class PaymentListCellRenderer extends DefaultListCellRenderer {
	@Override
	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
		if (value instanceof Payment) {
			Payment payment = (Payment) value;
			setText(String.format("%s: $%.2f - %s - %s", payment.getPaymentType(), payment.getAmount(),
					payment.getMethod(), payment.getStatus()));
		}
		return c;
	}
}
