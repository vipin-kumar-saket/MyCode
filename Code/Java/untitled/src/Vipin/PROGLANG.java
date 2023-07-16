package Vipin;

import java.util.Scanner;

public class PROGLANG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int p = sc.nextInt();
            int q = sc.nextInt();
            int m = sc.nextInt();
            int n= sc.nextInt();
            if((a==p && b==q) || (a==q && b==p)){
                System.out.println("1");
            }
            else if((a==m || b==n) || (a==n || b==m))
            {
                System.out.println("2");
            }
            else {
                System.out.println("0");
            }
    }
}
    }
