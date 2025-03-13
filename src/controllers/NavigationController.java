package controllers;

import java.awt.CardLayout;
import java.util.HashMap;

import javax.swing.JPanel;

public class NavigationController {
	private static CardLayout cardLayout;
	private static JPanel cardPanel;
    private static HashMap<String, JPanel> pages = new HashMap<>();

	
	public static void init(CardLayout layout, JPanel panel) {
		cardLayout = layout;
		cardPanel = panel;
	}
	
	public static void addPage(String pageName, JPanel panel) {
        pages.put(pageName, panel);
        cardPanel.add(panel, pageName);
    }
	
	public static void showPage(String pageName) {
		cardLayout.show(cardPanel, pageName);
	}

	public static JPanel getPage(String pageName) {
		return pages.get(pageName);
	}

}
