import java.util.Scanner;

/*
   Program 10 : Check given number is prime or not

   concept : 1) Natural Number > 1
             2) which has only 2 factors 1 and itself.

    for example  :   11 --> 1,11     ---> Prime number
                     16 --> 2,4,8,16 ---> not prime number

    input : 2 or 3 or 7           input : 10
 
     output : Yes Prime number    outout : No
*/
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the number");
        int n = sc.nextInt();
         
        int count = 0;   
    /* 
          we are taking count variable bcoz prime means divisible by 1 and itself so if count varible 
          will be greater than 2 that means that number will not be prime number
     */

        // logic to check prime number or not
        if(n>1)
        {
            for(int i=1;i<=n;i++)
            {
              if(n%i==0)
              count++;
            //   System.out.println(count);
            }
            if(count == 2)
            System.out.println(n + " is prime number");
            else
            System.out.println(n+ " is not prime number");
        }
        else{
            System.out.println(n +" is not prime number");
        }
    }
}