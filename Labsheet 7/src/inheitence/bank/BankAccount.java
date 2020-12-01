package inheitence.bank;

public class BankAccount {

    private String nameOfDepositor;
    private String accountNumber;
    private String typeOfAccount;
    private double amountInAccount;

    public BankAccount(String nameOfDepositor, String accountNumber, String typeOfAccount, double amountInAccount) {
        this.nameOfDepositor = nameOfDepositor;
        this.accountNumber = accountNumber;
        this.typeOfAccount = typeOfAccount;
        this.amountInAccount = amountInAccount;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Ayush", "A206562624", "Savings", 50000);
        
    }
}
