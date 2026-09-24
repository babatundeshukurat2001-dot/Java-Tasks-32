import java.util.Scanner;

public class LargerPair {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pairs (number): ");

         int number = scanner.nextInt();

        double overallLargest = Double.MIN_VALUE;
        int overallPair = 0;

        for(int count = 1; count <= number; count++){
            System.out.print("Enter pair " + count + " (two numbers): ");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            double larger = (a > b) ? a : b;
            System.out.println("Larger in pair " + count + " is: " + larger);
            
            if(larger > overallLargest){
                overallLargest = larger;
                overallPair = count;
            }
        }
        System.out.println("Overall largest " + overallLargest + " was in pair " + overallPair);
    }
}
