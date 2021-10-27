import java.util.Scanner;

/*
Program 4 :  check the number palindrome or not ;

--> concept is A palindrome number is a number that remains the same when its digits are reversed

---> input           input 
          16461           34567
     output          output
          Yes             No

Explained : 
            16461  ---> reversed ---> 16461  both are same so it is palindrome number
            34567  ---> reversed ---> 76543  not same so it is not palindrome number 
*/
public class Program4 {

    public static void checkIntegerPalindrome(int n)
    {
       int temp = n;
       int r,rev=0;
       // logic of reverse the number
       while(n>0)
       {
         r = n%10;
         rev = rev*10+r;
         n = n/10;
       }
       
       // now check originalNumber == reverseNumber
       if(temp == rev)
       System.out.println("Yes : "+" "+temp+" = "+" "+rev);
       
       else
       System.out.println("No");
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int n = sc.nextInt();
        // System.out.println("enter the String");
        // String str = sc.nextLine();
     
        checkIntegerPalindrome(n);
        // checkStringPalindrome(str);

    }
}
