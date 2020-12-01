import java.util.Scanner;

public class ArrayChallenge {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integers = getIntegers(5);

        sortIntegers(integers);
        printArray(integers);
    }

    private static void printArray(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + integers[i]);
        }
    }

    private static int[] sortIntegers(int[] integers) {
//        boolean sorted = false;
        int temp;

        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                if (integers[i] < integers[j]) {
                    temp = integers[i];
                    integers[i] = integers[j];
                    integers[j] = temp;
                }
            }
        }

        return integers;
    }

    private static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values:\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scan.nextInt();
        }
        
        return values;
    }
    
    
}
