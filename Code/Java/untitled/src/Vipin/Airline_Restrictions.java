package Vipin;

import java.util.Scanner;

public class Airline_Restrictions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int p= sc.nextInt();
            int q= sc.nextInt();
            int r= sc.nextInt();
            int s= sc.nextInt();
            int t= sc.nextInt();
            if((p+r)<=s  && q<=t)
            {
                System.out.println("YES");
            }
            else if((p+q)<=s && r<=t)
            {
                System.out.println("YES");
            }
            else if((q+r)<=s &&p<=t)
            {
                System.out.println("YES");
            }

            else {
                System.out.println("NO");
            }
        }
    }
}
