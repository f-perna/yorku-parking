package views;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.NavigationController;

public class HomePage extends JPanel {

	public HomePage(JFrame parent) {
		setLayout(new GridBagLayout());
		JPanel buttonArea = new JPanel();

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;

		JLabel label = new JLabel("Welcome to YorkU Parking Booking System!");
		JButton login = new JButton("Login");
		JButton register = new JButton("Register");

		login.addActionListener((ActionEvent e) -> NavigationController.showPage("Login"));
		register.addActionListener((ActionEvent e) -> NavigationController.showPage("Register"));
		login.setFocusPainted(false);

		add(label, gbc);
		buttonArea.add(login);
		buttonArea.add(register);

		gbc.gridy = 1;
		add(buttonArea, gbc);

	}
}
