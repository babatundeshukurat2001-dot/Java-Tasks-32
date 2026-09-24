import java.util.Scanner;

public class EvenPairs {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: "); 
        int number = scanner.nextInt();

        for(int count = 1; count <= number; count++){

            for(int index = count + 1; index <= number; index++){

                if((count + index) % 2 == 0){
                    System.out.println("(" + count + ", " + index + ")");
                }
            }
        }
    }
}
