import javax.swing.*;
import java.awt.*;

public class Frame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.setSize(700, 500);
//        frame.setLocation(100, 100);
        frame.setBounds(100, 100, 700, 500);
        frame.setTitle("Beauty Checker | Login");
        frame.setResizable(true);

//        ImageIcon icon = new ImageIcon(null);

        Container c = frame.getContentPane();
        Color color = new Color(255,255,255);
        c.setBackground(color);

        c.setLayout(null);
        JLabel label = new JLabel("Username");
        label.setBounds(200, 50, 200, 30);

//        label.setText("Password");
        c.add(label);

        Font font = new Font("Arial", Font.BOLD, 30);
        label.setFont(font);

//        For inserting icons
//        ImageIcon icon = new ImageIcon("path");
//        JLabel label1 = new JLabel(icon);
//        label1.setBounds(100, 50, icon.getIconWidth(), icon.getIconHeight());

//        c.add(label1);

//        For inserting both image and icons
//        ImageIcon icon = new ImageIcon("path");
//        JLabel label2 = new JLabel("Username", icon, JLabel.RIGHT);
//        label2.setBounds(0, 100, 500, 100);
//        c.add(label2);

//

//        JPasswordField pass = new JPasswordField();
//        pass.setBounds(0, 200, 300, 30);
//        c.add(pass);
//
//        pass.setText("12345678");
//        pass.setFont(new Font("Arial", Font.PLAIN, 30));
//        pass.setEchoChar('*');
//        pass.setEchoChar((char)0);

//        Button and Button Icons
//        ImageIcon icon = new ImageIcon("path");
//        JButton buttons = new JButton(icon);
//        buttons.setSize(icon.getIconWidth(), icon.getIconHeight());
//        buttons.setLocation(200, 200);
//        JButton button = new JButton("Submit");
//        button.setSize(120, 30);
//        button.setLocation(100, 100);
//        c.add(button);
//
//        Font font1 = new Font("Arial", Font.PLAIN, 20);
//        button.setFont(font1);
//
//        button.setText("Submit");
//        button.setForeground(Color.WHITE);
//        button.setBackground(Color.RED);
//
//        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
//        button.setCursor(cursor);
//        button.setEnabled(true);
//        button.setVisible(true);

    }
}
