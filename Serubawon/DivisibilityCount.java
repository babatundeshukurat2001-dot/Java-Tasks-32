import java.util.Scanner;

public class DivisibilityCount {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int only2 = 0, only3 = 0, both = 0, neither = 0;
        for(int count = 1; count <= 10; count++){
            System.out.print("Enter number " + count + ": ");

            int number = scanner.nextInt();

            boolean d2 = number % 2==0;

            boolean d3 = number % 3==0;

            if(d2 && d3) both++;

            else if(d2) only2++;

            else if(d3) only3++;

            else neither++;
        }
        System.out.println("Divisible by 2 only: " + only2);

        System.out.println("Divisible by 3 only: " + only3);

        System.out.println("Divisible by both: " + both);

        System.out.println("Divisible by neither: " + neither);
    }
}
