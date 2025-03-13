package views;

import java.awt.Color;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import client.Client;
import controllers.NavigationController;
import parking.ParkingSystem;

public class LoginPage extends JPanel {
	private JTextField emailField;
	private JPasswordField passwordField;
	private JLabel statusLabel;

	public LoginPage(JFrame parent) {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.CENTER;

		JLabel titleLabel = new JLabel("Login");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(titleLabel, gbc);

		JLabel emailLabel = new JLabel("Email:");
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

		JButton loginButton = new JButton("Login");
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(loginButton, gbc);

		statusLabel = new JLabel(" ");
		statusLabel.setForeground(Color.RED);
		gbc.gridy = 4;
		add(statusLabel, gbc);
		
		JButton goToRegister = new JButton("Don't have an account? Click Here");
        gbc.gridy = 0;
        gbc.gridy = 5;
        add(goToRegister, gbc);
        goToRegister.addActionListener((ActionEvent e) -> NavigationController.showPage("Register"));

		loginButton.addActionListener((ActionEvent e) -> handleLogin(emailField.getText(), passwordField.getText()));
	}

	private void handleLogin(String email, String password) {
		ParkingSystem ps = ParkingSystem.getInstance();
		
		Client client = ps.login(email, password);
		
		System.out.println(client);
		
		if (client != null) {
			NavigationController.showPage("Client");
		}
		
	}

}
