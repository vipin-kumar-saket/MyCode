package Vipin;

import java.util.Scanner;

public class Monthly_Budget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0; i<a;i++)
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
//            int z= sc.nextInt();
            if((30*y)<x)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

    }
}
