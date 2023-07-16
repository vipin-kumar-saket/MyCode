package codechef_vipin;

import java.util.Scanner;

public class Best_Coupon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++) {
            int x = sc.nextInt();
            if(x>1000)
            {
                System.out.println(x/10);
            }
            else
            {
                System.out.println(100);
            }
        }
    }
}
