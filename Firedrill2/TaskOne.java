//collect 10 score and print the sum
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int count = 1; count <= 10; count++) {

         System.out.print("Enter score " + count + ": ");

            int score = input.nextInt();

            total = total + score;
        }

        System.out.println("Sum: " + total);
        
        
    }
}
            
