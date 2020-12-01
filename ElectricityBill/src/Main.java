import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer ID: ");
        int customerID = sc.nextInt();

        System.out.println("Enter the name of the customer: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Enter number of units consumed: ");
        int unitsConsumed = sc.nextInt();

        ElectricityBill bill1 = new ElectricityBill(customerID, name, unitsConsumed);
        ElectricityBill bill2 = new ElectricityBill(1012, "Rahul", 100);

        bill1.calc();
        bill2.calc();

        System.out.println("Customer Id         Name                Units Consumed          Amount");
        bill1.display();
        bill2.display();
    }
}

class ElectricityBill {
    private int amount;
    private String name;
    private int units;
    private int customerID;

    public ElectricityBill(int id, String name, int units) {
        customerID = id;
        this.name = name;
        this.units = units;
        amount = 0;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getUnits() {
        return units;
    }

    public void display() {
        System.out.printf("%d                   %s                  %d                      %d", customerID, name, units, amount);
        System.out.println();
    }

    public int calc() {
        if (units <= 20) {
            return amount = 7 * units;
        } else if (units >= 21 && units <= 80) {
            return amount = 140 + 10 * (units - 20);
        } else if (units >= 81 && units <= 120) {
            return amount = 740 + 15 * (units - 80);
        } else {
            return amount = 1370 + 20 * (units - 120);
        }
    }
}
