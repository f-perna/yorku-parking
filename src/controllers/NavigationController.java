package controllers;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JPanel;

public class NavigationController {
	private static CardLayout cardLayout;
	private static JPanel cardPanel;
	private static HashMap<String, JPanel> pages = new HashMap<>();
	private static List<String> history = new ArrayList<>();
	private static int historyIndex = -1;

	public static void init(CardLayout layout, JPanel panel) {
		cardLayout = layout;
		cardPanel = panel;
	}

	public static void addPage(String pageName, JPanel panel) {
		pages.put(pageName, panel);
		cardPanel.add(panel, pageName);
		if (history.isEmpty()) {
            showPage(pageName);
        }
	}

	public static void showPage(String pageName) {
		while (history.size() > historyIndex + 1) {
			history.remove(history.size() - 1);
		}
		history.add(pageName);
		historyIndex = history.size() - 1;
		
		cardLayout.show(cardPanel, pageName);
	}

	public static void prevPage() {
		if (historyIndex > 0) {
			historyIndex--;
			String pageName = history.get(historyIndex);
			cardLayout.show(cardPanel, pageName);
		}
	}
	
	public static void forwardPage() {
        if (historyIndex < history.size() - 1) {
            historyIndex++;
            String pageName = history.get(historyIndex);
            cardLayout.show(cardPanel, pageName);
        }
    }

	public static JPanel getPage(String pageName) {
		return pages.get(pageName);
	}

}
