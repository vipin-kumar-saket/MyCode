package codechef_vipin;

//  package vipin;

import java.util.*;
import java.lang.*;
import java.io.*;


class Chef_Diet
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextShort();
        for(int s=0;s<t;s++){
            int n=sc.nextByte();
            int k=sc.nextInt();
            int a[]=new int[n];
            int f=1;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int tp=0;
            for(int i=0;i<n;i++)
            {
                a[i]=a[i]+tp;
                tp = a[i]-k;
                if(tp<0)
                {
                    System.out.println("NO "+(i+1));
                    f=0;
                    break;
                }
            }

            if(f==1)
            {
                System.out.println("YES");
            }



        }
    }
}
