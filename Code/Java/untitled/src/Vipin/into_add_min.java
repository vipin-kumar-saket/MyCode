package Vipin;

import java.util.Scanner;

public class into_add_min {
    public static void main(String[] args) {
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        int sum=0,mul=1;
        while(a!=0)
        {
            int rem=a%10;
            sum=rem+sum;
            mul=rem*mul;
            a=a/10;
        }
        System.out.println(mul-sum);
    }
}
