import java.util.Scanner;

/*
  Program 6 :  count the number of digits in a number  

   input :  354546
   output :  6
*/

public class Program6 {
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     
     System.out.println(" Enter the number");
     int n = sc.nextInt();
     int count=0,r;
     if(n>0)
     {

         while(n>0)
         {
           r = n%10;
           n = n/10;
           count++;
           System.out.print(count+" ");
         }
         System.out.println("total digits are : "+count);
     }
     else
     {
         System.out.println("total digits are : "+(count+1));
     }
   }
}
