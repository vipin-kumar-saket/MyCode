package Vipin;

import java.util.Scanner;

public class factorial {
    static  int fib(int x)
    {
       if(x==0||x==1)
       {
           return 1;
       }
       else {
           return x*fib(x-1);
       }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= sc.nextInt();
        System.out.println("The factriol number is :" +fib(a));
    }
}
