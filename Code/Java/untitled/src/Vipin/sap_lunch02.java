package Vipin;

import java.util.Scanner;

public class sap_lunch02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextByte();
            int y= sc.nextByte();

            if(y==0 || y==x)
            {
                System.out.println("0");
            } else if (y<=(x/2)) {
                System.out.println(y);
            } else  {
                System.out.println(y-x);
            }
        }
    }
}
