import java.util.Scanner;
public class Divisible {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter number:");
    num = sc.nextInt();
    if(num % 2 == 0 && num % 3 == 0 && num % 5 != 0)
System.out.println("Condition satisfied");
    else
System.out.println("Condition not satisfied");
  }
}
