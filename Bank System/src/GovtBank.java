public class GovtBank implements BankRules {

    String customerName;
    public GovtBank(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void interestPaid() {
        System.out.println(this.customerName + " is paid an interest of 7%.");
    }
}
