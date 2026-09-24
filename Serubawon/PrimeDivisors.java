import java.util.Scanner;

public class PrimeDivisors {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: "); 
        int number = scanner.nextInt();

        System.out.print("Divisors: ");
        int divisorCount = 0;

        for(int count = 1; count <= number; count++){
            if(number % count == 0){
                System.out.print(count + " ");
                divisorCount++;
            }
        }
        if(divisorCount == 2) System.out.println("\n" + number + " is Prime");

        else System.out.println("\n" + number + " is Not Prime");
    }
}
