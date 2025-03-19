package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.NavigationController;
import models.auth.AuthStateObserver;
import models.auth.AuthenticationState;

public class HomePage extends JPanel implements AuthStateObserver {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel buttonArea;
	private JButton loginButton;
	private JButton registerButton;
	private JButton bookingsButton;

	public HomePage(JFrame parent) {
		setLayout(new GridBagLayout());
		buttonArea = new JPanel();

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;

		JLabel label = new JLabel("Welcome to YorkU Parking Booking System!");
		loginButton = new JButton("Login");
		registerButton = new JButton("Register");
		bookingsButton = new JButton("Go to Bookings");

		loginButton.addActionListener(e -> NavigationController.showPage("Login"));
		registerButton.addActionListener(e -> NavigationController.showPage("Register"));
		bookingsButton.addActionListener(e -> NavigationController.showPage("Client"));
		loginButton.setFocusPainted(false);

		add(label, gbc);
		buttonArea.add(loginButton);
		buttonArea.add(registerButton);

		gbc.gridy = 1;
		add(buttonArea, gbc);

		// Register as observer
		AuthenticationState.getInstance().addObserver(this);

		// Initialize UI state
		updateButtonVisibility(AuthenticationState.getInstance().isLoggedIn());
	}

	@Override
	public void onAuthStateChanged(boolean isLoggedIn) {
		updateButtonVisibility(isLoggedIn);
	}

	private void updateButtonVisibility(boolean isLoggedIn) {
		buttonArea.removeAll();
		if (isLoggedIn) {
			buttonArea.add(bookingsButton);
		} else {
			buttonArea.add(loginButton);
			buttonArea.add(registerButton);
		}
		buttonArea.revalidate();
		buttonArea.repaint();
	}
}
