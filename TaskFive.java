public class TaskFive {
    public static void main(String[] args) {

        System.out.print("( ");

        for (int count = 1; count <= 10; count++) {
            if (count % 4 == 0) {

                for (int index = 1; index <= 5; index++) {
                    System.out.print(count);
                }
                System.out.print(" ");
            }
        }
        System.out.print(")");
    }
}
