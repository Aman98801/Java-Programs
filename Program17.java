/*
   Program 17 : Find the Dublicate element in Array

   input : arr[] = {"java","C","C++","Python","java"};
   output : java

   input : arr1[] = {1,2,3,4,3,5};
   output : 3
*/

public class Program17 {
    public static void main(String[] args) {
        int arr[] = {2,3,2,4,4,6,7,9,7};

        // logic 
        for (int i = 0; i < arr.length; i++) {
            for (int j =i+1; j < arr.length; j++) {
            if(arr[i] == arr[j])
            {
              System.out.println("dublicate Value is : "+arr[i]);
            }

        }
    }
  }
}
