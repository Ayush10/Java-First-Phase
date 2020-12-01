import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionDemo4 {

    public static Container c;

    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionDemo4");
        frame.setBounds(100, 100, 700, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        c = frame.getContentPane();
        c.setLayout(null);

        JButton red = new JButton("Red");
        JButton yellow = new JButton("Yellow");
        JButton green = new JButton("Green");

        red.setBounds(100, 100, 100, 50);
        yellow.setBounds(250, 100, 100, 50);
        green.setBounds(400, 100, 100, 50);

        c.add(red);
        c.add(yellow);
        c.add(green);

        red.addActionListener(new RedClass());
        yellow.addActionListener(new YellowClass());
        green.addActionListener(new GreenClass());
    }
}

class RedClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo4.c.setBackground(Color.RED);
    }
}

class YellowClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo4.c.setBackground(Color.YELLOW);
    }
}

class GreenClass implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ActionDemo4.c.setBackground(Color.GREEN);
    }
}
