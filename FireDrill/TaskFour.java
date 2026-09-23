public class TaskFour {
    public static void main(String[] args) {

        System.out.print("(");

        for (int count = 1; count <= 10; count++) {

            if (count % 4 == 0) {
                System.out.print(count + " ");
            }
        }
        System.out.print(")");
    }
}

