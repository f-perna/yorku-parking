package views.dialog;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.Component;

/**
 * Utility class for displaying error dialogs.
 * This implementation is optimized to prevent incremental build issues.
 */
public class ErrorDialog {
	// Static class - private constructor
	private ErrorDialog() {
	}

	/**
	 * Shows an error dialog with the provided message
	 */
	public static void show(Component parentComponent, String message) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parentComponent, message, "Error", JOptionPane.ERROR_MESSAGE);
		});
	}

	/**
	 * Shows an error dialog with a custom title and message
	 */
	public static void show(Component parentComponent, String title, String message) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parentComponent, message, title, JOptionPane.ERROR_MESSAGE);
		});
	}

	/**
	 * Shows an error dialog with the exception message
	 */
	public static void showException(Component parentComponent, Exception e) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parentComponent, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		});
	}
}