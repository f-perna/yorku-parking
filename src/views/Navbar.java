package views;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controllers.NavigationController;

public class Navbar extends JPanel {
	
	public Navbar(JFrame parent) {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton prevButton = new JButton("<");
        JButton forwardButton = new JButton(">");
        JButton homeButton = new JButton("Home");
        
        prevButton.addActionListener(e -> NavigationController.prevPage());
        forwardButton.addActionListener(e -> NavigationController.forwardPage());
        homeButton.addActionListener(e -> NavigationController.showPage("Home"));
        
        add(prevButton);
        add(forwardButton);
        add(homeButton);
	}

}
