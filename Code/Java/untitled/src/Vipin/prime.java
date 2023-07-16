package Vipin;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        int p=0;
        for(int i=2;i<a;i++)
        {
            if(a%i==0)
            {
                p++;
            }

        }
        if(p==0) System.out.println("The number is prime:");
        else System.out.println("The number is not prime:");
    }
}
