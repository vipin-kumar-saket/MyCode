package codechef_vipin;

import java.util.Scanner;

public class The_Mango_Truck {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t=sc.nextShort();
        for(int i=0;i<t;i++)
        {

            int x=sc.nextByte();
            int y=sc.nextByte();
            int z=sc.nextByte();
            System.out.println((z-y)/x);
        }
    }
}
