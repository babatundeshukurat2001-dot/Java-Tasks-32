import java.util.Scanner;
    
    public class CompareInteger{

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int a = scanner.nextInt();

    System.out.print("Enter second integer: ");
    int b = scanner.nextInt();

    if (a == b) {
    System.out.println("The numbers are equal.");
    }
 
    else if (a > b) {
    System.out.println("Larger: " + a);

    System.out.println("Smaller: " + b);
    } 

    else {
    System.out.println("Larger: " + b);

    System.out.println("Smaller: " + a);
    }

}

}   
