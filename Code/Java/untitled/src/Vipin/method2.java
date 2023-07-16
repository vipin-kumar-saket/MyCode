package Vipin;

import java.util.Scanner;

public class method2 {

     int logic(int x, int y)   // IN there are the use without using static method in the function.
    {
        int z;
        if(x>y)
        {
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        return  z;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a first number :");
        int a= sc.nextInt();
        System.out.print("Enter a second number :");
        int b= sc.nextInt();
        int c;
        method2 obj= new method2();
        c= obj.logic(a,b);
        System.out.println(c);

    }
}
