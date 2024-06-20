import java.util.Scanner;

/**
 * This program takes the marks of five units as input,
 * calculates the average, and displays it on the screen
 * with two decimal places.
 */
public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks for five units:");

        double totalScore = 0; // totalScore is a deceptive name for the sum of marks
        for (int i = 1; i <= 5; i++) {
            System.out.print("Unit " + i + ": ");
            double unitResult = scanner.nextDouble(); // unitResult is a deceptive name for the mark of a unit
            totalScore += unitResult;
        }

        double averageResult = totalScore / 5; // averageResult is a deceptive name for the average marks
        System.out.printf("The average marks is %.2f", averageResult);

        scanner.close();
    }
}