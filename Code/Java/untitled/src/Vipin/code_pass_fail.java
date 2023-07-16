package Vipin;

import java.util.Scanner;
public class code_pass_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
            int z= sc.nextInt();

            if(x>10 && y>10  && z>10 &&  (x+y+z)>100)
            {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }

    }
}
