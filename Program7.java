import java.util.Scanner;

/*
  Program 7 : Count number of EVEN and ODD digits in  a number

  input : 346578

  output :
           Even Digits : 3  (4,6,8)
           Odd Digits : 3   (3,5,7)
*/

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //user input
        System.out.println("enter the number");
        int n = sc.nextInt();

        int r,even=0,odd=0;
        // build logic
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

        
    }
}
