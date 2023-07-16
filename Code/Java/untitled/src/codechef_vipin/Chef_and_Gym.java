package codechef_vipin;

import java.util.Scanner;

public class Chef_and_Gym {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if ((x + y) <= z)
            {
                System.out.println("2");

            } else if (x<=z||y<=z) {
                System.out.println("1");

            }
            else
            {
                System.out.println("0");
            }
        }
    }
}
