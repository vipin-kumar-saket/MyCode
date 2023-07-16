package codechef_vipin;

import java.util.Scanner;

public class Building_Race {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();

        for(int i=0;i<t;i++)
        {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();


            if(a==x&&b==y)
            {
                System.out.println("BOTH");
            } else if ((a / x) < (b / y)) {
                System.out.println("Chef");
            }
            else
            {
                System.out.println("Chefina");
            }
        }
    }
}
