package Ex_01;

import java.util.Scanner;

public class EX_02 {
    public static void main(String[] args) {
        Scanner sc=  new Scanner( System.in);
        System.out.println("Enter a string :");
        String input=sc.nextLine();

        int count=1;
        for(int i=0;i<input.length();i++){
            char ch= input.charAt(i);
            for(int j=0;j<i;j++)
            {
                char ch_j=input.charAt(j);
                if(ch==32 && ch_j==32)
                {
                    i=i+1;
                    j=j+1;
                }

             }



        }
        System.out.println(count);
    }
}
