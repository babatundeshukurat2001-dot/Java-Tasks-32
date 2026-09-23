import java.util.Scanner;

    public class PositiveCheck{
    
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();

if (number > 0) {
    System.out.println("Positive");
    }

}

}
