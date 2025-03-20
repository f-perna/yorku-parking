package views;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.NavigationController;
import controllers.PaymentController;
import controllers.ControllerFactory;
import models.booking.Booking;
import models.parkingLot.ParkingLot;

public class CheckoutPage extends JPanel {

	private PaymentController paymentController;

	private Booking currentBooking;
	private JLabel lotValueLabel, spaceValueLabel, durationValueLabel, totalValueLabel, depositValueLabel;
	private JComboBox<String> paymentComboBox;
	private final String[] METHODS = { "Debit", "Credit", "Mobile", "Cash" };

	public CheckoutPage(JFrame parent) {
		this.paymentController = ControllerFactory.getInstance().getPaymentController();
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.CENTER;

		JLabel titleLabel = new JLabel("Payment");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(titleLabel, gbc);

		JLabel lotLabel = new JLabel("Lot:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(lotLabel, gbc);

		lotValueLabel = new JLabel("X");
		gbc.gridx = 1;
		add(lotValueLabel, gbc);

		JLabel spaceLabel = new JLabel("Space:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(spaceLabel, gbc);

		spaceValueLabel = new JLabel("X");
		gbc.gridx = 1;
		add(spaceValueLabel, gbc);

		JLabel durationLabel = new JLabel("Duration:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(durationLabel, gbc);

		durationValueLabel = new JLabel("X");
		gbc.gridx = 1;
		add(durationValueLabel, gbc);

		JLabel totalLabel = new JLabel("Total:");
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(totalLabel, gbc);

		totalValueLabel = new JLabel("X");
		gbc.gridx = 1;
		add(totalValueLabel, gbc);

		JLabel paymentLabel = new JLabel("Payment Method:");
		gbc.gridx = 0;
		gbc.gridy = 5;
		add(paymentLabel, gbc);

		paymentComboBox = new JComboBox<>(METHODS);
		gbc.gridx = 1;
		add(paymentComboBox, gbc);

		JLabel depositLabel = new JLabel("Deposit:");
		gbc.gridx = 0;
		gbc.gridy = 6;
		add(depositLabel, gbc);

		depositValueLabel = new JLabel("X");
		gbc.gridx = 1;
		add(depositValueLabel, gbc);

		JButton payButton = new JButton("Pay Deposit");
		gbc.gridx = 1;
		gbc.gridy = 7;
		add(payButton, gbc);
		payButton.addActionListener(e -> handlePay());
	}

	public void refresh(Booking booking) {
		currentBooking = booking;

		lotValueLabel.setText(booking.getParkingSpace().getLot().getName());
		spaceValueLabel.setText(booking.getParkingSpace().getName());
		durationValueLabel.setText(booking.getDuration());
		totalValueLabel.setText(Double.toString(booking.calculatePrice()));
		depositValueLabel.setText(Double.toString(booking.getDeposit()));
	}

	private void handlePay() {
		try {
			paymentController.processPayment(currentBooking, (String) paymentComboBox.getSelectedItem());
			ClientPage clientPage = (ClientPage) NavigationController.getPage("Client");
			clientPage.refresh();
			NavigationController.showPage("Client");
		} catch (IllegalStateException | IllegalArgumentException e) {
			// Handle payment errors appropriately
			System.err.println("Payment error: " + e.getMessage());
		}
	}
}
