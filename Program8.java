/*
  Program 8 : Largest of 3 number 

  input 
        a = 10 , b = 20 , c = 40

  output 
         largest number is : 40
*/
import java.util.Scanner;;
public class Program8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         
         // Logic of largest among 3 numbers

         if(a>b)
         {
             if(a>c)
             System.out.println("largest no is a = "+a);

             else
             {
                 System.out.println("largest no is c = "+c);
                }
            }
            else
            {
                if(b>c)
                System.out.println("largest no is b = "+b);
                else
                System.out.println("largest no is c = "+c);
            }
    }
}
