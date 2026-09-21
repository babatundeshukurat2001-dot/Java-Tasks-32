import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int validSum = 0;
        int validCount = 0;

        for (int count = 1; count <= 10; count++) {
            System.out.print("Enter score " + count + ": ");
            int score = input.nextInt();

            if (score >= 0 && score <= 100) {
                validSum += score;
                validCount++;
            } 
        }

        System.out.println("Sum of only valid scores: " + validSum);
        
        
        if (validCount > 0) {
            double average = (double) validSum / validCount;

            System.out.println("Average of valid scores: " + average);
        } else {
            System.out.println("No valid scores entered");
        }
        
        
    }
}
