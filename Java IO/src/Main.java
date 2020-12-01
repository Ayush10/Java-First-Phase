import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

//        InputStreamReader i = new InputStreamReader(System.in);
//        BufferedReader b = new BufferedReader(i);
//        PrintWriter p = new PrintWriter(System.out, true);
//
//        p.println("Type something here: ");
//        try {
//            String sentence = b.readLine();
//            p.println(sentence);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        FileInputStream f = new FileInputStream("demo.txt");
//
//        try {
//            int i = f.read();
//
//            while(i != -1) {
//                System.out.print((char)i);
//                i = f.read();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        f.close();

        FileOutputStream f = new FileOutputStream("demo.txt");

        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(i);

        System.out.println("Enter some message to be written inside the file:");
        String a = br.readLine();
        String s = "\nThis is a message.";
        byte b[] = s.getBytes();
        byte c[] = a.getBytes();

        f.write(c);
        f.write(b);

        f.close();

    }
}
