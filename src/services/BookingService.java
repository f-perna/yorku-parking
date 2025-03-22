package services;

import java.util.List;
import java.util.UUID;

import models.booking.Booking;
import models.client.Client;
import models.parkingSpace.ParkingSpace;

public interface BookingService {

	Booking createBooking(ParkingSpace parkingSpace, int durationHours, Client client);

	void saveBooking(Booking booking);
	boolean checkIn(Booking booking);
	void confirmBooking(Booking booking);
	void completeBooking(Booking booking);
	Booking extendBookingTime(Booking booking, int additionalHours, Client client);
	void cancelBooking(Booking booking, Client client);
	List<Booking> getBookingsForClient(Client client);
	Booking getBookingById(UUID bookingId);
}