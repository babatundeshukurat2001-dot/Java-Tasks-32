import java.util.Scanner;

public class ATM {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double balance = 0;

        int option = 0;

        while(option != 4){
            System.out.println("\n 1.Deposit 2.Withdraw 3.Balance 4.Exit");
            option = scanner.nextInt();

            if(option == 1){ System.out.print("Deposit: "); balance += scanner.nextDouble(); 
                }
            else if(option == 2){ 
                System.out.print("Withdraw: "); double w = scanner.nextDouble();

                if(w > balance) System.out.println("Overdraft not allowed!");
                else balance-=w;
            }
            else if(option == 3) System.out.println("Balance = " + balance);
        }
    }
}
