package ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainUI extends JFrame {
	
	private static MainUI instance;
	
	public static MainUI getInstance() {
		if (instance == null)
			instance = new MainUI();

		return instance;
	}
	
	public MainUI() {
		JPanel container = new JPanel(new CardLayout());
		
		JButton loginButton = new JButton("Login");
		JButton registerButton = new JButton("Register");
		registerButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(container.getLayout());
				cl.show(container, "Register");
			}
		});
		
		JPanel mainUI = new JPanel();
		mainUI.add(loginButton);
		mainUI.add(registerButton);
		
		container.add(mainUI, "Main");
		
		JPanel registerUI = new RegisterUI();
		
		container.add(registerUI, "Register");
		
		add(container);
		
	}
}
