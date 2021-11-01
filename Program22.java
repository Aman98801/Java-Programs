/*
  Program 22 : Remove Junk or Special characters in string .
*/
public class Program22 {
    public static void main(String[] args) {
        String s = "@# Aman Kumar #Software Engineer #$";
        
       s = s.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(s);
    }
}
