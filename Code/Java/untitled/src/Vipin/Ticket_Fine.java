package Vipin;

import java.util.Scanner;
public class Ticket_Fine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
            int z= sc.nextInt();

            System.out.println((y-z)*x);
        }

    }
}
