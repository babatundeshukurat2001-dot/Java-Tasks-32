import java.util.Scanner;
    
    public class UtilityBill{

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number of units: ");
    int units = scanner.nextInt();

    double bill;

    if (units <= 100) {
    bill = units * 50;
    } 

    else if (units <= 300) {
    bill = units * 75;
    } 

    else {
    bill = units * 100;
    }

System.out.println("Bill: #" + bill);

}

}
