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
	private JButton managerDashboardButton;
	private JButton superManagerButton;
	private JLabel welcomeLabel;

	public HomePage(JFrame parent) {
		setLayout(new GridBagLayout());
		buttonArea = new JPanel();

		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.CENTER;

		welcomeLabel = new JLabel("Welcome to YorkU Parking Booking System!");
		loginButton = new JButton("Login");
		registerButton = new JButton("Register");
		bookingsButton = new JButton("Go to Bookings");
		managerDashboardButton = new JButton("Manager Dashboard");
		superManagerButton = new JButton("Super Manager Dashboard");

		loginButton.addActionListener(e -> NavigationController.showPage("Login"));
		registerButton.addActionListener(e -> NavigationController.showPage("Register"));
		bookingsButton.addActionListener(e -> NavigationController.showPage("Client"));
		managerDashboardButton.addActionListener(e -> NavigationController.showPage("ManagerDashboard"));
		superManagerButton.addActionListener(e -> NavigationController.showPage("SuperManager"));

		loginButton.setFocusPainted(false);
		managerDashboardButton.setFocusPainted(false);
		superManagerButton.setFocusPainted(false);

		add(welcomeLabel, gbc);
		buttonArea.add(loginButton);
		buttonArea.add(registerButton);

		gbc.gridy = 1;
		add(buttonArea, gbc);

		// Register as observer
		AuthenticationState.getInstance().addObserver(this);

		// Initialize UI state
		refresh(AuthenticationState.getInstance().isLoggedIn());
	}

	@Override
	public void onAuthStateChanged(boolean isLoggedIn) {
		refresh(isLoggedIn);
	}

	private void refresh(boolean isLoggedIn) {
		buttonArea.removeAll();
		AuthenticationState authState = AuthenticationState.getInstance();

		if (isLoggedIn) {
			if (authState.isSuperManagerLoggedIn()) {
				welcomeLabel.setText("Welcome Super Manager!");
				buttonArea.add(superManagerButton);
			} else if (authState.isManagerLoggedIn()) {
				welcomeLabel.setText("Welcome Manager!");
				buttonArea.add(managerDashboardButton);
			} else {
				welcomeLabel.setText("Welcome to YorkU Parking Booking System!");
				buttonArea.add(bookingsButton);
			}
		} else {
			welcomeLabel.setText("Welcome to YorkU Parking Booking System!");
			buttonArea.add(loginButton);
			buttonArea.add(registerButton);
		}
		buttonArea.revalidate();
		buttonArea.repaint();
	}
}
