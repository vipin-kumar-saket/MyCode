 package Vipin;

import java.util.Scanner;

public class how_much_Scholarship {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=1&& a<=50)
        {
            System.out.println("100");
        }
        else if(a>50 && a<=100)
        {
            System.out.println( "50");
        }
        else
        {
            System.out.println( "0");
        }
    }
}
