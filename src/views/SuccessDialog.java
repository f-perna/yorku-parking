package views;

import java.awt.Component;
import javax.swing.JOptionPane;

public class SuccessDialog {
	public static void show(Component parent, String title, String message) {
		JOptionPane.showMessageDialog(parent, message, title, JOptionPane.INFORMATION_MESSAGE);
	}
}