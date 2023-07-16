package codechef_vipin;

import java.util.Scanner;

public class Tax_in_Chefland {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x=sc.nextInt();
            if(x<100)
            {
                System.out.println(x-10);
            }
            else
            {
                System.out.println(x);
            }
        }
    }
}
