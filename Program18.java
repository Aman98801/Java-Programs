import java.util.Scanner;

/*
  Program 18 : Linear Search
*/
import java.util.Scanner;
public class Program18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = {12,45,78,56,34};
        // search element is
        System.out.println("Enter the Search Element");
        int searchElement =sc.nextInt();
        boolean b = false;
        // logic for binary Search
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == searchElement)
            {
                b = true;
            }
        }
        if(b==true)
        System.out.println("Element found");
        else
        System.out.println("Element not Found");

    }
}
