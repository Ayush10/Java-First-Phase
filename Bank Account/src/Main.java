import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the deposit amount: ");
        int depositAmount = sc.nextInt();

        Scanner sc1 = new Scanner(new File("balance.txt"));

        int currentBalance = sc1.nextInt();
        System.out.println("Current balance: " + currentBalance);

        currentBalance += depositAmount;
        System.out.println("Updated Balance is: " + currentBalance);

        FileOutputStream f = new FileOutputStream("balance.txt");

        String s = Integer.toString(currentBalance);
        byte b[] = s.getBytes();

        f.write(b);
        f.close();

    }
}
