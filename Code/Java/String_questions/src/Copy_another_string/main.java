package Copy_another_string;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String input=sc.nextLine();
        String copy="";

        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            copy= copy+ch;
        }
        System.out.println(copy);
    }
}
