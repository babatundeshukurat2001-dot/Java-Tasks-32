import java.util.Scanner;

public class SeriesSum {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        double sum = 0;

        for(int count = 1; count <= number; count++){

            sum += 1.0 / count;
        }
        System.out.printf("Sum = %.4f\n", sum);
    }
}
