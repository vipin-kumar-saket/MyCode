package palindrome_String;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
        String op="";

        for(int i=0;i<input.length();i++)
        {
            op=input.charAt(i)+op;
        }
        int pal=1;
        if(input.length()==op.length())
        {
            for(int i=0;i<input.length();i++)
            {
                if(input.charAt(i)!=op.charAt(i))
                {
                    pal--;
                    break;

                }
            }

        }
        else {
            pal--;
        }
        if(pal==1){
            System.out.println("The String is palindrome .");
        }
        else {
            System.out.println("The String is not palindrome .");
        }
    }
}
