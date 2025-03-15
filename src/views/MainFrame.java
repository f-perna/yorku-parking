package views;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.NavigationController;

public class MainFrame extends JFrame {

	private static CardLayout cardLayout;
	private static JPanel cardPanel;

	public MainFrame() {
		setTitle("YorkU Parking Booking System");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		
		NavigationController.init(cardLayout, cardPanel);
		
		NavigationController.addPage("Home", new HomePage(this));
        NavigationController.addPage("Login", new LoginPage(this));
        NavigationController.addPage("Register", new RegisterPage(this));
        NavigationController.addPage("Client", new ClientPage(this));
        NavigationController.addPage("Booking", new BookingPage(this));
		
		getContentPane().add(cardPanel, BorderLayout.CENTER);
		
		setVisible(true);
		
	}
}
