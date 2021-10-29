/*
  Program 15 : Find the missing Number in Sorted Array
    
  --> Values should be in range and sequence. ( like 101,102,103,105,106 ---> 104 missing number)
       
  input : arr[] = {1,2,3,5,6}
  output : missing number : 4 

  logic : 
         sum1 (sum of Array element) = 1+2+3+5+6 = 17
         sum2 (sum of range of array) = 1+2+3+4+5+6 = 21

         sum2-sum1 = 4 (missing number);
*/
import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // size of Array 
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        // declare array
        int a[] = new int[n];

        // insert values in Array
        System.out.println("Enter the values in Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // logic 
        // 1. sum of Array element
        int sum1 =0;
        for (int j = 0; j < a.length; j++) {
            sum1 = sum1+a[j];
        }
        // sum of Array range
        int sum2 =0;
        for (int k = a[0]; k <= a[a.length-1]; k++) {
            sum2 = sum2+k;
        }

        System.out.println("sum1 is : "+sum1+"  ,  value of sum2 is : "+sum2);

        // missing number find
        int missingNumber = sum2-sum1;
        System.out.println("missing number is : "+missingNumber);
    
    }
}
