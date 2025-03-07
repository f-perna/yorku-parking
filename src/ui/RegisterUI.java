package ui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterUI extends JPanel {
	
	protected RegisterUI() {
		JTextField nameField = new JTextField();
		nameField.setPreferredSize(new Dimension(200, 30));
		add(nameField);
	}
}
