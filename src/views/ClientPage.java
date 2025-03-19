package views;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controllers.BookingController;
import controllers.ClientController;
import controllers.ControllerFactory;
import controllers.NavigationController;
import models.booking.Booking;
import models.client.Client;

public class ClientPage extends JPanel {
	private BookingController bookingController;
	private ClientController clientController;

	private JComboBox<Booking> bookingsList;
	private JLabel welcomeMessage;

	public ClientPage(JFrame parent) {
		this.bookingController =  ControllerFactory.getInstance().getBookingController();
		this.clientController = ControllerFactory.getInstance().getClientController();
		setLayout(new GridBagLayout());

		GridBagConstraints gbc = new GridBagConstraints();

		welcomeMessage = new JLabel();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.anchor = GridBagConstraints.NORTH;
		add(welcomeMessage, gbc);

		JButton bookButton = new JButton("Book Parking Space");
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookButton, gbc);
		bookButton.addActionListener((ActionEvent e) -> handleNewBooking());

		JLabel bookingsMessage = new JLabel("Bookings: ");
		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookingsMessage, gbc);

		bookingsList = new JComboBox<>();
		gbc.gridx = 0;
		gbc.gridy = 6;
		gbc.anchor = GridBagConstraints.CENTER;
		add(bookingsList, gbc);
	}

	public void handleNewBooking() {
		BookingPage bookingPage = (BookingPage) NavigationController.getPage("Booking");
		bookingPage.refresh();
		NavigationController.showPage("Booking");
	}

	public void refresh() {
		Client client = clientController.getLoggedInClient();
		List<Booking> clientBookings = bookingController.getCurrentUserBookings();
		
		welcomeMessage.setText("Welcome, " + client.getName());

		bookingsList.removeAllItems();
		for (Booking booking : clientBookings) {
			System.out.println(booking.getParkingSpace().getName());
			bookingsList.addItem(booking);
		}
		
		
	}
}
