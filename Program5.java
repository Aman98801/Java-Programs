import java.util.Scanner;

/*
Program 5 :  check the String is  palindrome or not ;

--> concept is A palindrome String is a STring that remains the same when its character are  reversed

---> input           input 
          madam          joker
     output          output
          Yes             No

Explained : 
            madam  ---> reversed ---> madam  both are same so it is palindrome String
            joker  ---> reversed ---> rekoj  not same so it is not palindrome String 
*/

public class Program5 {

    public static void main(String[] args) {
    
         // for user input
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the string");
         String str = sc.nextLine();

         String temp = str;
         
         StringBuilder sb = new StringBuilder();
         sb.append(str);
         StringBuilder rev = sb.reverse();

         System.out.println(" reverse string is : "+rev);

         String temp1 = rev.toString(); 

        //  System.out.println(temp);
        //  System.out.println(temp1);

        // check the condition for palindrome or not .

        // if(temp.compareTo(temp1) == 0)

         if(temp.equals(temp1))
         System.out.println("Yes : "+" "+temp+" = "+" "+temp1);
         
         else
         System.out.println("No");
         
    }
}
