import java.util.Scanner;

/*
   Program 11 : Factorial of given number
        
         5! = 120 --> 5 x 4 x 3 x 2 x 1
*/

public class Program11 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("enter the number");
      int n = sc.nextInt();
      int f=1;
      // logic 
      for (int i = 1; i <= n; i++) {
          f = f*i;
          //System.out.println(f);
      }
      System.out.println("Factorial of "+n+" : "+f);
  }  
}
