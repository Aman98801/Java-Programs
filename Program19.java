import java.util.Scanner;

/*
   Program 18 : Binary Search first array should be in sorted format.
*/
public class Program19 {
    public static void main(String[] args) {
       int arr[] = {23,34,45,56,67,78,89,90,100};  // should in sorted form

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Search Element : ");
       int searchElement = sc.nextInt();

       // logic for Binary Search 
       int left = 0;
       int right = arr.length-1;
       boolean b = false;
       
      while (left <= right) {
         
         int mid = (left+right)/2;
         if(arr[mid] == searchElement)
         {
            b = true;
            break;
         }
          if(arr[mid] > searchElement)
         {
            right = mid-1;
         }
         if(arr[mid]< searchElement)
         {
            left = mid+1;
         }
      }
      if(b == true)
      System.out.println("Element Found");
      else
      System.out.println("Element not Found");
    }
}
