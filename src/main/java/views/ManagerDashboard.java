package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import controllers.ManagerController;
import controllers.NavigationController;
import controllers.factory.ControllerFactory;
import models.client.Client;

@SuppressWarnings("serial")
public class ManagerDashboard extends JPanel {
	private JTable clientsTable;
	private DefaultTableModel tableModel;
	private ManagerController managerController;

	public ManagerDashboard(JFrame parent) {
		managerController = ControllerFactory.getInstance().getManagerController();

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 10, 5, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_START;

		JLabel titleLabel = new JLabel("Manager Dashboard");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(20, 10, 20, 10);
		gbc.anchor = GridBagConstraints.CENTER;
		add(titleLabel, gbc);

		// Create manage lots, spaces panel
		JPanel parkingManagementPanel = createParkingManagementPanel();
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 0.5;
		gbc.fill = GridBagConstraints.BOTH;
		add(parkingManagementPanel, gbc);

		// Create client approval panel
		JPanel clientApprovalPanel = createClientApprovalPanel();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.BOTH;
		add(clientApprovalPanel, gbc);

		loadClients();
	}

	@SuppressWarnings("unused")
	private JPanel createParkingManagementPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(BorderFactory.createTitledBorder("Parking Management"));

		JButton manageParkingButton = new JButton("Manage Parking Lots & Spaces");
		manageParkingButton.addActionListener(e -> NavigationController.showPage("ParkingManagement"));
		panel.add(manageParkingButton, BorderLayout.CENTER);

		return panel;
	}

	@SuppressWarnings({ "unused" })
	private JPanel createClientApprovalPanel() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(BorderFactory.createTitledBorder("Client Approval"));

		// Create table model with columns
		String[] columns = { "Name", "Email", "Type", "Licence Plate", "Status" };
		tableModel = new DefaultTableModel(columns, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		clientsTable = new JTable(tableModel);
		clientsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane(clientsTable);
		panel.add(scrollPane, BorderLayout.CENTER);

		// Create button panel
		JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton approveButton = new JButton("Approve Client");
		JButton denyButton = new JButton("Deny Client");
		JButton refreshButton = new JButton("Refresh");

		buttonPanel.add(approveButton);
		buttonPanel.add(denyButton);
		buttonPanel.add(refreshButton);
		panel.add(buttonPanel, BorderLayout.SOUTH);

		// Add action listeners
		approveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = clientsTable.getSelectedRow();
				if (selectedRow >= 0) {
					String email = (String) tableModel.getValueAt(selectedRow, 1);
					if (managerController.approveClient(email)) {
						JOptionPane.showMessageDialog(panel, "Client approved successfully", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						loadClients();
					} else {
						JOptionPane.showMessageDialog(panel, "Failed to approve client", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(panel, "Please select a client", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		denyButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int selectedRow = clientsTable.getSelectedRow();
				if (selectedRow >= 0) {
					String email = (String) tableModel.getValueAt(selectedRow, 1);
					if (managerController.denyClient(email)) {
						JOptionPane.showMessageDialog(panel, "Client denied", "Success",
								JOptionPane.INFORMATION_MESSAGE);
						loadClients();
					} else {
						JOptionPane.showMessageDialog(panel, "Failed to deny client", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(panel, "Please select a client", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		refreshButton.addActionListener(e -> loadClients());

		return panel;
	}

	private void loadClients() {
		tableModel.setRowCount(0);
		List<Client> clients = managerController.getAllClients();

		for (Client client : clients) {
			Object[] row = {
					client.getName(),
					client.getEmail(),
					client.getType().toString(),
					client.getLicencePlate(),
					client.isApproved() ? "Approved" : "Not Approved"
			};
			tableModel.addRow(row);
		}
	}
}