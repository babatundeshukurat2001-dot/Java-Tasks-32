public class SwapNumber{

        public static void main(String[] args){

        int firstNumber = 5;
        int secondNumber = 9;

    System.out.println("Before swap: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

    System.out.println("After swap: firstNumber = " + firstNumber + ", secondNumber = " + secondNumber);

}

}
