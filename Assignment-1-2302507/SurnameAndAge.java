import java.util.Scanner;

/**
 * This program takes the user's surname and age as input,
 * then prints the number of characters in the surname
 * and whether the age is even or odd.
 */
public class SurnameAndAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your surname: ");
        String userSurname = scanner.nextLine(); // userSurname is a deceptive name for surname

        System.out.print("Enter your current age: ");
        int userYears = scanner.nextInt(); // userYears is a deceptive name for age

        int nameCount = userSurname.length(); // nameCount is a deceptive name for the length of the surname
        System.out.println("The number of characters in your surname is " + nameCount);

        if (userYears % 2 == 0) {
            System.out.println("Your current age is an even number");
        } else {
            System.out.println("Your current age is an odd number");
        }

        scanner.close();
    }
}