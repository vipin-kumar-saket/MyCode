package Vipin;

import java.util.Scanner;

public class fibonicee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Enter a number:");
        int a= sc.nextInt();
        int sum=0,b=0,c=1;
        System.out.print(b+" ");
        System.out.print(c+" ");
        for (int i=1;i<=a;i++)
        {
            sum= b+c;
            System.out.print(sum+" ");
            b=c;
            c=sum;

        }

    }
}
