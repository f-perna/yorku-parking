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
import controllers.NavigationController;
import controllers.PaymentController;
import controllers.factory.ControllerFactory;
import controllers.ParkingSensorController;
import models.booking.Booking;
import models.client.Client;
import models.payment.Payment;
import models.ParkingSystemException;
import views.dialog.ErrorDialog;

@SuppressWarnings("serial")
public class ClientPage extends JPanel {
	private BookingController bookingController;
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

	// Constants for UI colors
	private static final Color COLOR_SUCCESS = new Color(0, 128, 0); // Green
	private static final Color COLOR_WARNING = new Color(255, 128, 0); // Orange
	private static final Color COLOR_ERROR = Color.RED;
	private static final Color COLOR_INACTIVE = new Color(128, 128, 128); // Grey

	@SuppressWarnings("unused")
	public ClientPage(JFrame parent) {
		this.bookingController = ControllerFactory.getInstance().getBookingController();
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
		carPresenceLabel = new JLabel("Car at Space: ");
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
			// Check if the booking has started or if it's an early arrival
			boolean isEarlyArrival = LocalDateTime.now().isBefore(selectedBooking.getStartTime());

			// Park the user's car (using the licence plate from the booking)
			// We'll pass a new parameter to the controller to separate car detection from
			// check-in
			parkingSensorController.simulateCarArrival(selectedBooking, !isEarlyArrival);

			// Different messages based on early arrival or regular check-in
			String message;
			if (isEarlyArrival) {
				message = "Your car has been detected at the parking space.\n"
						+ "Since you arrived before your booking start time, you're not checked in yet.\n"
						+ "Your booking will automatically check in at the scheduled start time.";
			} else {
				message = "Your car has been detected at the parking space.\n" + "Your booking is now checked in.";
			}

			JOptionPane.showMessageDialog(this, message, "Parking Successful", JOptionPane.INFORMATION_MESSAGE);

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

			// Skip payment flow if booking is already canceled or still in CONFIRMED status
			// (early arrival)
			if (selectedBooking.getStatus() == Booking.BookingStatus.CANCELED) {
				JOptionPane.showMessageDialog(this, "Your car has been removed from a cancelled booking space.",
						"Car Removed", JOptionPane.INFORMATION_MESSAGE);
				refresh();
				return;
			} else if (selectedBooking.getStatus() == Booking.BookingStatus.CONFIRMED) {
				JOptionPane.showMessageDialog(this,
						"Your car has been removed before official check-in. Your booking is still active and will be available at the scheduled start time.",
						"Early Arrival Departure", JOptionPane.INFORMATION_MESSAGE);
				refresh();
				return;
			}

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

			refresh();
		} catch (ParkingSystemException ex) {
			JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
			bookingsList.setSelectedIndex(bookingsList.getItemCount() - 1);
			refreshBookingInfo();
		} else {
			hideAllBookingDetails();
		}
	}

	private void hideAllBookingDetails() {
		setVisibility(false, lotLabel, lotValue, spaceLabel, spaceValue, durationLabel, durationValue,
				statusLabel, statusValue, depositLabel, depositValue, totalLabel, totalValue,
				paymentsLabel, paymentsScrollPane, carPresenceLabel, carPresenceValue,
				licencePlateLabel, licencePlateValue);

		hideAllActionButtons();
	}

	private void setVisibility(boolean visible, Component... components) {
		for (Component component : components) {
			component.setVisible(visible);
		}
	}

	private void hideAllActionButtons() {
		setVisibility(false, simulateCarArrivalButton, simulateCarDepartureButton,
				completeCheckoutButton, extendTimeButton, deleteButton);
	}

	public void refreshBookingInfo() {
		try {
			Booking selectedBooking = (Booking) bookingsList.getSelectedItem();
			if (selectedBooking == null) {
				hideAllBookingDetails();
				return;
			}

			try {
				updateBookingDetails(selectedBooking);
				updateCarPresenceInfo(selectedBooking);
				updatePaymentsList(selectedBooking);
				showAllBookingDetails();
				updateActionButtonsForStatus(selectedBooking);
			} catch (Exception e) {
				ErrorDialog.show(this, "Error", "Could not load booking details: " + e.getMessage());
				return;
			}
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not refresh booking information: " + e.getMessage());
		}
	}

	private void updateBookingDetails(Booking booking) {
		lotValue.setText(booking.getParkingSpace().getLot().getName());
		spaceValue.setText(booking.getParkingSpace().getName());
		durationValue.setText(booking.getDuration());
		statusValue.setText(booking.getStatus().toString());
		depositValue.setText(Double.toString(booking.getDeposit()));
		totalValue.setText(Double.toString(booking.deductedPrice()));
		licencePlateValue.setText(booking.getClient().getLicencePlate());

		// Reset status text color and font
		statusValue.setForeground(Color.BLACK);
		statusValue.setFont(new Font(statusValue.getFont().getName(), Font.PLAIN, statusValue.getFont().getSize()));

		// Set status colors based on booking status
		Booking.BookingStatus status = booking.getStatus();
		if (status == Booking.BookingStatus.OVERSTAYED) {
			statusValue.setForeground(COLOR_ERROR);
			statusValue.setFont(new Font(statusValue.getFont().getName(), Font.BOLD, statusValue.getFont().getSize()));
		} else if (status == Booking.BookingStatus.EXPIRED) {
			statusValue.setForeground(COLOR_WARNING);
			statusValue.setFont(new Font(statusValue.getFont().getName(), Font.BOLD, statusValue.getFont().getSize()));
		} else if (status == Booking.BookingStatus.CANCELED) {
			statusValue.setForeground(COLOR_INACTIVE);
		}
	}

	private void updateCarPresenceInfo(Booking booking) {
		boolean isCarPresent = parkingSensorController.isCarPresentAtSpace(booking.getParkingSpace());
		boolean isOwnerCar = parkingSensorController.isBookingOwnerCar(booking);
		String detectedPlate = parkingSensorController.getDetectedLicencePlate(booking.getParkingSpace());
		boolean isActiveBooking = booking.getStatus() == Booking.BookingStatus.CONFIRMED
				|| booking.getStatus() == Booking.BookingStatus.CHECKED_IN
				|| booking.getStatus() == Booking.BookingStatus.OVERSTAYED;

		if (isCarPresent) {
			if (isActiveBooking) {
				if (isOwnerCar) {
					carPresenceValue.setText("Yes - Your car is detected");
					carPresenceValue.setForeground(COLOR_SUCCESS);
				} else {
					carPresenceValue.setText("Yes - Unauthorized vehicle (" + detectedPlate + ")");
					carPresenceValue.setForeground(COLOR_WARNING);
				}
			} else {
				carPresenceValue.setText("Yes - Car with plate: " + detectedPlate);
				carPresenceValue.setForeground(Color.BLACK);
			}
		} else {
			carPresenceValue.setText("No - Space is empty");
			carPresenceValue.setForeground(COLOR_ERROR);
		}
	}

	private void updatePaymentsList(Booking booking) {
		paymentsListModel.clear();
		List<Payment> payments = paymentController.getPaymentsForBooking(booking);
		for (Payment payment : payments) {
			paymentsListModel.addElement(payment);
		}
	}

	private void showAllBookingDetails() {
		setVisibility(true, lotLabel, lotValue, spaceLabel, spaceValue, durationLabel, durationValue,
				statusLabel, statusValue, depositLabel, depositValue, totalLabel, totalValue,
				paymentsLabel, paymentsScrollPane, carPresenceLabel, carPresenceValue,
				licencePlateLabel, licencePlateValue);
	}

	private void updateActionButtonsForStatus(Booking booking) {
		// Start by hiding all buttons
		hideAllActionButtons();

		Booking.BookingStatus status = booking.getStatus();
		boolean isCarPresent = parkingSensorController.isCarPresentAtSpace(booking.getParkingSpace());
		boolean isOwnerCar = parkingSensorController.isBookingOwnerCar(booking);

		switch (status) {
			case CONFIRMED:
				simulateCarArrivalButton.setVisible(!isCarPresent);
				simulateCarDepartureButton.setVisible(isCarPresent);
				break;

			case CHECKED_IN:
				simulateCarArrivalButton.setVisible(!isCarPresent);
				simulateCarDepartureButton.setVisible(isCarPresent);
				completeCheckoutButton.setVisible(!isCarPresent);
				if (!isCarPresent) {
					styleCheckoutButton(completeCheckoutButton);
				}
				break;

			case OVERSTAYED:
				simulateCarDepartureButton.setVisible(isCarPresent);
				completeCheckoutButton.setVisible(!isCarPresent);
				if (!isCarPresent) {
					styleCheckoutButton(completeCheckoutButton);
				}
				if (!warningShown && isCarPresent) {
					showOverstayWarning();
				}
				break;

			case EXPIRED:
				completeCheckoutButton.setVisible(true);
				styleCheckoutButton(completeCheckoutButton);
				if (!warningShown) {
					showExpiredNotification();
				}
				break;

			case CANCELED:
				boolean isLatestBooking = bookingController.isLatestBookingForSpaceAndClient(booking);
				simulateCarDepartureButton.setVisible(isCarPresent && isOwnerCar && isLatestBooking);
				break;
		default:
			break;
		}

		// Update extend time button (for PENDING, CONFIRMED, CHECKED_IN)
		extendTimeButton.setVisible(status == Booking.BookingStatus.PENDING
				|| status == Booking.BookingStatus.CONFIRMED
				|| status == Booking.BookingStatus.CHECKED_IN);

		// Update cancel button (for PENDING or CONFIRMED before start time)
		deleteButton.setVisible((status == Booking.BookingStatus.PENDING
				|| status == Booking.BookingStatus.CONFIRMED)
				&& !LocalDateTime.now().isAfter(booking.getStartTime()));
	}

	private void styleCheckoutButton(JButton button) {
		button.setForeground(COLOR_SUCCESS);
		button.setFont(new Font(button.getFont().getName(), Font.BOLD, button.getFont().getSize()));
	}

	private void showOverstayWarning() {
		JOptionPane.showMessageDialog(this,
				"WARNING: Your booking has expired but your car is still in the parking space.\n"
						+ "You must remove your car and complete checkout to avoid additional fees.\n"
						+ "You cannot make new bookings until this is resolved.",
				"Booking Overstayed", JOptionPane.WARNING_MESSAGE);
		warningShown = true;
	}

	private void showExpiredNotification() {
		JOptionPane.showMessageDialog(this,
				"Your booking has expired and your car has been detected as removed.\n"
						+ "Please complete checkout by clicking the 'Complete Checkout' button to finalize payment.",
				"Booking Expired", JOptionPane.INFORMATION_MESSAGE);
		warningShown = true;
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

		boolean isCarPresent = false;
		try {
			isCarPresent = parkingSensorController.isCarPresentAtSpace(selectedBooking.getParkingSpace());
		} catch (Exception ex) {
			// Ignore exceptions here - we'll just assume no car is present
		}

		String confirmMessage = "Are you sure you want to cancel this booking?";
		if (isCarPresent) {
			confirmMessage += "\n\nNOTE: Your car is still in the parking space. After cancellation, you'll need to remove it.";
		}

		int confirm = JOptionPane.showConfirmDialog(this, confirmMessage, "Confirm Cancellation",
				JOptionPane.YES_NO_OPTION);

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

		Booking.BookingStatus status = selectedBooking.getStatus();
		if (status != Booking.BookingStatus.CHECKED_IN && status != Booking.BookingStatus.OVERSTAYED
				&& status != Booking.BookingStatus.EXPIRED) {
			JOptionPane.showMessageDialog(this,
					"Checkout can only be completed for checked-in, expired, or overstayed bookings", "Invalid Status",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

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
@SuppressWarnings("serial")
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
