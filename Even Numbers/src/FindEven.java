import java.util.Scanner;

public class FindEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Size: ");
        int size = input.nextInt();

        int numbers[] = new int[size];
        System.out.println("Enter " + size + " integer values: ");

        for (int i = 0; i < size; i++) {
            numbers[i] = input.nextInt();
        }

        System.out.println("The sum of the even numbers is: " + evenNumbers(numbers));
    }

    private static int evenNumbers(int[] numbers) {
        int total = 0;

        System.out.println("The even numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                total += numbers[i];
            }
        }
        System.out.println();

        return total;
    }
}
