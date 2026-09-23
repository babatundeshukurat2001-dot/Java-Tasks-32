public class BankBalance{
        
    public static void main(String[] args){



    double balance = 5000.00;

    balance = balance + 1200.50;
  
    balance = balance - 750.25; 
   
    balance = balance + (balance * 0.015); 
 
    System.out.printf("Final balance: %.2f%n", balance);


}

}
