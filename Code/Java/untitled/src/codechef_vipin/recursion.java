package codechef_vipin;

import java.util.Scanner;

public class recursion {
    static int factorial(int a)
    {
        if(a==0||a==1)
        {
            return 1;
        }
        else {
            return a*factorial(a-1);
        }



        //    That code is denoted to tha without using recursion.


//    int     result =1;
//        for(int i=1;i<=a;i++)
//        {
//            result =i*result;
//        }
//        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number you want to factorial no.:");
        int p= sc.nextInt();
        System.out.println("the factorial is:"+factorial(p));

    }
}
