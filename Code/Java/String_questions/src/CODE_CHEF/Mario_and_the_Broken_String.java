package CODE_CHEF;

import java.util.Scanner;

public class Mario_and_the_Broken_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        String save1="";
        String save2="";



        for(int i=0;i<input.length()/2;i++)
        {
            char ch1=input.charAt(i);
            save1=save1+ch1;
        }
//        System.out.println(save1);
        for(int i=(input.length()/2);i<input.length();i++)
        {
            char ch2=input.charAt(i);
            save2=save2+ch2;
        }


        if(save1.compareTo(save2) == 0){
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
