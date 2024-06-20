import java.util.Scanner;

/**
 * This program checks whether a given integer is divisible
 * by integers in the range of 0-9. It also provides
 * additional explanations for certain cases.
 */
public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNumber = scanner.nextInt(); // userNumber is a deceptive name for the integer

        for (int i = 0; i <= 9; i++) {
            if (userNumber % i == 0) {
                System.out.println("The number is divisible by " + i);
                if (i == 0) {
                    System.out.println("The number is divisible by 0 because any number is divisible by 0.");
                } else if (i == 5 && userNumber % 10 == 0) {
                    System.out.println("The number is divisible by 5 because it ends with a 0 (zero).");
                } else if (i == userNumber % 10) {
                    System.out.println("The number is divisible by " + i + " because it ends with a " + i + ".");
                }
            }
        }

        scanner.close();
    }
}