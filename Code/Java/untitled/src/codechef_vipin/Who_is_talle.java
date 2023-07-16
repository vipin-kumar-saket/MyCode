package codechef_vipin;

import java.util.Scanner;

public class Who_is_talle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a!=0)
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
            if(x>y)
            {
                System.out.println("A");
            }
            else
            {
                System.out.println("B");
            }



           a--;
        }

    }
}
