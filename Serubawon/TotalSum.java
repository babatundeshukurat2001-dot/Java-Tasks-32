import java.util.Scanner;

public class TotalSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.print("Enter a number (0 to stop): ");
        number = input.nextInt();

        while (number != 0) {
            sum = sum + number;

            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();
        }

        System.out.println("Total sum = " + sum);
    }
}
