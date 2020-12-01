import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    Container c;
    JButton button;

    MyFrame() {
        c = this.getContentPane();
        c.setLayout(null);

        button = new JButton("Submit");
        button.setBounds(100, 100, 100, 100);
        c.add(button);
        button.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.YELLOW);
    }

}

class ActionDemo {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("Action Demo");
        f.setSize(700, 500);
        f.setLocation(100, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}