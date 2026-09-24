import java.util.Scanner;

public class ExamScores {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int pass = 0, fail = 0;

        for(int count = 1; count <=10; count++){
            System.out.print("Enter score " + count + ": ");
             int score = scanner.nextInt();

            if(score >= 50){

                System.out.println("Pass");
                pass++;
            } 
            else {
                System.out.println("Fail");
                fail++;
            }

        }
        System.out.println("Total Pass: " + pass);

        System.out.println("Total Fail: " + fail);
    }
}
