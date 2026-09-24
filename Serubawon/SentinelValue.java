//A sentinel value is a special value used to tell a program when to stop receiving input.

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;

        System.out.print("Enter a number (-999 to stop): ");
        number = input.nextInt();

        while (number != -999) {

            count++;

            System.out.print("Enter a number (-999 to stop): ");
            number = input.nextInt();
        }

        System.out.println("Numbers entered: " + count);
    }
}
