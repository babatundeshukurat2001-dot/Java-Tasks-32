import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;

        System.out.printf("The area is: %.2f%n", area);

        
    }
}
