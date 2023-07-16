package Vipin;

import java.util.Scanner;

public class BROKENPHONE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextByte();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextInt();
            int y=sc.nextInt();
            if(x<y)
            {
                System.out.println("REPAIR");
            }
            else if(x==y)
            {
                System.out.println("ANY");
            }
            else
            {
                System.out.println("NEW PHONE");
            }
        }
    }
}
