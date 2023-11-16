import java.awt.*;
import java.awt.event.*;
import java.awt.print.Book;
import java.util.*;
import javax.swing.*;

public class BookAShow implements ActionListener {
    JFrame frame = new JFrame("Book A Show");
    JPanel header = new JPanel();
    JPanel welcomeBody = new JPanel();
    JPanel mainBody = new JPanel();

    JRadioButton jawaanButton = new JRadioButton("jawaan");
    JRadioButton BarbieButton = new JRadioButton("Barbie");
    JRadioButton OppenheimerButton = new JRadioButton("Oppenheimer");

    BookAShow() {

        // header
        header.setBackground(Color.RED);
        header.setBounds(0, 0, 800, 100);
        header.setLayout(null);

        // welcome body
        welcomeBody.setBackground(Color.BLUE);
        welcomeBody.setBounds(0, 100, 800, 50);
        welcomeBody.setLayout(new GridLayout(1, 04, 015, 015));

        // main body
        mainBody.setBackground(Color.GREEN);
        mainBody.setBounds(0, 150, 800, 650);
        mainBody.setLayout(new GridLayout(4, 01, 015, 015));

        JLabel label1 = new JLabel(new ImageIcon("jawaan.jpg"));
        label1.setText("Jawaan");
        label1.setText("Main Theatre");
        label1.setText("21.11.23, time:4 30 pm, duration: 2 hrs");
        label1.setHorizontalAlignment(JLabel.LEFT);

        JLabel label2 = new JLabel(new ImageIcon("barbie.jpg"));
        label2.setText("Barbie");
        label2.setText("Royal Theatre");
        label2.setText("22.11.23, time:2 30 pm, duration: 1.5 hrs");
        label2.setHorizontalAlignment(JLabel.LEFT);

        JLabel label3 = new JLabel(new ImageIcon("oppenheimer.png"));
        label3.setText("Oppenheimer");
        label3.setText("Platinum Theatre");
        label3.setText("23.11.23, time:6 30 pm, duration: 3 hrs");
        label3.setHorizontalAlignment(JLabel.LEFT);

        welcomeBody.add(jawaanButton);
        welcomeBody.add(BarbieButton);
        welcomeBody.add(OppenheimerButton);

        jawaanButton.addActionListener(this);
        BarbieButton.addActionListener(this);
        OppenheimerButton.addActionListener(this);

        mainBody.add(label1);
        mainBody.add(label2);
        mainBody.add(label3);

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
        if (e.getSource() == jawaanButton) {
            frame.dispose();
            JawaanGui frameJawaanGui = new JawaanGui(); 

        } else if (e.getSource() == BarbieButton) {
            frame.dispose();
            BarbieGui frameBarbieGui = new BarbieGui();

        } else if (e.getSource() == OppenheimerButton) {
            frame.dispose();
            OppenheimerGui frameOppenheimerGui = new OppenheimerGui();

        }
    }

}
