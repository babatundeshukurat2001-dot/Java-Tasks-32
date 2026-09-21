import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;

        for (int count = 1; count <= 10; count++) {

            System.out.print("Enter score " + count + ": ");
            int score = input.nextInt();

            total += score;
        }

        double average = total / 10.0;

        System.out.println("Sum: " + total);
        System.out.println("Average: " + average);

        
    }
}
