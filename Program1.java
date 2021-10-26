/*
Program 1 :  Swap 2 Numbers ;
--> Swaping is Inter Changing the values into variable 
---> a = 10 & b = 20  
after swap 
---> a = 20 & b = 10 
*/

// 1st method 
import java.util.Scanner;
public class Program1{
    public static void main(String a[])
    {
        // take 2 variables 
        int x,y;
        
        // for user input 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        x = sc.nextInt();
        System.out.println("enter the value of y");
        y = sc.nextInt();
        
        // logic 1 to swap 2 numbers using third variable
        int temp = x;
               x = y;
               y = temp;

    /*
        logic 2  without using third variable

        x = x+y;    //  x = 10+20 = 30
        y = x-y;    //  y = 30-20 = 10
        x = x-y;    //  x = 30-10 = 20

    */

        System.out.println("after swapping values of both variables");
        System.out.println("value of x : "+x+" values of y : "+y);
    }
}
