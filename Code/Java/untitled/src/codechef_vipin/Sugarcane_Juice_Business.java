package codechef_vipin;

import java.util.Scanner;

public class Sugarcane_Juice_Business {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=0;i<x;i++)
        {
            int a= sc.nextInt();
            System.out.println((50*a)-((a*10)+(a*10)+(a*15) ) );
        }
    }
}
