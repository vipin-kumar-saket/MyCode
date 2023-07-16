package alphabets_digits_special_character;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a any thing :");
        String input=sc.nextLine();
        int alphabet=0,digit=0,spacialChar=0,space=0;
        for(int i=0;i<input.length();i++)

        {
            char ch=input.charAt(i);
            if(ch>='a'&& ch<='z' ||ch>='A'&& ch<='z')
            {
                alphabet++;
            }
            else if(ch>='0'&&ch<='9'){
                digit++;
            } else if (ch==32) {
                space++;

            } else {
                spacialChar++;
            }
        }
        System.out.println("Total alphabet are :" + alphabet);
        System.out.println("Total digit are :" + digit);
        System.out.println("Total space are :" + space);
        System.out.println("Total spacial charter  are :" + spacialChar);
    }
}
