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

		JLabel titleLabel = new JLabel("Checkout", SwingConstants.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(20, 15, 30, 15);
		add(titleLabel, gbc);

		JPanel bookingDetailsPanel = new JPanel(new GridBagLayout());
		bookingDetailsPanel.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY), "Booking Details"));

		GridBagConstraints detailsGbc = new GridBagConstraints();
		detailsGbc.insets = new Insets(5, 10, 5, 10);
		detailsGbc.anchor = GridBagConstraints.WEST;

		addLabelAndValue(bookingDetailsPanel, "Parking Lot:", lotValueLabel = new JLabel(), detailsGbc, 0);
		addLabelAndValue(bookingDetailsPanel, "Space Number:", spaceValueLabel = new JLabel(), detailsGbc, 1);
		addLabelAndValue(bookingDetailsPanel, "Duration:", durationValueLabel = new JLabel(), detailsGbc, 2);

		gbc.gridy = 1;
		gbc.insets = new Insets(10, 15, 20, 15);
		add(bookingDetailsPanel, gbc);

		// Payment Panel
		JPanel paymentPanel = new JPanel(new GridBagLayout());
		paymentPanel.setBorder(
				BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.GRAY), "Payment Information"));

		GridBagConstraints paymentGbc = new GridBagConstraints();
		paymentGbc.insets = new Insets(5, 10, 5, 10);
		paymentGbc.anchor = GridBagConstraints.WEST;

		addLabelAndValue(paymentPanel, "Deposit Required:", depositValueLabel = new JLabel(), paymentGbc, 0);
		addLabelAndValue(paymentPanel, "Estimated Total (Final payment at checkout):", totalValueLabel = new JLabel(),
				paymentGbc, 1);

		JLabel depositNoteLabel = new JLabel(
				"<html>Note: Only the deposit amount will be charged now.<br>Final payment will be calculated at checkout based on actual usage.</html>");
		depositNoteLabel.setForeground(new Color(100, 100, 100));
		depositNoteLabel.setFont(new Font("Arial", Font.ITALIC, 11));
		paymentGbc.gridx = 0;
		paymentGbc.gridy = 2;
		paymentGbc.gridwidth = 2;
		paymentPanel.add(depositNoteLabel, paymentGbc);
		paymentGbc.gridwidth = 1;

		JLabel paymentMethodLabel = new JLabel("Payment Method:");
		paymentGbc.gridx = 0;
		paymentGbc.gridy = 3;
		paymentPanel.add(paymentMethodLabel, paymentGbc);

		paymentComboBox = new JComboBox<>(METHODS);
		paymentComboBox.setPreferredSize(new Dimension(200, 25));
		paymentGbc.gridx = 1;
		paymentPanel.add(paymentComboBox, paymentGbc);

		gbc.gridy = 2;
		add(paymentPanel, gbc);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridBagLayout());
		GridBagConstraints buttonGbc = new GridBagConstraints();
		buttonGbc.insets = new Insets(0, 10, 0, 10);

		JButton backButton = new JButton("Back");
		backButton.setPreferredSize(new Dimension(100, 30));
		buttonGbc.gridx = 0;
		buttonPanel.add(backButton, buttonGbc);

		JButton payButton = new JButton("Pay Deposit");
		payButton.setPreferredSize(new Dimension(120, 30));
		buttonGbc.gridx = 1;
		buttonPanel.add(payButton, buttonGbc);

		gbc.gridy = 3;
		gbc.insets = new Insets(30, 15, 20, 15);
		add(buttonPanel, gbc);

		backButton.addActionListener(e -> handleBack());
		payButton.addActionListener(e -> handlePay());

		styleValueLabels(lotValueLabel, spaceValueLabel, durationValueLabel, depositValueLabel, totalValueLabel);
	}

	private void addLabelAndValue(JPanel panel, String labelText, JLabel valueLabel, GridBagConstraints gbc, int row) {
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

			SuccessDialog.show(this, "Deposit Payment Successful",
					"Deposit has been processed successfully. Your parking space is now reserved. "
							+ "Final payment will be collected at checkout.");

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
