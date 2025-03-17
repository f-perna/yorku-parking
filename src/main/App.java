package main;

import javax.swing.SwingUtilities;

import manager.ManagerSystem;
import parking.ParkingSystem;
import views.MainFrame;

public class App {
	public static void main(String[] args) {
		ParkingSystem parkingSystem = ParkingSystem.getInstance();
		parkingSystem.loadFromDatabase();
		
		ManagerSystem.getInstance();
		
		SwingUtilities.invokeLater(() -> {
			new MainFrame();
		});
	}
}
