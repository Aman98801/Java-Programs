import java.util.Arrays;
import java.util.Scanner;

/*
  Program 14 : Check the Equality of two Array

    input :  arr1[] = [ 1 , 2 , 3 , 4 , 5]  arr2[] = [ 1 , 2 , 3 , 4 , 5]
    output : arr1 and arr2 are Equal.

    input :  arr1[] = [ 1 , 2 , 3 , 4 , 5]  arr2[] = [ 1 , 5 , 3 , 7, 2]
    output : arr1 and arr2 are not Equal.
*/

public class Program14 {
    public static void main(String[] args) {
    
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,5};
      /*  
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,4,6};
      */
        // we have inbuild method in java 
        boolean isEqual = Arrays.equals(arr1,arr2);
        
        if(isEqual==true){
            System.out.println("Both Array are Same");
        }
        else{
            System.out.println("Both Array are not Equal");
        }
    }

}
