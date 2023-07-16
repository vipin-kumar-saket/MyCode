package codechef_vipin;

import java.util.Scanner;

public class Miami_GP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while (a>0)
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
             int z= x * (int)1.07f;
             if(z==y)
             {
                 System.out.println("YES");
             }
             else {
                 System.out.println("No");
             }

        }
    }
}
