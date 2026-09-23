import java.util.Scanner;
    public class Year{

     public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

    System.out.print("Enter month 1-12: "); 
    int month = scanner.nextInt();

    int days;
    if (month == 2){
  System.out.print("Enter year: ");
 int y = scanner.nextInt();

  if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) days=29; 
    else days=28;
    } 
    else if (month == 4|| month == 6|| month == 9|| month == 11) days=30;
    else days = 31;
    System.out.println(days + " days");
}
}
