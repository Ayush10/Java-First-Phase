import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle amount: ");
        double principle = sc.nextDouble();

        System.out.println("Enter the rate: ");
        double rate = sc.nextDouble();

        System.out.println("Enter the time: ");
        int time = sc.nextInt();

        Interest i1 = new Interest(5000, 10, 5);
        Interest i2 = new Interest(principle, rate, time);

        double interest = i1.simpleInterest();
        double interest1 = i2.simpleInterest();
        System.out.println("The interest of the calculated amount is: " + interest);
        System.out.println("The interest of the calculated amount is: " + interest1);
    }
}

class Interest {

    private static double principle;
    private static double rate;
    private static int time;

    public Interest(double p, double r, int t) {
        principle = p;
        rate = r;
        time = t;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double p) {
        principle = p;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double r) {
        rate = r;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int t) {
        time = t;
    }

    public static double simpleInterest() {
        double interest = (principle * rate * time) / 100;
        return interest;
    }
}
