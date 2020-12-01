import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent2 {

    public static void main(String[] args) {
        MyFrame5 frame = new MyFrame5();
        frame.setTitle("Action Event");
        frame.setBounds(100, 100, 400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyFrame5 extends JFrame implements ActionListener {

    Container c;
    JTextField textField;

    public MyFrame5() {
        c = this.getContentPane();
        c.setLayout(null);
        textField = new JTextField();
        textField.setBounds(100, 100, 200, 80);
        c.add(textField);

        textField.addActionListener(this);
        textField.setFont(new Font("Arial", Font.BOLD, 15));

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String str = textField.getText();
        textField.setText(str.toUpperCase());
    }
}

