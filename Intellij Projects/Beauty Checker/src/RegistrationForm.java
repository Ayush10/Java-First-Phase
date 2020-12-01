import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class RegistrationForm {

    public static void main(String[] args) {
        MyFrame2 frame2 = new MyFrame2();
    }
}

class MyFrame2 extends JFrame implements ActionListener {

    JLabel label, label1, label2, label3, label4, label5;
    JTextField textField, textField1;
    JRadioButton male, female;
    JComboBox day, month, year;
    JTextArea textArea, screen;
    JCheckBox terms;
    JButton submit;
    JLabel msg;
    Calendar calendar = Calendar.getInstance();

    private String dates[]
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31", "32" };
    private String months[]
            = { "Jan", "feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sup", "Oct", "Nov", "Dec" };
    private String years[]
            = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };

    MyFrame2() {
        setTitle("Registration Form");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        label = new JLabel("First Name");
        label.setBounds(20, 50, 100, 20);
        c.add(label);

        textField = new JTextField();
        textField.setBounds(130, 50, 100, 20);
        c.add(textField);
        textField.setText("Ayush");

        label1 = new JLabel("Last Name");
        label1.setBounds(20, 100, 100, 20);
        c.add(label1);

        textField1 = new JTextField();
        textField1.setBounds(130, 100, 100, 20);
        c.add(textField1);
        textField1.setText("Ojha");

        label2 = new JLabel("Gender");
        label2.setBounds(20, 150, 100, 20);
        c.add(label2);

        male = new JRadioButton("Male");
        male.setBounds(130, 150, 80, 20);
        c.add(male);

        male.setSelected(true);

        female = new JRadioButton("Female");
        female.setBounds(220, 150, 80, 20);
        c.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        label3 = new JLabel("DOB");
        label3.setBounds(20, 200, 100, 20);
        c.add(label3);

//        String[] days = String.copyValueOf(calendar.get(Calendar.DAY_OF_MONTH));
//        String[] months = String.copyValueOf(calendar.get(Calendar.MONTH));
//        String[] years = String.copyValueOf(calendar.get(Calendar.YEAR));

        day = new JComboBox(dates);
        day.setBounds(130, 200, 50, 20);
        c.add(day);
        day.setSelectedIndex(19);

        month = new JComboBox(months);
        month.setBounds(190, 200, 50, 20);
        c.add(month);
        month.setSelectedItem("July");

        year = new JComboBox(years);
        year.setBounds(250, 200, 60, 20);
        c.add(year);
        year.setSelectedItem("1999");

        label4 = new JLabel("Address");
        label4.setBounds(20, 250, 100, 20);
        c.add(label4);

        textArea = new JTextArea();
        textArea.setBounds(130, 240, 200, 50);
        c.add(textArea);

        terms = new JCheckBox("Please Accept our Terms and Conditions.");
        terms.setBounds(50, 300, 250, 20);
        c.add(terms);

        submit = new JButton("Submit");
        submit.setBounds(150, 350, 80, 20);
        c.add(submit);

        submit.addActionListener(this);

        screen = new JTextArea();
        screen.setBounds(350, 50, 300, 300);
        c.add(screen);
        screen.setLineWrap(true);

        msg = new JLabel("");
        msg.setBounds(20, 400, 250, 20);
        c.add(msg);

//        c.setBackground(Color.YELLOW);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (terms.isSelected()) {
            msg.setText("Registration Successful!!");

            String firstName = textField.getText();
            String lastName = textField1.getText();
            String gender = "male";

            if (female.isSelected()) {
                gender = "female";
            }

            String dob = day.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem();
            String address = textArea.getText();

            screen.setText("First Name : " + firstName + "\nLast Name : " + lastName + "\nGender :" + gender
                    + "\nDOB : " + dob + "\nAddress : " + address
            );
        } else {
            msg.setText("Accept Terms and Conditions to Submit.");
            screen.setText("");
        }
    }
}
