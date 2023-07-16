package codechef_vipin;

import java.util.Scanner;

public class Minimum_Pizzas {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
            if((x*y)%4==0)
            {
                System.out.println((x*y)/4);
            }
            else {
                System.out.println(((x*y)/4)+1);
            }
        }
    }
}
