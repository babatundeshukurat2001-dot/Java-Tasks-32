import java.util.Scanner;

public class Vowel{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a character: ");
    String input = scanner.next().toLowerCase();

    String vowels = "aeiou";
    String consonants = "bcdfghjklmnpqrstvwxyz";

        if (vowels.contains(input)){
      System.out.println("Vowel");
    } 
    
        else if (consonants.contains(input)){
      System.out.println("Consonant");
    } 
      else {
      System.out.println("Not a letter");
    }
 }
}
