package letstry;

import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.bytedeco.opencv.opencv_core.IplImage;
import org.bytedeco.opencv.opencv_core.Mat;
import org.bytedeco.opencv.opencv_core.RectVector;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends Frame implements Later {

    Menu() {
        container.setBackground(new Color(255, 255, 255));
        container.add(beautyChecker());
        container.add(beautyCompare());
        container.add(accountInfo());
    }

    @Override
    public JButton beautyChecker() {
        JButton beautyButton = new JButton("Beauty Checker");
        beautyButton.setForeground(Color.WHITE);
        beautyButton.setBorder(null);
        beautyButton.setBackground(new Color(51, 204, 0));
        beautyButton.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        beautyButton.setBounds(348, 94, 176, 34);
        beautyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                OpenCVFrameGrabber frameGrabber = new OpenCVFrameGrabber(0);
//                try {
//                    frameGrabber.start();;
//                    IplImage iplImage = frameGrabber.grab();
//                    if (!iplImage == null) {
//                        cvSaveImage
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
            }
        });
        return beautyButton;
    }

    @Override
    public JButton beautyCompare() {
        JButton compareButton = new JButton("Beauty Checker");
        compareButton.setForeground(Color.WHITE);
        compareButton.setBorder(null);
        compareButton.setBackground(new Color(147, 122, 219));
        compareButton.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        compareButton.setBounds(348, 152, 176, 34);
        return compareButton;
    }

    @Override
    public JButton accountInfo() {
        JButton accountInfo = new JButton("Account Information");
        accountInfo.setForeground(Color.WHITE);
        accountInfo.setBorder(null);
        accountInfo.setBackground(new Color(212, 77, 3));
        accountInfo.setFont(new Font("Century Gothic", Font.PLAIN, 22));
        accountInfo.setBounds(348, 213, 176, 34);
        return accountInfo;
    }


}
