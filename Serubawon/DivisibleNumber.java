import java.util.Scanner;
public class DivisibleNumber{

     public static void main(String[] args){
     Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt(); 

    if (number % 3 == 0 && number % 5 == 0) 
    System.out.println("Divisible by 3 and 5");

    else if (number % 3 == 0) 
    System.out.println("Divisible by 3 only");

    else if (number % 5 == 0) 
    System.out.println("Divisible by 5 only");

    else System.out.println("Divisible by neither");

    
}

}
