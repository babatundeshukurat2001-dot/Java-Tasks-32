import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenSum = 0;
        int evenCount = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score " + count + ": ");
            int score = input.nextInt();

            if (score % 2 == 0) {
                evenSum += score;
                evenCount++; 
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        
        if (evenCount > 0) {
            double average = (double) evenSum / evenCount;
            System.out.println("Average of even numbers: " + average);
        } 
     
    }
}
