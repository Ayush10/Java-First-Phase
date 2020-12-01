package itemevent.radiobuttonitemlistener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class RadioButton {

    public static void main(String[] args) {
        MyFrame8 frame = new MyFrame8();
        frame.setTitle("Item Event");
        frame.setBounds(100, 100, 400, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setVisible(true);
    }
}

class MyFrame8 extends JFrame implements ItemListener {

    JComboBox comboBox;
    JTextArea textArea;

    public MyFrame8() {
        Container c = getContentPane();
        c.setLayout(null);

        String[] values = {"A", "B", "C", "D"};
        comboBox = new JComboBox(values);
        comboBox.setBounds(50, 50, 100, 30);
        c.add(comboBox);

        comboBox.addItemListener(this);

        textArea = new JTextArea();
        textArea.setBounds(200, 50, 100, 100);
        c.add(textArea);
    }

    @Override
    public void itemStateChanged(java.awt.event.ItemEvent e) {
        String string = comboBox.getSelectedItem().toString();
        textArea.setText(string);
    }
}
