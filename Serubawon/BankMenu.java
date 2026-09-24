import java.util.Scanner;

public class BankMenu {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        int option;
        do{

            System.out.println("\n 1 = Deposit 2 = Withdraw 3 = Check Balance 4 = Exit");
            System.out.print("Choose: ");

             option = scanner.nextInt();

            if(option == 1){
                System.out.print("Amount to deposit: "); balance += scanner.nextDouble();
            } 
            else if(option == 2){
                System.out.print("Amount to withdraw: "); double w = scanner.nextDouble();

                if(w > balance) System.out.println("Insufficient funds!");
                else balance -= w;
            } 
                else if(option == 3){
                System.out.println("Balance: " + balance);
            }
        }while(option != 4);
    }
}
