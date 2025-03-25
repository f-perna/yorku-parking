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
import java.time.LocalDateTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import controllers.NavigationController;
import controllers.PaymentController;
import controllers.factory.ControllerFactory;
import controllers.ParkingSensorController;
import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;
import models.ParkingSystemException;
import views.dialog.ErrorDialog;
import views.dialog.SuccessDialog;

public class ClientPage extends JPanel {
	private BookingController bookingController;
	private ClientController clientController;
	private AuthController authController;
	private PaymentController paymentController;
	private ParkingSensorController parkingSensorController;

	private JComboBox<Booking> bookingsList;
	private JLabel welcomeMessage;
	private JLabel bookingLabel, lotLabel, lotValue, spaceLabel, spaceValue, durationLabel, durationValue, depositLabel,
			depositValue, statusLabel, statusValue, totalLabel, totalValue, errorLabel, paymentsLabel;
	private JLabel carPresenceLabel, carPresenceValue;
	private JLabel licencePlateLabel, licencePlateValue;
	private JButton simulateCarArrivalButton, simulateCarDepartureButton, completeCheckoutButton, deleteButton,
			extendTimeButton;
	private JList<Payment> paymentsList;
	private DefaultListModel<Payment> paymentsListModel;
	private JScrollPane paymentsScrollPane;
	private boolean warningShown = false;

