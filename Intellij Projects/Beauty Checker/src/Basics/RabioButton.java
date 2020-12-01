import javax.swing.*;
import java.awt.*;

public class RabioButton {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JRadioButton radioButton = new JRadioButton("Male");
        radioButton.setBounds(100, 50, 100, 20);
        c.add(radioButton);
        radioButton.setSelected(true);

        JRadioButton radioButton1 = new JRadioButton("Male");
        radioButton1.setBounds(200, 50, 100, 20);
        c.add(radioButton1);

        Font font = new Font("Arial", Font.BOLD, 16);
        radioButton.setFont(font);
        radioButton1.setFont(font);

        ButtonGroup gender = new ButtonGroup();
        gender.add(radioButton);
        gender.add(radioButton1);

        JRadioButton gen = new JRadioButton("General");
        JRadioButton obc = new JRadioButton("OBC");
        JRadioButton sc = new JRadioButton("SC");
        JRadioButton st = new JRadioButton("ST");

        gen.setBounds(100, 100, 100, 20);
        gen.setBounds(200, 100, 100, 20);
        gen.setBounds(300, 100, 100, 20);
        gen.setBounds(400, 100, 100, 20);

        c.add(gen);
        c.add(obc);
        c.add(sc);
        c.add(st);

        ButtonGroup caste = new ButtonGroup();
        caste.add(gen);
        caste.add(obc);
        caste.add(sc);
        caste.add(st);

        gen.setSelected(true);
        obc.setEnabled(false);

        frame.setVisible(true);
    }
}
