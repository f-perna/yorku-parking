package main;

import javax.swing.SwingUtilities;

import models.manager.ManagerSystem;
import controllers.ControllerFactory;
import views.MainFrame;

public class App {
	public static void main(String[] args) {
		// Load data from systems first
	
		ManagerSystem.getInstance();

		// Initialize the ControllerFactory which will set up all controllers
		ControllerFactory.getInstance();

		SwingUtilities.invokeLater(() -> {
			new MainFrame();
		});
	}
}
