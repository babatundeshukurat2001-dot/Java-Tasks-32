public class ProductOfInteger{
  public static void main(String[] args){
    int count = 1;
    long product = 1;
    while(count <= 10){
      product = product * count;
     count++;
    }
    System.out.println(product);
  }
}
