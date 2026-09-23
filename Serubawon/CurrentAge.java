import java.util.Scanner;

public class CurrentAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int CURRENT_YEAR = 2025;

        System.out.print("Enter first name: ");
        String firstName = scanner.next();

        System.out.print("Enter last name: ");
        String lastName = scanner.next();

        System.out.print("Enter year of birth: ");
        int birthYear = scanner.nextInt();

        int age = CURRENT_YEAR - birthYear;

      
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age + " years");

       
    }
}
