import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {

    public static void main(String[] args) {
        MyFrame1 frame = new MyFrame1();
    }
}

class MyFrame1 extends JFrame  implements ActionListener {

    Container c;
    JLabel label, label1;
    JTextField user;
    JPasswordField pass;
    JButton button;

    MyFrame1() {
        setTitle("Login Form");
        setSize(700, 500);
        setLocation(100, 100);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        label = new JLabel("Username");
        label1 = new JLabel("Password");

        label.setBounds(10, 50, 100, 20);
        label1.setBounds(10, 100, 100, 20);

        c.add(label);
        c.add(label1);

        user = new JTextField();
        user.setBounds(120, 50, 120, 20);
        c.add(user);

        pass = new JPasswordField();
        pass.setBounds(120, 100, 120, 20);
        c.add(pass);

        button = new JButton("Login");
        button.setBounds(100, 150, 70, 20);
        c.add(button);

        button.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Username: " + user.getText());
        System.out.println("Password: " + pass.getText());
    }
}
