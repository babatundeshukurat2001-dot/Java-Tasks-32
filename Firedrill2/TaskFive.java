
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenSum = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score " + count + ": ");
            int score = input.nextInt();

            if (score % 2 == 0) {
                evenSum += score;
            }
            int average = evenSum/ 10;
        }

        System.out.println("Sum of even numbers: " + evenSum);
        
    }
}
