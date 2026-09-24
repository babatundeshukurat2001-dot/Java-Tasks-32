import java.util.Scanner;

public class SalarySlip {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int count = 1; count <= 5; count++){
            System.out.print("Enter basic salary for employee " + count + ": ");

            double basic = scanner.nextDouble();

            double tax;

            if(basic <= 50000) tax = 0;

            else if(basic <= 150000) tax = basic * 0.10;

            else tax = basic * 0.20;
            
            double net = basic - tax;

            System.out.println("Gross: " + basic + " Tax: " + tax + " Net: " + net);

            System.out.println("--------------------");
        }
    }
}
