package views;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.AuthController;
import controllers.NavigationController;
import controllers.factory.ControllerFactory;
import models.auth.AuthStateObserver;
import models.auth.AuthenticationState;

public class Navbar extends JPanel implements AuthStateObserver {

	private static final long serialVersionUID = 1L;
	private JButton logoutButton;
	private AuthController authController;

	public Navbar(JFrame parent) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		this.authController = ControllerFactory.getInstance().getAuthController();

		JButton prevButton = new JButton("<");
		JButton forwardButton = new JButton(">");
		JButton homeButton = new JButton("Home");
		logoutButton = new JButton("Logout");

		prevButton.addActionListener(e -> NavigationController.prevPage());
		forwardButton.addActionListener(e -> NavigationController.forwardPage());
		homeButton.addActionListener(e -> NavigationController.showPage("Home"));
		logoutButton.addActionListener(e -> handleLogout());

		// add(prevButton);
		// add(forwardButton);
		add(homeButton);

		// Register as observer
		AuthenticationState.getInstance().addObserver(this);

		// Initialize UI state
		updateLogoutButtonVisibility(AuthenticationState.getInstance().isLoggedIn());
	}

	private void handleLogout() {
		try {
			authController.logout();
			NavigationController.showPage("Home");
		} catch (IllegalStateException e) {
			// Handle case where no user is logged in
			System.err.println("Logout error: " + e.getMessage());
		}
	}

	@Override
	public void onAuthStateChanged(boolean isLoggedIn) {
		updateLogoutButtonVisibility(isLoggedIn);
	}

	private void updateLogoutButtonVisibility(boolean isLoggedIn) {
		if (isLoggedIn) {
			if (!isLogoutButtonAdded()) {
				add(logoutButton);
			}
		} else {
			remove(logoutButton);
		}
		revalidate();
		repaint();
	}

	private boolean isLogoutButtonAdded() {
		for (java.awt.Component component : getComponents()) {
			if (component == logoutButton) {
				return true;
			}
		}
		return false;
	}
}
