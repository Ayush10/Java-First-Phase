package letstry;

import testing.roundedbutton.RoundedBorder;

import javax.swing.*;
import java.awt.*;

public class Login extends Frame implements Initial {

    public Login() {
        container.setBackground(new Color(200, 200, 200));
        container.add(userLabel());
        container.add(userTextField());
        container.add(passLabel());
        container.add(passField());
        container.add(loginButton());
        doneButton();
//        container.setVisible(true);
    }

    private JLabel passLabel() {
        JLabel passLabel = new JLabel("Password");
        passLabel.setForeground(Color.WHITE);
        passLabel.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        passLabel.setBounds(100, 250, 100, 50);
        return passLabel;
    }

    private JLabel userLabel() {
        JLabel userLabel = new JLabel("User");
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        userLabel.setBounds(100, 153, 84, 50);
        return userLabel;
    }

    private JPasswordField passField() {
        JPasswordField passField = new JPasswordField();
        passField.setBounds(347, 201, 259, 50);
        passField.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        passField.setText("Ayush");
        return passField;
    }

    private JTextField userTextField() {
        JTextField userTextField = new JTextField();
        userTextField.setBounds(347, 154, 259, 50);
        userTextField.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        userTextField.setText("Ayush");
        return userTextField;
    }


    @Override
    public JButton loginButton() {
        JButton loginButton = new JButton("Login");
        loginButton.setBorder(new RoundedBorder(20));
        loginButton.setBounds(400, 400, 250, 50);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        loginButton.setBackground(new Color(51, 204, 0));
        return loginButton;
    }

    @Override
    public JButton registerButton() {
        return null;
    }
}
