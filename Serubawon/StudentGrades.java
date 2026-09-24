import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int count = 1; count <= 5; count++){
            System.out.print("Enter mark for student " + count + ": ");

            int mark = scanner.nextInt();

            if(mark >= 70) System.out.println("Grade: A");

            else if(mark >= 60) System.out.println("Grade: B");

            else if(mark >= 50) System.out.println("Grade: C");

            else if(mark >= 40) System.out.println("Grade: D");

            else System.out.println("Grade: F");
        }
    }
}
