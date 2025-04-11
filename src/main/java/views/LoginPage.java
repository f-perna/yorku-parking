package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

import controllers.AuthController;
import controllers.NavigationController;
import controllers.factory.ControllerFactory;
import views.dialog.ErrorDialog;
import models.user.UserType;

@SuppressWarnings("serial")
public class LoginPage extends JPanel {
	private AuthController authController;

	private JTextField emailField;
	private JPasswordField passwordField;
	private JLabel statusLabel;
	private JRadioButton clientRadioButton;
	private JRadioButton managerRadioButton;
	private JRadioButton superManagerRadioButton;
	private ButtonGroup loginTypeGroup;
	private Border defaultBorder;
	private UserType loginType = UserType.CLIENT;

	@SuppressWarnings("unused")
	public LoginPage(JFrame parent) {
		this.authController = ControllerFactory.getInstance().getAuthController();
		setLayout(new BorderLayout());

		// Create default and error borders
		defaultBorder = BorderFactory.createLineBorder(Color.GRAY);

		// Create form panel that will contain all form components
		JPanel formPanel = new JPanel(new GridBagLayout());
		formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(8, 8, 8, 8);
		gbc.anchor = GridBagConstraints.WEST;

		// Title
		JLabel titleLabel = new JLabel("Login");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.anchor = GridBagConstraints.CENTER;
		formPanel.add(titleLabel, gbc);

		// Reset anchor and gridwidth for form fields
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridwidth = 1;

		// Email/Username field
		final JLabel emailLabel = new JLabel("Email:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		formPanel.add(emailLabel, gbc);

		emailField = new JTextField(20);
		emailField.setBorder(defaultBorder);
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		formPanel.add(emailField, gbc);

		// Password field
		JLabel passLabel = new JLabel("Password:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.fill = GridBagConstraints.NONE;
		formPanel.add(passLabel, gbc);

		passwordField = new JPasswordField(20);
		passwordField.setBorder(defaultBorder);
		gbc.gridx = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		formPanel.add(passwordField, gbc);

		// Login type selection
		JLabel loginTypeLabel = new JLabel("Login as:");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.fill = GridBagConstraints.NONE;
		formPanel.add(loginTypeLabel, gbc);

		// Create radio buttons panel with proper layout
		JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
		clientRadioButton = new JRadioButton("Client");
		managerRadioButton = new JRadioButton("Manager");
		superManagerRadioButton = new JRadioButton("Super Manager");

		// Group the radio buttons
		loginTypeGroup = new ButtonGroup();
		loginTypeGroup.add(clientRadioButton);
		loginTypeGroup.add(managerRadioButton);
		loginTypeGroup.add(superManagerRadioButton);

		// Set client as default selection
		clientRadioButton.setSelected(true);

		// Add to panel
		radioPanel.add(clientRadioButton);
		radioPanel.add(managerRadioButton);
		radioPanel.add(superManagerRadioButton);

		gbc.gridx = 1;
		formPanel.add(radioPanel, gbc);

		// Add action listeners for radio buttons
		clientRadioButton.addActionListener(e -> loginType = UserType.CLIENT);
		managerRadioButton.addActionListener(e -> loginType = UserType.MANAGER);
		superManagerRadioButton.addActionListener(e -> loginType = UserType.SUPER_MANAGER);

		// Login button
		JButton loginButton = new JButton("Login");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;
		formPanel.add(loginButton, gbc);
		parent.getRootPane().setDefaultButton(loginButton);

		// Status label
		statusLabel = new JLabel(" ");
		statusLabel.setForeground(Color.RED);
		gbc.gridy = 5;
		formPanel.add(statusLabel, gbc);

		// Register button
		JButton goToRegister = new JButton("Don't have an account? Click Here");
		gbc.gridy = 6;
		formPanel.add(goToRegister, gbc);

		// Set preferred size for the form panel
		formPanel.setPreferredSize(new Dimension(400, 350));

		// Add form panel to center of main panel
		add(formPanel, BorderLayout.CENTER);

		// Action listeners
		goToRegister.addActionListener(e -> NavigationController.showPage("Register"));

		loginButton.addActionListener(e -> {
			// Reset field borders
			resetFieldBorders();

			handleLogin();
		});
	}

	private void resetFieldBorders() {
		emailField.setBorder(defaultBorder);
		passwordField.setBorder(defaultBorder);
		statusLabel.setText(" ");
	}

	private void handleLogin() {
		try {
			boolean success = authController.login(emailField.getText(), new String(passwordField.getPassword()),
					loginType);

			if (success) {
				resetFields();

				if (loginType == UserType.MANAGER) {
					SuperManagerPage managerPage = (SuperManagerPage) NavigationController.getPage("Manager");
					managerPage.refresh();
					NavigationController.showPage("Manager");
				} else if (loginType == UserType.SUPER_MANAGER) {
					SuperManagerPage superManagerPage = (SuperManagerPage) NavigationController.getPage("SuperManager");
					superManagerPage.refresh();
					NavigationController.showPage("SuperManager");
					
				} else {
					ClientPage clientPage = (ClientPage) NavigationController.getPage("Client");
					clientPage.refresh();
					NavigationController.showPage("Client");
				}
			}
		} catch (Exception e) {
			ErrorDialog.showException(this, e);
		}
	}

	private void resetFields() {
		emailField.setText("");
		passwordField.setText("");
		clientRadioButton.setSelected(true);
		loginType = UserType.CLIENT;
		statusLabel.setText(" ");
		resetFieldBorders();
	}
}
