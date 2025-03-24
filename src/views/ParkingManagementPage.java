package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controllers.ControllerFactory;
import controllers.ManagerController;
import controllers.NavigationController;
import models.ParkingSystemException;
import models.parkingLot.ParkingLot;
import models.parkingSpace.ParkingSpace;
import models.parkingSpace.ParkingSpace.ParkingSpaceStatus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.UUID;

public class ParkingManagementPage extends JPanel {
	private ManagerController managerController;
	private JFrame parentFrame;
	private JTable parkingLotsTable;
	private JTable parkingSpacesTable;
	private DefaultTableModel lotsTableModel;
	private DefaultTableModel spacesTableModel;
	private ParkingLot selectedLot;
	private JLabel spacesInfoLabel;

	public ParkingManagementPage(JFrame parent) {
		this.parentFrame = parent;
		this.managerController = ControllerFactory.getInstance().getManagerController();

		setLayout(new BorderLayout());

		JLabel titleLabel = new JLabel("Parking Management", SwingConstants.CENTER);
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		add(titleLabel, BorderLayout.NORTH);

		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setDividerLocation(400);
		splitPane.setResizeWeight(0.5);

		JPanel parkingLotsPanel = createParkingLotsPanel();
		JPanel parkingSpacesPanel = createParkingSpacesPanel();

		splitPane.setLeftComponent(parkingLotsPanel);
		splitPane.setRightComponent(parkingSpacesPanel);

		add(splitPane, BorderLayout.CENTER);

		JPanel navigationPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JButton backButton = new JButton("Back to Dashboard");
		backButton.addActionListener(e -> NavigationController.showPage("ManagerDashboard"));
		navigationPanel.add(backButton);
		add(navigationPanel, BorderLayout.SOUTH);

		loadParkingLots();
	}

	private JPanel createParkingLotsPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(BorderFactory.createTitledBorder("Parking Lots"));

