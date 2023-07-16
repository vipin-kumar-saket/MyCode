package Pattern;

import java.util.Scanner;

public class p07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");

        for(int i=1;i<=5;i++){
            char ch=65;
            for(int j=1;j<=i;j++)
            {

                System.out.print(ch+" ");

                ch++;

        }
            if(i==1 )
                System.out.print(".0");

            System.out.println(" ");
    }
    }
}
