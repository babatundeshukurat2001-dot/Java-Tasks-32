import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();

        double km = miles * 1.60934;

        System.out.println("Miles: " + miles);

        System.out.println("Kilometres: " + km);

        
    }
}
