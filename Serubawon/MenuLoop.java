import java.util.Scanner;

public class MenuLoop{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("You selected Add.");
            } else if (choice == 2) {
                System.out.println("You selected Subtract.");
            } else if (choice == 3) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 3);
    }
}
