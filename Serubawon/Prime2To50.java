public class Prime2To50 {

    public static void main(String[] args){

        for(int number=2; number<=50; number++){

            boolean isPrime = true;

            for(int count  =2; count * count <= number; count++){
                if(number % count == 0){ isPrime = false; break; }
            }
            if(isPrime) System.out.print(number + " ");
        }
    }
}
