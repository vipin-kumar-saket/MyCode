package DSA;


import java.util.Scanner;

class vip {


    public static int fun(int a) {
        int p=a;
        return p*(p+1)/2;

    }

}

public class some_netural {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number :");
        int x=sc.nextInt();

        vip v=new vip();

        System.out.println("The sum of natural number is : " + v.fun(x));

    }

}
