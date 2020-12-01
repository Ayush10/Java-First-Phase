public class PrivateBank implements BankRules {

    String customerName;

    public PrivateBank(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void interestPaid() {
        System.out.println(this.customerName + " is paid an interest of 5%.");
    }
}
