import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String username, password;

        System.out.println("Enter Username: ");
        username = sc.next();

        System.out.println("Enter Password:");
        password = sc.next();

        Test1 test1 = new Test1();
        test1.register();
        String user = test1.user;
        String pass = test1.pass;

        System.out.println(user);
        System.out.println(pass);

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Valid Login");
        } else {
            System.out.println("Invalid Login");
        }

    }


}

class Test1 {

    public String user, pass;
//            , name, email;

//    public Test1(String user, String pass) {
////            , String name, String email) {
////        this.email = email;
////        this.name = name;
//        this.user = user;
//        this.pass = pass;
//    }

    public void register() {
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter name: ");
//        name = sc.next();
//
//        System.out.println("Enter email: ");
//        email = sc.next();

        System.out.println("Enter user: ");
        user = sc.next();

        System.out.println("Enter pass: ");
        pass = sc.next();
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
