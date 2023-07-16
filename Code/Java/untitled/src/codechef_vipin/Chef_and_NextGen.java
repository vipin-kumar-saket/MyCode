package codechef_vipin;

import java.util.Scanner;

public class Chef_and_NextGen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int p=sc.nextInt();
            int q=sc.nextInt();
            int r=sc.nextInt();
            int t=sc.nextInt();
            if((p*q)>=(r*t))
            {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
