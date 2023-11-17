import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class PayementGatewayGUI implements ActionListener {

    JFrame frame = new JFrame("Payement Gateway");

    JButton loginButton = new JButton("Pay");
    JButton resetButton = new JButton("Reset");

    JTextField userIDField = new JTextField();

    JPasswordField userPasswordField = new JPasswordField();

    JLabel payemntInfo = new JLabel();
    JLabel userIDLabel = new JLabel("bKash number : ");
    JLabel userPasswordLabel = new JLabel("Password : ");
    JLabel messageLabel = new JLabel();

    ArrayList<Customer> customers;

    ArrayList<Booking> bookings;
    int customerid = 0;
    String str = "";

    PayementGatewayGUI(ArrayList<Booking> bookings1, ArrayList<Customer> customers1, int costumerId1) {

        bookings = bookings1;
        customers = customers1;
        customerid = costumerId1;

        payemntInfo.setBounds(250, 100, 450, 100);
        // JTextArea textArea = new JTextArea();

        str += "Your Bill";
        str += "\n";
        str += "-------------------------";
        int totalCost = 0;
        for (Booking booking : bookings) {
            if (booking.getCostumer().getId() == customerid) {
                totalCost += booking.getCost();
            }
        }
        str += "Costumer ID: " + customerid;
        str += "Total costs: " + totalCost + " Taka";

        // textArea.setText(str);
        payemntInfo.setText(str);

        userIDLabel.setBounds(250, 300, 75, 25);
        userIDField.setBounds(325, 300, 200, 25);

        userPasswordLabel.setBounds(250, 350, 75, 25);
        userPasswordField.setBounds(325, 350, 200, 25);

        messageLabel.setBounds(325, 450, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        loginButton.setBounds(325, 400, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(425, 400, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        // frame.add(textArea);

        frame.add(payemntInfo);
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

            messageLabel.setForeground(Color.green);
            messageLabel.setText("Payment successful");

            if (e.getSource() == resetButton) {
                userIDField.setText("");
                userPasswordField.setText("");
            }
        }
    }
}
