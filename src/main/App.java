package main;

import javax.swing.JFrame;

import ui.MainUI;

public class App {
	public static void main(String[] args) {

		JFrame frame = MainUI.getInstance();
		frame.setSize(900, 600);
		frame.setVisible(true);
	}
}
