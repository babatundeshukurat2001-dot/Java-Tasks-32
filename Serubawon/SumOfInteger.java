public class SumOfInteger {
    public static void main(String[] args) {

        int sum = 0;

        for (int count = 1; count <= 100; count++) {
            sum = sum + count;
        }

        System.out.println("Sum = " + sum);
    }
}
