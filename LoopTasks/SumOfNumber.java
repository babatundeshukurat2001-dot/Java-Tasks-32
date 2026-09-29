import java.util.Scanner;

public class SumOfNumber{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter N: ");
    int number = scanner.nextInt();

    int sum = 0;
    for(int count = 1; count <= number; count++){

      sum += count;
    }
    System.out.println(sum);
  }
}
