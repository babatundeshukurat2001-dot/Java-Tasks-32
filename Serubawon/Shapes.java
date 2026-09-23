import java.util.Scanner;
public class Shapes{

     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 sides: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid");
        }
        else if (a == b && b == c) {
            System.out.println("Equilateral");
        }
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Scalene");
        }
        
    }
}
