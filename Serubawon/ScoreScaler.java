import java.util.Scanner;

public class ScoreScaler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score out of 50: ");
        double score = scanner.nextDouble();

        double scaledScore = (score / 50) * 100;

        System.out.println("Original score (out of 50): " + score);

        System.out.println("Scaled score (out of 100): " + scaledScore);

        
    }
}
