package main;

import javax.swing.SwingUtilities;

import controllers.factory.ControllerFactory;
import services.BookingStatusSchedulerService;
import views.frame.MainFrame;

public class App {
	public static void main(String[] args) {

		// Initialize controllers
		ControllerFactory.getInstance();

		// Start the booking status scheduler service
		BookingStatusSchedulerService.getInstance();

		SwingUtilities.invokeLater(() -> {
			new MainFrame();
		});
	}
}
