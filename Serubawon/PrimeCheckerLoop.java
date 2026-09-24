import java.util.Scanner;

public class PrimeCheckerLoop {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;

        while(true){
            System.out.print("Enter positive integer (0 to stop): ");
            number = scanner.nextInt();

            if(number == 0) break;
            
            if(number < 2){
                System.out.println(number + " - Not prime");
                continue;
            }

            boolean isPrime = true;
            for(int count = 2; count * count <= number; count++){
                if(number % count == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) System.out.println(number + " - Prime");
            else System.out.println(number + " - Not prime");
        }
        
    }
}
