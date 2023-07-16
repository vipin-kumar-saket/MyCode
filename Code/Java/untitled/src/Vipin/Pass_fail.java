package Vipin;

import java.util.Scanner;
public class Pass_fail {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your physics number:");
        int p= sc.nextInt();
        System.out.println("Enter your math number :");
        int m= sc.nextInt();
        System.out.println("Enter your Chemistry number :");
        int c= sc.nextInt();
        if(p>=33 && m>=33 && c>=33 && ((p+m+c)/3.0)>=40)
        {
            System.out.println("You are Pass.");
        }
        else
        {
            System.out.println("You are Fail.");
        }

    }
}
