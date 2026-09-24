public class LowMidHigh {

    public static void main(String[] args){

        for(int count = 1;count <= 20; count++){

            if(count <= 7) System.out.println(count + " - Low");

            else if(count <= 14) System.out.println(count + " - Mid");

            else System.out.println(count+ " - High");
        }
    }
}
