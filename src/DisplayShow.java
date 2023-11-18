import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;;

public class DisplayShow {

    JFrame frame = new JFrame("Display Shows");
    JLabel welcomeLabel = new JLabel("Hello!");
    JPanel header = new JPanel();
    JPanel welcomeBody = new JPanel();
    JPanel mainBody = new JPanel();
    ArrayList<Show> shows;
    ArrayList<Theatre> theatres;
    ArrayList<Booking> bookings;
    ArrayList<Customer> customers;

    DisplayShow(String userID, ArrayList<Show> shows1, ArrayList<Theatre> theatres1, ArrayList<Booking> bookings1,
            ArrayList<Customer> customers1) {
        shows = shows1;
        theatres = theatres1;
        bookings = bookings1;
        customers = customers1;

        welcomeLabel.setBounds(0, 0, 800, 40);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello " + userID);
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);

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
        label1.setText("Jawaan");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);

        JLabel label2 = new JLabel(new ImageIcon("barbie.jpg"));
        label2.setText("Barbie");
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.BOTTOM);

        JLabel label3 = new JLabel(new ImageIcon("oppen.jpg"));
        label3.setText("Oppenheimer");
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setVerticalTextPosition(JLabel.BOTTOM);

        mainBody.add(label1);
        mainBody.add(label2);
        mainBody.add(label3);


        // default frame format
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);

        welcomeBody.add(welcomeLabel);
        frame.add(header);
        frame.add(welcomeBody);
        frame.add(mainBody);

        frame.setVisible(true);

    }

}