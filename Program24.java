import java.util.Scanner;

/*
  Program 24 : count the occurance of a character in String

  input : Aman Prajapat    // if we want to count the occurance of 'a' character
  output : 4

*/
public class Program24
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // String str = "I am Aman Prajapat";
        String str = "java is a plateform independent language";
        
        int str1 = str.length();
        System.out.println("Which character's occurrence do you want to count?");

        // logic 
        System.out.println("original string length : "+str1);

         int str3 = str.replace("l", "").length();
        
        System.out.println("after find character's occurance length : "+str3);

        // count the occurance of a character in String
        System.out.println((str1-str3));
        
    }
}