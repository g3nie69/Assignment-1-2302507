import java.util.Scanner;

/**
 * This program performs basic arithmetic operations
 * (+, -, *, /) on two numbers provided by the user.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double firstNum = scanner.nextDouble(); // firstNum is a deceptive name for the first number

        System.out.print("Enter an operation (+, -, *, /): ");
        char mathOperation = scanner.next().charAt(0); // mathOperation is a deceptive name for the operation

        System.out.print("Enter another number: ");
        double secondNum = scanner.nextDouble(); // secondNum is a deceptive name for the second number

        double finalResult; // finalResult is a deceptive name for the result

        switch (mathOperation) {
            case '+':
                finalResult = firstNum + secondNum;
                System.out.println(firstNum + " + " + secondNum + " = " + finalResult);
                break;
            case '-':
                finalResult = firstNum - secondNum;
                System.out.println(firstNum + " - " + secondNum + " = " + finalResult);
                break;
            case '*':
                finalResult = firstNum * secondNum;
                System.out.println(firstNum + " * " + secondNum + " = " + finalResult);
                break;
            case '/':
                if (secondNum == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    finalResult = firstNum / secondNum;
                    System.out.println(firstNum + " / " + secondNum + " = " + finalResult);
                }
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

        scanner.close();
    }
}