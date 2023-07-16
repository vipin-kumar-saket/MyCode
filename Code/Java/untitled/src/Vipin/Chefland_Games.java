package Vipin;

import java.util.Scanner;

public class Chefland_Games {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       for(int i=0;i<a;i++)
        {
            int p= sc.nextInt();
            int q= sc.nextInt();
            int r= sc.nextInt();
            int s= sc.nextInt();
            if(p==0 && q==0 && r==0 && s==0 )
            {
                System.out.println("IN");
            }
            else
            {
                System.out.println("OUT");
            }
        }
    }
}
