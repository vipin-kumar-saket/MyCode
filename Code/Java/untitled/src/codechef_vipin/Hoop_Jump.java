package codechef_vipin;

import java.util.Scanner;

public class Hoop_Jump {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextInt();
            if(x==1)
            {
                System.out.println(x);
            }
            else
            {
                System.out.println(x-1);
            }
        }
    }
}
