package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import controllers.NavigationController;

public class RegisterPage extends JPanel {
    private JTextField usernameField, emailField;
    private JPasswordField passwordField;
    private JLabel statusLabel;

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

        JLabel userLabel = new JLabel("Username:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(userLabel, gbc);

        usernameField = new JTextField(15);
        gbc.gridx = 1;
        add(usernameField, gbc);

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

        JButton registerButton = new JButton("Register");
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(registerButton, gbc);

        statusLabel = new JLabel(" ");
        statusLabel.setForeground(Color.RED);
        gbc.gridy = 5;
        add(statusLabel, gbc);

        JButton goToLogin = new JButton("Already have an account? Login");
        gbc.gridy = 0;
        gbc.gridy = 6;
        add(goToLogin, gbc);

//        registerButton.addActionListener((ActionEvent e) -> handleRegister());
        goToLogin.addActionListener((ActionEvent e) -> NavigationController.showPage("Login"));
    }
}
