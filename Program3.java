/*
Program 2 :  Reveres the given String ;
--> we are simply reverse the given String
---> input
Aman
output
namA
*/
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the String");
        String s = sc.nextLine();
        
        // logic 3 : swapping the character
        char a[] = s.toCharArray();      // convert string into Array
    
        int len = a.length;
        int first = 0;
        int last = len-1;

        while (first<last) {
            char temp = a[first];
            a[first] = a[last];
            a[last] = temp;
            first++;
            last--;
        }
        System.out.println(a);
        /*
         important,  // logic 2: using StringBuilder class 
        
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        StringBuilder rev = sb.reverse();
        System.out.println("Reverse string : "+rev);
        
        */

        /* 
         important,  Logic 3 : using StringBuffer class

        StringBuffer s1 = new StringBuffer(s);
        StringBuffer s2 = s1.reverse();
        System.out.println(s2);

        */
        
    }
}
