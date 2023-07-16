package Vipin;

import java.util.Scanner;

public class method {
    static  int logic(int x,int y)
    {
        int z;
        if(x>y)
        {
            z=x*y;
        }
        else
        {
            z=(10+x)*(y*5);
        }
        return  z;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a first number :");
        int a= sc.nextByte();
        System.out.print("Enter a second number :");
        int b= sc.nextByte();
        int c;
        c= logic(a,b);
        System.out.println(c);
    }
}
