import java.util.Scanner;

/*
  Program 7 :
             part 1 :   Count number of EVEN and ODD digits in  a number

  input : 346578

  output :
           Even Digits : 3  (4,6,8)
           Odd Digits : 3   (3,5,7)

            Part 2 : Sum of digits

             input : 234

  output :
           sum of digits : 9

*/

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user input
        System.out.println("enter the number");
        int n = sc.nextInt();

        int r,even=0,odd=0;

        int x = n;     // we are storing value of n in variable x for '"sum of digits " program also 

        // build logic to count even and odd digits 
        while(n>0)
        {
          r = n%10;
          if(r%2==0)
          {
              even++;
          }
          else{
              odd++;
          }
          n = n/10;
        }

        System.out.println("Even digits are : "+even);
        System.out.println("Odd digits are : "+odd);

        //  logic for sum of digits 

        int sum = 0,r1;
        // System.out.println(x);
        while(x>0)
        {
          r1 = x%10;
          sum = sum+r1;
          x = x/10;
        }
        System.out.println("Sum of Digits : "+sum);
  
    }
}
