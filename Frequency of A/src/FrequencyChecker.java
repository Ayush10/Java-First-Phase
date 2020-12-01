import java.util.Scanner;

public class FrequencyChecker {

    public static void main(String[] args) {

        String s = "Exercise is the best way to keep your mind and body healthy.";

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("The frequency of the letter a is: ");
    }
}
