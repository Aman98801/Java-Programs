import java.util.Arrays;

/*
  Program 19 : Sorting using Bubble Sort

*/

public class Program20 {
    public static void main(String[] args) {
        int arr[] = {213,234,145,356,267,578,489,790,100};
        System.out.println("Unsorted Array is : "+Arrays.toString(arr));
        // Bubble sorting algorithm 
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("sorted Array is : "+Arrays.toString(arr));
    }
}
