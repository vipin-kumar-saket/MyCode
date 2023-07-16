package codechef_vipin;

import java.util.Scanner;

public class The_Two_Dishes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int n=sc.nextInt();
            int s=sc.nextInt();
            int d;
            if(s<=n)
            {
                d=s;
                System.out.println(d);
            }
            else
            {
                d=(n-s)+n;
                System.out.println(d);
            }
        }
    }
}
