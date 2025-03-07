package main;

import javax.swing.JFrame;

import ui.LandingUI;

public class App {
	public static void main(String[] args) {

		JFrame frame = new LandingUI();
		frame.setSize(900, 600);
		frame.pack();
		frame.setVisible(true);
	}
}
