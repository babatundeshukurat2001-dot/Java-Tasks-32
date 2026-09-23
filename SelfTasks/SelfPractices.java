public class SelfPractices {
    public static void main(String[] args) {
        int n = 10;

        // (a) Increasing stars
        System.out.println("(a)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // (b) Decreasing stars
        System.out.println("(b)");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // (c) Decreasing stars (same pattern as b)
        System.out.println("(c)");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // (d) Increasing stars (same pattern as a)
        System.out.println("(d)");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//stars with collecting input

//import java.util.Scanner;
//
//public class BarChart {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] numbers = new int[5];
//
//        // Read five numbers between 1 and 30
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print("Enter number " + (i + 1) + " (1-30): ");
//            numbers[i] = input.nextInt();
//
//            // Optional validation to ensure input is within range
//            while (numbers[i] < 1 || numbers[i] > 30) {
//                System.out.print("Invalid. Enter a number between 1 and 30: ");
//                numbers[i] = input.nextInt();
//            }
//        }
//
//        // Display the bar chart after all numbers are read
//        System.out.println("\nBar Chart:");
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 1; j <= numbers[i]; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        input.close();
//    }
//}
//

// student grade using switch case

//import java.util.Scanner;
//
//public class StudentGrades {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int aCount = 0;
//        int bCount = 0;
//        int cCount = 0;
//        int dCount = 0;
//        int fCount = 0;
//
//        final int NUM_STUDENTS = 5;
//
//        for (int i = 1; i <= NUM_STUDENTS; i++) {
//            System.out.print("Enter name for student " + i + ": ");
//            String name = input.next();
//
//            System.out.print("Enter grade for " + name + ": ");
//            char grade = input.next().charAt(0);
//            grade = Character.toUpperCase(grade);
//
//            switch (grade) {
//                case 'A':
//                    aCount++;
//                    break;
//                case 'B':
//                    bCount++;
//                    break;
//                case 'C':
//                    cCount++;
//                    break;
//                case 'D':
//                    dCount++;
//                    break;
//                case 'F':
//                    fCount++;
//                    break;
//                default:
//                    System.out.println("Invalid grade entered for " + name);
//                    break;
//            }
//
//            System.out.println(); // blank line for readability
//        }
//
//        // Display results
//        System.out.println("Grade Summary:");
//        System.out.println("Number of students who received an A: " + aCount);
//        System.out.println("Number of students who received a B: " + bCount);
//        System.out.println("Number of students who received a C: " + cCount);
//        System.out.println("Number of students who received a D: " + dCount);
//        System.out.println("Number of students who received an F: " + fCount);
//
//        input.close();
//    }
//}
//
//Diamond stars using selection statement
//
//public class DiamondPattern {
//    public static void main(String[] args) {
//        int n = 5; // number of rows in the top half
//
//        // Top half - increasing stars (1, 3, 5, 7, 9)
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // Bottom half - decreasing stars (7, 5, 3, 1)
//        for (int i = n - 1; i >= 1; i--) {
//            for (int j = 1; j <= (2 * i - 1); j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
