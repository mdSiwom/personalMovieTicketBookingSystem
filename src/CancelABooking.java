import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class CancelABooking implements ActionListener {

    JFrame frame = new JFrame("Cancel Booking");

    JButton loginButton = new JButton("Confirm");
    JButton resetButton = new JButton("Reset");

    JTextField userIDField = new JTextField();

    JPasswordField userPasswordField = new JPasswordField();

    JLabel userIDLabel = new JLabel("Enter Customer ID : ");
    JLabel userPasswordLabel = new JLabel("Password : ");
    JLabel messageLabel = new JLabel();
    ArrayList<Customer> customers;

    ArrayList<Booking> bookings;
    String str = "";

    CancelABooking(ArrayList<Booking> bookings1, ArrayList<Customer> customers1) {

        bookings = bookings1;
        customers = customers1;

        userIDLabel.setBounds(250, 300, 150, 25);
        userIDField.setBounds(400, 300, 200, 25);

        userPasswordLabel.setBounds(250, 350, 150, 25);
        userPasswordField.setBounds(400, 350, 200, 25);

        messageLabel.setBounds(325, 450, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        loginButton.setBounds(325, 400, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(425, 400, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        ;
        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        // default frame format
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            int cusID = Integer.parseInt(userID);

            for (Customer customer : customers) {
                if (customer.getId() == cusID)
                {
                    for(Booking booking : bookings)
                    {
                        if (booking.getCostumer().getId() == customer.getId())
                        {
                            if (booking.unreserveSeat())
                            {

                            }
                        }
                    }
                    messageLabel.setText("Your reservation has been canceled!");
                }
            }


            if (e.getSource() == resetButton) {
                userIDField.setText("");
                userPasswordField.setText("");
            }
        }
    }
}
