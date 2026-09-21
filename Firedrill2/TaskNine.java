import java.util.Scanner;

public class TaskNine {
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
        
       
    }
}
