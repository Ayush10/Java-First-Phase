//package revisedsolution;
//
//import java.util.Scanner;
//
//public class ElectricityBill {
//
//    private int customerId;
//    private String name;
//    private int units;
//    private int amount;
//
//    private int input() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter Customer ID: ");
//        customerId = sc.nextInt();
//
//        System.out.println("Enter the name of the customer: ");
//        sc.nextLine();
//        name = sc.nextLine();
//
//        System.out.println("Enter number of units consumed: ");
//        units = sc.nextInt();
//
//        return calculte();
//    }
//
//    private int calculte() {
//        if (units <= 20) {
//            return amount = 7 * units;
//        } else if (units >= 21 && units <= 80) {
//            return amount = 140 + 10 * (units - 20);
//        } else if (units >= 81 && units <= 120) {
//            return amount = 740 + 15 * (units - 80);
//        } else {
//            return amount = 1370 + 20 * (units - 120);
//        }
//    }
//
//    private void display() {
//        input();
//        System.out.println("Customer Id         Name                Units Consumed          Amount");
//        System.out.printf("%d                   %s                  %d                      %d", customerID, name, units, amount);
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
