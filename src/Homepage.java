import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;;

public class Homepage {

    JFrame frame = new JFrame("Home");
    JLabel welcomeLabel = new JLabel("Hello!");
    JPanel header = new JPanel();
    JPanel welcomeBody = new JPanel();
    JPanel mainBody = new JPanel();
    ArrayList<Customer> customers;

    Homepage(String userID, ArrayList<Customer> customers1) {
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

        JLabel label1 = new JLabel(new ImageIcon("002-video-player.png"));
        label1.setText("Book a Show");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                BookAShow bookAShow = new BookAShow(customers);
            }
        });

        JLabel label2 = new JLabel(new ImageIcon("003-watching-a-movie.png"));
        label2.setText("Display Shows");
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.BOTTOM);
        label2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                DisplayShow displayAShow = new DisplayShow();
            }
        });

        JLabel label3 = new JLabel(new ImageIcon("001-cancel.png"));
        label3.setText("Cancel a Show");
        label3.setHorizontalTextPosition(JLabel.CENTER);
        label3.setVerticalTextPosition(JLabel.BOTTOM);
        label3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                CancelABooking cancelABooking = new CancelABooking(customers);
            }
        });

        JLabel label4 = new JLabel(new ImageIcon("004-exit.png"));
        label4.setText("Exit");
        label4.setHorizontalTextPosition(JLabel.CENTER);
        label4.setVerticalTextPosition(JLabel.BOTTOM);
        label4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
            }
        });

        mainBody.add(label1);
        mainBody.add(label2);
        mainBody.add(label3);
        mainBody.add(label4);

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