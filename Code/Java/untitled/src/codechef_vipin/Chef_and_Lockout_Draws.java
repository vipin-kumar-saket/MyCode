package codechef_vipin;

import java.util.Scanner;

public class Chef_and_Lockout_Draws {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
             int a =sc.nextInt();
             int b = sc.nextInt();
             int c = sc.nextInt();
             if( a==b+c){
                 System.out.println("YES");
             } else if (b==a+c) {
                 System.out.println("YES");
             }else if (c==a+b) {
                 System.out.println("YES");
             }
             else{
                 System.out.println("NO");
             }
         }
    }
}
