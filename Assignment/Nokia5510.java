
import java.util.Scanner;

public class Nokia5510 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Menu();
    }


    static void Menu() {

        System.out.println("""
                
                ----- NOKIA 5510 -----
                
                1. Phone Book
                2. Messages
                3. Games
                """);

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                phoneBook();
                break;

            case 2:
                messages();
                break;

            case 3:
                games();
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }


    static void phoneBook() {

        System.out.println("""
                
                ----- PHONE BOOK -----
                
                1. Search
                2. Add name
                3. Options
                """);

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println(" Search");
                break;

            case 2:
                System.out.println(" Add name");
                break;

            case 3:
                options();
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }


    static void options() {

        System.out.println("""
                
                ----- OPTIONS -----
                
                1. Memory in use
                2. Type of view
                3. Memory status
                """);

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Memory in use");
                break;

            case 2:
                System.out.println("Type of view");
                break;

            case 3:
                System.out.println("Memory status");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }


    static void messages() {

        System.out.println("""
                
                ----- MESSAGES -----
                
                1. Inbox
                2. Write message
                3. Sent items
                """);

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println(" Inbox");
                break;

            case 2:
                System.out.println(" Write message");
                break;

            case 3:
                System.out.println(" Sent items");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }


    static void games() {

        System.out.println("""
                
                ----- GAMES -----
                
                1. Snake
                2. Memory
                """);

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println(" Snake");
                break;

            case 2:
                System.out.println(" Memory");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}


