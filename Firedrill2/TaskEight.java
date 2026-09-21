import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int count = 1; count <= 10; count++) {
            int score;
            
          
            while (true) {
                System.out.print("Enter score " + count + " :");
                score = input.nextInt();
                
                if (score >= 0 && score <= 100) {

                    break; 

                } else {
                    System.out.println("Invalid! Score must be between 0 and 100.");
                }
            }
            
            total += score;
        }

        System.out.println("Sum: " + total);
       
    }
}

