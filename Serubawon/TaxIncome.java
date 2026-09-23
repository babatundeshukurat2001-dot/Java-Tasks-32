import java.util.Scanner;
    public class TaxIncome{

    public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);

  System.out.print("Enter income: ");
  double income = scanner.nextDouble();

  double tax = 0;

  if (income > 600000){
    tax += (income - 600000) * 0.15;
    income = 600000;
  }

  if (income > 300000){
    tax += (income - 300000) * 0.07;
  }

  System.out.println("Total tax: " + tax);

 }
}
