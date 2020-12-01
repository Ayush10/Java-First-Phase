package checkbox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class CheckBox {

    public static void main(String[] args) {
        MyFrame8 frame = new MyFrame8();
        frame.setTitle("Item Event");
        frame.setBounds(100, 100, 400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}

class MyFrame8 extends JFrame implements ItemListener {

    JCheckBox c1, c2, c3, c4;
    JTextArea textArea;

    public MyFrame8() {
        Container c = getContentPane();
        c.setLayout(null);

        c1 = new JCheckBox("10th");
        c2 = new JCheckBox("12th");
        c3 = new JCheckBox("Graduate");
        c4 = new JCheckBox("Post-Graduate");

        c1.setBounds(50, 50, 100, 30);
        c2.setBounds(50, 100, 100, 30);
        c3.setBounds(50, 150, 100, 30);
        c4.setBounds(50, 200, 100, 30);

        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        textArea = new JTextArea();
        textArea.setBounds(200, 50, 100, 100);

        c.add(textArea);

    }

    @Override
    public void itemStateChanged(java.awt.event.ItemEvent e) {
        if (e.getSource() == c1) {
            textArea.setText("10th");
        }
        if (e.getSource() == c2) {
            textArea.setText(textArea.getText() + "\n12th");
        }
        if (e.getSource() == c3) {
            textArea.setText(textArea.getText() + "\nGraduate");
        }
        if (e.getSource() == c4) {
            textArea.setText(textArea.getText() + "\nPost-Graduate");
        }
    }
}

