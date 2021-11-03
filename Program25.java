import java.util.Scanner;
/*
 Program 25 : Reverse each word of given String

 input  : Welcome in India
 output : emocleW ni aidnI
*/

public class Program25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();

        // Approach 1 : first we will convert string in Array String
        String[] str2 = str.split(" ");
        String reveString = "";
        for(String i : str2)
        {
            String s = " ";
            for (int j = (i.length()-1); j>=0; j--) {
                s = s+i.charAt(j);
            }
            reveString = reveString+s;
        }
        System.out.println(reveString);


    }
}
