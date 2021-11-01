/*
   Program 23 : Remove all white Spaces in a String
*/
public class Program23 {
    public static void main(String[] args)
    {
        String str = "Aman Kumar Prajapat";
        str = str.replaceAll("\\s", "");
        System.out.println(str);

    }
}
