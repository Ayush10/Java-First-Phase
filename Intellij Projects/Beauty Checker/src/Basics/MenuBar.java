import javax.swing.*;

public class MenuBar {

    public static void main(String[] args) {

        JFrame frame = new JFrame("MenuBar Example");
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");

        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");

        file.add(i1);
        file.add(i2);
        file.add(i3);

        JMenu edit = new JMenu("Edit");

        JMenuItem e1 = new JMenuItem("Undo");
        JMenuItem e2 = new JMenuItem("Redo");

        edit.add(i1);
        edit.add(i2);

        menuBar.add(file);
        menuBar.add(edit);

        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
