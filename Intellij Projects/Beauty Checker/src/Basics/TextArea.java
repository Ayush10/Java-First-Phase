import javax.swing.*;
import java.awt.*;

public class TextArea {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container c = frame.getContentPane();
        c.setLayout(null);

        JTextArea text = new JTextArea();
        text.setBounds(100, 100, 400, 200);
        c.add(text);

        text.setFont(new Font("Arial", Font.BOLD, 15));
        text.setText("This is a text area.");
        text.setLineWrap(true);

        frame.setVisible(true);
    }
}
