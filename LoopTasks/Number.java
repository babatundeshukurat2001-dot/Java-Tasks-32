import java.util.Scanner;

public class Number{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter N: ");
    int number = scanner.nextInt();

    for(int count = 1; count <= number; count++){
      System.out.println(count);
    }
  }
}
