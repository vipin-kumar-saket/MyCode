package Leed_Code;

import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();


        int count=1;

        for(int i=0;i<input.length();i++)
        {


            for(int j=i+1;i<input.length();i++){

                if(input.charAt(i)!=input.charAt(j)&& input.charAt(i)!=input.charAt(j-1))
                {
                    count++;
                    i++;
                }
            }
        }
        System.out.println(count);



    }
}
