import java.util.Scanner;

public class HihgestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score;
        int count = 0;
        int sum = 0;

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        System.out.print("Enter a score (-1 to stop): ");
        score = input.nextInt();

        while (score != -1) {

            sum = sum + score;
            count++;

            if (score > highest) {
                highest = score;
            }

            if (score < lowest) {
                lowest = score;
            }

            System.out.print("Enter a score (-1 to stop): ");
            score = input.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Highest score: " + highest);
            System.out.println("Lowest score: " + lowest);
            System.out.println("Average: " + average);
        } else {
            System.out.println("No scores were entered.");
        }
    }
}
