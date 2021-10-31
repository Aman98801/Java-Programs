import java.util.Arrays;
import java.util.Collections;

/*
  Program 21 : Sorting in Array with the help of inbuild functions 
      
         1. parallelSort()
         2. sort()
         3. sort(arr,Collections.reverseOrder())   // it will sort in decending order and we must use wrapper classes
*/
public class Program21 {
    public static void main(String[] args) {
        int arr[] = {213,234,145,356,267,578,489,790,100};
        
        // Approach 1 using parallelSort() inbuild method
        Arrays.parallelSort(arr);
        System.out.println("Sorted Array is : "+Arrays.toString(arr));
        
        /*
          Approach 2 using sort() inbuild method

         Arrays.sort(arr);
         System.out.println("Sorted Array is : "+Arrays.toString(arr));

         */
        
        /*
          Approach 3 using sort()+Decending Order

        Integer arr1[] = {213,234,145,356,267,578,489,790,100};
        Arrays.sort(arr1,Collections.reverseOrder());
        System.out.println("sorted Array in decending order : "+Arrays.toString(arr1));

        */
    }
}