		// Create table for parking lots
		String[] columns = { "Name", "State" };
		lotsTableModel = new DefaultTableModel(columns, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		parkingLotsTable = new JTable(lotsTableModel);
		parkingLotsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// Add selection listener to show spaces for selected lot
		parkingLotsTable.getSelectionModel().addListSelectionListener(e -> {
			if (!e.getValueIsAdjusting() && parkingLotsTable.getSelectedRow() != -1) {
				List<ParkingLot> lots = managerController.getAllParkingLots();
				selectedLot = lots.get(parkingLotsTable.getSelectedRow());
				loadParkingSpacesForLot(selectedLot.getID());
			}
		});

		JScrollPane scrollPane = new JScrollPane(parkingLotsTable);
		panel.add(scrollPane, BorderLayout.CENTER);

		// Buttons panel for lot operations
		JPanel buttonsPanel = new JPanel();
		JButton addButton = new JButton("Add Lot");
		JButton enableButton = new JButton("Enable Lot");
		JButton disableButton = new JButton("Disable Lot");
		JButton refreshButton = new JButton("Refresh");

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(parentFrame, "Enter parking lot name:");
				if (name != null && !name.trim().isEmpty()) {
					managerController.addParkingLot(name.trim());
					loadParkingLots();
				}
			}
		});

		enableButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (selectedLot != null) {
					if (managerController.enableParkingLot(selectedLot)) {
						JOptionPane.showMessageDialog(parentFrame, "Parking lot enabled successfully!");
						loadParkingLots();
					} else {
						JOptionPane.showMessageDialog(parentFrame, "Failed to enable parking lot.");
					}
				} else {
					JOptionPane.showMessageDialog(parentFrame, "Please select a parking lot.");
				}
			}
		});

		disableButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (selectedLot != null) {
					if (managerController.disableParkingLot(selectedLot)) {
						JOptionPane.showMessageDialog(parentFrame, "Parking lot disabled successfully!");
						loadParkingLots();
					} else {
						JOptionPane.showMessageDialog(parentFrame, "Failed to disable parking lot.");
					}
				} else {
					JOptionPane.showMessageDialog(parentFrame, "Please select a parking lot.");
				}
			}
		});

		refreshButton.addActionListener(e -> loadParkingLots());

		buttonsPanel.add(addButton);
		buttonsPanel.add(enableButton);
		buttonsPanel.add(disableButton);
		buttonsPanel.add(refreshButton);

		panel.add(buttonsPanel, BorderLayout.SOUTH);

		return panel;
	}

	private JPanel createParkingSpacesPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(BorderFactory.createTitledBorder("Parking Spaces"));

		// Add info label
		spacesInfoLabel = new JLabel("Select a lot to view its spaces", SwingConstants.CENTER);
		panel.add(spacesInfoLabel, BorderLayout.NORTH);

		// Create table for parking spaces
		String[] columns = { "Name", "Status", "State" };
		spacesTableModel = new DefaultTableModel(columns, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		parkingSpacesTable = new JTable(spacesTableModel);
		parkingSpacesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JScrollPane scrollPane = new JScrollPane(parkingSpacesTable);
		panel.add(scrollPane, BorderLayout.CENTER);

		// Buttons panel for space operations
		JPanel buttonsPanel = new JPanel();
		JButton addButton = new JButton("Add Space");
		JButton enableButton = new JButton("Enable Space");
		JButton disableButton = new JButton("Disable Space");
		JButton refreshButton = new JButton("Refresh");

		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (selectedLot != null) {
					String spaceName = JOptionPane.showInputDialog(parentFrame, "Enter space name (e.g. A1, B2):");
					if (spaceName != null && !spaceName.trim().isEmpty()) {
						try {
							// Create new parking space for selected lot
							managerController.addParkingSpace(selectedLot, spaceName.trim());
							JOptionPane.showMessageDialog(parentFrame,
									"Space '" + spaceName.trim() + "' added to lot '" + selectedLot.getName() + "'");
							loadParkingSpacesForLot(selectedLot.getID());
						} catch (ParkingSystemException ex) {
							JOptionPane.showMessageDialog(parentFrame, ex.getMessage(), "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				} else {
					JOptionPane.showMessageDialog(parentFrame, "Please select a parking lot first.");
				}
			}
		});

		enableButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (selectedLot != null && parkingSpacesTable.getSelectedRow() != -1) {
					List<ParkingSpace> spaces = managerController.getParkingSpacesForLot(selectedLot.getID());
					if (spaces.isEmpty()) {
						JOptionPane.showMessageDialog(parentFrame, "No spaces found for this lot.");
						return;
					}

					ParkingSpace selectedSpace = spaces.get(parkingSpacesTable.getSelectedRow());

					try {
						ParkingSpace updatedSpace = managerController.enableParkingSpace(selectedSpace);
						if (updatedSpace != null) {
							JOptionPane.showMessageDialog(parentFrame,
									"Parking space administratively enabled successfully!");
							loadParkingSpacesForLot(selectedLot.getID());
						}
					} catch (ParkingSystemException ex) {
						JOptionPane.showMessageDialog(parentFrame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(parentFrame, "Please select a parking space.");
				}
			}
		});

		disableButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (selectedLot != null && parkingSpacesTable.getSelectedRow() != -1) {
					List<ParkingSpace> spaces = managerController.getParkingSpacesForLot(selectedLot.getID());
					if (spaces.isEmpty()) {
						JOptionPane.showMessageDialog(parentFrame, "No spaces found for this lot.");
						return;
					}

					ParkingSpace selectedSpace = spaces.get(parkingSpacesTable.getSelectedRow());

					try {
						ParkingSpace updatedSpace = managerController.disableParkingSpace(selectedSpace);
						if (updatedSpace != null) {
							if (updatedSpace.getStatus() == ParkingSpaceStatus.OCCUPIED
									|| updatedSpace.getStatus() == ParkingSpaceStatus.BOOKED) {
								JOptionPane.showMessageDialog(parentFrame,
										"Space is currently in use but has been administratively disabled. No new bookings will be allowed.",
										"Space Administratively Disabled", JOptionPane.INFORMATION_MESSAGE);
							} else {
								JOptionPane.showMessageDialog(parentFrame,
										"Parking space administratively disabled successfully!");
							}
							loadParkingSpacesForLot(selectedLot.getID());
						}
					} catch (ParkingSystemException ex) {
						JOptionPane.showMessageDialog(parentFrame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(parentFrame, "Please select a parking space.");
				}
			}
		});

		refreshButton.addActionListener(e -> {
			if (selectedLot != null) {
				loadParkingSpacesForLot(selectedLot.getID());
			} else {
				JOptionPane.showMessageDialog(parentFrame, "Please select a parking lot first.");
			}
		});

		buttonsPanel.add(addButton);
		buttonsPanel.add(enableButton);
		buttonsPanel.add(disableButton);
		buttonsPanel.add(refreshButton);

		panel.add(buttonsPanel, BorderLayout.SOUTH);

		return panel;
	}

	private void loadParkingLots() {
		lotsTableModel.setRowCount(0);
		List<ParkingLot> parkingLots = managerController.getAllParkingLots();

		for (ParkingLot lot : parkingLots) {
			Object[] row = { lot.getName(), lot.isEnabled() ? "Enabled" : "Disabled" };
			lotsTableModel.addRow(row);
		}

		// Clear spaces table when lots are reloaded
		spacesTableModel.setRowCount(0);
		spacesInfoLabel.setText("Select a lot to view its spaces");
		selectedLot = null;
	}

	private void loadParkingSpacesForLot(UUID lotId) {
		spacesTableModel.setRowCount(0);
		List<ParkingSpace> spaces = managerController.getParkingSpacesForLot(lotId);

		if (spaces.isEmpty()) {
			spacesInfoLabel
					.setText("No spaces for lot '" + selectedLot.getName() + "'. Click 'Add Space' to create one.");
		} else {
			int spacesLeft = 100 - spaces.size();
			spacesInfoLabel.setText("Showing " + spaces.size() + " spaces for lot '" + selectedLot.getName() + "'. "
					+ (spacesLeft > 0 ? spacesLeft + " more can be added." : "Maximum spaces reached."));

			for (ParkingSpace space : spaces) {
				String statusText;
				String administrativeState;

				// Use the actual ParkingSpaceStatus to determine the displayed status
				if (space.getStatus() == ParkingSpaceStatus.AVAILABLE) {
					statusText = "Available";
				} else if (space.getStatus() == ParkingSpaceStatus.BOOKED) {
					statusText = "Booked";
				} else if (space.getStatus() == ParkingSpaceStatus.OCCUPIED) {
					statusText = "Occupied";
				} else {
					statusText = space.getStatus().toString();
				}

				// Display administrative state separately
				administrativeState = space.isEnabled() ? "Enabled" : "Disabled";

				Object[] row = { space.getName(), statusText, administrativeState };
				spacesTableModel.addRow(row);
			}
		}
	}
}