import java.util.Scanner;
    
    public class AgeCategory{

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter age: ");
    int age = scanner.nextInt();

    if (age < 13) {
    System.out.println("Child");
    } 
    else if (age <= 17) {
    System.out.println("Teenager");
    } 
    else if (age <= 64) {
    System.out.println("Adult");
    } 
    else {
    System.out.println("Senior");
    }

}

}
