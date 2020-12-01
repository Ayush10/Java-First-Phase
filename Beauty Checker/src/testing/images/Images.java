package testing.images;

import java.awt.Image;

import javax.swing.*;

public class Images {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setLayout(null);
        JLabel l=new JLabel("Name");
//        final JTextField text=new JTextField(20);
//        JButton button = new JButton("Go");

        ImageIcon imageIcon = new ImageIcon("/images/intro.png");
        Image image = imageIcon.getImage();

        Image modifiedImage = image.getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(modifiedImage);


    }
}
