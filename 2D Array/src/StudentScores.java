import java.util.Scanner;

public class StudentScores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int ROWS = 2;
        final int COLS = 4;
        double[][] scores = new double[ROWS][COLS];

        System.out.println("Enter four scores for: ");

        for (int i = 0; i < ROWS; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            for (int j = 0; j < COLS; j++) {
                System.out.print("Quiz " + (j + 1) + ": ");
                scores[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\nTotal and average for each student: ");
        totalAverageStd(scores);
        System.out.println("\nTotal and average for each Quiz: ");
        totalAverageQuiz(scores);
    }

    private static void totalAverageStd(double[][] scores) {
        int rows = 2, cols = 4;
        double average[] = new double[rows];
        int total = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                total += scores[i][j];
            }
            average[i] = total + 4;
            System.out.println("Student " + (i + 1) + ": Total scores: " + total +  "\tAverage: " + average[i]);
        }
    }

    static void totalAverageQuiz(double[][] scores) {
        int cols = 4;
        double[] average = new double[cols];
        double[] total = new double[cols];

        for (int i = 0;i<4;i++) {
            total[i] = scores[0][i] + scores[1][i];
        }
        for (int i = 0;i<4;i++) {
            average[i] = ((scores[0][i]+scores[1][i])/2);
        }
        for (int i = 0;i<4;i++) {
            System.out.println("Quiz " + (i + 1) +" : Total scores :" + total[i] + "\tAverage : "+ average[i]);
        }

    }
}
