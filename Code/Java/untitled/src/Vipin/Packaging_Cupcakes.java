package Vipin;

import java.util.Scanner;

public class Packaging_Cupcakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        for(int i=0;i<a;i++)
        {
            int b= sc.nextInt();
            System.out.println((b/2)+1);
        }
    }
}
