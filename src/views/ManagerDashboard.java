package views;

import javax.swing.*;

import java.awt.*;

public class ManagerDashboard extends JPanel {

	public ManagerDashboard(JFrame parent) {

		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 10, 5, 10);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_START;

		JLabel titleLabel = new JLabel("Manager Dashboard");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(20, 10, 20, 10);
		gbc.anchor = GridBagConstraints.CENTER;
		add(titleLabel, gbc);

	}

}