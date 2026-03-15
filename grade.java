import java.util.Scanner;
public class Grade {
  public static void main(String[]agrs){
    Scanner sc = new Scanner(System.in);
    int marks;
    System.out.println("Enter marks:");
    marks = sc.nextmInt();
    if(marks >= 90)
      System.out.println("Grade A"):
    else if(marks >= 75)
        System.out.printlm("Grade B");
    else if(marks >= 50)
      System.out.println("Grade C");
    else
      System.out.println("Fail");
  }
}
