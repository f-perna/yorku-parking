package views;

import javax.swing.*;

import java.awt.*;
import controllers.NavigationController;
import models.client.Client;
import models.client.GenerateClientFactory;
import models.parking.ParkingSystem;

public class RegisterPage extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ParkingSystem parkingSystem = ParkingSystem.getInstance();
	
    private JTextField nameField, emailField, licencePlateField;
    private JPasswordField passwordField;
    private JLabel statusLabel;
    private JComboBox<Client.type> type;

    public RegisterPage(JFrame parent) {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        JLabel titleLabel = new JLabel("Register");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(titleLabel, gbc);

        JLabel nameLabel = new JLabel("Name:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(nameLabel, gbc);

        nameField = new JTextField(15);
        gbc.gridx = 1;
        add(nameField, gbc);

        JLabel emailLabel = new JLabel("Email:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(emailLabel, gbc);

        emailField = new JTextField(15);
        gbc.gridx = 1;
        add(emailField, gbc);

        JLabel passLabel = new JLabel("Password:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(passLabel, gbc);

        passwordField = new JPasswordField(15);
        gbc.gridx = 1;
        add(passwordField, gbc);
        
        JLabel licencePlateLabel = new JLabel("Licence Plate:");
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(licencePlateLabel, gbc);
        
        licencePlateField = new JTextField(15);
        gbc.gridx = 1;
        add(licencePlateField, gbc);
        
        JLabel typeLabel = new JLabel("Type:");
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(typeLabel, gbc);
        
        type = new JComboBox<>();
        for (Client.type clientType : Client.type.values()) {
        	type.addItem(clientType);
        }
        gbc.gridx = 1;
        add(type, gbc);
        
        JButton registerButton = new JButton("Register");
        gbc.gridx = 1;
        gbc.gridy = 6;
        add(registerButton, gbc);

        statusLabel = new JLabel(" ");
        statusLabel.setForeground(Color.RED);
        gbc.gridy = 7;
        add(statusLabel, gbc);

        JButton goToLogin = new JButton("Already have an account? Login");
        gbc.gridy = 0;
        gbc.gridy = 8;
        add(goToLogin, gbc);

        registerButton.addActionListener(_ -> handleRegister());
        goToLogin.addActionListener(_ -> NavigationController.showPage("Login"));
    }

	private void handleRegister() {
		boolean approved = (type.getSelectedItem() == Client.type.VISITOR) ? true : false;
		Client newClient = GenerateClientFactory.getClientType(nameField.getText(), emailField.getText(), new String(passwordField.getPassword()), (Client.type) type.getSelectedItem(), licencePlateField.getText(), approved);
		parkingSystem.registerClient(newClient);
		NavigationController.showPage("Login");
	}
    
    
}
