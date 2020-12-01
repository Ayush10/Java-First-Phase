import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the customer: ");
        String name = sc.nextLine();

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account type: ");
        sc.nextLine();
        String type = sc.nextLine();

        System.out.println("Enter balance to place in account: ");
        double amount = sc.nextDouble();

        BankAccount b1 = new BankAccount(name, number, type, amount);
        BankAccount b2 = new BankAccount("Ayush", 1013, "Premium", 10000000);

        b1.deposit(amount);
        b1.withdraw(amount);

        b2.deposit(amount);
        b2.withdraw(amount);


        if (!b1.withdraw(50000)) {
            System.out.println("Insufficient funds in " + b1.getAccountNumber());
            System.out.println("Cannot withdraw the requested amount.");
        }

        if (!b2.withdraw(80000)) {
            System.out.println("Insufficient funds in " + b2.getAccountNumber());
        }

        b1.statement();
        b2.statement();
    }
}

class BankAccount {

    private static String nameOfDepositor;
    private static int accountNumber;
    private static String typeOfAccount;
    private static double balanceAmountInAccount;

    public BankAccount(String name, int number, String type, double amount) {
        nameOfDepositor = name;
        accountNumber = number;
        typeOfAccount = type;
        balanceAmountInAccount = amount;
    }

    public static void statement() {
        System.out.println("Account holder name is: " + nameOfDepositor);
        System.out.println("Account number is: " + accountNumber);
        System.out.println("Account type is: " +  typeOfAccount);
        System.out.println("Balance in the account is: " + balanceAmountInAccount);
    }

    public String getNameOfDepositor() {
        return nameOfDepositor;
    }

    public void setNameOfDepositor(String name) {
        nameOfDepositor = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int number) {
        accountNumber = number;
    }

    public String getTypeOfAccount() {
        return typeOfAccount;
    }

    public void setTypeOfAccount(String type) {
        typeOfAccount = type;
    }

    public double getBalanceAmountInAccount() {
        return balanceAmountInAccount;
    }

    public void setBalanceAmountInAccount(double amount) {
        balanceAmountInAccount = amount;
    }

    public static void deposit(double amount) {
        balanceAmountInAccount += amount;
    }

    public static boolean withdraw(double amount) {
        if (amount > balanceAmountInAccount) {
            return false;
        }

        balanceAmountInAccount -= amount;
        return true;
    }
}
