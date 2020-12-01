package letstry;

import testing.roundedbutton.RoundedBorder;

import javax.swing.*;
import java.awt.*;

public class BeautyChecker extends Frame implements Initial {

    public BeautyChecker() {
        container.setBackground(new Color(200, 200, 200));
        container.add(beautyLabel());
        container.add(checkerLabel());
        container.add(loginButton());
        container.add(registerButton());
        container.add(imageIconLabel());
    }

    private JLabel imageIconLabel() {
        ImageIcon image = new ImageIcon("/images/intro.png");
//        int image_w = (int)Math.round(image.getIconWidth());
//        int image_h = (int)Math.round(image.getIconHeight());
//        Image image1 = image.getImage().getScaledInstance(image_w, image_h, Image.SCALE_SMOOTH);
//        image = new ImageIcon(image1);
        JLabel imageIconLabel = new JLabel(image);
        imageIconLabel.setBounds(100, 100, image.getIconWidth(), image.getIconHeight());
        return imageIconLabel;
    }

    private JLabel beautyLabel() {
        JLabel beauty = new JLabel("Beauty");
        beauty.setHorizontalAlignment(SwingConstants.CENTER);
        beauty.setForeground(new Color(123, 104, 238));
        beauty.setFont(new Font("Roboto", Font.BOLD, 50));
        beauty.setBounds(250, 300, 300, 70);
        return beauty;
    }

    private JLabel checkerLabel() {
        JLabel checker = new JLabel("Checker");
        checker.setHorizontalAlignment(SwingConstants.CENTER);
        checker.setForeground(new Color(51, 204, 0));
        checker.setFont(new Font("Roboto", Font.BOLD, 50));
        checker.setBounds(480, 301, 300, 70);
        return checker;
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
        JButton registerButton = new JButton("Register");
        registerButton.setBorder(new RoundedBorder(20));
        registerButton.setBounds(400, 500, 250, 50);
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(new Color(147, 122, 219));
        registerButton.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        return registerButton;
    }

}
