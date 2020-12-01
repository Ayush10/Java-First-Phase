public class Test {

    public static void main(String[] args) {

//        int i = 5;
//        while (i < 8) {
//            for (int j = i; j > 4; j--) {
//                System.out.println((j + 1) + " ");
//            }
//
//            i++;
//        }

        int num = 2, val = 3;

        do {
            switch (num) {
                case 2:
                    System.out.println((num % val == 2) ? num++ : (num += val));
                    break;
                case 4:
                    System.out.println(num++ + "" + ++num);
                default:
                    System.out.println(num++);
            }
            System.out.println("stars");
        } while (num > 1 && num < 5);
    }
}
