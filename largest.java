import java.util.Scanner;
public class Largest {
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    int a, b, c;
    System.out.printIn("Enter three numbers:");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if (a >= b && b >= c)
      System.out.println("Largest number is " +a);
    else if(b >= a && b >= c)
      System.out.println("Largest number is" +b);
    else
      System.out.println("Largest number is" +c);
  }
}
