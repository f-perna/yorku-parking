package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.ClientController;
import controllers.ControllerFactory;
import controllers.NavigationController;

public class LoginPage extends JPanel {
	private ClientController clientController;
	private JTextField emailField;
	private JPasswordField passwordField;
	private JLabel statusLabel;
	private JCheckBox managerCheckBox;

	public LoginPage(JFrame parent) {
		this.clientController = ControllerFactory.getInstance().getClientController();
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.CENTER;

		JLabel titleLabel = new JLabel("Login");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(titleLabel, gbc);

		final JLabel emailLabel = new JLabel("Email:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(emailLabel, gbc);

		emailField = new JTextField(15);
		gbc.gridx = 1;
		add(emailField, gbc);

		JLabel passLabel = new JLabel("Password:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		add(passLabel, gbc);

		passwordField = new JPasswordField(15);
		gbc.gridx = 1;
		add(passwordField, gbc);

		managerCheckBox = new JCheckBox("Manager Login");
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(managerCheckBox, gbc);

		managerCheckBox.addActionListener(_ -> {
			boolean isManager = managerCheckBox.isSelected();
			titleLabel.setText(isManager ? "Manager Login" : "Login");
			emailLabel.setText(isManager ? "Username:" : "Email:");
		});

		JButton loginButton = new JButton("Login");
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(loginButton, gbc);

		statusLabel = new JLabel(" ");
		statusLabel.setForeground(Color.RED);
		gbc.gridy = 5;
		add(statusLabel, gbc);

		JButton goToRegister = new JButton("Don't have an account? Click Here");
		gbc.gridy = 6;
		add(goToRegister, gbc);
		goToRegister.addActionListener(_ -> NavigationController.showPage("Register"));

		loginButton.addActionListener(_ -> handleLogin(emailField.getText(),
				new String(passwordField.getPassword()), managerCheckBox.isSelected()));
	}

	private void handleLogin(String email, String password, boolean isManager) {
		if (isManager) {
			// Manager login logic will be handled separately
			statusLabel.setText("Manager login not implemented yet");
		} else {
			try {
				if (clientController.login(email, password)) {
					ClientPage clientPage = (ClientPage) NavigationController.getPage("Client");
					clientPage.refresh();
					NavigationController.showPage("Client");
				} else {
					statusLabel.setText("Invalid credentials");
				}
			} catch (IllegalArgumentException e) {
				statusLabel.setText(e.getMessage());
			}
		}
	}
}
