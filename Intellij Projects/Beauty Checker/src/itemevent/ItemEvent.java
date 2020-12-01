package itemevent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class ItemEvent {

    public static void main(String[] args) {
        MyFrame7 frame = new MyFrame7();
        frame.setTitle("Item Event");
        frame.setBounds(100, 100, 400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}

class MyFrame7 extends JFrame implements ItemListener {

    JRadioButton male, female;
    JTextArea textArea;

    public MyFrame7() {
        Container c = getContentPane();
        c.setLayout(null);

        male = new JRadioButton("Male");
        male.setBounds(50, 50, 100, 20);

        female = new JRadioButton("Female");
        female.setBounds(50, 100, 100, 20);

        c.add(male);
        c.add(female);

        male.addItemListener(this);
        female.addItemListener(this);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(male);
        buttonGroup.add(female);

        textArea = new JTextArea();
        textArea.setBounds(200, 50, 100, 100);

        c.add(textArea);

    }

    @Override
    public void itemStateChanged(java.awt.event.ItemEvent e) {
        if (e.getSource() == male) {
            textArea.setText("Male is Clicked!");
        }
        if (e.getSource() == female) {
            textArea.setText("Female is Clicked!");
        }
    }
}
