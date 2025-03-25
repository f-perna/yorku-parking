package views.dialog;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class SuccessDialog {
	public static void show(Component parent, String message) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parent, message, "Success", JOptionPane.INFORMATION_MESSAGE);
		});
	}

	public static void show(Component parent, String title, String message) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parent, message, title, JOptionPane.INFORMATION_MESSAGE);
		});
	}
}