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
		
		cardPanel.add(new HomePage(this), "Home");
		cardPanel.add(new LoginPage(this), "Login");
		cardPanel.add(new RegisterPage(this), "Register");
		cardPanel.add(new ClientPage(this), "Client");
		
		getContentPane().add(cardPanel, BorderLayout.CENTER);
		NavigationController.init(cardLayout, cardPanel);
		
		setVisible(true);
		
	}
}
