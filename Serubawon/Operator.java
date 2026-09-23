import java.util.Scanner;

    public class Operator{

     public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

  System.out.print("Enter two numbers: ");
  double a = scanner.nextDouble();
  double b = scanner.nextDouble();
  
  System.out.print("Enter operation (+ - * /): ");
  String operator = scanner.next(); 
  
  if (operator.equals("+")) System.out.println(a + b);

  else if (operator.equals("-")) System.out.println(a - b);

  else if (operator.equals("*")) System.out.println(a * b);

  else if (operator.equals("/")){

    if (b == 0) System.out.println("Cannot divide by zero");

    else System.out.println(a / b);

  } 
    else System.out.println("Invalid operation");
 }
}
