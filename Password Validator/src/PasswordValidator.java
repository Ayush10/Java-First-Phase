import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Username: ");
        String username = sc.next();

        System.out.println("Enter your Password: ");
        String password = sc.next();

        boolean validatity = validatePassword(username, password);

        if (validatity) {
            System.out.println("You are being navigated to the home page.");
        } else {
            System.out.println("Invalid input please try again.");
        }
    }

    private static boolean validatePassword(String username, String password) {

        if (username.length() >= 6 && password.length() >= 8) {
            return true;
        }

        return false;
    }
}
