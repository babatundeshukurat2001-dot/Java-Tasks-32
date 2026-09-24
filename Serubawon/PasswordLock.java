import java.util.Scanner;

public class PasswordLock {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String password;
        int attempts = 0;
        do{
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            attempts++;

            if(password.equals("secret123")){
                System.out.println("Access granted");
                break;

            } else {
                System.out.println("Wrong password");
            }
            if(attempts == 3){
                System.out.println("Account locked.");
                break;
            }
        }while(true);
    }
}
