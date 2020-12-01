package inheitence.interest;

public class Interest {
    private static double principal;
    private static double rate;
    private static double time;

    public Interest(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double pincipal) {
        this.principal = pincipal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public static void main(String[] args) {
        Interest interest = new Interest(1000, 5, 15);

        calculate();

    }

    private static void calculate() {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The calculated simple interest is: " + simpleInterest);
    }
}
