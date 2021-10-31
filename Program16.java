/*
   Program 16 : Find the Maximum and Minimum number in Array

   input : a[] = {23,45,78,67,99}
   output : max = 99 and min = 23 
*/
public class Program16 {

   public static int Find_Min(int arr[])
   {
      int min=0;  // first we declare min = 23 (arr[0]);
      
      for (int i = 0; i < arr.length; i++) {
         if(arr[min]>arr[i])
         {
             min = i;
         }
      }
      return arr[min];
   }

   public static int Find_Max(int arr[])
   {
      int max = 0;
      for (int i = 0; i < arr.length; i++) 
      {
         if(arr[i]>arr[max])
         {
           max=i;
         }
      }
      return arr[max];
   }
    public static void main(String[] args) {

      //  int arr[] = {23,56,78,89,24};
       int arr[] = {233,546,787,189,324};

       int x = Find_Min(arr);
       System.out.println("Min Value in Array is : "+x);
       int y = Find_Max(arr);
       System.out.println("Max Value in Array is : "+y);
      }
}
