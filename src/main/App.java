package main;

import javax.swing.SwingUtilities;

import parking.ParkingSystem;
import views.MainFrame;

public class App {
	public static void main(String[] args) {
		ParkingSystem.loadFromDatabase();
		
		SwingUtilities.invokeLater(() -> {
			new MainFrame();
		});
	}
}
