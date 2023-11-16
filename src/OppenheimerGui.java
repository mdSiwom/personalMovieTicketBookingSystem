import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;;

public class OppenheimerGui {

    JFrame frame = new JFrame("Oppenheimer");
    JPanel header = new JPanel();
    JPanel welcomeBody = new JPanel();
    JPanel mainBody = new JPanel();

    OppenheimerGui() {

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
        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.dispose();
                BookAShow bookAShow = new BookAShow();
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


        mainBody.add(label1);
        mainBody.add(label2);

        // default frame format

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setLayout(null);

        frame.add(header);
        frame.add(welcomeBody);
        frame.add(mainBody);

        frame.setVisible(true);

    }

}