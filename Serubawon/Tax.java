import java.util.Scanner;

public class Tax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        double tax = price * 0.075;

        double total = price + tax;

        System.out.println("Total: " + total);
    }
}
