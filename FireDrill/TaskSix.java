
public class TaskSix {
    public static void main(String[] args) {

        System.out.print("(");

        for (int count = 1; count <= 10; count++) {

            if (count % 4 == 0) {

                int number = 1;

                for (int index = 1; index <= 5; index++) {

                    number = number * count; 

                    System.out.print(number + " ");
                }
            }
        }
        System.out.print(")");
    }
}
