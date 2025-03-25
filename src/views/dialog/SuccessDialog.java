package views.dialog;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Utility class for displaying success dialogs.
 * This implementation is optimized to prevent incremental build issues.
 */
public class SuccessDialog {
	// Static class - private constructor
	private SuccessDialog() {
	}

	/**
	 * Shows a success dialog with the provided message
	 */
	public static void show(Component parent, String message) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parent, message, "Success", JOptionPane.INFORMATION_MESSAGE);
		});
	}

	/**
	 * Shows a success dialog with a custom title and message
	 */
	public static void show(Component parent, String title, String message) {
		SwingUtilities.invokeLater(() -> {
			JOptionPane.showMessageDialog(parent, message, title, JOptionPane.INFORMATION_MESSAGE);
		});
	}
}