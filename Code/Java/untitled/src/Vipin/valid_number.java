package Vipin;
import java.util.regex.*;
import java.util.Scanner;

class GFG{

    public static boolean isValid(String s)
    {

        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();

        if (isValid(s))
            System.out.println("Valid Number");
        else
            System.out.println("Invalid Number");
    }
}

