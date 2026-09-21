import java.util.Scanner;

public class TaskSix {
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

        
        if (evenCount > 0) {
            double average = (double) evenSum / evenCount;
            System.out.println("Average of even numbers: " + average);
        } 
     
    }
}
