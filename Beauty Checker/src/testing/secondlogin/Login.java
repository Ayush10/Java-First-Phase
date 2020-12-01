package testing.secondlogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame{

    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JLabel userLabel, passLabel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1080, 720);
        Container c = getContentPane();
        c.setBackground(new Color(235, 235, 235));
        c.setLayout(null);

        JLabel exitButton = new JLabel("X");
        exitButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                super.mouseClicked(e);
                dispose();
            }
        });
        exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exitButton.setHorizontalAlignment(SwingConstants.CENTER);
        exitButton.setFont(new Font("Century Gothic", Font.BOLD, 22));
        exitButton.setForeground(Color.BLACK);
        exitButton.setBounds(420, 20, 46, 30);
        c.add(exitButton);

        userLabel = new JLabel("User");
        userLabel.setForeground(Color.WHITE);
        userLabel.setFont(new Font("Century Gothic", Font.PLAIN, 30));
        userLabel.setBounds(540, 360, 260, 50);
        c.add(userLabel);

        textField = new JTextField();
        textField.setBorder(null);
        textField.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        textField.setText("");
        textField.setBounds(540, 460, 260, 30);
        c.add(textField);


    }
}
