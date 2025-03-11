package controllers;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class NavigationController {
	private static CardLayout cardLayout;
	private static JPanel cardPanel;
	
	public static void init(CardLayout layout, JPanel panel) {
		cardLayout = layout;
		cardPanel = panel;
	}
	
	public static void showPage(String pageName) {
		cardLayout.show(cardPanel, pageName);
	}
}
