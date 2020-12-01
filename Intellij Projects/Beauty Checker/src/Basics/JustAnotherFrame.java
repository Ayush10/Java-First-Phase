import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JustAnotherFrame extends JFrame implements ActionListener {
    Container c;
    JButton button = new JButton("Red");
    JButton button1 = new JButton("Yellow");
    JButton button2 = new JButton("Green");

    JustAnotherFrame() {
        c = this.getContentPane();
        c.setLayout(null);

        button = new JButton("Submit");
        button.setBounds(100, 100, 100, 100);
        button.setBounds(200, 100, 100, 100);
        button.setBounds(300, 100, 100, 100);
        button.setBounds(400, 100, 100, 100);

        c.add(button);
        c.add(button1);
        c.add(button2);

        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            c.setBackground(Color.RED);
        }
        if (e.getSource() == button1) {
            c.setBackground(Color.YELLOW);
        }
        if (e.getSource() == button2) {
            c.setBackground(Color.GREEN);
        }
    };
}

class ActionDemo1 {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Action Demo");
        f.setSize(700, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
