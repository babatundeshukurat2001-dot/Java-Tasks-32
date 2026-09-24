public class StarsPattern {
    public static void main(String[] args) {

        int number = 5;

        for (int count = 1; count <= number; count++) {

            for (int index = 1; index <= count; index++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
