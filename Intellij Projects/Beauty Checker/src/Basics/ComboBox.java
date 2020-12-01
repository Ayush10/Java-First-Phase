import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo Box");
        frame.setBounds(100, 100, 700, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        String[] values = {"A", "B", "C", "D"};

        JComboBox comboBox = new JComboBox(values);
        comboBox.setBounds(100, 100, 100, 30);
        c.add(comboBox);

        comboBox.setEditable(true);
//        comboBox.setSelectedItem("B");
        comboBox.setSelectedIndex(2); //using index values to select

        comboBox.setFont(new Font("Arial", Font.PLAIN, 20));

        JButton button = new JButton("OK");
        button.setBounds(300, 100, 100, 30);
        c.add(button);

        JLabel label = new JLabel("");
        label.setBounds(100, 300, 100, 30);
        c.add(label);

        comboBox.addItem("E");
        comboBox.removeItem("C");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String item = (String) comboBox.getSelectedItem();
                String item = String.valueOf(comboBox.getSelectedIndex());
                label.setText(item);
            }
        });

        frame.setVisible(true);
    }
}
