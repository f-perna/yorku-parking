package main;

import javax.swing.SwingUtilities;
import controllers.ControllerFactory;
import views.MainFrame;

public class App {
	public static void main(String[] args) {

		ControllerFactory.getInstance();

		SwingUtilities.invokeLater(() -> {
			new MainFrame();
		});
	}
}
