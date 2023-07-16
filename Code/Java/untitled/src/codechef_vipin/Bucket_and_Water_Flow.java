package codechef_vipin;

import java.util.Scanner;

public class Bucket_and_Water_Flow {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int t=sc.nextShort();
        for(int i=0;i<t;i++)
        {

            int w=sc.nextByte();
            int x=sc.nextByte();
            int y=sc.nextByte();
            int z=sc.nextByte();
            if(((y*z)+w)==x)
            {
                System.out.println("filled");
            }
            else if(((y*z)+w)>=x)
            {
                System.out.println("overflow");
            }
            else
            {
                System.out.println("Unfilled");
            }

        }
    }
}
