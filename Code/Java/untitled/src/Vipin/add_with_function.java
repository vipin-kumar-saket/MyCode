package Vipin;

import java.util.Scanner;

public class add_with_function {
    static int logic(int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else
        {
            z=(x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a 1st number:");
        int a= sc.nextInt();
        System.out.print("enter a 2nd number:");
        int b= sc.nextInt();
        int c=logic(a,b);
        System.out.println(c);
    }
}
