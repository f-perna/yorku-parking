package views;

import java.awt.Component;
import java.awt.Font;
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

import client.Client;
import controllers.NavigationController;
import parking.ParkingSystem;

public class ClientPage extends JPanel {
	
	private JLabel welcomeMessage;

	public ClientPage(JFrame parent) {
		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTH;
		welcomeMessage = new JLabel();
		welcomeMessage.setFont(new Font("Arial", Font.BOLD, 18));
		add(welcomeMessage, gbc);
		
		JButton bookButton = new JButton("Book Parking Space");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookButton, gbc);
	}
	
	public void refresh() {
	     Client client = ParkingSystem.getLoggedInClient();
	     
	     welcomeMessage.setText("Welcome, " + client.getName());
	}
}
