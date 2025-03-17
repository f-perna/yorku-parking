package views;

import javax.swing.*;

import booking.Booking;
import client.Client;
import controllers.NavigationController;
import parking.ParkingLot;
import parking.ParkingSpace;
import parking.ParkingSpace.ParkingStatus;
import parking.ParkingSystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

public class BookingPage extends JPanel {
	
	private ParkingSystem parkingSystem = ParkingSystem.getInstance();
	
	private final String[] DURATIONS = {"1 Hour", "2 Hours", "3 Hours"};
	private JComboBox<ParkingLot> lotComboBox;
	private JComboBox<ParkingSpace> spaceComboBox;
	private JComboBox<String> durationComboBox;
	
	public BookingPage(JFrame parent) {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.CENTER;

		JLabel titleLabel = new JLabel("New Booking");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(titleLabel, gbc);
		
		JLabel lotLabel = new JLabel("Lot:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(lotLabel, gbc);
		
		lotComboBox = new JComboBox<>();
		gbc.gridx = 1;
		add(lotComboBox, gbc);
		
		JLabel spaceLabel = new JLabel("Space:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(spaceLabel, gbc);
		
		spaceComboBox = new JComboBox<>();
		gbc.gridx = 1;
		add(spaceComboBox, gbc);
		
		lotComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateSpaces();
			}
		});
		
		JLabel durationLabel = new JLabel("Duration: ");
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(durationLabel, gbc);
		
		durationComboBox = new JComboBox<>(DURATIONS);
		gbc.gridx = 1;
		add(durationComboBox, gbc);
		
		JButton backButton = new JButton("Back");
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(backButton, gbc);
		backButton.addActionListener((ActionEvent e) -> handleBack());
		
		JButton continueButton = new JButton("Continue");
		gbc.gridx = 1;
		add(continueButton, gbc);
		continueButton.addActionListener((ActionEvent e) -> handleContinue());
	}
	
	private void handleBack() {
		ClientPage clientPage = (ClientPage) NavigationController.getPage("Client");
		clientPage.refresh();
		NavigationController.showPage("Client");
		
	}
	
	private void handleContinue() {
		Map<String, Integer> durationAmounts = new HashMap<>();
		durationAmounts.put("1 Hour", 1);  // Example price for 1 hour
		durationAmounts.put("2 Hours", 2); // Example price for 2 hours
		durationAmounts.put("3 Hours", 3);
		
		int durationAmount = durationAmounts.get(durationComboBox.getSelectedItem());
		
		parkingSystem.createBooking((ParkingSpace) spaceComboBox.getSelectedItem(), durationAmount);
		ClientPage clientPage = (ClientPage) NavigationController.getPage("Client");
		clientPage.refresh();
		NavigationController.showPage("Client");
		
	}
	
	public void refresh() {
	     List<ParkingLot> availableLots = parkingSystem.getParkingLots();
	     
	     lotComboBox.removeAllItems();
	     
	     for (ParkingLot parkingLot : availableLots) {
	    	 lotComboBox.addItem(parkingLot);
	     }
	}
	
	private void updateSpaces() {
	    spaceComboBox.removeAllItems();
	    
	    ParkingLot selectedLot = (ParkingLot) lotComboBox.getSelectedItem();
	    if (selectedLot != null) {
	        List<ParkingSpace> parkingSpaces = selectedLot.getParkingSpaces();
	        
	        for (ParkingSpace parkingSpace : parkingSpaces) {
	        	if (parkingSpace.getStatus() == ParkingStatus.AVAILABLE) {
	        		spaceComboBox.addItem(parkingSpace);
	        	}
	        }
	    }
	}
}