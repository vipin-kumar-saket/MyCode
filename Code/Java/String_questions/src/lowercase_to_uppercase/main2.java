package lowercase_to_uppercase;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
        char ch= ' ';
        String result="";
        for (int i=0;i<input.length();i++)
        {

            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                ch=(char)(input.charAt(i) - 32);

            }
            else {
                ch=(char) (input.charAt(i));
            }

            result= result + ch;
        }
        System.out.println(result);
    }

}
