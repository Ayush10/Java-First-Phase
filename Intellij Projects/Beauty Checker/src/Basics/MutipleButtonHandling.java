import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MutipleButtonHandling {

    public static void main(String[] args) {
        JFrame f = new JFrame("Menu");
        f.setBounds(100, 100, 700, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Container c = f.getContentPane();
        c.setLayout(null);

        JButton button = new JButton("click me");
        button.setBounds(100, 100, 100, 50);
        c.add(button);

        // Anonymous inner classes
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.BLUE);
            }
        });
    }
}
