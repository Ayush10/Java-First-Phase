import javax.swing.*;
import java.awt.*;

public class CheckBox {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JCheckBox checkBox = new JCheckBox("High School");
        JCheckBox checkBox1 = new JCheckBox("Intermediate");
        JCheckBox checkBox2 = new JCheckBox("Graduate");
        JCheckBox checkBox3 = new JCheckBox("Post-Graduate");

        checkBox.setBounds(100, 50, 220, 20);
        checkBox1.setBounds(100, 100, 220, 20);
        checkBox2.setBounds(100, 150, 220, 20);
        checkBox3.setBounds(100, 200, 220, 20);

        c.add(checkBox);
        c.add(checkBox1);
        c.add(checkBox2);
        c.add(checkBox3);

        checkBox.setSelected(true);
        checkBox3.setEnabled(false);

        Font font = new Font("Arial", Font.ITALIC, 20);
        checkBox.setFont(font);
        checkBox1.setFont(font);
        checkBox2.setFont(font);
        checkBox3.setFont(font);

        frame.setVisible(true);
    }
}
