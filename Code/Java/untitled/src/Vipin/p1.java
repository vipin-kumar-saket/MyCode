package Vipin;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        String temp="";
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='v'&& input.charAt(i+1)=='i' && input.charAt(i+2)=='p'){
                temp=temp+"saurabh";
                i=i+2;
            }
            else temp=temp+input.charAt(i);
        }
        System.out.println(temp);
    }
}
