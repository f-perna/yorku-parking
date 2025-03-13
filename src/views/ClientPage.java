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
		gbc.anchor = GridBagConstraints.CENTER;

		welcomeMessage = new JLabel();
		
		add(welcomeMessage, gbc);
	}
	
	public void refresh() {
		 ParkingSystem ps = ParkingSystem.getInstance();
	     Client client = ps.getLoggedInClient();
	     
	     welcomeMessage.setText("Welcome, " + client.getName());
	}
}
