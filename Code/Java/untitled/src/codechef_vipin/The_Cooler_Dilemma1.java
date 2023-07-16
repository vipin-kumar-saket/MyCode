package codechef_vipin;

import java.util.Scanner;

public class The_Cooler_Dilemma1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if((x*z)>=y)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }

        }
    }
}
