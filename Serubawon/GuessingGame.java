import java.util.Scanner;

import java.util.Random;

public class GuessingGame {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        int secret = rand.nextInt(10) + 1;
        int guess, attempts = 0;

        do {
            System.out.print("Guess (1-10): ");
            guess = scanner.nextInt();

            attempts++;

            if(guess != secret) System.out.println("Wrong! Try again.");
             }

            while(guess != secret);

        System.out.println("Correct! Attempts: " + attempts);
    }
}
