import java.util.Scanner;

/*
Program 2 :  Reveres the given number ;
--> we are simply reverse the given number
---> input
           n = 23456 
     output
           n = 65432
*/
public class Program2 {
     public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number");
      int n = sc.nextInt();
      int r,sum=0;
      
      // logic to reverse the number
      while(n>0)
      {
          r = n%10;   
          sum = sum*10+r;   
          n = n/10; 
      }


    }
}
