import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;;

public class Homepage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");
    ImageIcon icon1 = new ImageIcon("002-video-player.png");
    JPanel header = new JPanel();
    JPanel welcomeBody = new JPanel();
    JPanel mainBody = new JPanel();
    //Jlabel layout1 = new JLabel("Book a Show", new ImageIcon("002-video-player.png"), 0);

    JLabel label1 = new JLabel("Book a Show", icon1, 0);


    Homepage(String userID) {

        welcomeLabel.setBounds(0, 0, 200, 35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello " + userID);

        // header
        header.setBackground(Color.RED);
        header.setBounds(0, 0, 800, 200);
        header.setLayout(null);

        // welcome body
        welcomeBody.setBackground(Color.BLUE);
        welcomeBody.setBounds(0, 200, 800, 100);
        welcomeBody.setLayout(null);

        // main body
        mainBody.setBackground(Color.GREEN);
        mainBody.setBounds(0, 300, 800, 500);
        mainBody.setLayout(new GridLayout(1, 04, 015, 015));

        mainBody.add(label1);

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