	public ClientPage(JFrame parent) {
		this.bookingController = ControllerFactory.getInstance().getBookingController();
		this.clientController = ControllerFactory.getInstance().getClientController();
		this.authController = ControllerFactory.getInstance().getAuthController();
		this.paymentController = ControllerFactory.getInstance().getPaymentController();
		this.parkingSensorController = ControllerFactory.getInstance().getParkingSensorController();
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

		// After totalValue setup, add car presence status
		carPresenceLabel = new JLabel("Car at Your Space: ");
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.anchor = GridBagConstraints.EAST;
		add(carPresenceLabel, gbc);
		carPresenceLabel.setVisible(false);

		carPresenceValue = new JLabel();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(carPresenceValue, gbc);
		carPresenceValue.setVisible(false);

		// After carPresenceValue setup, add licence plate info
		licencePlateLabel = new JLabel("Licence Plate: ");
		gbc.gridx = 0;
		gbc.gridy = 10;
		gbc.anchor = GridBagConstraints.EAST;
		add(licencePlateLabel, gbc);
		licencePlateLabel.setVisible(false);

		licencePlateValue = new JLabel();
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(licencePlateValue, gbc);
		licencePlateValue.setVisible(false);

		// Add payments list
		paymentsLabel = new JLabel("Payments: ");
		gbc.gridx = 0;
		gbc.gridy = 11;
		gbc.anchor = GridBagConstraints.EAST;
		add(paymentsLabel, gbc);
		paymentsLabel.setVisible(false);

		paymentsListModel = new DefaultListModel<>();
		paymentsList = new JList<>(paymentsListModel);
		paymentsList.setCellRenderer(new PaymentListCellRenderer());
		paymentsScrollPane = new JScrollPane(paymentsList);
		paymentsScrollPane.setPreferredSize(new Dimension(300, 80));
		paymentsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.WEST;
		add(paymentsScrollPane, gbc);
		paymentsScrollPane.setVisible(false);

		// Add action buttons for booking
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));

		simulateCarArrivalButton = new JButton("Park Your Car");
		simulateCarDepartureButton = new JButton("Remove Your Car");
		completeCheckoutButton = new JButton("Complete Checkout");
		extendTimeButton = new JButton("Extend Time");
		deleteButton = new JButton("Cancel Booking");

		// Add action listeners to buttons
		simulateCarArrivalButton.addActionListener(e -> handleSimulateCarArrival());
		simulateCarDepartureButton.addActionListener(e -> handleSimulateCarDeparture());
		completeCheckoutButton.addActionListener(e -> handleCompleteCheckout());
		extendTimeButton.addActionListener(e -> handleExtendTime());
		deleteButton.addActionListener(e -> handleCancelBooking());

		buttonPanel.add(simulateCarArrivalButton);
		buttonPanel.add(simulateCarDepartureButton);
		buttonPanel.add(completeCheckoutButton);
		buttonPanel.add(extendTimeButton);
		buttonPanel.add(deleteButton);

		gbc.gridx = 0;
		gbc.gridy = 12;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		add(buttonPanel, gbc);

		simulateCarArrivalButton.setVisible(false);
		simulateCarDepartureButton.setVisible(false);
		completeCheckoutButton.setVisible(false);
		extendTimeButton.setVisible(false);
		deleteButton.setVisible(false);

		errorLabel = new JLabel();
		errorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		gbc.gridx = 0;
		gbc.gridy = 13; // Increased
		gbc.gridwidth = 2;
		gbc.insets = new Insets(10, 10, 20, 10);
		add(errorLabel, gbc);
	}

	private void handleSimulateCarArrival() {
		Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
		if (selectedBooking == null) {
			JOptionPane.showMessageDialog(this, "Please select a booking first", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		try {
			// Park the user's car (using the licence plate from the booking)
			parkingSensorController.simulateCarArrival(selectedBooking);

			// Success message with more details
			String message = "Your car has been detected at the parking space.\n" + "Your booking is now checked in.";
			JOptionPane.showMessageDialog(this, message, "Parking Successful", JOptionPane.INFORMATION_MESSAGE);

			// Make sure to refresh the UI to show the updated status and buttons
			refresh();
		} catch (ParkingSystemException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void handleSimulateCarDeparture() {
		Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
		if (selectedBooking == null) {
			JOptionPane.showMessageDialog(this, "Please select a booking first", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		try {
			parkingSensorController.simulateCarDeparture(selectedBooking);

			// Car departure success message
			String message = "Your car has been removed from the parking space.";
			JOptionPane.showMessageDialog(this, message, "Car Departure Successful", JOptionPane.INFORMATION_MESSAGE);

			boolean isOverstayed = selectedBooking.getStatus() == Booking.BookingStatus.OVERSTAYED;
			String paymentTitle = isOverstayed ? "Overstayed Booking Payment" : "Payment Confirmation";

			// Calculate payment amount
			double finalAmount = selectedBooking.deductedPrice();
			double depositPaid = selectedBooking.getDeposit();
			double totalAmount = selectedBooking.calculatePrice();

			// Show extra warning for overstayed bookings
			String overstayedWarning = isOverstayed
					? "\n\nWARNING: Your booking was overstayed. In the future, please remove your car before your booking ends.\n"
							+ "Repeated violations may result in additional fees or restrictions.\n"
					: "";

			// Show payment confirmation with amount details
			String paymentMessage = String.format(
					"Payment Details:%s\n\n" + "Total parking fee: $%.2f\n" + "Deposit already paid: $%.2f\n"
							+ "Remaining balance: $%.2f\n\n"
							+ "Please select a payment method to complete your booking:",
					overstayedWarning, totalAmount, depositPaid, finalAmount);

			// Simplify the payment method options
			String[] paymentMethods = { "Credit", "Debit", "Cash", "Mobile" };
			String selectedMethod = (String) JOptionPane.showInputDialog(this, paymentMessage, paymentTitle,
					JOptionPane.QUESTION_MESSAGE, null, paymentMethods, paymentMethods[0]);

			if (selectedMethod != null) {
				try {
					Payment payment = paymentController.processFinalPayment(selectedBooking, selectedMethod);
					if (payment != null) {
						// Reset the warning flag when the booking is successfully completed
						warningShown = false;

						JOptionPane.showMessageDialog(this,
								String.format("Payment of $%.2f processed successfully.\nYour booking is now complete.",
										finalAmount),
								"Booking Completed", JOptionPane.INFORMATION_MESSAGE);
					}
				} catch (Exception e) {
					e.printStackTrace(); // Add this for debugging
					JOptionPane.showMessageDialog(this, "Error processing final payment: " + e.getMessage(),
							"Payment Error", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				String warningMsg = isOverstayed
						? "Your car has been removed but the booking is still active and marked as OVERSTAYED.\n"
								+ "You must complete checkout to be able to make new bookings."
						: "Your car has been removed but the booking is still active.\n"
								+ "Please complete payment to finish your booking.";

				JOptionPane.showMessageDialog(this, warningMsg, "Booking Active", JOptionPane.WARNING_MESSAGE);
			}

			// Make sure to refresh the UI to show the updated buttons
			refresh();
		} catch (ParkingSystemException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	private void handleCheckin() {
		// This method is no longer needed as we're using sensor simulation
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
		Client loggedInClient = authController.getLoggedInClient();
		welcomeMessage.setText("Welcome, " + loggedInClient.getEmail());

		bookingsList.removeAllItems();
		paymentsList.removeAll();
		paymentsListModel.clear();

		List<Booking> bookings = bookingController.getBookingsForClient();
		for (Booking booking : bookings) {
			bookingsList.addItem(booking);
		}

		boolean hasBookings = bookings.size() > 0;
		bookingLabel.setVisible(hasBookings);
		bookingsList.setVisible(hasBookings);

		if (hasBookings) {
			// Select the last item (most recent booking) in the list
			bookingsList.setSelectedIndex(bookingsList.getItemCount() - 1);
			refreshBookingInfo();
		} else {
			lotLabel.setVisible(false);
			lotValue.setVisible(false);
			spaceLabel.setVisible(false);
			spaceValue.setVisible(false);
			durationLabel.setVisible(false);
			durationValue.setVisible(false);
			statusLabel.setVisible(false);
			statusValue.setVisible(false);
			depositLabel.setVisible(false);
			depositValue.setVisible(false);
			totalLabel.setVisible(false);
			totalValue.setVisible(false);
			paymentsLabel.setVisible(false);
			paymentsScrollPane.setVisible(false);
			carPresenceLabel.setVisible(false);
			carPresenceValue.setVisible(false);
			licencePlateLabel.setVisible(false);
			licencePlateValue.setVisible(false);

			// Hide all buttons when there are no bookings
			simulateCarArrivalButton.setVisible(false);
			simulateCarDepartureButton.setVisible(false);
			extendTimeButton.setVisible(false);
			deleteButton.setVisible(false);
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
				carPresenceLabel.setVisible(false);
				carPresenceValue.setVisible(false);
				licencePlateLabel.setVisible(false);
				licencePlateValue.setVisible(false);

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

				simulateCarArrivalButton.setVisible(false);
				simulateCarDepartureButton.setVisible(false);
				completeCheckoutButton.setVisible(false);
				extendTimeButton.setVisible(false);
				deleteButton.setVisible(false);
				return;
			}

			try {
				lotValue.setText(selectedBooking.getParkingSpace().getLot().getName());
				spaceValue.setText(selectedBooking.getParkingSpace().getName());
				durationValue.setText(selectedBooking.getDuration());
				statusValue.setText(selectedBooking.getStatus().toString());
				depositValue.setText(Double.toString(selectedBooking.getDeposit()));
				totalValue.setText(Double.toString(selectedBooking.deductedPrice()));

				// Debug information about the booking status
				System.out.println("DEBUG: Booking status: " + selectedBooking.getStatus());

				// Show licence plate information from client
				licencePlateValue.setText(selectedBooking.getClient().getLicencePlate());

				// Update car presence status with more detailed information
				boolean isCarPresent = parkingSensorController.isCarPresentAtSpace(selectedBooking.getParkingSpace());
				boolean isOwnerCar = parkingSensorController.isBookingOwnerCar(selectedBooking);
				String detectedPlate = parkingSensorController
						.getDetectedLicencePlate(selectedBooking.getParkingSpace());

				if (isCarPresent) {
					if (isOwnerCar) {
						// Owner's car is present
						carPresenceValue.setText("Yes - Your car is detected");
						carPresenceValue.setForeground(new Color(0, 128, 0)); // Green for owner's car
					} else {
						// Someone else's car is present
						carPresenceValue.setText("Yes - Unauthorized vehicle (" + detectedPlate + ")");
						carPresenceValue.setForeground(Color.ORANGE); // Orange for unauthorized
					}
				} else {
					// No car present
					carPresenceValue.setText("No - Space is empty");
					carPresenceValue.setForeground(Color.RED); // Red for empty
				}

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
			carPresenceLabel.setVisible(true);
			carPresenceValue.setVisible(true);
			licencePlateLabel.setVisible(true);
			licencePlateValue.setVisible(true);

			Booking.BookingStatus status = selectedBooking.getStatus();
			boolean isCarPresent = parkingSensorController.isCarPresentAtSpace(selectedBooking.getParkingSpace());

			// Show simulation buttons based on booking status AND car presence
			if (status == Booking.BookingStatus.CONFIRMED) {
				// For CONFIRMED bookings: Only show arrival button (standard behavior)
				simulateCarArrivalButton.setVisible(true);
				simulateCarDepartureButton.setVisible(false);
				completeCheckoutButton.setVisible(false);
			} else if (status == Booking.BookingStatus.CHECKED_IN) {
				// For CHECKED_IN bookings: Show buttons based on car presence
				simulateCarArrivalButton.setVisible(!isCarPresent); // Show arrival if car is not present
				simulateCarDepartureButton.setVisible(isCarPresent); // Show departure if car is present

				// Show Complete Checkout button when car is not present (removed but not paid)
				completeCheckoutButton.setVisible(!isCarPresent);
				if (!isCarPresent) {
					completeCheckoutButton.setForeground(new Color(0, 128, 0)); // Green color
					completeCheckoutButton.setFont(new Font(completeCheckoutButton.getFont().getName(), Font.BOLD,
							completeCheckoutButton.getFont().getSize()));
				}
			} else if (status == Booking.BookingStatus.OVERSTAYED) {
				// For OVERSTAYED bookings: show warning and appropriate buttons
				simulateCarArrivalButton.setVisible(false);
				simulateCarDepartureButton.setVisible(isCarPresent); // Only show departure if car is present
				completeCheckoutButton.setVisible(!isCarPresent); // Show checkout if car has been removed

				if (!isCarPresent) {
					completeCheckoutButton.setForeground(new Color(0, 128, 0)); // Green color
					completeCheckoutButton.setFont(new Font(completeCheckoutButton.getFont().getName(), Font.BOLD,
							completeCheckoutButton.getFont().getSize()));
				}

				// Set status text to warning color
				statusValue.setForeground(Color.RED);
				statusValue
						.setFont(new Font(statusValue.getFont().getName(), Font.BOLD, statusValue.getFont().getSize()));

				// Show warning if this is the first time we're showing it
				if (!warningShown && isCarPresent) {
					JOptionPane.showMessageDialog(this,
							"WARNING: Your booking has expired but your car is still in the parking space.\n"
									+ "You must remove your car and complete checkout to avoid additional fees.\n"
									+ "You cannot make new bookings until this is resolved.",
							"Booking Overstayed", JOptionPane.WARNING_MESSAGE);
					warningShown = true;
				}
			} else if (status == Booking.BookingStatus.EXPIRED) {
				// For EXPIRED bookings: show Complete Checkout button
				simulateCarArrivalButton.setVisible(false);
				simulateCarDepartureButton.setVisible(false); // Car is already gone
				completeCheckoutButton.setVisible(true); // Always show checkout for expired bookings

				completeCheckoutButton.setForeground(new Color(0, 128, 0)); // Green color
				completeCheckoutButton.setFont(new Font(completeCheckoutButton.getFont().getName(), Font.BOLD,
						completeCheckoutButton.getFont().getSize()));

				// Set status text to notification color
				statusValue.setForeground(new Color(255, 128, 0)); // Orange for expired
				statusValue
						.setFont(new Font(statusValue.getFont().getName(), Font.BOLD, statusValue.getFont().getSize()));

				// Show notification if this is the first time we're showing it
				if (!warningShown) {
					JOptionPane.showMessageDialog(this,
							"Your booking has expired and your car has been detected as removed.\n"
									+ "Please complete checkout by clicking the 'Complete Checkout' button to finalize payment.",
							"Booking Expired", JOptionPane.INFORMATION_MESSAGE);
					warningShown = true;
				}
			} else {
				// For other statuses: Hide all simulation buttons
				simulateCarArrivalButton.setVisible(false);
				simulateCarDepartureButton.setVisible(false);
				completeCheckoutButton.setVisible(false);
			}

			// Allow extending time for PENDING, CONFIRMED, or CHECKED_IN bookings (not
			// OVERSTAYED or EXPIRED)
			extendTimeButton.setVisible(status == Booking.BookingStatus.PENDING
					|| status == Booking.BookingStatus.CONFIRMED || status == Booking.BookingStatus.CHECKED_IN);

			// Allow canceling only PENDING or CONFIRMED bookings and only before the start
			// time
			deleteButton
					.setVisible((status == Booking.BookingStatus.PENDING || status == Booking.BookingStatus.CONFIRMED)
							&& !LocalDateTime.now().isAfter(selectedBooking.getStartTime()));
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

	private void handleCancelBooking() {
		Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
		if (selectedBooking == null) {
			JOptionPane.showMessageDialog(this, "Please select a booking first", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to cancel this booking?",
				"Confirm Cancellation", JOptionPane.YES_NO_OPTION);

		if (confirm == JOptionPane.YES_OPTION) {
			try {
				double depositAmount = selectedBooking.getDeposit();
				String message = String
						.format("To cancel your booking, you must select a refund method for your deposit of $%.2f.\n\n"
								+ "Please select your preferred refund method:", depositAmount);

				String[] refundMethods = { "Credit", "Debit", "Cash", "Mobile" };
				String selectedMethod = (String) JOptionPane.showInputDialog(this, message, "Deposit Refund Required",
						JOptionPane.INFORMATION_MESSAGE, null, refundMethods, refundMethods[0]);

				if (selectedMethod != null) {
					bookingController.cancelBooking(selectedBooking);

					try {
						paymentController.processRefundPayment(selectedBooking, selectedMethod);

						JOptionPane.showMessageDialog(this, String.format(
								"Your booking has been cancelled and your deposit of $%.2f has been refunded via %s.",
								depositAmount, selectedMethod), "Cancellation Complete",
								JOptionPane.INFORMATION_MESSAGE);

						refresh();
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(this,
								"Error processing refund: " + ex.getMessage() + "\n"
										+ "Please contact customer support for assistance with your refund.",
								"Refund Error", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,
							"Booking cancellation was cancelled. Your booking remains active.", "Cancellation Aborted",
							JOptionPane.INFORMATION_MESSAGE);
				}
			} catch (ParkingSystemException ex) {
				JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	private void handleCompleteCheckout() {
		Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
		if (selectedBooking == null) {
			JOptionPane.showMessageDialog(this, "Please select a booking first", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Check if the booking status is valid for checkout
		Booking.BookingStatus status = selectedBooking.getStatus();
		if (status != Booking.BookingStatus.CHECKED_IN && status != Booking.BookingStatus.OVERSTAYED
				&& status != Booking.BookingStatus.EXPIRED) {
			JOptionPane.showMessageDialog(this,
					"Checkout can only be completed for checked-in, expired, or overstayed bookings", "Invalid Status",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		// Check if car is actually removed (skip for EXPIRED as car is already
		// confirmed removed)
		if (status != Booking.BookingStatus.EXPIRED) {
			boolean isCarPresent = parkingSensorController.isCarPresentAtSpace(selectedBooking.getParkingSpace());
			if (isCarPresent) {
				JOptionPane.showMessageDialog(this,
						"You must remove your car from the parking space before completing checkout",
						"Car Still Present", JOptionPane.WARNING_MESSAGE);
				return;
			}
		}

		boolean isOverstayed = status == Booking.BookingStatus.OVERSTAYED;
		boolean isExpired = status == Booking.BookingStatus.EXPIRED;
		String paymentTitle = isOverstayed ? "Overstayed Booking Payment"
				: isExpired ? "Expired Booking Payment" : "Complete Checkout";

		// Calculate payment amount
		double finalAmount = selectedBooking.deductedPrice();
		double depositPaid = selectedBooking.getDeposit();
		double totalAmount = selectedBooking.calculatePrice();

		// Show appropriate message based on booking status
		String statusWarning = "";
		if (isOverstayed) {
			statusWarning = "\n\nWARNING: Your booking was overstayed. In the future, please remove your car before your booking ends.\n"
					+ "Repeated violations may result in additional fees or restrictions.\n";
		} else if (isExpired) {
			statusWarning = "\n\nYour booking has expired. Thank you for removing your car promptly.\n";
		}

		// Show payment confirmation with amount details
		String paymentMessage = String.format(
				"Payment Details:%s\n\n" + "Total parking fee: $%.2f\n" + "Deposit already paid: $%.2f\n"
						+ "Remaining balance: $%.2f\n\n" + "Please select a payment method to complete your booking:",
				statusWarning, totalAmount, depositPaid, finalAmount);

		// Simplify the payment method options
		String[] paymentMethods = { "Credit", "Debit", "Cash", "Mobile" };
		String selectedMethod = (String) JOptionPane.showInputDialog(this, paymentMessage, paymentTitle,
				JOptionPane.QUESTION_MESSAGE, null, paymentMethods, paymentMethods[0]);

		if (selectedMethod != null) {
			try {
				Payment payment = paymentController.processFinalPayment(selectedBooking, selectedMethod);
				if (payment != null) {
					// Reset the warning flag when the booking is successfully completed
					warningShown = false;

					JOptionPane.showMessageDialog(this,
							String.format("Payment of $%.2f processed successfully.\nYour booking is now complete.",
									finalAmount),
							"Booking Completed", JOptionPane.INFORMATION_MESSAGE);

					refresh();
				}
			} catch (Exception e) {
				e.printStackTrace(); // Add this for debugging
				JOptionPane.showMessageDialog(this, "Error processing final payment: " + e.getMessage(),
						"Payment Error", JOptionPane.ERROR_MESSAGE);
			}
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
