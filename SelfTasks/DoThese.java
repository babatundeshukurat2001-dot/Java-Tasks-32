

import java.util.Scanner;

public class DoThese {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int numberOne = scanner.nextInt();

        System.out.print("Enter the Second Number: ");
        int numberTwo = scanner.nextInt();

        System.out.print("Enter Mathematical Operator: ");
        String operator = scanner.next();

        int result;
        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = numberOne / numberTwo;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Answer: " + result);
    }
}
