package views;

import javax.swing.*;

import controllers.BookingController;
import controllers.ControllerFactory;
import controllers.NavigationController;
import controllers.ParkingLotController;
import controllers.ParkingSpaceController;
import models.booking.Booking;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingPage extends JPanel {
	private BookingController bookingController;
	private ParkingLotController parkingLotController;
	private ParkingSpaceController parkingSpaceController;

	private final String[] DURATIONS = { "1 Hour", "2 Hours", "3 Hours" };
	private JComboBox<ParkingLot> lotComboBox;
	private JComboBox<ParkingSpace> spaceComboBox;
	private JComboBox<String> durationComboBox;

	public BookingPage(JFrame parent) {
		this.bookingController = ControllerFactory.getInstance().getBookingController();
		this.parkingLotController = ControllerFactory.getInstance().getParkingLotController();
		this.parkingSpaceController = ControllerFactory.getInstance().getParkingSpaceController();

		
		System.out.println("LOTS " + this.parkingLotController.getAllParkingLots().size());
		
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 10, 5, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_START;

		JLabel titleLabel = new JLabel("New Booking");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(20, 10, 20, 10);
		gbc.anchor = GridBagConstraints.CENTER;
		add(titleLabel, gbc);

		gbc.insets = new Insets(5, 10, 5, 10);
		gbc.gridwidth = 1;

		JLabel lotLabel = new JLabel("Select Parking Lot:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.anchor = GridBagConstraints.LINE_END;
		add(lotLabel, gbc);

		lotComboBox = new JComboBox<>();
		lotComboBox.setPreferredSize(new Dimension(200, 25));
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		add(lotComboBox, gbc);

		JLabel spaceLabel = new JLabel("Select Space:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.anchor = GridBagConstraints.LINE_END;
		add(spaceLabel, gbc);

		spaceComboBox = new JComboBox<>();
		spaceComboBox.setPreferredSize(new Dimension(200, 25));
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		add(spaceComboBox, gbc);

		lotComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateSpaces();
			}
		});

		JLabel durationLabel = new JLabel("Select Duration:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.LINE_END;
		add(durationLabel, gbc);

		durationComboBox = new JComboBox<>(DURATIONS);
		durationComboBox.setPreferredSize(new Dimension(200, 25));
		gbc.gridx = 1;
		gbc.anchor = GridBagConstraints.LINE_START;
		add(durationComboBox, gbc);
		durationComboBox.insertItemAt(null, 0);
		durationComboBox.setSelectedItem(null);

		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
		JButton backButton = new JButton("Back");
		JButton continueButton = new JButton("Checkout");

		Dimension buttonSize = new Dimension(100, 30);
		backButton.setPreferredSize(buttonSize);
		continueButton.setPreferredSize(buttonSize);

		buttonPanel.add(backButton);
		buttonPanel.add(continueButton);

		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(20, 10, 10, 10);
		gbc.anchor = GridBagConstraints.CENTER;
		add(buttonPanel, gbc);

		backButton.addActionListener((ActionEvent e) -> handleBack());
		continueButton.addActionListener(e -> handleContinue());
	}

	private void handleBack() {
		try {
			ClientPage clientPage = (ClientPage) NavigationController.getPage("Client");
			clientPage.refresh();
			NavigationController.showPage("Client");
		} catch (Exception e) {
			ErrorDialog.show(this, "Navigation Error", "Could not return to client page: " + e.getMessage());
		}
	}

	private void handleContinue() {
		try {
			if (lotComboBox.getSelectedItem() == null) {
				ErrorDialog.show(this, "Booking Error", "Please select a parking lot");
				return;
			}
			if (spaceComboBox.getSelectedItem() == null) {
				ErrorDialog.show(this, "Booking Error", "Please select a parking space");
				return;
			}
			if (durationComboBox.getSelectedItem() == null) {
				ErrorDialog.show(this, "Booking Error", "Please select a duration");
				return;
			}

			Map<String, Integer> durationAmounts = new HashMap<>();
			durationAmounts.put("1 Hour", 1);
			durationAmounts.put("2 Hours", 2);
			durationAmounts.put("3 Hours", 3);

			int durationAmount = durationAmounts.get(durationComboBox.getSelectedItem());
			ParkingSpace selectedSpace = (ParkingSpace) spaceComboBox.getSelectedItem();

			Booking newBooking = bookingController.createBooking(selectedSpace, durationAmount);

			CheckoutPage checkoutPage = (CheckoutPage) NavigationController.getPage("Checkout");
			checkoutPage.refresh(newBooking);
			NavigationController.showPage("Checkout");
		} catch (IllegalArgumentException e) {
			ErrorDialog.show(this, "Invalid Input", e.getMessage());
		} catch (IllegalStateException e) {
			ErrorDialog.show(this, "Booking Error", e.getMessage());
		} catch (Exception e) {
			ErrorDialog.show(this, "Error",
					"An unexpected error occurred while creating the booking: " + e.getMessage());
		}
	}

	public void refresh() {
		try {
			List<ParkingLot> availableLots = parkingLotController.getAllParkingLots();

			lotComboBox.removeAllItems();
			lotComboBox.addItem(null);

			for (ParkingLot parkingLot : availableLots) {
				lotComboBox.addItem(parkingLot);
			}

			lotComboBox.setSelectedItem(null);
			spaceComboBox.removeAllItems();
			spaceComboBox.addItem(null);
			durationComboBox.setSelectedItem(null);
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not load parking lots: " + e.getMessage());
		}
	}

	private void updateSpaces() {
		try {
			spaceComboBox.removeAllItems();
			spaceComboBox.addItem(null);

			ParkingLot selectedLot = (ParkingLot) lotComboBox.getSelectedItem();

			if (selectedLot != null) {
				List<ParkingSpace> availableSpaces = parkingSpaceController.getAvailableSpaces(selectedLot);
				if (availableSpaces.isEmpty()) {
					ErrorDialog.show(this, "No Spaces", "No parking spaces are currently available in this lot");
				} else {
					for (ParkingSpace parkingSpace : availableSpaces) {
						spaceComboBox.addItem(parkingSpace);
					}
				}
			}

			spaceComboBox.setSelectedItem(null);
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not load parking spaces: " + e.getMessage());
		}
	}

	public void refreshForExtension(Booking booking) {
		try {
			if (booking == null) {
				ErrorDialog.show(this, "Error", "No booking selected for extension");
				return;
			}

			refresh();

			ParkingLot lot = booking.getParkingSpace().getLot();
			ParkingSpace space = booking.getParkingSpace();

			if (lot != null && space != null) {
				lotComboBox.setSelectedItem(lot);
				spaceComboBox.setSelectedItem(space);
			} else {
				ErrorDialog.show(this, "Error", "Could not load booking details for extension");
			}

			durationComboBox.setSelectedItem(null);
		} catch (Exception e) {
			ErrorDialog.show(this, "Error", "Could not prepare booking extension: " + e.getMessage());
		}
	}
}