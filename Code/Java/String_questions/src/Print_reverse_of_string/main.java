package Print_reverse_of_string;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String input=sc.nextLine();
    /*    StringBuilder sb=new StringBuilder(input);

        System.out.println(sb.reverse());

     */

        // and the second way to code the question


        String rev="";
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);


    }
}
