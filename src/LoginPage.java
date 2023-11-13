import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame("Welcome to Eblaplex");

    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");

    JTextField userIDField = new JTextField();

    JPasswordField userPasswordField = new JPasswordField();

    JLabel userIDLabel = new JLabel("UserID : ");
    JLabel userPasswordLabel = new JLabel("Password : ");
    JLabel messageLabel = new JLabel();

    User[] logininfo = new User[4];

    LoginPage(User[] logininfoOriginal) {
        logininfo = logininfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        userIDField.setBounds(125, 100, 200, 25);

        userPasswordLabel.setBounds(50, 150, 75, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        messageLabel.setBounds(125, 250, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        // default frame format
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {
        // my code
        if (e.getSource() == loginButton) {
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            for (User user : logininfo) {
                if (user.getUsername().equals(userID)) { // equal er method return niye jhamela ase; strings diye direct compare korle comments thik bhabe kaaj kore but user pass kore hche na; only login ta hoche
                    if (user.getPassword().equals(password)) {
                        messageLabel.setForeground(Color.green);
                        messageLabel.setText("Login successful"); // ken jani dekhache na - 13.11.23 12.24 pm
                        // frame.dispose();
                        Homepage welcomePage = new Homepage(userID);
                    } else {
                        messageLabel.setForeground(Color.red);
                        messageLabel.setText("Wrong password"); // ken jani dekhache na - 13.11.23 12.24 pm
                    }
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("username not found");
                }
            }
        }

        if (e.getSource() == resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
        }
    }
}
