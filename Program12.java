/*
   Program 12 : Find Sum of element in Array
    
   input :  [ 1 , 2 , 3 , 4 , 5]
   output : 15 (1+2+3+4+5)

*/
import java.util.Scanner;
public class Program12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        //  int a[] = {11,2,3,4,51}; 
     
        int a[] = new int[n];
        
        System.out.println("Enter the Array Element");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // logic for sum of element of Array
        int sum=0;
        for (int i = 0; i < a.length; i++) {
                sum = sum+a[i];
        }
        System.out.println("Sum of Array Element is : "+ sum);
    }
}
