package replace_words;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();
        String temp="";
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(input.charAt(i)=='v' && input.charAt(i+1)=='i'&& input.charAt(i+2)=='p'){
                temp=temp+"saurabh";

                i=i+2;
            }
            else temp=temp+ch;
        }
        System.out.println(temp);
    }
}
