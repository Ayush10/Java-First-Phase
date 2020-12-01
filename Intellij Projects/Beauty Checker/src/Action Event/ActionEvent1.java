import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent1 {

    public static void main(String[] args) {
        MyFrame4 frame = new MyFrame4();
        frame.setTitle("Action Event");
        frame.setBounds(100, 100, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyFrame4 extends JFrame implements ActionListener {

    Container c;
    JButton button;

    public MyFrame4() {
        c = this.getContentPane();
        c.setLayout(null);
        button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 30);
        c.add(button);

        button.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String str = button.getText();
        button.setText(str.toUpperCase());
    }
}
