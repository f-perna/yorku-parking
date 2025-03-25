package views;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import controllers.ClientController;
import controllers.NavigationController;
import controllers.factory.ControllerFactory;
import models.client.Client;
import models.ParkingSystemException;

public class RegisterPage extends JPanel {

	private JTextField nameField, emailField, licencePlateField;
	private JPasswordField passwordField;
	private JLabel statusLabel;
	private JComboBox<Client.type> type;
	private ClientController clientController;
	private Border defaultBorder;
	private Border errorBorder;

	public RegisterPage(JFrame parent) {
		clientController = ControllerFactory.getInstance().getClientController();
		setLayout(new BorderLayout());

		// Create default and error borders
		defaultBorder = BorderFactory.createLineBorder(Color.GRAY);
		errorBorder = BorderFactory.createLineBorder(Color.RED, 2);

		// Create form panel that will contain all form components
		JPanel formPanel = new JPanel(new GridBagLayout());
		formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(8, 8, 8, 8);
		gbc.anchor = GridBagConstraints.WEST;

		// Title
		JLabel titleLabel = new JLabel("Register");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		formPanel.add(titleLabel, gbc);

		// Reset anchor and gridwidth for form fields
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridwidth = 1;

		// Name field
		JLabel nameLabel = new JLabel("Name:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		formPanel.add(nameLabel, gbc);

		nameField = new JTextField(20);
		nameField.setBorder(defaultBorder);
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		formPanel.add(nameField, gbc);

		// Email field
		JLabel emailLabel = new JLabel("Email:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.NONE;
		formPanel.add(emailLabel, gbc);

		emailField = new JTextField(20);
		emailField.setBorder(defaultBorder);
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		formPanel.add(emailField, gbc);

		// Password field
		JLabel passLabel = new JLabel("Password:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.NONE;
		formPanel.add(passLabel, gbc);

		passwordField = new JPasswordField(20);
		passwordField.setBorder(defaultBorder);
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		formPanel.add(passwordField, gbc);

		// Licence Plate field
		JLabel licencePlateLabel = new JLabel("Licence Plate:");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.fill = GridBagConstraints.NONE;
		formPanel.add(licencePlateLabel, gbc);

		licencePlateField = new JTextField(20);
		licencePlateField.setBorder(defaultBorder);
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		formPanel.add(licencePlateField, gbc);

		// Client type selection
		JLabel typeLabel = new JLabel("Type:");
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.fill = GridBagConstraints.NONE;
		formPanel.add(typeLabel, gbc);

		type = new JComboBox<>();
		for (Client.type clientType : Client.type.values()) {
			type.addItem(clientType);
		}
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		formPanel.add(type, gbc);

		// Register button
		JButton registerButton = new JButton("Register");
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		formPanel.add(registerButton, gbc);

		// Status label
		statusLabel = new JLabel(" ");
		statusLabel.setForeground(Color.RED);
		gbc.gridy = 7;
		formPanel.add(statusLabel, gbc);

		// Login link
		JButton goToLogin = new JButton("Already have an account? Login");
		gbc.gridy = 8;
		formPanel.add(goToLogin, gbc);

		// Set preferred size for the form panel
		formPanel.setPreferredSize(new Dimension(400, 450));

		// Add form panel to center of main panel
		add(formPanel, BorderLayout.CENTER);

		// Action listeners
		registerButton.addActionListener(e -> handleRegister());
		goToLogin.addActionListener(e -> NavigationController.showPage("Login"));
	}

	private void handleRegister() {
		// Reset field styling
		resetFieldBorders();

		try {
			Client.type selectedType = (Client.type) type.getSelectedItem();
			boolean success = clientController.registerClient(nameField.getText(), emailField.getText(),
					new String(passwordField.getPassword()), selectedType, licencePlateField.getText());

			if (success) {
				if (selectedType == Client.type.VISITOR) {
					showSuccessDialog("Registration Successful",
							"Your account has been successfully registered. You can now log in.");
				} else {
					showSuccessDialog("Registration Pending Approval",
							"Your account has been registered but will need to be approved by a manager "
									+ "to have access to the parking system.");
				}
				resetFields();
				NavigationController.showPage("Login");
			} else {
				statusLabel.setText("Registration failed. Email may already be in use.");
				emailField.setBorder(errorBorder);
			}
		} catch (ParkingSystemException e) {
			statusLabel.setText(e.getMessage());
			highlightFieldWithError(e.getMessage());
		} catch (Exception e) {
			statusLabel.setText("An unexpected error occurred: " + e.getMessage());
		}
	}

	private void showSuccessDialog(String title, String message) {
		JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
	}

	private void highlightFieldWithError(String errorMessage) {
		errorMessage = errorMessage.toLowerCase();

		if (errorMessage.contains("name")) {
			nameField.setBorder(errorBorder);
		} else if (errorMessage.contains("email")) {
			emailField.setBorder(errorBorder);
		} else if (errorMessage.contains("password")) {
			passwordField.setBorder(errorBorder);
		} else if (errorMessage.contains("licence plate")) {
			licencePlateField.setBorder(errorBorder);
		}
		// If the error message doesn't match any field, no border will be set
	}

	private void resetFieldBorders() {
		nameField.setBorder(defaultBorder);
		emailField.setBorder(defaultBorder);
		passwordField.setBorder(defaultBorder);
		licencePlateField.setBorder(defaultBorder);
		statusLabel.setText(" ");
	}

	private void resetFields() {
		nameField.setText("");
		emailField.setText("");
		passwordField.setText("");
		licencePlateField.setText("");
		type.setSelectedIndex(0); // Reset to first option
	}
}
