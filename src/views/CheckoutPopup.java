package views;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controllers.ControllerFactory;
import controllers.PaymentController;
import models.booking.Booking;

public class CheckoutPopup {

	public static boolean showDialog(JPanel parent, Booking selectedBooking) {
		try {
			if (selectedBooking == null) {
				ErrorDialog.show(parent, "Error", "No booking selected");
				return false;
			}

			double finalAmount = selectedBooking.calculatePrice();
			double depositPaid = selectedBooking.getDeposit();
			double remainingAmount = finalAmount - depositPaid;

			String message;

			message = String.format(
					"Your deposit of $%.2f will be applied to your total of $%.2f.\n"
							+ "Remaining balance to pay: $%.2f\n"
							+ "Note: Your deposit will be refunded and the full amount will be charged.",
					depositPaid, finalAmount, remainingAmount);

			int response = JOptionPane.showConfirmDialog(parent, message + "\n\nProceed with checkout?",
					"Checkout Confirmation", JOptionPane.YES_NO_OPTION);

			if (response == JOptionPane.YES_OPTION) {
				String[] paymentMethods = { "Credit", "Debit", "Cash", "Mobile" };
				String selectedMethod = (String) JOptionPane.showInputDialog(parent,
						"Select payment method for remaining balance:", "Payment Method", JOptionPane.QUESTION_MESSAGE,
						null, paymentMethods, paymentMethods[0]);

				if (selectedMethod != null) {
					PaymentController paymentController = ControllerFactory.getInstance().getPaymentController();
					paymentController.processFinalPayment(selectedBooking, selectedMethod);
					SuccessDialog.show(parent, "Checkout Complete",
							"Thank you for your payment. Your booking is now complete.");
					return true;
				}

			}
			return false;
		} catch (

		Exception e) {
			ErrorDialog.show(parent, "Error", "An error occurred during checkout: " + e.getMessage());
			return false;
		}
	}
}