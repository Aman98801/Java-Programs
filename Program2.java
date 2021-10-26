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
      int x = n;
      // logic to reverse the number
      

      while(n>0)
      {
          r = n%10;   
          sum = sum*10+r;   
          n = n/10; 
      }
      
      System.out.println("Our original number is : "+x);
      System.out.println("Our Reverse number is : "+sum);
      
      
      /* logic 2  :  using StringBuilder class
        
       ---> this is inBuild class in java and there is predefined function reverse();
    
       StringBuilder sb = new StringBuilder();
       sb.append(n);
       StringBuilder rev = sb.reverse();
      
      System.out.println("Our original number is : "+x);
      System.out.println("Our Reverse number is : "+rev);
      
      */
      
      /*

      logic 3 : using StringBuffer class
      
      ---> this is inBuild class in java and there is predefined function reverse();
      
      StringBuffer sb = new StringBuffer();
      sb.append(n);
      StringBuffer rev = sb.reverse();

      // 2nd method : 
      
      //  StringBuffer sb = new StringBuffer(String.valueOf(n));
      //  StringBuffer rev = sb.reverse();

      System.out.println("Our original number is : "+x);
      System.out.println("Our Reverse number is : "+rev);

      */
      
      
    }
}
