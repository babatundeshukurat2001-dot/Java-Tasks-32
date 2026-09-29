public class KataTask {

    // 1. Write a method that returns the maximum of two numbers.
    public static int max(int a, int b) {

        if (a > b) {
            return a;
        }
        return b;
    }

    // 2. isEven(integer) -> boolean
    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    // 3. isPrimeNumber(integer) -> boolean
    public static boolean isPrimeNumber(int number) {

        if (number < 2) {
            return false;
        }
        for (int count = 2; count <= Math.sqrt(number); count++) {
            if (number % count == 0) {
                return false;
            }
        }
        return true;
    }

    // 4. subtract(integer, integer) -> integer (always positive difference)
    public static int subtract(int a, int b) {

        if (a > b) {
            return a - b;
        }
        return b - a;
    }

    // 5. divide(integer, integer) -> float (0 if dividing by 0)
    public static float divide(int a, int b) {

        if (b == 0) {
            return 0;
        }
        return (float) a / b;
    }

    // 6. factorOf(integer) -> integer (count of factors)
    public static int factorOf(int number) {

        int count = 0;
        for (int index = 1; index <= number; index++) {
            if (number % index == 0) {
                count++;
            }
        }
        return count;
    }

    // 7. isPerfectSquare(integer) -> boolean
    public static boolean isPerfectSquare(int number) {

        int root = (int) Math.sqrt(number);
        return root * root == number;
    }

    // 8. isPalindrome(integer) -> boolean (for a 5-digit integer)
    public static boolean isPalindrome(int number) {

        int original = number;
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    // 9. factorialOf(integer) -> long
    public static long factorialOf(int number) {

        long result = 1;
        for (int count = 1; count <= number; count++) {
            result *= count;
        }
        return result;
    }

    

    public static void main(String[] args) {

        System.out.println("1. max(4, 9) = " + max(4, 9));

        System.out.println("2. isEven(7) = " + isEven(7));

        System.out.println("3. isPrimeNumber(13) = " + isPrimeNumber(13));

        System.out.println("4. subtract(3, 7) = " + subtract(3, 7));
        System.out.println("   subtract(7, 3) = " + subtract(7, 3));

        System.out.println("5. divide(10, 4) = " + divide(10, 4));
        System.out.println("   divide(10, 0) = " + divide(10, 0));

        System.out.println("6. factorOf(10) = " + factorOf(10));

        System.out.println("7. isPerfectSquare(25) = " + isPerfectSquare(25));

        System.out.println("8. isPalindrome(54145) = " + isPalindrome(54145));

        System.out.println("9. factorialOf(5) = " + factorialOf(5));

    }
}
