//package letstry;
//
//import javafx.scene.image.Image;
//import org.bytedeco.javacpp.BytePointer;
//import org.bytedeco.opencv.opencv_core.Mat;
//import org.bytedeco.opencv.opencv_core.Rect;
//import org.bytedeco.opencv.opencv_core.RectVector;
//import org.opencv.core.Core;
//import org.opencv.core.MatOfByte;
//import org.opencv.core.MatOfRect;
//import org.opencv.core.Scalar;
//import org.opencv.highgui.HighGui;
//import org.opencv.objdetect.CascadeClassifier;
//import org.opencv.video.Video;
//import org.opencv.videoio.VideoCapture;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayInputStream;
//
//public class BeautyCheck extends Frame implements Later{
//
//    JLabel photoLabel;
//
//    private DaemonThread daemonThread = null;
//    int count = 0;
//    VideoCapture webSource = null;
//    Mat frame = new Mat();
//    MatOfByte mem = new MatOfByte();
//    CascadeClassifier faceDetector = new CascadeClassifier(JavaCam.class.getResource("haarcascade_frontalface_alt.xml"));
//    MatOfRect faceDetections = new MatOfRect();
//
//    // Class of Thread
//    class DaemonThread implements Runnable {
//        protected volatile boolean runnable = false;
//
//        @Override
//        public void run() {
//            synchronized (this) {
//                while (runnable) {
//                    if (webSource.grab()) {
//                        try {
//                            webSource.retrieve(frame);
//                            Graphics graphics = photoLabel.getGraphics();
//                            faceDetector.detectMultiScale(frame, faceDetections);
//                            for (Rect rect: faceDetections.toArray()) {
//                                Core.rectangle(frame, new Point(rect.x, rect.y), new Point(rect.x(), rect.width()), rect.y() + rect.height(), new Scalar(0, 255, 0));
//                            }
//                            HighGui.imencode(".bmp", frame, mem);
//                            Image image = ImageIO.read(new ByteArrayInputStream(mem.toArray()));
//                            BufferedImage bufferedImage = (BufferedImage) image;
//                            if (graphics.drawImage(bufferedImage, 0, 0, getWidth(), getHeight()-150 , 0, 0, buff.getWidth(), buff.getHeight(), null)) {
//                                if (runnable == false) {
//                                    System.out.println("Paused ..... ");
//                                    this.wait();
//                                }
//                            }
//                        } catch (Exception ex) {
//                            System.out.println("Error!!" + ex);
//                            ex.printStackTrace();
//                        }
//                    }
//                }
//            }
//        }
//    }
//
//    BeautyCheck() {
//        container.add(beautyChecker());
//        container.add(photoLabel());
//    }
//
//    private Component photoLabel() {
//        photoLabel = new JLabel();
//        return null;
//    }
//
//    @Override
//    public JButton beautyChecker() {
//        return null;
//    }
//
//    @Override
//    public JButton beautyCompare() {
//        return null;
//    }
//
//    @Override
//    public JButton accountInfo() {
//        return null;
//    }
//
//
//}
