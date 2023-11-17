import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;;

public class JawaanGui implements ActionListener {

    JFrame frame = new JFrame("Jawaan");
    JPanel header = new JPanel();
    JPanel welcomeBody = new JPanel();
    JPanel mainBody = new JPanel();
    JButton rowButton = new JButton("Confirm");
    JButton resetButton = new JButton("Reset");
    JTextField rowField = new JTextField();
    JTextField seatField = new JTextField();
    JLabel rowLabel = new JLabel("Enter Row no : ");
    JLabel seatLabel = new JLabel("Enter seat no : ");
    JLabel messageLabel = new JLabel();

    ArrayList<Show> shows;
    ArrayList<Theatre> theatres;
    ArrayList<Booking> bookings;
    ArrayList<Customer> customers;
    int showNumber = 0;
    Customer customer;
    Random rnd = new Random();
    int costumerId = rnd.nextInt(999);

    JawaanGui(ArrayList<Show> shows1, ArrayList<Theatre> theatres1, ArrayList<Booking> bookings1,
            ArrayList<Customer> customers1, int showNumber, String str) {
        shows = shows1;
        theatres = theatres1;
        bookings = bookings1;
        customers = customers1;
        this.showNumber = showNumber;
        customer = new Customer(costumerId);
        customers.add(customer);

        // header
        header.setBackground(Color.RED);
        header.setBounds(0, 0, 800, 100);
        header.setLayout(null);

        // welcome body
        welcomeBody.setBackground(Color.BLUE);
        welcomeBody.setBounds(0, 100, 800, 50);
        welcomeBody.setLayout(null);

        // main body
        mainBody.setBackground(Color.GREEN);
        mainBody.setBounds(0, 150, 800, 650);
        mainBody.setLayout(new GridLayout(1, 04, 015, 015));

        JLabel label1 = new JLabel(new ImageIcon("jawaan.jpg"));
        label1.setText("Select Seat");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);

        rowLabel.setBounds(0, 300, 75, 25);
        rowField.setBounds(75, 300, 200, 25);

        seatLabel.setBounds(0, 350, 75, 25);
        seatField.setBounds(75, 350, 200, 25);

        messageLabel.setBounds(75, 450, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        rowButton.setBounds(75, 400, 100, 25);
        rowButton.setFocusable(false);
        rowButton.addActionListener(this);

        resetButton.setBounds(175, 400, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        // frame.add(textArea);
        JTextArea textArea = new JTextArea();

        label1.add(rowLabel);
        label1.add(rowField);
        label1.add(seatLabel);
        label1.add(seatField);
        label1.add(messageLabel);
        label1.add(rowButton);
        label1.add(resetButton);

        textArea.setText(str);
        mainBody.add(label1);
        mainBody.add(textArea);

        // default frame format

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);

        frame.add(header);
        frame.add(welcomeBody);
        frame.add(mainBody);

        frame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        // my code
        if (e.getSource() == rowButton) {
            String userID = rowField.getText();
            String password = rowField.getText();

            int userIDInt = Integer.parseInt(userID);
            int passwordInt = Integer.parseInt(password);

            Booking booking = new Booking(customer, shows.get(showNumber - 1));
            if (booking.reserveSeat(userIDInt - 1, passwordInt - 1)) {
            bookings.add(booking);
            messageLabel.setText("The seat is now reserved for you.");
                frame.dispose();
                PayementGatewayGUI paymentFrame = new PayementGatewayGUI(bookings, customers, costumerId);
            
            } else {
            messageLabel.setText("Sorry the seat is already reserved.");
            }
        }

        if (e.getSource() == resetButton) {
            rowField.setText("");
            seatField.setText("");
        }
    }

}