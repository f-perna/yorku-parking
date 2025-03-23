package views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controllers.ControllerFactory;
import controllers.SuperManagerController;
import models.manager.Manager;

public class SuperManagerPage extends JPanel {

	private SuperManagerController superManagerController;
	private JTable managersTable;
	private DefaultTableModel tableModel;
	private JLabel statusLabel;
	private JPanel credentialsPanel;

	public SuperManagerPage(JFrame parent) {
		superManagerController = ControllerFactory.getInstance().getSuperManagerController();
		setLayout(new BorderLayout(10, 10));
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		// Title Panel
		JPanel titlePanel = new JPanel();
		JLabel titleLabel = new JLabel("Super Manager Dashboard");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		titlePanel.add(titleLabel);
		add(titlePanel, BorderLayout.NORTH);

		// Main Content Panel
		JPanel contentPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.fill = GridBagConstraints.BOTH;

		// Control Panel (buttons for actions)
		JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
		JButton generateButton = new JButton("Generate New Manager Account");
		JButton removeButton = new JButton("Remove Selected Manager");
		JButton refreshButton = new JButton("Refresh List");

		controlPanel.add(generateButton);
		controlPanel.add(removeButton);
		controlPanel.add(refreshButton);

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		contentPanel.add(controlPanel, gbc);

		// Status Label
		statusLabel = new JLabel("Ready", SwingConstants.CENTER);
		statusLabel.setFont(new Font("Arial", Font.PLAIN, 14));
		gbc.gridx = 0;
		gbc.gridy = 1;
		contentPanel.add(statusLabel, gbc);

		// Credentials Panel (to display newly generated credentials)
		credentialsPanel = new JPanel(new GridBagLayout());
		credentialsPanel.setBorder(BorderFactory.createTitledBorder("Generated Credentials"));
		credentialsPanel.setPreferredSize(new Dimension(300, 100));
		credentialsPanel.setVisible(false);

		gbc.gridx = 0;
		gbc.gridy = 2;
		contentPanel.add(credentialsPanel, gbc);

		// Table for displaying managers
		String[] columnNames = { "Email", "Password" };
		tableModel = new DefaultTableModel(columnNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		managersTable = new JTable(tableModel);
		managersTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		managersTable.getTableHeader().setReorderingAllowed(false);

		JScrollPane scrollPane = new JScrollPane(managersTable);
		scrollPane.setPreferredSize(new Dimension(500, 300));

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.weighty = 1.0;
		contentPanel.add(scrollPane, gbc);

		add(contentPanel, BorderLayout.CENTER);

		// Event Handlers
		generateButton.addActionListener(e -> generateManager());
		removeButton.addActionListener(e -> removeSelectedManager());
		refreshButton.addActionListener(e -> refreshManagersList());

	}

	private void generateManager() {
		try {
			// Generate a new manager account
			Manager newManager = superManagerController.generateAndGetManagerAccount();

			if (newManager != null) {
				// Display success message
				statusLabel.setText("Manager account created successfully");

				// Display the credentials
				showCredentials(newManager.getEmail(), newManager.getPassword());

				// Refresh the list
				refreshManagersList();
			} else {
				statusLabel.setText("Failed to create manager account");
			}
		} catch (Exception e) {
			statusLabel.setText("Error: " + e.getMessage());
		}
	}

	private void showCredentials(String email, String password) {
		// Clear the panel
		credentialsPanel.removeAll();
		credentialsPanel.setVisible(true);

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.insets = new Insets(5, 5, 5, 5);

		// Email
		gbc.gridx = 0;
		gbc.gridy = 0;
		credentialsPanel.add(new JLabel("Email:"), gbc);

		gbc.gridx = 1;
		JLabel emailLabel = new JLabel(email);
		emailLabel.setFont(emailLabel.getFont().deriveFont(Font.BOLD));
		credentialsPanel.add(emailLabel, gbc);

		// Password
		gbc.gridx = 0;
		gbc.gridy = 1;
		credentialsPanel.add(new JLabel("Password:"), gbc);

		gbc.gridx = 1;
		JLabel passwordLabel = new JLabel(password);
		passwordLabel.setFont(passwordLabel.getFont().deriveFont(Font.BOLD));
		credentialsPanel.add(passwordLabel, gbc);

		// Copy to clipboard button
		JButton copyButton = new JButton("Copy to Clipboard");
		copyButton.addActionListener(e -> {
			String credentials = "Email: " + email + "\nPassword: " + password;
			java.awt.Toolkit.getDefaultToolkit().getSystemClipboard()
					.setContents(new java.awt.datatransfer.StringSelection(credentials), null);
			statusLabel.setText("Credentials copied to clipboard");
		});

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		credentialsPanel.add(copyButton, gbc);

		credentialsPanel.revalidate();
		credentialsPanel.repaint();
	}

	private void removeSelectedManager() {
		int selectedRow = managersTable.getSelectedRow();
		if (selectedRow >= 0) {
			String email = (String) tableModel.getValueAt(selectedRow, 0);
			try {
				boolean success = superManagerController.removeManager(email);
				if (success) {
					statusLabel.setText("Manager removed successfully");
					refreshManagersList();
				} else {
					statusLabel.setText("Failed to remove manager");
				}
			} catch (Exception e) {
				statusLabel.setText("Error: " + e.getMessage());
			}
		} else {
			statusLabel.setText("Please select a manager to remove");
		}
	}

	private void refreshManagersList() {
		try {
			// Clear the table
			tableModel.setRowCount(0);

			// Get all managers
			List<Manager> managers = superManagerController.getAllManagers();

			// Add managers to table
			for (Manager manager : managers) {
				String[] row = { manager.getEmail(), manager.getPassword() };
				tableModel.addRow(row);
			}

			if (managers.isEmpty()) {
				statusLabel.setText("No managers found");
			} else {
				statusLabel.setText(managers.size() + " managers loaded");
			}

		} catch (Exception e) {
			statusLabel.setText("Error loading managers: " + e.getMessage());
		}
	}

	public void refresh() {
		// Clear any previous error messages
		statusLabel.setText("Ready");
		// Refresh the manager list
		refreshManagersList();
	}
}