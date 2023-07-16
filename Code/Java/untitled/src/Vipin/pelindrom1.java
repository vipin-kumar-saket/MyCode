package Vipin;

import java.util.Scanner;

public class pelindrom1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem=0,x=a;
        while (a>0)
        {
           rem=(rem*10)+a%10;
            a=a/10;

        }

              if(x==rem)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }

    }
}
