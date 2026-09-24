import java.util.Scanner;

public class Factors {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter positive integer: ");
        int number = scanner.nextInt();
        int count = 1;

        while(count <= number){

            if(number % count == 0) System.out.println(count + " ");

            count++;
        }
    }
}
