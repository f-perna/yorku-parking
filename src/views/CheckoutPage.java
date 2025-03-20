package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controllers.NavigationController;
import controllers.PaymentController;
import controllers.ControllerFactory;
import controllers.BookingController;
import models.booking.Booking;

public class CheckoutPage extends JPanel {

	private PaymentController paymentController;
	private Booking currentBooking;
	private JLabel lotValueLabel, spaceValueLabel, durationValueLabel, totalValueLabel, depositValueLabel;
	private JComboBox<String> paymentComboBox;
	private final String[] METHODS = { "Debit", "Credit", "Mobile", "Cash" };
	private DecimalFormat currencyFormat = new DecimalFormat("$#,##0.00");

	public CheckoutPage(JFrame parent) {
		this.paymentController = ControllerFactory.getInstance().getPaymentController();
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 15, 10, 15);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		// Title Section
		JLabel titleLabel = new JLabel("Checkout", SwingConstants.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(20, 15, 30, 15);
		add(titleLabel, gbc);

		// Booking Details Panel
		JPanel bookingDetailsPanel = new JPanel(new GridBagLayout());
		bookingDetailsPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.GRAY), "Booking Details"));

		GridBagConstraints detailsGbc = new GridBagConstraints();
		detailsGbc.insets = new Insets(5, 10, 5, 10);
		detailsGbc.anchor = GridBagConstraints.WEST;

		// Lot Details
		addLabelAndValue(bookingDetailsPanel, "Parking Lot:", lotValueLabel = new JLabel(), detailsGbc, 0);
		addLabelAndValue(bookingDetailsPanel, "Space Number:", spaceValueLabel = new JLabel(), detailsGbc, 1);
		addLabelAndValue(bookingDetailsPanel, "Duration:", durationValueLabel = new JLabel(), detailsGbc, 2);

		// Add booking details panel to main layout
		gbc.gridy = 1;
		gbc.insets = new Insets(10, 15, 20, 15);
		add(bookingDetailsPanel, gbc);

		// Payment Panel
		JPanel paymentPanel = new JPanel(new GridBagLayout());
		paymentPanel.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(Color.GRAY), "Payment Information"));

		GridBagConstraints paymentGbc = new GridBagConstraints();
		paymentGbc.insets = new Insets(5, 10, 5, 10);
		paymentGbc.anchor = GridBagConstraints.WEST;

		// Payment Details
		addLabelAndValue(paymentPanel, "Deposit Required:", depositValueLabel = new JLabel(), paymentGbc, 0);
		addLabelAndValue(paymentPanel, "Total Due at Checkout:", totalValueLabel = new JLabel(), paymentGbc, 1);

		// Payment Method
		JLabel paymentMethodLabel = new JLabel("Payment Method:");
		paymentGbc.gridx = 0;
		paymentGbc.gridy = 2;
		paymentPanel.add(paymentMethodLabel, paymentGbc);

		paymentComboBox = new JComboBox<>(METHODS);
		paymentComboBox.setPreferredSize(new Dimension(200, 25));
		paymentGbc.gridx = 1;
		paymentPanel.add(paymentComboBox, paymentGbc);

		// Add payment panel to main layout
		gbc.gridy = 2;
		add(paymentPanel, gbc);

		// Buttons Panel
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		GridBagConstraints buttonGbc = new GridBagConstraints();
		buttonGbc.insets = new Insets(0, 10, 0, 10);

		JButton backButton = new JButton("Back");
		backButton.setPreferredSize(new Dimension(100, 30));
		buttonGbc.gridx = 0;
		buttonPanel.add(backButton, buttonGbc);

		JButton payButton = new JButton("Pay Now");
		payButton.setPreferredSize(new Dimension(100, 30));
		buttonGbc.gridx = 1;
		buttonPanel.add(payButton, buttonGbc);

		// Add buttons panel to main layout
		gbc.gridy = 3;
		gbc.insets = new Insets(30, 15, 20, 15);
		add(buttonPanel, gbc);

		// Add action listeners
		backButton.addActionListener(e -> handleBack());
		payButton.addActionListener(e -> handlePay());

		// Style the labels
		styleValueLabels(lotValueLabel, spaceValueLabel, durationValueLabel,
				depositValueLabel, totalValueLabel);
	}

	private void addLabelAndValue(JPanel panel, String labelText, JLabel valueLabel,
			GridBagConstraints gbc, int row) {
		gbc.gridx = 0;
		gbc.gridy = row;
		panel.add(new JLabel(labelText), gbc);

		gbc.gridx = 1;
		panel.add(valueLabel, gbc);
	}

	private void styleValueLabels(JLabel... labels) {
		for (JLabel label : labels) {
			label.setForeground(new Color(51, 51, 51));
			label.setFont(new Font("Arial", Font.PLAIN, 14));
		}
	}

	public void refresh(Booking booking) {
		try {
			if (booking == null) {
				ErrorDialog.show(this, "Error", "No booking information available");
				return;
			}

			currentBooking = booking;

			lotValueLabel.setText(booking.getParkingSpace().getLot().getName());
			spaceValueLabel.setText(booking.getParkingSpace().getName());
			durationValueLabel.setText(booking.getDuration());
			depositValueLabel.setText(currencyFormat.format(booking.getDeposit()));
			totalValueLabel.setText(currencyFormat.format(booking.calculatePrice()));

			paymentComboBox.setSelectedIndex(0);
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not load booking details: " + e.getMessage());
		}
	}

	private void handlePay() {
		try {
			if (paymentComboBox.getSelectedItem() == null) {
				ErrorDialog.show(this, "Payment Error", "Please select a payment method");
				return;
			}

			paymentController.processPayment(currentBooking, (String) paymentComboBox.getSelectedItem());

			BookingController bookingController = ControllerFactory.getInstance().getBookingController();
			bookingController.saveBooking(currentBooking);
			
			// FIX SPACE STATUS NOT UPDATED TO BOOKED

			ClientPage clientPage = (ClientPage) NavigationController.getPage("Client");
			clientPage.refresh();
			NavigationController.showPage("Client");
		} catch (IllegalStateException | IllegalArgumentException e) {
			ErrorDialog.show(this, "Payment Error", e.getMessage());
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "An unexpected error occurred during payment: " + e.getMessage());
		}
	}

	private void handleBack() {
		try {
			BookingPage bookingPage = (BookingPage) NavigationController.getPage("Booking");
			bookingPage.refresh();
			NavigationController.showPage("Booking");
		} catch (Exception e) {
			ErrorDialog.show(this, "Navigation Error", "Could not return to booking page: " + e.getMessage());
		}
	}
}
