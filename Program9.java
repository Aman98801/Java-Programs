/*
Program 8 :
        Print Fabonacci Series :  0 1 1 2 3 5 8 13 . . . . . . . .

        definition / concept : A series of number in which  each number is the sum of the two preceding numbers.

        1+1 = 2  , 1+2 = 3 , 2+3 = 5 , 3+5 = 8 , 5+8 = 13  .....
*/
import java.util.Scanner;
public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int f=0 , f1=1 , f2=-1;
        System.out.print("enter the range between 0 to ");
        int n = sc.nextInt();
        System.out.println();
        System.out.println("Fabonacci Series is : ");
        // logic for fabonacci series
            
            // f1 = 1 , f2 = -1  so first f = 0
        while(f<n)
        {
          f = f1+f2;  // 0  1  1  2  3  5  8  13 . . . . .
          System.out.print(f+" , "); 
          f2 = f1;   //  1  0  1  1  2  3  5  8  . . . . .
          f1 = f;   //   0  1  1  2  3  5  8  13 . . . . . 
        }


        
    }
}
