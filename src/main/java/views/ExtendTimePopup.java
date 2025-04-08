package views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controllers.BookingController;
import controllers.factory.ControllerFactory;
import models.booking.Booking;
import views.dialog.ErrorDialog;
import views.dialog.SuccessDialog;

public class ExtendTimePopup {

    /**
     * Shows the extend time dialog and processes the booking extension
     * 
     * @param parent          The parent panel for the dialog
     * @param selectedBooking The booking to extend
     * @return true if extension was successful, false otherwise
     */
    public static boolean showDialog(JPanel parent, Booking selectedBooking) {
        try {
            if (selectedBooking == null) {
                ErrorDialog.show(parent, "Error", "No booking selected");
                return false;
            }

            // Create a list of hours to extend
            String[] hourOptions = { "1 Hour", "2 Hours", "3 Hours", "4 Hours" };
            String selectedOption = (String) JOptionPane.showInputDialog(
                    parent,
                    "Select additional time for your booking:",
                    "Extend Booking Time",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    hourOptions,
                    hourOptions[0]);

            if (selectedOption != null) {
                // Parse selected hours
                int additionalHours = Integer.parseInt(selectedOption.split(" ")[0]);

                // Calculate the additional cost
                double hourlyRate = selectedBooking.getClient().getRate();
                double additionalCost = hourlyRate * additionalHours;

                // Confirm with cost information
                int confirm = JOptionPane.showConfirmDialog(
                        parent,
                        String.format("Extending booking by %d hours will cost $%.2f.\nDo you want to continue?",
                                additionalHours, additionalCost),
                        "Confirm Extension",
                        JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    // Process the extension through controller
                    BookingController bookingController = ControllerFactory.getInstance().getBookingController();
                    bookingController.extendBookingTime(selectedBooking, additionalHours);

                    // Show success message
                    SuccessDialog.show(parent, "Booking Extended",
                            String.format("Your booking has been extended by %d hours.", additionalHours));

                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            ErrorDialog.show(parent, "Input Error", e.getMessage());
            return false;
        } catch (IllegalStateException e) {
            ErrorDialog.show(parent, "Error", e.getMessage());
            return false;
        } catch (Exception e) {
            ErrorDialog.show(parent, "Error", "An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}