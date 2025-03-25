package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

/**
 * Information page that explains the different statuses and concepts in the
 * system
 */
public class InfoPage extends JPanel {
        private JFrame parentFrame;

        public InfoPage(JFrame parent) {
                this.parentFrame = parent;
                setLayout(new BorderLayout(0, 0));
                setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));

                // Create title panel
                JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
                titlePanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
                JLabel titleLabel = new JLabel("System Information");
                titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
                titlePanel.add(titleLabel);
                add(titlePanel, BorderLayout.NORTH);

                // Create tabbed pane for different categories
                JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
                tabbedPane.putClientProperty("JTabbedPane.tabsPlacement", "north");

                // Force tabs to be at top with no content centering
                tabbedPane.setTabPlacement(JTabbedPane.TOP);

                // Add tabs for different status types
                tabbedPane.addTab("Booking Statuses", createBookingStatusPanel());
                tabbedPane.addTab("Parking Space Statuses", createParkingSpaceStatusPanel());
                tabbedPane.addTab("Client Types", createClientTypesPanel());
                tabbedPane.addTab("System Workflow", createWorkflowPanel());

                // Add the tabbed pane to the center
                add(tabbedPane, BorderLayout.CENTER);
        }

        private JScrollPane createBookingStatusPanel() {
                // Use a panel with vertical BoxLayout to prevent auto-centering
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
                mainPanel.setAlignmentY(Component.TOP_ALIGNMENT);
                mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

                JPanel panel = new JPanel(new GridBagLayout());
                panel.setBorder(new EmptyBorder(0, 0, 0, 0));
                panel.setAlignmentY(Component.TOP_ALIGNMENT);

                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 1.0;
                gbc.weighty = 0.0;
                gbc.insets = new Insets(0, 0, 1, 0);

                // Title
                JLabel title = new JLabel("Booking Status Definitions");
                title.setFont(new Font("Arial", Font.BOLD, 16));
                panel.add(title, gbc);

                gbc.gridy++;
                panel.add(Box.createVerticalStrut(3), gbc);

                // Add status explanations
                addStatusExplanation(panel, gbc, "PENDING",
                                "Booking has been created but deposit payment has not been made yet. The parking space is not reserved until payment is made.",
                                Color.GRAY);
                addStatusExplanation(panel, gbc, "CONFIRMED",
                                "Deposit has been paid and the parking space is reserved for the client. The client can check-in during the booking time.",
                                new Color(0, 128, 0));
                addStatusExplanation(panel, gbc, "CHECKED_IN",
                                "Client has arrived at the parking space and checked in. The car is now occupying the reserved space.",
                                new Color(0, 0, 128));
                addStatusExplanation(panel, gbc, "CANCELED",
                                "Booking has been canceled by the client. Deposit may or may not be refundable depending on when it was canceled.",
                                Color.RED);
                addStatusExplanation(panel, gbc, "COMPLETED",
                                "Client has checked out and made final payment. The booking transaction is complete.",
                                new Color(0, 128, 0));
                addStatusExplanation(panel, gbc, "NO_SHOW",
                                "Client did not arrive within 1 hour of the booking start time. The deposit is not refunded and the space is released.",
                                new Color(128, 0, 0));
                addStatusExplanation(panel, gbc, "OVERSTAYED",
                                "Booking time has ended but the car is still present at the parking space. Additional charges may apply.",
                                Color.ORANGE);
                addStatusExplanation(panel, gbc, "EXPIRED",
                                "Booking time has ended, the car has been removed, but checkout has not been completed. Client needs to complete checkout and make final payment.",
                                new Color(255, 128, 0));

                // Add the content panel to the main panel at the top
                mainPanel.add(panel);
                mainPanel.add(Box.createVerticalGlue()); // Push everything to the top

                // Create a scroll pane that shows content from the top
                JScrollPane scrollPane = new JScrollPane(mainPanel);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setBorder(null);
                scrollPane.getViewport().setBackground(panel.getBackground());

                // Ensure viewport starts at the top
                scrollPane.getVerticalScrollBar().setValue(0);
                scrollPane.getViewport().setViewPosition(new java.awt.Point(0, 0));

                return scrollPane;
        }

        private JScrollPane createParkingSpaceStatusPanel() {
                // Use a panel with vertical BoxLayout to prevent auto-centering
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
                mainPanel.setAlignmentY(Component.TOP_ALIGNMENT);
                mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

                JPanel panel = new JPanel(new GridBagLayout());
                panel.setBorder(new EmptyBorder(0, 0, 0, 0));
                panel.setAlignmentY(Component.TOP_ALIGNMENT);

                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 1.0;
                gbc.weighty = 0.0;
                gbc.insets = new Insets(0, 0, 1, 0);

                // Title
                JLabel title = new JLabel("Parking Space Status Definitions");
                title.setFont(new Font("Arial", Font.BOLD, 16));
                panel.add(title, gbc);

                gbc.gridy++;
                panel.add(Box.createVerticalStrut(3), gbc);

                // Add status explanations
                addStatusExplanation(panel, gbc, "AVAILABLE",
                                "Parking space is available for booking. It is not currently reserved or occupied by any client.",
                                new Color(0, 128, 0));
                addStatusExplanation(panel, gbc, "BOOKED",
                                "Parking space has been reserved for a client and is not available for other bookings.",
                                new Color(0, 0, 128));

                // Add section for enabled/disabled
                gbc.gridy++;
                panel.add(Box.createVerticalStrut(5), gbc);

                gbc.gridy++;
                JLabel additionalTitle = new JLabel("Additional Parking Space Properties");
                additionalTitle.setFont(new Font("Arial", Font.BOLD, 16));
                panel.add(additionalTitle, gbc);

                gbc.gridy++;
                panel.add(Box.createVerticalStrut(3), gbc);

                addStatusExplanation(panel, gbc, "ENABLED",
                                "Parking space is operational and can be booked by clients.",
                                new Color(0, 128, 0));
                addStatusExplanation(panel, gbc, "DISABLED",
                                "Parking space is not operational (e.g., under maintenance) and cannot be booked, regardless of its availability status.",
                                Color.RED);

                // Add the content panel to the main panel at the top
                mainPanel.add(panel);
                mainPanel.add(Box.createVerticalGlue()); // Push everything to the top

                // Create a scroll pane that shows content from the top
                JScrollPane scrollPane = new JScrollPane(mainPanel);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setBorder(null);
                scrollPane.getViewport().setBackground(panel.getBackground());

                // Ensure viewport starts at the top
                scrollPane.getVerticalScrollBar().setValue(0);
                scrollPane.getViewport().setViewPosition(new java.awt.Point(0, 0));

                return scrollPane;
        }

        private JScrollPane createClientTypesPanel() {
                // Use a panel with vertical BoxLayout to prevent auto-centering
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
                mainPanel.setAlignmentY(Component.TOP_ALIGNMENT);
                mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

                JPanel panel = new JPanel(new GridBagLayout());
                panel.setBorder(new EmptyBorder(0, 0, 0, 0));
                panel.setAlignmentY(Component.TOP_ALIGNMENT);

                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 1.0;
                gbc.weighty = 0.0;
                gbc.insets = new Insets(0, 0, 1, 0);

                // Title
                JLabel title = new JLabel("Client Type Definitions");
                title.setFont(new Font("Arial", Font.BOLD, 16));
                panel.add(title, gbc);

                gbc.gridy++;
                panel.add(Box.createVerticalStrut(3), gbc);

                // Add client type explanations
                addStatusExplanation(panel, gbc, "STUDENT",
                                "Student of the university. Eligible for student parking rates.",
                                new Color(0, 128, 0));
                addStatusExplanation(panel, gbc, "FACULTY",
                                "Faculty member of the university. Eligible for faculty parking rates and privileges.",
                                new Color(0, 0, 128));
                addStatusExplanation(panel, gbc, "NON_FACULTY",
                                "Staff member who is not faculty. Eligible for staff parking rates.",
                                new Color(128, 0, 128));
                addStatusExplanation(panel, gbc, "VISITOR",
                                "Visitor to the university. Subject to visitor parking rates and restrictions.",
                                Color.ORANGE);

                // Add section for approval status
                gbc.gridy++;
                panel.add(Box.createVerticalStrut(5), gbc);

                gbc.gridy++;
                JLabel additionalTitle = new JLabel("Client Approval Status");
                additionalTitle.setFont(new Font("Arial", Font.BOLD, 16));
                panel.add(additionalTitle, gbc);

                gbc.gridy++;
                panel.add(Box.createVerticalStrut(3), gbc);

                addStatusExplanation(panel, gbc, "APPROVED",
                                "Client has been verified and approved by administrators. Can make bookings.",
                                new Color(0, 128, 0));
                addStatusExplanation(panel, gbc, "NOT APPROVED",
                                "Client registration is pending approval. Cannot make bookings until approved by an administrator.",
                                Color.RED);

                // Add the content panel to the main panel at the top
                mainPanel.add(panel);
                mainPanel.add(Box.createVerticalGlue()); // Push everything to the top

                // Create a scroll pane that shows content from the top
                JScrollPane scrollPane = new JScrollPane(mainPanel);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setBorder(null);
                scrollPane.getViewport().setBackground(panel.getBackground());

                // Ensure viewport starts at the top
                scrollPane.getVerticalScrollBar().setValue(0);
                scrollPane.getViewport().setViewPosition(new java.awt.Point(0, 0));

                return scrollPane;
        }

        private JScrollPane createWorkflowPanel() {
                // Use a panel with vertical BoxLayout to prevent auto-centering
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
                mainPanel.setAlignmentY(Component.TOP_ALIGNMENT);
                mainPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

                JPanel panel = new JPanel(new GridBagLayout());
                panel.setBorder(new EmptyBorder(0, 0, 0, 0));
                panel.setAlignmentY(Component.TOP_ALIGNMENT);

                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.NORTHWEST;
                gbc.fill = GridBagConstraints.HORIZONTAL;
                gbc.weightx = 1.0;
                gbc.weighty = 0.0;
                gbc.insets = new Insets(0, 0, 1, 0);

                // Title
                JLabel title = new JLabel("System Workflow");
                title.setFont(new Font("Arial", Font.BOLD, 16));
                panel.add(title, gbc);

                gbc.gridy++;
                panel.add(Box.createVerticalStrut(3), gbc);

                // Add workflow explanations in more compact form
                String bookingWorkflow = "1. Client creates a booking for a specific space and time\n" +
                                "2. Client pays deposit to confirm booking (CONFIRMED)\n" +
                                "3. Client arrives and checks in (CHECKED_IN)\n" +
                                "4. After parking, client completes checkout & pays remaining amount (COMPLETED)\n\n" +
                                "Special cases:\n" +
                                "- No arrival within 1 hour: NO_SHOW\n" +
                                "- Parking past end time: OVERSTAYED\n" +
                                "- End time reached, car gone, payment not made: EXPIRED";

                JTextArea workflowText = new JTextArea(bookingWorkflow);
                workflowText.setLineWrap(true);
                workflowText.setWrapStyleWord(true);
                workflowText.setEditable(false);
                workflowText.setBackground(panel.getBackground());
                workflowText.setFont(new Font("Arial", Font.PLAIN, 13));
                workflowText.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

                gbc.gridy++;
                panel.add(workflowText, gbc);

                // Add section for automatic processes
                gbc.gridy++;
                panel.add(Box.createVerticalStrut(5), gbc);

                gbc.gridy++;
                JLabel autoTitle = new JLabel("Automatic Processes");
                autoTitle.setFont(new Font("Arial", Font.BOLD, 16));
                panel.add(autoTitle, gbc);

                gbc.gridy++;
                panel.add(Box.createVerticalStrut(3), gbc);

                String automaticProcesses = "The system automatically performs:\n" +
                                "1. No-Show Detection: Checks arrival within 1 hour of start time\n" +
                                "2. Overstay Detection: Identifies cars remaining after end time\n" +
                                "3. Expiration Handling: Marks bookings as expired when time ends & car is gone\n" +
                                "4. Space Status Updates: Updates space status based on booking events";

                JTextArea autoText = new JTextArea(automaticProcesses);
                autoText.setLineWrap(true);
                autoText.setWrapStyleWord(true);
                autoText.setEditable(false);
                autoText.setBackground(panel.getBackground());
                autoText.setFont(new Font("Arial", Font.PLAIN, 13));
                autoText.setBorder(BorderFactory.createEmptyBorder(2, 0, 2, 0));

                gbc.gridy++;
                panel.add(autoText, gbc);

                // Add the content panel to the main panel at the top
                mainPanel.add(panel);
                mainPanel.add(Box.createVerticalGlue()); // Push everything to the top

                // Create a scroll pane that shows content from the top
                JScrollPane scrollPane = new JScrollPane(mainPanel);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setBorder(null);
                scrollPane.getViewport().setBackground(panel.getBackground());

                // Ensure viewport starts at the top
                scrollPane.getVerticalScrollBar().setValue(0);
                scrollPane.getViewport().setViewPosition(new java.awt.Point(0, 0));

                return scrollPane;
        }

        private void addStatusExplanation(JPanel panel, GridBagConstraints gbc, String status, String explanation,
                        Color color) {
                // Status name with colored background
                JPanel statusPanel = new JPanel(new BorderLayout());
                JLabel statusLabel = new JLabel(status);
                statusLabel.setOpaque(true);
                statusLabel.setBackground(color);
                statusLabel.setForeground(Color.WHITE);
                statusLabel.setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));
                statusLabel.setFont(new Font("Arial", Font.BOLD, 13));
                statusPanel.add(statusLabel, BorderLayout.CENTER);
                statusPanel.setMaximumSize(new Dimension(120, 25));

                gbc.gridy++;
                panel.add(statusPanel, gbc);

                // Explanation text
                JTextArea explanationText = new JTextArea(explanation);
                explanationText.setLineWrap(true);
                explanationText.setWrapStyleWord(true);
                explanationText.setEditable(false);
                explanationText.setBackground(panel.getBackground());
                explanationText.setFont(new Font("Arial", Font.PLAIN, 13));
                explanationText.setBorder(BorderFactory.createEmptyBorder(2, 0, 4, 0));
                explanationText.setAlignmentX(Component.LEFT_ALIGNMENT);

                gbc.gridy++;
                panel.add(explanationText, gbc);
        }
}