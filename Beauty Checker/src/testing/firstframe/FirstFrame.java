package testing.firstframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import testing.roundedbutton.RoundedBorder;

public class FirstFrame extends JFrame {

    private JPasswordField contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    FirstFrame firstFrame = new FirstFrame();
                    firstFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public FirstFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1080, 720);
        setLocationRelativeTo(null);
        Container c = getContentPane();
        c.setBackground(new Color(235, 235, 235));
        c.setLayout(null);
//        contentPane = new JPanel();
//        contentPane.setBackground(new Color(196, 196, 196));
//        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//        setContentPane(contentPane);
//        setUndecorated(true);

        JLabel first = new JLabel("Beauty");
        first.setHorizontalAlignment(SwingConstants.CENTER);
        first.setForeground(new Color(123, 104, 238));
        first.setFont(new Font("Roboto", Font.BOLD, 50));
        first.setBounds(250, 300, 300, 70);
        c.add(first);

        JLabel last = new JLabel("Checker");
        last.setHorizontalAlignment(SwingConstants.CENTER);
        last.setForeground(new Color(51, 204, 0));
        last.setFont(new Font("Roboto", Font.BOLD, 50));
        last.setBounds(480, 301, 300, 70);
        c.add(last);

        JButton loginButton = new JButton("Login");
        loginButton.setBorder(new RoundedBorder(20));
        loginButton.setBounds(400, 400, 250, 50);
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        loginButton.setBackground(new Color(51, 204, 0));
        c.add(loginButton);
        c.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.setBorder(new RoundedBorder(20));
        registerButton.setBounds(400, 500, 250, 50);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(147, 122, 219));
        registerButton.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        c.add(registerButton);

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
        exitButton.setBounds(1020, 20, 46, 30);
        c.add(exitButton);

        ImageIcon image = new ImageIcon("/images/intro.png");
//        int image_w = (int)Math.round(image.getIconWidth());
//        int image_h = (int)Math.round(image.getIconHeight());
//        Image image1 = image.getImage().getScaledInstance(image_w, image_h, Image.SCALE_SMOOTH);
//        image = new ImageIcon(image1);
//        setIconImage(image);
//        c.add(image);
        JLabel icon = new JLabel(image);
        c.add(icon);

//        JLabel lblNewLabel_2 = new JLabel("");
//        lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/images/intro.png")));
//        lblNewLabel_2.setBounds(167, 43, 261, 148);
//        contentPane.add(lblNewLabel_2);


        setUndecorated(true);


    }
}
