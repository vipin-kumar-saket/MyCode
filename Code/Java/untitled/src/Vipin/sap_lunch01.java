package Vipin;

import java.util.Scanner;

public class sap_lunch01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextByte();
        for(int i=0;i<a;i++)
        {
            int x=sc.nextByte();
           if(x<7)
           {
               System.out.println("YES");
           } else if (x>=7) {
               System.out.println("NO");
           }

        }
    }
}
