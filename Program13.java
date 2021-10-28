/*
   Program 13 : Print Even and Odd element in Array

   input : [ 1 , 2 , 3 , 4 , 5]
   output :
           Even Elements : 2 , 4
           Odd Element : 1 , 3 , 5 
*/

import java.util.Scanner;
public class Program13 {
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
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 == 0)
            System.out.println(" Even Elements is : "+a[i]);
            else
            System.out.println(" Odd Element is : "+a[i]);

        }
    }
}
