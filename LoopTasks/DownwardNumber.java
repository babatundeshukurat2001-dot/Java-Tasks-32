import java.util.Scanner;

public class DownwardNumber{

  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter N: ");
    int number = scanner.nextInt();

    for(int count = number; count >= 1; count--){
      System.out.println(count);
    }
  }
}
