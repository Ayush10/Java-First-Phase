import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Is it a Cube or Cubiod: ");
        System.out.println("Enter Cu for Cube and Cb for Cuboid: ");
        String choice = sc.nextLine();

        int length = 0;
        int width = 0;
        int height = 0;
        int side = 0;

        if (choice.toLowerCase() == "cu") {
            System.out.println("Enter the side: ");
            side = sc.nextInt();
        } else if (choice.toLowerCase() == "cb") {
            System.out.println("Enter the length: ");
            length = sc.nextInt();

            System.out.println("Enter the width: ");
            width = sc.nextInt();

            System.out.println("Enter the height: ");
            height = sc.nextInt();
        } else {
            System.out.println("Invalid Input!!");
            System.out.println("Please follow the Instructions properly.");
        }

        Dimension d1 = new Dimension(length, width, height);
        Dimension d2 = new Dimension(side);


    }
}

class Dimension {

    private int length;
    private int width;
    private int height;
    private int side;

    public Dimension(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public Dimension(int s) {
        side = s;
    }

    public double volume() {
        return length * width * height;
    }

    public double volume(int side) {
        return side * side * side;
    }

    public double area() {
        return 2 * (length * width + width * height + height * length);
    }

    public double area(int side) {
        return 6 * side * side;
    }
}
