package views.dialog;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.Component;

public class ErrorDialog {

	public static void show(Component parentComponent, String message) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parentComponent, message, "Error", JOptionPane.ERROR_MESSAGE);
		});
	}

	public static void show(Component parentComponent, String title, String message) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parentComponent, message, title, JOptionPane.ERROR_MESSAGE);
		});
	}

	public static void showException(Component parentComponent, Exception e) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parentComponent, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		});
	}
}