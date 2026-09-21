
import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evenSum = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score " + count + ": ");
            int score = input.nextInt();

           
            if (count % 2 == 0) {
                evenSum += score;
            }
        }

        System.out.println("Sum of even indexes: " + evenSum);

    
    }
}
