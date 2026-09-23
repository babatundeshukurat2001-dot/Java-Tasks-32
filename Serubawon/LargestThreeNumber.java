import java.util.Scanner;
    
    public class LargestThreeNumber{

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int a = scanner.nextInt();

    System.out.print("Enter second integer: ");
    int b = scanner.nextInt();

    System.out.print("Enter third integer: ");
    int c = scanner.nextInt();

    int largest;
    if (a >= b && a >= c) {
    largest = a;
    } 
    else if (b >= a && b >= c) {
    largest = b;
    } 
    else {
    largest = c;
    }

System.out.println("Largest: " + largest);

}

}
