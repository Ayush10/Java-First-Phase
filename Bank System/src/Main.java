public class Main {

    public static void main(String[] args) {

        PrivateBank pb = new PrivateBank("Ayush");
        GovtBank gb = new GovtBank("Nisha");

        pb.interestPaid();
        gb.interestPaid();
    }
}
