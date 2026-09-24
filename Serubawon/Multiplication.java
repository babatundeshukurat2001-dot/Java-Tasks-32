import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int count = 1; count <= 12; count++) {
            System.out.println(number + " x " + count + " = " + (number * count));
        }
    }
}
