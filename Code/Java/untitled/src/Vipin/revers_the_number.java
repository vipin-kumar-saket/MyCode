package Vipin;

import java.util.Scanner;

public class revers_the_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int r ,sum=0;
        for(int i=0;i<a;i++)
        {
            r=a%10;
            sum=(sum*10)+r;
            a=a/10;
        }
        System.out.println(sum);
    }
}
